package defpackage;

/* loaded from: classes2.dex */
public final class ci9 {
    public final k18 a;
    public final k18 b;
    public volatile boolean c;
    public volatile boolean d;

    public ci9(k18 k18Var, k18 k18Var2) {
        this.a = k18Var;
        this.b = k18Var2;
    }

    public final void a(long j, int i, f7f f7fVar, int i2) {
        String str;
        dd ddVar = (dd) this.a.getValue();
        imb imbVar = new imb("message_id", Long.valueOf(j));
        int i3 = 1;
        if (i != 1) {
            i3 = 2;
            if (i != 2) {
                i3 = 3;
                if (i != 3) {
                    i3 = 4;
                    if (i != 4) {
                        i3 = 5;
                        if (i != 5) {
                            throw null;
                        }
                    }
                }
            }
        }
        us usVarA = ori.a(imbVar, new imb("element_type", Integer.valueOf(i3)), new imb("source_id", Long.valueOf(f7fVar.a)), new imb("source_type", Integer.valueOf(f7fVar.b)));
        xp7 xp7Var = new xp7();
        xp7Var.a = System.currentTimeMillis();
        xp7Var.c = "MESSAGE_CLICKABLE_ELEMENT_ACTIONS";
        switch (i2) {
            case 1:
                str = "clicked_clickable_element";
                break;
            case 2:
                str = "clicked_copy";
                break;
            case 3:
                str = "clicked_open_link";
                break;
            case 4:
                str = "clicked_open_mail";
                break;
            case 5:
                str = "clicked_call";
                break;
            case 6:
                str = "shown_update_app";
                break;
            case 7:
                str = "clicked_update_app";
                break;
            default:
                throw null;
        }
        xp7Var.d = str;
        k18 k18Var = this.b;
        xp7Var.b = ((w4e) ((pb3) k18Var.getValue())).s();
        xp7Var.c(usVarA);
        xp7Var.o = ((pe8) ((pb3) k18Var.getValue())).K();
        ddVar.h(xp7Var.d());
    }
}
