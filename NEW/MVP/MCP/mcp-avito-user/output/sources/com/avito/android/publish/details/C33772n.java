package com.avito.android.publish.details;

import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.OnboardingStepsLink;
import com.avito.android.publish.details.D;
import com.avito.android.publish.details.K1;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.publish.details.n, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final /* synthetic */ class C33772n implements com.avito.android.deep_linking.links.w {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f234848b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f234849c;

    public /* synthetic */ C33772n(Object obj, int i12) {
        this.f234848b = i12;
        this.f234849c = obj;
    }

    @Override // com.avito.android.deep_linking.links.w
    public final void i7(DeepLink deepLink) {
        Bundle bundle;
        switch (this.f234848b) {
            case 0:
                ((C33775o) this.f234849c).f234858b.n(deepLink);
                break;
            case 1:
                boolean z12 = deepLink instanceof OnboardingStepsLink;
                E e12 = (E) this.f234849c;
                if (z12) {
                    OnboardingStepsLink.Arguments arguments = new OnboardingStepsLink.Arguments(e12.f232644k.b());
                    bundle = new Bundle();
                    bundle.putParcelable("onboarding_steps_argument_key", arguments);
                } else {
                    bundle = null;
                }
                D.a aVar = e12.f232652s;
                if (aVar != null) {
                    aVar.K2(deepLink, bundle);
                    break;
                }
                break;
            default:
                ((C33782q0) this.f234849c).f234900d.setValue(new K1.AbstractC33668b.f(deepLink));
                break;
        }
    }
}
