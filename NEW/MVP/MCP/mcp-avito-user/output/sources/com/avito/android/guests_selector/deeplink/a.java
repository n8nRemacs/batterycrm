package com.avito.android.guests_selector.deeplink;

import Y41.p;
import Y61.k;
import Y61.l;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.guests_selector.GuestsSelectorDeeplink;
import com.avito.android.guests_selector.GuestsSelectorDialogFragment;
import com.avito.android.guests_selector.io.GuestsSelectorInput;
import com.avito.android.guests_selector.io.GuestsSelectorOutput;
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

/* compiled from: GuestsSelectorDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/guests_selector/deeplink/a;", "Lev/a;", "Lcom/avito/android/guests_selector/GuestsSelectorDeeplink;", "_avito_guests-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a extends AbstractC40161a<GuestsSelectorDeeplink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.f f161402f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.d f161403g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final C43238h f161404h;

    /* compiled from: GuestsSelectorDeeplinkHandler.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/b;", "result", "Lkotlin/G0;", "<anonymous>", "(Lrv/b;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.guests_selector.deeplink.GuestsSelectorDeeplinkHandler$onCreate$1", f = "GuestsSelectorDeeplinkHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.guests_selector.deeplink.a$a, reason: collision with other inner class name */
    public static final class C4728a extends SuspendLambda implements p<C47919b, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f161405q;

        public C4728a(Continuation<? super C4728a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C4728a c4728a = a.this.new C4728a(continuation);
            c4728a.f161405q = obj;
            return c4728a;
        }

        @Override // Y41.p
        public final Object invoke(C47919b c47919b, Continuation<? super G0> continuation) {
            return ((C4728a) create(c47919b, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            Bundle bundle = ((C47919b) this.f161405q).f437159b;
            GuestsSelectorOutput guestsSelectorOutput = (GuestsSelectorOutput) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle.getParcelable("GUESTS_PICKER_DIALOG_RESULT_KEY", GuestsSelectorOutput.class) : bundle.getParcelable("GUESTS_PICKER_DIALOG_RESULT_KEY"));
            a aVar = a.this;
            if (guestsSelectorOutput != null) {
                aVar.j(new GuestsSelectorDeeplink.b.C4722b(guestsSelectorOutput));
            } else {
                aVar.j(GuestsSelectorDeeplink.b.a.f161338b);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public a(@k a.d dVar, @k a.f fVar, @k R0 r02) {
        this.f161402f = fVar;
        this.f161403g = dVar;
        this.f161404h = U.a(r02.b());
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        GuestsSelectorDialogFragment.a aVar = GuestsSelectorDialogFragment.f161340p0;
        GuestsSelectorInput guestsSelectorInput = ((GuestsSelectorDeeplink) deepLink).f161337b;
        aVar.getClass();
        this.f161403g.w1(GuestsSelectorDialogFragment.a.a(guestsSelectorInput, null), this.f395444b);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        C43175k.K(new C43197r1(new C4728a(null), y.a(this.f161402f.l1("GUESTS_PICKER_DIALOG_REQUEST_KEY"))), this.f161404h);
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        U.b(this.f161404h, null);
    }
}
