package androidx.compose.runtime;

import kotlin.Metadata;

/* compiled from: Recomposer.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/z1;", "", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.runtime.z1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22208z1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final androidx.collection.R0<Object, Object> f38806a = androidx.compose.runtime.collection.d.c();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final androidx.collection.R0<Object, Object> f38807b = androidx.compose.runtime.collection.d.c();

    /* compiled from: Recomposer.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/runtime/A1;", "it", "", "invoke", "(Landroidx/compose/runtime/A1;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.runtime.z1$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<A1, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C22183t1 f38808l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C22183t1 c22183t1) {
            super(1);
            this.f38808l = c22183t1;
        }

        @Override // Y41.l
        public final Boolean invoke(A1 a12) {
            return Boolean.valueOf(kotlin.jvm.internal.L.f(a12.f37870b, this.f38808l));
        }
    }

    public final void a(@Y61.k C22183t1 c22183t1) {
        Object objE = this.f38807b.e(c22183t1);
        if (objE != null) {
            boolean z12 = objE instanceof androidx.collection.N0;
            androidx.collection.R0<Object, Object> r02 = this.f38806a;
            if (!z12) {
                androidx.compose.runtime.collection.d.e(r02, (Y0) objE, new a(c22183t1));
                return;
            }
            androidx.collection.Z0 z02 = (androidx.collection.Z0) objE;
            Object[] objArr = z02.f25659a;
            int i12 = z02.f25660b;
            for (int i13 = 0; i13 < i12; i13++) {
                androidx.compose.runtime.collection.d.e(r02, (Y0) objArr[i13], new a(c22183t1));
            }
        }
    }
}
