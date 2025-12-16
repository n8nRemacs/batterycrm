package com.avito.android.beduin.common.component.photo_picker.items.Photo;

import Y61.k;
import kotlin.Metadata;

/* compiled from: PhotoItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/photo_picker/items/Photo/f;", "LTV0/d;", "Lcom/avito/android/beduin/common/component/photo_picker/items/Photo/h;", "Lcom/avito/android/beduin/common/component/photo_picker/items/Photo/a;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f implements TV0.d<h, a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.beduin.common.component.photo_picker.k f101998b;

    public f(@k com.avito.android.beduin.common.component.photo_picker.k kVar) {
        this.f101998b = kVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        a aVar2 = (a) aVar;
        if (aVar2.f101987c) {
            hVar.a0(null);
        } else {
            hVar.a0(new c(this, aVar2));
        }
        hVar.rV(aVar2);
        hVar.K8(new d(this, aVar2));
        if (aVar2.f101986b.f101923e) {
            hVar.Vy(null);
        } else {
            hVar.Vy(new e(this, aVar2));
        }
    }
}
