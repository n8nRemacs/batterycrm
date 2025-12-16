package androidx.compose.material3;

import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: SnackbarHost.kt */
@androidx.compose.runtime.F3
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Landroidx/compose/material3/mg;", "", "<init>", "()V", "a", "b", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.material3.mg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21729mg {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final kotlinx.coroutines.sync.d f36840a = new kotlinx.coroutines.sync.d();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f36841b = C22126m3.g(null);

    /* compiled from: SnackbarHost.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/mg$a;", "Landroidx/compose/material3/Xf;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.mg$a */
    public static final class a implements Xf {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Cg f36842a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final kotlinx.coroutines.r f36843b;

        public a(@Y61.k Cg cg2, @Y61.k kotlinx.coroutines.r rVar) {
            this.f36842a = cg2;
            this.f36843b = rVar;
        }

        @Override // androidx.compose.material3.Xf
        @Y61.k
        /* renamed from: a, reason: from getter */
        public final Cg getF36842a() {
            return this.f36842a;
        }

        @Override // androidx.compose.material3.Xf
        public final void b() {
            kotlinx.coroutines.r rVar = this.f36843b;
            if (rVar.isActive()) {
                int i12 = kotlin.Z.f406624c;
                rVar.resumeWith(SnackbarResult.f35443c);
            }
        }

        @Override // androidx.compose.material3.Xf
        public final void dismiss() {
            kotlinx.coroutines.r rVar = this.f36843b;
            if (rVar.isActive()) {
                int i12 = kotlin.Z.f406624c;
                rVar.resumeWith(SnackbarResult.f35442b);
            }
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.L.f(this.f36842a, aVar.f36842a) && this.f36843b.equals(aVar.f36843b);
        }

        public final int hashCode() {
            return this.f36843b.hashCode() + (this.f36842a.hashCode() * 31);
        }
    }

    /* compiled from: SnackbarHost.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/mg$b;", "Landroidx/compose/material3/Cg;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.mg$b */
    public static final class b implements Cg {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f36844a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final SnackbarDuration f36845b;

        public b(@Y61.k String str, @Y61.k SnackbarDuration snackbarDuration) {
            this.f36844a = str;
            this.f36845b = snackbarDuration;
        }

        @Override // androidx.compose.material3.Cg
        @Y61.l
        public final String a() {
            return null;
        }

        @Override // androidx.compose.material3.Cg
        public final boolean b() {
            return false;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.L.f(this.f36844a, bVar.f36844a) && kotlin.jvm.internal.L.f(null, null) && this.f36845b == bVar.f36845b;
        }

        @Override // androidx.compose.material3.Cg
        @Y61.k
        /* renamed from: getDuration, reason: from getter */
        public final SnackbarDuration getF36845b() {
            return this.f36845b;
        }

        @Override // androidx.compose.material3.Cg
        @Y61.k
        /* renamed from: getMessage, reason: from getter */
        public final String getF36844a() {
            return this.f36844a;
        }

        public final int hashCode() {
            return this.f36845b.hashCode() + androidx.appcompat.app.r.i(this.f36844a.hashCode() * 961, 31, false);
        }
    }

    public static Object b(C21729mg c21729mg, String str, Continuation continuation) {
        SnackbarDuration snackbarDuration = SnackbarDuration.f35440b;
        c21729mg.getClass();
        return c21729mg.a(new b(str, snackbarDuration), (ContinuationImpl) continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r9v0, types: [androidx.compose.material3.Cg, kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r9v9, types: [kotlinx.coroutines.sync.a] */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k androidx.compose.material3.Cg r9, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof androidx.compose.material3.C21752ng
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.material3.ng r0 = (androidx.compose.material3.C21752ng) r0
            int r1 = r0.f36913w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36913w = r1
            goto L18
        L13:
            androidx.compose.material3.ng r0 = new androidx.compose.material3.ng
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f36911u
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f36913w
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L49
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            kotlinx.coroutines.sync.a r9 = r0.f36909s
            androidx.compose.material3.mg r0 = r0.f36907q
            kotlin.C42729a0.b(r10)     // Catch: java.lang.Throwable -> L32
            goto L9b
        L32:
            r10 = move-exception
            goto La6
        L35:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3d:
            kotlinx.coroutines.sync.a r9 = r0.f36909s
            androidx.compose.material3.Cg r2 = r0.f36908r
            androidx.compose.material3.mg r6 = r0.f36907q
            kotlin.C42729a0.b(r10)
            r10 = r9
            r9 = r2
            goto L5e
        L49:
            kotlin.C42729a0.b(r10)
            kotlinx.coroutines.sync.d r10 = r8.f36840a
            r0.f36907q = r8
            r0.f36908r = r9
            r0.f36909s = r10
            r0.f36913w = r4
            java.lang.Object r2 = r10.b(r0)
            if (r2 != r1) goto L5d
            return r1
        L5d:
            r6 = r8
        L5e:
            r0.f36907q = r6     // Catch: java.lang.Throwable -> L8e
            r0.f36908r = r9     // Catch: java.lang.Throwable -> L8e
            r0.f36909s = r10     // Catch: java.lang.Throwable -> L8e
            r0.f36910t = r0     // Catch: java.lang.Throwable -> L8e
            r0.f36913w = r3     // Catch: java.lang.Throwable -> L8e
            kotlinx.coroutines.r r2 = new kotlinx.coroutines.r     // Catch: java.lang.Throwable -> L8e
            kotlin.coroutines.Continuation r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r0)     // Catch: java.lang.Throwable -> L8e
            r2.<init>(r4, r3)     // Catch: java.lang.Throwable -> L8e
            r2.p()     // Catch: java.lang.Throwable -> L8e
            androidx.compose.material3.mg$a r3 = new androidx.compose.material3.mg$a     // Catch: java.lang.Throwable -> L8e
            r3.<init>(r9, r2)     // Catch: java.lang.Throwable -> L8e
            androidx.compose.runtime.y1 r9 = r6.f36841b     // Catch: java.lang.Throwable -> L8e
            androidx.compose.runtime.i3 r9 = (androidx.compose.runtime.C22082i3) r9     // Catch: java.lang.Throwable -> L8e
            r9.setValue(r3)     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r9 = r2.o()     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()     // Catch: java.lang.Throwable -> L8e
            if (r9 != r2) goto L94
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r0)     // Catch: java.lang.Throwable -> L8e
            goto L94
        L8e:
            r9 = move-exception
            r0 = r6
            r7 = r10
            r10 = r9
            r9 = r7
            goto La6
        L94:
            if (r9 != r1) goto L97
            return r1
        L97:
            r0 = r6
            r7 = r10
            r10 = r9
            r9 = r7
        L9b:
            androidx.compose.runtime.y1 r0 = r0.f36841b     // Catch: java.lang.Throwable -> Lae
            androidx.compose.runtime.i3 r0 = (androidx.compose.runtime.C22082i3) r0     // Catch: java.lang.Throwable -> Lae
            r0.setValue(r5)     // Catch: java.lang.Throwable -> Lae
            r9.d(r5)
            return r10
        La6:
            androidx.compose.runtime.y1 r0 = r0.f36841b     // Catch: java.lang.Throwable -> Lae
            androidx.compose.runtime.i3 r0 = (androidx.compose.runtime.C22082i3) r0     // Catch: java.lang.Throwable -> Lae
            r0.setValue(r5)     // Catch: java.lang.Throwable -> Lae
            throw r10     // Catch: java.lang.Throwable -> Lae
        Lae:
            r10 = move-exception
            r9.d(r5)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.C21729mg.a(androidx.compose.material3.Cg, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
