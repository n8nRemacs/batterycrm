package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.Executor;
import one.me.chats.list.folderwidget.section.FolderWidgetLayoutManager;

/* loaded from: classes2.dex */
public final class sb6 extends RecyclerView {
    public final fb6 U1;

    public sb6(Context context, Executor executor) {
        super(context, null);
        fb6 fb6Var = new fb6(executor);
        this.U1 = fb6Var;
        aid rb6Var = new rb6();
        setLayoutManager(new FolderWidgetLayoutManager(context));
        setItemAnimator(null);
        l(rb6Var);
        setAdapter(fb6Var);
        j(new m01(kti.d(8 * vw4.d().getDisplayMetrics().density), kti.d(6 * vw4.d().getDisplayMetrics().density), 4));
    }

    public final void setListener(qb6 qb6Var) {
        this.U1.X = qb6Var;
    }
}
