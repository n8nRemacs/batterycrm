package com.avito.android.str_seller_orders.strsellerorders.mvi;

import Vx0.AbstractC15725a;
import com.avito.android.R;
import com.avito.android.str_booking.network.models.common.ButtonAction;
import com.avito.android.str_seller_orders.strsellerorders.mvi.entity.StrSellerOrdersInternalAction;
import com.avito.android.str_seller_orders.strsellerordersdialog.shared.StrSellerOrdersDialogData;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: StrSellerOrdersActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/StrSellerOrdersInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.str_seller_orders.strsellerorders.mvi.StrSellerOrdersActor$handleButtonActionWithoutPrompt$1", f = "StrSellerOrdersActor.kt", i = {}, l = {220, 222, 226, 227}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super StrSellerOrdersInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f289832q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f289833r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ButtonAction f289834s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.str_seller_orders.strsellerorders.mvi.a f289835t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ StrSellerOrdersDialogData f289836u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f289837v;

    /* compiled from: StrSellerOrdersActor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/StrSellerOrdersInternalAction;", "", "cause", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_seller_orders.strsellerorders.mvi.StrSellerOrdersActor$handleButtonActionWithoutPrompt$1$onFailure$1", f = "StrSellerOrdersActor.kt", i = {0}, l = {204, 212}, m = "invokeSuspend", n = {"$this$onFailure"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements Y41.q<InterfaceC43172j<? super StrSellerOrdersInternalAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f289838q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f289839r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f289840s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ StrSellerOrdersDialogData f289841t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.str_seller_orders.strsellerorders.mvi.a f289842u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f289843v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.avito.android.str_seller_orders.strsellerorders.mvi.a aVar, StrSellerOrdersDialogData strSellerOrdersDialogData, String str, Continuation continuation) {
            super(3, continuation);
            this.f289841t = strSellerOrdersDialogData;
            this.f289842u = aVar;
            this.f289843v = str;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super StrSellerOrdersInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            StrSellerOrdersDialogData strSellerOrdersDialogData = this.f289841t;
            a aVar = new a(this.f289842u, strSellerOrdersDialogData, this.f289843v, continuation);
            aVar.f289839r = interfaceC43172j;
            aVar.f289840s = th2;
            return aVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f289838q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = this.f289839r;
                StrSellerOrdersInternalAction.ShowToast showToast = new StrSellerOrdersInternalAction.ShowToast(com.avito.android.printable_text.b.c(R.string.something_went_wrong, new Serializable[0]), this.f289840s);
                this.f289839r = interfaceC43172j;
                this.f289838q = 1;
                if (interfaceC43172j.emit(showToast, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = this.f289839r;
                C42729a0.b(obj);
            }
            StrSellerOrdersDialogData strSellerOrdersDialogData = this.f289841t;
            if (strSellerOrdersDialogData == null) {
                return G0.f406611a;
            }
            int i13 = com.avito.android.str_seller_orders.strsellerorders.mvi.a.f289826f;
            com.avito.android.str_seller_orders.strsellerorders.mvi.a aVar = this.f289842u;
            aVar.getClass();
            InterfaceC43160i interfaceC43160iG = C43175k.G(new h(aVar, strSellerOrdersDialogData, this.f289843v, null));
            this.f289839r = null;
            this.f289838q = 2;
            if (C43175k.u(this, interfaceC43160iG, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: StrSellerOrdersActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/StrSellerOrdersInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_seller_orders.strsellerorders.mvi.StrSellerOrdersActor$handleButtonActionWithoutPrompt$1$onSuccess$1", f = "StrSellerOrdersActor.kt", i = {}, l = {196}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.str_seller_orders.strsellerorders.mvi.b$b, reason: collision with other inner class name */
    public static final class C8738b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super StrSellerOrdersInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f289844q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f289845r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ StrSellerOrdersDialogData f289846s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.str_seller_orders.strsellerorders.mvi.a f289847t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f289848u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8738b(com.avito.android.str_seller_orders.strsellerorders.mvi.a aVar, StrSellerOrdersDialogData strSellerOrdersDialogData, String str, Continuation continuation) {
            super(2, continuation);
            this.f289846s = strSellerOrdersDialogData;
            this.f289847t = aVar;
            this.f289848u = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            C8738b c8738b = new C8738b(this.f289847t, this.f289846s, this.f289848u, continuation);
            c8738b.f289845r = obj;
            return c8738b;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super StrSellerOrdersInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C8738b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f289844q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f289845r;
                StrSellerOrdersDialogData strSellerOrdersDialogData = this.f289846s;
                if (strSellerOrdersDialogData == null) {
                    return G0.f406611a;
                }
                int i13 = com.avito.android.str_seller_orders.strsellerorders.mvi.a.f289826f;
                com.avito.android.str_seller_orders.strsellerorders.mvi.a aVar = this.f289847t;
                aVar.getClass();
                InterfaceC43160i interfaceC43160iG = C43175k.G(new h(aVar, strSellerOrdersDialogData, this.f289848u, null));
                this.f289844q = 1;
                if (C43175k.u(this, interfaceC43160iG, interfaceC43172j) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ButtonAction buttonAction, com.avito.android.str_seller_orders.strsellerorders.mvi.a aVar, StrSellerOrdersDialogData strSellerOrdersDialogData, String str, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f289834s = buttonAction;
        this.f289835t = aVar;
        this.f289836u = strSellerOrdersDialogData;
        this.f289837v = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f289834s, this.f289835t, this.f289836u, this.f289837v, continuation);
        bVar.f289833r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super StrSellerOrdersInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object next;
        AbstractC15725a c1218a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f289832q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f289833r;
            ButtonAction buttonAction = this.f289834s;
            String url = buttonAction.getUrl();
            com.avito.android.str_seller_orders.strsellerorders.mvi.a aVar = this.f289835t;
            if (url == null || url.length() == 0) {
                Iterator it = C42745f0.U(buttonAction.getHref(), buttonAction.getRedirect()).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    String str = (String) next;
                    if (str != null && str.length() != 0) {
                        break;
                    }
                }
                String str2 = (String) next;
                if (str2 != null) {
                    int i13 = com.avito.android.str_seller_orders.strsellerorders.mvi.a.f289826f;
                    aVar.getClass();
                    c1218a = (C43066x.h0(str2, "api/", false) || C43066x.h0(str2, "web/", false)) ? new AbstractC15725a.C1218a(str2, null) : C43066x.h0(str2, "ru.avito", false) ? new AbstractC15725a.b(str2, null) : C43066x.h0(str2, "tel", false) ? new AbstractC15725a.c(str2, null) : new AbstractC15725a.d(str2, null);
                } else {
                    c1218a = null;
                }
            } else {
                int i14 = com.avito.android.str_seller_orders.strsellerorders.mvi.a.f289826f;
                aVar.getClass();
                String strM0 = C43066x.m0(url, "api/", url);
                c1218a = new AbstractC15725a.C1218a(C43066x.m0(strM0, "web/", strM0), null);
            }
            if (c1218a instanceof AbstractC15725a.C1218a) {
                Map<String, String> mapC = buttonAction.c();
                StrSellerOrdersDialogData strSellerOrdersDialogData = this.f289836u;
                String str3 = this.f289837v;
                C8738b c8738b = new C8738b(aVar, strSellerOrdersDialogData, str3, null);
                a aVar2 = new a(aVar, strSellerOrdersDialogData, str3, null);
                if (mapC != null) {
                    InterfaceC43160i<StrSellerOrdersInternalAction> interfaceC43160iC = aVar.f289827a.c(((AbstractC15725a.C1218a) c1218a).f17529a, mapC, c8738b, aVar2);
                    this.f289832q = 1;
                    if (C43175k.u(this, interfaceC43160iC, interfaceC43172j) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    InterfaceC43160i<StrSellerOrdersInternalAction> interfaceC43160iA = aVar.f289827a.a(((AbstractC15725a.C1218a) c1218a).f17529a, c8738b, aVar2);
                    this.f289832q = 2;
                    if (C43175k.u(this, interfaceC43160iA, interfaceC43172j) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else if (c1218a instanceof AbstractC15725a.b) {
                StrSellerOrdersInternalAction.OpenDeeplink openDeeplink = new StrSellerOrdersInternalAction.OpenDeeplink(aVar.f289830d.b(((AbstractC15725a.b) c1218a).f17529a));
                this.f289832q = 3;
                if (interfaceC43172j.emit(openDeeplink, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (c1218a instanceof AbstractC15725a.d) {
                StrSellerOrdersInternalAction.OpenWebView openWebView = new StrSellerOrdersInternalAction.OpenWebView(((AbstractC15725a.d) c1218a).f17529a);
                this.f289832q = 4;
                if (interfaceC43172j.emit(openWebView, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1 && i12 != 2 && i12 != 3 && i12 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
