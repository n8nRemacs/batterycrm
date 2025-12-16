package com.google.android.exoplayer2;

import android.net.Uri;
import android.os.Bundle;
import com.adjust.sdk.network.ErrorCodes;
import com.google.android.exoplayer2.I;
import com.google.android.exoplayer2.InterfaceC36525h;
import com.google.android.exoplayer2.O;
import com.google.android.exoplayer2.P;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.s0;
import com.google.android.exoplayer2.t0;
import com.google.android.exoplayer2.util.C36585a;
import com.google.android.exoplayer2.util.C36588d;
import com.google.android.exoplayer2.util.C36604u;
import com.google.android.exoplayer2.util.InterfaceC36589e;
import com.google.common.base.InterfaceC37276u;
import com.google.common.collect.AbstractC37401r1;
import java.util.ArrayList;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.exoplayer2.v, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C36607v implements C36604u.a, InterfaceC37276u, InterfaceC36525h.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f348170b;

    public /* synthetic */ C36607v(int i12) {
        this.f348170b = i12;
    }

    @Override // com.google.common.base.InterfaceC37276u
    public Object apply(Object obj) {
        return new com.google.android.exoplayer2.analytics.j((InterfaceC36589e) obj);
    }

    @Override // com.google.android.exoplayer2.InterfaceC36525h.a
    public InterfaceC36525h fromBundle(Bundle bundle) {
        Bundle bundle2;
        Bundle bundle3;
        InterfaceC36525h l12;
        boolean z12 = true;
        switch (this.f348170b) {
            case 4:
                I i12 = I.f343456H;
                I.b bVar = new I.b();
                if (bundle != null) {
                    ClassLoader classLoader = C36588d.class.getClassLoader();
                    int i13 = com.google.android.exoplayer2.util.U.f348106a;
                    bundle.setClassLoader(classLoader);
                }
                String string = bundle.getString(Integer.toString(0, 36));
                I i14 = I.f343456H;
                String str = i14.f343465b;
                if (string == null) {
                    string = str;
                }
                bVar.f343494a = string;
                String string2 = bundle.getString(Integer.toString(1, 36));
                if (string2 == null) {
                    string2 = i14.f343466c;
                }
                bVar.f343495b = string2;
                String string3 = bundle.getString(Integer.toString(2, 36));
                if (string3 == null) {
                    string3 = i14.f343467d;
                }
                bVar.f343496c = string3;
                bVar.f343497d = bundle.getInt(Integer.toString(3, 36), i14.f343468e);
                bVar.f343498e = bundle.getInt(Integer.toString(4, 36), i14.f343469f);
                bVar.f343499f = bundle.getInt(Integer.toString(5, 36), i14.f343470g);
                bVar.f343500g = bundle.getInt(Integer.toString(6, 36), i14.f343471h);
                String string4 = bundle.getString(Integer.toString(7, 36));
                if (string4 == null) {
                    string4 = i14.f343473j;
                }
                bVar.f343501h = string4;
                Metadata metadata = (Metadata) bundle.getParcelable(Integer.toString(8, 36));
                if (metadata == null) {
                    metadata = i14.f343474k;
                }
                bVar.f343502i = metadata;
                String string5 = bundle.getString(Integer.toString(9, 36));
                if (string5 == null) {
                    string5 = i14.f343475l;
                }
                bVar.f343503j = string5;
                String string6 = bundle.getString(Integer.toString(10, 36));
                if (string6 == null) {
                    string6 = i14.f343476m;
                }
                bVar.f343504k = string6;
                bVar.f343505l = bundle.getInt(Integer.toString(11, 36), i14.f343477n);
                ArrayList arrayList = new ArrayList();
                int i15 = 0;
                while (true) {
                    byte[] byteArray = bundle.getByteArray(Integer.toString(12, 36) + "_" + Integer.toString(i15, 36));
                    if (byteArray == null) {
                        bVar.f343506m = arrayList;
                        bVar.f343507n = (DrmInitData) bundle.getParcelable(Integer.toString(13, 36));
                        bVar.f343508o = bundle.getLong(Integer.toString(14, 36), i14.f343480q);
                        bVar.f343509p = bundle.getInt(Integer.toString(15, 36), i14.f343481r);
                        bVar.f343510q = bundle.getInt(Integer.toString(16, 36), i14.f343482s);
                        bVar.f343511r = bundle.getFloat(Integer.toString(17, 36), i14.f343483t);
                        bVar.f343512s = bundle.getInt(Integer.toString(18, 36), i14.f343484u);
                        bVar.f343513t = bundle.getFloat(Integer.toString(19, 36), i14.f343485v);
                        bVar.f343514u = bundle.getByteArray(Integer.toString(20, 36));
                        bVar.f343515v = bundle.getInt(Integer.toString(21, 36), i14.f343487x);
                        Bundle bundle4 = bundle.getBundle(Integer.toString(22, 36));
                        if (bundle4 != null) {
                            bVar.f343516w = new com.google.android.exoplayer2.video.b(bundle4.getInt(Integer.toString(0, 36), -1), bundle4.getInt(Integer.toString(1, 36), -1), bundle4.getInt(Integer.toString(2, 36), -1), bundle4.getByteArray(Integer.toString(3, 36)));
                        }
                        bVar.f343517x = bundle.getInt(Integer.toString(23, 36), i14.f343489z);
                        bVar.f343518y = bundle.getInt(Integer.toString(24, 36), i14.f343458A);
                        bVar.f343519z = bundle.getInt(Integer.toString(25, 36), i14.f343459B);
                        bVar.f343490A = bundle.getInt(Integer.toString(26, 36), i14.f343460C);
                        bVar.f343491B = bundle.getInt(Integer.toString(27, 36), i14.f343461D);
                        bVar.f343492C = bundle.getInt(Integer.toString(28, 36), i14.f343462E);
                        bVar.f343493D = bundle.getInt(Integer.toString(29, 36), i14.f343463F);
                        return bVar.a();
                    }
                    arrayList.add(byteArray);
                    i15++;
                }
            case 5:
                C36585a.b(bundle.getInt(Integer.toString(0, 36), -1) == 0);
                return bundle.getBoolean(Integer.toString(1, 36), false) ? new L(bundle.getBoolean(Integer.toString(2, 36), false)) : new L();
            case 6:
                C36607v c36607v = O.f343527h;
                String string7 = bundle.getString(Integer.toString(0, 36), "");
                string7.getClass();
                Bundle bundle5 = bundle.getBundle(Integer.toString(1, 36));
                O.g gVar = bundle5 == null ? O.g.f343559g : (O.g) O.g.f343560h.fromBundle(bundle5);
                Bundle bundle6 = bundle.getBundle(Integer.toString(2, 36));
                P p12 = bundle6 == null ? P.f343601H : (P) P.f343602I.fromBundle(bundle6);
                Bundle bundle7 = bundle.getBundle(Integer.toString(3, 36));
                O.e eVar = bundle7 == null ? O.e.f343558h : (O.e) O.d.f343547g.fromBundle(bundle7);
                Bundle bundle8 = bundle.getBundle(Integer.toString(4, 36));
                return new O(string7, eVar, null, gVar, p12, bundle8 == null ? O.j.f343579e : (O.j) O.j.f343580f.fromBundle(bundle8));
            case 7:
                C36607v c36607v2 = O.d.f343547g;
                O.d.a aVar = new O.d.a();
                long j12 = bundle.getLong(Integer.toString(0, 36), 0L);
                C36585a.b(j12 >= 0);
                aVar.f343553a = j12;
                long j13 = bundle.getLong(Integer.toString(1, 36), Long.MIN_VALUE);
                if (j13 != Long.MIN_VALUE && j13 < 0) {
                    z12 = false;
                }
                C36585a.b(z12);
                aVar.f343554b = j13;
                aVar.f343555c = bundle.getBoolean(Integer.toString(2, 36), false);
                aVar.f343556d = bundle.getBoolean(Integer.toString(3, 36), false);
                aVar.f343557e = bundle.getBoolean(Integer.toString(4, 36), false);
                return aVar.a();
            case 8:
                return new O.g(bundle.getLong(Integer.toString(0, 36), -9223372036854775807L), bundle.getLong(Integer.toString(1, 36), -9223372036854775807L), bundle.getLong(Integer.toString(2, 36), -9223372036854775807L), bundle.getFloat(Integer.toString(3, 36), -3.4028235E38f), bundle.getFloat(Integer.toString(4, 36), -3.4028235E38f));
            case 9:
                O.j jVar = O.j.f343579e;
                O.j.a aVar2 = new O.j.a();
                aVar2.f343584a = (Uri) bundle.getParcelable(Integer.toString(0, 36));
                aVar2.f343585b = bundle.getString(Integer.toString(1, 36));
                aVar2.f343586c = bundle.getBundle(Integer.toString(2, 36));
                return new O.j(aVar2, null);
            case 10:
                P p13 = P.f343601H;
                P.b bVar2 = new P.b();
                bVar2.f343640a = bundle.getCharSequence(Integer.toString(0, 36));
                bVar2.f343641b = bundle.getCharSequence(Integer.toString(1, 36));
                bVar2.f343642c = bundle.getCharSequence(Integer.toString(2, 36));
                bVar2.f343643d = bundle.getCharSequence(Integer.toString(3, 36));
                bVar2.f343644e = bundle.getCharSequence(Integer.toString(4, 36));
                bVar2.f343645f = bundle.getCharSequence(Integer.toString(5, 36));
                bVar2.f343646g = bundle.getCharSequence(Integer.toString(6, 36));
                byte[] byteArray2 = bundle.getByteArray(Integer.toString(10, 36));
                Integer numValueOf = bundle.containsKey(Integer.toString(29, 36)) ? Integer.valueOf(bundle.getInt(Integer.toString(29, 36))) : null;
                bVar2.f343649j = byteArray2 == null ? null : (byte[]) byteArray2.clone();
                bVar2.f343650k = numValueOf;
                bVar2.f343651l = (Uri) bundle.getParcelable(Integer.toString(11, 36));
                bVar2.f343662w = bundle.getCharSequence(Integer.toString(22, 36));
                bVar2.f343663x = bundle.getCharSequence(Integer.toString(23, 36));
                bVar2.f343664y = bundle.getCharSequence(Integer.toString(24, 36));
                bVar2.f343636B = bundle.getCharSequence(Integer.toString(27, 36));
                bVar2.f343637C = bundle.getCharSequence(Integer.toString(28, 36));
                bVar2.f343638D = bundle.getCharSequence(Integer.toString(30, 36));
                bVar2.f343639E = bundle.getBundle(Integer.toString(1000, 36));
                boolean zContainsKey = bundle.containsKey(Integer.toString(8, 36));
                C36607v c36607v3 = g0.f345416b;
                if (zContainsKey && (bundle3 = bundle.getBundle(Integer.toString(8, 36))) != null) {
                    bVar2.f343647h = (g0) c36607v3.fromBundle(bundle3);
                }
                if (bundle.containsKey(Integer.toString(9, 36)) && (bundle2 = bundle.getBundle(Integer.toString(9, 36))) != null) {
                    bVar2.f343648i = (g0) c36607v3.fromBundle(bundle2);
                }
                if (bundle.containsKey(Integer.toString(12, 36))) {
                    bVar2.f343652m = Integer.valueOf(bundle.getInt(Integer.toString(12, 36)));
                }
                if (bundle.containsKey(Integer.toString(13, 36))) {
                    bVar2.f343653n = Integer.valueOf(bundle.getInt(Integer.toString(13, 36)));
                }
                if (bundle.containsKey(Integer.toString(14, 36))) {
                    bVar2.f343654o = Integer.valueOf(bundle.getInt(Integer.toString(14, 36)));
                }
                if (bundle.containsKey(Integer.toString(15, 36))) {
                    bVar2.f343655p = Boolean.valueOf(bundle.getBoolean(Integer.toString(15, 36)));
                }
                if (bundle.containsKey(Integer.toString(16, 36))) {
                    bVar2.f343656q = Integer.valueOf(bundle.getInt(Integer.toString(16, 36)));
                }
                if (bundle.containsKey(Integer.toString(17, 36))) {
                    bVar2.f343657r = Integer.valueOf(bundle.getInt(Integer.toString(17, 36)));
                }
                if (bundle.containsKey(Integer.toString(18, 36))) {
                    bVar2.f343658s = Integer.valueOf(bundle.getInt(Integer.toString(18, 36)));
                }
                if (bundle.containsKey(Integer.toString(19, 36))) {
                    bVar2.f343659t = Integer.valueOf(bundle.getInt(Integer.toString(19, 36)));
                }
                if (bundle.containsKey(Integer.toString(20, 36))) {
                    bVar2.f343660u = Integer.valueOf(bundle.getInt(Integer.toString(20, 36)));
                }
                if (bundle.containsKey(Integer.toString(21, 36))) {
                    bVar2.f343661v = Integer.valueOf(bundle.getInt(Integer.toString(21, 36)));
                }
                if (bundle.containsKey(Integer.toString(25, 36))) {
                    bVar2.f343665z = Integer.valueOf(bundle.getInt(Integer.toString(25, 36)));
                }
                if (bundle.containsKey(Integer.toString(26, 36))) {
                    bVar2.f343635A = Integer.valueOf(bundle.getInt(Integer.toString(26, 36)));
                }
                return new P(bVar2, null);
            case 11:
                C36585a.b(bundle.getInt(Integer.toString(0, 36), -1) == 1);
                float f12 = bundle.getFloat(Integer.toString(1, 36), -1.0f);
                return f12 == -1.0f ? new a0() : new a0(f12);
            case 12:
                int i16 = bundle.getInt(Integer.toString(0, 36), -1);
                if (i16 == 0) {
                    C36585a.b(bundle.getInt(Integer.toString(0, 36), -1) == 0);
                    if (bundle.getBoolean(Integer.toString(1, 36), false)) {
                        return new L(bundle.getBoolean(Integer.toString(2, 36), false));
                    }
                    l12 = new L();
                } else if (i16 == 1) {
                    C36585a.b(bundle.getInt(Integer.toString(0, 36), -1) == 1);
                    float f13 = bundle.getFloat(Integer.toString(1, 36), -1.0f);
                    if (f13 != -1.0f) {
                        return new a0(f13);
                    }
                    l12 = new a0();
                } else {
                    if (i16 != 2) {
                        if (i16 != 3) {
                            throw new IllegalArgumentException(AK.c.g(i16, "Unknown RatingType: "));
                        }
                        C36585a.b(bundle.getInt(Integer.toString(0, 36), -1) == 3);
                        return bundle.getBoolean(Integer.toString(1, 36), false) ? new r0(bundle.getBoolean(Integer.toString(2, 36), false)) : new r0();
                    }
                    C36585a.b(bundle.getInt(Integer.toString(0, 36), -1) == 2);
                    int i17 = bundle.getInt(Integer.toString(1, 36), 5);
                    float f14 = bundle.getFloat(Integer.toString(2, 36), -1.0f);
                    if (f14 != -1.0f) {
                        return new n0(i17, f14);
                    }
                    l12 = new n0(i17);
                }
                return l12;
            case 13:
                C36585a.b(bundle.getInt(Integer.toString(0, 36), -1) == 2);
                int i18 = bundle.getInt(Integer.toString(1, 36), 5);
                float f15 = bundle.getFloat(Integer.toString(2, 36), -1.0f);
                return f15 == -1.0f ? new n0(i18) : new n0(i18, f15);
            case 14:
                C36585a.b(bundle.getInt(Integer.toString(0, 36), -1) == 3);
                return bundle.getBoolean(Integer.toString(1, 36), false) ? new r0(bundle.getBoolean(Integer.toString(2, 36), false)) : new r0();
            case 15:
                int i19 = bundle.getInt(Integer.toString(0, 36), 0);
                long j14 = bundle.getLong(Integer.toString(1, 36), -9223372036854775807L);
                long j15 = bundle.getLong(Integer.toString(2, 36), 0L);
                boolean z13 = bundle.getBoolean(Integer.toString(3, 36));
                Bundle bundle9 = bundle.getBundle(Integer.toString(4, 36));
                com.google.android.exoplayer2.source.ads.a aVar3 = bundle9 != null ? (com.google.android.exoplayer2.source.ads.a) com.google.android.exoplayer2.source.ads.a.f346181j.fromBundle(bundle9) : com.google.android.exoplayer2.source.ads.a.f346179h;
                s0.b bVar3 = new s0.b();
                bVar3.h(null, null, i19, j14, j15, aVar3, z13);
                return bVar3;
            case 16:
                Object obj = s0.d.f345877s;
                Bundle bundle10 = bundle.getBundle(Integer.toString(1, 36));
                O o12 = bundle10 != null ? (O) O.f343527h.fromBundle(bundle10) : null;
                long j16 = bundle.getLong(Integer.toString(2, 36), -9223372036854775807L);
                long j17 = bundle.getLong(Integer.toString(3, 36), -9223372036854775807L);
                long j18 = bundle.getLong(Integer.toString(4, 36), -9223372036854775807L);
                boolean z14 = bundle.getBoolean(Integer.toString(5, 36), false);
                boolean z15 = bundle.getBoolean(Integer.toString(6, 36), false);
                Bundle bundle11 = bundle.getBundle(Integer.toString(7, 36));
                O.g gVar2 = bundle11 != null ? (O.g) O.g.f343560h.fromBundle(bundle11) : null;
                boolean z16 = bundle.getBoolean(Integer.toString(8, 36), false);
                long j19 = bundle.getLong(Integer.toString(9, 36), 0L);
                long j22 = bundle.getLong(Integer.toString(10, 36), -9223372036854775807L);
                int i22 = bundle.getInt(Integer.toString(11, 36), 0);
                int i23 = bundle.getInt(Integer.toString(12, 36), 0);
                long j23 = bundle.getLong(Integer.toString(13, 36), 0L);
                s0.d dVar = new s0.d();
                dVar.b(s0.d.f345878t, o12, null, j16, j17, j18, z14, z15, gVar2, j19, j22, i22, i23, j23);
                dVar.f345891m = z16;
                return dVar;
            default:
                Bundle bundle12 = bundle.getBundle(Integer.toString(0, 36));
                bundle12.getClass();
                ArrayList parcelableArrayList = bundle12.getParcelableArrayList(Integer.toString(0, 36));
                com.google.android.exoplayer2.source.V v12 = new com.google.android.exoplayer2.source.V(bundle12.getString(Integer.toString(1, 36), ""), (I[]) (parcelableArrayList == null ? AbstractC37401r1.C() : C36588d.a(I.f343457I, parcelableArrayList)).toArray(new I[0]));
                int[] intArray = bundle.getIntArray(Integer.toString(1, 36));
                int i24 = v12.f346148b;
                return new t0.a(v12, bundle.getBoolean(Integer.toString(4, 36), false), (int[]) com.google.common.base.D.a(intArray, new int[i24]), (boolean[]) com.google.common.base.D.a(bundle.getBooleanArray(Integer.toString(3, 36)), new boolean[i24]));
        }
    }

    @Override // com.google.android.exoplayer2.util.C36604u.a
    public void invoke(Object obj) {
        d0.g gVar = (d0.g) obj;
        switch (this.f348170b) {
            case 0:
                int i12 = C.f343308n0;
                gVar.onPlayerError(new ExoPlaybackException(2, new ExoTimeoutException("Player release timed out."), ErrorCodes.MALFORMED_URL_EXCEPTION));
                break;
            case 1:
            default:
                gVar.onRenderedFirstFrame();
                break;
            case 2:
                gVar.onSeekProcessed();
                break;
        }
    }
}
