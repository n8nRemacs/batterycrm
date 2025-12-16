package com.google.android.exoplayer2.util;

import android.graphics.Color;
import android.text.TextUtils;
import com.avito.android.avito_map.AvitoMapMarkerKt;
import com.google.common.base.C37257c;
import j.InterfaceC42156l;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: ColorParser.java */
/* renamed from: com.google.android.exoplayer2.util.g, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36591g {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f348126a = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f348127b = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f348128c = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");

    /* renamed from: d, reason: collision with root package name */
    public static final HashMap f348129d;

    static {
        HashMap map = new HashMap();
        f348129d = map;
        androidx.media3.common.S.e(-984833, map, "aliceblue", -332841, "antiquewhite");
        androidx.media3.common.S.d(-8388652, -16711681, "aqua", "aquamarine", map);
        androidx.media3.common.S.e(-983041, map, "azure", -657956, "beige");
        androidx.media3.common.S.e(-6972, map, "bisque", -16777216, AvitoMapMarkerKt.AMENITY_TYPE_BLACK);
        androidx.media3.common.S.e(-5171, map, "blanchedalmond", -16776961, "blue");
        androidx.media3.common.S.e(-7722014, map, "blueviolet", -5952982, "brown");
        androidx.media3.common.S.e(-2180985, map, "burlywood", -10510688, "cadetblue");
        androidx.media3.common.S.e(-8388864, map, "chartreuse", -2987746, "chocolate");
        androidx.media3.common.S.e(-32944, map, "coral", -10185235, "cornflowerblue");
        androidx.media3.common.S.e(-1828, map, "cornsilk", -2354116, "crimson");
        androidx.media3.common.S.d(-16777077, -16711681, "cyan", "darkblue", map);
        androidx.media3.common.S.e(-16741493, map, "darkcyan", -4684277, "darkgoldenrod");
        androidx.media3.common.S.d(-16751616, -5658199, "darkgray", "darkgreen", map);
        androidx.media3.common.S.d(-4343957, -5658199, "darkgrey", "darkkhaki", map);
        androidx.media3.common.S.e(-7667573, map, "darkmagenta", -11179217, "darkolivegreen");
        androidx.media3.common.S.e(-29696, map, "darkorange", -6737204, "darkorchid");
        androidx.media3.common.S.e(-7667712, map, "darkred", -1468806, "darksalmon");
        androidx.media3.common.S.e(-7357297, map, "darkseagreen", -12042869, "darkslateblue");
        map.put("darkslategray", -13676721);
        map.put("darkslategrey", -13676721);
        androidx.media3.common.S.d(-7077677, -16724271, "darkturquoise", "darkviolet", map);
        androidx.media3.common.S.e(-60269, map, "deeppink", -16728065, "deepskyblue");
        map.put("dimgray", -9868951);
        map.put("dimgrey", -9868951);
        androidx.media3.common.S.d(-5103070, -14774017, "dodgerblue", "firebrick", map);
        androidx.media3.common.S.e(-1296, map, "floralwhite", -14513374, "forestgreen");
        androidx.media3.common.S.d(-2302756, -65281, "fuchsia", "gainsboro", map);
        androidx.media3.common.S.e(-460545, map, "ghostwhite", -10496, "gold");
        map.put("goldenrod", -2448096);
        map.put("gray", -8355712);
        androidx.media3.common.S.e(-16744448, map, "green", -5374161, "greenyellow");
        androidx.media3.common.S.d(-983056, -8355712, "grey", "honeydew", map);
        androidx.media3.common.S.e(-38476, map, "hotpink", -3318692, "indianred");
        androidx.media3.common.S.e(-11861886, map, "indigo", -16, "ivory");
        androidx.media3.common.S.e(-989556, map, "khaki", -1644806, "lavender");
        androidx.media3.common.S.e(-3851, map, "lavenderblush", -8586240, "lawngreen");
        androidx.media3.common.S.e(-1331, map, "lemonchiffon", -5383962, "lightblue");
        androidx.media3.common.S.e(-1015680, map, "lightcoral", -2031617, "lightcyan");
        map.put("lightgoldenrodyellow", -329006);
        map.put("lightgray", -2894893);
        map.put("lightgreen", -7278960);
        map.put("lightgrey", -2894893);
        androidx.media3.common.S.e(-18751, map, "lightpink", -24454, "lightsalmon");
        androidx.media3.common.S.e(-14634326, map, "lightseagreen", -7876870, "lightskyblue");
        map.put("lightslategray", -8943463);
        map.put("lightslategrey", -8943463);
        androidx.media3.common.S.d(-32, -5192482, "lightsteelblue", "lightyellow", map);
        androidx.media3.common.S.e(-16711936, map, "lime", -13447886, "limegreen");
        map.put("linen", -331546);
        map.put("magenta", -65281);
        androidx.media3.common.S.e(-8388608, map, "maroon", -10039894, "mediumaquamarine");
        androidx.media3.common.S.e(-16777011, map, "mediumblue", -4565549, "mediumorchid");
        androidx.media3.common.S.e(-7114533, map, "mediumpurple", -12799119, "mediumseagreen");
        androidx.media3.common.S.e(-8689426, map, "mediumslateblue", -16713062, "mediumspringgreen");
        androidx.media3.common.S.e(-12004916, map, "mediumturquoise", -3730043, "mediumvioletred");
        androidx.media3.common.S.e(-15132304, map, "midnightblue", -655366, "mintcream");
        androidx.media3.common.S.e(-6943, map, "mistyrose", -6987, "moccasin");
        androidx.media3.common.S.e(-8531, map, "navajowhite", -16777088, "navy");
        androidx.media3.common.S.e(-133658, map, "oldlace", -8355840, "olive");
        androidx.media3.common.S.e(-9728477, map, "olivedrab", -23296, "orange");
        androidx.media3.common.S.e(-47872, map, "orangered", -2461482, "orchid");
        androidx.media3.common.S.e(-1120086, map, "palegoldenrod", -6751336, "palegreen");
        androidx.media3.common.S.e(-5247250, map, "paleturquoise", -2396013, "palevioletred");
        androidx.media3.common.S.e(-4139, map, "papayawhip", -9543, "peachpuff");
        androidx.media3.common.S.e(-3308225, map, "peru", -16181, "pink");
        androidx.media3.common.S.e(-2252579, map, "plum", -5185306, "powderblue");
        androidx.media3.common.S.e(-8388480, map, "purple", -10079335, "rebeccapurple");
        androidx.media3.common.S.e(-65536, map, "red", -4419697, "rosybrown");
        androidx.media3.common.S.e(-12490271, map, "royalblue", -7650029, "saddlebrown");
        androidx.media3.common.S.e(-360334, map, "salmon", -744352, "sandybrown");
        androidx.media3.common.S.e(-13726889, map, "seagreen", -2578, "seashell");
        androidx.media3.common.S.e(-6270419, map, "sienna", -4144960, "silver");
        androidx.media3.common.S.e(-7876885, map, "skyblue", -9807155, "slateblue");
        map.put("slategray", -9404272);
        map.put("slategrey", -9404272);
        androidx.media3.common.S.d(-16711809, -1286, "snow", "springgreen", map);
        androidx.media3.common.S.e(-12156236, map, "steelblue", -2968436, "tan");
        androidx.media3.common.S.e(-16744320, map, "teal", -2572328, "thistle");
        androidx.media3.common.S.e(-40121, map, "tomato", 0, "transparent");
        androidx.media3.common.S.e(-12525360, map, "turquoise", -1146130, "violet");
        androidx.media3.common.S.e(-663885, map, "wheat", -1, "white");
        androidx.media3.common.S.e(-657931, map, "whitesmoke", -256, "yellow");
        map.put("yellowgreen", -6632142);
    }

    @InterfaceC42156l
    public static int a(String str, boolean z12) {
        int iB2;
        C36585a.b(!TextUtils.isEmpty(str));
        String strReplace = str.replace(" ", "");
        if (strReplace.charAt(0) == '#') {
            int i12 = (int) Long.parseLong(strReplace.substring(1), 16);
            if (strReplace.length() == 7) {
                return (-16777216) | i12;
            }
            if (strReplace.length() == 9) {
                return ((i12 & 255) << 24) | (i12 >>> 8);
            }
            throw new IllegalArgumentException();
        }
        if (strReplace.startsWith("rgba")) {
            Matcher matcher = (z12 ? f348128c : f348127b).matcher(strReplace);
            if (matcher.matches()) {
                if (z12) {
                    String strGroup = matcher.group(4);
                    strGroup.getClass();
                    iB2 = (int) (Float.parseFloat(strGroup) * 255.0f);
                } else {
                    iB2 = androidx.media3.common.S.b(matcher, 4, 10);
                }
                return Color.argb(iB2, androidx.media3.common.S.b(matcher, 1, 10), androidx.media3.common.S.b(matcher, 2, 10), androidx.media3.common.S.b(matcher, 3, 10));
            }
        } else if (strReplace.startsWith("rgb")) {
            Matcher matcher2 = f348126a.matcher(strReplace);
            if (matcher2.matches()) {
                int iB3 = androidx.media3.common.S.b(matcher2, 1, 10);
                int iB4 = androidx.media3.common.S.b(matcher2, 2, 10);
                String strGroup2 = matcher2.group(3);
                strGroup2.getClass();
                return Color.rgb(iB3, iB4, Integer.parseInt(strGroup2, 10));
            }
        } else {
            Integer num = (Integer) f348129d.get(C37257c.b(strReplace));
            if (num != null) {
                return num.intValue();
            }
        }
        throw new IllegalArgumentException();
    }
}
