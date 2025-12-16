package com.avito.android.developments_catalog.deeplink;

import Ju.InterfaceC14247a;
import Ju.InterfaceC14249c;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.DevelopmentsCatalogPhoneLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import lx.InterfaceC43844a;

/* compiled from: DevelopmentsCatalogPhoneLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_catalog/deeplink/i;", "Lcom/avito/android/deeplink_handler/handler/base/coroutines/a;", "Lcom/avito/android/deep_linking/links/DevelopmentsCatalogPhoneLink;", "a", "_avito_developments-catalog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i extends com.avito.android.deeplink_handler.handler.base.coroutines.a<DevelopmentsCatalogPhoneLink> {

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a.i f139103g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final a.g f139104h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43844a f139105i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final R0 f139106j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f139107k;

    /* compiled from: DevelopmentsCatalogPhoneLinkHandler.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/avito/android/developments_catalog/deeplink/i$a;", "", "<init>", "()V", "a", "b", "_avito_developments-catalog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a {

        /* compiled from: DevelopmentsCatalogPhoneLinkHandler.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_catalog/deeplink/i$a$a;", "LJu/c$a;", "<init>", "()V", "_avito_developments-catalog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.developments_catalog.deeplink.i$a$a, reason: collision with other inner class name */
        public static final class C4194a implements InterfaceC14249c.a {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final C4194a f139108b = new C4194a();
        }

        /* compiled from: DevelopmentsCatalogPhoneLinkHandler.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/developments_catalog/deeplink/i$a$b;", "LJu/c$b;", "LJu/a$a;", "<init>", "()V", "_avito_developments-catalog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b implements InterfaceC14249c.b, InterfaceC14247a.InterfaceC0545a {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final b f139109b = new b();
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @Inject
    public i(@Y61.k a.i iVar, @Y61.k a.g gVar, @Y61.k InterfaceC43844a interfaceC43844a, @Y61.k R0 r02, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        super(r02);
        this.f139103g = iVar;
        this.f139104h = gVar;
        this.f139105i = interfaceC43844a;
        this.f139106j = r02;
        this.f139107k = aVar;
    }

    @Override // com.avito.android.deeplink_handler.handler.base.coroutines.a
    public final /* bridge */ /* synthetic */ Object m(DeepLink deepLink, String str, Bundle bundle, Continuation continuation) {
        return o((DevelopmentsCatalogPhoneLink) deepLink, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(@Y61.k com.avito.android.deep_linking.links.DevelopmentsCatalogPhoneLink r6, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.avito.android.developments_catalog.deeplink.j
            if (r0 == 0) goto L13
            r0 = r7
            com.avito.android.developments_catalog.deeplink.j r0 = (com.avito.android.developments_catalog.deeplink.j) r0
            int r1 = r0.f139113t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f139113t = r1
            goto L18
        L13:
            com.avito.android.developments_catalog.deeplink.j r0 = new com.avito.android.developments_catalog.deeplink.j
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f139111r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f139113t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.avito.android.developments_catalog.deeplink.i r6 = r0.f139110q
            kotlin.C42729a0.b(r7)
            goto L57
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            kotlin.C42729a0.b(r7)
            com.avito.android.deeplink_handler.view.a$g r7 = r5.f139104h
            com.avito.android.deeplink_handler.handler.bundle.a r2 = r5.d()
            r7.g(r2, r3)
            com.avito.android.util.R0 r7 = r5.f139106j
            kotlinx.coroutines.scheduling.b r7 = r7.a()
            com.avito.android.developments_catalog.deeplink.k r2 = new com.avito.android.developments_catalog.deeplink.k
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.f139110q = r5
            r0.f139113t = r3
            java.lang.Object r7 = kotlinx.coroutines.C43259k.g(r7, r2, r0)
            if (r7 != r1) goto L56
            return r1
        L56:
            r6 = r5
        L57:
            com.avito.android.remote.model.TypedResult r7 = (com.avito.android.remote.model.TypedResult) r7
            boolean r0 = r7 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r0 == 0) goto L75
            com.avito.android.remote.model.TypedResult$Success r7 = (com.avito.android.remote.model.TypedResult.Success) r7
            java.lang.Object r7 = r7.getResult()
            nx.a r7 = (nx.C44486a) r7
            com.avito.android.developments_catalog.deeplink.i$a$a r0 = com.avito.android.developments_catalog.deeplink.i.a.C4194a.f139108b
            com.avito.android.deeplink_handler.handler.composite.a r1 = r6.f139107k
            com.avito.android.deep_linking.links.DeepLink r7 = r7.getAction()
            com.avito.android.deep_linking.links.DeepLink[] r7 = new com.avito.android.deep_linking.links.DeepLink[]{r7}
            r6.i(r0, r1, r7)
            goto L93
        L75:
            boolean r0 = r7 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r0 == 0) goto La0
            com.avito.android.remote.model.TypedResult$Error r7 = (com.avito.android.remote.model.TypedResult.Error) r7
            com.avito.android.remote.error.ApiError r0 = r7.getError()
            java.lang.Throwable r7 = r7.getCause()
            com.avito.android.util.C35936s.a(r0, r7)
            com.avito.android.deeplink_handler.view.a$i r7 = r6.f139103g
            r0 = 2131953472(0x7f130740, float:1.9543416E38)
            r7.Y1(r0)
            com.avito.android.developments_catalog.deeplink.i$a$b r7 = com.avito.android.developments_catalog.deeplink.i.a.b.f139109b
            r6.j(r7)
        L93:
            com.avito.android.deeplink_handler.view.a$g r7 = r6.f139104h
            com.avito.android.deeplink_handler.handler.bundle.a r6 = r6.d()
            r0 = 0
            r7.g(r6, r0)
            kotlin.G0 r6 = kotlin.G0.f406611a
            return r6
        La0:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.developments_catalog.deeplink.i.o(com.avito.android.deep_linking.links.DevelopmentsCatalogPhoneLink, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
