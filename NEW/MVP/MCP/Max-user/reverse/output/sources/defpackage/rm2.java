package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.ViewGroup;
import android.widget.ImageView;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.uikit.common.views.OneMeDraweeView;
import ru.ok.messages.views.widgets.SquareFrameLayout;
import ru.ok.messages.views.widgets.VideoInfoTextView;

/* loaded from: classes2.dex */
public final class rm2 extends SquareFrameLayout implements u6g {
    public final ColorDrawable a;
    public final Object b;
    public final Object c;
    public final OneMeDraweeView d;
    public final Object o;

    public rm2(Context context) {
        super(context, null);
        ColorDrawable colorDrawable = new ColorDrawable(a93.s0.y(this).b().k);
        this.a = colorDrawable;
        final int i = 0;
        this.b = ipi.b(3, new cm6(this) { // from class: qm2
            public final /* synthetic */ rm2 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i) {
                    case 0:
                        int i2 = yud.W;
                        v1a v1aVar = a93.s0;
                        rm2 rm2Var = this.b;
                        int i3 = v1aVar.y(rm2Var).getIcon().h;
                        Drawable drawableMutate = r34.b(rm2Var.getContext(), i2).mutate();
                        cei.k(drawableMutate, i3);
                        return drawableMutate;
                    default:
                        return new ColorDrawable(a93.s0.y(this.b).b().a.h);
                }
            }
        });
        final int i2 = 1;
        this.c = ipi.b(3, new cm6(this) { // from class: qm2
            public final /* synthetic */ rm2 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        int i22 = yud.W;
                        v1a v1aVar = a93.s0;
                        rm2 rm2Var = this.b;
                        int i3 = v1aVar.y(rm2Var).getIcon().h;
                        Drawable drawableMutate = r34.b(rm2Var.getContext(), i22).mutate();
                        cei.k(drawableMutate, i3);
                        return drawableMutate;
                    default:
                        return new ColorDrawable(a93.s0.y(this.b).b().a.h);
                }
            }
        });
        OneMeDraweeView oneMeDraweeView = new OneMeDraweeView(context);
        oneMeDraweeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        oneMeDraweeView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        hr6 hr6Var = new hr6(oneMeDraweeView.getResources());
        hr6Var.d = colorDrawable;
        oneMeDraweeView.setHierarchy(hr6Var.a());
        this.d = oneMeDraweeView;
        this.o = ipi.b(3, new m3(context, 27, this));
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        addView(oneMeDraweeView);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, k18] */
    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        this.a.setColor(yebVar.b().k);
        ?? r0 = this.b;
        if (r0.e()) {
            cei.k((Drawable) r0.getValue(), yebVar.getIcon().h);
        }
        ?? r3 = this.c;
        if (r3.e()) {
            ((ColorDrawable) r3.getValue()).setColor(a93.s0.y(this).b().a.h);
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.lang.Object, k18] */
    public final void setItem(wb9 wb9Var) {
        Uri uri;
        rf7 rf7VarA;
        q1g q1gVarD;
        boolean z = wb9Var.u0;
        ?? r3 = this.o;
        OneMeDraweeView oneMeDraweeView = this.d;
        if (z) {
            oneMeDraweeView.setController(null);
            ((gr6) oneMeDraweeView.getHierarchy()).i((Drawable) this.b.getValue(), 1);
            oneMeDraweeView.setBackground((Drawable) this.c.getValue());
            if (r3.e()) {
                ((VideoInfoTextView) r3.getValue()).setVisibility(8);
                return;
            }
            return;
        }
        if (wb9Var.t0 || (uri = wb9Var.d) == null) {
            rf7VarA = null;
        } else {
            sf7 sf7VarD = sf7.d(uri);
            sf7VarD.h = true;
            rf7VarA = sf7VarD.a();
        }
        Uri uri2 = wb9Var.s0;
        rf7 rf7VarA2 = uri2 != null ? sf7.d(uri2).a() : null;
        oneMeDraweeView.setBackground(null);
        oneMeDraweeView.i(rf7VarA, rf7VarA2);
        int iV = az1.v(wb9Var.o);
        if (iV == 0) {
            if (r3.e()) {
                ((VideoInfoTextView) r3.getValue()).setVisibility(8);
                return;
            }
            return;
        }
        if (iV != 1) {
            if (iV != 2) {
                throw new NoWhenBranchMatchedException();
            }
            VideoInfoTextView videoInfoTextView = (VideoInfoTextView) r3.getValue();
            videoInfoTextView.setText(videoInfoTextView.getContext().getString(mvd.C0));
            videoInfoTextView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            videoInfoTextView.setVisibility(0);
            videoInfoTextView.setVisibility(0);
            return;
        }
        VideoInfoTextView videoInfoTextView2 = (VideoInfoTextView) r3.getValue();
        Long l = wb9Var.X;
        long jLongValue = l != null ? l.longValue() : 0L;
        Context context = videoInfoTextView2.getContext();
        int i = ivd.V0;
        if (videoInfoTextView2.isInEditMode()) {
            q1gVarD = bq4.e0;
        } else {
            Context context2 = videoInfoTextView2.getContext();
            bwf bwfVar = q1g.a0;
            q1gVarD = nca.d(context2);
        }
        Drawable drawableH = cei.h(i, q1gVarD.t, context);
        videoInfoTextView2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableH, (Drawable) null, (Drawable) null, (Drawable) null);
        s9j.a(videoInfoTextView2, drawableH);
        s9j.a(videoInfoTextView2, null);
        s9j.a(videoInfoTextView2, null);
        s9j.a(videoInfoTextView2, null);
        String[] strArr = l6g.b;
        videoInfoTextView2.setText(z7i.a(jLongValue));
        videoInfoTextView2.setVisibility(0);
        videoInfoTextView2.setVisibility(0);
    }
}
