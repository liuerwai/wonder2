package com.liuxg.wonder.html;

import com.liuxg.wonder.po.Model;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

public class TalentreetDetailPage {

    public static final String no_album = "images/no_album.jpg";

    public static final String peopleInfoCn = "" +
            "<div class=\"bd\">\n" +
            "        <ul style=\"display: block;\">\n" +
            "            <li><i>Gender</i><b>$six</b></li>\n" +
            "            <li><i>身高</i><b>$height cm</b></li>\n" +
            "            <li><i>胸围</i><b>$chest cm</b></li>\n" +
            "            <li><i>腰围</i><b>$waist cm</b></li>\n" +
            "            <li><i>臀围</i><b>$hips cm</b></li>\n" +
            "            <li><i>鞋码</i><b>$shoesSize</b></li>\n" +
            "            <li><i>肤色</i><b>$waist</b></li>\n" +
            "            <li><i>眼睛眼色</i><b>$eyeColor</b></li>\n" +
            "            <li><i>发色</i><b>$hairColor</b></li>\n" +
            "            <li><i>纹身</i><b>无</b></li>\n" +
            "        </ul>\n" +
            "        <ul style=\"display: none;\">\n" +
            "            <li><i>Gender</i><b>$six</b></li>\n" +
            "            <li><i>身高</i><b>$height\"</b></li>\n" +
            "            <li><i>胸围</i><b>$chest\"</b></li>\n" +
            "            <li><i>腰围</i><b>$waist\"</b></li>\n" +
            "            <li><i>臀围</i><b>$hips\"</b></li>\n" +
            "            <li><i>鞋码</i><b>$shoesSize</b></li>\n" +
            "            <li><i>肤色</i><b>$skinColor</b></li>\n" +
            "            <li><i>眼睛眼色</i><b>$eyeColor</b></li>\n" +
            "            <li><i>发色</i><b>$hairColor</b></li>\n" +
            "            <li><i>纹身</i><b>无</b></li>\n" +
            "        </ul>\n" +
            "    </div>";


    public static final String peopleInfoEn = "" +
            "<div class=\"bd\">\n" +
            "        <ul style=\"display: block;\">\n" +
            "            <li><i>Gender</i><b>$six</b></li>\n" +
            "            <li><i>HEIGHT</i><b>$height cm</b></li>\n" +
            "            <li><i>CHEST</i><b>$chest cm</b></li>\n" +
            "            <li><i>WAIST</i><b>$waist cm</b></li>\n" +
            "            <li><i>HIPS</i><b>$hips cm</b></li>\n" +
            "            <li><i>SHOE SIZE</i><b>$shoesSize</b></li>\n" +
            "            <li><i>SKIN COLOR</i><b>$skinColor</b></li>\n" +
            "            <li><i>EYE COLOR</i><b>$eyeColor</b></li>\n" +
            "            <li><i>HAIR COLOR</i><b>$hairColor</b></li>\n" +
            "            <li><i>TATTOO</i><b>none</b></li>\n" +
            "        </ul>\n" +
            "        <ul style=\"display: none;\">\n" +
            "            <li><i>Gender</i><b>$six</b></li>\n" +
            "            <li><i>HEIGHT</i><b>$height\"</b></li>\n" +
            "            <li><i>CHEST</i><b>$chest\"</b></li>\n" +
            "            <li><i>WAIST</i><b>$waist\"</b></li>\n" +
            "            <li><i>HIPS</i><b>$hips\"</b></li>\n" +
            "            <li><i>SHOE SIZE</i><b>$shoesSize</b></li>\n" +
            "            <li><i>SKIN COLOR</i><b>$skinColor</b></li>\n" +
            "            <li><i>EYE COLOR</i><b>$eyeColor</b></li>\n" +
            "            <li><i>HAIR COLOR</i><b>$hairColor</b></li>\n" +
            "            <li><i>TATTOO</i><b>none</b></li>\n" +
            "        </ul>\n" +
            "    </div>";

    public static String getPeopleInfoHtml(Model model, String l) {
        String html = "cn".equals(l) ? peopleInfoCn : peopleInfoEn;
        return html.replace("$name", model.getName())
                .replace("$peoImg", model.getOpusTitle())
                .replace("$birth", model.getBirthday())
                .replace("$sex", getSex(l, model))
                .replace("$height", model.getHeight())
                .replace("$chest", model.getChest())
                .replace("$waist", model.getWaist())
                .replace("$hips", model.getHips())
                .replace("$shoesSize", model.getShoeSize())
                .replace("$eyeColor", model.getEyeColor())
                .replace("$hairColor", model.getHairColor())
                .replace("$skinColor", model.getSkinColor());
    }

    public static final String tabTitleCn = "" +
            "           <div class=\"tab-title-item\">\n" +
            "                <a href=\"#opus\" aria-controls=\"home\" role=\"tab\" data-toggle=\"tab\">\n" +
            "                    <span>作品照</span>\n" +
            "                </a>\n" +
            "            </div>\n" +
            "            <div class=\"tab-title-item\">\n" +
            "                <a href=\"#makeup\" aria-controls=\"profile\" role=\"tab\" data-toggle=\"tab\">\n" +
            "                    <span>素颜</span>\n" +
            "                </a>\n" +
            "            </div>\n" +
            "            <div class=\"tab-title-item\">\n" +
            "                <a href=\"#video\" aria-controls=\"settings\" role=\"tab\" data-toggle=\"tab\">\n" +
            "                    <span>视频</span>\n" +
            "                </a>\n" +
            "            </div>";


