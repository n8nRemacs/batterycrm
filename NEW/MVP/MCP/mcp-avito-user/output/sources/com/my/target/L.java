package com.my.target;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.my.target.InterfaceC37815v;
import com.my.target.Q0;
import e11.C39854b0;
import e11.C39872h0;
import e11.C39875i0;
import e11.C39884l0;
import e11.C39892o;
import e11.C39899q0;
import e11.C39922y0;
import e11.C39924z;
import e11.E1;
import e11.b2;
import i11.C41211a;
import java.util.HashMap;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes7.dex */
public class L extends RelativeLayout implements InterfaceC37806q {

    /* renamed from: v, reason: collision with root package name */
    public static final int f364431v;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final a f364432b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public final C39922y0 f364433c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    public final C39854b0 f364434d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    public final Y f364435e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    public final b2 f364436f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    public final e11.r f364437g;

    /* renamed from: h, reason: collision with root package name */
    @j.N
    public final C39899q0 f364438h;

    /* renamed from: i, reason: collision with root package name */
    @j.N
    public final C39924z f364439i;

    /* renamed from: j, reason: collision with root package name */
    @j.N
    public final e11.r f364440j;

    /* renamed from: k, reason: collision with root package name */
    @j.N
    public final C39875i0 f364441k;

    /* renamed from: l, reason: collision with root package name */
    @j.P
    public final Bitmap f364442l;

    /* renamed from: m, reason: collision with root package name */
    @j.P
    public final Bitmap f364443m;

    /* renamed from: n, reason: collision with root package name */
    public final int f364444n;

    /* renamed from: o, reason: collision with root package name */
    public final int f364445o;

    /* renamed from: p, reason: collision with root package name */
    public final int f364446p;

    /* renamed from: q, reason: collision with root package name */
    public final int f364447q;

    /* renamed from: r, reason: collision with root package name */
    public final int f364448r;

    /* renamed from: s, reason: collision with root package name */
    @j.P
    public InterfaceC37815v.a f364449s;

    /* renamed from: t, reason: collision with root package name */
    public float f364450t;

    /* renamed from: u, reason: collision with root package name */
    @j.P
    public Q0.a f364451u;

