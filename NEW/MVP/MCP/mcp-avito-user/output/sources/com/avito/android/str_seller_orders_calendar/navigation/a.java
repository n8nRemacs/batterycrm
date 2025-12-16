package com.avito.android.str_seller_orders_calendar.navigation;

import Ju.InterfaceC14249c;
import Y61.k;
import Y61.l;
import android.os.Bundle;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import fv.C40483b;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import rv.C47918a;
import sv.C48421d;

/* compiled from: StrOrdersCalendarDeeplinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/navigation/a;", "Lcom/avito/android/deeplink_handler/handler/base/coroutines/a;", "Lcom/avito/android/str_seller_orders_calendar/navigation/StrOrdersCalendarLink;", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a extends com.avito.android.deeplink_handler.handler.base.coroutines.a<StrOrdersCalendarLink> {

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.b f290467g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final e f290468h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f290469i;

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/k1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.str_seller_orders_calendar.navigation.a$a, reason: collision with other inner class name */
    public static final class C8773a implements InterfaceC43160i<C47918a> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f290470b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a f290471c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.str_seller_orders_calendar.navigation.a$a$a, reason: collision with other inner class name */
        public static final class C8774a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f290472b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ a f290473c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.str_seller_orders_calendar.navigation.StrOrdersCalendarDeeplinkHandler$onCreateSuspend$$inlined$filter$1$2", f = "StrOrdersCalendarDeeplinkHandler.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.str_seller_orders_calendar.navigation.a$a$a$a, reason: collision with other inner class name */
            public static final class C8775a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f290474q;

                /* renamed from: r, reason: collision with root package name */
                public int f290475r;

                public C8775a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    this.f290474q = obj;
                    this.f290475r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C8774a.this.emit(null, this);
                }
            }

            public C8774a(InterfaceC43172j interfaceC43172j, a aVar) {
                this.f290472b = interfaceC43172j;
                this.f290473c = aVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, @Y61.k kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.avito.android.str_seller_orders_calendar.navigation.a.C8773a.C8774a.C8775a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.str_seller_orders_calendar.navigation.a$a$a$a r0 = (com.avito.android.str_seller_orders_calendar.navigation.a.C8773a.C8774a.C8775a) r0
                    int r1 = r0.f290475r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f290475r = r1
                    goto L18
                L13:
                    com.avito.android.str_seller_orders_calendar.navigation.a$a$a$a r0 = new com.avito.android.str_seller_orders_calendar.navigation.a$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f290474q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f290475r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L4c
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    r6 = r5
                    rv.a r6 = (rv.C47918a) r6
                    int r6 = r6.f437155a
                    com.avito.android.str_seller_orders_calendar.navigation.a r2 = r4.f290473c
                    int r2 = sv.C48421d.a(r2)
                    if (r6 != r2) goto L4c
                    r0.f290475r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f290472b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L4c
                    return r1
                L4c:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_seller_orders_calendar.navigation.a.C8773a.C8774a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public C8773a(InterfaceC43160i interfaceC43160i, a aVar) {
            this.f290470b = interfaceC43160i;
            this.f290471c = aVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @l
        public final Object collect(@k InterfaceC43172j<? super C47918a> interfaceC43172j, @k Continuation continuation) {
            Object objCollect = ((AbstractC43168f) this.f290470b).collect(new C8774a(interfaceC43172j, this.f290471c), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC43160i<InterfaceC14249c.b> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C8773a f290477b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.str_seller_orders_calendar.navigation.a$b$a, reason: collision with other inner class name */
        public static final class C8776a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f290478b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.str_seller_orders_calendar.navigation.StrOrdersCalendarDeeplinkHandler$onCreateSuspend$$inlined$map$1$2", f = "StrOrdersCalendarDeeplinkHandler.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.str_seller_orders_calendar.navigation.a$b$a$a, reason: collision with other inner class name */
            public static final class C8777a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f290479q;

                /* renamed from: r, reason: collision with root package name */
                public int f290480r;

                public C8777a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    this.f290479q = obj;
                    this.f290480r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C8776a.this.emit(null, this);
                }
            }

            public C8776a(InterfaceC43172j interfaceC43172j) {
                this.f290478b = interfaceC43172j;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, @Y61.k kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.avito.android.str_seller_orders_calendar.navigation.a.b.C8776a.C8777a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.str_seller_orders_calendar.navigation.a$b$a$a r0 = (com.avito.android.str_seller_orders_calendar.navigation.a.b.C8776a.C8777a) r0
                    int r1 = r0.f290480r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f290480r = r1
                    goto L18
                L13:
                    com.avito.android.str_seller_orders_calendar.navigation.a$b$a$a r0 = new com.avito.android.str_seller_orders_calendar.navigation.a$b$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f290479q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f290480r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L4b
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    rv.a r5 = (rv.C47918a) r5
                    int r5 = r5.f437156b
                    r6 = -1
                    if (r5 != r6) goto L3e
                    com.avito.android.str_seller_orders_calendar.navigation.StrOrdersCalendarLink$b$b r5 = com.avito.android.str_seller_orders_calendar.navigation.StrOrdersCalendarLink.b.C8772b.f290466b
                    goto L40
                L3e:
                    com.avito.android.str_seller_orders_calendar.navigation.StrOrdersCalendarLink$b$a r5 = com.avito.android.str_seller_orders_calendar.navigation.StrOrdersCalendarLink.b.a.f290465b
                L40:
                    r0.f290480r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f290478b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L4b
                    return r1
                L4b:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_seller_orders_calendar.navigation.a.b.C8776a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public b(C8773a c8773a) {
            this.f290477b = c8773a;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @l
        public final Object collect(@k InterfaceC43172j<? super InterfaceC14249c.b> interfaceC43172j, @k Continuation continuation) {
            Object objCollect = this.f290477b.collect(new C8776a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: StrOrdersCalendarDeeplinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c implements InterfaceC43172j, D {
        public c() {
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            a.this.j((InterfaceC14249c.b) obj);
            G0 g02 = G0.f406611a;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return g02;
        }

        public final boolean equals(@l Object obj) {
            if ((obj instanceof InterfaceC43172j) && (obj instanceof D)) {
                return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return new C42801a(2, a.this, a.class, "setTerminalResult", "setTerminalResult(Lcom/avito/android/deep_linking/links/result/DeeplinkResult$Terminal;)V", 4);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    @Inject
    public a(@k a.b bVar, @k e eVar, @k a.InterfaceC4053a interfaceC4053a, @k R0 r02) {
        super(r02);
        this.f290467g = bVar;
        this.f290468h = eVar;
        this.f290469i = interfaceC4053a;
    }

    @Override // com.avito.android.deeplink_handler.handler.base.coroutines.a
    public final Object m(DeepLink deepLink, String str, Bundle bundle, Continuation continuation) {
        this.f290469i.J(this.f290468h.a(), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
        return G0.f406611a;
    }

    @Override // com.avito.android.deeplink_handler.handler.base.coroutines.a
    @l
    public final Object n(@k Continuation<? super G0> continuation) {
        Object objCollect = new b(new C8773a(C40483b.a(this.f290467g), this)).collect(new c(), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}
