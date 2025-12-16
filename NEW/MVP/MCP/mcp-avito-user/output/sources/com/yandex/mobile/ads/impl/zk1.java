package com.yandex.mobile.ads.impl;

import android.util.Base64;
import com.huawei.hms.framework.common.ContainerUtils;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.exo.metadata.flac.PictureFrame;
import com.yandex.mobile.ads.exo.metadata.vorbis.VorbisComment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes8.dex */
public final class zk1 {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String[] f392277a;

        public a(String[] strArr) {
            this.f392277a = strArr;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f392278a;

        public b(boolean z12) {
            this.f392278a = z12;
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f392279a;

        /* renamed from: b, reason: collision with root package name */
        public final int f392280b;

        /* renamed from: c, reason: collision with root package name */
        public final int f392281c;

        /* renamed from: d, reason: collision with root package name */
        public final int f392282d;

        /* renamed from: e, reason: collision with root package name */
        public final int f392283e;

        /* renamed from: f, reason: collision with root package name */
        public final int f392284f;

        /* renamed from: g, reason: collision with root package name */
        public final byte[] f392285g;

        public c(int i12, int i13, int i14, int i15, int i16, int i17, byte[] bArr) {
            this.f392279a = i12;
            this.f392280b = i13;
            this.f392281c = i14;
            this.f392282d = i15;
            this.f392283e = i16;
            this.f392284f = i17;
            this.f392285g = bArr;
        }
    }

    public static c a(pr0 pr0Var) {
        a(1, pr0Var, false);
        int iK2 = pr0Var.k();
        if (iK2 < 0) {
            throw new IllegalStateException(ba.a("Top bit not zero: ", iK2));
        }
        int iT2 = pr0Var.t();
        int iK3 = pr0Var.k();
        if (iK3 < 0) {
            throw new IllegalStateException(ba.a("Top bit not zero: ", iK3));
        }
        int iK4 = pr0Var.k();
        int i12 = iK4 <= 0 ? -1 : iK4;
        int iK5 = pr0Var.k();
        int i13 = iK5 <= 0 ? -1 : iK5;
        pr0Var.k();
        int iT3 = pr0Var.t();
        int iPow = (int) Math.pow(2.0d, iT3 & 15);
        int iPow2 = (int) Math.pow(2.0d, (iT3 & 240) >> 4);
        pr0Var.t();
        return new c(iT2, iK3, i12, i13, iPow, iPow2, Arrays.copyOf(pr0Var.c(), pr0Var.e()));
    }

    public static a a(pr0 pr0Var, boolean z12, boolean z13) throws tr0 {
        if (z12) {
            a(3, pr0Var, false);
        }
        pr0Var.a((int) pr0Var.n(), oi.f388554c);
        long jN2 = pr0Var.n();
        String[] strArr = new String[(int) jN2];
        for (int i12 = 0; i12 < jN2; i12++) {
            strArr[i12] = pr0Var.a((int) pr0Var.n(), oi.f388554c);
        }
        if (z13 && (pr0Var.t() & 1) == 0) {
            throw tr0.a("framing bit expected to be set", (Exception) null);
        }
        return new a(strArr);
    }

    @j.P
    public static Metadata a(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < list.size(); i12++) {
            String str = list.get(i12);
            int i13 = pc1.f388768a;
            String[] strArrSplit = str.split(ContainerUtils.KEY_VALUE_DELIMITER, 2);
            if (strArrSplit.length != 2) {
                yk1.a("Failed to parse Vorbis comment: ", str, "VorbisUtil");
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    pr0 pr0Var = new pr0(Base64.decode(strArrSplit[1], 0));
                    int iH2 = pr0Var.h();
                    String strA = pr0Var.a(pr0Var.h(), oi.f388552a);
                    String strA2 = pr0Var.a(pr0Var.h(), oi.f388554c);
                    int iH3 = pr0Var.h();
                    int iH4 = pr0Var.h();
                    int iH5 = pr0Var.h();
                    int iH6 = pr0Var.h();
                    int iH7 = pr0Var.h();
                    byte[] bArr = new byte[iH7];
                    pr0Var.a(bArr, 0, iH7);
                    arrayList.add(new PictureFrame(iH2, strA, strA2, iH3, iH4, iH5, iH6, bArr));
                } catch (RuntimeException e12) {
                    ka0.b("VorbisUtil", "Failed to parse vorbis picture", e12);
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

    public static boolean a(int i12, pr0 pr0Var, boolean z12) {
        if (pr0Var.a() < 7) {
            if (z12) {
                return false;
            }
            StringBuilder sbA = Cif.a("too short header: ");
            sbA.append(pr0Var.a());
            throw tr0.a(sbA.toString(), (Exception) null);
        }
        if (pr0Var.t() != i12) {
            if (z12) {
                return false;
            }
            StringBuilder sbA2 = Cif.a("expected header type ");
            sbA2.append(Integer.toHexString(i12));
            throw tr0.a(sbA2.toString(), (Exception) null);
        }
        if (pr0Var.t() == 118 && pr0Var.t() == 111 && pr0Var.t() == 114 && pr0Var.t() == 98 && pr0Var.t() == 105 && pr0Var.t() == 115) {
            return true;
        }
        if (z12) {
            return false;
        }
        throw tr0.a("expected characters 'vorbis'", (Exception) null);
    }
}
