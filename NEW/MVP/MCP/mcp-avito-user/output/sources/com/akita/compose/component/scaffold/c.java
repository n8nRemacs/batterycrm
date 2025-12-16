package com.akita.compose.component.scaffold;

import androidx.compose.runtime.C22082i3;
import com.akita.compose.component.toast_bar.InterfaceC27357f;
import com.akita.compose.component.toast_bar.ToastBarPosition;
import com.akita.compose.component.toast_bar.u;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Scaffold.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/akita/compose/component/toast_bar/ToastBarPosition;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class c extends N implements Y41.a<ToastBarPosition> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ u f62488l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(u uVar) {
        super(0);
        this.f62488l = uVar;
    }

    @Override // Y41.a
    public final ToastBarPosition invoke() {
        InterfaceC27357f interfaceC27357f = (InterfaceC27357f) ((C22082i3) this.f62488l.f63285b).getF42167b();
        if (interfaceC27357f != null) {
            return interfaceC27357f.getF63291f();
        }
        return null;
    }
}
