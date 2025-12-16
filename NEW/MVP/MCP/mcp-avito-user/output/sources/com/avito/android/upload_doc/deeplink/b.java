package com.avito.android.upload_doc.deeplink;

import Y41.p;
import Y61.k;
import Y61.l;
import android.os.Bundle;
import bv.C25719a;
import com.avito.android.authorization.AuthSource;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.GigUploadDocDeeplink;
import com.avito.android.deeplink_handler.view.a;
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
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import rv.C47918a;

/* compiled from: GigUploadDocDeeplinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/upload_doc/deeplink/b;", "Lcom/avito/android/deeplink_handler/handler/base/coroutines/a;", "Lcom/avito/android/deep_linking/links/GigUploadDocDeeplink;", "_avito_gig_upload-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b extends com.avito.android.deeplink_handler.handler.base.coroutines.a<GigUploadDocDeeplink> {

    /* renamed from: g, reason: collision with root package name */
    @k
    public final NG0.a f306712g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f306713h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final C25719a f306714i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final a.b f306715j;

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/k1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC43160i<C47918a> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f306716b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f306717c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.upload_doc.deeplink.b$a$a, reason: collision with other inner class name */
        public static final class C9424a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f306718b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b f306719c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.upload_doc.deeplink.GigUploadDocDeeplinkHandler$onCreateSuspend$$inlined$filter$1$2", f = "GigUploadDocDeeplinkHandler.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.upload_doc.deeplink.b$a$a$a, reason: collision with other inner class name */
            public static final class C9425a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f306720q;

                /* renamed from: r, reason: collision with root package name */
                public int f306721r;

                public C9425a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    this.f306720q = obj;
                    this.f306721r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C9424a.this.emit(null, this);
                }
            }

            public C9424a(InterfaceC43172j interfaceC43172j, b bVar) {
                this.f306718b = interfaceC43172j;
                this.f306719c = bVar;
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
                    boolean r0 = r6 instanceof com.avito.android.upload_doc.deeplink.b.a.C9424a.C9425a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.upload_doc.deeplink.b$a$a$a r0 = (com.avito.android.upload_doc.deeplink.b.a.C9424a.C9425a) r0
                    int r1 = r0.f306721r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f306721r = r1
                    goto L18
                L13:
                    com.avito.android.upload_doc.deeplink.b$a$a$a r0 = new com.avito.android.upload_doc.deeplink.b$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f306720q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f306721r
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
                    com.avito.android.upload_doc.deeplink.b r2 = r4.f306719c
                    int r2 = sv.C48421d.a(r2)
                    if (r6 != r2) goto L4c
                    r0.f306721r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f306718b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L4c
                    return r1
                L4c:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.upload_doc.deeplink.b.a.C9424a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public a(InterfaceC43160i interfaceC43160i, b bVar) {
            this.f306716b = interfaceC43160i;
            this.f306717c = bVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @l
        public final Object collect(@k InterfaceC43172j<? super C47918a> interfaceC43172j, @k Continuation continuation) {
            Object objCollect = ((AbstractC43168f) this.f306716b).collect(new C9424a(interfaceC43172j, this.f306717c), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: GigUploadDocDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "result", "Lkotlin/G0;", "<anonymous>", "(Lrv/a;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.upload_doc.deeplink.GigUploadDocDeeplinkHandler$onCreateSuspend$3", f = "GigUploadDocDeeplinkHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.upload_doc.deeplink.b$b, reason: collision with other inner class name */
    public static final class C9426b extends SuspendLambda implements p<C47918a, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f306723q;

        public C9426b(Continuation<? super C9426b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C9426b c9426b = b.this.new C9426b(continuation);
            c9426b.f306723q = obj;
            return c9426b;
        }

        @Override // Y41.p
        public final Object invoke(C47918a c47918a, Continuation<? super G0> continuation) {
            return ((C9426b) create(c47918a, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            int i12 = ((C47918a) this.f306723q).f437156b;
            b bVar = b.this;
            if (i12 == -1) {
                bVar.j(GigUploadDocDeeplink.b.C4002b.f133343b);
            } else {
                bVar.j(GigUploadDocDeeplink.b.a.f133342b);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public b(@k NG0.a aVar, @k a.InterfaceC4053a interfaceC4053a, @k C25719a c25719a, @k a.b bVar, @k R0 r02) {
        super(r02);
        this.f306712g = aVar;
        this.f306713h = interfaceC4053a;
        this.f306714i = c25719a;
        this.f306715j = bVar;
    }

    @Override // com.avito.android.deeplink_handler.handler.base.coroutines.a, ev.AbstractC40161a
    public final void g() {
        U.b(this.f134492f, null);
        super.g();
    }

    @Override // com.avito.android.deeplink_handler.handler.base.coroutines.a
    public final Object m(DeepLink deepLink, String str, Bundle bundle, Continuation continuation) {
        GigUploadDocDeeplink gigUploadDocDeeplink = (GigUploadDocDeeplink) deepLink;
        this.f306714i.a(gigUploadDocDeeplink, this, AuthSource.f92734x, new com.avito.android.upload_doc.deeplink.a(this, gigUploadDocDeeplink));
        return G0.f406611a;
    }

    @Override // com.avito.android.deeplink_handler.handler.base.coroutines.a
    @l
    public final Object n(@k Continuation<? super G0> continuation) {
        C43175k.K(new C43197r1(new C9426b(null), new a(C40483b.a(this.f306715j), this)), this.f134492f);
        return G0.f406611a;
    }
}