    public final class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            InterfaceC37815v.a aVar;
            if (!view.isEnabled() || (aVar = L.this.f364449s) == null) {
                return;
            }
            aVar.e();
        }
    }

    static {
        int i12 = C39924z.f394913b;
        f364431v = View.generateViewId();
    }

    public L(@j.N Context context, @j.N C39872h0 c39872h0) {
        super(context);
        boolean z12 = (getContext().getResources().getConfiguration().screenLayout & 15) >= 3;
        C39924z c39924z = new C39924z(context);
        this.f364439i = c39924z;
        C39922y0 c39922y0 = new C39922y0(context);
        this.f364433c = c39922y0;
        Context context2 = c39872h0.f394605b;
        C39854b0 c39854b0 = new C39854b0(context2, c39924z, z12);
        this.f364434d = c39854b0;
        Y y12 = new Y(context2, c39924z, z12, c39872h0.f394606c);
        this.f364435e = y12;
        int i12 = f364431v;
        y12.setId(i12);
        e11.r rVar = new e11.r(context);
        this.f364437g = rVar;
        C39899q0 c39899q0 = new C39899q0(context);
        this.f364438h = c39899q0;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(3, i12);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(14, -1);
        b2 b2Var = new b2(context, c39924z);
        this.f364436f = b2Var;
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.addRule(12, -1);
        b2Var.setLayoutParams(layoutParams3);
        e11.r rVar2 = new e11.r(context);
        this.f364440j = rVar2;
        this.f364442l = e11.C0.a(320, "iVBORw0KGgoAAAANSUhEUgAAADgAAAA4CAMAAACfWMssAAAAdVBMVEUAAAAAAAAgICDf398QEBDv7+/Pz8+fn58gICAQEBDe3t5AQEBwcHDv7+9/f3/f398wMDCAgIBgYGCQkJDAwMC/v7/Pz8+fn59QUFBAQECvr69QUFCPj4+/v79wcHBvb29gYGBfX1++vr6urq6Ojo5hYWH///+8blWlAAAAJnRSTlOAAJDviPfnzyAQ3qC478DfmICvx9/fz59QQK+oj79wb2Bfvq6OsPCmZBAAAAJhSURBVEjHndbXYuIwEAXQiSQXueAGtmkhJNn7/5+4I8JmbJAWw33iQYex7FGhN0/s9jT0FTjVcXfavvlC92o8lpil3J0fQ9s4FXdtrYij8qKLXeUhDUFhm8LQLKp1tknDcKyY5eRJnQDZOQDtwcOkrAa+rQ+mPaKC/pMiQpbew7SCVgEiRUWSuNjQg5hYJP26hBYkYTmFluvRosTo7QQeoM0yaDS+BX4gUrQwKsJ4hW6CRfBF6ruvgsxeYROcYB4BdJs1mh+YAoEHXQEemKO0FzgEvoRJAKbkL8mwQh3okygnhv6SxK80DkxPKxI4Lzky3KH1Ty8x9AM14mQ/f7GfDEso//SIfiEwWwEGpaUtYhke4Ro3vX+QU//hCdfTxtvSOzrpYIkigS6mm3ZXh3faSddEN8PlUTet+9vNL2wx0BH5ZFAAuhmbSEbW6KmCegTJFGC0kkZRyGRMEHIYbXi0ngxdCA0i9/sViNdggQ3ViCdDl72cFdBSO385PeqFn0NjL+vjkwa0DxsgcidDBz3p8t3ilktuWi7U5Ho/hWoV3TW5LWGWLKuN1COFktfjEcXDhayT2fHXYsdwxJo82evw1hHjzNCWyAObld57YY3ssss1WD+3PSYYHJSSCzdkBaQOSknfRD1QX48ALpk9eeikF8gZnzvmzi8erIfpUd4vP8ozO7s8ZK9dHpx8+roi8skLksjHV7I+DV0C42DRfA0cbODa+ZEBSR1i2Ri+6KYNuGp7U9YUzMpGygmc0CFztivyi1Z128UQ5oPywF+3l/njKEygL9vT12cGTtUPp631DfkLyeFPR/ZOiKIAAAAASUVORK5CYII=");
        this.f364443m = e11.C0.a(320, "iVBORw0KGgoAAAANSUhEUgAAADgAAAA4CAMAAACfWMssAAAAclBMVEUAAAAAAAAgICDf39+goKAgICAQEBDe3t7Pz88QEBDv7+9wcHBAQEDf39+AgIDv7+/AwMCQkJDPz8+/v7+vr69gYGCfn5+Pj49fX19QUFBAQEAwMDBQUFDu7u5/f39/f39wcHBvb2+/v78wMDCvr6////9R0hTPAAAAJXRSTlOAAJDvzyAQ3ueI97ig34Dv38fPv6+vn49fUECYqO7Av3Bv35fYiozA+AAAAjJJREFUSMe91um2mjAUBeBDGMOkjDJoe63d7/+KTbyxpzZJgXat7j8i8nkICUkocCRZ7mNbQaXq+vsSuEK2mrsT3nLqp22Y1FplzbAKUhFl0WS68hj7ILNvhaS3iEHbOvbDuVKsJEfWCEgnD0wuzOyIELgkLhi3yAv6Q4ocaWzDuEIoPISLsiR2maSNyIwl/XQR7Uj0lAwTVY92JUOb/AIvCOU+KENcGE7IBe2MyDEbqBtYeB9kaPUK0sTA2tvAMgesk2fUnzAGhNt9ARywxC15wtHTEzICvhpoldSwwuoZJ3lJBlolFZyQeZoXCjLQKjkr2GNwNy+S5IEFOgVPEO7mEfmgVPdKCzK+PIeJbp4fUoaFPtDwCOYIYihfXx5k0uCDeh41+dvlfBSGwvzx1ZwdMFKHki9yH0VQ0nx8ZkVLFcQGNIQdkUCqf9mEGrHTAXZBLdn9Fxgh/P4mgb9/OC3WLdhY3VGioxHD8QFQoN8z5IR89TvxkPMN8vC6NciTE+TR10rgFlDQoTj6Ig/oFZxxJkeuoX/qyDApqO61dEmh5NUJV6TPWa7G+dj0GGHUkEvunJAFEGvIJZ0NtWFolgBVMj246MQGBvOxZW7694U1SNr9S3mavG0e0uObh5c8vF1heXCDxHJ7S9bGvk1g5i1anq1NIGdKgejhY+ns3+jGNYBs+K2sLBQ71UnggEzHVNumKJ9aPIYmAzMH5Ez9DRytupkZQ1eWe9+l2lTteF+UsvMDBKFIvMRHIr8AAAAASUVORK5CYII=");
        this.f364432b = new a();
        this.f364444n = c39924z.a(64);
        this.f364445o = c39924z.a(20);
        C39875i0 c39875i0 = new C39875i0(context);
        this.f364441k = c39875i0;
        float f12 = 28;
        int iA2 = c39924z.a(f12);
        this.f364448r = iA2;
        c39875i0.setFixedHeight(iA2);
        C39924z.m(c39922y0, "icon_image");
        C39924z.m(rVar2, "sound_button");
        C39924z.m(c39854b0, "vertical_view");
        C39924z.m(y12, "media_view");
        C39924z.m(b2Var, "panel_view");
        C39924z.m(rVar, "close_button");
        C39924z.m(c39899q0, "progress_wheel");
        addView(b2Var, 0);
        addView(c39922y0, 0);
        addView(c39854b0, 0, layoutParams);
        addView(y12, 0, layoutParams2);
        addView(rVar2);
        addView(c39875i0);
        addView(rVar);
        addView(c39899q0);
        this.f364446p = c39924z.a(f12);
        this.f364447q = c39924z.a(10);
    }

    @Override // com.my.target.InterfaceC37806q
    public final void a() {
        View[] viewArr = {this.f364440j};
        b2 b2Var = this.f364436f;
        if (b2Var.getVisibility() == 0) {
            b2Var.a(300, viewArr);
        }
        Y y12 = this.f364435e;
        y12.f364642d.setVisibility(8);
        P0 p02 = y12.f364649k;
        if (p02 == null || y12.f364650l == null) {
            return;
        }
        p02.a();
        y12.f364640b.setVisibility(8);
    }

    @Override // com.my.target.InterfaceC37806q
    public final void b() {
        this.f364436f.b(this.f364440j);
        this.f364435e.h();
    }

    @Override // com.my.target.InterfaceC37806q
    public final void c() {
        Y y12 = this.f364435e;
        y12.f364640b.setVisibility(8);
        y12.f364646h.setVisibility(8);
    }

    @Override // com.my.target.InterfaceC37815v
    public final void d() {
        this.f364437g.setVisibility(0);
    }

    @Override // com.my.target.InterfaceC37806q
    public final void destroy() {
        Y y12 = this.f364435e;
        P0 p02 = y12.f364649k;
        if (p02 != null) {
            p02.destroy();
        }
        y12.f364649k = null;
    }

    @Override // com.my.target.InterfaceC37806q
    public final boolean f() {
        return this.f364435e.g();
    }

    @Override // com.my.target.InterfaceC37815v
    @j.N
    public View getCloseButton() {
        return this.f364437g;
    }

    @Override // com.my.target.InterfaceC37806q
    @j.N
    public Y getPromoMediaView() {
        return this.f364435e;
    }

    @Override // com.my.target.InterfaceC37806q
    public final boolean i() {
        return this.f364435e.f();
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        e11.r rVar = this.f364437g;
        rVar.layout(i14 - rVar.getMeasuredWidth(), 0, i14, rVar.getMeasuredHeight());
        C39899q0 c39899q0 = this.f364438h;
        int measuredWidth = c39899q0.getMeasuredWidth();
        int i16 = this.f364447q;
        c39899q0.layout(i16, i16, measuredWidth + i16, c39899q0.getMeasuredHeight() + i16);
        C39875i0 c39875i0 = this.f364441k;
        C39924z.h(c39875i0, rVar.getLeft() - c39875i0.getMeasuredWidth(), rVar.getTop(), rVar.getLeft(), rVar.getBottom());
        C39922y0 c39922y0 = this.f364433c;
        C39854b0 c39854b0 = this.f364434d;
        b2 b2Var = this.f364436f;
        e11.r rVar2 = this.f364440j;
        Y y12 = this.f364435e;
        if (i15 > i14) {
            if (rVar2.getTranslationY() > 0.0f) {
                rVar2.setTranslationY(0.0f);
            }
            setBackgroundColor(-1);
            int measuredWidth2 = (i14 - y12.getMeasuredWidth()) / 2;
            y12.layout(measuredWidth2, 0, y12.getMeasuredWidth() + measuredWidth2, y12.getMeasuredHeight());
            c39854b0.layout(0, y12.getBottom(), i14, i15);
            int measuredHeight = y12.getMeasuredHeight();
            int i17 = this.f364445o;
            int bottom = measuredHeight != 0 ? y12.getBottom() - (c39922y0.getMeasuredHeight() / 2) : i17;
            c39922y0.layout(i17, bottom, c39922y0.getMeasuredWidth() + i17, c39922y0.getMeasuredHeight() + bottom);
            b2Var.layout(0, 0, 0, 0);
            rVar2.layout(i14 - rVar2.getMeasuredWidth(), y12.getBottom() - rVar2.getMeasuredHeight(), i14, y12.getBottom());
            return;
        }
        setBackgroundColor(-16777216);
        int measuredWidth3 = (i14 - y12.getMeasuredWidth()) / 2;
        int measuredHeight2 = (i15 - y12.getMeasuredHeight()) / 2;
        y12.layout(measuredWidth3, measuredHeight2, y12.getMeasuredWidth() + measuredWidth3, y12.getMeasuredHeight() + measuredHeight2);
        c39922y0.layout(0, 0, 0, 0);
        c39854b0.layout(0, 0, 0, 0);
        b2Var.layout(0, i15 - b2Var.getMeasuredHeight(), i14, i15);
        rVar2.layout(i14 - rVar2.getMeasuredWidth(), b2Var.getTop() - rVar2.getMeasuredHeight(), i14, b2Var.getTop());
        if (y12.g()) {
            View[] viewArr = {rVar2};
            if (b2Var.getVisibility() == 0) {
                b2Var.a(0, viewArr);
            }
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i12, int i13) {
        this.f364440j.measure(i12, i13);
        this.f364437g.measure(i12, i13);
        int i14 = this.f364446p;
        this.f364438h.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), View.MeasureSpec.makeMeasureSpec(i14, 1073741824));
        int size = View.MeasureSpec.getSize(i12);
        int size2 = View.MeasureSpec.getSize(i13);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, BeduinInputModel.MIN_TEXT_VERSION);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2, BeduinInputModel.MIN_TEXT_VERSION);
        C39875i0 c39875i0 = this.f364441k;
        int i15 = this.f364448r;
        C39924z.f(i15, i15, 1073741824, c39875i0);
        b2 b2Var = this.f364436f;
        Y y12 = this.f364435e;
        if (size2 > size) {
            y12.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            this.f364434d.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2 - y12.getMeasuredHeight(), BeduinInputModel.MIN_TEXT_VERSION));
            this.f364433c.measure(View.MeasureSpec.makeMeasureSpec(this.f364444n, BeduinInputModel.MIN_TEXT_VERSION), iMakeMeasureSpec2);
            b2Var.setVisibility(8);
        } else {
            b2Var.setVisibility(0);
            y12.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            b2Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), iMakeMeasureSpec2);
        }
        setMeasuredDimension(i12, i13);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x006b, code lost:
    
        r11 = r10.f394306c;
        r10 = r10.f394305b;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0572  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x05ae  */
    @Override // com.my.target.InterfaceC37815v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setBanner(@j.N e11.C39884l0 r29) {
        /*
            Method dump skipped, instructions count: 1529
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.target.L.setBanner(e11.l0):void");
    }

    @Override // com.my.target.InterfaceC37815v
    public void setClickArea(@j.N E1 e12) {
        boolean z12;
        View.OnClickListener onClickListener;
        boolean z13;
        View.OnClickListener onClickListener2;
        int i12 = e12.f394346o;
        C39922y0 c39922y0 = this.f364433c;
        View.OnClickListener onClickListener3 = this.f364432b;
        boolean z14 = e12.f394334c;
        boolean z15 = e12.f394344m;
        c39922y0.setOnClickListener((z14 || z15) ? onClickListener3 : null);
        Y y12 = this.f364435e;
        y12.getImageView().setOnClickListener((z15 || e12.f394335d) ? onClickListener3 : null);
        if (z15 || e12.f394345n) {
            y12.getClickableLayout().setOnClickListener(onClickListener3);
        } else {
            y12.getClickableLayout().setOnClickListener(y12.f364643e);
        }
        C39854b0 c39854b0 = this.f364434d;
        e11.M m12 = c39854b0.f394530b;
        m12.getClass();
        boolean z16 = e12.f394343l;
        boolean z17 = e12.f394337f;
        boolean z18 = e12.f394336e;
        boolean z19 = e12.f394333b;
        boolean z22 = e12.f394341j;
        boolean z23 = e12.f394332a;
        if (z15) {
            m12.setOnClickListener(onClickListener3);
            C39924z.g(m12, -1, -3806472);
            onClickListener = onClickListener3;
            z12 = z14;
            z13 = z15;
        } else {
            m12.f394416n = onClickListener3;
            View view = m12.f394404b;
            view.setOnTouchListener(m12);
            View view2 = m12.f394405c;
            view2.setOnTouchListener(m12);
            View view3 = m12.f394406d;
            view3.setOnTouchListener(m12);
            z12 = z14;
            View view4 = m12.f394410h;
            view4.setOnTouchListener(m12);
            View view5 = m12.f394411i;
            view5.setOnTouchListener(m12);
            m12.setOnTouchListener(m12);
            onClickListener = onClickListener3;
            HashMap<View, Boolean> map = m12.f394414l;
            z13 = z15;
            map.put(view, Boolean.valueOf(z23));
            map.put(view2, "store".equals(m12.f394415m) ? Boolean.valueOf(e12.f394342k) : Boolean.valueOf(z22));
            map.put(view3, Boolean.valueOf(z19));
            map.put(view4, Boolean.valueOf(z18));
            map.put(view5, Boolean.valueOf(z17));
            map.put(m12, Boolean.valueOf(z16));
        }
        Button button = c39854b0.f394531c;
        boolean z24 = e12.f394338g;
        View.OnClickListener onClickListener4 = onClickListener;
        if (z13) {
            button.setOnClickListener(onClickListener4);
        } else {
            if (z24) {
                button.setOnClickListener(onClickListener4);
                button.setEnabled(true);
            } else {
                button.setOnClickListener(null);
                button.setEnabled(false);
            }
            c39854b0.f394532d.setOnTouchListener(new com.avito.android.lib.design.map.a(c39854b0, e12, onClickListener4, 2));
        }
        b2 b2Var = this.f364436f;
        b2Var.getClass();
        Button button2 = b2Var.f394547i;
        if (z13) {
            b2Var.setOnClickListener(onClickListener4);
            button2.setOnClickListener(onClickListener4);
            return;
        }
        if (z24) {
            button2.setOnClickListener(onClickListener4);
        } else {
            button2.setEnabled(false);
        }
        if (z16) {
            b2Var.setOnClickListener(onClickListener4);
            onClickListener2 = null;
        } else {
            onClickListener2 = null;
            b2Var.setOnClickListener(null);
        }
        C39892o c39892o = b2Var.f394541c;
        TextView leftText = c39892o.getLeftText();
        if (z23) {
            leftText.setOnClickListener(onClickListener4);
        } else {
            leftText.setOnClickListener(onClickListener2);
        }
        if (e12.f394339h) {
            c39892o.getRightBorderedView().setOnClickListener(onClickListener4);
        } else {
            c39892o.getRightBorderedView().setOnClickListener(onClickListener2);
        }
        C39922y0 c39922y02 = b2Var.f394548j;
        if (z12) {
            c39922y02.setOnClickListener(onClickListener4);
        } else {
            c39922y02.setOnClickListener(onClickListener2);
        }
        TextView textView = b2Var.f394540b;
        if (z19) {
            textView.setOnClickListener(onClickListener4);
        } else {
            textView.setOnClickListener(onClickListener2);
        }
        C41211a c41211a = b2Var.f394544f;
        if (z18) {
            c41211a.setOnClickListener(onClickListener4);
        } else {
            c41211a.setOnClickListener(onClickListener2);
        }
        TextView textView2 = b2Var.f394545g;
        if (z17) {
            textView2.setOnClickListener(onClickListener4);
        } else {
            textView2.setOnClickListener(onClickListener2);
        }
        TextView textView3 = b2Var.f394546h;
        if (z22) {
            textView3.setOnClickListener(onClickListener4);
        } else {
            textView3.setOnClickListener(onClickListener2);
        }
    }

    @Override // com.my.target.InterfaceC37815v
    public void setInterstitialPromoViewListener(@j.P InterfaceC37815v.a aVar) {
        this.f364449s = aVar;
    }

    @Override // com.my.target.InterfaceC37806q
    public void setMediaListener(Q0.a aVar) {
        this.f364451u = aVar;
        Y y12 = this.f364435e;
        y12.setInterstitialPromoViewListener(aVar);
        y12.f364642d.setOnClickListener(y12.f364643e);
    }

    @Override // com.my.target.InterfaceC37806q
    public void setTimeChanged(float f12) {
        C39899q0 c39899q0 = this.f364438h;
        c39899q0.setVisibility(0);
        float f13 = this.f364450t;
        if (f13 > 0.0f) {
            c39899q0.setProgress(f12 / f13);
        }
        c39899q0.setDigit((int) ((this.f364450t - f12) + 1.0f));
    }

    @Override // com.my.target.InterfaceC37806q
    public final void b(boolean z12) {
        String str;
        e11.r rVar = this.f364440j;
        if (z12) {
            rVar.a(this.f364443m, false);
            str = "sound_off";
        } else {
            rVar.a(this.f364442l, false);
            str = "sound_on";
        }
        rVar.setContentDescription(str);
    }

    @Override // com.my.target.InterfaceC37806q
    public final void c(boolean z12) {
        View[] viewArr = {this.f364440j};
        b2 b2Var = this.f364436f;
        if (b2Var.getVisibility() == 0) {
            b2Var.a(300, viewArr);
        }
        this.f364435e.b(z12);
    }

    @Override // com.my.target.InterfaceC37806q
    public final void a(int i12) {
        P0 p02 = this.f364435e.f364649k;
        if (p02 != null) {
            if (i12 == 0) {
                p02.r();
            } else if (i12 != 1) {
                p02.m();
            } else {
                p02.o();
            }
        }
    }

    @Override // com.my.target.InterfaceC37806q
    public final void a(@j.N C39884l0 c39884l0) {
        this.f364440j.setVisibility(8);
        this.f364437g.setVisibility(0);
        a(false);
        Y y12 = this.f364435e;
        P0 p02 = y12.f364649k;
        if (p02 != null) {
            p02.destroy();
        }
        y12.f364649k = null;
        y12.a(c39884l0);
    }

    @Override // com.my.target.InterfaceC37806q
    public final void a(boolean z12) {
        this.f364438h.setVisibility(8);
        this.f364436f.b(this.f364440j);
        this.f364435e.d(z12);
    }

    @Override // com.my.target.InterfaceC37806q
    public final void e() {
    }

    @Override // com.my.target.InterfaceC37815v
    @j.N
    public View getView() {
        return this;
    }
}
