package com.avito.android.advert.item.domoteka.conveyor;

import com.avito.android.remote.DomotekaReportLink;
import com.avito.android.remote.DomotekaTeaser;
import com.avito.android.remote.DomotekaTeaserResponse;
import com.avito.android.remote.model.teaser.TeaserInsight;
import com.avito.android.util.P2;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsDomotekaTeaserPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/remote/DomotekaTeaserResponse;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class f<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f75253b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f75254c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AdvertDetailsDomotekaTeaserItem f75255d;

    public f(l lVar, j jVar, AdvertDetailsDomotekaTeaserItem advertDetailsDomotekaTeaserItem) {
        this.f75253b = lVar;
        this.f75254c = jVar;
        this.f75255d = advertDetailsDomotekaTeaserItem;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        P2 p22 = (P2) obj;
        if (p22 instanceof P2.c) {
            return;
        }
        if (!(p22 instanceof P2.b)) {
            boolean z12 = p22 instanceof P2.a;
            return;
        }
        DomotekaTeaser result = ((DomotekaTeaserResponse) ((P2.b) p22).f318720a).getResult();
        if (result == null) {
            return;
        }
        String title = result.getTitle();
        String subtitle = result.getSubtitle();
        DomotekaReportLink reportLink = result.getReportLink();
        List<TeaserInsight> listC = result.c();
        if (listC == null) {
            listC = C42784z0.f406748b;
        }
        l lVar = this.f75253b;
        if (title != null) {
            lVar.R1(title);
        }
        if (subtitle != null) {
            lVar.DW(subtitle);
        }
        lVar.sn(listC);
        if (reportLink == null) {
            lVar.Tm();
        } else {
            lVar.R70(reportLink.getTitle(), null);
        }
        lVar.jL();
        lVar.oJ(new e(this.f75254c, this.f75255d));
    }
}
