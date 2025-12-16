package GY0;

import JY0.b;
import com.avito.android.home.HomeActivity;
import com.google.android.gms.tasks.C37030m;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.appupdate.AbstractC37097d;
import com.google.android.play.core.appupdate.C37094a;
import com.google.android.play.core.appupdate.InterfaceC37095b;
import com.google.android.play.core.install.InstallException;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes6.dex */
public class a implements InterfaceC37095b {
    @Override // com.google.android.play.core.appupdate.InterfaceC37095b
    public final Task<C37094a> a() {
        throw null;
    }

    @Override // com.google.android.play.core.appupdate.InterfaceC37095b
    public final boolean b(C37094a c37094a, @b int i12, HomeActivity homeActivity) {
        AbstractC37097d abstractC37097dA = AbstractC37097d.c(i12).a();
        if (!(c37094a.a(abstractC37097dA) != null) && (!AbstractC37097d.c(abstractC37097dA.b()).a().equals(abstractC37097dA) || c37094a.a(AbstractC37097d.c(abstractC37097dA.b()).a()) == null)) {
            return false;
        }
        abstractC37097dA.b();
        return true;
    }

    @Override // com.google.android.play.core.appupdate.InterfaceC37095b
    public final Task<Void> c() {
        return C37030m.e(new InstallException(-8));
    }

    @Override // com.google.android.play.core.appupdate.InterfaceC37095b
    public final void d(com.google.android.play.core.install.a aVar) {
        throw null;
    }

    @Override // com.google.android.play.core.appupdate.InterfaceC37095b
    public final void e(com.google.android.play.core.install.a aVar) {
        throw null;
    }
}
