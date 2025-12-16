package one.me.inappreview.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.a93;
import defpackage.az1;
import defpackage.bbd;
import defpackage.bwf;
import defpackage.dpg;
import defpackage.e44;
import defpackage.f8j;
import defpackage.fua;
import defpackage.gq5;
import defpackage.ho7;
import defpackage.hq5;
import defpackage.i8d;
import defpackage.jq5;
import defpackage.k5b;
import defpackage.kti;
import defpackage.l5b;
import defpackage.l5j;
import defpackage.m5b;
import defpackage.mvd;
import defpackage.n5b;
import defpackage.nd0;
import defpackage.nl;
import defpackage.nq3;
import defpackage.q9;
import defpackage.qn2;
import defpackage.t75;
import defpackage.toc;
import defpackage.tqi;
import defpackage.ut3;
import defpackage.v1a;
import defpackage.ve3;
import defpackage.vid;
import defpackage.vw4;
import defpackage.xs0;
import defpackage.yy7;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.richvector.EnhancedVectorDrawable;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/inappreview/ui/FakeInAppReviewBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "<init>", "()V", "in-app-review_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class FakeInAppReviewBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ yy7[] L0 = {new toc(FakeInAppReviewBottomSheet.class, "rateView", "getRateView()Landroidx/constraintlayout/widget/ConstraintLayout;", 0), ho7.d(vid.a, FakeInAppReviewBottomSheet.class, "thankView", "getThankView()Landroid/widget/FrameLayout;", 0)};
    public final bbd C0;
    public final bbd D0;
    public final ShapeDrawable E0;
    public final ShapeDrawable F0;
    public final ShapeDrawable G0;
    public final ShapeDrawable H0;
    public final bwf I0;
    public final gq5 J0;
    public boolean K0;

    /* JADX WARN: Multi-variable type inference failed */
    public FakeInAppReviewBottomSheet() {
        super(null, 1, 0 == true ? 1 : 0);
        this.C0 = viewBinding(l5b.a);
        this.D0 = viewBinding(l5b.h);
        float[] fArr = {vw4.d().getDisplayMetrics().density * 50.0f, vw4.d().getDisplayMetrics().density * 50.0f, vw4.d().getDisplayMetrics().density * 50.0f, vw4.d().getDisplayMetrics().density * 50.0f, vw4.d().getDisplayMetrics().density * 50.0f, vw4.d().getDisplayMetrics().density * 50.0f, vw4.d().getDisplayMetrics().density * 50.0f, vw4.d().getDisplayMetrics().density * 50.0f};
        this.E0 = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        shapeDrawable.getPaint().setStyle(Paint.Style.STROKE);
        shapeDrawable.getPaint().setStrokeWidth(vw4.d().getDisplayMetrics().density * 1.0f);
        this.F0 = shapeDrawable;
        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        shapeDrawable2.getPaint().setColor(-16611745);
        this.G0 = shapeDrawable2;
        this.H0 = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        this.I0 = new bwf(new e44(13, this));
        this.J0 = new gq5(0, this);
        this.K0 = true;
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    public final View L0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        int i;
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        ConstraintLayout constraintLayout = new ConstraintLayout(getContext());
        constraintLayout.setId(l5b.a);
        AppCompatImageView appCompatImageView = new AppCompatImageView(constraintLayout.getContext(), null);
        appCompatImageView.setId(l5b.b);
        appCompatImageView.setImageDrawable(appCompatImageView.getContext().getPackageManager().getApplicationIcon(appCompatImageView.getContext().getApplicationInfo()));
        float f = 44;
        constraintLayout.addView(appCompatImageView, kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f));
        AppCompatTextView appCompatTextView = new AppCompatTextView(constraintLayout.getContext(), null);
        appCompatTextView.setId(l5b.g);
        dpg.c.b(appCompatTextView, t75.b);
        appCompatTextView.setText(mvd.e2);
        v1a v1aVar = a93.s0;
        appCompatTextView.setTextColor(v1aVar.y(appCompatTextView).getText().e);
        constraintLayout.addView(appCompatTextView, -2, -2);
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(constraintLayout.getContext(), null);
        appCompatTextView2.setId(l5b.f);
        dpg.g.b(appCompatTextView2, t75.b);
        appCompatTextView2.setText(n5b.d);
        appCompatTextView2.setTextColor(v1aVar.y(appCompatTextView2).getText().i);
        constraintLayout.addView(appCompatTextView2, -2, -2);
        AppCompatTextView appCompatTextView3 = new AppCompatTextView(constraintLayout.getContext(), null);
        appCompatTextView3.setId(l5b.c);
        appCompatTextView3.setGravity(17);
        appCompatTextView3.setBackground(new RippleDrawable(ColorStateList.valueOf(v1aVar.y(appCompatTextView3).c().a.a.d), this.F0, this.E0));
        appCompatTextView3.setText(n5b.b);
        appCompatTextView3.setTextColor(-16611745);
        f8j.d(appCompatTextView3, 300L, new hq5(this, 0));
        constraintLayout.addView(appCompatTextView3, 0, kti.d(vw4.d().getDisplayMetrics().density * f));
        AppCompatTextView appCompatTextView4 = new AppCompatTextView(constraintLayout.getContext(), null);
        appCompatTextView4.setId(l5b.e);
        appCompatTextView4.setGravity(17);
        appCompatTextView4.setBackground(this.H0);
        appCompatTextView4.setTextColor(v1aVar.y(appCompatTextView4).getText().i);
        appCompatTextView4.setText(n5b.c);
        constraintLayout.addView(appCompatTextView4, 0, kti.d(f * vw4.d().getDisplayMetrics().density));
        Context context = constraintLayout.getContext();
        i8d i8dVar = new i8d(context);
        i8dVar.F0 = -1;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (true) {
            i = 5;
            if (i2 >= 5) {
                break;
            }
            ImageView imageView = new ImageView(context);
            imageView.setId(View.generateViewId());
            int i3 = i2 + 1;
            imageView.setContentDescription(imageView.getResources().getQuantityString(m5b.b, i3, Integer.valueOf(i3)));
            imageView.setImageDrawable(new EnhancedVectorDrawable(context, k5b.c));
            imageView.setOnClickListener(new nq3(i8dVar, i2, 2));
            tqi.c(new nd0(3, null, 8), imageView);
            float f2 = 28;
            i8dVar.addView(imageView, kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f2 * vw4.d().getDisplayMetrics().density));
            arrayList.add(imageView);
            i2 = i3;
        }
        ut3 ut3VarG = l5j.g(i8dVar);
        Iterator it = arrayList.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i5 = i;
            int i6 = i4 + 1;
            if (i4 < 0) {
                ve3.p();
                throw null;
            }
            ImageView imageView2 = (ImageView) next;
            if (i4 == 0) {
                int id = imageView2.getId();
                ut3VarG.d(id, 6, 0, 6);
                ut3VarG.d(id, 7, ((ImageView) arrayList.get(1)).getId(), 6);
                ut3VarG.g(id).d.V = 1;
            } else if (i4 == arrayList.size() - 1) {
                int id2 = imageView2.getId();
                ut3VarG.d(id2, 6, ((ImageView) arrayList.get(i4 - 1)).getId(), 7);
                ut3VarG.d(id2, 7, 0, 7);
            } else {
                int id3 = imageView2.getId();
                ut3VarG.d(id3, 6, ((ImageView) arrayList.get(i4 - 1)).getId(), 7);
                ut3VarG.d(id3, 7, ((ImageView) arrayList.get(i6)).getId(), 6);
            }
            i4 = i6;
            i = i5;
        }
        int i7 = i;
        ut3VarG.a(i8dVar);
        i8dVar.setContentDescription(i8dVar.getResources().getQuantityString(m5b.a, i7, Integer.valueOf(i8dVar.getSelected()), Integer.valueOf(i7)));
        i8dVar.setId(l5b.d);
        i8dVar.setOnSelectListener(new nl(appCompatTextView4, this, frameLayout2, 6));
        constraintLayout.addView(i8dVar, -1, -2);
        tqi.c(new jq5(this, appCompatTextView, appCompatTextView2, appCompatTextView4, i8dVar, null, 0), constraintLayout);
        ut3 ut3VarG2 = l5j.g(constraintLayout);
        int id4 = appCompatImageView.getId();
        ut3VarG2.d(id4, 3, 0, 3);
        float f3 = 24;
        az1.q(f3, vw4.d().getDisplayMetrics().density, new fua(ut3VarG2, 3, id4, 5));
        ut3VarG2.d(id4, 6, 0, 6);
        new fua(ut3VarG2, 6, id4, 5).e(kti.d(vw4.d().getDisplayMetrics().density * f3));
        int id5 = appCompatTextView.getId();
        ut3VarG2.d(id5, 3, appCompatImageView.getId(), 3);
        ut3VarG2.d(id5, 6, appCompatImageView.getId(), 7);
        fua fuaVar = new fua(ut3VarG2, 6, id5, 5);
        float f4 = 12;
        fuaVar.e(kti.d(vw4.d().getDisplayMetrics().density * f4));
        int id6 = appCompatTextView2.getId();
        ut3VarG2.d(id6, 3, appCompatTextView.getId(), 4);
        new fua(ut3VarG2, 3, id6, 5).e(kti.d(4 * vw4.d().getDisplayMetrics().density));
        ut3VarG2.d(id6, 6, appCompatImageView.getId(), 7);
        new fua(ut3VarG2, 6, id6, 5).e(kti.d(vw4.d().getDisplayMetrics().density * f4));
        int id7 = i8dVar.getId();
        ut3VarG2.d(id7, 3, appCompatTextView2.getId(), 4);
        float f5 = 40;
        az1.q(f5, vw4.d().getDisplayMetrics().density, new fua(ut3VarG2, 3, id7, 5));
        ut3VarG2.d(id7, 6, 0, 6);
        float f6 = 20;
        az1.q(f6, vw4.d().getDisplayMetrics().density, new fua(ut3VarG2, 6, id7, 5));
        ut3VarG2.d(id7, 7, 0, 7);
        new fua(ut3VarG2, 7, id7, 5).e(kti.d(f6 * vw4.d().getDisplayMetrics().density));
        int id8 = appCompatTextView3.getId();
        ut3VarG2.d(id8, 3, i8dVar.getId(), 4);
        az1.q(f5, vw4.d().getDisplayMetrics().density, new fua(ut3VarG2, 3, id8, 5));
        ut3VarG2.d(id8, 6, 0, 6);
        new fua(ut3VarG2, 6, id8, 5).e(kti.d(vw4.d().getDisplayMetrics().density * f4));
        ut3VarG2.d(id8, 7, appCompatTextView4.getId(), 6);
        float f7 = 8;
        az1.q(f7, vw4.d().getDisplayMetrics().density, new fua(ut3VarG2, 7, id8, 5));
        ut3VarG2.d(id8, 4, 0, 4);
        new fua(ut3VarG2, 4, id8, 5).e(kti.d(vw4.d().getDisplayMetrics().density * f3));
        int id9 = appCompatTextView4.getId();
        ut3VarG2.d(id9, 3, i8dVar.getId(), 4);
        new fua(ut3VarG2, 3, id9, 5).e(kti.d(f5 * vw4.d().getDisplayMetrics().density));
        ut3VarG2.d(id9, 6, appCompatTextView3.getId(), 7);
        az1.q(f7, vw4.d().getDisplayMetrics().density, new fua(ut3VarG2, 6, id9, 5));
        ut3VarG2.d(id9, 7, 0, 7);
        az1.q(f4, vw4.d().getDisplayMetrics().density, new fua(ut3VarG2, 7, id9, 5));
        ut3VarG2.d(id9, 4, 0, 4);
        new fua(ut3VarG2, 4, id9, 5).e(kti.d(f3 * vw4.d().getDisplayMetrics().density));
        ut3VarG2.a(constraintLayout);
        frameLayout2.addView(constraintLayout);
        xs0 xs0Var = new xs0(this, new qn2(frameLayout2, 14, this));
        if (getRouter() != null) {
            getRouter().a(xs0Var);
            return frameLayout2;
        }
        addLifecycleListener(new q9(this, 4, xs0Var));
        return frameLayout2;
    }
}
