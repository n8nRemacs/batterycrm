package com.avito.android.user_adverts.root_screen.adverts_host.host_view;

import androidx.viewpager2.widget.ViewPager2;
import com.avito.android.user_adverts.root_screen.adverts_host.host_view.j;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;

/* compiled from: HostViewRenderer.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.host_view.UserAdvertsHostViewRenderer$awaitCurrentItem$2", f = "HostViewRenderer.kt", i = {}, l = {757}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class m extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f313073q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ j f313074r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ViewPager2 f313075s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f313076t;

    /* compiled from: HostViewRenderer.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "position", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ int f313077l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ j f313078m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.r f313079n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i12, j jVar, kotlinx.coroutines.r rVar) {
            super(1);
            this.f313077l = i12;
            this.f313078m = jVar;
            this.f313079n = rVar;
        }

        @Override // Y41.l
        public final G0 invoke(Integer num) {
            if (num.intValue() == this.f313077l) {
                this.f313078m.f313034p.a();
                int i12 = Z.f406624c;
                this.f313079n.resumeWith(G0.f406611a);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: HostViewRenderer.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<Throwable, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ j f313080l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(j jVar) {
            super(1);
            this.f313080l = jVar;
        }

        @Override // Y41.l
        public final G0 invoke(Throwable th2) {
            this.f313080l.f313034p.a();
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(j jVar, ViewPager2 viewPager2, int i12, Continuation<? super m> continuation) {
        super(2, continuation);
        this.f313074r = jVar;
        this.f313075s = viewPager2;
        this.f313076t = i12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new m(this.f313074r, this.f313075s, this.f313076t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((m) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f313073q;
        if (i12 == 0) {
            C42729a0.b(obj);
            j jVar = this.f313074r;
            ViewPager2 viewPager2 = this.f313075s;
            this.f313073q = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(1, IntrinsicsKt.intercepted(this));
            rVar.p();
            j.c cVar = jVar.f313034p;
            int i13 = this.f313076t;
            cVar.f313045d = new a(i13, jVar, rVar);
            rVar.r(new b(jVar));
            viewPager2.setCurrentItem(i13);
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
