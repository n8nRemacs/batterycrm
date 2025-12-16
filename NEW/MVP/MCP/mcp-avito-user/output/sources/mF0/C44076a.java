package mf0;

import JO.e;
import androidx.compose.runtime.internal.P;
import com.avito.android.category_parameters.k;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.image.ImageSlot;
import com.avito.android.remote.model.category_parameters.slot.image.ImageSlotConfig;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ImageSlotWrapper.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lmf0/a;", "Lcom/avito/android/category_parameters/k;", "Lcom/avito/android/remote/model/category_parameters/slot/image/ImageSlot;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: mf0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C44076a extends k<ImageSlot> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ImageSlot f414658b;

    public C44076a(@Y61.k ImageSlot imageSlot) {
        this.f414658b = imageSlot;
    }

    @Override // com.avito.android.category_parameters.j
    public final Slot g() {
        return this.f414658b;
    }

    @Override // com.avito.android.category_parameters.k
    @Y61.k
    public final List<com.avito.conveyor_item.a> j() {
        ImageSlot imageSlot = this.f414658b;
        return Collections.singletonList(new e(imageSlot.getId(), ((ImageSlotConfig) imageSlot.getWidget().getConfig()).getUniversalImage(), ((ImageSlotConfig) imageSlot.getWidget().getConfig()).getContentInsets()));
    }
}
