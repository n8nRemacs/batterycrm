package androidx.compose.runtime.saveable;

import androidx.compose.runtime.B2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.saveable.r;
import androidx.compose.runtime.snapshots.C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: RememberSaveable.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/saveable/k;", "T", "Landroidx/compose/runtime/saveable/x;", "Landroidx/compose/runtime/B2;", "runtime-saveable_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class k<T> implements x, B2 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public u<T, Object> f38574b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public r f38575c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public String f38576d;

    /* renamed from: e, reason: collision with root package name */
    public T f38577e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public Object[] f38578f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public r.a f38579g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Y41.a<Object> f38580h = new a(this);

    /* compiled from: RememberSaveable.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "T", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<Object> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ k<T> f38581l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k<T> kVar) {
            super(0);
            this.f38581l = kVar;
        }

        @Override // Y41.a
        public final Object invoke() {
            k<T> kVar = this.f38581l;
            u<T, Object> uVar = kVar.f38574b;
            T t12 = kVar.f38577e;
            if (t12 != null) {
                return uVar.a(kVar, t12);
            }
            throw new IllegalArgumentException("Value should be initialized");
        }
    }

    public k(@Y61.k u<T, Object> uVar, @Y61.l r rVar, @Y61.k String str, T t12, @Y61.k Object[] objArr) {
        this.f38574b = uVar;
        this.f38575c = rVar;
        this.f38576d = str;
        this.f38577e = t12;
        this.f38578f = objArr;
    }

    @Override // androidx.compose.runtime.saveable.x
    public final boolean a(@Y61.k Object obj) {
        r rVar = this.f38575c;
        return rVar == null || rVar.a(obj);
    }

    @Override // androidx.compose.runtime.B2
    public final void b() {
        r.a aVar = this.f38579g;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // androidx.compose.runtime.B2
    public final void c() {
        d();
    }

    public final void d() {
        String strA;
        r rVar = this.f38575c;
        if (this.f38579g != null) {
            throw new IllegalArgumentException(("entry(" + this.f38579g + ") is not null").toString());
        }
        if (rVar != null) {
            Y41.a<? extends Object> aVar = this.f38580h;
            Object objInvoke = ((a) aVar).invoke();
            if (objInvoke == null || rVar.a(objInvoke)) {
                this.f38579g = rVar.d(this.f38576d, aVar);
                return;
            }
            if (objInvoke instanceof C) {
                C c12 = (C) objInvoke;
                if (c12.h() == C22126m3.h() || c12.h() == C22126m3.o() || c12.h() == C22126m3.l()) {
                    strA = "MutableState containing " + c12.getF42167b() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    strA = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                strA = j.a(objInvoke);
            }
            throw new IllegalArgumentException(strA);
        }
    }

    @Override // androidx.compose.runtime.B2
    public final void e() {
        r.a aVar = this.f38579g;
        if (aVar != null) {
            aVar.a();
        }
    }
}
