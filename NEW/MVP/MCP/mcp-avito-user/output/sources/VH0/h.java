package VH0;

import AK0.l;
import Y61.k;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PublishCsatUxFeedbackStorage.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVH0/h;", "LVH0/g;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f17046a;

    @Inject
    public h(@k l lVar) {
        this.f17046a = lVar;
    }

    @Override // VH0.g
    public final boolean a() {
        return this.f17046a.getBoolean("publish_csat_ux_feedback_show_pref_key", true);
    }

    @Override // VH0.g
    public final void b() {
        this.f17046a.putBoolean("publish_csat_ux_feedback_show_pref_key", false);
    }
}
