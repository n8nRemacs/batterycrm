package defpackage;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes2.dex */
public final class u8g extends mid implements u1g {
    public final AppCompatTextView E0;

    public u8g(View view) {
        q1g q1gVarD;
        super(view);
        this.E0 = (AppCompatTextView) view;
        if (view.isInEditMode()) {
            q1gVarD = bq4.e0;
        } else {
            Context context = view.getContext();
            bwf bwfVar = q1g.a0;
            q1gVarD = nca.d(context);
        }
        k(q1gVarD);
    }

    @Override // defpackage.u1g
    public final void k(q1g q1gVar) {
        this.E0.setTextColor(q1gVar.F);
    }
}
