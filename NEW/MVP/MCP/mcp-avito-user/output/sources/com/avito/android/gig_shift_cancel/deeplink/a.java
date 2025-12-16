package com.avito.android.gig_shift_cancel.deeplink;

import Ju.AbstractC14250d;
import Y41.p;
import Y61.k;
import Y61.l;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.gig_shift_cancel.GigShiftCancelDeeplink;
import com.avito.android.gig_shift_cancel.ui.GigShiftCancelDialogFragment;
import com.avito.android.gig_shift_cancel.ui.GigShiftCancelOpenParams;
import com.avito.android.gig_shift_cancel.ui.GigShiftCancelResult;
import com.avito.android.util.R0;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.rx3.y;
import rv.C47919b;

/* compiled from: GigShiftCancelDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/gig_shift_cancel/deeplink/a;", "Lev/a;", "Lcom/avito/android/gig_shift_cancel/GigShiftCancelDeeplink;", "_avito_gig_shift-cancel_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a extends AbstractC40161a<GigShiftCancelDeeplink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.d f160589f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.f f160590g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final C43238h f160591h;

    /* compiled from: GigShiftCancelDeeplinkHandler.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/b;", "fragmentResult", "Lkotlin/G0;", "<anonymous>", "(Lrv/b;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.gig_shift_cancel.deeplink.GigShiftCancelDeeplinkHandler$onCreate$1", f = "GigShiftCancelDeeplinkHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.gig_shift_cancel.deeplink.a$a, reason: collision with other inner class name */
    public static final class C4693a extends SuspendLambda implements p<C47919b, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f160592q;

        public C4693a(Continuation<? super C4693a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C4693a c4693a = a.this.new C4693a(continuation);
            c4693a.f160592q = obj;
            return c4693a;
        }

        @Override // Y41.p
        public final Object invoke(C47919b c47919b, Continuation<? super G0> continuation) {
            return ((C4693a) create(c47919b, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            Bundle bundle = ((C47919b) this.f160592q).f437159b;
            boolean z12 = ((GigShiftCancelResult) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle.getParcelable("GIG_SHIFT_CANCEL_DIALOG_FRAGMENT_RESULT_KEY", GigShiftCancelResult.class) : bundle.getParcelable("GIG_SHIFT_CANCEL_DIALOG_FRAGMENT_RESULT_KEY"))) instanceof GigShiftCancelResult.Closed;
            a aVar = a.this;
            if (z12) {
                aVar.j(GigShiftCancelDeeplink.b.a.f160588b);
            } else {
                aVar.j(AbstractC14250d.c.f9171c);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public a(@k a.d dVar, @k a.f fVar, @k R0 r02) {
        this.f160589f = dVar;
        this.f160590g = fVar;
        this.f160591h = U.a(r02.b());
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        GigShiftCancelOpenParams gigShiftCancelOpenParams = new GigShiftCancelOpenParams(((GigShiftCancelDeeplink) deepLink).f160587b);
        GigShiftCancelDialogFragment.f160706u0.getClass();
        GigShiftCancelDialogFragment gigShiftCancelDialogFragment = new GigShiftCancelDialogFragment();
        gigShiftCancelDialogFragment.f160710j0.setValue(gigShiftCancelDialogFragment, GigShiftCancelDialogFragment.f160707v0[0], gigShiftCancelOpenParams);
        this.f160589f.w1(gigShiftCancelDialogFragment, this.f395444b);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        C43175k.K(new C43197r1(new C4693a(null), y.a(this.f160590g.l1("GIG_SHIFT_CANCEL_DIALOG_FRAGMENT_REQUEST_KEY"))), this.f160591h);
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        U.b(this.f160591h, null);
    }
}
