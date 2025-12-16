package WK0;

import AK0.l;
import Y61.k;
import androidx.camera.camera2.internal.G;
import kotlin.Metadata;

/* compiled from: UxFeedbackStartCampaignStorage.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LWK0/h;", "LWK0/g;", "_avito_ux-feedback_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f17868a;

    public h(@k l lVar) {
        this.f17868a = lVar;
    }

    @Override // WK0.g
    public final void a(@k String str) {
        this.f17868a.putBoolean(G.f("is_campaign_started_", str), true);
    }

    @Override // WK0.g
    public final boolean b(@k String str) {
        return this.f17868a.getBoolean(G.f("is_campaign_started_", str), false);
    }

    @Override // WK0.g
    public final void clear() {
        this.f17868a.clear();
    }
}
