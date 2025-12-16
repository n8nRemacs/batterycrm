package Fc1;

import Fc1.Q4;
import feedback.shared.sdk.api.network.entities.CampaignInfo;
import kotlin.NoWhenBranchMatchedException;

@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: Fc1.x5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13772x5 implements dagger.internal.h<InterfaceC13706q1> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.h f5890a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f5891b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f5892c;

    public C13772x5(Q4 q42, dagger.internal.l lVar, dagger.internal.u uVar, dagger.internal.u uVar2) {
        this.f5890a = lVar;
        this.f5891b = uVar;
        this.f5892c = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Object obj;
        CampaignInfo campaignInfo = (CampaignInfo) this.f5890a.get();
        h31.e eVarB = dagger.internal.g.b(this.f5891b);
        h31.e eVarA = dagger.internal.g.a(dagger.internal.w.a(this.f5892c));
        int i12 = Q4.b.f5156a[campaignInfo.getType().ordinal()];
        if (i12 == 1) {
            obj = eVarB.get();
        } else {
            if (i12 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            obj = eVarA.get();
        }
        return (InterfaceC13706q1) obj;
    }
}
