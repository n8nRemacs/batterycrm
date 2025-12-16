package com.avito.android.search_ux_feedback;

import Rp0.b;
import SK0.b;
import SK0.f;
import Y61.k;
import com.avito.android.C34160q2;
import com.avito.android.search_ux_feedback.SearchFeedbackCampaign;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.reflect.n;

/* compiled from: SearchFeedbackHelper.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search_ux_feedback/a;", "LRp0/b;", "_avito_search-ux-feedback_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final SK0.b f264408a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C34160q2 f264409b;

    @Inject
    public a(@k SK0.b bVar, @k C34160q2 c34160q2) {
        this.f264408a = bVar;
        this.f264409b = c34160q2;
    }

    @Override // Rp0.b
    public final void a(@k SearchFeedbackCampaign searchFeedbackCampaign) {
        C34160q2 c34160q2 = this.f264409b;
        c34160q2.getClass();
        n<Object> nVar = C34160q2.f246158g[0];
        if (((Boolean) c34160q2.f246159b.a().invoke()).booleanValue()) {
            f fVar = new f();
            String str = searchFeedbackCampaign.f264386a;
            fVar.a("cid", str == null ? "" : str);
            if (searchFeedbackCampaign instanceof SearchFeedbackCampaign.e) {
                b.a.a(this.f264408a, searchFeedbackCampaign, null, fVar, null, 10);
                return;
            }
            if (searchFeedbackCampaign instanceof SearchFeedbackCampaign.a) {
                b.a.a(this.f264408a, searchFeedbackCampaign, null, fVar, null, 10);
            } else if (searchFeedbackCampaign instanceof SearchFeedbackCampaign.f) {
                b.a.a(this.f264408a, searchFeedbackCampaign, null, fVar, null, 10);
            } else {
                b.a.a(this.f264408a, searchFeedbackCampaign, null, fVar, null, 10);
                b.a.a(this.f264408a, new SearchFeedbackCampaign.e(str, null), null, fVar, null, 10);
            }
        }
    }
}
