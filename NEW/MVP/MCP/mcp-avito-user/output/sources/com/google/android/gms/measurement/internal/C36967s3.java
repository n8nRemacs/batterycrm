package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.collection.C20199a;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.util.InterfaceC36753g;
import com.google.android.gms.internal.measurement.zzns;
import com.google.android.gms.internal.measurement.zzoj;
import com.google.android.gms.internal.measurement.zzok;
import com.google.android.gms.internal.measurement.zzph;
import com.google.android.gms.internal.measurement.zzpt;
import com.google.android.gms.measurement.internal.zzif;
import com.google.common.util.concurrent.C37568u0;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: com.google.android.gms.measurement.internal.s3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36967s3 extends AbstractC36847b1 {

    /* renamed from: c, reason: collision with root package name */
    @j.k0
    public C36857c4 f355362c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC36940o3 f355363d;

    /* renamed from: e, reason: collision with root package name */
    public final CopyOnWriteArraySet f355364e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f355365f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReference<String> f355366g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f355367h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f355368i;

    /* renamed from: j, reason: collision with root package name */
    public PriorityQueue<zzmh> f355369j;

    /* renamed from: k, reason: collision with root package name */
    @j.B
    public zzif f355370k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicLong f355371l;

    /* renamed from: m, reason: collision with root package name */
    public long f355372m;

    /* renamed from: n, reason: collision with root package name */
    public final Q5 f355373n;

    /* renamed from: o, reason: collision with root package name */
    @j.k0
    public boolean f355374o;

    /* renamed from: p, reason: collision with root package name */
    public M3 f355375p;

    /* renamed from: q, reason: collision with root package name */
    public A3 f355376q;

    /* renamed from: r, reason: collision with root package name */
    public I3 f355377r;

    /* renamed from: s, reason: collision with root package name */
    public final U3 f355378s;

    public C36967s3(I2 i22) {
        super(i22);
        this.f355364e = new CopyOnWriteArraySet();
        this.f355367h = new Object();
        this.f355368i = false;
        this.f355374o = true;
        this.f355378s = new U3(this);
        this.f355366g = new AtomicReference<>();
        this.f355370k = zzif.f355542c;
        this.f355372m = -1L;
        this.f355371l = new AtomicLong(0L);
        this.f355373n = new Q5(i22);
    }

    public static void x(C36967s3 c36967s3, zzif zzifVar, long j12, boolean z12, boolean z13) {
        super.e();
        c36967s3.i();
        zzif zzifVarO = super.b().o();
        long j13 = c36967s3.f355372m;
        int i12 = zzifVar.f355544b;
        if (j12 <= j13 && zzifVarO.f355544b <= i12) {
            super.zzj().f354895l.c("Dropped out-of-date consent setting, proposed settings", zzifVar);
            return;
        }
        C36876f2 c36876f2B = super.b();
        c36876f2B.e();
        if (!c36876f2B.i(i12)) {
            S1 s1Zzj = super.zzj();
            s1Zzj.f354895l.c("Lower precedence consent source ignored, proposed source", Integer.valueOf(i12));
            return;
        }
        SharedPreferences.Editor editorEdit = c36876f2B.m().edit();
        editorEdit.putString("consent_settings", zzifVar.i());
        editorEdit.putInt("consent_source", i12);
        editorEdit.apply();
        c36967s3.f355372m = j12;
        I2 i22 = c36967s3.f355183a;
        i22.n().C(z12);
        if (z13) {
            i22.n().y(new AtomicReference<>());
        }
    }

    public static void y(C36967s3 c36967s3, zzif zzifVar, zzif zzifVar2) {
        zzif.zza zzaVar = zzif.zza.ANALYTICS_STORAGE;
        zzif.zza zzaVar2 = zzif.zza.AD_STORAGE;
        zzif.zza[] zzaVarArr = {zzaVar, zzaVar2};
        boolean z12 = false;
        int i12 = 0;
        while (true) {
            if (i12 >= 2) {
                break;
            }
            zzif.zza zzaVar3 = zzaVarArr[i12];
            if (!zzifVar2.e(zzaVar3) && zzifVar.e(zzaVar3)) {
                z12 = true;
                break;
            }
            i12++;
        }
        boolean zH2 = zzifVar.h(zzifVar2, zzaVar, zzaVar2);
        if (z12 || zH2) {
            c36967s3.f355183a.k().o();
        }
    }

    @j.l0
    public final void A(Boolean bool, boolean z12) {
        super.e();
        i();
        super.zzj().f354896m.c("Setting app measurement enabled (FE)", bool);
        C36876f2 c36876f2B = super.b();
        c36876f2B.e();
        SharedPreferences.Editor editorEdit = c36876f2B.m().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled");
        }
        editorEdit.apply();
        if (z12) {
            C36876f2 c36876f2B2 = super.b();
            c36876f2B2.e();
            SharedPreferences.Editor editorEdit2 = c36876f2B2.m().edit();
            if (bool != null) {
                editorEdit2.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                editorEdit2.remove("measurement_enabled_from_api");
            }
            editorEdit2.apply();
        }
        I2 i22 = this.f355183a;
        A2 a22 = i22.f354718j;
        I2.c(a22);
        a22.e();
        if (i22.f354704D || !(bool == null || bool.booleanValue())) {
            Y();
        }
    }

    public final void B(String str) {
        this.f355366g.set(str);
    }

    @j.l0
    public final void C(String str, String str2, long j12, Bundle bundle, boolean z12, boolean z13, boolean z14) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        com.google.android.gms.common.util.k kVar;
        C36880g c36880g;
        boolean z15;
        String str3;
        String str4;
        I2 i22;
        long j13;
        I2 i23;
        Bundle[] bundleArr;
        String str5;
        String str6 = str;
        C36729v.f(str);
        C36729v.j(bundle);
        super.e();
        i();
        I2 i24 = this.f355183a;
        if (!i24.e()) {
            super.zzj().f354896m.b("Event not sent since app measurement is disabled");
            return;
        }
        List<String> list = i24.k().f354793i;
        if (list != null && !list.contains(str2)) {
            super.zzj().f354896m.a(str2, "Dropping non-safelisted event. event name, origin", str6);
            return;
        }
        if (!this.f355365f) {
            this.f355365f = true;
            try {
                boolean z16 = i24.f354713e;
                Context context = i24.f354709a;
                try {
                    (!z16 ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, context.getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, context);
                } catch (Exception e12) {
                    super.zzj().f354892i.c("Failed to invoke Tag Manager's initialize() method", e12);
                }
            } catch (ClassNotFoundException unused) {
                super.zzj().f354895l.b("Tag Manager is not found and thus will not be used");
            }
        }
        boolean zEquals = "_cmp".equals(str2);
        C36880g c36880g2 = i24.f354715g;
        com.google.android.gms.common.util.k kVar2 = i24.f354722n;
        if (zEquals) {
            if (bundle.containsKey("gclid")) {
                String string = bundle.getString("gclid");
                kVar2.getClass();
                kVar = kVar2;
                c36880g = c36880g2;
                str5 = null;
                o(System.currentTimeMillis(), string, "auto", "_lgclid");
            } else {
                kVar = kVar2;
                c36880g = c36880g2;
                str5 = null;
            }
            if (zzok.zza() && c36880g.o(str5, E.f354593Q0) && bundle.containsKey("gbraid")) {
                String string2 = bundle.getString("gbraid");
                kVar.getClass();
                o(System.currentTimeMillis(), string2, "auto", "_gbraid");
            }
        } else {
            kVar = kVar2;
            c36880g = c36880g2;
        }
        if (z12 && !N5.f354818j[0].equals(str2)) {
            super.c().y(bundle, super.b().f355148z.a());
        }
        R1 r12 = i24.f354721m;
        U3 u32 = this.f355378s;
        if (!z14 && !"_iap".equals(str2)) {
            N5 n52 = i24.f354720l;
            I2.d(n52);
            int i12 = 2;
            if (n52.i0("event", str2)) {
                if (!n52.V("event", C36912k3.f355240a, C36912k3.f355241b, str2)) {
                    i12 = 13;
                } else if (n52.M(40, "event", str2)) {
                    i12 = 0;
                }
            }
            if (i12 != 0) {
                super.zzj().f354891h.c("Invalid public event name. Event will not be logged (FE)", r12.c(str2));
                i24.o();
                String strU = N5.u(40, str2, true);
                int length = str2 != null ? str2.length() : 0;
                i24.o();
                N5.H(u32, null, i12, "_ev", strU, length);
                return;
            }
        }
        C36941o4 c36941o4L = super.g().l(false);
        if (c36941o4L != null && !bundle.containsKey("_sc")) {
            c36941o4L.f355295d = true;
        }
        N5.G(c36941o4L, bundle, z12 && !z14);
        boolean zEquals2 = "am".equals(str6);
        boolean zM02 = N5.m0(str2);
        if (z12 && this.f355363d != null && !zM02 && !zEquals2) {
            super.zzj().f354896m.a(r12.c(str2), "Passing event to registered event handler (FE)", r12.a(bundle));
            C36729v.j(this.f355363d);
            this.f355363d.a(str, str2, bundle, j12);
            return;
        }
        if (i24.f()) {
            int iJ2 = super.c().j(str2);
            if (iJ2 != 0) {
                super.zzj().f354891h.c("Invalid event name. Event will not be logged (FE)", r12.c(str2));
                super.c();
                String strU2 = N5.u(40, str2, true);
                int length2 = str2 != null ? str2.length() : 0;
                i24.o();
                N5.H(u32, null, iJ2, "_ev", strU2, length2);
                return;
            }
            Bundle bundleQ = super.c().q(str2, bundle, Collections.unmodifiableList(Arrays.asList("_o", "_sn", "_sc", "_si")), z14);
            C36729v.j(bundleQ);
            if (super.g().l(false) == null || !"_ae".equals(str2)) {
                z15 = zEquals2;
            } else {
                C36928m5 c36928m5 = super.h().f355159f;
                c36928m5.f355271d.f355183a.f354722n.getClass();
                z15 = zEquals2;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j14 = jElapsedRealtime - c36928m5.f355269b;
                c36928m5.f355269b = jElapsedRealtime;
                if (j14 > 0) {
                    super.c().x(bundleQ, j14);
                }
            }
            if (!"auto".equals(str6) && "_ssr".equals(str2)) {
                N5 n5C = super.c();
                String string3 = bundleQ.getString("_ffr");
                int i13 = com.google.android.gms.common.util.B.f349598a;
                if (string3 == null || string3.trim().isEmpty()) {
                    string3 = null;
                } else if (string3 != null) {
                    string3 = string3.trim();
                }
                if (Objects.equals(string3, n5C.b().f355145w.a())) {
                    n5C.zzj().f354896m.b("Not logging duplicate session_start_with_rollout event");
                    return;
                }
                n5C.b().f355145w.b(string3);
            } else if ("_ae".equals(str2)) {
                String strA = super.c().b().f355145w.a();
                if (!TextUtils.isEmpty(strA)) {
                    bundleQ.putString("_ffr", strA);
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(bundleQ);
            boolean zN2 = c36880g.o(null, E.f354575H0) ? super.h().n() : super.b().f355142t.b();
            if (super.b().f355139q.a() > 0 && super.b().j(j12) && zN2) {
                super.zzj().f354897n.b("Current session is expired, remove the session number, ID, and engagement time");
                kVar.getClass();
                i22 = i24;
                j13 = 0;
                str3 = "_o";
                str4 = "_ae";
                o(System.currentTimeMillis(), null, "auto", "_sid");
                kVar.getClass();
                o(System.currentTimeMillis(), null, "auto", "_sno");
                kVar.getClass();
                o(System.currentTimeMillis(), null, "auto", "_se");
                super.b().f355140r.b(0L);
            } else {
                str3 = "_o";
                str4 = "_ae";
                i22 = i24;
                j13 = 0;
            }
            if (bundleQ.getLong("extend_session", j13) == 1) {
                super.zzj().f354897n.b("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                i23 = i22;
                C36879f5 c36879f5 = i23.f354719k;
                I2.b(c36879f5);
                c36879f5.f355158e.b(j12);
            } else {
                i23 = i22;
            }
            ArrayList arrayList2 = new ArrayList(bundleQ.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            int i14 = 0;
            while (i14 < size) {
                Object obj = arrayList2.get(i14);
                i14++;
                String str7 = (String) obj;
                if (str7 != null) {
                    super.c();
                    Object obj2 = bundleQ.get(str7);
                    if (obj2 instanceof Bundle) {
                        bundleArr = new Bundle[]{(Bundle) obj2};
                    } else if (obj2 instanceof Parcelable[]) {
                        Parcelable[] parcelableArr = (Parcelable[]) obj2;
                        bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                    } else if (obj2 instanceof ArrayList) {
                        ArrayList arrayList3 = (ArrayList) obj2;
                        bundleArr = (Bundle[]) arrayList3.toArray(new Bundle[arrayList3.size()]);
                    } else {
                        bundleArr = null;
                    }
                    if (bundleArr != null) {
                        bundleQ.putParcelableArray(str7, bundleArr);
                    }
                }
            }
            int i15 = 0;
            while (i15 < arrayList.size()) {
                Bundle bundleP = (Bundle) arrayList.get(i15);
                String str8 = i15 != 0 ? "_ep" : str2;
                String str9 = str3;
                bundleP.putString(str9, str6);
                if (z13) {
                    bundleP = super.c().p(bundleP);
                }
                Bundle bundle2 = bundleP;
                i23.n().p(new zzbe(str8, new zzaz(bundle2), str, j12), null);
                if (!z15) {
                    Iterator it = this.f355364e.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC36933n3) it.next()).a(str, str2, new Bundle(bundle2), j12);
                    }
                }
                i15++;
                str6 = str;
                str3 = str9;
            }
            if (super.g().l(false) == null || !str4.equals(str2)) {
                return;
            }
            C36879f5 c36879f5H = super.h();
            kVar.getClass();
            c36879f5H.f355159f.a(SystemClock.elapsedRealtime(), true, true);
        }
    }

    public final void D(String str, String str2, Bundle bundle) {
        this.f355183a.f354722n.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        C36729v.f(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", jCurrentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        super.zzl().n(new Q3(this, bundle2));
    }

    @j.l0
    public final void E(String str, String str2, Bundle bundle, long j12) {
        super.e();
        C(str, str2, j12, bundle, true, this.f355363d == null || N5.m0(str2), true);
    }

    public final void F(String str, String str2, Bundle bundle, boolean z12, boolean z13, long j12) {
        String str3 = str == null ? "app" : str;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (Objects.equals(str2, "screen_view")) {
            super.g().q(bundle2, j12);
            return;
        }
        boolean z14 = !z13 || this.f355363d == null || N5.m0(str2);
        Bundle bundle3 = new Bundle(bundle2);
        for (String str4 : bundle3.keySet()) {
            Object obj = bundle3.get(str4);
            if (obj instanceof Bundle) {
                bundle3.putBundle(str4, new Bundle((Bundle) obj));
            } else if (obj instanceof Parcelable[]) {
                Parcelable[] parcelableArr = (Parcelable[]) obj;
                for (int i12 = 0; i12 < parcelableArr.length; i12++) {
                    if (parcelableArr[i12] instanceof Bundle) {
                        parcelableArr[i12] = new Bundle((Bundle) parcelableArr[i12]);
                    }
                }
            } else if (obj instanceof List) {
                List list = (List) obj;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    Object obj2 = list.get(i13);
                    if (obj2 instanceof Bundle) {
                        list.set(i13, new Bundle((Bundle) obj2));
                    }
                }
            }
        }
        super.zzl().n(new L3(this, str3, str2, j12, bundle3, z13, z14, z12));
    }

    public final void G(String str, String str2, Object obj, boolean z12) {
        this.f355183a.f354722n.getClass();
        H(str, str2, obj, z12, System.currentTimeMillis());
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H(java.lang.String r12, java.lang.String r13, java.lang.Object r14, boolean r15, long r16) {
        /*
            r11 = this;
            r7 = r11
            r3 = r13
            r0 = r14
            if (r12 != 0) goto L9
            java.lang.String r1 = "app"
            r2 = r1
            goto La
        L9:
            r2 = r12
        La:
            r1 = 0
            r4 = 24
            if (r15 == 0) goto L19
            com.google.android.gms.measurement.internal.N5 r5 = super.c()
            int r5 = r5.Z(r13)
        L17:
            r9 = r5
            goto L3b
        L19:
            com.google.android.gms.measurement.internal.N5 r5 = super.c()
            java.lang.String r6 = "user property"
            boolean r8 = r5.i0(r6, r13)
            r9 = 6
            if (r8 != 0) goto L27
            goto L3b
        L27:
            java.lang.String[] r8 = com.google.android.gms.measurement.internal.C36919l3.f355256a
            r10 = 0
            boolean r8 = r5.V(r6, r8, r10, r13)
            if (r8 != 0) goto L33
            r5 = 15
            goto L17
        L33:
            boolean r5 = r5.M(r4, r6, r13)
            if (r5 != 0) goto L3a
            goto L3b
        L3a:
            r9 = r1
        L3b:
            com.google.android.gms.measurement.internal.U3 r5 = r7.f355378s
            com.google.android.gms.measurement.internal.I2 r6 = r7.f355183a
            r8 = 1
            if (r9 == 0) goto L61
            super.c()
            java.lang.String r0 = com.google.android.gms.measurement.internal.N5.u(r4, r13, r8)
            if (r3 == 0) goto L4f
            int r1 = r13.length()
        L4f:
            r6.o()
            r2 = 0
            java.lang.String r3 = "_ev"
            r12 = r5
            r13 = r2
            r14 = r9
            r15 = r3
            r16 = r0
            r17 = r1
            com.google.android.gms.measurement.internal.N5.H(r12, r13, r14, r15, r16, r17)
            return
        L61:
            if (r0 == 0) goto Lb2
            com.google.android.gms.measurement.internal.N5 r9 = super.c()
            int r9 = r9.i(r14, r13)
            if (r9 == 0) goto L96
            super.c()
            java.lang.String r2 = com.google.android.gms.measurement.internal.N5.u(r4, r13, r8)
            boolean r3 = r0 instanceof java.lang.String
            if (r3 != 0) goto L7c
            boolean r3 = r0 instanceof java.lang.CharSequence
            if (r3 == 0) goto L84
        L7c:
            java.lang.String r0 = java.lang.String.valueOf(r14)
            int r1 = r0.length()
        L84:
            r6.o()
            r0 = 0
            java.lang.String r3 = "_ev"
            r12 = r5
            r13 = r0
            r14 = r9
            r15 = r3
            r16 = r2
            r17 = r1
            com.google.android.gms.measurement.internal.N5.H(r12, r13, r14, r15, r16, r17)
            return
        L96:
            com.google.android.gms.measurement.internal.N5 r1 = super.c()
            java.lang.Object r4 = r1.g0(r14, r13)
            if (r4 == 0) goto Lb1
            com.google.android.gms.measurement.internal.A2 r8 = super.zzl()
            com.google.android.gms.measurement.internal.K3 r9 = new com.google.android.gms.measurement.internal.K3
            r0 = r9
            r1 = r11
            r3 = r13
            r5 = r16
            r0.<init>(r1, r2, r3, r4, r5)
            r8.n(r9)
        Lb1:
            return
        Lb2:
            com.google.android.gms.measurement.internal.A2 r8 = super.zzl()
            com.google.android.gms.measurement.internal.K3 r9 = new com.google.android.gms.measurement.internal.K3
            r4 = 0
            r0 = r9
            r1 = r11
            r3 = r13
            r5 = r16
            r0.<init>(r1, r2, r3, r4, r5)
            r8.n(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C36967s3.H(java.lang.String, java.lang.String, java.lang.Object, boolean, long):void");
    }

    public final /* synthetic */ void I(List list) {
        super.e();
        if (Build.VERSION.SDK_INT >= 30) {
            SparseArray<Long> sparseArrayN = super.b().n();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzmh zzmhVar = (zzmh) it.next();
                if (!sparseArrayN.contains(zzmhVar.f355553d) || sparseArrayN.get(zzmhVar.f355553d).longValue() < zzmhVar.f355552c) {
                    X().add(zzmhVar);
                }
            }
            V();
        }
    }

    public final Boolean J() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) super.zzl().i(atomicReference, 15000L, "boolean test flag value", new B3(this, atomicReference));
    }

    public final Double K() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) super.zzl().i(atomicReference, 15000L, "double test flag value", new Z3(this, atomicReference));
    }

    public final Integer L() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) super.zzl().i(atomicReference, 15000L, "int test flag value", new W3(this, atomicReference));
    }

    public final Long M() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) super.zzl().i(atomicReference, 15000L, "long test flag value", new X3(this, atomicReference));
    }

    public final String N() {
        C36934n4 c36934n4 = this.f355183a.f354723o;
        I2.b(c36934n4);
        C36941o4 c36941o4 = c36934n4.f355277c;
        if (c36941o4 != null) {
            return c36941o4.f355293b;
        }
        return null;
    }

    public final String O() {
        C36934n4 c36934n4 = this.f355183a.f354723o;
        I2.b(c36934n4);
        C36941o4 c36941o4 = c36934n4.f355277c;
        if (c36941o4 != null) {
            return c36941o4.f355292a;
        }
        return null;
    }

    public final String P() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) super.zzl().i(atomicReference, 15000L, "String test flag value", new P3(this, atomicReference));
    }

    @j.l0
    public final void Q() {
        super.e();
        i();
        I2 i22 = this.f355183a;
        if (i22.f()) {
            Boolean boolN = i22.f354715g.n("google_analytics_deferred_deep_link_enabled");
            if (boolN != null && boolN.booleanValue()) {
                super.zzj().f354896m.b("Deferred Deep Link feature enabled.");
                super.zzl().n(new Runnable() { // from class: com.google.android.gms.measurement.internal.x3
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f355479b.T();
                    }
                });
            }
            i22.n().E();
            this.f355374o = false;
            C36876f2 c36876f2B = super.b();
            c36876f2B.e();
            String string = c36876f2B.m().getString("previous_os_version", null);
            c36876f2B.f355183a.j().f();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor editorEdit = c36876f2B.m().edit();
                editorEdit.putString("previous_os_version", str);
                editorEdit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            i22.j().f();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            c0("auto", "_ou", bundle);
        }
    }

    public final void R() {
        I2 i22 = this.f355183a;
        if (!(i22.f354709a.getApplicationContext() instanceof Application) || this.f355362c == null) {
            return;
        }
        ((Application) i22.f354709a.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f355362c);
    }

    public final void S() {
        if (zzph.zza() && this.f355183a.f354715g.o(null, E.f354567D0)) {
            if (super.zzl().p()) {
                super.zzj().f354889f.b("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            if (C36852c.a()) {
                super.zzj().f354889f.b("Cannot get trigger URIs from main thread");
                return;
            }
            i();
            super.zzj().f354897n.b("Getting trigger URIs (FE)");
            final AtomicReference atomicReference = new AtomicReference();
            super.zzl().i(atomicReference, 5000L, "get trigger URIs", new Runnable() { // from class: com.google.android.gms.measurement.internal.t3
                @Override // java.lang.Runnable
                public final void run() {
                    C36967s3 c36967s3 = this.f355385b;
                    Bundle bundleA = c36967s3.b().f355137o.a();
                    C36996w4 c36996w4N = c36967s3.f355183a.n();
                    if (bundleA == null) {
                        bundleA = new Bundle();
                    }
                    c36996w4N.z(atomicReference, bundleA);
                }
            });
            final List list = (List) atomicReference.get();
            if (list == null) {
                super.zzj().f354889f.b("Timed out waiting for get trigger URIs");
            } else {
                super.zzl().n(new Runnable() { // from class: com.google.android.gms.measurement.internal.w3
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f355421b.I(list);
                    }
                });
            }
        }
    }

    @j.l0
    public final void T() {
        super.e();
        if (super.b().f355143u.b()) {
            super.zzj().f354896m.b("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        }
        long jA2 = super.b().f355144v.a();
        super.b().f355144v.b(1 + jA2);
        if (jA2 >= 5) {
            super.zzj().f354892i.b("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
            super.b().f355143u.a(true);
            return;
        }
        boolean zZza = zzns.zza();
        I2 i22 = this.f355183a;
        if (!zZza || !i22.f354715g.o(null, E.f354583L0)) {
            i22.g();
            return;
        }
        if (this.f355375p == null) {
            this.f355375p = new M3(this, i22);
        }
        this.f355375p.b(0L);
    }

    @j.l0
    public final void U() {
        String string;
        int i12;
        int i13;
        int i14;
        String string2;
        int i15;
        Object obj;
        int i16;
        int i17;
        Bundle bundle;
        String str;
        Bundle bundle2;
        super.e();
        super.zzj().f354896m.b("Handle tcf update.");
        SharedPreferences sharedPreferencesL = super.b().l();
        I2 i22 = this.f355183a;
        Boolean boolN = i22.f354715g.n(" google_analytics_tcf_data_enabled");
        boolean zBooleanValue = boolN == null ? true : boolN.booleanValue();
        HashMap map = new HashMap();
        map.put("TcfDataEnabled", zBooleanValue ? "1" : "0");
        try {
            string = sharedPreferencesL.getString("IABTCF_VendorConsents", "\u0000");
        } catch (ClassCastException unused) {
            string = "\u0000";
        }
        if (!"\u0000".equals(string) && string.length() > 754) {
            map.put("GoogleConsent", String.valueOf(string.charAt(754)));
        }
        try {
            i12 = sharedPreferencesL.getInt("IABTCF_gdprApplies", -1);
        } catch (ClassCastException unused2) {
            i12 = -1;
        }
        if (i12 != -1) {
            map.put("gdprApplies", String.valueOf(i12));
        }
        try {
            i13 = sharedPreferencesL.getInt("IABTCF_EnableAdvertiserConsentMode", -1);
        } catch (ClassCastException unused3) {
            i13 = -1;
        }
        if (i13 != -1) {
            map.put("EnableAdvertiserConsentMode", String.valueOf(i13));
        }
        try {
            i14 = sharedPreferencesL.getInt("IABTCF_PolicyVersion", -1);
        } catch (ClassCastException unused4) {
            i14 = -1;
        }
        if (i14 != -1) {
            map.put("PolicyVersion", String.valueOf(i14));
        }
        try {
            string2 = sharedPreferencesL.getString("IABTCF_PurposeConsents", "\u0000");
        } catch (ClassCastException unused5) {
            string2 = "\u0000";
        }
        if (!"\u0000".equals(string2)) {
            map.put("PurposeConsents", string2);
        }
        try {
            i15 = sharedPreferencesL.getInt("IABTCF_CmpSdkID", -1);
        } catch (ClassCastException unused6) {
            i15 = -1;
        }
        if (i15 != -1) {
            map.put("CmpSdkID", String.valueOf(i15));
        }
        C36935n5 c36935n5 = new C36935n5(map);
        C36876f2 c36876f2B = super.b();
        c36876f2B.e();
        String string3 = c36876f2B.m().getString("stored_tcf_param", "");
        String strA = c36935n5.a();
        if (strA.equals(string3)) {
            return;
        }
        SharedPreferences.Editor editorEdit = c36876f2B.m().edit();
        editorEdit.putString("stored_tcf_param", strA);
        editorEdit.apply();
        HashMap map2 = c36935n5.f355288a;
        if ("1".equals(map2.get("TcfDataEnabled")) && "1".equals(map2.get("GoogleConsent")) && "1".equals(map2.get("gdprApplies")) && "1".equals(map2.get("EnableAdvertiserConsentMode"))) {
            int iB2 = c36935n5.b();
            if (iB2 < 0) {
                bundle2 = Bundle.EMPTY;
            } else {
                String str2 = (String) map2.get("PurposeConsents");
                if (TextUtils.isEmpty(str2)) {
                    bundle2 = Bundle.EMPTY;
                } else {
                    Bundle bundle3 = new Bundle();
                    if (str2.length() > 0) {
                        bundle3.putString("ad_storage", str2.charAt(0) == '1' ? "granted" : "denied");
                    }
                    obj = "EnableAdvertiserConsentMode";
                    if (str2.length() > 3) {
                        i17 = 2;
                        bundle3.putString("ad_personalization", (str2.charAt(2) == '1' && str2.charAt(3) == '1') ? "granted" : "denied");
                    } else {
                        i17 = 2;
                    }
                    if (str2.length() <= 6 || iB2 < 4) {
                        i16 = 0;
                    } else {
                        i16 = 0;
                        bundle3.putString("ad_user_data", (str2.charAt(0) == '1' && str2.charAt(6) == '1') ? "granted" : "denied");
                    }
                    bundle = bundle3;
                }
            }
            bundle = bundle2;
            obj = "EnableAdvertiserConsentMode";
            i16 = 0;
            i17 = 2;
        } else {
            obj = "EnableAdvertiserConsentMode";
            i16 = 0;
            i17 = 2;
            bundle = Bundle.EMPTY;
        }
        if (bundle != Bundle.EMPTY) {
            i22.f354722n.getClass();
            n(-30, System.currentTimeMillis(), bundle);
        }
        Bundle bundle4 = new Bundle();
        StringBuilder sb2 = new StringBuilder("1");
        try {
            str = (String) map2.get("CmpSdkID");
        } catch (NumberFormatException unused7) {
        }
        int i18 = !TextUtils.isEmpty(str) ? Integer.parseInt(str) : -1;
        if (i18 < 0 || i18 > 4095) {
            sb2.append("00");
        } else {
            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt((i18 >> 6) & 63));
            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i18 & 63));
        }
        int iB3 = c36935n5.b();
        if (iB3 < 0 || iB3 > 63) {
            sb2.append("0");
        } else {
            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(iB3));
        }
        if (!"1".equals(map2.get("gdprApplies"))) {
            i17 = i16;
        }
        if ("1".equals(map2.get("TcfDataEnabled"))) {
            i17 |= 4;
        }
        if ("1".equals(map2.get(obj))) {
            i17 |= 8;
        }
        sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i17));
        bundle4.putString("_tcfd", sb2.toString());
        c0("auto", "_tcf", bundle4);
    }

    @TargetApi(30)
    @j.l0
    public final void V() {
        zzmh zzmhVarPoll;
        super.e();
        if (X().isEmpty() || this.f355368i || (zzmhVarPoll = X().poll()) == null) {
            return;
        }
        N5 n5C = super.c();
        if (n5C.f354822f == null) {
            n5C.f354822f = androidx.privacysandbox.ads.adservices.java.measurement.a.a(n5C.f355183a.f354709a);
        }
        androidx.privacysandbox.ads.adservices.java.measurement.a aVar = n5C.f354822f;
        if (aVar == null) {
            return;
        }
        this.f355368i = true;
        U1 u12 = super.zzj().f354897n;
        String str = zzmhVarPoll.f355551b;
        u12.c("Registering trigger URI", str);
        com.google.common.util.concurrent.D0<kotlin.G0> d0C = aVar.c(Uri.parse(str));
        if (d0C == null) {
            this.f355368i = false;
            X().add(zzmhVarPoll);
            return;
        }
        SparseArray<Long> sparseArrayN = super.b().n();
        sparseArrayN.put(zzmhVarPoll.f355553d, Long.valueOf(zzmhVarPoll.f355552c));
        C36876f2 c36876f2B = super.b();
        int[] iArr = new int[sparseArrayN.size()];
        long[] jArr = new long[sparseArrayN.size()];
        for (int i12 = 0; i12 < sparseArrayN.size(); i12++) {
            iArr[i12] = sparseArrayN.keyAt(i12);
            jArr[i12] = sparseArrayN.valueAt(i12).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        c36876f2B.f355137o.b(bundle);
        C37568u0.a(d0C, new D3(this, zzmhVarPoll), new F3(this));
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.google.android.gms.measurement.internal.A3] */
    @j.l0
    public final void W() {
        super.e();
        super.zzj().f354896m.b("Register tcfPrefChangeListener.");
        if (this.f355376q == null) {
            this.f355377r = new I3(this, this.f355183a);
            this.f355376q = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.measurement.internal.A3
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                    C36967s3 c36967s3 = this.f354519a;
                    c36967s3.getClass();
                    if ("IABTCF_TCString".equals(str)) {
                        I3 i32 = c36967s3.f355377r;
                        C36729v.j(i32);
                        i32.b(500L);
                    }
                }
            };
        }
        super.b().l().registerOnSharedPreferenceChangeListener(this.f355376q);
    }

    @TargetApi(30)
    public final PriorityQueue<zzmh> X() {
        if (this.f355369j == null) {
            this.f355369j = new PriorityQueue<>(Comparator.comparing(new Function() { // from class: com.google.android.gms.measurement.internal.r3
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Long.valueOf(((zzmh) obj).f355552c);
                }
            }, new Comparator() { // from class: com.google.android.gms.measurement.internal.u3
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
                }
            }));
        }
        return this.f355369j;
    }

    @j.l0
    public final void Y() {
        super.e();
        String strA = super.b().f355136n.a();
        I2 i22 = this.f355183a;
        if (strA != null) {
            if ("unset".equals(strA)) {
                i22.f354722n.getClass();
                o(System.currentTimeMillis(), null, "app", "_npa");
            } else {
                Long lValueOf = Long.valueOf("true".equals(strA) ? 1L : 0L);
                i22.f354722n.getClass();
                o(System.currentTimeMillis(), lValueOf, "app", "_npa");
            }
        }
        if (!i22.e() || !this.f355374o) {
            super.zzj().f354896m.b("Updating Scion state (FE)");
            i22.n().I();
            return;
        }
        super.zzj().f354896m.b("Recording app launch after enabling measurement for the first time (FE)");
        Q();
        if (zzoj.zza()) {
            if (i22.f354715g.o(null, E.f354630l0)) {
                super.h().f355158e.a();
            }
        }
        super.zzl().n(new G3(this));
    }

    public final void Z(Bundle bundle) {
        this.f355183a.f354722n.getClass();
        r(bundle, System.currentTimeMillis());
    }

    public final void a0(InterfaceC36933n3 interfaceC36933n3) {
        i();
        if (this.f355364e.remove(interfaceC36933n3)) {
            return;
        }
        super.zzj().f354892i.b("OnEventListener had not been registered");
    }

    public final void b0(String str, String str2, Bundle bundle) {
        this.f355183a.f354722n.getClass();
        F(str, str2, bundle, true, true, System.currentTimeMillis());
    }

    @j.l0
    public final void c0(String str, String str2, Bundle bundle) {
        super.e();
        this.f355183a.f354722n.getClass();
        E(str, str2, bundle, System.currentTimeMillis());
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC36847b1
    public final boolean k() {
        return false;
    }

    public final ArrayList<Bundle> l(String str, String str2) {
        if (super.zzl().p()) {
            super.zzj().f354889f.b("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList<>(0);
        }
        if (C36852c.a()) {
            super.zzj().f354889f.b("Cannot get conditional user properties from main thread");
            return new ArrayList<>(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        A2 a22 = this.f355183a.f354718j;
        I2.c(a22);
        a22.i(atomicReference, 5000L, "get conditional user properties", new T3(this, atomicReference, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return N5.b0(list);
        }
        super.zzj().f354889f.c("Timed out waiting for get conditional user properties", null);
        return new ArrayList<>();
    }

    public final Map<String, Object> m(String str, String str2, boolean z12) {
        if (super.zzl().p()) {
            super.zzj().f354889f.b("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        }
        if (C36852c.a()) {
            super.zzj().f354889f.b("Cannot get user properties from main thread");
            return Collections.emptyMap();
        }
        AtomicReference atomicReference = new AtomicReference();
        A2 a22 = this.f355183a.f354718j;
        I2.c(a22);
        a22.i(atomicReference, 5000L, "get user properties", new S3(this, atomicReference, str, str2, z12));
        List<zznb> list = (List) atomicReference.get();
        if (list == null) {
            S1 s1Zzj = super.zzj();
            s1Zzj.f354889f.c("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z12));
            return Collections.emptyMap();
        }
        C20199a c20199a = new C20199a(list.size());
        for (zznb zznbVar : list) {
            Object objH = zznbVar.h();
            if (objH != null) {
                c20199a.put(zznbVar.f355555c, objH);
            }
        }
        return c20199a;
    }

    @j.k0
    public final void n(int i12, long j12, Bundle bundle) {
        String string;
        i();
        zzif zzifVar = zzif.f355542c;
        zzif.zza[] zzaVarArr = zzie.STORAGE.f355541b;
        int length = zzaVarArr.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                string = null;
                break;
            }
            zzif.zza zzaVar = zzaVarArr[i13];
            if (bundle.containsKey(zzaVar.f355550b) && (string = bundle.getString(zzaVar.f355550b)) != null && zzif.g(string) == null) {
                break;
            } else {
                i13++;
            }
        }
        if (string != null) {
            super.zzj().f354894k.c("Ignoring invalid consent setting", string);
            super.zzj().f354894k.b("Valid consent values are 'granted', 'denied'");
        }
        zzif zzifVarA = zzif.a(i12, bundle);
        if (!zzns.zza() || !this.f355183a.f354715g.o(null, E.f354579J0)) {
            u(zzifVarA, j12);
            return;
        }
        Iterator<Boolean> it = zzifVarA.f355543a.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next() != null) {
                u(zzifVarA, j12);
                break;
            }
        }
        C36977u c36977uA = C36977u.a(i12, bundle);
        Iterator<Boolean> it2 = c36977uA.f355394e.values().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            } else if (it2.next() != null) {
                s(c36977uA);
                break;
            }
        }
        Boolean boolG = bundle != null ? zzif.g(bundle.getString("ad_personalization")) : null;
        if (boolG != null) {
            G(i12 == -30 ? "tcf" : "app", "allow_personalized_ads", boolG.toString(), false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    @j.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(long r9, java.lang.Object r11, java.lang.String r12, java.lang.String r13) {
        /*
            r8 = this;
            com.google.android.gms.common.internal.C36729v.f(r12)
            com.google.android.gms.common.internal.C36729v.f(r13)
            super.e()
            r8.i()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L5b
            boolean r0 = r11 instanceof java.lang.String
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L4d
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L4d
            java.util.Locale r11 = java.util.Locale.ENGLISH
            java.lang.String r11 = r0.toLowerCase(r11)
            java.lang.String r13 = "false"
            boolean r11 = r13.equals(r11)
            r2 = 1
            if (r11 == 0) goto L35
            r4 = r2
            goto L37
        L35:
            r4 = 0
        L37:
            java.lang.Long r11 = java.lang.Long.valueOf(r4)
            com.google.android.gms.measurement.internal.f2 r0 = super.b()
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L45
            java.lang.String r13 = "true"
        L45:
            com.google.android.gms.measurement.internal.l2 r0 = r0.f355136n
            r0.b(r13)
        L4a:
            r5 = r11
            r6 = r1
            goto L5d
        L4d:
            if (r11 != 0) goto L5b
            com.google.android.gms.measurement.internal.f2 r13 = super.b()
            com.google.android.gms.measurement.internal.l2 r13 = r13.f355136n
            java.lang.String r0 = "unset"
            r13.b(r0)
            goto L4a
        L5b:
            r5 = r11
            r6 = r13
        L5d:
            com.google.android.gms.measurement.internal.I2 r11 = r8.f355183a
            boolean r13 = r11.e()
            if (r13 != 0) goto L71
            com.google.android.gms.measurement.internal.S1 r9 = super.zzj()
            java.lang.String r10 = "User property not set since app measurement is disabled"
            com.google.android.gms.measurement.internal.U1 r9 = r9.f354897n
            r9.b(r10)
            return
        L71:
            boolean r13 = r11.f()
            if (r13 != 0) goto L78
            return
        L78:
            com.google.android.gms.measurement.internal.zznb r13 = new com.google.android.gms.measurement.internal.zznb
            r2 = r13
            r3 = r9
            r7 = r12
            r2.<init>(r3, r5, r6, r7)
            com.google.android.gms.measurement.internal.w4 r9 = r11.n()
            r9.u(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C36967s3.o(long, java.lang.Object, java.lang.String, java.lang.String):void");
    }

    public final void p(long j12, boolean z12) {
        super.e();
        i();
        super.zzj().f354896m.b("Resetting analytics data (FE)");
        C36879f5 c36879f5H = super.h();
        c36879f5H.e();
        C36928m5 c36928m5 = c36879f5H.f355159f;
        c36928m5.f355270c.a();
        c36928m5.f355268a = 0L;
        c36928m5.f355269b = 0L;
        boolean zZza = zzpt.zza();
        I2 i22 = this.f355183a;
        if (zZza && i22.f354715g.o(null, E.f354640q0)) {
            i22.k().o();
        }
        boolean zE2 = i22.e();
        C36876f2 c36876f2B = super.b();
        c36876f2B.f355129g.b(j12);
        if (!TextUtils.isEmpty(c36876f2B.b().f355145w.a())) {
            c36876f2B.f355145w.b(null);
        }
        boolean zZza2 = zzoj.zza();
        I2 i23 = c36876f2B.f355183a;
        if (zZza2 && i23.f354715g.o(null, E.f354630l0)) {
            c36876f2B.f355139q.b(0L);
        }
        c36876f2B.f355140r.b(0L);
        Boolean boolN = i23.f354715g.n("firebase_analytics_collection_deactivated");
        if (boolN == null || !boolN.booleanValue()) {
            c36876f2B.k(!zE2);
        }
        c36876f2B.f355146x.b(null);
        c36876f2B.f355147y.b(0L);
        c36876f2B.f355148z.b(null);
        if (z12) {
            i22.n().H();
        }
        if (zzoj.zza()) {
            if (i22.f354715g.o(null, E.f354630l0)) {
                super.h().f355158e.a();
            }
        }
        this.f355374o = !zE2;
    }

    public final void q(Bundle bundle) {
        int i12;
        U3 u32;
        I2 i22;
        if (bundle == null) {
            C36876f2 c36876f2B = super.b();
            c36876f2B.f355148z.b(new Bundle());
            return;
        }
        Bundle bundleA = super.b().f355148z.a();
        Iterator<String> it = bundle.keySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            i12 = 0;
            u32 = this.f355378s;
            i22 = this.f355183a;
            if (!zHasNext) {
                break;
            }
            String next = it.next();
            Object obj = bundle.get(next);
            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                super.c();
                if (N5.P(obj)) {
                    super.c();
                    N5.H(u32, null, 27, null, null, 0);
                }
                super.zzj().f354894k.a(next, "Invalid default event parameter type. Name, value", obj);
            } else if (N5.m0(next)) {
                super.zzj().f354894k.c("Invalid default event parameter name. Name", next);
            } else if (obj == null) {
                bundleA.remove(next);
            } else if (super.c().S("param", next, i22.f354715g.g(null, false), obj)) {
                super.c().I(next, bundleA, obj);
            }
        }
        super.c();
        int iP2 = i22.f354715g.p();
        if (bundleA.size() > iP2) {
            Iterator it2 = new TreeSet(bundleA.keySet()).iterator();
            while (it2.hasNext()) {
                String str = (String) it2.next();
                i12++;
                if (i12 > iP2) {
                    bundleA.remove(str);
                }
            }
            super.c();
            N5.H(u32, null, 26, null, null, 0);
            super.zzj().f354894k.b("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        super.b().f355148z.b(bundleA);
        i22.n().l(bundleA);
    }

    public final void r(Bundle bundle, long j12) {
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString(HiAnalyticsConstant.BI_KEY_APP_ID))) {
            super.zzj().f354892i.b("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove(HiAnalyticsConstant.BI_KEY_APP_ID);
        C36898i3.a(bundle2, HiAnalyticsConstant.BI_KEY_APP_ID, String.class, null);
        C36898i3.a(bundle2, "origin", String.class, null);
        C36898i3.a(bundle2, "name", String.class, null);
        C36898i3.a(bundle2, "value", Object.class, null);
        C36898i3.a(bundle2, "trigger_event_name", String.class, null);
        C36898i3.a(bundle2, "trigger_timeout", Long.class, 0L);
        C36898i3.a(bundle2, "timed_out_event_name", String.class, null);
        C36898i3.a(bundle2, "timed_out_event_params", Bundle.class, null);
        C36898i3.a(bundle2, "triggered_event_name", String.class, null);
        C36898i3.a(bundle2, "triggered_event_params", Bundle.class, null);
        C36898i3.a(bundle2, "time_to_live", Long.class, 0L);
        C36898i3.a(bundle2, "expired_event_name", String.class, null);
        C36898i3.a(bundle2, "expired_event_params", Bundle.class, null);
        C36729v.f(bundle2.getString("name"));
        C36729v.f(bundle2.getString("origin"));
        C36729v.j(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j12);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        int iZ2 = super.c().Z(string);
        I2 i22 = this.f355183a;
        if (iZ2 != 0) {
            S1 s1Zzj = super.zzj();
            s1Zzj.f354889f.c("Invalid conditional user property name", i22.f354721m.g(string));
            return;
        }
        if (super.c().i(obj, string) != 0) {
            S1 s1Zzj2 = super.zzj();
            s1Zzj2.f354889f.a(i22.f354721m.g(string), "Invalid conditional user property value", obj);
            return;
        }
        Object objG0 = super.c().g0(obj, string);
        if (objG0 == null) {
            S1 s1Zzj3 = super.zzj();
            s1Zzj3.f354889f.a(i22.f354721m.g(string), "Unable to normalize conditional user property value", obj);
            return;
        }
        C36898i3.b(bundle2, objG0);
        long j13 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j13 > 15552000000L || j13 < 1)) {
            S1 s1Zzj4 = super.zzj();
            s1Zzj4.f354889f.a(i22.f354721m.g(string), "Invalid conditional user property timeout", Long.valueOf(j13));
            return;
        }
        long j14 = bundle2.getLong("time_to_live");
        if (j14 <= 15552000000L && j14 >= 1) {
            super.zzl().n(new R3(this, bundle2));
            return;
        }
        S1 s1Zzj5 = super.zzj();
        s1Zzj5.f354889f.a(i22.f354721m.g(string), "Invalid conditional user property time to live", Long.valueOf(j14));
    }

    public final void s(C36977u c36977u) {
        super.zzl().n(new RunnableC36850b4(this, c36977u));
    }

    @j.l0
    public final void t(zzif zzifVar) {
        super.e();
        boolean z12 = (zzifVar.e(zzif.zza.ANALYTICS_STORAGE) && zzifVar.e(zzif.zza.AD_STORAGE)) || this.f355183a.n().L();
        I2 i22 = this.f355183a;
        A2 a22 = i22.f354718j;
        I2.c(a22);
        a22.e();
        if (z12 != i22.f354704D) {
            I2 i23 = this.f355183a;
            A2 a23 = i23.f354718j;
            I2.c(a23);
            a23.e();
            i23.f354704D = z12;
            C36876f2 c36876f2B = super.b();
            c36876f2B.e();
            Boolean boolValueOf = c36876f2B.m().contains("measurement_enabled_from_api") ? Boolean.valueOf(c36876f2B.m().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z12 || boolValueOf == null || boolValueOf.booleanValue()) {
                A(Boolean.valueOf(z12), false);
            }
        }
    }

    public final void u(zzif zzifVar, long j12) {
        zzif zzifVar2;
        boolean z12;
        zzif zzifVar3;
        boolean z13;
        boolean zH2;
        i();
        int i12 = zzifVar.f355544b;
        if (i12 != -10) {
            if (zzifVar.f355543a.get(zzif.zza.AD_STORAGE) == null) {
                if (zzifVar.f355543a.get(zzif.zza.ANALYTICS_STORAGE) == null) {
                    super.zzj().f354894k.b("Discarding empty consent settings");
                    return;
                }
            }
        }
        synchronized (this.f355367h) {
            try {
                zzifVar2 = this.f355370k;
                z12 = false;
                if (i12 <= zzifVar2.f355544b) {
                    zH2 = zzifVar.h(zzifVar2, (zzif.zza[]) zzifVar.f355543a.keySet().toArray(new zzif.zza[0]));
                    zzif.zza zzaVar = zzif.zza.ANALYTICS_STORAGE;
                    if (zzifVar.e(zzaVar) && !this.f355370k.e(zzaVar)) {
                        z12 = true;
                    }
                    zzif zzifVarF = zzifVar.f(this.f355370k);
                    this.f355370k = zzifVarF;
                    zzifVar3 = zzifVarF;
                    z13 = z12;
                    z12 = true;
                } else {
                    zzifVar3 = zzifVar;
                    z13 = false;
                    zH2 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z12) {
            super.zzj().f354895l.c("Ignoring lower-priority consent settings, proposed settings", zzifVar3);
            return;
        }
        long andIncrement = this.f355371l.getAndIncrement();
        if (zH2) {
            B(null);
            super.zzl().o(new RunnableC36843a4(this, zzifVar3, j12, andIncrement, z13, zzifVar2));
            return;
        }
        RunnableC36864d4 runnableC36864d4 = new RunnableC36864d4(this, zzifVar3, andIncrement, z13, zzifVar2);
        if (i12 == 30 || i12 == -10) {
            super.zzl().o(runnableC36864d4);
        } else {
            super.zzl().n(runnableC36864d4);
        }
    }

    public final void v(InterfaceC36933n3 interfaceC36933n3) {
        i();
        if (this.f355364e.add(interfaceC36933n3)) {
            return;
        }
        super.zzj().f354892i.b("OnEventListener already registered");
    }

    @j.l0
    public final void w(InterfaceC36940o3 interfaceC36940o3) {
        super.e();
        i();
        InterfaceC36940o3 interfaceC36940o32 = this.f355363d;
        if (interfaceC36940o3 != interfaceC36940o32) {
            C36729v.l("EventInterceptor already set.", interfaceC36940o32 == null);
        }
        this.f355363d = interfaceC36940o3;
    }

    public final void z(Boolean bool) {
        i();
        super.zzl().n(new Y3(this, bool));
    }

    @Override // com.google.android.gms.measurement.internal.C36891h3, com.google.android.gms.measurement.internal.InterfaceC36905j3
    @Pure
    public final Context zza() {
        return this.f355183a.f354709a;
    }

    @Override // com.google.android.gms.measurement.internal.C36891h3, com.google.android.gms.measurement.internal.InterfaceC36905j3
    @Pure
    public final InterfaceC36753g zzb() {
        return this.f355183a.f354722n;
    }

    @Override // com.google.android.gms.measurement.internal.C36891h3, com.google.android.gms.measurement.internal.InterfaceC36905j3
    @Pure
    public final C36852c zzd() {
        return this.f355183a.f354714f;
    }
}
