package com.avito.android.extended_profile_universal_widget_edit.create.adapter.section;

import Y41.l;
import Y61.k;
import hB.InterfaceC40798a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: UniversalWidgetCreateSectionItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_universal_widget_edit/create/adapter/section/e;", "Lcom/avito/android/extended_profile_universal_widget_edit/create/adapter/section/c;", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC40798a, G0> f153689b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k l<? super InterfaceC40798a, G0> lVar) {
        this.f153689b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        UniversalWidgetCreateSectionItem universalWidgetCreateSectionItem = (UniversalWidgetCreateSectionItem) aVar;
        ((g) eVar).AY(universalWidgetCreateSectionItem, new d(this, universalWidgetCreateSectionItem));
    }
}
