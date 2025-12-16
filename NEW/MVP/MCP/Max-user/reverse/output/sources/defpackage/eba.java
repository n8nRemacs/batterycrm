package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatTextView;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import ru.ok.messages.media.mediabar.NumericCheckButton;

/* loaded from: classes2.dex */
public final class eba extends j3 implements m7g {
    public View A0;
    public ViewGroup X;
    public FrameLayout Y;
    public AppCompatTextView Z;
    public final zg d;
    public final rw4 o;
    public ProgressBar s0;
    public AppCompatImageButton t0;
    public AppCompatImageButton u0;
    public ImageView v0;
    public ImageView w0;
    public NumericCheckButton x0;
    public FrameLayout y0;
    public ImageView z0;

    public eba(Context context, ViewStub viewStub, zg zgVar) throws Resources.NotFoundException {
        super(context);
        this.d = zgVar;
        this.o = rw4.a();
        viewStub.setLayoutResource(n1d.cl_local_media_toolbox);
        this.c = viewStub.inflate();
        i();
    }

    public static void C(ImageView imageView, boolean z, q1g q1gVar) {
        if (z) {
            imageView.setBackground(uga.d(Integer.valueOf(q1gVar.k), null, null));
            imageView.setColorFilter(q1gVar.l);
        } else {
            imageView.setBackground(q1gVar.a());
            imageView.setColorFilter(q1gVar.w);
        }
    }

    public final void A(View view, boolean z) {
        B(view, z, 1.0f);
    }

