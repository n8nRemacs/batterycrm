package Kw0;

import Bw0.i;
import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.silent_update_deeplinks.schedule.SilentUpdateScheduleLink;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SilentUpdateScheduleLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LKw0/c;", "Lev/b;", "Lcom/avito/android/silent_update_deeplinks/schedule/SilentUpdateScheduleLink;", "_avito_silent-update-deeplinks_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c extends AbstractC40162b<SilentUpdateScheduleLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final i f9716d;

    @Inject
    public c(@k i iVar) {
        this.f9716d = iVar;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        SilentUpdateScheduleLink silentUpdateScheduleLink = (SilentUpdateScheduleLink) deepLink;
        this.f9716d.a(silentUpdateScheduleLink.f283774b, silentUpdateScheduleLink.f283775c, null);
        return AbstractC14250d.c.f9171c;
    }
}
