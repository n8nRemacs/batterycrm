package androidx.view.compose;

import X41.i;
import Y61.k;
import androidx.compose.runtime.X1;
import androidx.view.InterfaceC22983P;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: LocalLifecycleOwner.android.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"lifecycle-runtime-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@i
/* renamed from: androidx.lifecycle.compose.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23005G {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final X1<InterfaceC22983P> f46734a;

    /* compiled from: LocalLifecycleOwner.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/P;", "invoke", "()Landroidx/lifecycle/P;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.lifecycle.compose.G$a */
    public static final class a extends N implements Y41.a<InterfaceC22983P> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f46735l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final InterfaceC22983P invoke() {
            throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        r1 = r1.invoke(null, new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        if ((r1 instanceof androidx.compose.runtime.X1) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        r1 = (androidx.compose.runtime.X1) r1;
     */
    static {
        /*
            r0 = 0
            int r1 = kotlin.Z.f406624c     // Catch: java.lang.Throwable -> L2b
            java.lang.Class<androidx.lifecycle.P> r1 = androidx.view.InterfaceC22983P.class
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r2 = "androidx.compose.ui.platform.AndroidCompositionLocals_androidKt"
            java.lang.String r3 = "getLocalLifecycleOwner"
            java.lang.Class r1 = r1.loadClass(r2)     // Catch: java.lang.Throwable -> L2b
            r2 = 0
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L2b
            java.lang.reflect.Method r1 = r1.getMethod(r3, r4)     // Catch: java.lang.Throwable -> L2b
            java.lang.annotation.Annotation[] r3 = r1.getAnnotations()     // Catch: java.lang.Throwable -> L2b
            int r4 = r3.length     // Catch: java.lang.Throwable -> L2b
            r5 = r2
        L1e:
            if (r5 >= r4) goto L2d
            r6 = r3[r5]     // Catch: java.lang.Throwable -> L2b
            boolean r6 = r6 instanceof kotlin.InterfaceC42830m     // Catch: java.lang.Throwable -> L2b
            if (r6 == 0) goto L28
        L26:
            r1 = r0
            goto L42
        L28:
            int r5 = r5 + 1
            goto L1e
        L2b:
            r1 = move-exception
            goto L3a
        L2d:
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r1 = r1.invoke(r0, r2)     // Catch: java.lang.Throwable -> L2b
            boolean r2 = r1 instanceof androidx.compose.runtime.X1     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L26
            androidx.compose.runtime.X1 r1 = (androidx.compose.runtime.X1) r1     // Catch: java.lang.Throwable -> L2b
            goto L42
        L3a:
            int r2 = kotlin.Z.f406624c
            kotlin.Z$b r2 = new kotlin.Z$b
            r2.<init>(r1)
            r1 = r2
        L42:
            int r2 = kotlin.Z.f406624c
            boolean r2 = r1 instanceof kotlin.Z.b
            if (r2 == 0) goto L49
            goto L4a
        L49:
            r0 = r1
        L4a:
            androidx.compose.runtime.X1 r0 = (androidx.compose.runtime.X1) r0
            if (r0 != 0) goto L54
            androidx.lifecycle.compose.G$a r0 = androidx.view.compose.C23005G.a.f46735l
            androidx.compose.runtime.J3 r0 = androidx.compose.runtime.S.d(r0)
        L54:
            androidx.view.compose.C23005G.f46734a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.view.compose.C23005G.<clinit>():void");
    }
}
