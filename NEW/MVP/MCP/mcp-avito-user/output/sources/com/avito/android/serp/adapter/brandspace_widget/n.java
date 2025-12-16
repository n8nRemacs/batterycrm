package com.avito.android.serp.adapter.brandspace_widget;

import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.android.serp.adapter.brandspace_widget.BrandspaceWidgetItem;
import com.avito.android.serp.adapter.witcher.M;
import com.avito.android.util.Kundle;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kr0.InterfaceC43491a;
import rn0.InterfaceC47690b;

/* compiled from: BrandspaceWidgetItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/brandspace_widget/n;", "Lcom/avito/android/serp/adapter/brandspace_widget/i;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class n implements i {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final M f269061b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC47690b> f269062c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.analytics.widgets_tracker.g f269063d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Kundle f269064e;

    @Inject
    public n(@InterfaceC43491a @Y61.l Kundle kundle, @Y61.k M m12, @Y61.k h31.e<InterfaceC47690b> eVar, @Y61.k com.avito.android.serp.analytics.widgets_tracker.g gVar) {
        this.f269061b = m12;
        this.f269062c = eVar;
        this.f269063d = gVar;
        this.f269064e = kundle == null ? new Kundle() : kundle;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        q qVar = (q) eVar;
        BrandspaceWidgetItem brandspaceWidgetItem = (BrandspaceWidgetItem) aVar;
        qVar.L4();
        qVar.b(brandspaceWidgetItem.f269021d);
        qVar.j(brandspaceWidgetItem.f269022e);
        qVar.rB(brandspaceWidgetItem.f269023f);
        BrandspaceWidgetItem.Action action = brandspaceWidgetItem.f269025h;
        qVar.V0(action != null ? action.f269033b : null);
        BrandspaceWidgetItem.Action action2 = brandspaceWidgetItem.f269026i;
        qVar.gd(action2 != null ? action2.f269033b : null);
        qVar.ko(brandspaceWidgetItem.f269027j);
        M m12 = this.f269061b;
        boolean f273791i = m12.getF273791i();
        List<PersistableSerpItem> list = brandspaceWidgetItem.f269024g;
        qVar.T20(f273791i ? new UV0.c(C42745f0.E0(list, m12.getF273784b())) : new UV0.c(list), brandspaceWidgetItem.hashCode());
        qVar.W4(this.f269064e.d(AK.c.g(brandspaceWidgetItem.hashCode(), "BRANDSPACE_SAVED_STATE_KEY ")));
        qVar.A1().u0(new j(this, i12, brandspaceWidgetItem), k.f269056b);
        qVar.LC().u0(new l(this, i12, brandspaceWidgetItem), m.f269060b);
    }

    @Override // com.avito.android.serp.adapter.brandspace_widget.i
    public final void T4(@Y61.l Parcelable parcelable, int i12) {
        this.f269064e.j(parcelable, "BRANDSPACE_SAVED_STATE_KEY " + i12);
    }

    @Override // com.avito.android.serp.adapter.brandspace_widget.i
    @Y61.k
    /* renamed from: d0, reason: from getter */
    public final Kundle getF269064e() {
        return this.f269064e;
    }
}
