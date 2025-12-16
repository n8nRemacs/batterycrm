package androidx.media3.extractor;

import android.util.Base64;
import androidx.media3.common.Metadata;
import androidx.media3.common.ParserException;
import androidx.media3.extractor.metadata.flac.PictureFrame;
import androidx.media3.extractor.metadata.vorbis.VorbisComment;
import com.google.common.base.C37262f;
import com.huawei.hms.framework.common.ContainerUtils;
import j.P;
import java.util.ArrayList;
import java.util.List;

/* compiled from: VorbisUtil.java */
@androidx.media3.common.util.J
/* loaded from: classes.dex */
public final class M {

    /* compiled from: VorbisUtil.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String[] f50395a;

        public a(String[] strArr) {
            this.f50395a = strArr;
        }
    }

    /* compiled from: VorbisUtil.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f50396a;

        public b(boolean z12) {
            this.f50396a = z12;
        }
    }

    /* compiled from: VorbisUtil.java */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f50397a;

        /* renamed from: b, reason: collision with root package name */
        public final int f50398b;

        /* renamed from: c, reason: collision with root package name */
        public final int f50399c;

        /* renamed from: d, reason: collision with root package name */
        public final int f50400d;

        /* renamed from: e, reason: collision with root package name */
        public final int f50401e;

        /* renamed from: f, reason: collision with root package name */
        public final int f50402f;

        /* renamed from: g, reason: collision with root package name */
        public final byte[] f50403g;

        public c(int i12, int i13, int i14, int i15, int i16, int i17, byte[] bArr) {
            this.f50397a = i12;
            this.f50398b = i13;
            this.f50399c = i14;
            this.f50400d = i15;
            this.f50401e = i16;
            this.f50402f = i17;
            this.f50403g = bArr;
        }
    }

    public static int a(int i12) {
        int i13 = 0;
        while (i12 > 0) {
            i13++;
            i12 >>>= 1;
        }
        return i13;
    }

    @P
    public static Metadata b(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < list.size(); i12++) {
            String str = list.get(i12);
            int i13 = androidx.media3.common.util.M.f47887a;
            String[] strArrSplit = str.split(ContainerUtils.KEY_VALUE_DELIMITER, 2);
            if (strArrSplit.length != 2) {
                "Failed to parse Vorbis comment: ".concat(str);
                androidx.media3.common.util.s.g();
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(PictureFrame.a(new androidx.media3.common.util.z(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e12) {
                    androidx.media3.common.util.s.h("Failed to parse vorbis picture", e12);
                }
            } else {
                arrayList.add(new VorbisComment(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    public static a c(androidx.media3.common.util.z zVar, boolean z12, boolean z13) throws ParserException {
        if (z12) {
            d(3, zVar, false);
        }
        zVar.s((int) zVar.l(), C37262f.f359034c);
        long jL2 = zVar.l();
        String[] strArr = new String[(int) jL2];
        for (int i12 = 0; i12 < jL2; i12++) {
            strArr[i12] = zVar.s((int) zVar.l(), C37262f.f359034c);
        }
        if (z13 && (zVar.u() & 1) == 0) {
            throw ParserException.a("framing bit expected to be set", null);
        }
        return new a(strArr);
    }

    public static boolean d(int i12, androidx.media3.common.util.z zVar, boolean z12) throws ParserException {
        if (zVar.a() < 7) {
            if (z12) {
                return false;
            }
            throw ParserException.a("too short header: " + zVar.a(), null);
        }
        if (zVar.u() != i12) {
            if (z12) {
                return false;
            }
            throw ParserException.a("expected header type " + Integer.toHexString(i12), null);
        }
        if (zVar.u() == 118 && zVar.u() == 111 && zVar.u() == 114 && zVar.u() == 98 && zVar.u() == 105 && zVar.u() == 115) {
            return true;
        }
        if (z12) {
            return false;
        }
        throw ParserException.a("expected characters 'vorbis'", null);
    }
}
