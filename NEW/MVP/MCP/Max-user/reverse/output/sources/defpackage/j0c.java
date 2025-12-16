package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes2.dex */
public final class j0c extends ConstraintLayout implements u6g {
    public static final /* synthetic */ int M0 = 0;
    public final ImageView F0;
    public final TextView G0;
    public final TextView H0;
    public final mq3 I0;
    public final TextView J0;
    public final TextView K0;
    public cm6 L0;

    public j0c(Context context) {
        super(context);
        this.L0 = new zfb(17);
        yfb yfbVar = new yfb(context, 6);
        yfbVar.setId(a0d.oneme_settings_privacy_pin_code_toolbar);
        yfbVar.setBackgroundColor(0);
        yfbVar.setForm(qfb.a);
        yfbVar.setLeftActions(new gfb(new iqb(7, this)));
        yfbVar.setLayoutParams(new kt3(-1, -2));
        addView(yfbVar);
        ImageView imageView = new ImageView(context);
        imageView.setId(a0d.oneme_settings_privacy_setup_pin_code_lock);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        v1a v1aVar = a93.s0;
        shapeDrawable.setTint(v1aVar.y(imageView).b().m);
        imageView.setBackground(shapeDrawable);
        float f = 16;
        u45.n(f, vw4.d().getDisplayMetrics().density, imageView);
        imageView.setImageResource(ivd.U0);
        imageView.setImageTintList(ColorStateList.valueOf(v1aVar.y(imageView).getIcon().j));
        float f2 = 64;
        imageView.setLayoutParams(new kt3(kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f2 * vw4.d().getDisplayMetrics().density)));
        addView(imageView);
        this.F0 = imageView;
        TextView textView = new TextView(context);
        textView.setId(a0d.oneme_settings_privacy_setup_pin_code_title);
        t5g t5gVar = dpg.f;
        textView.setTextColor(az1.f(t5gVar, textView, v1aVar, textView).e);
        textView.setSingleLine(true);
        textView.setLayoutParams(new kt3(-2, -2));
        addView(textView);
        this.G0 = textView;
        TextView textView2 = new TextView(context);
        textView2.setId(a0d.oneme_settings_privacy_setup_pin_code_description);
        textView2.setVisibility(8);
        textView2.setTextColor(az1.f(dpg.i, textView2, v1aVar, textView2).g);
        kt3 kt3Var = new kt3(-2, -2);
        textView2.setGravity(1);
        textView2.setLayoutParams(kt3Var);
        addView(textView2);
        this.H0 = textView2;
        mq3 mq3Var = new mq3(context, 0);
        mq3Var.setId(a0d.oneme_settings_privacy_setup_pin_code_input);
        mq3Var.setKeyboardOpen(new zfb(18));
        mq3Var.setCountCells(4);
        mq3Var.setLayoutParams(new kt3(-2, -2));
        mq3Var.setSecure(true);
        mq3Var.setDisableInputsForError(false);
        mgb.a(mq3Var, new ip3(mq3Var, mq3Var, 1));
        mq3Var.setKeyboardOpen(new ffb(12, mq3Var));
        addView(mq3Var);
        this.I0 = mq3Var;
        TextView textView3 = new TextView(context);
        textView3.setId(a0d.oneme_settings_privacy_setup_pin_code_error);
        textView3.setVisibility(8);
        textView3.setTextAlignment(4);
        dpg.l.b(textView3, t75.b);
        textView3.setSingleLine(true);
        textView3.setLayoutParams(new kt3(-2, -2));
        addView(textView3);
        this.J0 = textView3;
        TextView textView4 = new TextView(context);
        textView4.setId(a0d.oneme_settings_privacy_setup_pin_code_forgot);
        textView4.setVisibility(8);
        textView4.setText(o4d.oneme_settings_privacy_forgot_pin_code);
        t5gVar.b(textView4, t75.b);
        textView4.setTextAlignment(4);
        textView4.setLayoutParams(new kt3(-2, -2));
        addView(textView4);
        this.K0 = textView4;
        onThemeChanged(v1aVar.y(this));
        ut3 ut3VarG = l5j.g(this);
        int id = yfbVar.getId();
        ut3VarG.d(id, 3, 0, 3);
        ut3VarG.d(id, 6, 0, 6);
        ut3VarG.d(id, 7, 0, 7);
        int id2 = imageView.getId();
        ut3VarG.d(id2, 3, yfbVar.getId(), 4);
        float f3 = 24;
        az1.q(f3, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 3, id2, 5));
        ut3VarG.d(id2, 6, 0, 6);
        ut3VarG.d(id2, 7, 0, 7);
        int id3 = textView.getId();
        ut3VarG.d(id3, 3, imageView.getId(), 4);
        az1.q(f3, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 3, id3, 5));
        ut3VarG.d(id3, 6, 0, 6);
        float f4 = 12;
        az1.q(f4, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 6, id3, 5));
        ut3VarG.d(id3, 7, 0, 7);
        new fua(ut3VarG, 7, id3, 5).e(kti.d(vw4.d().getDisplayMetrics().density * f4));
        int id4 = textView2.getId();
        ut3VarG.d(id4, 3, textView.getId(), 4);
        az1.q(f4, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 3, id4, 5));
        ut3VarG.d(id4, 6, 0, 6);
        az1.q(f4, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 6, id4, 5));
        ut3VarG.d(id4, 7, 0, 7);
        new fua(ut3VarG, 7, id4, 5).e(kti.d(vw4.d().getDisplayMetrics().density * f4));
        int id5 = mq3Var.getId();
        ut3VarG.d(id5, 3, textView.getId(), 4);
        az1.q(f, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 3, id5, 5));
        ut3VarG.d(id5, 6, 0, 6);
        az1.q(f4, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 6, id5, 5));
        ut3VarG.d(id5, 7, 0, 7);
        new fua(ut3VarG, 7, id5, 5).e(kti.d(vw4.d().getDisplayMetrics().density * f4));
        int id6 = textView3.getId();
        ut3VarG.d(id6, 3, mq3Var.getId(), 4);
        az1.q(f, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 3, id6, 5));
        ut3VarG.d(id6, 6, 0, 6);
        az1.q(f4, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 6, id6, 5));
        ut3VarG.d(id6, 7, 0, 7);
        new fua(ut3VarG, 7, id6, 5).e(kti.d(vw4.d().getDisplayMetrics().density * f4));
        int id7 = textView4.getId();
        ut3VarG.d(id7, 6, 0, 6);
        az1.q(f4, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 6, id7, 5));
        ut3VarG.d(id7, 7, 0, 7);
        az1.q(f4, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 7, id7, 5));
        ut3VarG.d(id7, 4, 0, 4);
        new fua(ut3VarG, 4, id7, 5).e(kti.d(f3 * vw4.d().getDisplayMetrics().density));
        ut3VarG.a(this);
    }

    public final cm6 getOnBackPress() {
        return this.L0;
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        setBackgroundColor(yebVar.b().l);
        ImageView imageView = this.F0;
        imageView.getBackground().setTint(yebVar.b().m);
        imageView.setImageTintList(ColorStateList.valueOf(yebVar.getIcon().j));
        this.G0.setTextColor(yebVar.getText().e);
        this.H0.setTextColor(yebVar.getText().g);
        this.I0.onThemeChanged(yebVar);
        this.J0.setTextColor(yebVar.getText().b);
        this.K0.setTextColor(yebVar.getText().j);
    }

    public final void setDescription(Integer num) {
        TextView textView = this.H0;
        if (num != null) {
            textView.setText(num.intValue());
            textView.setVisibility(0);
        } else {
            textView.setText((CharSequence) null);
            textView.setVisibility(8);
        }
        int id = textView.getVisibility() == 0 ? textView.getId() : this.G0.getId();
        ut3 ut3VarG = l5j.g(this);
        int id2 = this.I0.getId();
        ut3VarG.d(id2, 3, id, 4);
        new fua(ut3VarG, 3, id2, 5).e(kti.d(16 * vw4.d().getDisplayMetrics().density));
        ut3VarG.a(this);
    }

    public final void setErrorText(CharSequence charSequence) {
        TextView textView = this.J0;
        textView.setText(charSequence);
        boolean z = charSequence == null || charSequence.length() == 0;
        boolean z2 = !z;
        float f = !z ? 1.0f : 0.0f;
        textView.setAlpha(z ? 1.0f : 0.0f);
        textView.animate().setDuration(200L).alpha(f).withEndAction(new ui(11, this, z2)).start();
    }

    public final void setForgotPinCodeClickListener(cm6 cm6Var) {
        TextView textView = this.K0;
        if (cm6Var != null) {
            textView.setVisibility(0);
            f8j.d(textView, 300L, new x6(12, cm6Var));
        } else {
            textView.setVisibility(8);
            textView.setOnClickListener(null);
        }
    }

    public final void setListener(iq3 iq3Var) {
        this.I0.setListener(iq3Var);
    }

    public final void setLocked(boolean z) {
        this.F0.setImageResource(z ? ivd.z0 : ivd.U0);
    }

    public final void setOnBackPress(cm6 cm6Var) {
        this.L0 = cm6Var;
    }

    public final void setState(jq3 jq3Var) {
        this.I0.setState(jq3Var);
    }

    public final void setTitle(int i) {
        this.G0.setText(i);
    }
}
