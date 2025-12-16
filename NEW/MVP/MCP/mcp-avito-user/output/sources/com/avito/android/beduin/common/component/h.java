package com.avito.android.beduin.common.component;

import android.view.View;
import android.view.ViewGroup;
import com.avito.android.beduin_models.BeduinModel;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import java.util.List;
import kotlin.Metadata;

/* compiled from: BeduinViewComponent.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\u0005B\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/beduin/common/component/h;", "Lcom/avito/android/beduin_models/BeduinModel;", "T", "Landroid/view/View;", "V", "Lej/a;", "Lcom/avito/android/beduin/common/component/o;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class h<T extends BeduinModel, V extends View> extends AbstractC40112a<T, o<? extends V>> {
    @Override // ej.AbstractC40112a
    public final InterfaceC40116e i(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        return new o(p(viewGroup, layoutParams));
    }

    @Override // ej.AbstractC40112a
    public final void m(InterfaceC40116e interfaceC40116e) {
        String id2 = S().getId();
        V v12 = ((o) interfaceC40116e).f101785b;
        v12.setTag(id2);
        q(v12);
    }

    @Override // ej.AbstractC40112a
    public final void o(InterfaceC40116e interfaceC40116e, List list) {
        r(((o) interfaceC40116e).f101785b, list);
    }

    @Y61.k
    public abstract V p(@Y61.k ViewGroup viewGroup, @Y61.k ViewGroup.LayoutParams layoutParams);

    public abstract void q(@Y61.k V v12);

    public void r(@Y61.k V v12, @Y61.k List<? extends Object> list) {
        q(v12);
    }
}
