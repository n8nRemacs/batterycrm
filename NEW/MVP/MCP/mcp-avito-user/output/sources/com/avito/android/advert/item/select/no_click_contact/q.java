package com.avito.android.advert.item.select.no_click_contact;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import com.avito.android.advert.item.select.no_click_contact.AutoSelectNoClickContactItem;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AutoSelectNoClickContactScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class q extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AutoSelectNoClickContactItem.NoClickContactCard f79485l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AutoSelectNoClickContactItem.NoClickContactCard f79486m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f79487n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f79488o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f79489p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(AutoSelectNoClickContactItem.NoClickContactCard noClickContactCard, AutoSelectNoClickContactItem.NoClickContactCard noClickContactCard2, Y41.l lVar, androidx.compose.ui.v vVar, int i12) {
        super(2);
        this.f79485l = noClickContactCard;
        this.f79486m = noClickContactCard2;
        this.f79487n = lVar;
        this.f79488o = vVar;
        this.f79489p = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f79489p | 1);
        r.c(this.f79485l, this.f79486m, this.f79487n, a12, iA2);
        return G0.f406611a;
    }
}
