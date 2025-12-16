package Fc1;

import feedback.shared.sdk.api.network.entities.CampaignInfo;
import feedback.shared.sdk.api.network.entities.CampaignPagesResult;
import javax.inject.Inject;

@kotlin.jvm.internal.s0
/* renamed from: Fc1.y4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13780y4 {

    /* renamed from: a, reason: collision with root package name */
    @Inject
    public final InterfaceC13706q1 f5900a;

    /* renamed from: b, reason: collision with root package name */
    @Inject
    public final CampaignInfo f5901b;

    /* renamed from: c, reason: collision with root package name */
    @Inject
    public final U7 f5902c;

    /* renamed from: d, reason: collision with root package name */
    @Inject
    public final CampaignPagesResult f5903d;

    /* renamed from: e, reason: collision with root package name */
    @Inject
    public final G0 f5904e;

    /* renamed from: f, reason: collision with root package name */
    @Inject
    public final InterfaceC13642j0 f5905f;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public C13780y4(@Y61.k E5 e52) {
        T3 t32 = new T3(this);
        C13628h4 c13628h4 = new C13628h4(this);
        Q4 q42 = new Q4();
        D6 d62 = e52.f4917b;
        E5 e53 = e52.f4918c;
        C13693o6 c13693o6 = new C13693o6(d62, e53, q42, t32, c13628h4);
        this.f5900a = (InterfaceC13706q1) c13693o6.f5729f.get();
        this.f5901b = e53.f4916a;
        this.f5902c = (U7) e53.f4921f.get();
        this.f5903d = (CampaignPagesResult) e53.f4922g.get();
        this.f5904e = (G0) d62.f4859G.get();
        this.f5905f = (InterfaceC13642j0) c13693o6.f5725b.get();
    }
}
