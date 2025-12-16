package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class dxb extends y0f {
    public final int X;
    public final cxb o;

    public dxb(cxb cxbVar, ExecutorService executorService, int i) {
        super(executorService);
        this.o = cxbVar;
        this.X = i;
    }

    @Override // defpackage.y0f, defpackage.phd
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final void r(gxb gxbVar, int i) {
        fxb fxbVar = (fxb) ((t98) C(i));
        ir9 ir9Var = new ir9(2, this.o, cxb.class, "onItemClick", "onItemClick(Lone/me/chats/picker/PickerEntity;Z)V", 0, 5);
        ir9 ir9Var2 = new ir9(2, this.o, cxb.class, "onItemLongClick", "onItemLongClick(Lone/me/chats/picker/PickerEntity;Z)Z", 0, 6);
        gxbVar.z(fxbVar);
        View view = gxbVar.a;
        f8j.d(view, 300L, new kg6(ir9Var, 24, fxbVar));
        ((v0b) view).setOnLongClickListener(new d72(ir9Var2, 6, fxbVar));
    }

    @Override // defpackage.y0f, defpackage.phd
    public final int l(int i) {
        return hxb.a;
    }

    @Override // defpackage.phd
    public final mid t(ViewGroup viewGroup, int i) {
        v0b v0bVar = new v0b(viewGroup.getContext(), false);
        gxb gxbVar = new gxb(v0bVar);
        int i2 = this.X;
        if (i2 > 0) {
            v0bVar.setPaddingRelative(kti.d(i2 * vw4.d().getDisplayMetrics().density), v0bVar.getPaddingTop(), v0bVar.getPaddingEnd(), v0bVar.getPaddingBottom());
        }
        return gxbVar;
    }
}
