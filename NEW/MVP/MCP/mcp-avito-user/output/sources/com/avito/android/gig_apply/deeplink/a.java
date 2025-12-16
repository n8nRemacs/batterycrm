package com.avito.android.gig_apply.deeplink;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y41.p;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.gig_apply.GigApplyDeeplink;
import com.avito.android.gig_apply.ui.GigApplyErrorResult;
import com.avito.android.util.R0;
import ev.AbstractC40161a;
import fv.C40483b;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.rx3.y;
import kotlinx.coroutines.t1;
import rv.C47918a;
import rv.C47919b;
import yF.InterfaceC50106a;

/* compiled from: GigApplyDeeplinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/gig_apply/deeplink/a;", "Lev/a;", "Lcom/avito/android/gig_apply/GigApplyDeeplink;", "a", "_avito_gig_apply-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a extends AbstractC40161a<GigApplyDeeplink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.gig_apply.ui.h f159533f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a.f f159534g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final a.b f159535h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f159536i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final a.d f159537j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f159538k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final a.g f159539l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final InterfaceC50106a f159540m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final x f159541n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final a.i f159542o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final C43238h f159543p;

    /* compiled from: GigApplyDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/gig_apply/deeplink/a$a;", "LJu/c$a;", "<init>", "()V", "_avito_gig_apply-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.gig_apply.deeplink.a$a, reason: collision with other inner class name */
    public static final class C4660a implements InterfaceC14249c.a {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final C4660a f159544b = new C4660a();
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/k1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC43160i<C47918a> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f159545b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a f159546c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.gig_apply.deeplink.a$b$a, reason: collision with other inner class name */
        public static final class C4661a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f159547b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ a f159548c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.gig_apply.deeplink.GigApplyDeeplinkHandler$onCreate$$inlined$filter$1$2", f = "GigApplyDeeplinkHandler.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.gig_apply.deeplink.a$b$a$a, reason: collision with other inner class name */
            public static final class C4662a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f159549q;

                /* renamed from: r, reason: collision with root package name */
                public int f159550r;

                public C4662a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f159549q = obj;
                    this.f159550r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C4661a.this.emit(null, this);
                }
            }

            public C4661a(InterfaceC43172j interfaceC43172j, a aVar) {
                this.f159547b = interfaceC43172j;
                this.f159548c = aVar;
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
                    boolean r0 = r6 instanceof com.avito.android.gig_apply.deeplink.a.b.C4661a.C4662a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.gig_apply.deeplink.a$b$a$a r0 = (com.avito.android.gig_apply.deeplink.a.b.C4661a.C4662a) r0
                    int r1 = r0.f159550r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f159550r = r1
                    goto L18
                L13:
                    com.avito.android.gig_apply.deeplink.a$b$a$a r0 = new com.avito.android.gig_apply.deeplink.a$b$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f159549q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f159550r
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
                    com.avito.android.gig_apply.deeplink.a r2 = r4.f159548c
                    int r2 = sv.C48421d.a(r2)
                    if (r6 != r2) goto L4c
                    r0.f159550r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f159547b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L4c
                    return r1
                L4c:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.gig_apply.deeplink.a.b.C4661a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public b(InterfaceC43160i interfaceC43160i, a aVar) {
            this.f159545b = interfaceC43160i;
            this.f159546c = aVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super C47918a> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = ((AbstractC43168f) this.f159545b).collect(new C4661a(interfaceC43172j, this.f159546c), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: GigApplyDeeplinkHandler.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/b;", "fragmentResult", "Lkotlin/G0;", "<anonymous>", "(Lrv/b;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.gig_apply.deeplink.GigApplyDeeplinkHandler$onCreate$1", f = "GigApplyDeeplinkHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<C47919b, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f159552q;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = a.this.new c(continuation);
            cVar.f159552q = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(C47919b c47919b, Continuation<? super G0> continuation) {
            return ((c) create(c47919b, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            Bundle bundle = ((C47919b) this.f159552q).f437159b;
            GigApplyErrorResult gigApplyErrorResult = (GigApplyErrorResult) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle.getParcelable("GIG_APPLY_ERROR_BOTTOM_SHEET_RESULT_KEY", GigApplyErrorResult.class) : bundle.getParcelable("GIG_APPLY_ERROR_BOTTOM_SHEET_RESULT_KEY"));
            boolean z12 = gigApplyErrorResult instanceof GigApplyErrorResult.OpenDeeplink;
            a aVar = a.this;
            if (z12) {
                aVar.i(C4660a.f159544b, aVar.f159538k, ((GigApplyErrorResult.OpenDeeplink) gigApplyErrorResult).f159856b);
            } else {
                aVar.j(AbstractC14250d.c.f9171c);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: GigApplyDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "Lkotlin/G0;", "<anonymous>", "(Lrv/a;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.gig_apply.deeplink.GigApplyDeeplinkHandler$onCreate$3", f = "GigApplyDeeplinkHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements p<C47918a, Continuation<? super G0>, Object> {
        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return a.this.new d(continuation);
        }

        @Override // Y41.p
        public final Object invoke(C47918a c47918a, Continuation<? super G0> continuation) {
            return ((d) create(c47918a, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            a.this.j(AbstractC14250d.c.f9171c);
            return G0.f406611a;
        }
    }

    @Inject
    public a(@Y61.k com.avito.android.gig_apply.ui.h hVar, @Y61.k a.f fVar, @Y61.k a.b bVar, @Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k a.d dVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k a.g gVar, @Y61.k InterfaceC50106a interfaceC50106a, @Y61.k x xVar, @Y61.k a.i iVar, @Y61.k R0 r02) {
        this.f159533f = hVar;
        this.f159534g = fVar;
        this.f159535h = bVar;
        this.f159536i = interfaceC4053a;
        this.f159537j = dVar;
        this.f159538k = aVar;
        this.f159539l = gVar;
        this.f159540m = interfaceC50106a;
        this.f159541n = xVar;
        this.f159542o = iVar;
        this.f159543p = U.a(CoroutineContext.Element.DefaultImpls.plus((V0) t1.b(), r02.b()));
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        this.f159539l.g(null, true);
        C43259k.d(this.f159543p, null, null, new com.avito.android.gig_apply.deeplink.b(this, (GigApplyDeeplink) deepLink, null), 3);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        C43197r1 c43197r1 = new C43197r1(new c(null), y.a(this.f159534g.l1("GIG_APPLY_ERROR_BOTTOM_SHEET_REQUEST_KEY")));
        C43238h c43238h = this.f159543p;
        C43175k.K(c43197r1, c43238h);
        C43175k.K(new C43197r1(new d(null), new b(C40483b.a(this.f159535h), this)), c43238h);
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        U.b(this.f159543p, null);
    }
}
