package com.avito.android.publish.slots.generate_text_buttons;

import com.avito.android.category_parameters.f;
import com.avito.android.publish.slots.generate_text_buttons.item.GenerateTextButtonsItem;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.slot.SlotType;
import java.util.UUID;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: GenerateTextButtonsSlotWrapper.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/base/EditableParameter;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/remote/model/category_parameters/base/EditableParameter;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class d extends N implements Y41.l<EditableParameter<?>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f243968l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar) {
        super(1);
        this.f243968l = cVar;
    }

    @Override // Y41.l
    public final G0 invoke(EditableParameter<?> editableParameter) {
        Object value = editableParameter.getValue();
        String string = value != null ? value.toString() : null;
        if (string == null || string.length() == 0) {
            c cVar = this.f243968l;
            cVar.getClass();
            cVar.f243954k = UUID.randomUUID().toString();
            cVar.f243957n.clear();
            cVar.f243955l = GenerateTextButtonsItem.State.f243983b;
            cVar.f243952i.accept(new f.b(SlotType.GENERATE_TEXT_BUTTONS, null));
        }
        return G0.f406611a;
    }
}
