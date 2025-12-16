package Fc1;

import feedback.shared.sdk.api.network.entities.CampaignInfo;
import feedback.shared.sdk.api.network.entities.CampaignPagesResult;

@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes9.dex */
public final class Q6 implements dagger.internal.h<CampaignPagesResult> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f5159a;

    public Q6(V5 v52, dagger.internal.l lVar) {
        this.f5159a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new CampaignPagesResult((CampaignInfo) this.f5159a.f393949a);
    }
}
