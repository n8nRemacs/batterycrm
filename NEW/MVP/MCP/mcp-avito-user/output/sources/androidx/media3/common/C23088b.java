package androidx.media3.common;

import android.net.Uri;
import android.os.Bundle;
import androidx.media3.common.B;
import androidx.media3.common.C23089c;
import androidx.media3.common.C23091e;
import androidx.media3.common.C23104o;
import androidx.media3.common.C23108t;
import androidx.media3.common.H;
import androidx.media3.common.InterfaceC23096j;
import androidx.media3.common.P;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.C23113d;
import androidx.media3.common.util.C23114e;
import androidx.media3.common.z;
import com.google.common.collect.AbstractC37401r1;
import com.google.common.collect.AbstractC37412t1;
import com.google.common.collect.O4;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.UUID;

/* compiled from: R8$$SyntheticClass */
/* renamed from: androidx.media3.common.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C23088b implements InterfaceC23096j.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f47614b;

    public /* synthetic */ C23088b(int i12) {
        this.f47614b = i12;
    }

    public static int a(int i12, int i13, Object obj) {
        return (obj.hashCode() + i12) * i13;
    }

    public static StringBuilder b(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        sb2.append(str5);
        return sb2;
    }

    @Override // androidx.media3.common.InterfaceC23096j.a
    public InterfaceC23096j fromBundle(Bundle bundle) {
        C23089c.b[] bVarArr;
        AbstractC37412t1 abstractC37412t1C;
        AbstractC37401r1 abstractC37401r1I;
        Bundle bundle2;
        Bundle bundle3;
        int i12 = 0;
        switch (this.f47614b) {
            case 0:
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(C23089c.f47617i);
                if (parcelableArrayList == null) {
                    bVarArr = new C23089c.b[0];
                } else {
                    C23089c.b[] bVarArr2 = new C23089c.b[parcelableArrayList.size()];
                    for (int i13 = 0; i13 < parcelableArrayList.size(); i13++) {
                        bVarArr2[i13] = (C23089c.b) C23089c.b.f47635r.fromBundle((Bundle) parcelableArrayList.get(i13));
                    }
                    bVarArr = bVarArr2;
                }
                return new C23089c(bVarArr, bundle.getLong(C23089c.f47618j, 0L), bundle.getLong(C23089c.f47619k, -9223372036854775807L), bundle.getInt(C23089c.f47620l, 0));
            case 1:
                long j12 = bundle.getLong(C23089c.b.f47627j);
                int i14 = bundle.getInt(C23089c.b.f47628k);
                int i15 = bundle.getInt(C23089c.b.f47634q);
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(C23089c.b.f47629l);
                int[] intArray = bundle.getIntArray(C23089c.b.f47630m);
                long[] longArray = bundle.getLongArray(C23089c.b.f47631n);
                long j13 = bundle.getLong(C23089c.b.f47632o);
                boolean z12 = bundle.getBoolean(C23089c.b.f47633p);
                if (intArray == null) {
                    intArray = new int[0];
                }
                return new C23089c.b(j12, i14, i15, intArray, parcelableArrayList2 == null ? new Uri[0] : (Uri[]) parcelableArrayList2.toArray(new Uri[0]), longArray == null ? new long[0] : longArray, j13, z12);
            case 2:
                C23091e c23091e = C23091e.f47644h;
                C23091e.C1816e c1816e = new C23091e.C1816e();
                String str = C23091e.f47645i;
                if (bundle.containsKey(str)) {
                    c1816e.f47658a = bundle.getInt(str);
                }
                String str2 = C23091e.f47646j;
                if (bundle.containsKey(str2)) {
                    c1816e.f47659b = bundle.getInt(str2);
                }
                String str3 = C23091e.f47647k;
                if (bundle.containsKey(str3)) {
                    c1816e.f47660c = bundle.getInt(str3);
                }
                String str4 = C23091e.f47648l;
                if (bundle.containsKey(str4)) {
                    c1816e.f47661d = bundle.getInt(str4);
                }
                String str5 = C23091e.f47649m;
                if (bundle.containsKey(str5)) {
                    c1816e.f47662e = bundle.getInt(str5);
                }
                return c1816e.a();
            case 3:
                return new C23101l(bundle.getInt(C23101l.f47672h, -1), bundle.getInt(C23101l.f47673i, -1), bundle.getInt(C23101l.f47674j, -1), bundle.getByteArray(C23101l.f47675k));
            case 4:
                int i16 = bundle.getInt(C23104o.f47687g, 0);
                int i17 = bundle.getInt(C23104o.f47688h, 0);
                int i18 = bundle.getInt(C23104o.f47689i, 0);
                String string = bundle.getString(C23104o.f47690j);
                C23104o.b bVar = new C23104o.b(i16);
                bVar.f47697b = i17;
                bVar.f47698c = i18;
                if (i16 == 0 && string != null) {
                    z = false;
                }
                C23110a.b(z);
                bVar.f47699d = string;
                return bVar.a();
            case 5:
                C23108t c23108t = C23108t.f47703J;
                C23108t.b bVar2 = new C23108t.b();
                if (bundle != null) {
                    ClassLoader classLoader = C23114e.class.getClassLoader();
                    int i19 = androidx.media3.common.util.M.f47887a;
                    bundle.setClassLoader(classLoader);
                }
                String string2 = bundle.getString(C23108t.f47704K);
                C23108t c23108t2 = C23108t.f47703J;
                String str6 = c23108t2.f47746b;
                if (string2 == null) {
                    string2 = str6;
                }
                bVar2.f47777a = string2;
                String string3 = bundle.getString(C23108t.f47705L);
                if (string3 == null) {
                    string3 = c23108t2.f47747c;
                }
                bVar2.f47778b = string3;
                String string4 = bundle.getString(C23108t.f47706M);
                if (string4 == null) {
                    string4 = c23108t2.f47748d;
                }
                bVar2.f47779c = string4;
                bVar2.f47780d = bundle.getInt(C23108t.f47707N, c23108t2.f47749e);
                bVar2.f47781e = bundle.getInt(C23108t.f47708O, c23108t2.f47750f);
                bVar2.f47782f = bundle.getInt(C23108t.f47709P, c23108t2.f47751g);
                bVar2.f47783g = bundle.getInt(C23108t.f47710Q, c23108t2.f47752h);
                String string5 = bundle.getString(C23108t.f47711R);
                if (string5 == null) {
                    string5 = c23108t2.f47754j;
                }
                bVar2.f47784h = string5;
                Metadata metadata = (Metadata) bundle.getParcelable(C23108t.f47712S);
                if (metadata == null) {
                    metadata = c23108t2.f47755k;
                }
                bVar2.f47785i = metadata;
                String string6 = bundle.getString(C23108t.f47713T);
                if (string6 == null) {
                    string6 = c23108t2.f47756l;
                }
                bVar2.f47786j = string6;
                String string7 = bundle.getString(C23108t.f47714U);
                if (string7 == null) {
                    string7 = c23108t2.f47757m;
                }
                bVar2.f47787k = string7;
                bVar2.f47788l = bundle.getInt(C23108t.f47715V, c23108t2.f47758n);
                ArrayList arrayList = new ArrayList();
                while (true) {
                    byte[] byteArray = bundle.getByteArray(C23108t.f47716W + "_" + Integer.toString(i12, 36));
                    if (byteArray == null) {
                        bVar2.f47789m = arrayList;
                        bVar2.f47790n = (DrmInitData) bundle.getParcelable(C23108t.f47717X);
                        bVar2.f47791o = bundle.getLong(C23108t.f47718Y, c23108t2.f47761q);
                        bVar2.f47792p = bundle.getInt(C23108t.f47719Z, c23108t2.f47762r);
                        bVar2.f47793q = bundle.getInt(C23108t.f47720a0, c23108t2.f47763s);
                        bVar2.f47794r = bundle.getFloat(C23108t.f47721b0, c23108t2.f47764t);
                        bVar2.f47795s = bundle.getInt(C23108t.f47722c0, c23108t2.f47765u);
                        bVar2.f47796t = bundle.getFloat(C23108t.f47723d0, c23108t2.f47766v);
                        bVar2.f47797u = bundle.getByteArray(C23108t.f47724e0);
                        bVar2.f47798v = bundle.getInt(C23108t.f47725f0, c23108t2.f47768x);
                        Bundle bundle4 = bundle.getBundle(C23108t.f47726g0);
                        if (bundle4 != null) {
                            bVar2.f47799w = (C23101l) C23101l.f47676l.fromBundle(bundle4);
                        }
                        bVar2.f47800x = bundle.getInt(C23108t.f47727h0, c23108t2.f47770z);
                        bVar2.f47801y = bundle.getInt(C23108t.f47728i0, c23108t2.f47737A);
                        bVar2.f47802z = bundle.getInt(C23108t.f47729j0, c23108t2.f47738B);
                        bVar2.f47771A = bundle.getInt(C23108t.f47730k0, c23108t2.f47739C);
                        bVar2.f47772B = bundle.getInt(C23108t.f47731l0, c23108t2.f47740D);
                        bVar2.f47773C = bundle.getInt(C23108t.f47732m0, c23108t2.f47741E);
                        bVar2.f47774D = bundle.getInt(C23108t.f47734o0, c23108t2.f47742F);
                        bVar2.f47775E = bundle.getInt(C23108t.f47735p0, c23108t2.f47743G);
                        bVar2.f47776F = bundle.getInt(C23108t.f47733n0, c23108t2.f47744H);
                        return bVar2.a();
                    }
                    arrayList.add(byteArray);
                    i12++;
                }
            case 6:
                String str7 = C23128y.f47965f;
                C23110a.b(bundle.getInt(J.f47263b, -1) == 0);
                return bundle.getBoolean(C23128y.f47965f, false) ? new C23128y(bundle.getBoolean(C23128y.f47966g, false)) : new C23128y();
            case 7:
                String string8 = bundle.getString(z.f47971i, "");
                string8.getClass();
                Bundle bundle5 = bundle.getBundle(z.f47972j);
                z.g gVar = bundle5 == null ? z.g.f48044g : (z.g) z.g.f48050m.fromBundle(bundle5);
                Bundle bundle6 = bundle.getBundle(z.f47973k);
                B b12 = bundle6 == null ? B.f47110J : (B) B.f47144r0.fromBundle(bundle6);
                Bundle bundle7 = bundle.getBundle(z.f47974l);
                z.e eVar = bundle7 == null ? z.e.f48018n : (z.e) z.d.f48007m.fromBundle(bundle7);
                Bundle bundle8 = bundle.getBundle(z.f47975m);
                z.i iVar = bundle8 == null ? z.i.f48077e : (z.i) z.i.f48081i.fromBundle(bundle8);
                Bundle bundle9 = bundle.getBundle(z.f47976n);
                return new z(string8, eVar, bundle9 != null ? (z.h) z.h.f48068q.fromBundle(bundle9) : null, gVar, b12, iVar);
            case 8:
                Uri uri = (Uri) bundle.getParcelable(z.b.f47984c);
                uri.getClass();
                z.b.a aVar = new z.b.a();
                aVar.f47987a = uri;
                return new z.b(aVar, null);
            case 9:
                z.e eVar2 = z.d.f48001g;
                z.d.a aVar2 = new z.d.a();
                z.e eVar3 = z.d.f48001g;
                long j14 = bundle.getLong(z.d.f48002h, eVar3.f48008b);
                C23110a.b(j14 >= 0);
                aVar2.f48013a = j14;
                long j15 = bundle.getLong(z.d.f48003i, eVar3.f48009c);
                if (j15 != Long.MIN_VALUE && j15 < 0) {
                    z = false;
                }
                C23110a.b(z);
                aVar2.f48014b = j15;
                aVar2.f48015c = bundle.getBoolean(z.d.f48004j, eVar3.f48010d);
                aVar2.f48016d = bundle.getBoolean(z.d.f48005k, eVar3.f48011e);
                aVar2.f48017e = bundle.getBoolean(z.d.f48006l, eVar3.f48012f);
                return new z.e(aVar2, null);
            case 10:
                String string9 = bundle.getString(z.f.f48019j);
                string9.getClass();
                UUID uuidFromString = UUID.fromString(string9);
                Uri uri2 = (Uri) bundle.getParcelable(z.f.f48020k);
                Bundle bundle10 = Bundle.EMPTY;
                Bundle bundle11 = bundle.getBundle(z.f.f48021l);
                if (bundle11 == null) {
                    bundle11 = bundle10;
                }
                if (bundle11 == bundle10) {
                    abstractC37412t1C = AbstractC37412t1.n();
                } else {
                    HashMap map = new HashMap();
                    if (bundle11 != bundle10) {
                        for (String str8 : bundle11.keySet()) {
                            String string10 = bundle11.getString(str8);
                            if (string10 != null) {
                                map.put(str8, string10);
                            }
                        }
                    }
                    abstractC37412t1C = AbstractC37412t1.c(map);
                }
                boolean z13 = bundle.getBoolean(z.f.f48022m, false);
                boolean z14 = bundle.getBoolean(z.f.f48023n, false);
                boolean z15 = bundle.getBoolean(z.f.f48024o, false);
                ArrayList<Integer> arrayList2 = new ArrayList<>();
                ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(z.f.f48025p);
                if (integerArrayList != null) {
                    arrayList2 = integerArrayList;
                }
                AbstractC37401r1 abstractC37401r1V = AbstractC37401r1.v(arrayList2);
                byte[] byteArray2 = bundle.getByteArray(z.f.f48026q);
                z.f.a aVar3 = new z.f.a();
                aVar3.f48036a = uuidFromString;
                aVar3.f48038c = AbstractC37412t1.n();
                aVar3.f48042g = AbstractC37401r1.C();
                aVar3.f48037b = uri2;
                aVar3.f48038c = AbstractC37412t1.c(abstractC37412t1C);
                aVar3.f48039d = z13;
                aVar3.f48041f = z15;
                aVar3.f48040e = z14;
                aVar3.f48042g = AbstractC37401r1.v(abstractC37401r1V);
                aVar3.f48043h = byteArray2 != null ? Arrays.copyOf(byteArray2, byteArray2.length) : null;
                return new z.f(aVar3, null);
            case 11:
                z.g gVar2 = z.g.f48044g;
                return new z.g(bundle.getLong(z.g.f48045h, gVar2.f48051b), bundle.getLong(z.g.f48046i, gVar2.f48052c), bundle.getLong(z.g.f48047j, gVar2.f48053d), bundle.getFloat(z.g.f48048k, gVar2.f48054e), bundle.getFloat(z.g.f48049l, gVar2.f48055f));
            case 12:
                Bundle bundle12 = bundle.getBundle(z.h.f48063l);
                z.f fVar = bundle12 == null ? null : (z.f) z.f.f48027r.fromBundle(bundle12);
                Bundle bundle13 = bundle.getBundle(z.h.f48064m);
                z.b bVar3 = bundle13 != null ? (z.b) z.b.f47985d.fromBundle(bundle13) : null;
                ArrayList parcelableArrayList3 = bundle.getParcelableArrayList(z.h.f48065n);
                if (parcelableArrayList3 == null) {
                    abstractC37401r1I = AbstractC37401r1.C();
                } else {
                    O4<Object> o42 = AbstractC37401r1.f359977c;
                    AbstractC37401r1.a aVar4 = new AbstractC37401r1.a();
                    for (int i22 = 0; i22 < parcelableArrayList3.size(); i22++) {
                        Bundle bundle14 = (Bundle) parcelableArrayList3.get(i22);
                        bundle14.getClass();
                        aVar4.g(new StreamKey(bundle14.getInt(StreamKey.f47445e, 0), bundle14.getInt(StreamKey.f47446f, 0), bundle14.getInt(StreamKey.f47447g, 0)));
                    }
                    abstractC37401r1I = aVar4.i();
                }
                AbstractC37401r1 abstractC37401r1 = abstractC37401r1I;
                ArrayList parcelableArrayList4 = bundle.getParcelableArrayList(z.h.f48067p);
                AbstractC37401r1 abstractC37401r1C = parcelableArrayList4 == null ? AbstractC37401r1.C() : C23114e.a(z.k.f48095p, parcelableArrayList4);
                Uri uri3 = (Uri) bundle.getParcelable(z.h.f48061j);
                uri3.getClass();
                return new z.h(uri3, bundle.getString(z.h.f48062k), fVar, bVar3, abstractC37401r1, bundle.getString(z.h.f48066o), abstractC37401r1C, null);
            case 13:
                z.i iVar2 = z.i.f48077e;
                z.i.a aVar5 = new z.i.a();
                aVar5.f48085a = (Uri) bundle.getParcelable(z.i.f48078f);
                aVar5.f48086b = bundle.getString(z.i.f48079g);
                aVar5.f48087c = bundle.getBundle(z.i.f48080h);
                return aVar5.a();
            case 14:
                Uri uri4 = (Uri) bundle.getParcelable(z.k.f48088i);
                uri4.getClass();
                String string11 = bundle.getString(z.k.f48089j);
                String string12 = bundle.getString(z.k.f48090k);
                int i23 = bundle.getInt(z.k.f48091l, 0);
                int i24 = bundle.getInt(z.k.f48092m, 0);
                String string13 = bundle.getString(z.k.f48093n);
                String string14 = bundle.getString(z.k.f48094o);
                z.k.a aVar6 = new z.k.a();
                aVar6.f48103a = uri4;
                aVar6.f48104b = string11;
                aVar6.f48105c = string12;
                aVar6.f48106d = i23;
                aVar6.f48107e = i24;
                aVar6.f48108f = string13;
                aVar6.f48109g = string14;
                return new z.k(aVar6, null);
            case 15:
                B b13 = B.f47110J;
                B.b bVar4 = new B.b();
                bVar4.f47186a = bundle.getCharSequence(B.f47111K);
                bVar4.f47187b = bundle.getCharSequence(B.f47112L);
                bVar4.f47188c = bundle.getCharSequence(B.f47113M);
                bVar4.f47189d = bundle.getCharSequence(B.f47114N);
                bVar4.f47190e = bundle.getCharSequence(B.f47115O);
                bVar4.f47191f = bundle.getCharSequence(B.f47116P);
                bVar4.f47192g = bundle.getCharSequence(B.f47117Q);
                byte[] byteArray3 = bundle.getByteArray(B.f47120T);
                String str9 = B.f47139m0;
                bVar4.d(byteArray3, bundle.containsKey(str9) ? Integer.valueOf(bundle.getInt(str9)) : null);
                bVar4.f47197l = (Uri) bundle.getParcelable(B.f47121U);
                bVar4.f47209x = bundle.getCharSequence(B.f47132f0);
                bVar4.f47210y = bundle.getCharSequence(B.f47133g0);
                bVar4.f47211z = bundle.getCharSequence(B.f47134h0);
                bVar4.f47181C = bundle.getCharSequence(B.f47137k0);
                bVar4.f47182D = bundle.getCharSequence(B.f47138l0);
                bVar4.f47183E = bundle.getCharSequence(B.f47140n0);
                bVar4.f47185G = bundle.getBundle(B.f47143q0);
                String str10 = B.f47118R;
                if (bundle.containsKey(str10) && (bundle3 = bundle.getBundle(str10)) != null) {
                    bVar4.f47193h = (J) J.f47264c.fromBundle(bundle3);
                }
                String str11 = B.f47119S;
                if (bundle.containsKey(str11) && (bundle2 = bundle.getBundle(str11)) != null) {
                    bVar4.f47194i = (J) J.f47264c.fromBundle(bundle2);
                }
                String str12 = B.f47122V;
                if (bundle.containsKey(str12)) {
                    bVar4.f47198m = Integer.valueOf(bundle.getInt(str12));
                }
                String str13 = B.f47123W;
                if (bundle.containsKey(str13)) {
                    bVar4.f47199n = Integer.valueOf(bundle.getInt(str13));
                }
                String str14 = B.f47124X;
                if (bundle.containsKey(str14)) {
                    bVar4.f47200o = Integer.valueOf(bundle.getInt(str14));
                }
                String str15 = B.f47142p0;
                if (bundle.containsKey(str15)) {
                    bVar4.f47201p = Boolean.valueOf(bundle.getBoolean(str15));
                }
                String str16 = B.f47125Y;
                if (bundle.containsKey(str16)) {
                    bVar4.f47202q = Boolean.valueOf(bundle.getBoolean(str16));
                }
                String str17 = B.f47126Z;
                if (bundle.containsKey(str17)) {
                    bVar4.f47203r = Integer.valueOf(bundle.getInt(str17));
                }
                String str18 = B.f47127a0;
                if (bundle.containsKey(str18)) {
                    bVar4.f47204s = Integer.valueOf(bundle.getInt(str18));
                }
                String str19 = B.f47128b0;
                if (bundle.containsKey(str19)) {
                    bVar4.f47205t = Integer.valueOf(bundle.getInt(str19));
                }
                String str20 = B.f47129c0;
                if (bundle.containsKey(str20)) {
                    bVar4.f47206u = Integer.valueOf(bundle.getInt(str20));
                }
                String str21 = B.f47130d0;
                if (bundle.containsKey(str21)) {
                    bVar4.f47207v = Integer.valueOf(bundle.getInt(str21));
                }
                String str22 = B.f47131e0;
                if (bundle.containsKey(str22)) {
                    bVar4.f47208w = Integer.valueOf(bundle.getInt(str22));
                }
                String str23 = B.f47135i0;
                if (bundle.containsKey(str23)) {
                    bVar4.f47179A = Integer.valueOf(bundle.getInt(str23));
                }
                String str24 = B.f47136j0;
                if (bundle.containsKey(str24)) {
                    bVar4.f47180B = Integer.valueOf(bundle.getInt(str24));
                }
                String str25 = B.f47141o0;
                if (bundle.containsKey(str25)) {
                    bVar4.f47184F = Integer.valueOf(bundle.getInt(str25));
                }
                return bVar4.a();
            case 16:
            default:
                ArrayList parcelableArrayList5 = bundle.getParcelableArrayList(Q.f47436g);
                return new Q(bundle.getString(Q.f47437h, ""), (C23108t[]) (parcelableArrayList5 == null ? AbstractC37401r1.C() : C23114e.a(C23108t.f47736q0, parcelableArrayList5)).toArray(new C23108t[0]));
            case 17:
                String str26 = F.f47229e;
                C23110a.b(bundle.getInt(J.f47263b, -1) == 1);
                float f12 = bundle.getFloat(F.f47229e, -1.0f);
                return f12 == -1.0f ? new F() : new F(f12);
            case 18:
                return new PlaybackException(bundle);
            case 19:
                return new G(bundle.getFloat(G.f47233f, 1.0f), bundle.getFloat(G.f47234g, 1.0f));
            case 20:
                ArrayList<Integer> integerArrayList2 = bundle.getIntegerArrayList(H.c.f47240d);
                if (integerArrayList2 == null) {
                    return H.c.f47239c;
                }
                H.c.a aVar7 = new H.c.a();
                while (i12 < integerArrayList2.size()) {
                    aVar7.a(integerArrayList2.get(i12).intValue());
                    i12++;
                }
                return aVar7.c();
            case 21:
                int i25 = bundle.getInt(H.k.f47246k, 0);
                Bundle bundle15 = bundle.getBundle(H.k.f47247l);
                return new H.k(null, i25, bundle15 != null ? (z) z.f47977o.fromBundle(bundle15) : null, null, bundle.getInt(H.k.f47248m, 0), bundle.getLong(H.k.f47249n, 0L), bundle.getLong(H.k.f47250o, 0L), bundle.getInt(H.k.f47251p, -1), bundle.getInt(H.k.f47252q, -1));
            case 22:
                int i26 = bundle.getInt(J.f47263b, -1);
                if (i26 == 0) {
                    return (J) C23128y.f47967h.fromBundle(bundle);
                }
                if (i26 == 1) {
                    return (J) F.f47230f.fromBundle(bundle);
                }
                if (i26 == 2) {
                    return (J) M.f47358h.fromBundle(bundle);
                }
                if (i26 == 3) {
                    return (J) O.f47365h.fromBundle(bundle);
                }
                throw new IllegalArgumentException(AK.c.g(i26, "Unknown RatingType: "));
            case 23:
                String str27 = M.f47356f;
                C23110a.b(bundle.getInt(J.f47263b, -1) == 2);
                int i27 = bundle.getInt(M.f47356f, 5);
                float f13 = bundle.getFloat(M.f47357g, -1.0f);
                return f13 == -1.0f ? new M(i27) : new M(i27, f13);
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                String str28 = O.f47363f;
                C23110a.b(bundle.getInt(J.f47263b, -1) == 3);
                return bundle.getBoolean(O.f47363f, false) ? new O(bundle.getBoolean(O.f47364g, false)) : new O();
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                P p12 = P.f47368b;
                AbstractC37401r1 abstractC37401r1A = P.a(P.d.f47398I, C23113d.a(bundle, P.f47369c));
                AbstractC37401r1 abstractC37401r1A2 = P.a(P.b.f47378n, C23113d.a(bundle, P.f47370d));
                int[] intArray2 = bundle.getIntArray(P.f47371e);
                if (intArray2 == null) {
                    int size = abstractC37401r1A.size();
                    int[] iArr = new int[size];
                    while (i12 < size) {
                        iArr[i12] = i12;
                        i12++;
                    }
                    intArray2 = iArr;
                }
                return new P.c(abstractC37401r1A, abstractC37401r1A2, intArray2);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                int i28 = bundle.getInt(P.b.f47373i, 0);
                long j16 = bundle.getLong(P.b.f47374j, -9223372036854775807L);
                long j17 = bundle.getLong(P.b.f47375k, 0L);
                boolean z16 = bundle.getBoolean(P.b.f47376l, false);
                Bundle bundle16 = bundle.getBundle(P.b.f47377m);
                C23089c c23089c = bundle16 != null ? (C23089c) C23089c.f47621m.fromBundle(bundle16) : C23089c.f47615g;
                P.b bVar5 = new P.b();
                bVar5.p(null, null, i28, j16, j17, c23089c, z16);
                return bVar5;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Bundle bundle17 = bundle.getBundle(P.d.f47402v);
                z zVar = bundle17 != null ? (z) z.f47977o.fromBundle(bundle17) : z.f47970h;
                long j18 = bundle.getLong(P.d.f47403w, -9223372036854775807L);
                long j19 = bundle.getLong(P.d.f47404x, -9223372036854775807L);
                long j22 = bundle.getLong(P.d.f47405y, -9223372036854775807L);
                boolean z17 = bundle.getBoolean(P.d.f47406z, false);
                boolean z18 = bundle.getBoolean(P.d.f47390A, false);
                Bundle bundle18 = bundle.getBundle(P.d.f47391B);
                z.g gVar3 = bundle18 != null ? (z.g) z.g.f48050m.fromBundle(bundle18) : null;
                boolean z19 = bundle.getBoolean(P.d.f47392C, false);
                long j23 = bundle.getLong(P.d.f47393D, 0L);
                long j24 = bundle.getLong(P.d.f47394E, -9223372036854775807L);
                int i29 = bundle.getInt(P.d.f47395F, 0);
                int i32 = bundle.getInt(P.d.f47396G, 0);
                long j25 = bundle.getLong(P.d.f47397H, 0L);
                P.d dVar = new P.d();
                dVar.b(P.d.f47400t, zVar, null, j18, j19, j22, z17, z18, gVar3, j23, j24, i29, i32, j25);
                dVar.f47418m = z19;
                return dVar;
        }
    }
}
