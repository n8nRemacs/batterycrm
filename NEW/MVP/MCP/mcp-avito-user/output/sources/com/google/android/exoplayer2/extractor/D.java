package com.google.android.exoplayer2.extractor;

import android.util.Base64;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import com.google.android.exoplayer2.metadata.vorbis.VorbisComment;
import com.google.android.exoplayer2.util.C36605v;
import com.google.android.exoplayer2.util.F;
import com.google.android.exoplayer2.util.U;
import com.google.common.base.C37262f;
import com.huawei.hms.framework.common.ContainerUtils;
import j.P;
import java.util.ArrayList;
import java.util.List;

/* compiled from: VorbisUtil.java */
/* loaded from: classes6.dex */
public final class D {

    /* compiled from: VorbisUtil.java */
    public static final class a {
    }

    /* compiled from: VorbisUtil.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String[] f344387a;

        public b(String[] strArr) {
            this.f344387a = strArr;
        }
    }

    /* compiled from: VorbisUtil.java */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f344388a;

        public c(boolean z12) {
            this.f344388a = z12;
        }
    }

    /* compiled from: VorbisUtil.java */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f344389a;

        /* renamed from: b, reason: collision with root package name */
        public final int f344390b;

        /* renamed from: c, reason: collision with root package name */
        public final int f344391c;

        /* renamed from: d, reason: collision with root package name */
        public final int f344392d;

        /* renamed from: e, reason: collision with root package name */
        public final int f344393e;

        /* renamed from: f, reason: collision with root package name */
        public final int f344394f;

        /* renamed from: g, reason: collision with root package name */
        public final byte[] f344395g;

        public d(int i12, int i13, int i14, int i15, int i16, int i17, byte[] bArr) {
            this.f344389a = i12;
            this.f344390b = i13;
            this.f344391c = i14;
            this.f344392d = i15;
            this.f344393e = i16;
            this.f344394f = i17;
            this.f344395g = bArr;
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
            int i13 = U.f348106a;
            String[] strArrSplit = str.split(ContainerUtils.KEY_VALUE_DELIMITER, 2);
            if (strArrSplit.length == 2) {
                if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                    try {
                        arrayList.add(PictureFrame.a(new F(Base64.decode(strArrSplit[1], 0))));
                    } catch (RuntimeException e12) {
                        C36605v.a("Failed to parse vorbis picture", e12);
                    }
                } else {
                    arrayList.add(new VorbisComment(strArrSplit[0], strArrSplit[1]));
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    public static b c(F f12, boolean z12, boolean z13) throws ParserException {
        if (z12) {
            d(3, f12, false);
        }
        f12.p((int) f12.i(), C37262f.f359034c);
        long jI2 = f12.i();
        String[] strArr = new String[(int) jI2];
        for (int i12 = 0; i12 < jI2; i12++) {
            strArr[i12] = f12.p((int) f12.i(), C37262f.f359034c);
        }
        if (z13 && (f12.r() & 1) == 0) {
            throw ParserException.a("framing bit expected to be set", null);
        }
        return new b(strArr);
    }

    public static boolean d(int i12, F f12, boolean z12) throws ParserException {
        if (f12.a() < 7) {
            if (z12) {
                return false;
            }
            throw ParserException.a("too short header: " + f12.a(), null);
        }
        if (f12.r() != i12) {
            if (z12) {
                return false;
            }
            throw ParserException.a("expected header type " + Integer.toHexString(i12), null);
        }
        if (f12.r() == 118 && f12.r() == 111 && f12.r() == 114 && f12.r() == 98 && f12.r() == 105 && f12.r() == 115) {
            return true;
        }
        if (z12) {
            return false;
        }
        throw ParserException.a("expected characters 'vorbis'", null);
    }
}
