package com.avito.android.serp.adapter.auto_model_widget;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.auto_model.AutoModelButton;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import rn0.InterfaceC47690b;

/* compiled from: AutoModelWidgetPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/auto_model_widget/j;", "LTV0/d;", "Lcom/avito/android/serp/adapter/auto_model_widget/l;", "Lcom/avito/android/serp/adapter/auto_model_widget/AutoModelWidgetItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j implements TV0.d<l, AutoModelWidgetItem> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC47690b> f268972b;

    @Inject
    public j(@Y61.k h31.e<InterfaceC47690b> eVar) {
        this.f268972b = eVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        l lVar = (l) eVar;
        AutoModelWidgetItem autoModelWidgetItem = (AutoModelWidgetItem) aVar;
        List<Image> list = autoModelWidgetItem.f268952e;
        if (list.isEmpty()) {
            lVar.l(null);
        } else {
            lVar.l((Image) C42745f0.E(list));
        }
        lVar.setTitle(autoModelWidgetItem.f268953f);
        lVar.N2(autoModelWidgetItem.f268954g);
        lVar.AD(autoModelWidgetItem.f268956i, new f(autoModelWidgetItem, this));
        lVar.M50(autoModelWidgetItem.f268955h);
        List<AutoModelButton> list2 = autoModelWidgetItem.f268958k;
        if (list2.size() == 2) {
            lVar.ej(list2, new g(autoModelWidgetItem, this), new h(autoModelWidgetItem, this));
        } else {
            lVar.ej(null, null, null);
        }
        lVar.a(new i(autoModelWidgetItem, this));
    }
}
