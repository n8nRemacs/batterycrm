package Fc1;

import feedback.shared.sdk.api.network.entities.CampaignInfo;

@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: Fc1.w6, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13764w6 implements dagger.internal.h<U7> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.h f5876a;

    public C13764w6(V5 v52, dagger.internal.l lVar) {
        this.f5876a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new U7(((CampaignInfo) this.f5876a.get()).getPages());
    }
}
