package com.avito.android.beduin.common.component.input;

import Ui.InterfaceC15523b;
import android.graphics.drawable.Drawable;
import com.avito.android.R;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.util.q;
import com.avito.android.util.C35835l0;
import com.avito.android.util.O2;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: InputViewContainers.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_beduin_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h {
    public static final void a(@Y61.k g gVar, @Y61.k BeduinInputModel beduinInputModel) {
        String errorMessage = beduinInputModel.getErrorMessage();
        Input input = gVar.f101549c;
        ComponentContainer componentContainer = gVar.f101548b;
        if (errorMessage == null || !L.f(beduinInputModel.getShowErrorMessage(), Boolean.TRUE)) {
            componentContainer.q(beduinInputModel.getDetails());
            Input.f179303W.getClass();
            input.setState(Input.f179304a0);
        } else {
            ComponentContainer.n(componentContainer, beduinInputModel.getErrorMessage(), 2);
            Input.f179303W.getClass();
            input.setState(Input.f179305b0);
        }
    }

    public static final void b(@Y61.k g gVar, @Y61.k BeduinInputModel beduinInputModel, @Y61.k InterfaceC15523b<BeduinAction> interfaceC15523b) {
        Integer numA;
        InputIcon rightIcon = beduinInputModel.getRightIcon();
        if (!L.f(beduinInputModel.getShowRightIcon(), Boolean.TRUE) || rightIcon == null) {
            gVar.f101549c.setRightIcon((Drawable) null);
            gVar.f101549c.setRightIconListener(null);
            return;
        }
        Integer numA2 = q.a(rightIcon.getIconName());
        Input input = gVar.f101549c;
        Drawable drawableH = numA2 != null ? C35835l0.h(numA2.intValue(), input.getContext()) : null;
        Input input2 = gVar.f101549c;
        if (drawableH == null) {
            input2.setRightIcon((Drawable) null);
            return;
        }
        input2.setRightIcon(drawableH);
        String iconColor = rightIcon.getIconColor();
        input.setRightIconColor(C35835l0.d((iconColor == null || (numA = com.avito.android.lib.util.e.a(iconColor)) == null) ? R.attr.gray28 : numA.intValue(), input.getContext()));
        if (O2.a(rightIcon.getOnClickedActions())) {
            input2.setRightIconListener(new com.avito.android.advertising.adapter.items.buzzoola.media_x2.d(22, interfaceC15523b, rightIcon));
        } else {
            input2.setRightIconListener(null);
        }
    }
}
