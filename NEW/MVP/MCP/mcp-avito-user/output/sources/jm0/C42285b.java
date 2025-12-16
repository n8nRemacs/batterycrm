package jM0;

import AK0.l;
import Y61.k;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: VasPlanFeedbackSessionStorage.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LjM0/b;", "LjM0/a;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: jM0.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C42285b implements InterfaceC42284a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f405583a;

    @Inject
    public C42285b(@k l lVar) {
        this.f405583a = lVar;
    }

    @Override // jM0.InterfaceC42284a
    public final boolean a() {
        l lVar = this.f405583a;
        int i12 = lVar.getInt("vas_plan_ux_feedback_count_show", 0) + 1;
        if (i12 <= 3) {
            lVar.a(i12, "vas_plan_ux_feedback_count_show");
        }
        return i12 == 2;
    }
}
