package com.avito.android.beduin.common.component.cart_item;

import Ui.InterfaceC15523b;
import com.avito.android.beduin.common.component.cart_item.BeduinCartItemModel;
import com.avito.android.beduin.common.component.cart_item.a;
import com.avito.android.beduin.common.component.checkbox.CheckboxState;
import com.avito.android.beduin.common.form.transforms.CheckboxStateTransform;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.lib.design.toggle.State;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.N;

/* compiled from: BeduinCartItemComponent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/lib/design/toggle/State;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/toggle/State;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class b extends N implements Y41.l<State, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f100899l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar) {
        super(1);
        this.f100899l = aVar;
    }

    @Override // Y41.l
    public final G0 invoke(State state) {
        CheckboxState checkboxState;
        a aVar = this.f100899l;
        InterfaceC15523b<BeduinAction> interfaceC15523b = aVar.f100886g;
        BeduinCartItemModel beduinCartItemModel = aVar.f100885f;
        com.avito.android.beduin_shared.model.utils.a.a(interfaceC15523b, beduinCartItemModel.getOnCheckboxTapActions());
        BeduinCartItemModel.State state2 = a.c.f100892a[state.ordinal()] == 1 ? BeduinCartItemModel.State.CHECKED : BeduinCartItemModel.State.UNCHECKED;
        String f100853b = beduinCartItemModel.getF100853b();
        int i12 = a.c.f100893b[state2.ordinal()];
        if (i12 == 1) {
            checkboxState = CheckboxState.CHECKED;
        } else {
            if (i12 != 2 && i12 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            checkboxState = CheckboxState.UNCHECKED;
        }
        com.avito.android.beduin_shared.model.utils.j.a(aVar.f100888i, f100853b, new CheckboxStateTransform(checkboxState));
        return G0.f406611a;
    }
}
