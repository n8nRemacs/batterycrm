package com.avito.android.related_products.bottom_sheet.deeplink;

import Y41.p;
import Y61.k;
import Y61.l;
import android.os.Bundle;
import bj0.C25661a;
import bj0.InterfaceC25667g;
import com.avito.android.analytics.screens.tracker.Z;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.related_products.RelatedProductsEntryPointState;
import com.avito.android.related_products.bottom_sheet.RelatedProductsBottomSheetDeepLink;
import com.avito.android.related_products.bottom_sheet.g;
import com.avito.android.related_products.bottom_sheet.v;
import com.avito.android.util.R0;
import fv.C40483b;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import rv.C47918a;

/* compiled from: RelatedProductsBottomSheetDeepLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/related_products/bottom_sheet/deeplink/a;", "Lcom/avito/android/deeplink_handler/handler/base/coroutines/a;", "Lcom/avito/android/related_products/bottom_sheet/RelatedProductsBottomSheetDeepLink;", "a", "_avito_related-products_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a extends com.avito.android.deeplink_handler.handler.base.coroutines.a<RelatedProductsBottomSheetDeepLink> {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f252849q = 0;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final InterfaceC25667g f252850g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f252851h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final AW.b f252852i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final g f252853j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f252854k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final a.b f252855l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final v f252856m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final h31.e<com.avito.android.related_products.bottom_sheet.b> f252857n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final R0 f252858o;

    /* renamed from: p, reason: collision with root package name */
    @k
    public final Z f252859p;

    /* compiled from: RelatedProductsBottomSheetDeepLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/related_products/bottom_sheet/deeplink/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "_avito_related-products_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.related_products.bottom_sheet.deeplink.a$a, reason: collision with other inner class name */
    public static final class C7595a {
        public /* synthetic */ C7595a(C42822w c42822w) {
            this();
        }

        public C7595a() {
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/k1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC43160i<C47918a> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f252860b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a f252861c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.related_products.bottom_sheet.deeplink.a$b$a, reason: collision with other inner class name */
        public static final class C7596a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f252862b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ a f252863c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.related_products.bottom_sheet.deeplink.RelatedProductsBottomSheetDeepLinkHandler$onCreateSuspend$$inlined$filter$1$2", f = "RelatedProductsBottomSheetDeepLinkHandler.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.related_products.bottom_sheet.deeplink.a$b$a$a, reason: collision with other inner class name */
            public static final class C7597a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f252864q;

                /* renamed from: r, reason: collision with root package name */
                public int f252865r;

                public C7597a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    this.f252864q = obj;
                    this.f252865r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C7596a.this.emit(null, this);
                }
            }

            public C7596a(InterfaceC43172j interfaceC43172j, a aVar) {
                this.f252862b = interfaceC43172j;
                this.f252863c = aVar;
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
                    boolean r0 = r6 instanceof com.avito.android.related_products.bottom_sheet.deeplink.a.b.C7596a.C7597a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.related_products.bottom_sheet.deeplink.a$b$a$a r0 = (com.avito.android.related_products.bottom_sheet.deeplink.a.b.C7596a.C7597a) r0
                    int r1 = r0.f252865r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f252865r = r1
                    goto L18
                L13:
                    com.avito.android.related_products.bottom_sheet.deeplink.a$b$a$a r0 = new com.avito.android.related_products.bottom_sheet.deeplink.a$b$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f252864q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f252865r
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
                    com.avito.android.related_products.bottom_sheet.deeplink.a r2 = r4.f252863c
                    int r2 = sv.C48421d.a(r2)
                    if (r6 != r2) goto L4c
                    r0.f252865r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f252862b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L4c
                    return r1
                L4c:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.related_products.bottom_sheet.deeplink.a.b.C7596a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public b(InterfaceC43160i interfaceC43160i, a aVar) {
            this.f252860b = interfaceC43160i;
            this.f252861c = aVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @l
        public final Object collect(@k InterfaceC43172j<? super C47918a> interfaceC43172j, @k Continuation continuation) {
            Object objCollect = ((AbstractC43168f) this.f252860b).collect(new C7596a(interfaceC43172j, this.f252861c), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: RelatedProductsBottomSheetDeepLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "Lkotlin/G0;", "<anonymous>", "(Lrv/a;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.related_products.bottom_sheet.deeplink.RelatedProductsBottomSheetDeepLinkHandler$onCreateSuspend$3", f = "RelatedProductsBottomSheetDeepLinkHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<C47918a, Continuation<? super G0>, Object> {
        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return a.this.new c(continuation);
        }

        @Override // Y41.p
        public final Object invoke(C47918a c47918a, Continuation<? super G0> continuation) {
            return ((c) create(c47918a, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            a aVar = a.this;
            aVar.f252857n.get().clear();
            aVar.j(RelatedProductsBottomSheetDeepLink.b.c.f252825b);
            return G0.f406611a;
        }
    }

    static {
        new C7595a(null);
    }

    @Inject
    public a(@k InterfaceC25667g interfaceC25667g, @k com.avito.android.deeplink_handler.handler.composite.a aVar, @k AW.b bVar, @k g gVar, @k a.InterfaceC4053a interfaceC4053a, @k a.b bVar2, @k v vVar, @k h31.e<com.avito.android.related_products.bottom_sheet.b> eVar, @k R0 r02, @k Z z12) {
        super(r02);
        this.f252850g = interfaceC25667g;
        this.f252851h = aVar;
        this.f252852i = bVar;
        this.f252853j = gVar;
        this.f252854k = interfaceC4053a;
        this.f252855l = bVar2;
        this.f252856m = vVar;
        this.f252857n = eVar;
        this.f252858o = r02;
        this.f252859p = z12;
    }

    @Override // com.avito.android.deeplink_handler.handler.base.coroutines.a
    public final Object m(DeepLink deepLink, String str, Bundle bundle, Continuation continuation) {
        RelatedProductsBottomSheetDeepLink relatedProductsBottomSheetDeepLink = (RelatedProductsBottomSheetDeepLink) deepLink;
        long j12 = relatedProductsBottomSheetDeepLink.f252820b;
        try {
            C43259k.d(this.f134492f, this.f252858o.a(), null, new com.avito.android.related_products.bottom_sheet.deeplink.b(bundle, this, j12, relatedProductsBottomSheetDeepLink, null), 2);
        } catch (Exception unused) {
            this.f252859p.f();
            o(j12, relatedProductsBottomSheetDeepLink.f252821c, true);
        }
        return G0.f406611a;
    }

    @Override // com.avito.android.deeplink_handler.handler.base.coroutines.a
    @l
    public final Object n(@k Continuation<? super G0> continuation) {
        C43175k.K(new C43197r1(new c(null), new b(C40483b.a(this.f252855l), this)), this.f134492f);
        return G0.f406611a;
    }

    public final void o(long j12, DeepLink deepLink, boolean z12) {
        this.f252853j.b(new C25661a(j12, z12 ? RelatedProductsEntryPointState.f252816d : RelatedProductsEntryPointState.f252814b));
        if (deepLink != null) {
            i(RelatedProductsBottomSheetDeepLink.b.C7594b.f252824b, this.f252851h, deepLink);
        } else {
            j(RelatedProductsBottomSheetDeepLink.b.a.f252823b);
        }
    }
}
