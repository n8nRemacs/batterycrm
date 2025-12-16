package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes2.dex */
public final class v0b extends ViewGroup implements u6g {
    public static final /* synthetic */ yy7[] N0 = {new z8a(v0b.class, "isSelectionEnabled", "isSelectionEnabled()Z"), u45.h(vid.a, v0b.class, "isItemSelected", "isItemSelected()Z"), new z8a(v0b.class, "customTheme", "getCustomTheme()Lone/me/sdk/design/OneMeTheme;"), new z8a(v0b.class, "callButtonMode", "getCallButtonMode()Lone/me/sdk/uikit/common/cellitem/OneMeCellSimpleView$Companion$CallButtonMode;"), new z8a(v0b.class, "subtitleTextColor", "getSubtitleTextColor()Lone/me/sdk/uikit/common/cellitem/OneMeCellSimpleView$Companion$Appearance;"), new z8a(v0b.class, "trailingElementsPadding", "getTrailingElementsPadding()Lone/me/sdk/uikit/common/cellitem/OneMeCellSimpleView$Companion$Size;"), new z8a(v0b.class, "cellHeight", "getCellHeight()Lone/me/sdk/uikit/common/cellitem/OneMeCellSimpleView$Companion$Size;")};
    public final Object A0;
    public final u0b B0;
    public final u0b C0;
    public final u0b D0;
    public final u0b E0;
    public final u0b F0;
    public final u0b G0;
    public final u0b H0;
    public AppCompatCheckBox I0;
    public View J0;
    public ImageView K0;
    public View L0;
    public final int M0;
    public final boolean a;
    public final Object b;
    public final TextView c;
    public final Object d;
    public final Object o;
    public final Object s0;
    public final Object t0;
    public final Object u0;
    public final und v0;
    public final und w0;
    public final Object x0;
    public final Object y0;
    public final und z0;