    public final void B(final View view, final boolean z, float f) {
        dhh dhhVarA = hfh.a(view);
        final int i = 0;
        Runnable runnable = new Runnable() { // from class: aba
            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        if (z) {
                            view.setVisibility(0);
                            break;
                        }
                        break;
                    default:
                        if (!z) {
                            view.setVisibility(8);
                            break;
                        }
                        break;
                }
            }
        };
        WeakReference weakReference = dhhVarA.a;
        View view2 = (View) weakReference.get();
        if (view2 != null) {
            view2.animate().withStartAction(runnable);
        }
        if (!z) {
            f = 0.0f;
        }
        dhhVarA.a(f);
        final int i2 = 1;
        Runnable runnable2 = new Runnable() { // from class: aba
            @Override // java.lang.Runnable
            public final void run() {
                switch (i2) {
                    case 0:
                        if (z) {
                            view.setVisibility(0);
                            break;
                        }
                        break;
                    default:
                        if (!z) {
                            view.setVisibility(8);
                            break;
                        }
                        break;
                }
            }
        };
        View view3 = (View) weakReference.get();
        if (view3 != null) {
            view3.animate().withEndAction(runnable2);
        }
        fs4 fs4Var = this.d.a;
        dhhVarA.c(200L);
        View view4 = (View) weakReference.get();
        if (view4 != null) {
            view4.animate().start();
        }
    }

    @Override // defpackage.m7g
    public final void b() {
        Context context = (Context) this.b;
        if (((View) this.c) == null) {
            return;
        }
        bwf bwfVar = q1g.a0;
        q1g q1gVarD = nca.d(context);
        ViewGroup viewGroup = this.X;
        int i = q1gVarD.m;
        int i2 = q1gVarD.w;
        viewGroup.setBackgroundColor(i);
        this.A0.setBackgroundColor(q1gVarD.K);
        AppCompatImageButton appCompatImageButton = this.t0;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        appCompatImageButton.setColorFilter(i2, mode);
        this.t0.setBackground(q1gVarD.a());
        this.u0.setColorFilter(i2, mode);
        this.u0.setBackground(q1gVarD.a());
        this.Z.setTextColor(i2);
        Integer numValueOf = Integer.valueOf(i2);
        rw4 rw4Var = this.o;
        this.Y.setBackground(uga.e(0, numValueOf, Integer.valueOf(rw4Var.b), rw4Var.d));
        t35.g(this.s0.getIndeterminateDrawable(), i2);
        t35.g(this.v0.getDrawable(), i2);
        t35.g(this.w0.getDrawable(), i2);
        this.v0.setBackground(q1gVarD.a());
        this.w0.setBackground(q1gVarD.a());
        t35.g(this.z0.getDrawable(), q1gVarD.k);
        this.z0.setBackground(q1gVarD.a());
        Drawable drawableMutate = r34.b(context, ivd.I).mutate();
        t35.g(drawableMutate, i2);
        this.x0.setUncheckedBackground(drawableMutate);
    }

    @Override // defpackage.j3
    public final void i() throws Resources.NotFoundException {
        this.X = (ViewGroup) ((View) this.c).findViewById(q0d.local_media_toolbox__content);
        FrameLayout frameLayout = (FrameLayout) ((View) this.c).findViewById(q0d.local_media_toolbox__quality_container);
        this.Y = frameLayout;
        final int i = 0;
        frameLayout.setOnClickListener(new zaa(this, i));
        this.Z = (AppCompatTextView) ((View) this.c).findViewById(q0d.local_media_toolbox__quality_text);
        this.s0 = (ProgressBar) ((View) this.c).findViewById(q0d.local_media_toolbox__quality_progress);
        AppCompatImageButton appCompatImageButton = (AppCompatImageButton) ((View) this.c).findViewById(q0d.local_media_toolbox__trim_btn);
        this.t0 = appCompatImageButton;
        u8j.a(appCompatImageButton, new p6(this) { // from class: cba
            public final /* synthetic */ eba b;

            {
                this.b = this;
            }

            @Override // defpackage.p6
            public final void run() {
                switch (i) {
                    case 0:
                        this.b.j(new bba(0));
                        break;
                    case 1:
                        this.b.j(new bba(2));
                        break;
                    case 2:
                        this.b.j(new dk0(28));
                        break;
                    case 3:
                        this.b.j(new bba(1));
                        break;
                    default:
                        this.b.j(new dk0(27));
                        break;
                }
            }
        });
        AppCompatImageButton appCompatImageButton2 = (AppCompatImageButton) ((View) this.c).findViewById(q0d.local_media_toolbox__mute_btn);
        this.u0 = appCompatImageButton2;
        Drawable drawable = ((View) this.c).getResources().getDrawable(ivd.N0);
        Drawable drawable2 = ((View) this.c).getResources().getDrawable(ivd.M0);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_selected}, drawable2);
        stateListDrawable.addState(new int[0], drawable);
        appCompatImageButton2.setImageDrawable(stateListDrawable);
        final int i2 = 1;
        u8j.a(this.u0, new p6(this) { // from class: cba
            public final /* synthetic */ eba b;

            {
                this.b = this;
            }

            @Override // defpackage.p6
            public final void run() {
                switch (i2) {
                    case 0:
                        this.b.j(new bba(0));
                        break;
                    case 1:
                        this.b.j(new bba(2));
                        break;
                    case 2:
                        this.b.j(new dk0(28));
                        break;
                    case 3:
                        this.b.j(new bba(1));
                        break;
                    default:
                        this.b.j(new dk0(27));
                        break;
                }
            }
        });
        this.v0 = (ImageView) ((View) this.c).findViewById(q0d.local_media_toolbox__photo_crop_btn);
        this.w0 = (ImageView) ((View) this.c).findViewById(q0d.local_media_toolbox__photo_edit_btn);
        final int i3 = 2;
        u8j.a(this.v0, new p6(this) { // from class: cba
            public final /* synthetic */ eba b;

            {
                this.b = this;
            }

            @Override // defpackage.p6
            public final void run() {
                switch (i3) {
                    case 0:
                        this.b.j(new bba(0));
                        break;
                    case 1:
                        this.b.j(new bba(2));
                        break;
                    case 2:
                        this.b.j(new dk0(28));
                        break;
                    case 3:
                        this.b.j(new bba(1));
                        break;
                    default:
                        this.b.j(new dk0(27));
                        break;
                }
            }
        });
        final int i4 = 3;
        u8j.a(this.w0, new p6(this) { // from class: cba
            public final /* synthetic */ eba b;

            {
                this.b = this;
            }

            @Override // defpackage.p6
            public final void run() {
                switch (i4) {
                    case 0:
                        this.b.j(new bba(0));
                        break;
                    case 1:
                        this.b.j(new bba(2));
                        break;
                    case 2:
                        this.b.j(new dk0(28));
                        break;
                    case 3:
                        this.b.j(new bba(1));
                        break;
                    default:
                        this.b.j(new dk0(27));
                        break;
                }
            }
        });
        this.x0 = (NumericCheckButton) ((View) this.c).findViewById(q0d.local_media_toolbox__btn_select);
        this.y0 = (FrameLayout) ((View) this.c).findViewById(q0d.local_media_toolbox__fl_select);
        ImageView imageView = (ImageView) ((View) this.c).findViewById(q0d.local_media_toolbox__btn_apply);
        this.z0 = imageView;
        final int i5 = 4;
        u8j.a(imageView, new p6(this) { // from class: cba
            public final /* synthetic */ eba b;

            {
                this.b = this;
            }

            @Override // defpackage.p6
            public final void run() {
                switch (i5) {
                    case 0:
                        this.b.j(new bba(0));
                        break;
                    case 1:
                        this.b.j(new bba(2));
                        break;
                    case 2:
                        this.b.j(new dk0(28));
                        break;
                    case 3:
                        this.b.j(new bba(1));
                        break;
                    default:
                        this.b.j(new dk0(27));
                        break;
                }
            }
        });
        this.A0 = ((View) this.c).findViewById(q0d.local_media_toolbox__separator_bottom);
        b();
        ViewGroup viewGroup = this.X;
        xu9 xu9Var = new xu9(i5, this);
        WeakHashMap weakHashMap = hfh.a;
        veh.u(viewGroup, xu9Var);
        teh.c(this.X);
    }

    public final void z(me8 me8Var) {
        AppCompatTextView appCompatTextView = this.Z;
        boolean z = me8Var.b;
        boolean z2 = me8Var.d;
        A(appCompatTextView, z);
        A(this.s0, me8Var.c);
        FrameLayout frameLayout = this.Y;
        boolean z3 = me8Var.o;
        B(frameLayout, z3, me8Var.a ? 1.0f : 0.35f);
        A(this.y0, z2);
        int i = 1;
        A(this.z0, !z2);
        A(this.t0, z3);
        boolean z4 = z3 && me8Var.y0;
        A(this.u0, z4);
        if (z4) {
            this.u0.setSelected(me8Var.x0);
        }
        A(this.v0, me8Var.Y);
        A(this.w0, me8Var.Z);
        this.Z.setText(me8Var.s0.a);
        if (me8Var.t0) {
            this.x0.setEnabled(true);
            this.x0.setNumber(me8Var.u0);
            f8j.d(this.y0, 300L, new zaa(this, i));
        } else {
            f8j.d(this.y0, 300L, new sa1(2));
            this.x0.setNumber(0);
            this.x0.setEnabled(false);
        }
        Context context = (Context) this.b;
        bwf bwfVar = q1g.a0;
        q1g q1gVarD = nca.d(context);
        C(this.v0, me8Var.v0, q1gVarD);
        C(this.w0, me8Var.w0, q1gVarD);
    }
}
