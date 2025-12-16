package com.google.common.net;

import bZ0.InterfaceC25601b;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.category_parameters.FormattedDateDisplayingType;
import com.google.android.gms.common.internal.P0;
import com.google.common.base.AbstractC37259e;
import com.google.common.base.C;
import com.google.common.base.C37257c;
import com.google.common.base.C37262f;
import com.google.common.base.H;
import com.google.common.collect.C37326e3;
import com.google.common.collect.C37407s1;
import com.google.common.collect.M2;
import com.huawei.hms.framework.common.ContainerUtils;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.HashMap;
import org.webrtc.MediaStreamTrack;

/* compiled from: MediaType.java */
@XY0.b
@com.google.common.net.a
@aZ0.j
/* loaded from: classes6.dex */
public final class g {

    /* renamed from: f, reason: collision with root package name */
    public static final C37407s1<String, String> f360352f = C37407s1.r(C37257c.b(C37262f.f359034c.name()));

    /* renamed from: g, reason: collision with root package name */
    public static final AbstractC37259e f360353g = AbstractC37259e.e().b(AbstractC37259e.l().p()).b(AbstractC37259e.k()).b(AbstractC37259e.c("()<>@,;:\\\"/[]?=").p());

    /* renamed from: h, reason: collision with root package name */
    public static final HashMap f360354h;

    /* renamed from: i, reason: collision with root package name */
    public static final C.a f360355i;

    /* renamed from: a, reason: collision with root package name */
    public final String f360356a;

    /* renamed from: b, reason: collision with root package name */
    public final String f360357b;

    /* renamed from: c, reason: collision with root package name */
    public final C37407s1<String, String> f360358c;

    /* renamed from: d, reason: collision with root package name */
    @I41.a
    @InterfaceC25601b
    public String f360359d;

    /* renamed from: e, reason: collision with root package name */
    @InterfaceC25601b
    public int f360360e;

    /* compiled from: MediaType.java */
    public static final class a {
    }

