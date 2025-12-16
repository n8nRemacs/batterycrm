package wW;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.job_assistant_pick_location.deeplink.JobAssistantPickLocationLink;
import com.avito.android.publish.FlowType;
import com.avito.android.publish.PublishIntentFactory;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: JobAssistantPickLocationDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LwW/a;", "Lev/b;", "Lcom/avito/android/job_assistant_pick_location/deeplink/JobAssistantPickLocationLink;", "_avito_location-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: wW.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C49567a extends AbstractC40162b<JobAssistantPickLocationLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final PublishIntentFactory f441515d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f441516e;

    @Inject
    public C49567a(@k PublishIntentFactory publishIntentFactory, @k a.InterfaceC4053a interfaceC4053a) {
        this.f441515d = publishIntentFactory;
        this.f441516e = interfaceC4053a;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        PublishIntentFactory.JobAssistantParams jobAssistantParams = new PublishIntentFactory.JobAssistantParams(((JobAssistantPickLocationLink) deepLink).f174713b);
        PublishIntentFactory.LocationPickerChooseButtonLocation locationPickerChooseButtonLocation = PublishIntentFactory.LocationPickerChooseButtonLocation.f231992c;
        this.f441516e.R(this.f441515d.g((2046 & 1) != 0 ? null : null, (2046 & 4) != 0 ? null : null, (2046 & 8) != 0 ? null : null, (2046 & 16) != 0 ? PublishIntentFactory.LocationPickerChooseButtonLocation.f231991b : locationPickerChooseButtonLocation, (2046 & 32) != 0 ? null : null, (2046 & 64) != 0 ? null : jobAssistantParams, (2046 & 128) != 0 ? null : null, (2046 & 256) == 0, (2046 & 1024) != 0 ? null : null, FlowType.f231902b), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
