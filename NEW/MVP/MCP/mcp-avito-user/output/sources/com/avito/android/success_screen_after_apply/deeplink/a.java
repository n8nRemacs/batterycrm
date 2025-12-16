package com.avito.android.success_screen_after_apply.deeplink;

import Ju.AbstractC14250d;
import Y41.l;
import Y41.p;
import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.error.z;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.success_screen_after_apply.SuccessScreenAfterApplyDeeplink;
import com.avito.android.success_screen_after_apply.ui.SuccessScreenAfterApplyDialogFragment;
import com.avito.android.success_screen_after_apply.ui.SuccessScreenAfterApplyOpenParams;
import iA0.C41261a;
import iA0.C41262b;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.T;

/* compiled from: SuccessScreenAfterApplyDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.success_screen_after_apply.deeplink.SuccessScreenAfterApplyDeeplinkHandler$doHandle$1", f = "SuccessScreenAfterApplyDeeplinkHandler.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f291698q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.success_screen_after_apply.deeplink.b f291699r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ SuccessScreenAfterApplyDeeplink f291700s;

    /* compiled from: SuccessScreenAfterApplyDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LGQ/e;", "it", "Lkotlin/G0;", "invoke", "(LGQ/e;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.success_screen_after_apply.deeplink.a$a, reason: collision with other inner class name */
    public static final class C8831a extends N implements l<GQ.e, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.success_screen_after_apply.deeplink.b f291701l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ SuccessScreenAfterApplyDeeplink f291702m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8831a(com.avito.android.success_screen_after_apply.deeplink.b bVar, SuccessScreenAfterApplyDeeplink successScreenAfterApplyDeeplink) {
            super(1);
            this.f291701l = bVar;
            this.f291702m = successScreenAfterApplyDeeplink;
        }

        @Override // Y41.l
        public final G0 invoke(GQ.e eVar) {
            GQ.e eVar2 = eVar;
            C41261a.f398415a.getClass();
            String title = eVar2.getTitle();
            String description = eVar2.getDescription();
            UniversalImage universalImage = new UniversalImage(eVar2.getImageLink().getValue(), eVar2.getImageLink().getValueDark());
            String title2 = eVar2.getEnrichCvButton().getTitle();
            DeepLink deeplink = eVar2.getEnrichCvButton().getDeeplink();
            GQ.b closeButton = eVar2.getCloseButton();
            DeepLink deeplink2 = closeButton != null ? closeButton.getDeeplink() : null;
            com.avito.android.success_screen_after_apply.deeplink.b bVar = this.f291701l;
            if (deeplink == null) {
                bVar.j(AbstractC14250d.b.f9170c);
            } else {
                SuccessScreenAfterApplyOpenParams successScreenAfterApplyOpenParams = new SuccessScreenAfterApplyOpenParams(this.f291702m.f291694b, title, description, universalImage, title2, deeplink, deeplink2);
                SuccessScreenAfterApplyDialogFragment.f291750q0.getClass();
                SuccessScreenAfterApplyDialogFragment successScreenAfterApplyDialogFragment = new SuccessScreenAfterApplyDialogFragment();
                successScreenAfterApplyDialogFragment.f291755k0.setValue(successScreenAfterApplyDialogFragment, SuccessScreenAfterApplyDialogFragment.f291751r0[0], successScreenAfterApplyOpenParams);
                bVar.f291704f.w1(successScreenAfterApplyDialogFragment, bVar.f395444b);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SuccessScreenAfterApplyDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements l<String, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f291703l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(String str) {
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.avito.android.success_screen_after_apply.deeplink.b bVar, SuccessScreenAfterApplyDeeplink successScreenAfterApplyDeeplink, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f291699r = bVar;
        this.f291700s = successScreenAfterApplyDeeplink;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
        return new a(this.f291699r, this.f291700s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f291698q;
        com.avito.android.success_screen_after_apply.deeplink.b bVar = this.f291699r;
        SuccessScreenAfterApplyDeeplink successScreenAfterApplyDeeplink = this.f291700s;
        if (i12 == 0) {
            C42729a0.b(obj);
            C41262b c41262b = bVar.f291705g.get();
            long j12 = successScreenAfterApplyDeeplink.f291694b;
            this.f291698q = 1;
            obj = c41262b.f398416a.a(j12, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        z.o((TypedResult) obj, new C8831a(bVar, successScreenAfterApplyDeeplink), b.f291703l, null, 60);
        return G0.f406611a;
    }
}
