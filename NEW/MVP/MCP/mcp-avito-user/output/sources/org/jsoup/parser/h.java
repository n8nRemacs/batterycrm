package org.jsoup.parser;

import a71.C19692b;
import com.adjust.sdk.Constants;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.HashMap;
import org.webrtc.MediaStreamTrack;

/* compiled from: Tag.java */
/* loaded from: classes7.dex */
public class h implements Cloneable {

    /* renamed from: k, reason: collision with root package name */
    public static final HashMap f421228k = new HashMap();

    /* renamed from: l, reason: collision with root package name */
    public static final String[] f421229l;

    /* renamed from: m, reason: collision with root package name */
    public static final String[] f421230m;

    /* renamed from: n, reason: collision with root package name */
    public static final String[] f421231n;

    /* renamed from: o, reason: collision with root package name */
    public static final String[] f421232o;

    /* renamed from: p, reason: collision with root package name */
    public static final String[] f421233p;

    /* renamed from: q, reason: collision with root package name */
    public static final String[] f421234q;

    /* renamed from: b, reason: collision with root package name */
    public String f421235b;

    /* renamed from: c, reason: collision with root package name */
    public final String f421236c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f421237d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f421238e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f421239f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f421240g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f421241h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f421242i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f421243j = false;

    static {
        String[] strArr = {"html", "head", "body", "frameset", "script", "noscript", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, Constants.REFERRER_API_META, "link", "title", "frame", "noframes", "section", "nav", "aside", "hgroup", "header", "footer", "p", "h1", "h2", "h3", "h4", "h5", "h6", "ul", "ol", "pre", "div", "blockquote", "hr", AddressParameter.TYPE, "figure", "figcaption", "form", "fieldset", "ins", "del", "dl", "dt", "dd", "li", "table", "caption", "thead", "tfoot", "tbody", "colgroup", "col", "tr", "th", "td", "video", MediaStreamTrack.AUDIO_TRACK_KIND, "canvas", "details", ChannelContext.MENU, "plaintext", "template", "article", "main", "svg", "math", "center"};
        f421229l = new String[]{"object", "base", "font", "tt", "i", "b", "u", "big", Constants.SMALL, "em", "strong", "dfn", "code", "samp", "kbd", "var", "cite", "abbr", CrashHianalyticsData.TIME, "acronym", "mark", "ruby", "rt", "rp", "a", "img", "br", "wbr", "map", "q", "sub", "sup", "bdo", "iframe", "embed", "span", "input", "select", "textarea", "label", "button", "optgroup", "option", "legend", "datalist", "keygen", "output", "progress", "meter", "area", "param", SearchParamsConverterKt.SOURCE, "track", "summary", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", SearchParamsConverterKt.SOURCE, "track", "data", "bdi", "s"};
        f421230m = new String[]{Constants.REFERRER_API_META, "link", "base", "frame", "img", "br", "wbr", "embed", "hr", "input", "keygen", "col", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", SearchParamsConverterKt.SOURCE, "track"};
        f421231n = new String[]{"title", "a", "p", "h1", "h2", "h3", "h4", "h5", "h6", "pre", AddressParameter.TYPE, "li", "th", "td", "script", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "ins", "del", "s"};
        f421232o = new String[]{"pre", "plaintext", "title", "textarea"};
        f421233p = new String[]{"button", "fieldset", "input", "keygen", "object", "output", "select", "textarea"};
        f421234q = new String[]{"input", "keygen", "object", "select", "textarea"};
        for (int i12 = 0; i12 < 64; i12++) {
            h hVar = new h(strArr[i12]);
            f421228k.put(hVar.f421235b, hVar);
        }
        for (String str : f421229l) {
            h hVar2 = new h(str);
            hVar2.f421237d = false;
            hVar2.f421238e = false;
            f421228k.put(hVar2.f421235b, hVar2);
        }
        for (String str2 : f421230m) {
            h hVar3 = (h) f421228k.get(str2);
            org.jsoup.helper.d.d(hVar3);
            hVar3.f421239f = true;
        }
        for (String str3 : f421231n) {
            h hVar4 = (h) f421228k.get(str3);
            org.jsoup.helper.d.d(hVar4);
            hVar4.f421238e = false;
        }
        for (String str4 : f421232o) {
            h hVar5 = (h) f421228k.get(str4);
            org.jsoup.helper.d.d(hVar5);
            hVar5.f421241h = true;
        }
        for (String str5 : f421233p) {
            h hVar6 = (h) f421228k.get(str5);
            org.jsoup.helper.d.d(hVar6);
            hVar6.f421242i = true;
        }
        for (String str6 : f421234q) {
            h hVar7 = (h) f421228k.get(str6);
            org.jsoup.helper.d.d(hVar7);
            hVar7.f421243j = true;
        }
    }

    public h(String str) {
        this.f421235b = str;
        this.f421236c = C19692b.a(str);
    }

    public static h a(String str, f fVar) {
        org.jsoup.helper.d.d(str);
        HashMap map = f421228k;
        h hVar = (h) map.get(str);
        if (hVar != null) {
            return hVar;
        }
        String strB = fVar.b(str);
        org.jsoup.helper.d.b(strB);
        String strA = C19692b.a(strB);
        h hVar2 = (h) map.get(strA);
        if (hVar2 == null) {
            h hVar3 = new h(strB);
            hVar3.f421237d = false;
            return hVar3;
        }
        if (!fVar.f421223a || strB.equals(strA)) {
            return hVar2;
        }
        try {
            h hVar4 = (h) super.clone();
            hVar4.f421235b = strB;
            return hVar4;
        } catch (CloneNotSupportedException e12) {
            throw new RuntimeException(e12);
        }
    }

    public final Object clone() {
        try {
            return (h) super.clone();
        } catch (CloneNotSupportedException e12) {
            throw new RuntimeException(e12);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f421235b.equals(hVar.f421235b) && this.f421239f == hVar.f421239f && this.f421238e == hVar.f421238e && this.f421237d == hVar.f421237d && this.f421241h == hVar.f421241h && this.f421240g == hVar.f421240g && this.f421242i == hVar.f421242i && this.f421243j == hVar.f421243j;
    }

    public final int hashCode() {
        return (((((((((((((this.f421235b.hashCode() * 31) + (this.f421237d ? 1 : 0)) * 31) + (this.f421238e ? 1 : 0)) * 31) + (this.f421239f ? 1 : 0)) * 31) + (this.f421240g ? 1 : 0)) * 31) + (this.f421241h ? 1 : 0)) * 31) + (this.f421242i ? 1 : 0)) * 31) + (this.f421243j ? 1 : 0);
    }

    public final String toString() {
        return this.f421235b;
    }
}
