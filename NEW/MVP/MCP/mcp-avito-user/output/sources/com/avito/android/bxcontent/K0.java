package com.avito.android.bxcontent;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import android.os.Bundle;
import com.avito.android.beduin.v2.page.m;
import com.avito.android.deep_linking.links.BeduinUniversalPageLink;
import com.avito.android.deep_linking.links.CreateChannelWithAvitoLink;
import com.avito.android.ux.feedback.link.UxFeedbackStartCampaignLink;
import io.reactivex.rxjava3.core.AbstractC41768a;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kv.C43501a;

/* compiled from: BxContentPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "result", "Lkotlin/G0;", "invoke", "(Lkv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class K0 extends kotlin.jvm.internal.N implements Y41.l<C43501a, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C29253t0 f109355l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K0(C29253t0 c29253t0) {
        super(1);
        this.f109355l = c29253t0;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(C43501a c43501a) {
        Bundle bundle;
        String string;
        C29253t0 c29253t0 = this.f109355l;
        c29253t0.getClass();
        InterfaceC14249c interfaceC14249c = c43501a.f413261b;
        if (interfaceC14249c instanceof CreateChannelWithAvitoLink.c.e ? true : kotlin.jvm.internal.L.f(interfaceC14249c, AbstractC14250d.c.f9171c) ? true : kotlin.jvm.internal.L.f(interfaceC14249c, AbstractC14250d.b.f9170c) ? true : interfaceC14249c instanceof BeduinUniversalPageLink.b ? true : interfaceC14249c instanceof com.avito.android.beduin.v2.page.m) {
            c29253t0.s();
            if ((interfaceC14249c instanceof m.c) && (bundle = ((m.c) interfaceC14249c).f105170b) != null && (string = bundle.getString("uxFeedbackCampaign")) != null) {
                c29253t0.f112949T.b(AbstractC41768a.y(1000L, TimeUnit.MILLISECONDS, c29253t0.f112963i.e()).v(new GL.a(7, c29253t0, new UxFeedbackStartCampaignLink(string, true, kotlin.collections.P0.c(), null)), io.reactivex.rxjava3.internal.functions.a.f401996f));
            }
        } else if (!(interfaceC14249c instanceof InterfaceC14249c.a)) {
            boolean z12 = interfaceC14249c instanceof InterfaceC14249c.b;
        }
        return kotlin.G0.f406611a;
    }
}
