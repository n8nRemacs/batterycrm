package com.avito.android.remote.model.category_parameters.slot.images_groups;

import X41.f;
import Y61.k;
import Y61.l;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.StringMapParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.SlotValue;
import com.avito.android.remote.model.category_parameters.slot.SlotWidget;
import com.avito.android.remote.model.category_parameters.slot.SlotWithValue;
import com.avito.android.util.H3;
import com.avito.android.util.I3;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ImagesGroupsSlot.kt */
@s0
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0015\u0016B/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0011\u001a\u00020\u00102\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/images_groups/ImagesGroupsSlot;", "Lcom/avito/android/remote/model/category_parameters/slot/SlotWithValue;", "Lcom/avito/android/remote/model/category_parameters/slot/images_groups/ImagesGroupsSlotConfig;", "Lcom/avito/android/remote/model/category_parameters/slot/images_groups/ImagesGroupsSlotValue;", "", "id", "label", "Lcom/avito/android/remote/model/category_parameters/slot/SlotWidget;", "widget", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/slot/SlotWidget;Lcom/avito/android/remote/model/category_parameters/slot/images_groups/ImagesGroupsSlotValue;)V", "", "Lcom/avito/android/remote/model/category_parameters/base/ParameterSlot;", "initParameters", "()Ljava/util/List;", "Lkotlin/G0;", "initWidget", "(Lcom/avito/android/remote/model/category_parameters/slot/SlotWidget;Lcom/avito/android/remote/model/category_parameters/slot/images_groups/ImagesGroupsSlotValue;)V", "onParametersUpdated", "()V", "Companion", "ParameterProvider", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ImagesGroupsSlot extends SlotWithValue<ImagesGroupsSlotConfig, ImagesGroupsSlotValue> {

    @f
    @k
    public static final Parcelable.Creator<ImagesGroupsSlot> CREATOR;

    /* renamed from: ID, reason: collision with root package name */
    @k
    public static final String f253817ID = "imagesGroups";

    /* compiled from: ImagesGroupsSlot.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/images_groups/ImagesGroupsSlot$ParameterProvider;", "", "getImagesGroupsParameter", "Lcom/avito/android/remote/model/category_parameters/StringMapParameter;", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface ParameterProvider {
        @l
        StringMapParameter getImagesGroupsParameter();
    }

    static {
        ImagesGroupsSlot$Companion$CREATOR$1 imagesGroupsSlot$Companion$CREATOR$1 = ImagesGroupsSlot$Companion$CREATOR$1.INSTANCE;
        int i12 = I3.f318630a;
        CREATOR = new H3(imagesGroupsSlot$Companion$CREATOR$1);
    }

    public ImagesGroupsSlot(@k String str, @k String str2, @k SlotWidget<ImagesGroupsSlotConfig> slotWidget, @l ImagesGroupsSlotValue imagesGroupsSlotValue) {
        super(str, str2, slotWidget, imagesGroupsSlotValue);
    }

    @Override // com.avito.android.remote.model.category_parameters.slot.ParametersInitializer
    @k
    public List<ParameterSlot> initParameters() {
        return Collections.singletonList(new StringMapParameter(f253817ID, "", null, null, null, null, 48, null));
    }

    @Override // com.avito.android.remote.model.category_parameters.slot.SlotWithValue
    public /* bridge */ /* synthetic */ void initWidget(SlotWidget slotWidget, SlotValue slotValue) {
        initWidget((SlotWidget<ImagesGroupsSlotConfig>) slotWidget, (ImagesGroupsSlotValue) slotValue);
    }

    public void initWidget(@k SlotWidget<ImagesGroupsSlotConfig> widget, @l ImagesGroupsSlotValue value) {
        Object next;
        Iterator<T> it = getParameters().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (L.f(((ParameterSlot) next).getId(), f253817ID)) {
                    break;
                }
            }
        }
        StringMapParameter stringMapParameter = next instanceof StringMapParameter ? (StringMapParameter) next : null;
        if (stringMapParameter == null) {
            return;
        }
        stringMapParameter.set_value2(value != null ? value.getImagesGroups() : null);
    }

    @Override // com.avito.android.remote.model.category_parameters.slot.ParametersInitializer
    public void onParametersUpdated() {
    }
}
