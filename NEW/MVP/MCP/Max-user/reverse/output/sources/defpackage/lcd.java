package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class lcd extends RecyclerView {
    public final b0i U1;
    public final GradientDrawable V1;

    public lcd(Context context, h23 h23Var) {
        super(context, null);
        b0i b0iVar = new b0i(h23Var, y4e.a.g().a(), 10);
        this.U1 = b0iVar;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setSize(kti.d(1 * vw4.d().getDisplayMetrics().density), kti.c(vw4.d().getDisplayMetrics().density * 0.5d));
        this.V1 = gradientDrawable;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setLayoutManager(new LinearLayoutManager(0, false));
        setAdapter(b0iVar);
        setItemAnimator(null);
        j(new y71(8));
        bz4 bz4Var = new bz4(context);
        bz4Var.c = gradientDrawable;
        j(bz4Var);
        tqi.c(new kga(3, (Continuation) null, 14), this);
    }

    public final void setContacts(List<icd> list) {
        this.U1.E(list);
    }
}
