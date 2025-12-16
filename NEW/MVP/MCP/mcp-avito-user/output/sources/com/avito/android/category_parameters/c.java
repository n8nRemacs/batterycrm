package com.avito.android.category_parameters;

import com.avito.android.remote.model.category_parameters.slot.images_enhancement.ImagesEnhancementSlot;
import com.avito.android.remote.model.category_parameters.slot.images_enhancement.ImagesEnhancementSlotConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CategoryParametersElementConverter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/remote/model/category_parameters/slot/images_enhancement/ImagesEnhancementSlotConfig;", "it", "Lcom/avito/android/remote/model/category_parameters/slot/images_enhancement/ImagesEnhancementSlot;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class c extends N implements Y41.l<ImagesEnhancementSlot, ImagesEnhancementSlotConfig> {

    /* renamed from: l, reason: collision with root package name */
    public static final c f117641l = new c();

    public c() {
        super(1);
    }

    @Override // Y41.l
    public final ImagesEnhancementSlotConfig invoke(ImagesEnhancementSlot imagesEnhancementSlot) {
        return (ImagesEnhancementSlotConfig) imagesEnhancementSlot.getWidget().getConfig();
    }
}
