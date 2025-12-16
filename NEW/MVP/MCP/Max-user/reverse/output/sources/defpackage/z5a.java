package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;

/* loaded from: classes.dex */
public final class z5a extends ConstraintLayout {
    public static final /* synthetic */ yy7[] J0;
    public final kdb F0;
    public final TextView G0;
    public final TextView H0;
    public final nk I0;

    static {
        z8a z8aVar = new z8a(z5a.class, "messageTextColor", "getMessageTextColor()Lone/me/calls/ui/view/event/MultiContactCellView$Companion$Appearance;");
        vid.a.getClass();
        J0 = new yy7[]{z8aVar};
    }

    public z5a(Context context) {
        super(context, null);
        kdb kdbVar = new kdb(context);
        kdbVar.setId(j0b.X1);
        float f = 40;
        kdbVar.setAvatarSize(kti.d(vw4.d().getDisplayMetrics().density * f));
        this.F0 = kdbVar;
        TextView textView = new TextView(context);
        textView.setId(j0b.a2);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        v1a v1aVar = a93.s0;
        textView.setTextColor(v1aVar.B(textView).c.getText().e);
        dpg.f.b(textView, t75.b);
        textView.setSingleLine();
        this.G0 = textView;
        TextView textView2 = new TextView(context);
        textView2.setId(j0b.Z1);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine();
        textView2.setTextColor(v1aVar.B(textView2).c.getText().g);
        dpg.i.b(textView2, t75.b);
        this.H0 = textView2;
        ImageView imageView = new ImageView(context);
        imageView.setId(j0b.Y1);
        imageView.setImageResource(yud.D0);
        int iD = kti.d(2 * vw4.d().getDisplayMetrics().density);
        imageView.setPadding(iD, iD, iD, iD);
        imageView.setImageTintList(ColorStateList.valueOf(v1aVar.B(imageView).c.getIcon().j));
        this.I0 = new nk(this);
        float f2 = 12;
        float f3 = 6;
        setPadding(kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f3 * vw4.d().getDisplayMetrics().density));
        addView(kdbVar, new kt3(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density)));
        addView(textView, new kt3(-2, -2));
        addView(textView2, new kt3(-2, -2));
        float f4 = 24;
        addView(imageView, new kt3(kti.d(vw4.d().getDisplayMetrics().density * f4), kti.d(f4 * vw4.d().getDisplayMetrics().density)));
        setLayoutParams(new kt3(-1, kti.d(60 * vw4.d().getDisplayMetrics().density)));
        ut3 ut3VarG = l5j.g(this);
        int id = kdbVar.getId();
        ut3VarG.d(id, 4, 0, 4);
        ut3VarG.d(id, 6, 0, 6);
        ut3VarG.d(id, 3, 0, 3);
        ut3VarG.g(id).d.w = 0.0f;
        int id2 = textView.getId();
        ut3VarG.d(id2, 3, 0, 3);
        ut3VarG.d(id2, 6, kdbVar.getId(), 7);
        new fua(ut3VarG, 6, id2, 5).e(kti.d(f2 * vw4.d().getDisplayMetrics().density));
        ut3VarG.d(id2, 4, textView2.getId(), 3);
        ut3VarG.d(id2, 7, imageView.getId(), 6);
        ut3VarG.g(id2).d.w = 0.0f;
        ut3VarG.g(id2).d.l0 = true;
        int id3 = textView2.getId();
        ut3VarG.d(id3, 3, textView.getId(), 4);
        ut3VarG.d(id3, 6, textView.getId(), 6);
        ut3VarG.d(id3, 7, textView.getId(), 7);
        ut3VarG.d(id3, 4, 0, 4);
        ut3VarG.g(id3).d.w = 0.0f;
        ut3VarG.g(id3).d.W = 2;
        int id4 = imageView.getId();
        ut3VarG.d(id4, 3, 0, 3);
        ut3VarG.d(id4, 4, 0, 4);
        ut3VarG.d(id4, 7, 0, 7);
        ut3VarG.a(this);
    }

    public final y5a getMessageTextColor() {
        yy7 yy7Var = J0[0];
        return (y5a) this.I0.b;
    }

    public final void setAvatars(List<imb> list) {
        this.F0.setAvatars(list);
    }

    public final void setMessage(s5g s5gVar) {
        this.H0.setText(s5gVar != null ? s5gVar.b(getContext()) : null);
    }

    public final void setMessageTextColor(y5a y5aVar) {
        this.I0.O(this, J0[0], y5aVar);
    }

    public final void setName(s5g s5gVar) {
        this.G0.setText(s5gVar != null ? s5gVar.b(getContext()) : null);
    }
}
