package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes.dex */
public final class k09 {
    public static final k09 g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public final String a;
    public final a09 b;
    public final yz8 c;
    public final w19 d;
    public final sz8 e;
    public final d09 f;

    static {
        oz8 oz8Var = new oz8();
        t76 t76Var = wg7.b;
        zjd zjdVar = zjd.o;
        List list = Collections.EMPTY_LIST;
        zjd zjdVar2 = zjd.o;
        wz8 wz8Var = new wz8();
        g = new k09("", new sz8(oz8Var), null, new yz8(wz8Var), w19.K, d09.d);
        h = Integer.toString(0, 36);
        i = Integer.toString(1, 36);
        j = Integer.toString(2, 36);
        k = Integer.toString(3, 36);
        l = Integer.toString(4, 36);
        m = Integer.toString(5, 36);
    }

    public k09(String str, sz8 sz8Var, a09 a09Var, yz8 yz8Var, w19 w19Var, d09 d09Var) {
        this.a = str;
        this.b = a09Var;
        this.c = yz8Var;
        this.d = w19Var;
        this.e = sz8Var;
        this.f = d09Var;
    }

    public static k09 b(Bundle bundle) {
        sz8 sz8Var;
        d09 d09Var;
        Map mapA;
        vz8 vz8Var;
        lz8 lz8Var;
        zjd zjdVarI;
        zjd zjdVarV;
        a09 a09Var;
        String string = bundle.getString(h, "");
        string.getClass();
        Bundle bundle2 = bundle.getBundle(i);
        yz8 yz8VarB = bundle2 == null ? yz8.f : yz8.b(bundle2);
        Bundle bundle3 = bundle.getBundle(j);
        w19 w19VarB = bundle3 == null ? w19.K : w19.b(bundle3);
        Bundle bundle4 = bundle.getBundle(k);
        if (bundle4 == null) {
            sz8Var = sz8.r;
        } else {
            oz8 oz8Var = new oz8();
            String str = qz8.j;
            qz8 qz8Var = qz8.i;
            long j2 = qz8Var.a;
            long j3 = qz8Var.d;
            long j4 = qz8Var.b;
            oz8Var.b(zxg.U(bundle4.getLong(str, j2)));
            oz8Var.a(zxg.U(bundle4.getLong(qz8.k, qz8Var.c)));
            oz8Var.c = bundle4.getBoolean(qz8.l, qz8Var.e);
            oz8Var.d = bundle4.getBoolean(qz8.m, qz8Var.f);
            oz8Var.e = bundle4.getBoolean(qz8.n, qz8Var.g);
            oz8Var.f = bundle4.getBoolean(qz8.q, qz8Var.h);
            long j5 = bundle4.getLong(qz8.o, j4);
            if (j5 != j4) {
                oz8Var.b(j5);
            }
            long j6 = bundle4.getLong(qz8.p, j3);
            if (j6 != j3) {
                oz8Var.a(j6);
            }
            sz8Var = new sz8(oz8Var);
        }
        sz8 sz8Var2 = sz8Var;
        Bundle bundle5 = bundle.getBundle(l);
        if (bundle5 == null) {
            d09Var = d09.d;
        } else {
            u5i u5iVar = new u5i();
            u5iVar.a = (Uri) bundle5.getParcelable(d09.e);
            u5iVar.b = bundle5.getString(d09.f);
            u5iVar.c = bundle5.getBundle(d09.g);
            d09Var = new d09(u5iVar);
        }
        d09 d09Var2 = d09Var;
        Bundle bundle6 = bundle.getBundle(m);
        if (bundle6 == null) {
            a09Var = null;
        } else {
            Bundle bundle7 = bundle6.getBundle(a09.k);
            boolean z = false;
            if (bundle7 == null) {
                vz8Var = null;
            } else {
                String string2 = bundle7.getString(vz8.i);
                string2.getClass();
                UUID uuidFromString = UUID.fromString(string2);
                Uri uri = (Uri) bundle7.getParcelable(vz8.j);
                String str2 = vz8.k;
                Bundle bundle8 = Bundle.EMPTY;
                Bundle bundle9 = bundle7.getBundle(str2);
                if (bundle9 == null) {
                    bundle9 = bundle8;
                }
                if (bundle9 == bundle8) {
                    mapA = ekd.Y;
                } else {
                    HashMap map = new HashMap();
                    if (bundle9 != bundle8) {
                        for (String str3 : bundle9.keySet()) {
                            String string3 = bundle9.getString(str3);
                            if (string3 != null) {
                                map.put(str3, string3);
                            }
                        }
                    }
                    mapA = ah7.a(map);
                }
                boolean z2 = bundle7.getBoolean(vz8.l, false);
                boolean z3 = bundle7.getBoolean(vz8.m, false);
                boolean z4 = bundle7.getBoolean(vz8.n, false);
                String str4 = vz8.o;
                ArrayList<Integer> arrayList = new ArrayList<>();
                ArrayList<Integer> integerArrayList = bundle7.getIntegerArrayList(str4);
                if (integerArrayList != null) {
                    arrayList = integerArrayList;
                }
                wg7 wg7VarJ = wg7.j(arrayList);
                byte[] byteArray = bundle7.getByteArray(vz8.p);
                uz8 uz8Var = new uz8();
                uz8Var.a = uuidFromString;
                uz8Var.b = uri;
                uz8Var.c = ah7.a(mapA);
                uz8Var.d = z2;
                uz8Var.f = z4;
                uz8Var.e = z3;
                uz8Var.g = wg7.j(wg7VarJ);
                uz8Var.h = byteArray != null ? Arrays.copyOf(byteArray, byteArray.length) : null;
                vz8Var = new vz8(uz8Var);
            }
            Bundle bundle10 = bundle6.getBundle(a09.l);
            if (bundle10 == null) {
                lz8Var = null;
            } else {
                Uri uri2 = (Uri) bundle10.getParcelable(lz8.b);
                uri2.getClass();
                usd usdVar = new usd(24, z);
                usdVar.b = uri2;
                lz8Var = new lz8(usdVar);
            }
            ArrayList parcelableArrayList = bundle6.getParcelableArrayList(a09.m);
            if (parcelableArrayList == null) {
                t76 t76Var = wg7.b;
                zjdVarI = zjd.o;
            } else {
                tg7 tg7VarI = wg7.i();
                int i2 = 0;
                while (i2 < parcelableArrayList.size()) {
                    Bundle bundle11 = (Bundle) parcelableArrayList.get(i2);
                    bundle11.getClass();
                    tg7VarI.a(new ilf(bundle11.getInt(ilf.d, 0), bundle11.getInt(ilf.o, 0), bundle11.getInt(ilf.X, 0)));
                    i2++;
                    parcelableArrayList = parcelableArrayList;
                }
                zjdVarI = tg7VarI.i();
            }
            zjd zjdVar = zjdVarI;
            ArrayList parcelableArrayList2 = bundle6.getParcelableArrayList(a09.o);
            if (parcelableArrayList2 == null) {
                t76 t76Var2 = wg7.b;
                zjdVarV = zjd.o;
            } else {
                zjdVarV = gw0.v(new zz8(2), parcelableArrayList2);
            }
            zjd zjdVar2 = zjdVarV;
            long j7 = bundle6.getLong(a09.p, -9223372036854775807L);
            Uri uri3 = (Uri) bundle6.getParcelable(a09.i);
            uri3.getClass();
            a09Var = new a09(uri3, bundle6.getString(a09.j), vz8Var, lz8Var, zjdVar, bundle6.getString(a09.n), zjdVar2, j7);
        }
        return new k09(string, sz8Var2, a09Var, yz8VarB, w19VarB, d09Var2);
    }

