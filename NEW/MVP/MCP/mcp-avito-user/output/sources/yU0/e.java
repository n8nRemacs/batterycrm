package Yu0;

import Y61.k;
import Zu0.c;
import android.content.res.Resources;
import com.avito.android.J0;
import com.avito.android.R;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.service_booking.api.remote.model.onboarding.ServicesOnboarding;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: ServicesOnboardingConverter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LYu0/e;", "LYu0/d;", "_avito_services-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final J0 f19728a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Resources f19729b;

    @Inject
    public e(@k Resources resources, @k J0 j02) {
        this.f19728a = j02;
        this.f19729b = resources;
    }

    @Override // Yu0.d
    @k
    public final Zu0.c a(@k ServicesOnboarding servicesOnboarding) {
        c.a aVar = new c.a(this.f19729b.getString(R.string.services_onboarding_next_page_button_default_hint), null);
        List<ServicesOnboarding.OnboardingStep> listD = servicesOnboarding.d();
        ArrayList arrayList = new ArrayList(C42745f0.q(listD, 10));
        for (ServicesOnboarding.OnboardingStep onboardingStep : listD) {
            String strValueOf = String.valueOf(this.f19728a.a());
            UniversalImage image = onboardingStep.getImage();
            String title = onboardingStep.getTitle();
            AttributedText description = onboardingStep.getDescription();
            ServicesOnboarding.Event stepOpenedEvent = onboardingStep.getStepOpenedEvent();
            arrayList.add(new c.d(strValueOf, image, title, description, stepOpenedEvent != null ? new c.C1471c(stepOpenedEvent.getEventId(), stepOpenedEvent.getVersion(), stepOpenedEvent.getParams()) : null));
        }
        return new Zu0.c(arrayList, aVar, new c.a(servicesOnboarding.getAction().getTitle(), servicesOnboarding.getAction().getUri()), aVar, null, false);
    }
}