    public v0b(final Context context, boolean z) {
        super(context);
        this.a = z;
        final int i = 4;
        this.b = ipi.b(3, new cm6() { // from class: p0b
            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i) {
                    case 0:
                        ImageView imageView = new ImageView(context);
                        imageView.setId(zud.v);
                        imageView.setImageResource(cxc.videocam_outline_24);
                        yeb customTheme = this.getCustomTheme();
                        if (customTheme == null) {
                            customTheme = a93.s0.y(imageView);
                        }
                        imageView.setImageTintList(ColorStateList.valueOf(customTheme.getIcon().f));
                        int iD = kti.d(8 * vw4.d().getDisplayMetrics().density);
                        imageView.setPadding(iD, iD, iD, iD);
                        int i2 = customTheme.c().a.a.d;
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.getPaint().setColor(-1);
                        imageView.setBackground(new RippleDrawable(ColorStateList.valueOf(i2), null, shapeDrawable));
                        float f = 40;
                        imageView.setLayoutParams(new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density)));
                        return imageView;
                    case 1:
                        ImageView imageView2 = new ImageView(context);
                        imageView2.setId(zud.q);
                        yeb customTheme2 = this.getCustomTheme();
                        if (customTheme2 == null) {
                            customTheme2 = a93.s0.y(imageView2);
                        }
                        imageView2.setImageTintList(ColorStateList.valueOf(customTheme2.getIcon().j));
                        float f2 = 20;
                        imageView2.setLayoutParams(new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f2 * vw4.d().getDisplayMetrics().density)));
                        return imageView2;
                    case 2:
                        ImageView imageView3 = new ImageView(context);
                        imageView3.setId(zud.u);
                        yeb customTheme3 = this.getCustomTheme();
                        if (customTheme3 == null) {
                            customTheme3 = a93.s0.y(imageView3);
                        }
                        imageView3.setImageTintList(ColorStateList.valueOf(customTheme3.getIcon().j));
                        float f3 = 20;
                        imageView3.setLayoutParams(new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(f3 * vw4.d().getDisplayMetrics().density)));
                        return imageView3;
                    case 3:
                        ImageView imageView4 = new ImageView(context);
                        imageView4.setId(zud.m);
                        imageView4.setImageResource(cxc.ic_audio_call_type_24);
                        yeb customTheme4 = this.getCustomTheme();
                        if (customTheme4 == null) {
                            customTheme4 = a93.s0.y(imageView4);
                        }
                        imageView4.setImageTintList(ColorStateList.valueOf(customTheme4.getIcon().f));
                        int iD2 = kti.d(8 * vw4.d().getDisplayMetrics().density);
                        imageView4.setPadding(iD2, iD2, iD2, iD2);
                        int i3 = customTheme4.c().a.a.d;
                        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
                        shapeDrawable2.getPaint().setColor(-1);
                        imageView4.setBackground(new RippleDrawable(ColorStateList.valueOf(i3), null, shapeDrawable2));
                        float f4 = 40;
                        imageView4.setLayoutParams(new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f4), kti.d(f4 * vw4.d().getDisplayMetrics().density)));
                        return imageView4;
                    case 4:
                        uxa uxaVar = new uxa(context);
                        uxaVar.setId(zud.n);
                        uxaVar.setAvatarShape(kxa.a);
                        int i4 = this.M0;
                        uxaVar.setLayoutParams(new ViewGroup.LayoutParams(i4, i4));
                        return uxaVar;
                    case 5:
                        return v0b.a(context, this);
                    case 6:
                        TextView textView = new TextView(context);
                        textView.setId(zud.s);
                        textView.setEllipsize(TextUtils.TruncateAt.END);
                        textView.setSingleLine();
                        textView.setTextColor(a93.s0.y(textView).getText().g);
                        dpg.i.b(textView, t75.b);
                        mfh.k(textView, false);
                        this.addView(textView, new ViewGroup.LayoutParams(-2, kti.d(20 * vw4.d().getDisplayMetrics().density)));
                        return textView;
                    default:
                        TextView textView2 = new TextView(context);
                        textView2.setId(zud.l);
                        textView2.setEllipsize(TextUtils.TruncateAt.END);
                        textView2.setSingleLine();
                        textView2.setTextColor(a93.s0.y(textView2).getText().g);
                        dpg.m.b(textView2, t75.b);
                        mfh.k(textView2, false);
                        this.addView(textView2, new ViewGroup.LayoutParams(-2, kti.d(20 * vw4.d().getDisplayMetrics().density)));
                        return textView2;
                }
            }
        });
        TextView textView = new TextView(context);
        textView.setId(zud.t);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextColor(a93.s0.y(textView).getText().e);
        dpg.f.b(textView, t75.b);
        mfh.k(textView, false);
        textView.setSingleLine();
        this.c = textView;
        final int i2 = 6;
        this.d = ipi.b(3, new cm6() { // from class: p0b
            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        ImageView imageView = new ImageView(context);
                        imageView.setId(zud.v);
                        imageView.setImageResource(cxc.videocam_outline_24);
                        yeb customTheme = this.getCustomTheme();
                        if (customTheme == null) {
                            customTheme = a93.s0.y(imageView);
                        }
                        imageView.setImageTintList(ColorStateList.valueOf(customTheme.getIcon().f));
                        int iD = kti.d(8 * vw4.d().getDisplayMetrics().density);
                        imageView.setPadding(iD, iD, iD, iD);
                        int i22 = customTheme.c().a.a.d;
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.getPaint().setColor(-1);
                        imageView.setBackground(new RippleDrawable(ColorStateList.valueOf(i22), null, shapeDrawable));
                        float f = 40;
                        imageView.setLayoutParams(new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density)));
                        return imageView;
                    case 1:
                        ImageView imageView2 = new ImageView(context);
                        imageView2.setId(zud.q);
                        yeb customTheme2 = this.getCustomTheme();
                        if (customTheme2 == null) {
                            customTheme2 = a93.s0.y(imageView2);
                        }
                        imageView2.setImageTintList(ColorStateList.valueOf(customTheme2.getIcon().j));
                        float f2 = 20;
                        imageView2.setLayoutParams(new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f2 * vw4.d().getDisplayMetrics().density)));
                        return imageView2;
                    case 2:
                        ImageView imageView3 = new ImageView(context);
                        imageView3.setId(zud.u);
                        yeb customTheme3 = this.getCustomTheme();
                        if (customTheme3 == null) {
                            customTheme3 = a93.s0.y(imageView3);
                        }
                        imageView3.setImageTintList(ColorStateList.valueOf(customTheme3.getIcon().j));
                        float f3 = 20;
                        imageView3.setLayoutParams(new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(f3 * vw4.d().getDisplayMetrics().density)));
                        return imageView3;
                    case 3:
                        ImageView imageView4 = new ImageView(context);
                        imageView4.setId(zud.m);
                        imageView4.setImageResource(cxc.ic_audio_call_type_24);
                        yeb customTheme4 = this.getCustomTheme();
                        if (customTheme4 == null) {
                            customTheme4 = a93.s0.y(imageView4);
                        }
                        imageView4.setImageTintList(ColorStateList.valueOf(customTheme4.getIcon().f));
                        int iD2 = kti.d(8 * vw4.d().getDisplayMetrics().density);
                        imageView4.setPadding(iD2, iD2, iD2, iD2);
                        int i3 = customTheme4.c().a.a.d;
                        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
                        shapeDrawable2.getPaint().setColor(-1);
                        imageView4.setBackground(new RippleDrawable(ColorStateList.valueOf(i3), null, shapeDrawable2));
                        float f4 = 40;
                        imageView4.setLayoutParams(new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f4), kti.d(f4 * vw4.d().getDisplayMetrics().density)));
                        return imageView4;
                    case 4:
                        uxa uxaVar = new uxa(context);
                        uxaVar.setId(zud.n);
                        uxaVar.setAvatarShape(kxa.a);
                        int i4 = this.M0;
                        uxaVar.setLayoutParams(new ViewGroup.LayoutParams(i4, i4));
                        return uxaVar;
                    case 5:
                        return v0b.a(context, this);
                    case 6:
                        TextView textView2 = new TextView(context);
                        textView2.setId(zud.s);
                        textView2.setEllipsize(TextUtils.TruncateAt.END);
                        textView2.setSingleLine();
                        textView2.setTextColor(a93.s0.y(textView2).getText().g);
                        dpg.i.b(textView2, t75.b);
                        mfh.k(textView2, false);
                        this.addView(textView2, new ViewGroup.LayoutParams(-2, kti.d(20 * vw4.d().getDisplayMetrics().density)));
                        return textView2;
                    default:
                        TextView textView22 = new TextView(context);
                        textView22.setId(zud.l);
                        textView22.setEllipsize(TextUtils.TruncateAt.END);
                        textView22.setSingleLine();
                        textView22.setTextColor(a93.s0.y(textView22).getText().g);
                        dpg.m.b(textView22, t75.b);
                        mfh.k(textView22, false);
                        this.addView(textView22, new ViewGroup.LayoutParams(-2, kti.d(20 * vw4.d().getDisplayMetrics().density)));
                        return textView22;
                }
            }
        });
        final int i3 = 7;
        this.o = ipi.b(3, new cm6() { // from class: p0b
            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        ImageView imageView = new ImageView(context);
                        imageView.setId(zud.v);
                        imageView.setImageResource(cxc.videocam_outline_24);
                        yeb customTheme = this.getCustomTheme();
                        if (customTheme == null) {
                            customTheme = a93.s0.y(imageView);
                        }
                        imageView.setImageTintList(ColorStateList.valueOf(customTheme.getIcon().f));
                        int iD = kti.d(8 * vw4.d().getDisplayMetrics().density);
                        imageView.setPadding(iD, iD, iD, iD);
                        int i22 = customTheme.c().a.a.d;
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.getPaint().setColor(-1);
                        imageView.setBackground(new RippleDrawable(ColorStateList.valueOf(i22), null, shapeDrawable));
                        float f = 40;
                        imageView.setLayoutParams(new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density)));
                        return imageView;
                    case 1:
                        ImageView imageView2 = new ImageView(context);
                        imageView2.setId(zud.q);
                        yeb customTheme2 = this.getCustomTheme();
                        if (customTheme2 == null) {
                            customTheme2 = a93.s0.y(imageView2);
                        }
                        imageView2.setImageTintList(ColorStateList.valueOf(customTheme2.getIcon().j));
                        float f2 = 20;
                        imageView2.setLayoutParams(new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f2 * vw4.d().getDisplayMetrics().density)));
                        return imageView2;
                    case 2:
                        ImageView imageView3 = new ImageView(context);
                        imageView3.setId(zud.u);
                        yeb customTheme3 = this.getCustomTheme();
                        if (customTheme3 == null) {
                            customTheme3 = a93.s0.y(imageView3);
                        }
                        imageView3.setImageTintList(ColorStateList.valueOf(customTheme3.getIcon().j));
                        float f3 = 20;
                        imageView3.setLayoutParams(new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(f3 * vw4.d().getDisplayMetrics().density)));
                        return imageView3;
                    case 3:
                        ImageView imageView4 = new ImageView(context);
                        imageView4.setId(zud.m);
                        imageView4.setImageResource(cxc.ic_audio_call_type_24);
                        yeb customTheme4 = this.getCustomTheme();
                        if (customTheme4 == null) {
                            customTheme4 = a93.s0.y(imageView4);
                        }
                        imageView4.setImageTintList(ColorStateList.valueOf(customTheme4.getIcon().f));
                        int iD2 = kti.d(8 * vw4.d().getDisplayMetrics().density);
                        imageView4.setPadding(iD2, iD2, iD2, iD2);
                        int i32 = customTheme4.c().a.a.d;
                        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
                        shapeDrawable2.getPaint().setColor(-1);
                        imageView4.setBackground(new RippleDrawable(ColorStateList.valueOf(i32), null, shapeDrawable2));
                        float f4 = 40;
                        imageView4.setLayoutParams(new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f4), kti.d(f4 * vw4.d().getDisplayMetrics().density)));
                        return imageView4;
                    case 4:
                        uxa uxaVar = new uxa(context);
                        uxaVar.setId(zud.n);
                        uxaVar.setAvatarShape(kxa.a);
                        int i4 = this.M0;
                        uxaVar.setLayoutParams(new ViewGroup.LayoutParams(i4, i4));
                        return uxaVar;
                    case 5:
                        return v0b.a(context, this);
                    case 6:
                        TextView textView2 = new TextView(context);
                        textView2.setId(zud.s);
                        textView2.setEllipsize(TextUtils.TruncateAt.END);
                        textView2.setSingleLine();
                        textView2.setTextColor(a93.s0.y(textView2).getText().g);
                        dpg.i.b(textView2, t75.b);
                        mfh.k(textView2, false);
                        this.addView(textView2, new ViewGroup.LayoutParams(-2, kti.d(20 * vw4.d().getDisplayMetrics().density)));
                        return textView2;
                    default:
                        TextView textView22 = new TextView(context);
                        textView22.setId(zud.l);
                        textView22.setEllipsize(TextUtils.TruncateAt.END);
                        textView22.setSingleLine();
                        textView22.setTextColor(a93.s0.y(textView22).getText().g);
                        dpg.m.b(textView22, t75.b);
                        mfh.k(textView22, false);
                        this.addView(textView22, new ViewGroup.LayoutParams(-2, kti.d(20 * vw4.d().getDisplayMetrics().density)));
                        return textView22;
                }
            }
        });
        this.s0 = ipi.b(3, new ns2(context, 28));
        this.t0 = ipi.b(3, new ns2(context, 26));
        final int i4 = 0;
        this.u0 = ipi.b(3, new cm6() { // from class: p0b
            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        ImageView imageView = new ImageView(context);
                        imageView.setId(zud.v);
                        imageView.setImageResource(cxc.videocam_outline_24);
                        yeb customTheme = this.getCustomTheme();
                        if (customTheme == null) {
                            customTheme = a93.s0.y(imageView);
                        }
                        imageView.setImageTintList(ColorStateList.valueOf(customTheme.getIcon().f));
                        int iD = kti.d(8 * vw4.d().getDisplayMetrics().density);
                        imageView.setPadding(iD, iD, iD, iD);
                        int i22 = customTheme.c().a.a.d;
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.getPaint().setColor(-1);
                        imageView.setBackground(new RippleDrawable(ColorStateList.valueOf(i22), null, shapeDrawable));
                        float f = 40;
                        imageView.setLayoutParams(new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density)));
                        return imageView;
                    case 1:
                        ImageView imageView2 = new ImageView(context);
                        imageView2.setId(zud.q);
                        yeb customTheme2 = this.getCustomTheme();
                        if (customTheme2 == null) {
                            customTheme2 = a93.s0.y(imageView2);
                        }
                        imageView2.setImageTintList(ColorStateList.valueOf(customTheme2.getIcon().j));
                        float f2 = 20;
                        imageView2.setLayoutParams(new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f2 * vw4.d().getDisplayMetrics().density)));
                        return imageView2;
                    case 2:
                        ImageView imageView3 = new ImageView(context);
                        imageView3.setId(zud.u);
                        yeb customTheme3 = this.getCustomTheme();
                        if (customTheme3 == null) {
                            customTheme3 = a93.s0.y(imageView3);
                        }
                        imageView3.setImageTintList(ColorStateList.valueOf(customTheme3.getIcon().j));
                        float f3 = 20;
                        imageView3.setLayoutParams(new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(f3 * vw4.d().getDisplayMetrics().density)));
                        return imageView3;
                    case 3:
                        ImageView imageView4 = new ImageView(context);
                        imageView4.setId(zud.m);
                        imageView4.setImageResource(cxc.ic_audio_call_type_24);
                        yeb customTheme4 = this.getCustomTheme();
                        if (customTheme4 == null) {
                            customTheme4 = a93.s0.y(imageView4);
                        }
                        imageView4.setImageTintList(ColorStateList.valueOf(customTheme4.getIcon().f));
                        int iD2 = kti.d(8 * vw4.d().getDisplayMetrics().density);
                        imageView4.setPadding(iD2, iD2, iD2, iD2);
                        int i32 = customTheme4.c().a.a.d;
                        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
                        shapeDrawable2.getPaint().setColor(-1);
                        imageView4.setBackground(new RippleDrawable(ColorStateList.valueOf(i32), null, shapeDrawable2));
                        float f4 = 40;
                        imageView4.setLayoutParams(new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f4), kti.d(f4 * vw4.d().getDisplayMetrics().density)));
                        return imageView4;
                    case 4:
                        uxa uxaVar = new uxa(context);
                        uxaVar.setId(zud.n);
                        uxaVar.setAvatarShape(kxa.a);
                        int i42 = this.M0;
                        uxaVar.setLayoutParams(new ViewGroup.LayoutParams(i42, i42));
                        return uxaVar;
                    case 5:
                        return v0b.a(context, this);
                    case 6:
                        TextView textView2 = new TextView(context);
                        textView2.setId(zud.s);
                        textView2.setEllipsize(TextUtils.TruncateAt.END);
                        textView2.setSingleLine();
                        textView2.setTextColor(a93.s0.y(textView2).getText().g);
                        dpg.i.b(textView2, t75.b);
                        mfh.k(textView2, false);
                        this.addView(textView2, new ViewGroup.LayoutParams(-2, kti.d(20 * vw4.d().getDisplayMetrics().density)));
                        return textView2;
                    default:
                        TextView textView22 = new TextView(context);
                        textView22.setId(zud.l);
                        textView22.setEllipsize(TextUtils.TruncateAt.END);
                        textView22.setSingleLine();
                        textView22.setTextColor(a93.s0.y(textView22).getText().g);
                        dpg.m.b(textView22, t75.b);
                        mfh.k(textView22, false);
                        this.addView(textView22, new ViewGroup.LayoutParams(-2, kti.d(20 * vw4.d().getDisplayMetrics().density)));
                        return textView22;
                }
            }
        });
        final int i5 = 1;
        this.v0 = new und(new cm6() { // from class: p0b
            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        ImageView imageView = new ImageView(context);
                        imageView.setId(zud.v);
                        imageView.setImageResource(cxc.videocam_outline_24);
                        yeb customTheme = this.getCustomTheme();
                        if (customTheme == null) {
                            customTheme = a93.s0.y(imageView);
                        }
                        imageView.setImageTintList(ColorStateList.valueOf(customTheme.getIcon().f));
                        int iD = kti.d(8 * vw4.d().getDisplayMetrics().density);
                        imageView.setPadding(iD, iD, iD, iD);
                        int i22 = customTheme.c().a.a.d;
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.getPaint().setColor(-1);
                        imageView.setBackground(new RippleDrawable(ColorStateList.valueOf(i22), null, shapeDrawable));
                        float f = 40;
                        imageView.setLayoutParams(new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density)));
                        return imageView;
                    case 1:
                        ImageView imageView2 = new ImageView(context);
                        imageView2.setId(zud.q);
                        yeb customTheme2 = this.getCustomTheme();
                        if (customTheme2 == null) {
                            customTheme2 = a93.s0.y(imageView2);
                        }
                        imageView2.setImageTintList(ColorStateList.valueOf(customTheme2.getIcon().j));
                        float f2 = 20;
                        imageView2.setLayoutParams(new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f2 * vw4.d().getDisplayMetrics().density)));
                        return imageView2;
                    case 2:
                        ImageView imageView3 = new ImageView(context);
                        imageView3.setId(zud.u);
                        yeb customTheme3 = this.getCustomTheme();
                        if (customTheme3 == null) {
                            customTheme3 = a93.s0.y(imageView3);
                        }
                        imageView3.setImageTintList(ColorStateList.valueOf(customTheme3.getIcon().j));
                        float f3 = 20;
                        imageView3.setLayoutParams(new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(f3 * vw4.d().getDisplayMetrics().density)));
                        return imageView3;
                    case 3:
                        ImageView imageView4 = new ImageView(context);
                        imageView4.setId(zud.m);
                        imageView4.setImageResource(cxc.ic_audio_call_type_24);
                        yeb customTheme4 = this.getCustomTheme();
                        if (customTheme4 == null) {
                            customTheme4 = a93.s0.y(imageView4);
                        }
                        imageView4.setImageTintList(ColorStateList.valueOf(customTheme4.getIcon().f));
                        int iD2 = kti.d(8 * vw4.d().getDisplayMetrics().density);
                        imageView4.setPadding(iD2, iD2, iD2, iD2);
                        int i32 = customTheme4.c().a.a.d;
                        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
                        shapeDrawable2.getPaint().setColor(-1);
                        imageView4.setBackground(new RippleDrawable(ColorStateList.valueOf(i32), null, shapeDrawable2));
                        float f4 = 40;
                        imageView4.setLayoutParams(new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f4), kti.d(f4 * vw4.d().getDisplayMetrics().density)));
                        return imageView4;
                    case 4:
                        uxa uxaVar = new uxa(context);
                        uxaVar.setId(zud.n);
                        uxaVar.setAvatarShape(kxa.a);
                        int i42 = this.M0;
                        uxaVar.setLayoutParams(new ViewGroup.LayoutParams(i42, i42));
                        return uxaVar;
                    case 5:
                        return v0b.a(context, this);
                    case 6:
                        TextView textView2 = new TextView(context);
                        textView2.setId(zud.s);
                        textView2.setEllipsize(TextUtils.TruncateAt.END);
                        textView2.setSingleLine();
                        textView2.setTextColor(a93.s0.y(textView2).getText().g);
                        dpg.i.b(textView2, t75.b);
                        mfh.k(textView2, false);
                        this.addView(textView2, new ViewGroup.LayoutParams(-2, kti.d(20 * vw4.d().getDisplayMetrics().density)));
                        return textView2;
                    default:
                        TextView textView22 = new TextView(context);
                        textView22.setId(zud.l);
                        textView22.setEllipsize(TextUtils.TruncateAt.END);
                        textView22.setSingleLine();
                        textView22.setTextColor(a93.s0.y(textView22).getText().g);
                        dpg.m.b(textView22, t75.b);
                        mfh.k(textView22, false);
                        this.addView(textView22, new ViewGroup.LayoutParams(-2, kti.d(20 * vw4.d().getDisplayMetrics().density)));
                        return textView22;
                }
            }
        });
        final int i6 = 2;
        this.w0 = new und(new cm6() { // from class: p0b
            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        ImageView imageView = new ImageView(context);
                        imageView.setId(zud.v);
                        imageView.setImageResource(cxc.videocam_outline_24);
                        yeb customTheme = this.getCustomTheme();
                        if (customTheme == null) {
                            customTheme = a93.s0.y(imageView);
                        }
                        imageView.setImageTintList(ColorStateList.valueOf(customTheme.getIcon().f));
                        int iD = kti.d(8 * vw4.d().getDisplayMetrics().density);
                        imageView.setPadding(iD, iD, iD, iD);
                        int i22 = customTheme.c().a.a.d;
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.getPaint().setColor(-1);
                        imageView.setBackground(new RippleDrawable(ColorStateList.valueOf(i22), null, shapeDrawable));
                        float f = 40;
                        imageView.setLayoutParams(new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density)));
                        return imageView;
                    case 1:
                        ImageView imageView2 = new ImageView(context);
                        imageView2.setId(zud.q);
                        yeb customTheme2 = this.getCustomTheme();
                        if (customTheme2 == null) {
                            customTheme2 = a93.s0.y(imageView2);
                        }
                        imageView2.setImageTintList(ColorStateList.valueOf(customTheme2.getIcon().j));
                        float f2 = 20;
                        imageView2.setLayoutParams(new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f2 * vw4.d().getDisplayMetrics().density)));
                        return imageView2;
                    case 2:
                        ImageView imageView3 = new ImageView(context);
                        imageView3.setId(zud.u);
                        yeb customTheme3 = this.getCustomTheme();
                        if (customTheme3 == null) {
                            customTheme3 = a93.s0.y(imageView3);
                        }
                        imageView3.setImageTintList(ColorStateList.valueOf(customTheme3.getIcon().j));
                        float f3 = 20;
                        imageView3.setLayoutParams(new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(f3 * vw4.d().getDisplayMetrics().density)));
                        return imageView3;
                    case 3:
                        ImageView imageView4 = new ImageView(context);
                        imageView4.setId(zud.m);
                        imageView4.setImageResource(cxc.ic_audio_call_type_24);
                        yeb customTheme4 = this.getCustomTheme();
                        if (customTheme4 == null) {
                            customTheme4 = a93.s0.y(imageView4);
                        }
                        imageView4.setImageTintList(ColorStateList.valueOf(customTheme4.getIcon().f));
                        int iD2 = kti.d(8 * vw4.d().getDisplayMetrics().density);
                        imageView4.setPadding(iD2, iD2, iD2, iD2);
                        int i32 = customTheme4.c().a.a.d;
                        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
                        shapeDrawable2.getPaint().setColor(-1);
                        imageView4.setBackground(new RippleDrawable(ColorStateList.valueOf(i32), null, shapeDrawable2));
                        float f4 = 40;
                        imageView4.setLayoutParams(new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f4), kti.d(f4 * vw4.d().getDisplayMetrics().density)));
                        return imageView4;
                    case 4:
                        uxa uxaVar = new uxa(context);
                        uxaVar.setId(zud.n);
                        uxaVar.setAvatarShape(kxa.a);
                        int i42 = this.M0;
                        uxaVar.setLayoutParams(new ViewGroup.LayoutParams(i42, i42));
                        return uxaVar;
                    case 5:
                        return v0b.a(context, this);
                    case 6:
                        TextView textView2 = new TextView(context);
                        textView2.setId(zud.s);
                        textView2.setEllipsize(TextUtils.TruncateAt.END);
                        textView2.setSingleLine();
                        textView2.setTextColor(a93.s0.y(textView2).getText().g);
                        dpg.i.b(textView2, t75.b);
                        mfh.k(textView2, false);
                        this.addView(textView2, new ViewGroup.LayoutParams(-2, kti.d(20 * vw4.d().getDisplayMetrics().density)));
                        return textView2;
                    default:
                        TextView textView22 = new TextView(context);
                        textView22.setId(zud.l);
                        textView22.setEllipsize(TextUtils.TruncateAt.END);
                        textView22.setSingleLine();
                        textView22.setTextColor(a93.s0.y(textView22).getText().g);
                        dpg.m.b(textView22, t75.b);
                        mfh.k(textView22, false);
                        this.addView(textView22, new ViewGroup.LayoutParams(-2, kti.d(20 * vw4.d().getDisplayMetrics().density)));
                        return textView22;
                }
            }
        });
        final int i7 = 3;
        this.x0 = ipi.b(3, new cm6() { // from class: p0b
            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        ImageView imageView = new ImageView(context);
                        imageView.setId(zud.v);
                        imageView.setImageResource(cxc.videocam_outline_24);
                        yeb customTheme = this.getCustomTheme();
                        if (customTheme == null) {
                            customTheme = a93.s0.y(imageView);
                        }
                        imageView.setImageTintList(ColorStateList.valueOf(customTheme.getIcon().f));
                        int iD = kti.d(8 * vw4.d().getDisplayMetrics().density);
                        imageView.setPadding(iD, iD, iD, iD);
                        int i22 = customTheme.c().a.a.d;
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.getPaint().setColor(-1);
                        imageView.setBackground(new RippleDrawable(ColorStateList.valueOf(i22), null, shapeDrawable));
                        float f = 40;
                        imageView.setLayoutParams(new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density)));
                        return imageView;
                    case 1:
                        ImageView imageView2 = new ImageView(context);
                        imageView2.setId(zud.q);
                        yeb customTheme2 = this.getCustomTheme();
                        if (customTheme2 == null) {
                            customTheme2 = a93.s0.y(imageView2);
                        }
                        imageView2.setImageTintList(ColorStateList.valueOf(customTheme2.getIcon().j));
                        float f2 = 20;
                        imageView2.setLayoutParams(new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f2 * vw4.d().getDisplayMetrics().density)));
                        return imageView2;
                    case 2:
                        ImageView imageView3 = new ImageView(context);
                        imageView3.setId(zud.u);
                        yeb customTheme3 = this.getCustomTheme();
                        if (customTheme3 == null) {
                            customTheme3 = a93.s0.y(imageView3);
                        }
                        imageView3.setImageTintList(ColorStateList.valueOf(customTheme3.getIcon().j));
                        float f3 = 20;
                        imageView3.setLayoutParams(new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(f3 * vw4.d().getDisplayMetrics().density)));
                        return imageView3;
                    case 3:
                        ImageView imageView4 = new ImageView(context);
                        imageView4.setId(zud.m);
                        imageView4.setImageResource(cxc.ic_audio_call_type_24);
                        yeb customTheme4 = this.getCustomTheme();
                        if (customTheme4 == null) {
                            customTheme4 = a93.s0.y(imageView4);
                        }
                        imageView4.setImageTintList(ColorStateList.valueOf(customTheme4.getIcon().f));
                        int iD2 = kti.d(8 * vw4.d().getDisplayMetrics().density);
                        imageView4.setPadding(iD2, iD2, iD2, iD2);
                        int i32 = customTheme4.c().a.a.d;
                        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
                        shapeDrawable2.getPaint().setColor(-1);
                        imageView4.setBackground(new RippleDrawable(ColorStateList.valueOf(i32), null, shapeDrawable2));
                        float f4 = 40;
                        imageView4.setLayoutParams(new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f4), kti.d(f4 * vw4.d().getDisplayMetrics().density)));
                        return imageView4;
                    case 4:
                        uxa uxaVar = new uxa(context);
                        uxaVar.setId(zud.n);
                        uxaVar.setAvatarShape(kxa.a);
                        int i42 = this.M0;
                        uxaVar.setLayoutParams(new ViewGroup.LayoutParams(i42, i42));
                        return uxaVar;
                    case 5:
                        return v0b.a(context, this);
                    case 6:
                        TextView textView2 = new TextView(context);
                        textView2.setId(zud.s);
                        textView2.setEllipsize(TextUtils.TruncateAt.END);
                        textView2.setSingleLine();
                        textView2.setTextColor(a93.s0.y(textView2).getText().g);
                        dpg.i.b(textView2, t75.b);
                        mfh.k(textView2, false);
                        this.addView(textView2, new ViewGroup.LayoutParams(-2, kti.d(20 * vw4.d().getDisplayMetrics().density)));
                        return textView2;
                    default:
                        TextView textView22 = new TextView(context);
                        textView22.setId(zud.l);
                        textView22.setEllipsize(TextUtils.TruncateAt.END);
                        textView22.setSingleLine();
                        textView22.setTextColor(a93.s0.y(textView22).getText().g);
                        dpg.m.b(textView22, t75.b);
                        mfh.k(textView22, false);
                        this.addView(textView22, new ViewGroup.LayoutParams(-2, kti.d(20 * vw4.d().getDisplayMetrics().density)));
                        return textView22;
                }
            }
        });
        this.y0 = ipi.b(3, new ns2(context, 27));
        final int i8 = 5;
        this.z0 = new und(new cm6() { // from class: p0b
            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i8) {
                    case 0:
                        ImageView imageView = new ImageView(context);
                        imageView.setId(zud.v);
                        imageView.setImageResource(cxc.videocam_outline_24);
                        yeb customTheme = this.getCustomTheme();
                        if (customTheme == null) {
                            customTheme = a93.s0.y(imageView);
                        }
                        imageView.setImageTintList(ColorStateList.valueOf(customTheme.getIcon().f));
                        int iD = kti.d(8 * vw4.d().getDisplayMetrics().density);
                        imageView.setPadding(iD, iD, iD, iD);
                        int i22 = customTheme.c().a.a.d;
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.getPaint().setColor(-1);
                        imageView.setBackground(new RippleDrawable(ColorStateList.valueOf(i22), null, shapeDrawable));
                        float f = 40;
                        imageView.setLayoutParams(new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density)));
                        return imageView;
                    case 1:
                        ImageView imageView2 = new ImageView(context);
                        imageView2.setId(zud.q);
                        yeb customTheme2 = this.getCustomTheme();
                        if (customTheme2 == null) {
                            customTheme2 = a93.s0.y(imageView2);
                        }
                        imageView2.setImageTintList(ColorStateList.valueOf(customTheme2.getIcon().j));
                        float f2 = 20;
                        imageView2.setLayoutParams(new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f2 * vw4.d().getDisplayMetrics().density)));
                        return imageView2;
                    case 2:
                        ImageView imageView3 = new ImageView(context);
                        imageView3.setId(zud.u);
                        yeb customTheme3 = this.getCustomTheme();
                        if (customTheme3 == null) {
                            customTheme3 = a93.s0.y(imageView3);
                        }
                        imageView3.setImageTintList(ColorStateList.valueOf(customTheme3.getIcon().j));
                        float f3 = 20;
                        imageView3.setLayoutParams(new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(f3 * vw4.d().getDisplayMetrics().density)));
                        return imageView3;
                    case 3:
                        ImageView imageView4 = new ImageView(context);
                        imageView4.setId(zud.m);
                        imageView4.setImageResource(cxc.ic_audio_call_type_24);
                        yeb customTheme4 = this.getCustomTheme();
                        if (customTheme4 == null) {
                            customTheme4 = a93.s0.y(imageView4);
                        }
                        imageView4.setImageTintList(ColorStateList.valueOf(customTheme4.getIcon().f));
                        int iD2 = kti.d(8 * vw4.d().getDisplayMetrics().density);
                        imageView4.setPadding(iD2, iD2, iD2, iD2);
                        int i32 = customTheme4.c().a.a.d;
                        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
                        shapeDrawable2.getPaint().setColor(-1);
                        imageView4.setBackground(new RippleDrawable(ColorStateList.valueOf(i32), null, shapeDrawable2));
                        float f4 = 40;
                        imageView4.setLayoutParams(new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f4), kti.d(f4 * vw4.d().getDisplayMetrics().density)));
                        return imageView4;
                    case 4:
                        uxa uxaVar = new uxa(context);
                        uxaVar.setId(zud.n);
                        uxaVar.setAvatarShape(kxa.a);
                        int i42 = this.M0;
                        uxaVar.setLayoutParams(new ViewGroup.LayoutParams(i42, i42));
                        return uxaVar;
                    case 5:
                        return v0b.a(context, this);
                    case 6:
                        TextView textView2 = new TextView(context);
                        textView2.setId(zud.s);
                        textView2.setEllipsize(TextUtils.TruncateAt.END);
                        textView2.setSingleLine();
                        textView2.setTextColor(a93.s0.y(textView2).getText().g);
                        dpg.i.b(textView2, t75.b);
                        mfh.k(textView2, false);
                        this.addView(textView2, new ViewGroup.LayoutParams(-2, kti.d(20 * vw4.d().getDisplayMetrics().density)));
                        return textView2;
                    default:
                        TextView textView22 = new TextView(context);
                        textView22.setId(zud.l);
                        textView22.setEllipsize(TextUtils.TruncateAt.END);
                        textView22.setSingleLine();
                        textView22.setTextColor(a93.s0.y(textView22).getText().g);
                        dpg.m.b(textView22, t75.b);
                        mfh.k(textView22, false);
                        this.addView(textView22, new ViewGroup.LayoutParams(-2, kti.d(20 * vw4.d().getDisplayMetrics().density)));
                        return textView22;
                }
            }
        });
        this.A0 = ipi.b(3, new fr7(22, this));
        this.B0 = new u0b(this, 0);
        this.C0 = new u0b(this, 1);
        this.D0 = new u0b(this, 2);
        this.E0 = new u0b(this, 3);
        this.F0 = new u0b(this, 4);
        this.G0 = new u0b(this, 5);
        this.H0 = new u0b(this, 6);
        this.M0 = kti.d(40 * vw4.d().getDisplayMetrics().density);
        float f = 12;
        float f2 = 4;
        setPadding(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f * vw4.d().getDisplayMetrics().density), kti.d(f2 * vw4.d().getDisplayMetrics().density));
        addView(textView, new ViewGroup.LayoutParams(-2, kti.d(20 * vw4.d().getDisplayMetrics().density)));
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
    }

    public static AppCompatCheckBox a(Context context, v0b v0bVar) {
        AppCompatCheckBox appCompatCheckBox = new AppCompatCheckBox(context, null);
        appCompatCheckBox.setId(zud.p);
        appCompatCheckBox.setPadding(0, 0, 0, 0);
        appCompatCheckBox.setButtonDrawable((Drawable) null);
        appCompatCheckBox.setBackground(v0bVar.getCheckboxDrawable());
        appCompatCheckBox.setClickable(false);
        float f = 24;
        appCompatCheckBox.setLayoutParams(new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density)));
        return appCompatCheckBox;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public static final void b(v0b v0bVar) {
        int i;
        if (dqi.r(v0bVar.d)) {
            yeb customTheme = v0bVar.getCustomTheme();
            if (customTheme == null) {
                customTheme = a93.s0.y(v0bVar);
            }
            int iOrdinal = v0bVar.getSubtitleTextColor().ordinal();
            if (iOrdinal == 0) {
                i = customTheme.getText().e;
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                i = customTheme.getText().g;
            }
            v0bVar.getSubtitleView().setTextColor(i);
        }
    }

    public static int c(s0b s0bVar) {
        int iOrdinal = s0bVar.ordinal();
        if (iOrdinal == 0) {
            return kti.d(60 * vw4.d().getDisplayMetrics().density);
        }
        if (iOrdinal == 1) {
            return kti.d(48 * vw4.d().getDisplayMetrics().density);
        }
        if (iOrdinal == 2) {
            return kti.d(80 * vw4.d().getDisplayMetrics().density);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final TextView getAliasView() {
        return (TextView) this.o.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final OneMeButton getButtonView() {
        return (OneMeButton) this.t0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final xcf getCheckboxDrawable() {
        return (xcf) this.y0.getValue();
    }

    private final ImageView getFirstTrailingIcon() {
        return (ImageView) this.v0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final ImageView getFirstTrailingImageButton() {
        return (ImageView) this.x0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final ImageView getIconInfoView() {
        return (ImageView) this.s0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final RippleDrawable getRippleDrawable() {
        return (RippleDrawable) this.A0.getValue();
    }

    private final ImageView getSecondTrailingIcon() {
        return (ImageView) this.w0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final ImageView getSecondTrailingImageButton() {
        return (ImageView) this.u0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final TextView getSubtitleView() {
        return (TextView) this.d.getValue();
    }

    public static int l(s0b s0bVar) {
        int iOrdinal = s0bVar.ordinal();
        if (iOrdinal == 0) {
            return kti.d(16 * vw4.d().getDisplayMetrics().density);
        }
        if (iOrdinal == 1) {
            return kti.d(8 * vw4.d().getDisplayMetrics().density);
        }
        if (iOrdinal == 2) {
            return kti.d(32 * vw4.d().getDisplayMetrics().density);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final int d(View view) {
        return ((((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - view.getMeasuredHeight()) / 2) + getPaddingTop();
    }

    public final boolean e(String str) {
        return (str == null || str.length() == 0 || getSubtitleView().getPaint().measureText(str) <= ((float) getSubtitleView().getMeasuredWidth())) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, k18] */
    public final void f() {
        if (dqi.r(this.t0)) {
            getButtonView().setOnClickListener(null);
            getButtonView().setVisibility(8);
        }
        if (dqi.r(this.x0)) {
            getFirstTrailingImageButton().setOnClickListener(null);
            getFirstTrailingImageButton().setVisibility(8);
        }
        if (dqi.r(this.u0)) {
            getSecondTrailingImageButton().setOnClickListener(null);
            getSecondTrailingImageButton().setVisibility(8);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final void g(long j, CharSequence charSequence, String str) {
        ?? r0 = this.b;
        uxa.n((uxa) r0.getValue(), str, Long.valueOf(j), charSequence);
        View view = this.J0;
        if (view != null) {
            removeView(view);
        }
        View view2 = (View) r0.getValue();
        if (view2 != null) {
            addView(view2);
            requestLayout();
        }
        this.J0 = view2;
    }

    public final View getAnchorButton() {
        return getButtonView();
    }

    public final r0b getCallButtonMode() {
        yy7 yy7Var = N0[3];
        return (r0b) this.E0.b;
    }

    public final s0b getCellHeight() {
        yy7 yy7Var = N0[6];
        return (s0b) this.H0.b;
    }

    public final yeb getCustomTheme() {
        yy7 yy7Var = N0[2];
        return (yeb) this.D0.b;
    }

    public final q0b getSubtitleTextColor() {
        yy7 yy7Var = N0[4];
        return (q0b) this.F0.b;
    }

    public final s0b getTrailingElementsPadding() {
        yy7 yy7Var = N0[5];
        return (s0b) this.G0.b;
    }

    public final void h(CharSequence charSequence, cm6 cm6Var) {
        OneMeButton buttonView = getButtonView();
        buttonView.setText(charSequence);
        f8j.d(buttonView, 300L, new x6(9, cm6Var));
        buttonView.setVisibility(0);
        buttonView.setMode(iza.d);
        buttonView.setAppearance(gza.a);
        buttonView.setSize(jza.b);
        View view = this.L0;
        if (view != null) {
            removeView(view);
        }
        addView(buttonView);
        requestLayout();
        this.L0 = buttonView;
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, k18] */
    public final void i(Integer num, iza izaVar, gza gzaVar, cm6 cm6Var) {
        if (num == null) {
            ?? r4 = this.t0;
            if (r4.e()) {
                ((OneMeButton) r4.getValue()).setVisibility(8);
                return;
            }
            return;
        }
        OneMeButton buttonView = getButtonView();
        yy7[] yy7VarArr = OneMeButton.A0;
        buttonView.d(num);
        f8j.d(buttonView, 300L, new x6(8, cm6Var));
        buttonView.setVisibility(0);
        buttonView.setMode(izaVar);
        buttonView.setAppearance(gzaVar);
        buttonView.setSize(jza.b);
        View view = this.L0;
        if (view != null) {
            removeView(view);
        }
        OneMeButton buttonView2 = getButtonView();
        if (buttonView2 != null) {
            addView(buttonView2);
            requestLayout();
        }
        this.L0 = buttonView2;
    }

    public final void k(LayerDrawable layerDrawable, LayerDrawable layerDrawable2, em6 em6Var) {
        ImageView firstTrailingImageButton = getFirstTrailingImageButton();
        f8j.d(firstTrailingImageButton, 300L, new o0b(0, em6Var));
        firstTrailingImageButton.setImageDrawable(layerDrawable);
        float f = 0;
        int iD = kti.d(vw4.d().getDisplayMetrics().density * f);
        firstTrailingImageButton.setPadding(iD, iD, iD, iD);
        firstTrailingImageButton.setVisibility(0);
        ImageView imageView = this.K0;
        if (imageView != null) {
            removeView(imageView);
        }
        addView(firstTrailingImageButton);
        requestLayout();
        this.K0 = firstTrailingImageButton;
        ImageView secondTrailingImageButton = getSecondTrailingImageButton();
        f8j.d(secondTrailingImageButton, 300L, new o0b(1, em6Var));
        secondTrailingImageButton.setImageDrawable(layerDrawable2);
        int iD2 = kti.d(f * vw4.d().getDisplayMetrics().density);
        secondTrailingImageButton.setPadding(iD2, iD2, iD2, iD2);
        secondTrailingImageButton.setVisibility(0);
        View view = this.L0;
        if (view != null) {
            removeView(view);
        }
        addView(secondTrailingImageButton);
        requestLayout();
        this.L0 = secondTrailingImageButton;
        m();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, k18] */
    public final void m() {
        int i;
        int i2;
        yeb customTheme = getCustomTheme();
        if (customTheme == null) {
            customTheme = a93.s0.y(this);
        }
        ?? r1 = this.x0;
        if (r1.e()) {
            ImageView imageView = (ImageView) r1.getValue();
            int iOrdinal = getCallButtonMode().ordinal();
            if (iOrdinal == 0) {
                i2 = customTheme.getIcon().f;
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = customTheme.getIcon().e;
            }
            imageView.setImageTintList(ColorStateList.valueOf(i2));
        }
        ?? r12 = this.u0;
        if (r12.e()) {
            ImageView imageView2 = (ImageView) r12.getValue();
            int iOrdinal2 = getCallButtonMode().ordinal();
            if (iOrdinal2 == 0) {
                i = customTheme.getIcon().f;
            } else {
                if (iOrdinal2 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                i = customTheme.getIcon().c;
            }
            imageView2.setImageTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        onThemeChanged(a93.s0.y(this));
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, k18] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        AppCompatCheckBox appCompatCheckBox = this.I0;
        View view = this.J0;
        int paddingLeft = getPaddingLeft();
        if (appCompatCheckBox != null && appCompatCheckBox.getVisibility() == 0) {
            cri.c(appCompatCheckBox, paddingLeft, d(appCompatCheckBox), 0, 12);
            paddingLeft = utb.j(12, vw4.d().getDisplayMetrics().density, appCompatCheckBox.getMeasuredWidth(), paddingLeft);
        }
        if (view != null && view.getVisibility() == 0) {
            cri.c(view, paddingLeft, d(view), 0, 12);
            paddingLeft = utb.j(12, vw4.d().getDisplayMetrics().density, view.getMeasuredWidth(), paddingLeft);
        }
        TextView aliasView = dqi.r(this.o) ? getAliasView() : null;
        ImageView imageView = this.K0;
        View view2 = this.L0;
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        if (view2 != null) {
            measuredWidth -= view2.getMeasuredWidth();
            cri.c(view2, measuredWidth, d(view2), 0, 12);
        }
        int iL = view2 == null ? 0 : l(getTrailingElementsPadding());
        if (imageView != null) {
            measuredWidth -= imageView.getMeasuredWidth() + iL;
            cri.c(imageView, measuredWidth, d(imageView), 0, 12);
        }
        int iD = (view2 == null || imageView == null) ? 0 : kti.d(12 * vw4.d().getDisplayMetrics().density);
        if (aliasView != null) {
            cri.c(aliasView, measuredWidth - (aliasView.getMeasuredWidth() + iD), (getMeasuredHeight() - aliasView.getMeasuredHeight()) / 2, 0, 12);
        }
        boolean zR = dqi.r(this.d);
        TextView textView = this.c;
        if (!zR) {
            cri.c(textView, paddingLeft, d(textView), 0, 12);
            return;
        }
        int measuredHeight = (((((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - textView.getMeasuredHeight()) - getSubtitleView().getMeasuredHeight()) / 2) + getPaddingTop();
        cri.c(textView, paddingLeft, measuredHeight, 0, 12);
        cri.c(getSubtitleView(), paddingLeft, textView.getMeasuredHeight() + 2 + measuredHeight, 0, 12);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, k18] */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iMax;
        int iJ;
        int iMax2;
        int iJ2;
        TextView textView = this.c;
        if (b6g.c(textView)) {
            setVerified(true);
        }
        int size = View.MeasureSpec.getMode(i) == 0 ? getContext().getResources().getDisplayMetrics().widthPixels : View.MeasureSpec.getSize(i);
        int paddingRight = size - (getPaddingRight() + getPaddingLeft());
        AppCompatCheckBox appCompatCheckBox = this.I0;
        View view = this.J0;
        if (appCompatCheckBox == null || appCompatCheckBox.getVisibility() != 0) {
            iMax = 0;
            iJ = 0;
        } else {
            measureChild(appCompatCheckBox, i, i2);
            iJ = u45.c(12, vw4.d().getDisplayMetrics().density, appCompatCheckBox.getMeasuredWidth());
            iMax = appCompatCheckBox.getMeasuredHeight();
        }
        if (view != null && view.getVisibility() == 0) {
            measureChild(view, i, i2);
            iJ = utb.j(12, vw4.d().getDisplayMetrics().density, view.getMeasuredWidth(), iJ);
            iMax = Math.max(iMax, view.getMeasuredHeight());
        }
        long jA = bhi.a(iJ, iMax);
        int i3 = (int) (jA >> 32);
        int i4 = (int) (jA & 4294967295L);
        TextView aliasView = dqi.r(this.o) ? getAliasView() : null;
        ImageView imageView = this.K0;
        View view2 = this.L0;
        if (aliasView != null) {
            measureChild(aliasView, View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
            iJ2 = u45.c(12, vw4.d().getDisplayMetrics().density, aliasView.getMeasuredWidth());
            iMax2 = aliasView.getMeasuredHeight();
        } else {
            iMax2 = 0;
            iJ2 = 0;
        }
        if (view2 != null) {
            measureChild(view2, View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 0));
            iJ2 = (imageView == null ? kti.d(12 * vw4.d().getDisplayMetrics().density) : l(getTrailingElementsPadding())) + view2.getMeasuredWidth() + iJ2;
            iMax2 = Math.max(iMax2, view2.getMeasuredHeight());
        }
        if (imageView != null) {
            measureChild(imageView, View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE));
            iJ2 = utb.j(12, vw4.d().getDisplayMetrics().density, imageView.getMeasuredWidth(), iJ2);
            iMax2 = Math.max(iMax2, imageView.getMeasuredHeight());
        }
        long jA2 = bhi.a(iJ2, iMax2);
        int i5 = paddingRight - (i3 + ((int) (jA2 >> 32)));
        int iMax3 = Math.max(i4, (int) (jA2 & 4294967295L));
        textView.measure(View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(c(getCellHeight()), Integer.MIN_VALUE));
        int measuredHeight = textView.getMeasuredHeight();
        if (dqi.r(this.d)) {
            getSubtitleView().measure(View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(c(getCellHeight()), Integer.MIN_VALUE));
            measuredHeight += getSubtitleView().getMeasuredHeight() + kti.d(2 * vw4.d().getDisplayMetrics().density);
        }
        setMeasuredDimension(size, Math.max(c(getCellHeight()), Math.max(iMax3, measuredHeight) + getPaddingBottom() + getPaddingTop()));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, k18] */
    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        yeb customTheme = getCustomTheme();
        if (customTheme == null) {
            customTheme = yebVar;
        }
        ?? r1 = this.b;
        if (r1.e()) {
            ((uxa) r1.getValue()).onThemeChanged(customTheme);
        }
        ImageView iconInfoView = getIconInfoView();
        customTheme.getIcon();
        iconInfoView.setImageTintList(ColorStateList.valueOf(-1));
        this.c.setTextColor(customTheme.getText().e);
        ?? r12 = this.d;
        if (r12.e()) {
            TextView textView = (TextView) r12.getValue();
            b(this);
            CharSequence text = textView.getText();
            Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
            Object[] spans = spanned != null ? spanned.getSpans(0, textView.getText().length(), u6g.class) : null;
            if (spans == null) {
                spans = new u6g[0];
            }
            for (Object obj : spans) {
                u6g u6gVar = (u6g) obj;
                u6gVar.onThemeChanged(yebVar);
                b6g.b(textView, u6gVar);
            }
        }
        ?? r13 = this.o;
        if (r13.e()) {
            ((TextView) r13.getValue()).setTextColor(customTheme.getText().g);
        }
        getRippleDrawable().setColor(ColorStateList.valueOf(customTheme.c().a.a.i));
        m();
        und undVar = this.z0;
        if (undVar.e()) {
            kk4.e(getCheckboxDrawable(), yebVar);
        }
        ?? r7 = this.t0;
        if (r7.e()) {
            ((OneMeButton) r7.getValue()).onThemeChanged(customTheme);
        }
        und undVar2 = this.v0;
        if (undVar2.e()) {
            ((ImageView) undVar2.getValue()).setImageTintList(ColorStateList.valueOf(customTheme.getIcon().j));
        }
        und undVar3 = this.w0;
        if (undVar3.e()) {
            ((ImageView) undVar3.getValue()).setImageTintList(ColorStateList.valueOf(customTheme.getIcon().j));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.a || isEnabled() || motionEvent.getAction() != 1) {
            return super.onTouchEvent(motionEvent);
        }
        performClick();
        return true;
    }

    @Override // android.view.View
    public void setActivated(boolean z) {
        super.setActivated(z);
        setAlpha(z ? 1.0f : 0.4f);
    }

    public final void setAlias(CharSequence charSequence) {
        if ((charSequence == null || vmf.F(charSequence)) && getAliasView().getVisibility() != 0) {
            return;
        }
        getAliasView().setText(charSequence);
        getAliasView().setVisibility(charSequence == null || vmf.F(charSequence) ? 8 : 0);
        requestLayout();
    }

    public final void setCallButtonMode(r0b r0bVar) {
        this.E0.O(this, N0[3], r0bVar);
    }

    public final void setCallButtons(em6 em6Var) {
        f8j.d(getFirstTrailingImageButton(), 300L, new o0b(2, em6Var));
        f8j.d(getSecondTrailingImageButton(), 300L, new o0b(3, em6Var));
        getFirstTrailingImageButton().setVisibility(0);
        getSecondTrailingImageButton().setVisibility(0);
        ImageView imageView = this.K0;
        if (imageView != null) {
            removeView(imageView);
        }
        ImageView firstTrailingImageButton = getFirstTrailingImageButton();
        if (firstTrailingImageButton != null) {
            addView(firstTrailingImageButton);
            requestLayout();
        }
        this.K0 = firstTrailingImageButton;
        View view = this.L0;
        if (view != null) {
            removeView(view);
        }
        ImageView secondTrailingImageButton = getSecondTrailingImageButton();
        if (secondTrailingImageButton != null) {
            addView(secondTrailingImageButton);
            requestLayout();
        }
        this.L0 = secondTrailingImageButton;
    }

    public final void setCellHeight(s0b s0bVar) {
        this.H0.O(this, N0[6], s0bVar);
    }

    public final void setCustomTheme(yeb yebVar) {
        this.D0.O(this, N0[2], yebVar);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setAlpha(z ? 1.0f : 0.4f);
    }

    public final void setFirstTrailingIcon(Integer num) {
        if (num == null) {
            und undVar = this.v0;
            if (undVar.e()) {
                undVar.reset();
                ImageView imageView = this.K0;
                if (imageView != null) {
                    removeView(imageView);
                }
                this.K0 = null;
                return;
            }
            return;
        }
        ImageView firstTrailingIcon = getFirstTrailingIcon();
        firstTrailingIcon.setImageResource(num.intValue());
        firstTrailingIcon.setVisibility(0);
        ImageView imageView2 = this.K0;
        if (imageView2 != null) {
            removeView(imageView2);
        }
        ImageView firstTrailingIcon2 = getFirstTrailingIcon();
        if (firstTrailingIcon2 != null) {
            addView(firstTrailingIcon2);
            requestLayout();
        }
        this.K0 = firstTrailingIcon2;
    }

    public final void setFirstTrailingIconClickListener(cm6 cm6Var) {
        und undVar = this.v0;
        if (undVar.e()) {
            ImageView imageView = (ImageView) undVar.getValue();
            if (cm6Var == null) {
                imageView.setOnClickListener(null);
            } else {
                f8j.d(imageView, 300L, new t0b(0, cm6Var));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, k18] */
    public final void setIconInfo(Integer num) {
        if (num == null) {
            ?? r2 = this.s0;
            if (r2.e()) {
                ((ImageView) r2.getValue()).setVisibility(8);
                return;
            }
            return;
        }
        ImageView iconInfoView = getIconInfoView();
        iconInfoView.setImageResource(num.intValue());
        iconInfoView.setVisibility(0);
        View view = this.L0;
        if (view != null) {
            removeView(view);
        }
        ImageView iconInfoView2 = getIconInfoView();
        if (iconInfoView2 != null) {
            addView(iconInfoView2);
            requestLayout();
        }
        this.L0 = iconInfoView2;
    }

    public final void setItemSelected(boolean z) {
        this.C0.O(this, N0[1], Boolean.valueOf(z));
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        setBackground(onClickListener != null ? getRippleDrawable() : null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final void setOnline(boolean z) {
        ?? r0 = this.b;
        if (r0.e()) {
            ((uxa) r0.getValue()).setOnlineBadgeVisibility(z);
        }
    }

    public final void setSecondTrailingIcon(Integer num) {
        if (num == null) {
            und undVar = this.w0;
            if (undVar.e()) {
                undVar.reset();
                View view = this.L0;
                if (view != null) {
                    removeView(view);
                }
                this.L0 = null;
                return;
            }
            return;
        }
        ImageView secondTrailingIcon = getSecondTrailingIcon();
        secondTrailingIcon.setImageResource(num.intValue());
        secondTrailingIcon.setVisibility(0);
        View view2 = this.L0;
        if (view2 != null) {
            removeView(view2);
        }
        ImageView secondTrailingIcon2 = getSecondTrailingIcon();
        if (secondTrailingIcon2 != null) {
            addView(secondTrailingIcon2);
            requestLayout();
        }
        this.L0 = secondTrailingIcon2;
    }

    public final void setSecondTrailingIconClickListener(cm6 cm6Var) {
        und undVar = this.w0;
        if (undVar.e()) {
            ImageView imageView = (ImageView) undVar.getValue();
            if (cm6Var == null) {
                imageView.setOnClickListener(null);
            } else {
                f8j.d(imageView, 300L, new t0b(1, cm6Var));
            }
        }
    }

    public final void setSelectionEnabled(boolean z) {
        this.B0.O(this, N0[0], Boolean.valueOf(z));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final void setSubtitle(CharSequence charSequence) {
        if ((charSequence == null || vmf.F(charSequence)) && !dqi.r(this.d)) {
            return;
        }
        getSubtitleView().setText(charSequence);
        getSubtitleView().setVisibility((charSequence == null || vmf.F(charSequence)) ? 8 : 0);
    }

    public final void setSubtitleTextColor(q0b q0bVar) {
        this.F0.O(this, N0[4], q0bVar);
    }

    public final void setTitle(CharSequence charSequence) {
        this.c.setText(charSequence);
    }

    public final void setTrailingElementsPadding(s0b s0bVar) {
        this.G0.O(this, N0[5], s0bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setVerified(boolean r5) {
        /*
            r4 = this;
            android.widget.TextView r0 = r4.c
            float r1 = defpackage.b6g.e(r0)
            int r1 = defpackage.kpi.r(r1)
            r2 = 0
            if (r5 == 0) goto L1a
            xzg r3 = defpackage.b6g.a(r0)
            if (r3 == 0) goto L16
            int r3 = r3.a
            goto L17
        L16:
            r3 = r2
        L17:
            if (r3 != r1) goto L1a
            return
        L1a:
            if (r5 == 0) goto L32
            xzg r5 = defpackage.b6g.a(r0)
            if (r5 == 0) goto L24
            int r2 = r5.a
        L24:
            if (r2 == r1) goto L32
            xzg r5 = new xzg
            android.content.Context r2 = r4.getContext()
            v17 r3 = defpackage.v17.z0
            r5.<init>(r2, r1, r3)
            goto L33
        L32:
            r5 = 0
        L33:
            defpackage.b6g.d(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v0b.setVerified(boolean):void");
    }

    public final void setTitle(int i) {
        this.c.setText(i);
    }
}
