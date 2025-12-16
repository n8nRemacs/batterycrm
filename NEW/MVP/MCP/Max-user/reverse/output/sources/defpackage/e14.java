package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class e14 extends mid {
    public final b14 E0;
    public final ii0 F0;

    public e14(Context context, b14 b14Var) {
        ii0 ii0Var = (ii0) bi0.a.getAccessor().c(155);
        x3b x3bVar = new x3b(context);
        super(x3bVar);
        this.E0 = b14Var;
        this.F0 = ii0Var;
        x3bVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        x3bVar.setIcon(yud.Y);
        x3bVar.setTitle(new n5g(x2d.banner_big_permit_phone_book_contacts_title));
        x3bVar.setSubtitle(new n5g(x2d.banner_big_permit_phone_book_contacts_subtitle));
        x3bVar.f(context.getString(x2d.banner_big_permit_phone_book_contacts_action_button_text), new j6(17, this));
    }
}
