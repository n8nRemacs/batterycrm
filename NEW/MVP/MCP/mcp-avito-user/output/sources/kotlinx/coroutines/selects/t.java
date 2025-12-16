package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.internal.a0;

/* compiled from: Select.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*Â\u0001\b\u0007\u0010\f\"[\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0006\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u00002[\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0006\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u0000B\u0002\b\u000b*¦\u0001\b\u0007\u0010\u000f\"M\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\r\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0006\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00002M\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\r\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0006\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0000B\u0002\b\u000b*¦\u0001\b\u0007\u0010\u0010\"M\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\r\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\n0\u00002M\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\r\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\n0\u0000B\u0002\b\u000b¨\u0006\u0011"}, d2 = {"Lkotlin/Function3;", "Lkotlinx/coroutines/selects/r;", "Lkotlin/S;", "name", "select", "", "param", "internalResult", "Lkotlin/Function1;", "", "Lkotlin/G0;", "Lkotlinx/coroutines/I0;", "OnCancellationConstructor", "clauseObject", "clauseResult", "ProcessResultFunction", "RegistrationFunction", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<Object, Object, Object, Object> f412236a = a.f412242l;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a0 f412237b = new a0("STATE_REG");

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a0 f412238c = new a0("STATE_COMPLETED");

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a0 f412239d = new a0("STATE_CANCELLED");

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a0 f412240e = new a0("NO_RESULT");

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final a0 f412241f = new a0("PARAM_CLAUSE_0");

    /* compiled from: Select.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "<anonymous parameter 2>", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.q {

        /* renamed from: l, reason: collision with root package name */
        public static final a f412242l = new a();

        public a() {
            super(3);
        }

        @Override // Y41.q
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return null;
        }
    }
}
