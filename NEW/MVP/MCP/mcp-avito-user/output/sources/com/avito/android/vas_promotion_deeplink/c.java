package com.avito.android.vas_promotion_deeplink;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.vas_promotion_deeplink.b;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import nM0.InterfaceC44292a;
import oM0.C44666a;

/* compiled from: VasPromotionDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.vas_promotion_deeplink.VasPromotionDeepLinkHandler$doHandleSuspend$2", f = "VasPromotionDeepLinkHandler.kt", i = {}, l = {AvailableCode.APP_IS_BACKGROUND_OR_LOCKED, 34, 45}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f323068q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.vas_promotion_deeplink.b f323069r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ VasPromotionDeepLink f323070s;

    /* compiled from: VasPromotionDeepLinkHandler.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.vas_promotion_deeplink.VasPromotionDeepLinkHandler$doHandleSuspend$2$1", f = "VasPromotionDeepLinkHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.vas_promotion_deeplink.b f323071q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ TypedResult.Success f323072r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.avito.android.vas_promotion_deeplink.b bVar, TypedResult.Success success, Continuation continuation) {
            super(2, continuation);
            this.f323071q = bVar;
            this.f323072r = success;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return new a(this.f323071q, this.f323072r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            b.a.C9983a c9983a = b.a.C9983a.f323066b;
            com.avito.android.vas_promotion_deeplink.b bVar = this.f323071q;
            bVar.i(c9983a, bVar.f323064j, ((C44666a) this.f323072r.getResult()).getUrl());
            bVar.f323062h.g(bVar.d(), false);
            return G0.f406611a;
        }
    }

    /* compiled from: VasPromotionDeepLinkHandler.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.vas_promotion_deeplink.VasPromotionDeepLinkHandler$doHandleSuspend$2$2", f = "VasPromotionDeepLinkHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.vas_promotion_deeplink.b f323073q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ TypedResult.Error f323074r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.avito.android.vas_promotion_deeplink.b bVar, TypedResult.Error error, Continuation continuation) {
            super(2, continuation);
            this.f323073q = bVar;
            this.f323074r = error;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return new b(this.f323073q, this.f323074r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            com.avito.android.vas_promotion_deeplink.b bVar = this.f323073q;
            a.i iVar = bVar.f323061g;
            TypedResult.Error error = this.f323074r;
            a.i.C4057a.d(iVar, com.avito.android.printable_text.b.f(error.getError().getF244063c()), null, null, new f.c(error.getError()), 0, ToastBarPosition.f181046d, null, null, 1966);
            bVar.j(b.a.C9984b.f323067b);
            bVar.f323062h.g(bVar.d(), false);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.avito.android.vas_promotion_deeplink.b bVar, VasPromotionDeepLink vasPromotionDeepLink, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f323069r = bVar;
        this.f323070s = vasPromotionDeepLink;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new c(this.f323069r, this.f323070s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f323068q;
        com.avito.android.vas_promotion_deeplink.b bVar = this.f323069r;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC44292a interfaceC44292a = bVar.f323065k;
            VasPromotionDeepLink vasPromotionDeepLink = this.f323070s;
            long j12 = vasPromotionDeepLink.f323059b;
            this.f323068q = 1;
            obj = interfaceC44292a.a(vasPromotionDeepLink.f323060c, j12, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2 && i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            C42729a0.b(obj);
        }
        TypedResult typedResult = (TypedResult) obj;
        if (typedResult instanceof TypedResult.Success) {
            CoroutineContext coroutineContext = bVar.f134492f.f411905b;
            a aVar = new a(bVar, (TypedResult.Success) typedResult, null);
            this.f323068q = 2;
            if (C43259k.g(coroutineContext, aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (typedResult instanceof TypedResult.Error) {
            CoroutineContext coroutineContext2 = bVar.f134492f.f411905b;
            b bVar2 = new b(bVar, (TypedResult.Error) typedResult, null);
            this.f323068q = 3;
            if (C43259k.g(coroutineContext2, bVar2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return G0.f406611a;
    }
}
