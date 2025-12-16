package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import android.widget.FrameLayout;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* loaded from: classes2.dex */
public final class juc extends FrameLayout {
    public final int a;
    public final OneMeDraweeView b;
    public final Object c;
    public final Object d;
    public final Object o;
    public final Object s0;

    public juc(Context context) {
        super(context);
        this.a = 40;
        OneMeDraweeView oneMeDraweeView = new OneMeDraweeView(context);
        oneMeDraweeView.setOutlineProvider(new u74(vw4.d().getDisplayMetrics().density * 4.0f));
        this.b = oneMeDraweeView;
        this.c = ipi.b(3, new p1b(context, 18));
        this.d = ipi.b(3, new l3b(context, 16, this));
        final int i = 0;
        this.o = ipi.b(3, new cm6(this) { // from class: iuc
            public final /* synthetic */ juc b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                int i2 = i;
                juc jucVar = this.b;
                switch (i2) {
                    case 0:
                        float[] fArr = new float[8];
                        for (int i3 = 0; i3 < 8; i3++) {
                            fArr[i3] = vw4.d().getDisplayMetrics().density * 4.0f;
                        }
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
                        v1a v1aVar = a93.s0;
                        cei.k(shapeDrawable, v1aVar.y(jucVar).b().f);
                        int i4 = yud.e1;
                        int i5 = v1aVar.y(jucVar).getIcon().b;
                        Drawable drawableMutate = r34.b(jucVar.getContext(), i4).mutate();
                        cei.k(drawableMutate, i5);
                        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, drawableMutate});
                        int iD = kti.d(jucVar.a * vw4.d().getDisplayMetrics().density);
                        layerDrawable.setLayerSize(0, iD, iD);
                        int iD2 = kti.d(24 * vw4.d().getDisplayMetrics().density);
                        layerDrawable.setLayerSize(1, iD2, iD2);
                        int i6 = (iD / 2) - (iD2 / 2);
                        layerDrawable.setLayerInset(1, i6, i6, 0, 0);
                        return layerDrawable;
                    default:
                        float[] fArr2 = new float[8];
                        for (int i7 = 0; i7 < 8; i7++) {
                            fArr2[i7] = vw4.d().getDisplayMetrics().density * 4.0f;
                        }
                        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new RoundRectShape(fArr2, null, null));
                        v1a v1aVar2 = a93.s0;
                        cei.k(shapeDrawable2, v1aVar2.y(jucVar).a().i().a.m);
                        int i8 = yud.W;
                        int i9 = v1aVar2.y(jucVar).getIcon().j;
                        Drawable drawableMutate2 = r34.b(jucVar.getContext(), i8).mutate();
                        cei.k(drawableMutate2, i9);
                        LayerDrawable layerDrawable2 = new LayerDrawable(new Drawable[]{shapeDrawable2, drawableMutate2});
                        int iD3 = kti.d(jucVar.a * vw4.d().getDisplayMetrics().density);
                        layerDrawable2.setLayerSize(0, iD3, iD3);
                        int iD4 = kti.d(24 * vw4.d().getDisplayMetrics().density);
                        layerDrawable2.setLayerSize(1, iD4, iD4);
                        int i10 = (iD3 / 2) - (iD4 / 2);
                        layerDrawable2.setLayerInset(1, i10, i10, 0, 0);
                        return layerDrawable2;
                }
            }
        });
        final int i2 = 1;
        this.s0 = ipi.b(3, new cm6(this) { // from class: iuc
            public final /* synthetic */ juc b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                int i22 = i2;
                juc jucVar = this.b;
                switch (i22) {
                    case 0:
                        float[] fArr = new float[8];
                        for (int i3 = 0; i3 < 8; i3++) {
                            fArr[i3] = vw4.d().getDisplayMetrics().density * 4.0f;
                        }
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
                        v1a v1aVar = a93.s0;
                        cei.k(shapeDrawable, v1aVar.y(jucVar).b().f);
                        int i4 = yud.e1;
                        int i5 = v1aVar.y(jucVar).getIcon().b;
                        Drawable drawableMutate = r34.b(jucVar.getContext(), i4).mutate();
                        cei.k(drawableMutate, i5);
                        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, drawableMutate});
                        int iD = kti.d(jucVar.a * vw4.d().getDisplayMetrics().density);
                        layerDrawable.setLayerSize(0, iD, iD);
                        int iD2 = kti.d(24 * vw4.d().getDisplayMetrics().density);
                        layerDrawable.setLayerSize(1, iD2, iD2);
                        int i6 = (iD / 2) - (iD2 / 2);
                        layerDrawable.setLayerInset(1, i6, i6, 0, 0);
                        return layerDrawable;
                    default:
                        float[] fArr2 = new float[8];
                        for (int i7 = 0; i7 < 8; i7++) {
                            fArr2[i7] = vw4.d().getDisplayMetrics().density * 4.0f;
                        }
                        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new RoundRectShape(fArr2, null, null));
                        v1a v1aVar2 = a93.s0;
                        cei.k(shapeDrawable2, v1aVar2.y(jucVar).a().i().a.m);
                        int i8 = yud.W;
                        int i9 = v1aVar2.y(jucVar).getIcon().j;
                        Drawable drawableMutate2 = r34.b(jucVar.getContext(), i8).mutate();
                        cei.k(drawableMutate2, i9);
                        LayerDrawable layerDrawable2 = new LayerDrawable(new Drawable[]{shapeDrawable2, drawableMutate2});
                        int iD3 = kti.d(jucVar.a * vw4.d().getDisplayMetrics().density);
                        layerDrawable2.setLayerSize(0, iD3, iD3);
                        int iD4 = kti.d(24 * vw4.d().getDisplayMetrics().density);
                        layerDrawable2.setLayerSize(1, iD4, iD4);
                        int i10 = (iD3 / 2) - (iD4 / 2);
                        layerDrawable2.setLayerInset(1, i10, i10, 0, 0);
                        return layerDrawable2;
                }
            }
        });
        addView(oneMeDraweeView);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, k18] */
    @Override // android.view.ViewGroup
    public final void measureChildren(int i, int i2) {
        this.b.measure(i, i2);
        ?? r0 = this.d;
        if (r0.e()) {
            ((View) r0.getValue()).measure(i, i2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, k18] */
    public final void setDrawOverlay(boolean z) {
        OneMeDraweeView oneMeDraweeView = this.b;
        if (z) {
            ((gr6) oneMeDraweeView.getHierarchy()).k((Drawable) this.o.getValue());
        } else {
            ((gr6) oneMeDraweeView.getHierarchy()).k(null);
        }
    }
}
