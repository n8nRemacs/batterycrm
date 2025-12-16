package com.avito.android.lib.beduin_v2.component.input;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.akita.compose.component.input.InputState;
import com.avito.beduin.v2.avito.component.input.state.AvitoInputState;
import com.avito.beduin.v2.render.android_view.AbstractC36333c;
import com.avito.beduin.v2.render.android_view.M;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: InputComponent.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/input/c;", "Lcom/avito/beduin/v2/render/android_view/c;", "Lcom/avito/beduin/v2/avito/component/input/state/AvitoInputState;", "Lcom/avito/android/lib/beduin_v2/component/input/k;", "<init>", "()V", "_design-modules_beduin-v2_renderer_component_input"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.lib.beduin_v2.component.input.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C31104c extends AbstractC36333c<AvitoInputState, k> {
    public C31104c() {
        super(C31103b.f175671b);
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final void l(View view, com.avito.beduin.v2.theme.k kVar, AvitoInputState avitoInputState) {
        InputState inputState;
        k kVar2 = (k) view;
        AvitoInputState avitoInputState2 = avitoInputState;
        String str = avitoInputState2.f334472k;
        String str2 = avitoInputState2.f334463b;
        String str3 = avitoInputState2.f334473l;
        String[] strArr = {str, str2, str3};
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < 3; i12++) {
            String str4 = strArr[i12];
            if (str4 != null && str4.length() != 0) {
                arrayList.add(str4);
            }
        }
        String strO = C42745f0.O(arrayList, " ", null, null, null, 62);
        int iOrdinal = avitoInputState2.f334465d.ordinal();
        if (iOrdinal == 0) {
            inputState = InputState.f61668b;
        } else if (iOrdinal == 1) {
            inputState = InputState.f61669c;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            inputState = InputState.f61670d;
        }
        InputState inputState2 = inputState;
        String strA = C31105d.a(avitoInputState2.f334470i);
        String strA2 = C31105d.a(avitoInputState2.f334471j);
        Object tag = kVar2.getTag();
        String string = tag != null ? tag.toString() : null;
        if (string == null) {
            string = "";
        }
        String str5 = string;
        Y41.a<G0> aVar = avitoInputState2.f334482u;
        kVar2.setState$_design_modules_beduin_v2_renderer_component_input(new C(avitoInputState2.f334462a, strO, avitoInputState2.f334464c, inputState2, avitoInputState2.f334466e, avitoInputState2.f334467f, avitoInputState2.f334468g, avitoInputState2.f334469h, strA, strA2, avitoInputState2.f334472k, str3, str5, aVar != null));
        kVar2.setStyle$_design_modules_beduin_v2_renderer_component_input((F) com.avito.beduin.v2.render.android_view.D.a(avitoInputState2.f334478q, kVar));
        kVar2.setOnTextChanged$_design_modules_beduin_v2_renderer_component_input(avitoInputState2.f334476o);
        kVar2.setOnFocusChanged$_design_modules_beduin_v2_renderer_component_input(avitoInputState2.f334477p);
        kVar2.setOnIconStartClick$_design_modules_beduin_v2_renderer_component_input(avitoInputState2.f334474m);
        kVar2.setOnIconEndClick$_design_modules_beduin_v2_renderer_component_input(avitoInputState2.f334475n);
        kVar2.setOnDone$_design_modules_beduin_v2_renderer_component_input(aVar);
        M.a(kVar2, avitoInputState2.f334479r);
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final View n(ViewGroup viewGroup) {
        return new k(viewGroup.getContext());
    }
}
