package defpackage;

import android.view.View;
import java.util.function.ObjLongConsumer;
import one.me.chats.list.ChatsListWidget;

/* loaded from: classes2.dex */
public final /* synthetic */ class x03 implements ObjLongConsumer {
    public final /* synthetic */ usd a;

    public /* synthetic */ x03(usd usdVar) {
        this.a = usdVar;
    }

    @Override // java.util.function.ObjLongConsumer
    public final void accept(Object obj, long j) {
        View view = (View) obj;
        ChatsListWidget chatsListWidget = (ChatsListWidget) this.a.b;
        t9f t9fVar = chatsListWidget.G0;
        yy7[] yy7VarArr = ChatsListWidget.L0;
        hs hsVar = chatsListWidget.c;
        yy7[] yy7VarArr2 = ChatsListWidget.L0;
        yy7 yy7Var = yy7VarArr2[0];
        if (((Long) hsVar.a(chatsListWidget)) == null) {
            qt7 qt7Var = (qt7) t9fVar.D(chatsListWidget, yy7VarArr2[4]);
            if (qt7Var == null || !qt7Var.isActive()) {
                t9fVar.O(chatsListWidget, yy7VarArr2[4], svi.e(chatsListWidget.getViewLifecycleScope(), null, i84.b, new x53(chatsListWidget, j, view, null), 1));
            }
        }
    }
}