    static {
        AbstractC37259e.e().b(AbstractC37259e.c("\"\\\r").p());
        AbstractC37259e.c(" \t\r\n");
        f360354h = new HashMap();
        a("*", "*");
        a("text", "*");
        a("image", "*");
        a(MediaStreamTrack.AUDIO_TRACK_KIND, "*");
        a("video", "*");
        a("application", "*");
        a("font", "*");
        b("text", "cache-manifest");
        b("text", "css");
        b("text", "csv");
        b("text", "html");
        b("text", FormattedDateDisplayingType.TYPE_CALENDAR);
        b("text", "plain");
        b("text", "javascript");
        b("text", "tab-separated-values");
        b("text", "vcard");
        b("text", "vnd.wap.wml");
        b("text", "xml");
        b("text", "vtt");
        a("image", "bmp");
        a("image", "x-canon-crw");
        a("image", "gif");
        a("image", "vnd.microsoft.icon");
        a("image", "jpeg");
        a("image", "png");
        a("image", "vnd.adobe.photoshop");
        b("image", "svg+xml");
        a("image", "tiff");
        a("image", "webp");
        a("image", "heif");
        a("image", "jp2");
        a(MediaStreamTrack.AUDIO_TRACK_KIND, "mp4");
        a(MediaStreamTrack.AUDIO_TRACK_KIND, "mpeg");
        a(MediaStreamTrack.AUDIO_TRACK_KIND, "ogg");
        a(MediaStreamTrack.AUDIO_TRACK_KIND, "webm");
        a(MediaStreamTrack.AUDIO_TRACK_KIND, "l16");
        a(MediaStreamTrack.AUDIO_TRACK_KIND, "l24");
        a(MediaStreamTrack.AUDIO_TRACK_KIND, "basic");
        a(MediaStreamTrack.AUDIO_TRACK_KIND, "aac");
        a(MediaStreamTrack.AUDIO_TRACK_KIND, "vorbis");
        a(MediaStreamTrack.AUDIO_TRACK_KIND, "x-ms-wma");
        a(MediaStreamTrack.AUDIO_TRACK_KIND, "x-ms-wax");
        a(MediaStreamTrack.AUDIO_TRACK_KIND, "vnd.rn-realaudio");
        a(MediaStreamTrack.AUDIO_TRACK_KIND, "vnd.wave");
        a("video", "mp4");
        a("video", "mpeg");
        a("video", "ogg");
        a("video", "quicktime");
        a("video", "webm");
        a("video", "x-ms-wmv");
        a("video", "x-flv");
        a("video", "3gpp");
        a("video", "3gpp2");
        b("application", "xml");
        b("application", "atom+xml");
        a("application", "x-bzip2");
        b("application", "dart");
        a("application", "vnd.apple.pkpass");
        a("application", "vnd.ms-fontobject");
        a("application", "epub+zip");
        a("application", "x-www-form-urlencoded");
        a("application", "pkcs12");
        a("application", "binary");
        a("application", "geo+json");
        a("application", "x-gzip");
        a("application", "hal+json");
        b("application", "javascript");
        a("application", "jose");
        a("application", "jose+json");
        b("application", "json");
        a("application", AddressParameter.Value.JSON_WEB_TOKEN);
        b("application", "manifest+json");
        a("application", "vnd.google-earth.kml+xml");
        a("application", "vnd.google-earth.kmz");
        a("application", "mbox");
        a("application", "x-apple-aspen-config");
        a("application", "vnd.ms-excel");
        a("application", "vnd.ms-outlook");
        a("application", "vnd.ms-powerpoint");
        a("application", "msword");
        a("application", "dash+xml");
        a("application", "wasm");
        a("application", "x-nacl");
        a("application", "x-pnacl");
        a("application", "octet-stream");
        a("application", "ogg");
        a("application", "vnd.openxmlformats-officedocument.wordprocessingml.document");
        a("application", "vnd.openxmlformats-officedocument.presentationml.presentation");
        a("application", "vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        a("application", "vnd.oasis.opendocument.graphics");
        a("application", "vnd.oasis.opendocument.presentation");
        a("application", "vnd.oasis.opendocument.spreadsheet");
        a("application", "vnd.oasis.opendocument.text");
        b("application", "opensearchdescription+xml");
        a("application", "pdf");
        a("application", "postscript");
        a("application", "protobuf");
        b("application", "rdf+xml");
        b("application", "rtf");
        a("application", "font-sfnt");
        a("application", "x-shockwave-flash");
        a("application", "vnd.sketchup.skp");
        b("application", "soap+xml");
        a("application", "x-tar");
        a("application", "font-woff");
        a("application", "font-woff2");
        b("application", "xhtml+xml");
        b("application", "xrd+xml");
        a("application", "zip");
        a("font", "collection");
        a("font", "otf");
        a("font", "sfnt");
        a("font", "ttf");
        a("font", "woff");
        a("font", "woff2");
        f360355i = new C.a(new C("; "), ContainerUtils.KEY_VALUE_DELIMITER, null);
    }

    public g(String str, String str2, C37407s1<String, String> c37407s1) {
        this.f360356a = str;
        this.f360357b = str2;
        this.f360358c = c37407s1;
    }

    public static void a(String str, String str2) {
        g gVar = new g(str, str2, C37407s1.q());
        f360354h.put(gVar, gVar);
        H.a();
    }

    public static void b(String str, String str2) {
        g gVar = new g(str, str2, f360352f);
        f360354h.put(gVar, gVar);
        H.d(C37262f.f359034c);
    }

    public final boolean equals(@I41.a Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f360356a.equals(gVar.f360356a) && this.f360357b.equals(gVar.f360357b)) {
            if (((AbstractMap) M2.l(this.f360358c.V(), new P0(24))).equals(M2.l(gVar.f360358c.V(), new P0(24)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i12 = this.f360360e;
        if (i12 != 0) {
            return i12;
        }
        int iHashCode = Arrays.hashCode(new Object[]{this.f360356a, this.f360357b, M2.l(this.f360358c.V(), new P0(24))});
        this.f360360e = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        String str = this.f360359d;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f360356a);
        sb2.append('/');
        sb2.append(this.f360357b);
        C37407s1<String, String> c37407s1 = this.f360358c;
        if (!c37407s1.isEmpty()) {
            sb2.append("; ");
            Iterable iterableB = C37326e3.a(c37407s1, new P0(23)).b();
            C.a aVar = f360355i;
            aVar.getClass();
            try {
                aVar.a(sb2, iterableB.iterator());
            } catch (IOException e12) {
                throw new AssertionError(e12);
            }
        }
        String string = sb2.toString();
        this.f360359d = string;
        return string;
    }
}
