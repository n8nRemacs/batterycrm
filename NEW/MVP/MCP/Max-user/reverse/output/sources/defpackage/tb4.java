package defpackage;

import com.google.android.material.internal.CheckableImageButton;

/* loaded from: classes.dex */
public final class tb4 extends mf5 {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tb4(lf5 lf5Var, int i) {
        super(lf5Var);
        this.e = i;
    }

    @Override // defpackage.mf5
    public void r() {
        switch (this.e) {
            case 0:
                lf5 lf5Var = this.b;
                lf5Var.B0 = null;
                CheckableImageButton checkableImageButton = lf5Var.t0;
                checkableImageButton.setOnLongClickListener(null);
                hfi.o(checkableImageButton, null);
                break;
        }
    }
}
