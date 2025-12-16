package com.avito.android.important_addresses_selection.deeplink;

import Y41.p;
import android.os.Bundle;
import bv.C25719a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.important_addresses_selection.data.model.ImportantAddressesData;
import com.avito.android.important_addresses_selection.deeplink.l;
import com.avito.android.util.R0;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.rx3.y;
import kotlinx.coroutines.t1;
import rv.C47919b;

/* compiled from: ImportantAddressesSelectionDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/important_addresses_selection/deeplink/f;", "Lev/a;", "Lcom/avito/android/important_addresses_selection/deeplink/ImportantAddressesSelectionLink;", "_avito_important-addresses-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f extends AbstractC40161a<ImportantAddressesSelectionLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C25719a f169735f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f169736g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final a.d f169737h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final a.f f169738i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final RM.a f169739j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final a.g f169740k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final a.i f169741l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f169742m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final C43238h f169743n;

    /* compiled from: ImportantAddressesSelectionDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/b;", "it", "Lkotlin/G0;", "<anonymous>", "(Lrv/b;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.important_addresses_selection.deeplink.ImportantAddressesSelectionDeeplinkHandler$onCreate$1", f = "ImportantAddressesSelectionDeeplinkHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<C47919b, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f169744q;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = f.this.new a(continuation);
            aVar.f169744q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(C47919b c47919b, Continuation<? super G0> continuation) {
            return ((a) create(c47919b, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            C47919b c47919b = (C47919b) this.f169744q;
            f fVar = f.this;
            Bundle bundle = c47919b.f437159b;
            ImportantAddressesData importantAddressesData = (ImportantAddressesData) bundle.getParcelable("key.important_addresses_data");
            DeepLink deepLink = (DeepLink) bundle.getParcelable("key.important_addresses_redirect_deeplink");
            if (importantAddressesData != null) {
                fVar.j(new l.c(importantAddressesData));
            } else if (deepLink != null) {
                fVar.i(l.b.f169758b, fVar.f169736g, deepLink);
            } else {
                fVar.j(l.a.f169757b);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public f(@Y61.k R0 r02, @Y61.k C25719a c25719a, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k a.d dVar, @Y61.k a.f fVar, @Y61.k RM.a aVar2, @Y61.k a.g gVar, @Y61.k a.i iVar, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f169735f = c25719a;
        this.f169736g = aVar;
        this.f169737h = dVar;
        this.f169738i = fVar;
        this.f169739j = aVar2;
        this.f169740k = gVar;
        this.f169741l = iVar;
        this.f169742m = interfaceC28373a;
        this.f169743n = U.a(CoroutineContext.Element.DefaultImpls.plus((V0) t1.b(), r02.b()));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k(com.avito.android.important_addresses_selection.deeplink.f r8, java.lang.String r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            boolean r0 = r10 instanceof com.avito.android.important_addresses_selection.deeplink.c
            if (r0 == 0) goto L14
            r0 = r10
            com.avito.android.important_addresses_selection.deeplink.c r0 = (com.avito.android.important_addresses_selection.deeplink.c) r0
            int r1 = r0.f169727u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f169727u = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            com.avito.android.important_addresses_selection.deeplink.c r0 = new com.avito.android.important_addresses_selection.deeplink.c
            r0.<init>(r8, r10)
            goto L12
        L1a:
            java.lang.Object r10 = r6.f169725s
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f169727u
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3e
            if (r1 == r3) goto L36
            if (r1 != r2) goto L2e
            kotlin.C42729a0.b(r10)
            goto L86
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            java.lang.String r9 = r6.f169724r
            com.avito.android.important_addresses_selection.deeplink.f r8 = r6.f169723q
            kotlin.C42729a0.b(r10)
            goto L5b
        L3e:
            kotlin.C42729a0.b(r10)
            com.avito.android.deeplink_handler.view.a$g r10 = r8.f169740k
            com.avito.android.deeplink_handler.handler.bundle.a r1 = r8.d()
            r10.g(r1, r3)
            r6.f169723q = r8
            r6.f169724r = r9
            r6.f169727u = r3
            RM.a r10 = r8.f169739j
            RM.c r10 = r10.f14407a
            java.lang.Object r10 = r10.b(r9, r6)
            if (r10 != r0) goto L5b
            goto L88
        L5b:
            r1 = r10
            com.avito.android.remote.model.TypedResult r1 = (com.avito.android.remote.model.TypedResult) r1
            com.avito.android.important_addresses_selection.deeplink.d r10 = new com.avito.android.important_addresses_selection.deeplink.d
            r3 = 0
            r10.<init>(r8, r3)
            com.avito.android.important_addresses_selection.deeplink.e r4 = new com.avito.android.important_addresses_selection.deeplink.e
            r4.<init>(r8, r9, r3)
            r8 = 0
            java.io.Serializable[] r8 = new java.io.Serializable[r8]
            r9 = 2131954410(0x7f130aea, float:1.9545318E38)
            com.avito.android.printable_text.PrintableText r5 = com.avito.android.printable_text.b.c(r9, r8)
            r6.f169723q = r3
            r6.f169724r = r3
            r6.f169727u = r2
            r7 = 28
            r8 = 0
            r2 = r10
            r3 = r4
            r4 = r8
            java.lang.Object r8 = com.avito.android.error.z.s(r1, r2, r3, r4, r5, r6, r7)
            if (r8 != r0) goto L86
            goto L88
        L86:
            kotlin.G0 r0 = kotlin.G0.f406611a
        L88:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.important_addresses_selection.deeplink.f.k(com.avito.android.important_addresses_selection.deeplink.f, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        ImportantAddressesSelectionLink importantAddressesSelectionLink = (ImportantAddressesSelectionLink) deepLink;
        this.f169735f.b(importantAddressesSelectionLink, this, null, new b(this, importantAddressesSelectionLink));
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        C43175k.K(new C43197r1(new a(null), y.a(this.f169738i.l1("tag.important_addresses_selection"))), this.f169743n);
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        U.b(this.f169743n, null);
    }
}
