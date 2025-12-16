package com.avito.android.user_adverts.tab_screens.adverts.tooltip;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;

/* compiled from: UserAdvertsTooltipsPlayer.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "", "<anonymous>", "(Lkotlinx/coroutines/T;)I"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.tab_screens.adverts.tooltip.UserAdvertsTooltipsPlayer$awaitItemPositionExist$2", f = "UserAdvertsTooltipsPlayer.kt", i = {}, l = {346}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.user_adverts.tab_screens.adverts.tooltip.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C35699i extends SuspendLambda implements Y41.p<T, Continuation<? super Integer>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f315644q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ RecyclerView.Adapter<?> f315645r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C35695e f315646s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f315647t;

    /* compiled from: UserAdvertsTooltipsPlayer.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.user_adverts.tab_screens.adverts.tooltip.i$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<Throwable, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.Adapter<?> f315648l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ b f315649m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(RecyclerView.Adapter<?> adapter, b bVar) {
            super(1);
            this.f315648l = adapter;
            this.f315649m = bVar;
        }

        @Override // Y41.l
        public final G0 invoke(Throwable th2) {
            this.f315648l.unregisterAdapterDataObserver(this.f315649m);
            return G0.f406611a;
        }
    }

    /* compiled from: UserAdvertsTooltipsPlayer.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/user_adverts/tab_screens/adverts/tooltip/i$b", "Landroidx/recyclerview/widget/RecyclerView$g;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.user_adverts.tab_screens.adverts.tooltip.i$b */
    public static final class b extends RecyclerView.g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C35695e f315650a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.Adapter<?> f315651b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f315652c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.r f315653d;

        public b(C35695e c35695e, RecyclerView.Adapter adapter, long j12, kotlinx.coroutines.r rVar) {
            this.f315650a = c35695e;
            this.f315651b = adapter;
            this.f315652c = j12;
            this.f315653d = rVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void b(int i12, int i13) {
            int i14 = C35695e.f315633d;
            this.f315650a.getClass();
            RecyclerView.Adapter<?> adapter = this.f315651b;
            int iD2 = C35695e.d(adapter, this.f315652c, i12, i13 + i12);
            if (iD2 != -1) {
                adapter.unregisterAdapterDataObserver(this);
                Integer numValueOf = Integer.valueOf(iD2);
                int i15 = Z.f406624c;
                this.f315653d.resumeWith(numValueOf);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void d(int i12, int i13) {
            int i14 = C35695e.f315633d;
            this.f315650a.getClass();
            RecyclerView.Adapter<?> adapter = this.f315651b;
            int iD2 = C35695e.d(adapter, this.f315652c, i12, i13 + i12);
            if (iD2 != -1) {
                adapter.unregisterAdapterDataObserver(this);
                Integer numValueOf = Integer.valueOf(iD2);
                int i15 = Z.f406624c;
                this.f315653d.resumeWith(numValueOf);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35699i(RecyclerView.Adapter<?> adapter, C35695e c35695e, long j12, Continuation<? super C35699i> continuation) {
        super(2, continuation);
        this.f315645r = adapter;
        this.f315646s = c35695e;
        this.f315647t = j12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C35699i(this.f315645r, this.f315646s, this.f315647t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super Integer> continuation) {
        return ((C35699i) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f315644q;
        if (i12 == 0) {
            C42729a0.b(obj);
            RecyclerView.Adapter<?> adapter = this.f315645r;
            C35695e c35695e = this.f315646s;
            this.f315644q = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(1, IntrinsicsKt.intercepted(this));
            rVar.p();
            b bVar = new b(c35695e, adapter, this.f315647t, rVar);
            rVar.r(new a(adapter, bVar));
            adapter.registerAdapterDataObserver(bVar);
            obj = rVar.o();
            if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(this);
            }
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return obj;
    }
}
