package defpackage;

import android.view.View;
import android.widget.ImageView;
import ru.ok.messages.views.widgets.TamAvatarView;

/* loaded from: classes2.dex */
public final class sz3 extends mid {
    public final ImageView E0;
    public final TamAvatarView F0;
    public final View G0;
    public kp8 H0;
    public final /* synthetic */ tz3 I0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sz3(tz3 tz3Var, View view) {
        super(view);
        this.I0 = tz3Var;
        this.E0 = (ImageView) view.findViewById(q0d.row_contact_location__static_image);
        this.F0 = (TamAvatarView) view.findViewById(q0d.row_contact_location__live_image);
        this.G0 = view.findViewById(q0d.row_contact_location__indicator);
        u8j.a(view, new gk0(1, this));
    }
}
