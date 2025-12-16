package XH0;

import AK0.l;
import Y61.k;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PublishCsatUxFeedbackGenericStorage.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LXH0/g;", "LXH0/f;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f18820a;

    @Inject
    public g(@k l lVar) {
        this.f18820a = lVar;
    }

    @Override // XH0.f
    public final void a(@k String str) {
        this.f18820a.putBoolean("publish_csat_ux_feedback_generic_show_pref_key".concat(str), false);
    }

    @Override // XH0.f
    public final boolean b(@k String str) {
        return this.f18820a.getBoolean("publish_csat_ux_feedback_generic_show_pref_key".concat(str), true);
    }
}
