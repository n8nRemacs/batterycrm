package com.avito.android.user_advert.advert.delegate.machinery_rental_banner;

import Ju.InterfaceC14249c;
import Y41.p;
import Y61.k;
import Y61.l;
import android.os.Bundle;
import com.avito.android.beduin.v2.page.m;
import com.avito.android.deep_linking.links.BeduinUniversalPageLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.error.z;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.adverts.MyAdvertDetails;
import com.avito.android.user_advert.advert.delegate.machinery_rental_banner.b;
import com.avito.android.util.ApiException;
import com.avito.android.util.C35936s;
import com.avito.android.util.R0;
import com.avito.android.util.V2;
import fH0.AbstractC40291a;
import fH0.InterfaceC40292b;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.P0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.rx3.y;
import kotlinx.coroutines.t1;
import kv.C43501a;
import l41.r;

/* compiled from: MachineryRentalBannerDelegate.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/advert/delegate/machinery_rental_banner/c;", "LfH0/a;", "Lcom/avito/android/user_advert/advert/delegate/machinery_rental_banner/a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c extends AbstractC40291a implements com.avito.android.user_advert.advert.delegate.machinery_rental_banner.a {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f308656d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.android.user_advert.advert.items.machinery_rental_banner.c f308657e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final C43238h f308658f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f308659g;

    /* compiled from: MachineryRentalBannerDelegate.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_advert.advert.delegate.machinery_rental_banner.MachineryRentalBannerDelegateImpl$1", f = "MachineryRentalBannerDelegate.kt", i = {}, l = {44}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f308660q;

        /* compiled from: MachineryRentalBannerDelegate.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "it", "", "test", "(Lkv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.user_advert.advert.delegate.machinery_rental_banner.c$a$a, reason: collision with other inner class name */
        public static final class C9471a<T> implements r {

            /* renamed from: b, reason: collision with root package name */
            public static final C9471a<T> f308662b = new C9471a<>();

            @Override // l41.r
            public final boolean test(Object obj) {
                return L.f(((C43501a) obj).f413260a.f134521b, "machinery_rental_navigation_action_key");
            }
        }

        /* compiled from: MachineryRentalBannerDelegate.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "event", "Lkotlin/G0;", "emit", "(Lkv/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class b<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f308663b;

            public b(c cVar) {
                this.f308663b = cVar;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                boolean z12;
                C43501a c43501a = (C43501a) obj;
                InterfaceC14249c interfaceC14249c = c43501a.f413261b;
                c cVar = this.f308663b;
                cVar.getClass();
                boolean z13 = interfaceC14249c instanceof m.c;
                com.jakewharton.rxrelay3.c<InterfaceC40292b> cVar2 = cVar.f395801b;
                if (z13 || (interfaceC14249c instanceof BeduinUniversalPageLink.b.C3987b)) {
                    InterfaceC14249c interfaceC14249c2 = c43501a.f413261b;
                    if (interfaceC14249c2 instanceof m.c) {
                        Bundle bundle = ((m.c) interfaceC14249c2).f105170b;
                        z12 = Boolean.parseBoolean(bundle != null ? bundle.getString("isAdvertisementReloadNeeded") : null);
                    } else if (interfaceC14249c2 instanceof BeduinUniversalPageLink.b.C3987b) {
                        Object objD = P0.d(((BeduinUniversalPageLink.b.C3987b) interfaceC14249c2).f133046b, "isAdvertisementReloadNeeded");
                        z12 = Boolean.parseBoolean(objD instanceof String ? (String) objD : null);
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        cVar2.accept(b.C9470b.f308652a);
                    }
                } else if (cVar.f308659g) {
                    cVar2.accept(b.C9470b.f308652a);
                }
                return G0.f406611a;
            }
        }

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return c.this.new a(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f308660q;
            if (i12 == 0) {
                C42729a0.b(obj);
                c cVar = c.this;
                InterfaceC43160i interfaceC43160iA = y.a(cVar.f308656d.d9().N(C9471a.f308662b));
                b bVar = new b(cVar);
                this.f308660q = 1;
                if (((AbstractC43168f) interfaceC43160iA).collect(bVar, this) == coroutine_suspended) {
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

    /* compiled from: MachineryRentalBannerDelegate.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_advert.advert.delegate.machinery_rental_banner.MachineryRentalBannerDelegateImpl$sendBannerDismissed$1", f = "MachineryRentalBannerDelegate.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f308664q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f308666s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f308666s = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return c.this.new b(this.f308666s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f308664q;
            if (i12 == 0) {
                C42729a0.b(obj);
                com.avito.android.user_advert.advert.items.machinery_rental_banner.c cVar = c.this.f308657e;
                this.f308664q = 1;
                if (cVar.a(this.f308666s, this) == coroutine_suspended) {
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

    /* compiled from: MachineryRentalBannerDelegate.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_advert.advert.delegate.machinery_rental_banner.MachineryRentalBannerDelegateImpl$setMachineryRentalEnabled$1", f = "MachineryRentalBannerDelegate.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.user_advert.advert.delegate.machinery_rental_banner.c$c, reason: collision with other inner class name */
    public static final class C9472c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f308667q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ boolean f308669s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.user_advert.advert.items.machinery_rental_banner.e f308670t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9472c(boolean z12, com.avito.android.user_advert.advert.items.machinery_rental_banner.e eVar, Continuation<? super C9472c> continuation) {
            super(2, continuation);
            this.f308669s = z12;
            this.f308670t = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return c.this.new C9472c(this.f308669s, this.f308670t, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((C9472c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f308667q;
            com.avito.android.user_advert.advert.items.machinery_rental_banner.e eVar = this.f308670t;
            c cVar = c.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                com.avito.android.user_advert.advert.items.machinery_rental_banner.c cVar2 = cVar.f308657e;
                String str = eVar.f309583c;
                this.f308667q = 1;
                obj = cVar2.b(str, this.f308669s, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            TypedResult typedResult = (TypedResult) obj;
            if (typedResult instanceof TypedResult.Success) {
                ((TypedResult.Success) typedResult).getResult();
                cVar.f395801b.accept(b.C9470b.f308652a);
            } else {
                if (!(typedResult instanceof TypedResult.Error)) {
                    throw new NoWhenBranchMatchedException();
                }
                TypedResult.Error error = (TypedResult.Error) typedResult;
                ApiException apiExceptionA = C35936s.a(error.getError(), error.getCause());
                V2.f318762a.f(apiExceptionA);
                cVar.f395801b.accept(new b.c(z.l(apiExceptionA), com.avito.android.user_advert.advert.items.machinery_rental_banner.e.a(eVar, false)));
            }
            return G0.f406611a;
        }
    }

    @Inject
    public c(@k com.avito.android.deeplink_handler.handler.composite.a aVar, @k com.avito.android.user_advert.advert.items.machinery_rental_banner.c cVar, @k R0 r02) {
        this.f308656d = aVar;
        this.f308657e = cVar;
        C43238h c43238hA = U.a(CoroutineContext.Element.DefaultImpls.plus((V0) t1.b(), r02.b()));
        this.f308658f = c43238hA;
        C43259k.d(c43238hA, null, null, new a(null), 3);
    }

    @Override // com.avito.android.user_advert.advert.delegate.machinery_rental_banner.a
    public final void J(@k com.avito.android.user_advert.advert.items.machinery_rental_banner.e eVar) {
        MyAdvertDetails.MachineryRentalBanner.ActionButton actionButton = eVar.f309584d.getActionButton();
        if (actionButton == null) {
            return;
        }
        DeepLink deepLink = actionButton.getDeepLink();
        Boolean isEnableButton = actionButton.getIsEnableButton();
        Boolean bool = Boolean.TRUE;
        if (L.f(isEnableButton, bool)) {
            S(eVar, true);
            return;
        }
        if (L.f(actionButton.getIsDisableButton(), bool)) {
            S(eVar, false);
        } else {
            if (deepLink == null || (deepLink instanceof NoMatchLink)) {
                return;
            }
            Boolean isNeedRefresh = actionButton.getIsNeedRefresh();
            this.f308659g = isNeedRefresh != null ? isNeedRefresh.booleanValue() : false;
            b.a.a(this.f308656d, deepLink, "machinery_rental_navigation_action_key", null, 4);
        }
    }

    public final void S(com.avito.android.user_advert.advert.items.machinery_rental_banner.e eVar, boolean z12) {
        this.f395801b.accept(new b.d(com.avito.android.user_advert.advert.items.machinery_rental_banner.e.a(eVar, true)));
        C43259k.d(this.f308658f, null, null, new C9472c(z12, eVar, null), 3);
    }

    @Override // fH0.AbstractC40291a, io.reactivex.rxjava3.disposables.d
    public final void dispose() {
        super.dispose();
        U.b(this.f308658f, null);
    }

    @Override // com.avito.android.user_advert.advert.delegate.machinery_rental_banner.a
    public final void z(@k String str) {
        C43259k.d(this.f308658f, null, null, new b(str, null), 3);
        this.f395801b.accept(b.a.f308651a);
    }
}
