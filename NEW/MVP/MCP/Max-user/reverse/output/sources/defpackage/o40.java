package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.media.AudioManager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.sdk.richvector.EnhancedAnimatedVectorDrawable;
import org.apache.http.util.LangUtils;
import org.webrtc.MediaStreamTrack;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class o40 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ o40(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return r34.b(this.b, yud.s0);
            case 1:
                return new InsetDrawable(r34.b(this.b, yud.H0), kti.d(8 * vw4.d().getDisplayMetrics().density));
            case 2:
                return new InsetDrawable(r34.b(this.b, yud.E0), kti.d(8 * vw4.d().getDisplayMetrics().density));
            case 3:
                return (AudioManager) this.b.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
            case 4:
                return new z0g(this.b);
            case 5:
                qz9 qz9Var = new qz9(this.b);
                float f = 28;
                qz9Var.setBounds(0, 0, ctd.e(f), kti.d(vw4.c() * f));
                return qz9Var;
            case 6:
                int i = ivd.g;
                Context context = this.b;
                EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable = new EnhancedAnimatedVectorDrawable(context, i);
                yeb yebVar = a93.s0.x(context).j().c;
                z18.e(enhancedAnimatedVectorDrawable, "left_dot", yebVar.b().l);
                z18.e(enhancedAnimatedVectorDrawable, "middle_dot", yebVar.b().l);
                z18.e(enhancedAnimatedVectorDrawable, "right_dot", yebVar.b().l);
                z18.e(enhancedAnimatedVectorDrawable, "shape", yebVar.getIcon().f);
                return enhancedAnimatedVectorDrawable;
            case 7:
                return i9j.b(this.b);
            case 8:
                return i9j.b(this.b);
            case 9:
                it1 it1Var = new it1(this.b, 0);
                it1Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                it1Var.setMode(gt1.c);
                it1Var.setVideoLayoutUpdatesControllerProvider(new g31(26));
                return it1Var;
            case 10:
                return i9j.b(this.b);
            case 11:
                j41 j41Var = new j41(this.b);
                j41Var.setVisibility(8);
                j41Var.setTranslationY(vw4.d().getDisplayMetrics().density * (-50.0f));
                return j41Var;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return i9j.b(this.b);
            case 13:
                Space space = new Space(this.b);
                space.setId(View.generateViewId());
                space.setLayoutParams(new kt3(-1, 0));
                return space;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                Space space2 = new Space(this.b);
                space2.setId(View.generateViewId());
                space2.setLayoutParams(new kt3(-1, 0));
                return space2;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new mgd(this.b);
            case 16:
                TextView textView = new TextView(this.b);
                textView.setId(j0b.J1);
                textView.setGravity(17);
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                dpg.j.b(textView, t75.b);
                textView.setTextColor(a93.s0.B(textView).c.getText().h);
                textView.setVisibility(8);
                mfh.k(textView, false);
                textView.setLayoutParams(new kt3(-1, -2));
                return textView;
            case LangUtils.HASH_SEED /* 17 */:
                mq1 mq1Var = new mq1(this.b, 0);
                mq1Var.setId(j0b.Q1);
                mq1Var.setLayoutParams(new kt3(-1, -2));
                mq1Var.setVisibility(8);
                return mq1Var;
            case 18:
                jtd jtdVar = new jtd(this.b, 0);
                jtdVar.setId(j0b.N1);
                jtdVar.setMode(etd.a);
                float f2 = 60;
                jtdVar.setImageSize(new ftd(kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f2 * vw4.d().getDisplayMetrics().density)));
                jtdVar.setLayoutParams(new kt3(-2, -2));
                jtdVar.setButtonPadding(kti.d(5 * vw4.d().getDisplayMetrics().density));
                jtdVar.setVisibility(8);
                return jtdVar;
            case 19:
                jtd jtdVar2 = new jtd(this.b, 0);
                jtdVar2.setId(j0b.O1);
                jtdVar2.setMode(etd.b);
                float f3 = 60;
                jtdVar2.setImageSize(new ftd(kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(f3 * vw4.d().getDisplayMetrics().density)));
                jtdVar2.setLayoutParams(new kt3(-2, -2));
                jtdVar2.setButtonPadding(kti.d(5 * vw4.d().getDisplayMetrics().density));
                jtdVar2.setVisibility(8);
                return jtdVar2;
            case 20:
                jtd jtdVar3 = new jtd(this.b, 0);
                jtdVar3.setId(j0b.M1);
                jtdVar3.setMode(etd.a);
                float f4 = 60;
                jtdVar3.setImageSize(new ftd(kti.d(vw4.d().getDisplayMetrics().density * f4), kti.d(f4 * vw4.d().getDisplayMetrics().density)));
                jtdVar3.setLayoutParams(new kt3(-2, -2));
                jtdVar3.setButtonPadding(kti.d(5 * vw4.d().getDisplayMetrics().density));
                jtdVar3.setVisibility(8);
                return jtdVar3;
            case 21:
                return i9j.b(this.b);
            case 22:
                TextView textView2 = new TextView(this.b);
                textView2.setId(j0b.I1);
                textView2.setGravity(17);
                dpg.t.b(textView2, t75.b);
                textView2.setMaxLines(2);
                textView2.setEllipsize(TextUtils.TruncateAt.END);
                textView2.setTextColor(a93.s0.B(textView2).c.getText().e);
                textView2.setVisibility(8);
                mfh.k(textView2, false);
                textView2.setLayoutParams(new kt3(-1, -2));
                return textView2;
            case 23:
                h7d h7dVar = new h7d(this.b);
                vf vfVar = h7dVar.a;
                if (vfVar != null) {
                    vfVar.setCallback(h7dVar);
                }
                float f5 = 60;
                h7dVar.setBounds(0, 0, kti.d(vw4.d().getDisplayMetrics().density * f5), kti.d(f5 * vw4.d().getDisplayMetrics().density));
                return h7dVar;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                shapeDrawable.getPaint().setColor(rf3.i(a93.s0.z(this.b).c.i().g, 80));
                shapeDrawable.getPaint().setStyle(Paint.Style.STROKE);
                shapeDrawable.getPaint().setStrokeWidth(vw4.d().getDisplayMetrics().density * 2.0f);
                shapeDrawable.getPaint().setAntiAlias(true);
                return new InsetDrawable((Drawable) shapeDrawable, kti.d(1 * vw4.d().getDisplayMetrics().density));
            case 25:
                return r34.b(this.b, i0b.X);
            case 26:
                return r34.b(this.b, i0b.d0);
            case 27:
                return r34.b(this.b, i0b.U);
            case 28:
                i41 i41Var = new i41(this.b);
                i41Var.setLayoutParams(new kt3(-1, -1));
                i41Var.setVisibility(8);
                return i41Var;
            default:
                AppCompatImageView appCompatImageView = new AppCompatImageView(this.b, null);
                float f6 = 32;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f6), kti.d(f6 * vw4.d().getDisplayMetrics().density));
                layoutParams.gravity = 8388629;
                appCompatImageView.setLayoutParams(layoutParams);
                appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                tqi.c(new a62(3, null, 0), appCompatImageView);
                int iD = kti.d(6 * vw4.d().getDisplayMetrics().density);
                appCompatImageView.setPadding(iD, iD, iD, iD);
                return appCompatImageView;
        }
    }

    public /* synthetic */ o40(Context context, qj1 qj1Var) {
        this.a = 9;
        this.b = context;
    }
}