    public static final String tabTitleEn = "" +
            "           <div class=\"tab-title-item\">\n" +
            "                <a href=\"#opus\" aria-controls=\"home\" role=\"tab\" data-toggle=\"tab\">\n" +
            "                    <span>WORKS</span>\n" +
            "                </a>\n" +
            "            </div>\n" +
            "            <div class=\"tab-title-item\">\n" +
            "                <a href=\"#makeup\" aria-controls=\"profile\" role=\"tab\" data-toggle=\"tab\">\n" +
            "                    <span>NATURAL</span>\n" +
            "                </a>\n" +
            "            </div>\n" +
            "            <div class=\"tab-title-item\">\n" +
            "                <a href=\"#video\" aria-controls=\"settings\" role=\"tab\" data-toggle=\"tab\">\n" +
            "                    <span>VIDEO</span>\n" +
            "                </a>\n" +
            "            </div>";

    public static String getTabTitleHtml(Model model, String l) {

        String html = "cn".equals(l) ? tabTitleCn : tabTitleEn;
        return html.replace("$opusImg", StringUtils.isEmpty(model.getOpusTitle()) ? no_album : model.getOpusTitle())
                .replace("$makeupImg", StringUtils.isEmpty(model.getMakeupTitle()) ? no_album : model.getMakeupTitle())
                .replace("$videoImg", StringUtils.isEmpty(model.getVideioTite()) ? no_album : model.getVideioTite());
    }


    public static final String imageHtml = "" +
            "                    <a href=\"$image\" name=\"imgView\" class=\"tab-content-a\">\n" +
            "                        <img src=\"$image\" class=\"tab-content-img\">\n" +
            "                    </a>\n";

    public static String getOpusImagehtml(Model model) {

        StringBuffer stringBuffer = new StringBuffer("");
        if (model.getOpus() != null) {
            for (String image : model.getOpus().values()) {
                stringBuffer.append(imageHtml.replaceAll("\\$image", image));
            }
        }
        return stringBuffer.toString();
    }

    public static String getMakeUpImageHtml(Model model) {

        StringBuffer stringBuffer = new StringBuffer("");
        if (model.getMakeup() != null) {
            for (String image : model.getMakeup().values()) {
                stringBuffer.append(imageHtml.replaceAll("\\$image", image));
            }
        }
        return stringBuffer.toString();
    }

    public static final String videoHtml = "" +
            "                    <video muted=\"muted\" controls=\"controls\" isrotate=\"false\" autohide=\"true\" loop=\"loop\"\n" +
            "                           src=\"$video\">\n" +
            "                        <span data-i18n-text=\"video_bzc\">当前浏览器不支持video播放</span>\n" +
            "                    </video>";


    public static String getVideoHtml(Model model) {

        StringBuffer stringBuffer = new StringBuffer("");
        if (model.getVideo() != null) {
            for (String video : model.getVideo().values()) {
                stringBuffer.append(videoHtml.replaceAll("\\$video", video));
            }
        }
        return stringBuffer.toString();
    }

    public static String getSex(String l, Model model) {

        if ("女".equals(model.getSex())) {
            return "cn".equals(l) ? "女" : "WOMEN";
        }
        return "cn".equals(l) ? "男" : "MEN";
    }

    public static String getBumssHtmlCn(Model model) {

        String htmlStart = "" +
                "<div class=\"bd bumss\">\n" +
                "     <ul>\n";
        String htmlEnd =
                "     </ul>\n" +
                        " </div>";

        String itemHtml = "<li><a href=\"/Index/talent_album/id/5326/mid/2300.html\"><img id=\"btn1\" src=\"$title\" onerror=\"src='images/no_album.jpg'\" style=\"display: block; margin-top: -43px; width: 174px;\" height=\"260\"></a>\n" +
                "                                    <h2 style=\"font-weight: bold;\">作品照</h2></li>";

        String html = "" + htmlStart;

        if (model.getOpusTitle() != null && model.getOpusTitle() != no_album) {
            html += itemHtml.replace("$title", model.getOpusTitle())
                    .replace("$name", "工作照");
        }
        if (model.getMakeupTitle() != null && model.getMakeupTitle() != no_album) {
            html += itemHtml.replace("$title", model.getMakeupTitle())
                    .replace("$name", "素颜照");
        }
        if (model.getVideioTite() != null && model.getVideioTite() != no_album) {
            html += itemHtml.replace("$title", model.getVideioTite())
                    .replace("$name", "视频");
        }
        html += htmlEnd;

        return html;
    }

    public static String getImageBoxHtml(Model model, String type){

        String startHtml = "" +
                "          <ul>\n";

        String itemHtml =  "<li><a href=\"javascript:void(0);\"><img bigpic=\"$bigpic\" src=\"$smallPic\" height=\"308.447619047619\" style=\"margin-top: -37.7238px; width: 233px; display: block;\"></a></li>\n";


        String endHtml = " </ul>\n" +
                "          <div class=\"clear\"></div>\n" ;

        String html = "" + startHtml;

        if (!CollectionUtils.isEmpty(model.getOpus())) {
            for(String value : model.getOpus().values()){
                html += itemHtml.replace("$bigpic", value)
                        .replace("$smallPic", value);
            }

        }
        if (!CollectionUtils.isEmpty(model.getMakeup())) {
            for(String value : model.getMakeup().values()){
                html += itemHtml.replace("$bigpic", value)
                        .replace("$smallPic", value);
            }
        }
        html += endHtml;

        return html;

    }

}
