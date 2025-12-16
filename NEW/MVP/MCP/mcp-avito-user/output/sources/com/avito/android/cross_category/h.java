package com.avito.android.cross_category;

import com.avito.android.R;
import com.avito.android.advert.item.consultation.C;
import com.avito.android.remote.model.Image;
import com.avito.android.serp.adapter.p1;
import com.avito.android.util.L0;
import io.reactivex.rxjava3.internal.observers.y;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CrossCategoryWidgetItemPresenterImpl.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cross_category/h;", "Lcom/avito/android/cross_category/e;", "_avito_bx-content_widget_cross-category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h implements e {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final q f131062b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final h31.e<vs0.d> f131063c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final p1 f131064d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.analytics.widgets_tracker.g f131065e;

    public h(@Y61.k q qVar, @Y61.k h31.e eVar, @Y61.k p1 p1Var, @Y61.k com.avito.android.serp.analytics.widgets_tracker.g gVar) {
        this.f131062b = qVar;
        this.f131063c = eVar;
        this.f131064d = p1Var;
        this.f131065e = gVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        m mVar = (m) eVar;
        CrossCategoryWidgetItem crossCategoryWidgetItem = (CrossCategoryWidgetItem) aVar;
        Image f131047f = crossCategoryWidgetItem.getF131047f();
        String f131044c = crossCategoryWidgetItem.getF131044c();
        q qVar = this.f131062b;
        L0 l02 = qVar.f131080a;
        if (f131044c != null) {
            mVar.SH(l02.f() <= 320 ? Integer.valueOf(R.style.Legacy_Text_H4) : null, f131044c);
        }
        String f131045d = crossCategoryWidgetItem.getF131045d();
        if (f131045d != null) {
            mVar.setQuery(f131045d);
        }
        if (f131047f != null) {
            mVar.l(f131047f);
        }
        int iKh = mVar.kh();
        int iQw = mVar.qw();
        j jVar = qVar.f131081b;
        int i13 = jVar.f131066a * 2;
        int i14 = jVar.f131068c;
        int i15 = ((i14 - 1) * jVar.f131067b * 2) + i13;
        int i16 = iKh + iQw;
        int iC2 = l02.c();
        mVar.aO(i14 <= 3 ? ((iC2 - i15) - i16) / i14 : ((iC2 - i15) - i16) / jVar.f131069d);
        mVar.nN(new C(this, crossCategoryWidgetItem, i12, 3));
        mVar.d(new f((y) mVar.V1().t0(new g(this, crossCategoryWidgetItem, i12))));
    }

    @Override // XQ.a
    @Y61.l
    public final XQ.b d0() {
        return null;
    }
}