    public static k09 c(Uri uri) {
        a09 a09Var;
        oz8 oz8Var = new oz8();
        uz8 uz8Var = new uz8();
        List list = Collections.EMPTY_LIST;
        zjd zjdVar = zjd.o;
        wz8 wz8Var = new wz8();
        d09 d09Var = d09.d;
        hsi.g(uz8Var.b == null || uz8Var.a != null);
        vz8 vz8Var = null;
        if (uri != null) {
            if (uz8Var.a != null) {
                vz8Var = new vz8(uz8Var);
            }
            a09Var = new a09(uri, null, vz8Var, null, list, null, zjdVar, -9223372036854775807L);
        } else {
            a09Var = null;
        }
        return new k09("", new sz8(oz8Var), a09Var, new yz8(wz8Var), w19.K, d09Var);
    }

    public final mz8 a() {
        uz8 uz8Var;
        mz8 mz8Var = new mz8();
        mz8Var.d = new oz8();
        mz8Var.e = new uz8();
        mz8Var.f = Collections.EMPTY_LIST;
        mz8Var.h = zjd.o;
        mz8Var.l = new wz8();
        mz8Var.m = d09.d;
        mz8Var.j = -9223372036854775807L;
        mz8Var.d = this.e.a();
        mz8Var.a = this.a;
        mz8Var.k = this.d;
        mz8Var.l = this.c.a();
        mz8Var.m = this.f;
        a09 a09Var = this.b;
        if (a09Var != null) {
            mz8Var.g = a09Var.f;
            mz8Var.c = a09Var.b;
            mz8Var.b = a09Var.a;
            mz8Var.f = a09Var.e;
            mz8Var.h = a09Var.g;
            vz8 vz8Var = a09Var.c;
            if (vz8Var != null) {
                uz8Var = new uz8();
                uz8Var.a = vz8Var.a;
                uz8Var.b = vz8Var.b;
                uz8Var.c = vz8Var.c;
                uz8Var.d = vz8Var.d;
                uz8Var.e = vz8Var.e;
                uz8Var.f = vz8Var.f;
                uz8Var.g = vz8Var.g;
                uz8Var.h = vz8Var.h;
            } else {
                uz8Var = new uz8();
            }
            mz8Var.e = uz8Var;
            mz8Var.i = a09Var.d;
            mz8Var.j = a09Var.h;
        }
        return mz8Var;
    }

