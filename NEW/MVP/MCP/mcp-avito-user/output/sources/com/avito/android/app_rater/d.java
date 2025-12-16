package com.avito.android.app_rater;

import Y41.p;
import Y41.q;
import Y61.k;
import Y61.l;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.util.V2;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.InterfaceC43172j;
import sd.C48160a;

/* compiled from: AppRaterLauncherImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.app_rater.AppRaterLauncherImpl$launch$2", f = "AppRaterLauncherImpl.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class d extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f91785q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.app_rater.interactor.d f91786r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ActivityC22955m f91787s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.app_rater.b f91788t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f91789u;

    /* compiled from: AppRaterLauncherImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "", "it", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.app_rater.AppRaterLauncherImpl$launch$2$1", f = "AppRaterLauncherImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements q<InterfaceC43172j<? super G0>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Throwable f91790q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.app_rater.b f91791r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f91792s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.avito.android.app_rater.b bVar, String str, Continuation<? super a> continuation) {
            super(3, continuation);
            this.f91791r = bVar;
            this.f91792s = str;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super G0> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            String str = this.f91792s;
            a aVar = new a(this.f91791r, str, continuation);
            aVar.f91790q = th2;
            return aVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            Throwable th2 = this.f91790q;
            String message = th2.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            this.f91791r.f91778a.c(new C48160a(this.f91792s, message));
            V2.f318762a.a("App rater", message, th2);
            return G0.f406611a;
        }
    }

    /* compiled from: AppRaterLauncherImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "emit", "(Lkotlin/G0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T> f91793b = new b<>();

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            V2.f318762a.g("App rater", "Success");
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.avito.android.app_rater.interactor.d dVar, ActivityC22955m activityC22955m, com.avito.android.app_rater.b bVar, String str, Continuation continuation) {
        super(2, continuation);
        this.f91786r = dVar;
        this.f91787s = activityC22955m;
        this.f91788t = bVar;
        this.f91789u = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new d(this.f91786r, this.f91787s, this.f91788t, this.f91789u, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f91785q;
        if (i12 == 0) {
            C42729a0.b(obj);
            C43152f0 c43152f0 = new C43152f0(this.f91786r.c(this.f91787s), new a(this.f91788t, this.f91789u, null));
            InterfaceC43172j<? super Object> interfaceC43172j = b.f91793b;
            this.f91785q = 1;
            if (c43152f0.collect(interfaceC43172j, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
