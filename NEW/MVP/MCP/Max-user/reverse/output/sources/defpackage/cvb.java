package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.HashSet;
import java.util.Iterator;
import ru.ok.tamtam.photoeditor.view.BrushWidthViewImpl;
import ru.ok.tamtam.photoeditor.view.colorselector.ColorSelectorView;

/* loaded from: classes2.dex */
public final class cvb implements View.OnClickListener, nf3 {
    public static final int[] w0 = {-1, -16777216, -1226410, -160462, -144548, -9387952, -13068304, -9863937, -6092870, -3078039, -1210994, -11565, -140617, -15486, -2977978, -6724551, -12377308, -14923223, -14277082, -13224394, -11184811, -9211021, -6710887, -5066062, -3684409, -2368549, -1052689};
    public final ImageButton X;
    public final TextView Y;
    public final ImageButton Z;
    public final HashSet a = new HashSet();
    public final View b;
    public final sxg c;
    public final ImageButton d;
    public final ImageButton o;
    public final ot0 s0;
    public final AppCompatTextView t0;
    public bvb u0;
    public Toast v0;

    public cvb(View view, sxg sxgVar) {
        this.b = view;
        this.c = sxgVar;
        ImageButton imageButton = (ImageButton) view.findViewById(q0d.act_photo_editor__btn_sticker);
        this.d = imageButton;
        imageButton.setOnClickListener(this);
        ImageButton imageButton2 = (ImageButton) view.findViewById(q0d.act_photo_editor__btn_undo);
        this.o = imageButton2;
        imageButton2.setOnClickListener(this);
        ImageButton imageButton3 = (ImageButton) view.findViewById(q0d.act_photo_editor__btn_done);
        this.X = imageButton3;
        imageButton3.setOnClickListener(this);
        ImageButton imageButton4 = (ImageButton) view.findViewById(q0d.act_photo_editor__btn_close);
        imageButton4.setOnClickListener(this);
        TextView textView = (TextView) view.findViewById(q0d.act_photo_editor__btn_clear);
        this.Y = textView;
        textView.setOnClickListener(this);
        ImageButton imageButton5 = (ImageButton) view.findViewById(q0d.act_photo_editor__btn_line_width);
        this.Z = imageButton5;
        imageButton5.setOnClickListener(this);
        view.findViewById(q0d.act_photo_editor__fl_line_width).setOnClickListener(this);
        ColorSelectorView colorSelectorView = (ColorSelectorView) view.findViewById(q0d.act_photo_editor__view_color_selector);
        colorSelectorView.setColors(w0);
        colorSelectorView.setListener(this);
        ot0 ot0Var = (ot0) view.findViewById(q0d.act_photo_editor__view_brush_width);
        this.s0 = ot0Var;
        ((BrushWidthViewImpl) ot0Var).C0.add(this);
        Context context = view.getContext();
        bwf bwfVar = q1g.a0;
        q1g q1gVarD = nca.d(context);
        view.setBackgroundColor(q1gVarD.m);
        View viewFindViewById = view.findViewById(q0d.act_photo_editor__rl_buttons);
        int i = q1gVarD.H;
        viewFindViewById.setBackgroundColor(i);
        view.findViewById(q0d.act_photo_editor__rl_controls).setBackgroundColor(i);
        view.findViewById(q0d.act_photo_editor__editor).setBackgroundColor(i);
        int i2 = q1gVarD.w;
        imageButton4.setColorFilter(i2);
        imageButton4.setBackground(q1gVarD.a());
        imageButton3.setColorFilter(q1gVarD.k);
        imageButton3.setBackground(q1gVarD.a());
        imageButton2.setColorFilter(i2);
        imageButton2.setBackground(q1gVarD.a());
        textView.setTextColor(new ColorStateList(new int[][]{new int[]{-16842910}, new int[0]}, new int[]{q1gVarD.M, q1gVarD.F}));
        textView.setBackground(uga.c(0, q1gVarD.i));
        Context context2 = view.getContext();
        rw4 rw4VarA = rw4.a();
        AppCompatTextView appCompatTextView = new AppCompatTextView(context2, null);
        this.t0 = appCompatTextView;
        appCompatTextView.setBackgroundColor(Color.parseColor("#404040"));
        this.t0.setTextColor(-1);
        AppCompatTextView appCompatTextView2 = this.t0;
        int i3 = rw4VarA.k;
        appCompatTextView2.setPadding(i3, i3, i3, i3);
        Resources resources = context2.getResources();
        int i4 = ivd.j0;
        ThreadLocal threadLocal = lod.a;
        Drawable drawableA = god.a(resources, i4, null);
        drawableA.setColorFilter(-1, PorterDuff.Mode.SRC_ATOP);
        this.t0.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableA, (Drawable) null, (Drawable) null, (Drawable) null);
        this.t0.setCompoundDrawablePadding(rw4VarA.h);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        float f = rw4VarA.i;
        shapeDrawable.setShape(new RoundRectShape(new float[]{f, f, f, f, f, f, f, f}, null, null));
        shapeDrawable.setColorFilter(Color.parseColor("#404040"), PorterDuff.Mode.SRC);
        this.t0.setBackground(shapeDrawable);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.bvb r11) {
        /*
            r10 = this;
            boolean r0 = r11.b
            boolean r1 = r11.o
            boolean r2 = r11.d
            r3 = 1
            r0 = r0 ^ r3
            android.widget.ImageButton r4 = r10.o
            defpackage.yni.e(r4, r0)
            boolean r0 = r11.c
            r4 = 0
            if (r0 == 0) goto L14
            r0 = r4
            goto L15
        L14:
            r0 = 4
        L15:
            android.widget.TextView r5 = r10.Y
            r5.setVisibility(r0)
            boolean r0 = r11.X
            android.widget.ImageButton r5 = r10.X
            r5.setEnabled(r0)
            if (r0 == 0) goto L26
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L29
        L26:
            r0 = 1050253722(0x3e99999a, float:0.3)
        L29:
            r5.setAlpha(r0)
            bvb r0 = r10.u0
            r6 = 0
            android.widget.ImageButton r7 = r10.d
            if (r0 == 0) goto L47
            boolean r8 = r0.o
            if (r8 == 0) goto L3d
            boolean r8 = r0.d
            if (r8 == 0) goto L3d
            r8 = r3
            goto L3e
        L3d:
            r8 = r4
        L3e:
            if (r2 == 0) goto L44
            if (r1 == 0) goto L44
            r9 = r3
            goto L45
        L44:
            r9 = r4
        L45:
            if (r8 == r9) goto La5
        L47:
            if (r2 == 0) goto L4c
            if (r1 == 0) goto L4c
            goto L4d
        L4c:
            r3 = r4
        L4d:
            boolean r1 = r11.Y
            if (r0 == 0) goto L82
            android.widget.Toast r0 = r10.v0
            if (r0 == 0) goto L5a
            r0.cancel()
            r10.v0 = r6
        L5a:
            if (r3 == 0) goto L5f
            int r0 = defpackage.mvd.s1
            goto L61
        L5f:
            int r0 = defpackage.mvd.r1
        L61:
            androidx.appcompat.widget.AppCompatTextView r8 = r10.t0
            r8.setText(r0)
            android.widget.Toast r0 = new android.widget.Toast
            android.content.Context r8 = r7.getContext()
            r0.<init>(r8)
            r10.v0 = r0
            r8 = 17
            r0.setGravity(r8, r4, r4)
            android.widget.Toast r0 = r10.v0
            androidx.appcompat.widget.AppCompatTextView r8 = r10.t0
            r0.setView(r8)
            android.widget.Toast r0 = r10.v0
            r0.show()
        L82:
            if (r3 == 0) goto L94
            int r0 = defpackage.ivd.T
            r7.setImageResource(r0)
            if (r1 == 0) goto L8e
            int r0 = defpackage.ivd.I0
            goto L90
        L8e:
            int r0 = defpackage.ivd.t0
        L90:
            r5.setImageResource(r0)
            goto La5
        L94:
            r7.setBackgroundColor(r4)
            r0 = -1
            r7.setColorFilter(r0)
            int r0 = defpackage.ivd.S
            r7.setImageResource(r0)
            int r0 = defpackage.ivd.H
            r5.setImageResource(r0)
        La5:
            bvb r0 = r10.u0
            if (r0 == 0) goto Lad
            boolean r0 = r0.d
            if (r0 == r2) goto Lbb
        Lad:
            if (r2 == 0) goto Lb0
            goto Lb2
        Lb0:
            r4 = 8
        Lb2:
            r7.setVisibility(r4)
            if (r2 == 0) goto Lb8
            r6 = r10
        Lb8:
            r7.setOnClickListener(r6)
        Lbb:
            r10.u0 = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvb.a(bvb):void");
    }

    public final void b(ju3 ju3Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ju3Var.accept((yub) it.next());
        }
    }

    public final void c(int i) {
        float[] fArr = new float[3];
        ThreadLocal threadLocal = rf3.a;
        rf3.a(Color.red(i), Color.green(i), Color.blue(i), fArr);
        int i2 = fArr[2] < 0.9f ? -1 : -16777216;
        ImageButton imageButton = this.Z;
        imageButton.setColorFilter(i2);
        imageButton.setBackground(uga.d(Integer.valueOf(i), null, null));
        this.s0.setPreviewColor(i);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((yub) it.next()).b.f = i;
        }
        this.c.g(i, "app.editor.color");
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        if (id == q0d.act_photo_editor__btn_undo) {
            b(new bba(9));
            return;
        }
        if (id == q0d.act_photo_editor__btn_close) {
            b(new bba(10));
            return;
        }
        if (id == q0d.act_photo_editor__btn_done) {
            b(new bba(11));
            return;
        }
        if (id == q0d.act_photo_editor__btn_clear) {
            b(new bba(12));
            return;
        }
        if (id == q0d.act_photo_editor__btn_line_width) {
            BrushWidthViewImpl brushWidthViewImpl = (BrushWidthViewImpl) this.s0;
            brushWidthViewImpl.setVisibility(brushWidthViewImpl.getVisibility() == 0 ? 8 : 0);
        } else if (id == q0d.act_photo_editor__btn_sticker) {
            b(new bba(13));
        }
    }
}
