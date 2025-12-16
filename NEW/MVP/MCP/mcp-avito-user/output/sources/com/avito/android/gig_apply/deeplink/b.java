package com.avito.android.gig_apply.deeplink;

import Y41.p;
import com.avito.android.R;
import com.avito.android.authorization.AuthSource;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.auth.AuthenticateLink;
import com.avito.android.deep_linking.x;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.error.z;
import com.avito.android.gig_apply.GigApplyDeeplink;
import com.avito.android.gig_apply.ui.GigApplyErrorDialogFragment;
import com.avito.android.gig_apply.ui.GigApplyErrorOpenParams;
import com.avito.android.gig_apply.ui.GigApplyOpenParams;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.text.AttributedText;
import java.io.Serializable;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.T;
import sv.C48421d;
import zF.C50452a;

/* compiled from: GigApplyDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.gig_apply.deeplink.GigApplyDeeplinkHandler$doHandle$1", f = "GigApplyDeeplinkHandler.kt", i = {}, l = {83}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f159555q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.gig_apply.deeplink.a f159556r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ GigApplyDeeplink f159557s;

    /* compiled from: GigApplyDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LzF/e;", "it", "Lkotlin/G0;", "invoke", "(LzF/e;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<zF.e, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.gig_apply.deeplink.a f159558l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ GigApplyDeeplink f159559m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.avito.android.gig_apply.deeplink.a aVar, GigApplyDeeplink gigApplyDeeplink) {
            super(1);
            this.f159558l = aVar;
            this.f159559m = gigApplyDeeplink;
        }

        @Override // Y41.l
        public final G0 invoke(zF.e eVar) {
            String uri;
            zF.e eVar2 = eVar;
            String successUri = eVar2.getSuccessUri();
            com.avito.android.gig_apply.deeplink.a aVar = this.f159558l;
            x xVar = aVar.f159541n;
            DeepLink deepLinkB = successUri != null ? xVar.b(successUri) : null;
            if (deepLinkB != null) {
                b.a.a(aVar.f159538k, deepLinkB, null, null, 6);
            } else if (eVar2.getShiftSnippet() != null && eVar2.b() != null) {
                GigApplyDeeplink gigApplyDeeplink = this.f159559m;
                long j12 = gigApplyDeeplink.f159516b;
                List<AttributedText> listB = eVar2.b();
                String disclaimerUrl = eVar2.getDisclaimerUrl();
                String promotionUrl = eVar2.getPromotionUrl();
                String address = eVar2.getShiftSnippet().getAddress();
                String date = eVar2.getShiftSnippet().getDate();
                String endTime = eVar2.getShiftSnippet().getEndTime();
                String startTime = eVar2.getShiftSnippet().getStartTime();
                String defaultUrl = eVar2.getShiftSnippet().getSeller().getAvatar().getDefaultUrl();
                String name = eVar2.getShiftSnippet().getSeller().getName();
                String title = eVar2.getShiftSnippet().getTitle();
                String totalPrice = eVar2.getShiftSnippet().getTotalPrice();
                C50452a actionButton = eVar2.getActionButton();
                aVar.f159536i.J(aVar.f159533f.a(new GigApplyOpenParams(j12, listB, disclaimerUrl, promotionUrl, address, date, endTime, defaultUrl, name, startTime, title, totalPrice, actionButton != null ? actionButton.getLabel() : null, gigApplyDeeplink.f159517c)), C48421d.a(aVar), com.avito.android.deeplink_handler.view.c.f134589l);
            } else if (eVar2.getSheet() != null) {
                String title2 = eVar2.getSheet().getTitle();
                String description = eVar2.getSheet().getDescription();
                C50452a actionButton2 = eVar2.getActionButton();
                String label = actionButton2 != null ? actionButton2.getLabel() : null;
                C50452a actionButton3 = eVar2.getActionButton();
                GigApplyErrorOpenParams gigApplyErrorOpenParams = new GigApplyErrorOpenParams(title2, description, label, (actionButton3 == null || (uri = actionButton3.getUri()) == null) ? null : xVar.b(uri));
                GigApplyErrorDialogFragment.f159842l0.getClass();
                GigApplyErrorDialogFragment gigApplyErrorDialogFragment = new GigApplyErrorDialogFragment();
                gigApplyErrorDialogFragment.f159844h0.setValue(gigApplyErrorDialogFragment, GigApplyErrorDialogFragment.f159843m0[0], gigApplyErrorOpenParams);
                aVar.f159537j.w1(gigApplyErrorDialogFragment, aVar.f395444b);
            }
            aVar.f159539l.g(null, false);
            return G0.f406611a;
        }
    }

    /* compiled from: GigApplyDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.gig_apply.deeplink.b$b, reason: collision with other inner class name */
    public static final class C4663b extends N implements Y41.l<String, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.gig_apply.deeplink.a f159560l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4663b(com.avito.android.gig_apply.deeplink.a aVar) {
            super(1);
            this.f159560l = aVar;
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            com.avito.android.gig_apply.deeplink.a aVar = this.f159560l;
            aVar.f159539l.g(null, false);
            a.i.C4057a.d(aVar.f159542o, com.avito.android.printable_text.b.c(R.string.gig_apply_error, new Serializable[0]), null, null, new f.c(new IllegalStateException(str)), 0, null, null, null, 2030);
            return G0.f406611a;
        }
    }

    /* compiled from: GigApplyDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<String, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.gig_apply.deeplink.a f159561l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ GigApplyDeeplink f159562m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.avito.android.gig_apply.deeplink.a aVar, GigApplyDeeplink gigApplyDeeplink) {
            super(1);
            this.f159561l = aVar;
            this.f159562m = gigApplyDeeplink;
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            com.avito.android.gig_apply.deeplink.a aVar = this.f159561l;
            aVar.f159539l.g(null, false);
            b.a.a(aVar.f159538k, new AuthenticateLink(AuthSource.f92707i0, false, (DeepLink) this.f159562m, 2, (C42822w) null), null, null, 6);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.avito.android.gig_apply.deeplink.a aVar, GigApplyDeeplink gigApplyDeeplink, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f159556r = aVar;
        this.f159557s = gigApplyDeeplink;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new b(this.f159556r, this.f159557s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f159555q;
        com.avito.android.gig_apply.deeplink.a aVar = this.f159556r;
        GigApplyDeeplink gigApplyDeeplink = this.f159557s;
        if (i12 == 0) {
            C42729a0.b(obj);
            long j12 = gigApplyDeeplink.f159516b;
            this.f159555q = 1;
            obj = aVar.f159540m.b(j12, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        z.o((TypedResult) obj, new a(aVar, gigApplyDeeplink), new C4663b(aVar), new c(aVar, gigApplyDeeplink), 52);
        return G0.f406611a;
    }
}
