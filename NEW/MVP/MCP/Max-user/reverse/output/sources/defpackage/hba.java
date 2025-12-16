package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import java.io.IOException;
import one.me.sdk.uikit.common.button.OneMeTitleSubtitleButton;

/* loaded from: classes2.dex */
public final class hba extends j3 implements k83, m7g {
    public static final int t0 = n1d.layout_send_location;
    public TextView X;
    public ImageButton Y;
    public OneMeTitleSubtitleButton Z;
    public final boolean d;
    public Group o;
    public kf8 s0;

    public hba(Context context, boolean z) {
        super(context);
        this.d = z;
    }

    @Override // defpackage.m7g
    public final void b() {
        View view = (View) this.c;
        if (view == null) {
            return;
        }
        Context context = view.getContext();
        bwf bwfVar = q1g.a0;
        q1g q1gVarD = nca.d(context);
        this.X.setTextColor(q1gVarD.J);
        this.Y.setColorFilter(q1gVarD.J, PorterDuff.Mode.SRC_IN);
        this.Y.setBackground(q1gVarD.a());
    }

    @Override // defpackage.j3
    public final void i() throws IOException {
        this.o = (Group) ((View) this.c).findViewById(q0d.layout_send_location__live_group);
        this.X = (TextView) ((View) this.c).findViewById(q0d.layout_send_location__tv_pick_duration);
        this.Y = (ImageButton) ((View) this.c).findViewById(q0d.layout_send_location__cancel_button);
        OneMeTitleSubtitleButton oneMeTitleSubtitleButton = (OneMeTitleSubtitleButton) ((View) this.c).findViewById(q0d.layout_send_location__send_button);
        this.Z = oneMeTitleSubtitleButton;
        Context context = (Context) this.b;
        String string = context.getString(mvd.I1);
        int i = mvd.Q1;
        oneMeTitleSubtitleButton.b(string, context.getString(i));
        f8j.d(this.Z, 300L, new ye6(19, this));
        b();
        ((View) this.c).setOnTouchListener(new gba());
        if (!this.d) {
            i = mvd.E1;
        }
        this.Z.setTitle(context.getString(i));
    }
}
