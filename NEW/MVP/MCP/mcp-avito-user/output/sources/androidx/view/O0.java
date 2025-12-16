package androidx.view;

import X41.j;
import Y61.k;
import Y61.l;
import androidx.view.M0;
import androidx.view.P0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.reflect.d;
import z1.AbstractC50339a;

/* compiled from: ViewModelLazy.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Landroidx/lifecycle/O0;", "Landroidx/lifecycle/M0;", "VM", "Lkotlin/C;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class O0<VM extends M0> implements InterfaceC42726C<VM> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final d<VM> f46686b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Y41.a<S0> f46687c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Y41.a<P0.c> f46688d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Y41.a<AbstractC50339a> f46689e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public VM f46690f;

    /* compiled from: ViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a$a;", "invoke", "()Lz1/a$a;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class a extends N implements Y41.a<AbstractC50339a.C12939a> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f46691l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a.C12939a invoke() {
            return AbstractC50339a.C12939a.f443748b;
        }
    }

    @j
    public O0() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @j
    public O0(@k d<VM> dVar, @k Y41.a<? extends S0> aVar, @k Y41.a<? extends P0.c> aVar2, @k Y41.a<? extends AbstractC50339a> aVar3) {
        this.f46686b = dVar;
        this.f46687c = aVar;
        this.f46688d = aVar2;
        this.f46689e = aVar3;
    }

    @Override // kotlin.InterfaceC42726C
    public final Object getValue() {
        VM vm2 = this.f46690f;
        if (vm2 != null) {
            return vm2;
        }
        S0 s0Invoke = this.f46687c.invoke();
        P0.c cVarInvoke = this.f46688d.invoke();
        AbstractC50339a abstractC50339aInvoke = this.f46689e.invoke();
        P0.f46692b.getClass();
        VM vm3 = (VM) new P0(s0Invoke, cVarInvoke, abstractC50339aInvoke).c(this.f46686b);
        this.f46690f = vm3;
        return vm3;
    }

    @Override // kotlin.InterfaceC42726C
    public final boolean isInitialized() {
        return this.f46690f != null;
    }

    public /* synthetic */ O0(d dVar, Y41.a aVar, Y41.a aVar2, Y41.a aVar3, int i12, C42822w c42822w) {
        this(dVar, aVar, aVar2, (i12 & 8) != 0 ? a.f46691l : aVar3);
    }
}
