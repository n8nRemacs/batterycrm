package com.avito.android.cpt.pre_activation.deeplink;

import Y41.p;
import Y61.k;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.cpt.pre_activation.PreActivationFragment;
import com.avito.android.cpt.pre_activation.deeplink.PreActivationLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.rx3.y;
import rv.C47919b;

/* compiled from: PreActivationLinkHandler.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cpt/pre_activation/deeplink/a;", "Lev/a;", "Lcom/avito/android/cpt/pre_activation/deeplink/PreActivationLink;", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a extends AbstractC40161a<PreActivationLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.d f126688f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.f f126689g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f126690h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final C43238h f126691i;

    /* compiled from: PreActivationLinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.cpt.pre_activation.deeplink.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C3772a extends C42801a implements p<C47919b, Continuation<? super G0>, Object>, SuspendFunction {
        @Override // Y41.p
        public final Object invoke(C47919b c47919b, Continuation<? super G0> continuation) {
            a aVar = (a) this.receiver;
            aVar.getClass();
            Bundle bundle = c47919b.f437159b;
            DeepLink deepLink = (DeepLink) (bundle == null ? null : Build.VERSION.SDK_INT >= 33 ? (Parcelable) bundle.getParcelable("cpt_mass_activation_key_deeplink", DeepLink.class) : bundle.getParcelable("cpt_mass_activation_key_deeplink"));
            if (deepLink == null) {
                aVar.j(PreActivationLink.b.a.f126686b);
            } else {
                aVar.i(PreActivationLink.b.C3771b.f126687b, aVar.f126690h, deepLink);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public a(@k a.d dVar, @k a.f fVar, @k com.avito.android.deeplink_handler.handler.composite.a aVar, @k R0 r02) {
        this.f126688f = dVar;
        this.f126689g = fVar;
        this.f126690h = aVar;
        this.f126691i = U.a(r02.b());
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        PreActivationFragment.f126667m0.getClass();
        PreActivationFragment preActivationFragment = new PreActivationFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("data", ((PreActivationLink) deepLink).f126685b);
        bundle2.putString("request_key", str);
        preActivationFragment.setArguments(bundle2);
        this.f126688f.w1(preActivationFragment, "PreActivationDeeplinkHandler_" + this.f395444b);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        C43175k.K(new C43197r1(new C3772a(2, this, a.class, "handleResult", "handleResult(Lcom/avito/android/deeplink_handler/view/result/FragmentResult;)V", 4), y.a(this.f126689g.l1("PreActivationDeeplinkHandler_" + this.f395444b))), this.f126691i);
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        U.b(this.f126691i, null);
    }
}
