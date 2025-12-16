package Wh;

import Ui.InterfaceC15523b;
import Y61.k;
import android.view.View;
import com.avito.android.beduin.common.component.h;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import ej.AbstractC40112a;
import ej.InterfaceC40113b;
import ej.InterfaceC40116e;
import kotlin.Metadata;

/* compiled from: BeduinContainer.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LWh/a;", "Lcom/avito/android/beduin_models/BeduinModel;", "T", "Landroid/view/View;", "V", "Lcom/avito/android/beduin/common/component/h;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Wh.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC15764a<T extends BeduinModel, V extends View> extends h<T, V> {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f18008e = true;

    @Override // ej.AbstractC40112a
    /* renamed from: k, reason: from getter */
    public boolean getF18008e() {
        return this.f18008e;
    }

    @k
    public final AbstractC40112a<BeduinModel, InterfaceC40116e> u(@k BeduinModel beduinModel) {
        return w().a(beduinModel, getF101369f(), v());
    }

    @k
    public abstract InterfaceC15523b<BeduinAction> v();

    @k
    public abstract InterfaceC40113b<BeduinModel, AbstractC40112a<BeduinModel, InterfaceC40116e>> w();

    @k
    /* renamed from: x */
    public abstract lj.e getF101369f();
}
