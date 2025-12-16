package com.avito.android.cpt.mass_activation.deeplink;

import Y61.k;
import Zx.C19616a;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import androidx.core.os.C22777e;
import androidx.fragment.app.DialogFragment;
import com.avito.android.cpt.mass_activation.CptMassActivationDialogFragment;
import com.avito.android.cpt.mass_activation.CptMassActivationDialogV2Fragment;
import com.avito.android.cpt.mass_activation.deeplink.CptMassActivationEstimateLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.V2;
import ev.AbstractC40161a;
import io.reactivex.rxjava3.internal.operators.observable.W;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import rv.C47919b;

/* compiled from: CptMassActivationDeepLinkHandler.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cpt/mass_activation/deeplink/a;", "Lev/a;", "Lcom/avito/android/cpt/mass_activation/deeplink/CptMassActivationEstimateLink;", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a extends AbstractC40161a<CptMassActivationEstimateLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.d f126493f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.f f126494g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f126495h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final C19616a f126496i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f126497j = new io.reactivex.rxjava3.disposables.c();

    @Inject
    public a(@k a.d dVar, @k a.f fVar, @k com.avito.android.deeplink_handler.handler.composite.a aVar, @k C19616a c19616a) {
        this.f126493f = dVar;
        this.f126494g = fVar;
        this.f126495h = aVar;
        this.f126496i = c19616a;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        DialogFragment cptMassActivationDialogFragment;
        C19616a c19616a = this.f126496i;
        c19616a.getClass();
        n<Object> nVar = C19616a.f20576q[7];
        boolean zBooleanValue = ((Boolean) c19616a.f20584i.a().invoke()).booleanValue();
        List<String> list = ((CptMassActivationEstimateLink) deepLink).f126487b;
        if (zBooleanValue) {
            CptMassActivationDialogV2Fragment.f126446A0.getClass();
            cptMassActivationDialogFragment = new CptMassActivationDialogV2Fragment();
            cptMassActivationDialogFragment.setArguments(C22777e.b(new Q("cpt_mass_activation_key_item_ids", list.toArray(new String[0]))));
        } else {
            CptMassActivationDialogFragment.f126412x0.getClass();
            cptMassActivationDialogFragment = new CptMassActivationDialogFragment();
            cptMassActivationDialogFragment.setArguments(C22777e.b(new Q("cpt_mass_activation_key_item_ids", list.toArray(new String[0]))));
        }
        this.f126493f.w1(cptMassActivationDialogFragment, "CptMassActivationDeepLinkHandler_" + this.f395444b);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        W wL1 = this.f126494g.l1("CptMassActivationDeepLinkHandler_" + this.f395444b);
        l41.g gVar = new l41.g() { // from class: com.avito.android.cpt.mass_activation.deeplink.a.a
            @Override // l41.g
            public final void accept(Object obj) {
                a aVar = a.this;
                Bundle bundle = ((C47919b) obj).f437159b;
                DeepLink deepLink = (DeepLink) (bundle == null ? null : Build.VERSION.SDK_INT >= 33 ? (Parcelable) bundle.getParcelable("cpt_mass_activation_key_deeplink", DeepLink.class) : bundle.getParcelable("cpt_mass_activation_key_deeplink"));
                if (deepLink == null) {
                    aVar.j(CptMassActivationEstimateLink.b.a.f126490b);
                    return;
                }
                Bundle bundleB = aVar.b();
                if (bundleB == null || !bundleB.getBoolean("cpt_mass_activation_key_from_pre_activation")) {
                    aVar.i(CptMassActivationEstimateLink.b.C3762b.f126491b, aVar.f126495h, deepLink);
                } else {
                    aVar.j(new CptMassActivationEstimateLink.b.c(deepLink));
                }
            }
        };
        final V2 v22 = V2.f318762a;
        this.f126497j.b(wL1.v0(gVar, new l41.g() { // from class: com.avito.android.cpt.mass_activation.deeplink.a.b
            @Override // l41.g
            public final void accept(Object obj) {
                v22.f((Throwable) obj);
            }
        }, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f126497j.e();
    }
}
