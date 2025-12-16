package com.avito.android.publish.details.iac;

import com.avito.android.iac_util_deeplinks.public_module.ChainEventLink;
import com.avito.android.publish.details.iac.g;
import com.avito.android.publish.details.iac.l;
import com.avito.android.util.V2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: IacPermissionRequestHelper.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/iac_util_deeplinks/public_module/ChainEventLink;", "chainEventLink", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/iac_util_deeplinks/public_module/ChainEventLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class o extends N implements Y41.l<ChainEventLink, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f234769l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f234770m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f234771n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f234772o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f234773p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f234774q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f234775r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f234776s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f234777t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(String str, Y41.a<G0> aVar, Y41.a<G0> aVar2, Y41.a<G0> aVar3, Y41.a<G0> aVar4, Y41.a<G0> aVar5, Y41.a<G0> aVar6, Y41.a<G0> aVar7, Y41.a<G0> aVar8) {
        super(1);
        this.f234769l = str;
        this.f234770m = aVar;
        this.f234771n = aVar2;
        this.f234772o = aVar3;
        this.f234773p = aVar4;
        this.f234774q = aVar5;
        this.f234775r = aVar6;
        this.f234776s = aVar7;
        this.f234777t = aVar8;
    }

    @Override // Y41.l
    public final G0 invoke(ChainEventLink chainEventLink) {
        ChainEventLink chainEventLink2 = chainEventLink;
        V2.f318762a.c("IacPublishMicRequestRequester", this.f234769l + " chainEventLink.eventValue=" + chainEventLink2.f169242b, null);
        l.a.f234748a.getClass();
        if (chainEventLink2.equals((ChainEventLink) l.a.f234749b.getValue())) {
            ((g.d) this.f234770m).invoke();
        } else if (chainEventLink2.equals((ChainEventLink) l.a.f234750c.getValue())) {
            ((g.e) this.f234771n).invoke();
        } else if (chainEventLink2.equals((ChainEventLink) l.a.f234751d.getValue())) {
            ((g.f) this.f234772o).invoke();
        } else if (chainEventLink2.equals((ChainEventLink) l.a.f234752e.getValue())) {
            ((g.C7090g) this.f234773p).invoke();
        } else if (chainEventLink2.equals((ChainEventLink) l.a.f234754g.getValue())) {
            ((g.h) this.f234774q).invoke();
        } else if (chainEventLink2.equals((ChainEventLink) l.a.f234753f.getValue())) {
            ((g.i) this.f234775r).invoke();
        } else if (chainEventLink2.equals((ChainEventLink) l.a.f234755h.getValue())) {
            ((g.j) this.f234776s).invoke();
        } else if (chainEventLink2.equals((ChainEventLink) l.a.f234756i.getValue())) {
            ((g.k) this.f234777t).invoke();
        }
        return G0.f406611a;
    }
}
