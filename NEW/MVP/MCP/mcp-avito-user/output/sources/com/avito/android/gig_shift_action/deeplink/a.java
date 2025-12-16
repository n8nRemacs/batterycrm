package com.avito.android.gig_shift_action.deeplink;

import Y41.p;
import Y61.k;
import Y61.l;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import bv.C25719a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.gig_shift_action.GigShiftActionDeeplink;
import com.avito.android.gig_shift_action.ui.GigShiftActionDialogFragment;
import com.avito.android.gig_shift_action.ui.GigShiftActionOpenParams;
import com.avito.android.gig_shift_action.ui.GigShiftActionResult;
import com.avito.android.util.R0;
import fv.C40483b;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import rG.InterfaceC47539a;
import rv.C47919b;

/* compiled from: GigShiftActionDeeplinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/gig_shift_action/deeplink/a;", "Lcom/avito/android/deeplink_handler/handler/base/coroutines/a;", "Lcom/avito/android/gig_shift_action/GigShiftActionDeeplink;", "_avito_gig_shift-action_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a extends com.avito.android.deeplink_handler.handler.base.coroutines.a<GigShiftActionDeeplink> {

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.d f160393g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f160394h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final C25719a f160395i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final a.f f160396j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final InterfaceC47539a f160397k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final a.g f160398l;

    /* compiled from: GigShiftActionDeeplinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.gig_shift_action.deeplink.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C4687a extends C42801a implements p<C47919b, Continuation<? super G0>, Object>, SuspendFunction {
        @Override // Y41.p
        public final Object invoke(C47919b c47919b, Continuation<? super G0> continuation) {
            a aVar = (a) this.receiver;
            aVar.getClass();
            Bundle bundle = c47919b.f437159b;
            GigShiftActionResult gigShiftActionResult = (GigShiftActionResult) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle.getParcelable("GIG_SHIFT_ACTION_BOTTOM_SHEET_RESULT_KEY", GigShiftActionResult.class) : bundle.getParcelable("GIG_SHIFT_ACTION_BOTTOM_SHEET_RESULT_KEY"));
            if (gigShiftActionResult instanceof GigShiftActionResult.OpenBarcodeScanner) {
                aVar.j(GigShiftActionDeeplink.b.a.f160389b);
            } else if (gigShiftActionResult instanceof GigShiftActionResult.OpenRating) {
                aVar.j(new GigShiftActionDeeplink.b.c(((GigShiftActionResult.OpenRating) gigShiftActionResult).f160580b));
            } else if (gigShiftActionResult instanceof GigShiftActionResult.OpenDeeplink) {
                aVar.j(new GigShiftActionDeeplink.b.C4686b(((GigShiftActionResult.OpenDeeplink) gigShiftActionResult).f160579b));
            } else {
                aVar.j(GigShiftActionDeeplink.b.d.f160392b);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public a(@k a.d dVar, @k com.avito.android.deeplink_handler.handler.composite.a aVar, @k C25719a c25719a, @k a.f fVar, @k InterfaceC47539a interfaceC47539a, @k a.g gVar, @k R0 r02) {
        super(r02);
        this.f160393g = dVar;
        this.f160394h = aVar;
        this.f160395i = c25719a;
        this.f160396j = fVar;
        this.f160397k = interfaceC47539a;
        this.f160398l = gVar;
    }

    @Override // com.avito.android.deeplink_handler.handler.base.coroutines.a
    public final Object m(DeepLink deepLink, String str, Bundle bundle, Continuation continuation) {
        GigShiftActionDeeplink gigShiftActionDeeplink = (GigShiftActionDeeplink) deepLink;
        if (gigShiftActionDeeplink.f160388d) {
            Object objO = o(gigShiftActionDeeplink, (ContinuationImpl) continuation);
            return objO == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objO : G0.f406611a;
        }
        GigShiftActionOpenParams gigShiftActionOpenParams = new GigShiftActionOpenParams(gigShiftActionDeeplink.f160386b, gigShiftActionDeeplink.f160387c);
        GigShiftActionDialogFragment.f160550v0.getClass();
        GigShiftActionDialogFragment gigShiftActionDialogFragment = new GigShiftActionDialogFragment();
        gigShiftActionDialogFragment.f160554j0.setValue(gigShiftActionDialogFragment, GigShiftActionDialogFragment.f160551w0[0], gigShiftActionOpenParams);
        this.f160393g.w1(gigShiftActionDialogFragment, this.f395444b);
        return G0.f406611a;
    }

    @Override // com.avito.android.deeplink_handler.handler.base.coroutines.a
    @l
    public final Object n(@k Continuation<? super G0> continuation) {
        C43175k.K(new C43197r1(new C4687a(2, this, a.class, "handleResult", "handleResult(Lcom/avito/android/deeplink_handler/view/result/FragmentResult;)V", 4), C40483b.b(this.f160396j, "GIG_SHIFT_ACTION_BOTTOM_SHEET_REQUEST_KEY")), this.f134492f);
        return G0.f406611a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(com.avito.android.gig_shift_action.GigShiftActionDeeplink r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.avito.android.gig_shift_action.deeplink.b
            if (r0 == 0) goto L13
            r0 = r13
            com.avito.android.gig_shift_action.deeplink.b r0 = (com.avito.android.gig_shift_action.deeplink.b) r0
            int r1 = r0.f160404v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f160404v = r1
            goto L18
        L13:
            com.avito.android.gig_shift_action.deeplink.b r0 = new com.avito.android.gig_shift_action.deeplink.b
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.f160402t
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f160404v
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            com.avito.android.gig_shift_action.GigShiftActionDeeplink r12 = r0.f160401s
            com.avito.android.gig_shift_action.GigShiftActionDeeplink r1 = r0.f160400r
            com.avito.android.gig_shift_action.deeplink.a r0 = r0.f160399q
            kotlin.C42729a0.b(r13)
            goto L63
        L30:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L38:
            kotlin.C42729a0.b(r13)
            com.avito.android.deeplink_handler.view.a$g r13 = r11.f160398l
            r13.g(r3, r4)
            com.avito.android.gig_shift_action.GigShiftActionDeeplink r13 = new com.avito.android.gig_shift_action.GigShiftActionDeeplink
            java.lang.String r7 = r12.f160387c
            r6 = 0
            r8 = 0
            r9 = 4
            r10 = 0
            r5 = r13
            r5.<init>(r6, r7, r8, r9, r10)
            r0.f160399q = r11
            r0.f160400r = r12
            r0.f160401s = r13
            r0.f160404v = r4
            rG.a r2 = r11.f160397k
            java.lang.String r4 = r12.f160387c
            java.lang.Object r0 = r2.a(r4, r0)
            if (r0 != r1) goto L5f
            return r1
        L5f:
            r1 = r12
            r12 = r13
            r13 = r0
            r0 = r11
        L63:
            com.avito.android.remote.model.TypedResult r13 = (com.avito.android.remote.model.TypedResult) r13
            com.avito.android.gig_shift_action.deeplink.c r2 = new com.avito.android.gig_shift_action.deeplink.c
            r2.<init>(r0, r12)
            com.avito.android.gig_shift_action.deeplink.d r4 = new com.avito.android.gig_shift_action.deeplink.d
            r4.<init>(r0, r12)
            com.avito.android.gig_shift_action.deeplink.f r12 = new com.avito.android.gig_shift_action.deeplink.f
            r12.<init>(r0, r1)
            r1 = 52
            com.avito.android.error.z.o(r13, r2, r4, r12, r1)
            com.avito.android.deeplink_handler.view.a$g r12 = r0.f160398l
            r13 = 0
            r12.g(r3, r13)
            Ju.d$c r12 = Ju.AbstractC14250d.c.f9171c
            r0.j(r12)
            kotlin.G0 r12 = kotlin.G0.f406611a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.gig_shift_action.deeplink.a.o(com.avito.android.gig_shift_action.GigShiftActionDeeplink, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
