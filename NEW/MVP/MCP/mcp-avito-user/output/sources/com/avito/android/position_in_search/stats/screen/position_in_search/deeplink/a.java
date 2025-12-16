package com.avito.android.position_in_search.stats.screen.position_in_search.deeplink;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.position_in_search.stats.deeplink.SearchPositionDetailsDeepLink;
import com.avito.android.position_in_search.stats.view.SearchPositionParams;
import com.avito.android.util.R0;
import d90.InterfaceC39536b;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import rv.C47918a;
import sv.C48421d;

/* compiled from: SearchPositionDetailsDeepLinkHandler.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/position_in_search/deeplink/a;", "Lcom/avito/android/deeplink_handler/handler/base/coroutines/a;", "Lcom/avito/android/position_in_search/stats/deeplink/SearchPositionDetailsDeepLink;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a extends com.avito.android.deeplink_handler.handler.base.coroutines.a<SearchPositionDetailsDeepLink> {

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.b f221335g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f221336h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final InterfaceC39536b f221337i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final com.avito.android.position_in_search.stats.screen.position_in_search.h f221338j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final KO.a f221339k;

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/k1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.position_in_search.stats.screen.position_in_search.deeplink.a$a, reason: collision with other inner class name */
    public static final class C6695a implements InterfaceC43160i<C47918a> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f221340b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a f221341c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.position_in_search.stats.screen.position_in_search.deeplink.a$a$a, reason: collision with other inner class name */
        public static final class C6696a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f221342b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ a f221343c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.position_in_search.stats.screen.position_in_search.deeplink.SearchPositionDetailsDeepLinkHandler$onCreateSuspend$$inlined$filter$1$2", f = "SearchPositionDetailsDeepLinkHandler.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.position_in_search.stats.screen.position_in_search.deeplink.a$a$a$a, reason: collision with other inner class name */
            public static final class C6697a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f221344q;

                /* renamed from: r, reason: collision with root package name */
                public int f221345r;

                public C6697a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    this.f221344q = obj;
                    this.f221345r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C6696a.this.emit(null, this);
                }
            }

            public C6696a(InterfaceC43172j interfaceC43172j, a aVar) {
                this.f221342b = interfaceC43172j;
                this.f221343c = aVar;
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
                    boolean r0 = r6 instanceof com.avito.android.position_in_search.stats.screen.position_in_search.deeplink.a.C6695a.C6696a.C6697a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.position_in_search.stats.screen.position_in_search.deeplink.a$a$a$a r0 = (com.avito.android.position_in_search.stats.screen.position_in_search.deeplink.a.C6695a.C6696a.C6697a) r0
                    int r1 = r0.f221345r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f221345r = r1
                    goto L18
                L13:
                    com.avito.android.position_in_search.stats.screen.position_in_search.deeplink.a$a$a$a r0 = new com.avito.android.position_in_search.stats.screen.position_in_search.deeplink.a$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f221344q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f221345r
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
                    com.avito.android.position_in_search.stats.screen.position_in_search.deeplink.a r2 = r4.f221343c
                    int r2 = sv.C48421d.a(r2)
                    if (r6 != r2) goto L4c
                    r0.f221345r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f221342b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L4c
                    return r1
                L4c:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.position_in_search.stats.screen.position_in_search.deeplink.a.C6695a.C6696a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public C6695a(InterfaceC43160i interfaceC43160i, a aVar) {
            this.f221340b = interfaceC43160i;
            this.f221341c = aVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @l
        public final Object collect(@k InterfaceC43172j<? super C47918a> interfaceC43172j, @k Continuation continuation) {
            Object objCollect = ((AbstractC43168f) this.f221340b).collect(new C6696a(interfaceC43172j, this.f221341c), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: SearchPositionDetailsDeepLinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.avito.android.position_in_search.stats.screen.position_in_search.deeplink.SearchPositionDetailsDeepLinkHandler", f = "SearchPositionDetailsDeepLinkHandler.kt", i = {0}, l = {53, 56}, m = "onCreateSuspend", n = {"this"}, s = {"L$0"})
    public static final class b extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public a f221347q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f221348r;

        /* renamed from: t, reason: collision with root package name */
        public int f221350t;

        public b(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f221348r = obj;
            this.f221350t |= BeduinInputModel.MIN_TEXT_VERSION;
            return a.this.n(this);
        }
    }

    /* compiled from: SearchPositionDetailsDeepLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "Lkotlin/G0;", "emit", "(Lrv/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements InterfaceC43172j {
        public c() {
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            a.this.j(SearchPositionDetailsDeepLink.b.a.f220338b);
            return G0.f406611a;
        }
    }

    @Inject
    public a(@k R0 r02, @k a.b bVar, @k a.InterfaceC4053a interfaceC4053a, @k InterfaceC39536b interfaceC39536b, @k com.avito.android.position_in_search.stats.screen.position_in_search.h hVar, @k KO.a aVar) {
        super(r02);
        this.f221335g = bVar;
        this.f221336h = interfaceC4053a;
        this.f221337i = interfaceC39536b;
        this.f221338j = hVar;
        this.f221339k = aVar;
    }

    @Override // com.avito.android.deeplink_handler.handler.base.coroutines.a
    public final Object m(DeepLink deepLink, String str, Bundle bundle, Continuation continuation) {
        SearchPositionDetailsDeepLink searchPositionDetailsDeepLink = (SearchPositionDetailsDeepLink) deepLink;
        KO.a aVar = this.f221339k;
        aVar.getClass();
        n<Object> nVar = KO.a.f9442h[1];
        boolean zBooleanValue = ((Boolean) aVar.f9444c.a().invoke()).booleanValue();
        a.InterfaceC4053a interfaceC4053a = this.f221336h;
        if (zBooleanValue) {
            interfaceC4053a.J(this.f221338j.a(searchPositionDetailsDeepLink.f220336b, searchPositionDetailsDeepLink.f220337c), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
        } else {
            interfaceC4053a.J(this.f221337i.a(new SearchPositionParams(searchPositionDetailsDeepLink.f220336b, searchPositionDetailsDeepLink.f220337c)), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
        }
        return G0.f406611a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.deeplink_handler.handler.base.coroutines.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(@Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.avito.android.position_in_search.stats.screen.position_in_search.deeplink.a.b
            if (r0 == 0) goto L13
            r0 = r6
            com.avito.android.position_in_search.stats.screen.position_in_search.deeplink.a$b r0 = (com.avito.android.position_in_search.stats.screen.position_in_search.deeplink.a.b) r0
            int r1 = r0.f221350t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f221350t = r1
            goto L1a
        L13:
            com.avito.android.position_in_search.stats.screen.position_in_search.deeplink.a$b r0 = new com.avito.android.position_in_search.stats.screen.position_in_search.deeplink.a$b
            kotlin.coroutines.jvm.internal.ContinuationImpl r6 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r6
            r0.<init>(r6)
        L1a:
            java.lang.Object r6 = r0.f221348r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f221350t
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            kotlin.C42729a0.b(r6)
            goto L65
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L36:
            com.avito.android.position_in_search.stats.screen.position_in_search.deeplink.a r2 = r0.f221347q
            kotlin.C42729a0.b(r6)
            goto L49
        L3c:
            kotlin.C42729a0.b(r6)
            r0.f221347q = r5
            r0.f221350t = r4
            kotlin.G0 r6 = kotlin.G0.f406611a
            if (r6 != r1) goto L48
            return r1
        L48:
            r2 = r5
        L49:
            com.avito.android.deeplink_handler.view.a$b r6 = r2.f221335g
            kotlinx.coroutines.flow.i r6 = fv.C40483b.a(r6)
            com.avito.android.position_in_search.stats.screen.position_in_search.deeplink.a$a r4 = new com.avito.android.position_in_search.stats.screen.position_in_search.deeplink.a$a
            r4.<init>(r6, r2)
            com.avito.android.position_in_search.stats.screen.position_in_search.deeplink.a$c r6 = new com.avito.android.position_in_search.stats.screen.position_in_search.deeplink.a$c
            r6.<init>()
            r2 = 0
            r0.f221347q = r2
            r0.f221350t = r3
            java.lang.Object r6 = r4.collect(r6, r0)
            if (r6 != r1) goto L65
            return r1
        L65:
            kotlin.G0 r6 = kotlin.G0.f406611a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.position_in_search.stats.screen.position_in_search.deeplink.a.n(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
