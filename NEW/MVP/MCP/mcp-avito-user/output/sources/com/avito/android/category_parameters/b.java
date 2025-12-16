package com.avito.android.category_parameters;

import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.images_enhancement.ImagesEnhancementSlot;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CategoryParametersElementConverter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/category_parameters/j;", "it", "Lcom/avito/android/remote/model/category_parameters/slot/images_enhancement/ImagesEnhancementSlot;", "invoke", "(Lcom/avito/android/category_parameters/j;)Lcom/avito/android/remote/model/category_parameters/slot/images_enhancement/ImagesEnhancementSlot;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class b extends N implements Y41.l<j<?>, ImagesEnhancementSlot> {

    /* renamed from: l, reason: collision with root package name */
    public static final b f117640l = new b();

    public b() {
        super(1);
    }

    @Override // Y41.l
    public final ImagesEnhancementSlot invoke(j<?> jVar) {
        Slot slotG = jVar.g();
        if (slotG instanceof ImagesEnhancementSlot) {
            return (ImagesEnhancementSlot) slotG;
        }
        return null;
    }
}
