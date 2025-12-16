package ej;

import Y61.k;
import Y61.l;
import android.view.ViewGroup;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.util.y6;
import ej.InterfaceC40116e;
import java.util.List;
import kotlin.Metadata;

/* compiled from: BeduinComponent.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lej/a;", "Lcom/avito/android/beduin_models/BeduinModel;", "T", "Lej/e;", "ViewContainer", "", "<init>", "()V", "_avito_beduin-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ej.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC40112a<T extends BeduinModel, ViewContainer extends InterfaceC40116e> {

    /* renamed from: b, reason: collision with root package name */
    public int f395324b = y6.b(16);

    /* renamed from: c, reason: collision with root package name */
    public int f395325c = y6.b(16);

    /* renamed from: d, reason: collision with root package name */
    public boolean f395326d;

    @k
    public abstract T S();

    @k
    public abstract ViewContainer i(@k ViewGroup viewGroup, @k ViewGroup.LayoutParams layoutParams);

    /* renamed from: k */
    public boolean getF102659h() {
        return this instanceof com.avito.android.beduin.common.component.chips.a;
    }

    @l
    public Object l(@k T t12) {
        return null;
    }

    public abstract void m(@k ViewContainer viewcontainer);

    public final void n(@k ViewContainer viewcontainer, @k List<? extends Object> list) {
        viewcontainer.getRoot().setTag(S().getId());
        if (list.isEmpty()) {
            m(viewcontainer);
        } else {
            o(viewcontainer, list);
        }
    }

    public void o(@k ViewContainer viewcontainer, @k List<? extends Object> list) {
        m(viewcontainer);
    }
}
