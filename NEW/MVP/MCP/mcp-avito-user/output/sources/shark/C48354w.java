package shark;

import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.sequences.C43033p;
import kotlin.sequences.o0;
import shark.M1;

/* compiled from: AndroidObjectInspectors.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shark-android"}, k = 2, mv = {1, 4, 1})
/* renamed from: shark.w, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48354w {

    /* compiled from: AndroidObjectInspectors.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lshark/M1$b;", "it", "", "invoke", "(Lshark/M1$b;)Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* renamed from: shark.w$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<M1.b, String> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f438794l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final String invoke(M1.b bVar) {
            return bVar.g();
        }
    }

    /* compiled from: AndroidObjectInspectors.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lshark/M1$b;", "it", "", "invoke", "(Lshark/M1$b;)Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* renamed from: shark.w$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<M1.b, String> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f438795l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final String invoke(M1.b bVar) {
            return bVar.g();
        }
    }

    public static final String a(K1 k12, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(M1.a.a(M1.f438144b, k12.f438093a.g()));
        sb2.append('#');
        return androidx.camera.camera2.internal.G.g(sb2, k12.f438094b, " is ", str);
    }

    public static final String b(M1.c cVar) {
        K1 k1J = cVar.j("androidx.lifecycle.LifecycleRegistry", VoiceInfo.STATE);
        if (k1J == null && (k1J = cVar.j("androidx.lifecycle.LifecycleRegistry", "mState")) == null) {
            kotlin.jvm.internal.L.k();
            throw null;
        }
        M1.c cVarA = k1J.a();
        if (cVarA == null) {
            kotlin.jvm.internal.L.k();
            throw null;
        }
        K1 k1J2 = cVarA.j("java.lang.Enum", "name");
        if (k1J2 == null) {
            kotlin.jvm.internal.L.k();
            throw null;
        }
        String strI = k1J2.f438095c.i();
        if (strI != null) {
            return strI;
        }
        kotlin.jvm.internal.L.k();
        throw null;
    }

    public static final boolean c(M1.c cVar) {
        X1 x12;
        K1 k1J = cVar.j("android.app.ContextImpl", "mOuterContext");
        Boolean boolA = null;
        if (k1J == null) {
            kotlin.jvm.internal.L.k();
            throw null;
        }
        M1.c cVarA = k1J.a();
        if (cVarA == null) {
            kotlin.jvm.internal.L.k();
            throw null;
        }
        if (cVarA.h("android.app.Activity")) {
            K1 k1J2 = cVarA.j("android.app.Activity", "mDestroyed");
            if (k1J2 != null && (x12 = k1J2.f438095c) != null) {
                boolA = x12.a();
            }
            if (kotlin.jvm.internal.L.f(boolA, Boolean.TRUE)) {
                return true;
            }
        }
        return false;
    }

    @Y61.k
    public static final K1 d(@Y61.k M1.c cVar, @Y61.k String str, @Y61.k String str2) {
        K1 k1J = cVar.j(str, str2);
        if (k1J != null) {
            return k1J;
        }
        StringBuilder sb2 = new StringBuilder("\n");
        sb2.append(cVar.f());
        sb2.append(" is expected to have a ");
        sb2.append(str);
        sb2.append('.');
        throw new IllegalStateException(AK.c.s(sb2, str2, " field which cannot be found.\nThis might be due to the app code being obfuscated. If that's the case, then the heap analysis\nis unable to proceed without a mapping file to deobfuscate class names.\nYou can run LeakCanary on obfuscated builds by following the instructions at\nhttps://square.github.io/leakcanary/recipes/#using-leakcanary-with-obfuscated-apps\n      "));
    }

    public static final void e(U2 u22, M1.c cVar, M1.c cVar2, String str) {
        if (!cVar.h("android.app.Activity")) {
            if (cVar.h("android.app.Application")) {
                LinkedHashSet linkedHashSet = u22.f438217c;
                StringBuilder sbZ = androidx.appcompat.app.r.z(str, ".mOuterContext is an instance of ");
                sbZ.append(cVar.f());
                sbZ.append(" which extends android.app.Application");
                linkedHashSet.add(sbZ.toString());
                return;
            }
            if (cVar.f438151e == cVar2.f438151e) {
                u22.f438215a.add(str.concat(".mOuterContext == ContextImpl.this: not tied to any particular lifecycle"));
                return;
            }
            LinkedHashSet<String> linkedHashSet2 = u22.f438215a;
            StringBuilder sbZ2 = androidx.appcompat.app.r.z(str, ".mOuterContext is an instance of ");
            sbZ2.append(cVar.f());
            linkedHashSet2.add(sbZ2.toString());
            return;
        }
        K1 k1J = cVar.j("android.app.Activity", "mDestroyed");
        Boolean boolA = k1J != null ? k1J.f438095c.a() : null;
        if (boolA == null) {
            LinkedHashSet<String> linkedHashSet3 = u22.f438215a;
            StringBuilder sbZ3 = androidx.appcompat.app.r.z(str, ".mOuterContext is an instance of ");
            sbZ3.append(cVar.f());
            linkedHashSet3.add(sbZ3.toString());
            return;
        }
        if (boolA.booleanValue()) {
            LinkedHashSet linkedHashSet4 = u22.f438216b;
            StringBuilder sbZ4 = androidx.appcompat.app.r.z(str, ".mOuterContext is an instance of ");
            sbZ4.append(cVar.f());
            sbZ4.append(" with Activity.mDestroyed true");
            linkedHashSet4.add(sbZ4.toString());
            return;
        }
        LinkedHashSet linkedHashSet5 = u22.f438217c;
        StringBuilder sbZ5 = androidx.appcompat.app.r.z(str, ".mOuterContext is an instance of ");
        sbZ5.append(cVar.f());
        sbZ5.append(" with Activity.mDestroyed false");
        linkedHashSet5.add(sbZ5.toString());
    }

    @Y61.l
    public static final M1.c f(@Y61.k M1.c cVar) {
        M1.c cVarG = g(cVar);
        if (cVarG == null || !cVarG.h("android.app.Activity")) {
            return null;
        }
        return cVarG;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Y61.l
    public static final M1.c g(@Y61.k M1.c cVar) {
        Object next;
        M1.c cVarA;
        Object next2;
        K1 k1J;
        o0.a aVar = new o0.a(new kotlin.sequences.o0(C43033p.u(N1.f438163l, cVar.e()), b.f438795l));
        while (true) {
            if (aVar.f410559b.hasNext()) {
                next = aVar.next();
                String str = (String) next;
                switch (str.hashCode()) {
                    case -880360069:
                        if (str.equals("android.app.Activity")) {
                            break;
                        }
                    case 735120228:
                        if (str.equals("android.app.Application")) {
                            break;
                        }
                    case 762246857:
                        if (str.equals("android.app.Service")) {
                            break;
                        }
                    case 774146168:
                        if (str.equals("android.content.ContextWrapper")) {
                            break;
                        }
                }
            } else {
                next = null;
            }
        }
        String str2 = (String) next;
        if (str2 != null) {
            if (!str2.equals("android.content.ContextWrapper")) {
                return cVar;
            }
            ArrayList arrayList = new ArrayList();
            while (true) {
                for (boolean z12 = true; z12; z12 = false) {
                    arrayList.add(Long.valueOf(cVar.f438151e));
                    K1 k1J2 = cVar.j("android.content.ContextWrapper", "mBase");
                    if (k1J2 == null) {
                        kotlin.jvm.internal.L.k();
                        throw null;
                    }
                    X1 x12 = k1J2.f438095c;
                    if (x12.g()) {
                        M1 m1E = x12.e();
                        if (m1E == null) {
                            kotlin.jvm.internal.L.k();
                            throw null;
                        }
                        cVarA = m1E.a();
                        if (cVarA == null) {
                            kotlin.jvm.internal.L.k();
                            throw null;
                        }
                        o0.a aVar2 = new o0.a(new kotlin.sequences.o0(C43033p.u(N1.f438163l, cVarA.e()), a.f438794l));
                        while (true) {
                            if (aVar2.f410559b.hasNext()) {
                                next2 = aVar2.next();
                                String str3 = (String) next2;
                                switch (str3.hashCode()) {
                                    case -880360069:
                                        if (str3.equals("android.app.Activity")) {
                                            break;
                                        }
                                    case 735120228:
                                        if (str3.equals("android.app.Application")) {
                                            break;
                                        }
                                    case 762246857:
                                        if (str3.equals("android.app.Service")) {
                                            break;
                                        }
                                    case 774146168:
                                        if (str3.equals("android.content.ContextWrapper")) {
                                            break;
                                        }
                                }
                            } else {
                                next2 = null;
                            }
                        }
                        String str4 = (String) next2;
                        boolean zF2 = kotlin.jvm.internal.L.f(str4, "android.content.ContextWrapper");
                        if (kotlin.jvm.internal.L.f(str4, "android.app.Activity")) {
                            return cVarA;
                        }
                        if (cVar.h("com.android.internal.policy.DecorContext") && (k1J = cVar.j("com.android.internal.policy.DecorContext", "mPhoneWindow")) != null) {
                            M1.c cVarA2 = k1J.a();
                            if (cVarA2 == null) {
                                kotlin.jvm.internal.L.k();
                                throw null;
                            }
                            K1 k1J3 = cVarA2.j("android.view.Window", "mContext");
                            if (k1J3 == null) {
                                kotlin.jvm.internal.L.k();
                                throw null;
                            }
                            cVarA = k1J3.a();
                            if (cVarA == null) {
                                kotlin.jvm.internal.L.k();
                                throw null;
                            }
                            if (cVarA.h("android.app.Activity")) {
                                return cVarA;
                            }
                            zF2 = cVarA.h("android.content.ContextWrapper");
                        }
                        if (!kotlin.jvm.internal.L.f(str4, "android.app.Service") && !kotlin.jvm.internal.L.f(str4, "android.app.Application")) {
                            if (!zF2 || arrayList.contains(Long.valueOf(cVarA.f438151e))) {
                                cVar = cVarA;
                            }
                        }
                    }
                }
                cVar = cVarA;
            }
            return cVarA;
        }
        return null;
    }
}
