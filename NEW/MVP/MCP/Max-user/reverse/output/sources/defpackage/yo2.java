package defpackage;

import one.me.chatmedia.viewer.ChatMediaViewerScreen;

/* loaded from: classes.dex */
public final class yo2 implements cm6 {
    public final /* synthetic */ ChatMediaViewerScreen a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ip2 c;

    public yo2(ChatMediaViewerScreen chatMediaViewerScreen, int i, ip2 ip2Var) {
        this.a = chatMediaViewerScreen;
        this.b = i;
        this.c = ip2Var;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        if (this.a.getViewLifecycleOwner().p().d.a(l38.d)) {
            String name = ChatMediaViewerScreen.class.getName();
            ChatMediaViewerScreen chatMediaViewerScreen = this.a;
            ip2 ip2Var = this.c;
            int i = this.b;
            l6b l6bVar = wqi.a;
            if (l6bVar != null) {
                lg8 lg8Var = lg8.d;
                if (l6bVar.b(lg8Var)) {
                    l38 l38Var = chatMediaViewerScreen.getViewLifecycleOwner().p().d;
                    int i2 = ip2Var.b;
                    int iJ = chatMediaViewerScreen.G0.j();
                    int size = ip2Var.a.size();
                    StringBuilder sb = new StringBuilder("Media viewer. Pager, after submitList lifecycle=");
                    sb.append(l38Var);
                    sb.append(" initPos:");
                    sb.append(i2);
                    sb.append(", prevItemsA:");
                    hf3.g(sb, i, ", itemsA:", iJ, ", items:");
                    sb.append(size);
                    l6bVar.c(lg8Var, name, sb.toString(), null);
                }
            }
            if (this.b == 0 && !this.c.a.isEmpty() && this.c.b >= 0) {
                svi.e(this.a.getViewLifecycleScope(), null, null, new xo2(this.a, this.c, null), 3);
            }
        }
        return qqg.a;
    }
}
