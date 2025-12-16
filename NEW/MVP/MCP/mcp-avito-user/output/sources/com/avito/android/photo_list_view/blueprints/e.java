package com.avito.android.photo_list_view.blueprints;

import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.image.enhancement.C30977h;
import com.avito.android.remote.model.category_parameters.slot.images_enhancement.ImagesEnhancementSlotConfig;
import kotlin.Metadata;

/* compiled from: MultiStatePhotoItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/image/enhancement/h;", "newState", "Lkotlin/G0;", "accept", "(Lcom/avito/android/image/enhancement/h;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class e<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f218130b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f218131c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ParameterElement.y f218132d;

    public e(k kVar, l lVar, ParameterElement.y yVar) {
        this.f218130b = kVar;
        this.f218131c = lVar;
        this.f218132d = yVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        String title;
        C30977h c30977h = (C30977h) obj;
        k kVar = this.f218130b;
        kVar.getClass();
        j jVar = new j(kVar);
        boolean z12 = c30977h.f169374b;
        l lVar = this.f218131c;
        lVar.vX(jVar, z12);
        ImagesEnhancementSlotConfig imagesEnhancementSlotConfig = this.f218132d.f117603h;
        ImagesEnhancementSlotConfig.MainToggle mainToggle = imagesEnhancementSlotConfig != null ? imagesEnhancementSlotConfig.getMainToggle() : null;
        if (mainToggle == null || (title = mainToggle.getTitle()) == null) {
            title = "";
        }
        lVar.kX(title, c30977h.f169373a);
    }
}
