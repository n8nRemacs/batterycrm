package Ba1;

import androidx.view.C23038g0;
import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23040h0;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes9.dex */
public final class G extends C23038g0 {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f1495a = new AtomicBoolean(false);

    public final void a(InterfaceC22983P interfaceC22983P, L91.e eVar) {
        super.setValue(null);
        observe(interfaceC22983P, eVar);
    }

    @Override // androidx.view.AbstractC22991Y
    public final void observe(InterfaceC22983P interfaceC22983P, InterfaceC23040h0 interfaceC23040h0) {
        super.observe(interfaceC22983P, new F(0, this, interfaceC23040h0));
    }

    @Override // androidx.view.C23038g0, androidx.view.AbstractC22991Y
    public final void setValue(Object obj) {
        this.f1495a.set(true);
        super.setValue(obj);
    }
}