    public final Bundle d(boolean z) {
        a09 a09Var;
        Bundle bundle = new Bundle();
        String str = this.a;
        if (!str.equals("")) {
            bundle.putString(h, str);
        }
        yz8 yz8Var = yz8.f;
        yz8 yz8Var2 = this.c;
        if (!yz8Var2.equals(yz8Var)) {
            bundle.putBundle(i, yz8Var2.c());
        }
        w19 w19Var = w19.K;
        w19 w19Var2 = this.d;
        if (!w19Var2.equals(w19Var)) {
            bundle.putBundle(j, w19Var2.c());
        }
        qz8 qz8Var = qz8.i;
        sz8 sz8Var = this.e;
        if (!sz8Var.equals(qz8Var)) {
            Bundle bundle2 = new Bundle();
            long j2 = sz8Var.a;
            if (j2 != qz8Var.a) {
                bundle2.putLong(qz8.j, j2);
            }
            long j3 = sz8Var.c;
            if (j3 != qz8Var.c) {
                bundle2.putLong(qz8.k, j3);
            }
            long j4 = sz8Var.b;
            if (j4 != qz8Var.b) {
                bundle2.putLong(qz8.o, j4);
            }
            long j5 = sz8Var.d;
            if (j5 != qz8Var.d) {
                bundle2.putLong(qz8.p, j5);
            }
            boolean z2 = sz8Var.e;
            if (z2 != qz8Var.e) {
                bundle2.putBoolean(qz8.l, z2);
            }
            boolean z3 = sz8Var.f;
            if (z3 != qz8Var.f) {
                bundle2.putBoolean(qz8.m, z3);
            }
            boolean z4 = sz8Var.g;
            if (z4 != qz8Var.g) {
                bundle2.putBoolean(qz8.n, z4);
            }
            boolean z5 = sz8Var.h;
            if (z5 != qz8Var.h) {
                bundle2.putBoolean(qz8.q, z5);
            }
            bundle.putBundle(k, bundle2);
        }
        d09 d09Var = d09.d;
        d09 d09Var2 = this.f;
        if (!d09Var2.equals(d09Var)) {
            Bundle bundle3 = new Bundle();
            Uri uri = d09Var2.a;
            if (uri != null) {
                bundle3.putParcelable(d09.e, uri);
            }
            String str2 = d09Var2.b;
            if (str2 != null) {
                bundle3.putString(d09.f, str2);
            }
            Bundle bundle4 = d09Var2.c;
            if (bundle4 != null) {
                bundle3.putBundle(d09.g, bundle4);
            }
            bundle.putBundle(l, bundle3);
        }
        if (z && (a09Var = this.b) != null) {
            wg7 wg7Var = a09Var.g;
            List list = a09Var.e;
            Bundle bundle5 = new Bundle();
            bundle5.putParcelable(a09.i, a09Var.a);
            String str3 = a09Var.b;
            if (str3 != null) {
                bundle5.putString(a09.j, str3);
            }
            vz8 vz8Var = a09Var.c;
            if (vz8Var != null) {
                String str4 = a09.k;
                wg7 wg7Var2 = vz8Var.g;
                ah7 ah7Var = vz8Var.c;
                Bundle bundle6 = new Bundle();
                bundle6.putString(vz8.i, vz8Var.a.toString());
                Uri uri2 = vz8Var.b;
                if (uri2 != null) {
                    bundle6.putParcelable(vz8.j, uri2);
                }
                if (!ah7Var.isEmpty()) {
                    String str5 = vz8.k;
                    Bundle bundle7 = new Bundle();
                    for (Map.Entry entry : ah7Var.entrySet()) {
                        bundle7.putString((String) entry.getKey(), (String) entry.getValue());
                    }
                    bundle6.putBundle(str5, bundle7);
                }
                boolean z6 = vz8Var.d;
                if (z6) {
                    bundle6.putBoolean(vz8.l, z6);
                }
                boolean z7 = vz8Var.e;
                if (z7) {
                    bundle6.putBoolean(vz8.m, z7);
                }
                boolean z8 = vz8Var.f;
                if (z8) {
                    bundle6.putBoolean(vz8.n, z8);
                }
                if (!wg7Var2.isEmpty()) {
                    bundle6.putIntegerArrayList(vz8.o, new ArrayList<>(wg7Var2));
                }
                byte[] bArr = vz8Var.h;
                if (bArr != null) {
                    bundle6.putByteArray(vz8.p, bArr);
                }
                bundle5.putBundle(str4, bundle6);
            }
            lz8 lz8Var = a09Var.d;
            if (lz8Var != null) {
                String str6 = a09.l;
                Bundle bundle8 = new Bundle();
                bundle8.putParcelable(lz8.b, lz8Var.a);
                bundle5.putBundle(str6, bundle8);
            }
            if (!list.isEmpty()) {
                bundle5.putParcelableArrayList(a09.m, gw0.D(list, new zz8(0)));
            }
            String str7 = a09Var.f;
            if (str7 != null) {
                bundle5.putString(a09.n, str7);
            }
            if (!wg7Var.isEmpty()) {
                bundle5.putParcelableArrayList(a09.o, gw0.D(wg7Var, new zz8(1)));
            }
            long j6 = a09Var.h;
            if (j6 != -9223372036854775807L) {
                bundle5.putLong(a09.p, j6);
            }
            bundle.putBundle(m, bundle5);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k09)) {
            return false;
        }
        k09 k09Var = (k09) obj;
        return Objects.equals(this.a, k09Var.a) && this.e.equals(k09Var.e) && Objects.equals(this.b, k09Var.b) && Objects.equals(this.c, k09Var.c) && Objects.equals(this.d, k09Var.d) && Objects.equals(this.f, k09Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        a09 a09Var = this.b;
        return this.f.hashCode() + ((this.d.hashCode() + ((this.e.hashCode() + ((this.c.hashCode() + ((iHashCode + (a09Var != null ? a09Var.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }
}
