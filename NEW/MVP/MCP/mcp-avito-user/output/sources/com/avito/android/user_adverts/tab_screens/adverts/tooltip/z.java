package com.avito.android.user_adverts.tab_screens.adverts.tooltip;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.user_adverts_views_pub.c;
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
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u0002H\u008a@¨\u0006\u0003"}, d2 = {"Landroidx/recyclerview/widget/RecyclerView$C;", "T", "Lkotlinx/coroutines/T;", "com/avito/android/user_adverts/tab_screens/adverts/tooltip/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.tab_screens.adverts.tooltip.UserAdvertsTooltipsPlayer$awaitViewHolder$2", f = "UserAdvertsTooltipsPlayer.kt", i = {}, l = {346}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class z extends SuspendLambda implements Y41.p<T, Continuation<? super c.b>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f315714q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f315715r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f315716s;

    /* compiled from: UserAdvertsTooltipsPlayer.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/recyclerview/widget/RecyclerView$C;", "T", "", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "com/avito/android/user_adverts/tab_screens/adverts/tooltip/l$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<Throwable, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ RecyclerView f315720l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ a f315721m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(RecyclerView recyclerView, a aVar) {
            super(1);
            this.f315720l = recyclerView;
            this.f315721m = aVar;
        }

        @Override // Y41.l
        public final G0 invoke(Throwable th2) {
            this.f315720l.t0(this.f315721m);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(RecyclerView recyclerView, int i12, Continuation continuation) {
        super(2, continuation);
        this.f315715r = recyclerView;
        this.f315716s = i12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new z(this.f315715r, this.f315716s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super c.b> continuation) {
        return ((z) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f315714q;
        if (i12 == 0) {
            C42729a0.b(obj);
            RecyclerView recyclerView = this.f315715r;
            this.f315714q = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(1, IntrinsicsKt.intercepted(this));
            rVar.p();
            a aVar = new a(recyclerView, this.f315716s, rVar);
            rVar.r(new b(recyclerView, aVar));
            recyclerView.m(aVar);
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

    /* compiled from: UserAdvertsTooltipsPlayer.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/user_adverts/tab_screens/adverts/tooltip/l$b", "Landroidx/recyclerview/widget/RecyclerView$o;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements RecyclerView.o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ RecyclerView f315717b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f315718c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.r f315719d;

        public a(RecyclerView recyclerView, int i12, kotlinx.coroutines.r rVar) {
            this.f315717b = recyclerView;
            this.f315718c = i12;
            this.f315719d = rVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public final void j(@Y61.k View view) {
            RecyclerView recyclerView = this.f315717b;
            RecyclerView.C cL2 = recyclerView.L(view);
            if (!(cL2 instanceof c.b)) {
                cL2 = null;
            }
            c.b bVar = (c.b) cL2;
            if (bVar == null || bVar.getBindingAdapterPosition() != this.f315718c) {
                return;
            }
            recyclerView.t0(this);
            int i12 = Z.f406624c;
            this.f315719d.resumeWith(bVar);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public final void d(@Y61.k View view) {
        }
    }
}
