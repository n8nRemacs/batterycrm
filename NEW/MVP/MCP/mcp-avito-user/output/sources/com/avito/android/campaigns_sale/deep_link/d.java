package com.avito.android.campaigns_sale.deep_link;

import Y61.k;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import bv.C25719a;
import com.avito.android.authorization.AuthSource;
import com.avito.android.campaigns_sale.model.CampaignsSaleArguments;
import com.avito.android.deep_linking.links.CampaignsSaleLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import l41.r;
import rv.C47918a;
import sv.C48421d;

/* compiled from: CampaignsSaleLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/campaigns_sale/deep_link/d;", "Lev/a;", "Lcom/avito/android/deep_linking/links/CampaignsSaleLink;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d extends AbstractC40161a<CampaignsSaleLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Context f113887f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f113888g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final C25719a f113889h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final a.b f113890i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f113891j = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: CampaignsSaleLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements r {
        public a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(d.this);
        }
    }

    /* compiled from: CampaignsSaleLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "result", "Lkotlin/G0;", "accept", "(Lrv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            C47918a c47918a = (C47918a) obj;
            Intent intent = c47918a.f437157c;
            boolean booleanExtra = intent != null ? intent.getBooleanExtra("reloadPreviousScreen", false) : false;
            d dVar = d.this;
            if (c47918a.f437156b == -1) {
                dVar.j(new CampaignsSaleLink.b.C3989b(booleanExtra));
            } else {
                dVar.j(CampaignsSaleLink.b.a.f133086b);
            }
        }
    }

    @Inject
    public d(@k Context context, @k C25719a c25719a, @k a.InterfaceC4053a interfaceC4053a, @k a.b bVar) {
        this.f113887f = context;
        this.f113888g = interfaceC4053a;
        this.f113889h = c25719a;
        this.f113890i = bVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        CampaignsSaleLink campaignsSaleLink = (CampaignsSaleLink) deepLink;
        CampaignsSaleArguments campaignsSaleArguments = new CampaignsSaleArguments(campaignsSaleLink.f133083b, campaignsSaleLink.f133084c, campaignsSaleLink.f133085d);
        this.f113889h.a(campaignsSaleLink, this, AuthSource.f92668C, new c(this, campaignsSaleArguments));
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f113891j.b(this.f113890i.Q().N(new a()).t0(new b()));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f113891j.e();
    }
}
