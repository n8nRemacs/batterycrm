package com.avito.android.loyalty.links.badges;

import Fc1.E0;
import Y61.k;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.rx3.g1;
import com.huawei.hms.framework.common.ContainerUtils;
import ev.AbstractC40161a;
import io.reactivex.rxjava3.internal.operators.single.C42017o;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.text.C43066x;

/* compiled from: BadgeBarShowLinkAsyncHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/loyalty/links/badges/e;", "Lev/a;", "Lcom/avito/android/loyalty/links/badges/BadgeBarShowLink;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e extends AbstractC40161a<BadgeBarShowLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.g f183219f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.i f183220g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.d f183221h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f183222i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final com.avito.android.loyalty.ui.badge_details.g f183223j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final com.avito.android.loyalty.ui.badge_details.e f183224k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f183225l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f183226m = new io.reactivex.rxjava3.disposables.c();

    @Inject
    public e(@k a.g gVar, @k a.i iVar, @k a.d dVar, @k InterfaceC35745a5 interfaceC35745a5, @k com.avito.android.loyalty.ui.badge_details.g gVar2, @k com.avito.android.loyalty.ui.badge_details.e eVar, @k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f183219f = gVar;
        this.f183220g = iVar;
        this.f183221h = dVar;
        this.f183222i = interfaceC35745a5;
        this.f183223j = gVar2;
        this.f183224k = eVar;
        this.f183225l = aVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        com.avito.android.loyalty.ui.badge_details.g gVar = this.f183223j;
        gVar.getClass();
        List listF0 = C43066x.f0(((BadgeBarShowLink) deepLink).f183213b, new String[]{ContainerUtils.FIELD_DELIMITER}, 0, 6);
        int iF2 = P0.f(C42745f0.q(listF0, 10));
        if (iF2 < 16) {
            iF2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
        Iterator it = listF0.iterator();
        while (it.hasNext()) {
            List listF02 = C43066x.f0((String) it.next(), new String[]{ContainerUtils.KEY_VALUE_DELIMITER}, 0, 6);
            linkedHashMap.put((String) listF02.get(0), (String) listF02.get(1));
        }
        this.f183226m.b(new C42017o(g1.a(gVar.f183261a.c(linkedHashMap)).z(gVar.f183262b.a()).s(this.f183222i.e()).j(new a(this)), new E0(this, 29)).x(new c(this), new d(this)));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f183226m.e();
    }
}
