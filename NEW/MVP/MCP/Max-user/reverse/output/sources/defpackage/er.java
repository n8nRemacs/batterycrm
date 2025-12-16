package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.RectShape;
import android.text.TextPaint;
import android.widget.ImageView;
import com.google.android.material.button.MaterialButton;
import kotlin.coroutines.Continuation;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class er extends dtf implements um6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ er(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.o = i2;
    }

    @Override // defpackage.um6
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.o) {
            case 0:
                er erVar = new er(3, (Continuation) obj3, 0);
                erVar.X = (MaterialButton) obj;
                qqg qqgVar = qqg.a;
                erVar.n(qqgVar);
                return qqgVar;
            case 1:
                er erVar2 = new er((sh0) this.X, (Continuation) obj3, 1);
                qqg qqgVar2 = qqg.a;
                erVar2.n(qqgVar2);
                return qqgVar2;
            case 2:
                er erVar3 = new er(3, (Continuation) obj3, 2);
                erVar3.X = (lx0) obj;
                qqg qqgVar3 = qqg.a;
                erVar3.n(qqgVar3);
                return qqgVar3;
            case 3:
                er erVar4 = new er(3, (Continuation) obj3, 3);
                erVar4.X = (f82) obj;
                qqg qqgVar4 = qqg.a;
                erVar4.n(qqgVar4);
                return qqgVar4;
            case 4:
                er erVar5 = new er((ug2) this.X, (Continuation) obj3, 4);
                qqg qqgVar5 = qqg.a;
                erVar5.n(qqgVar5);
                return qqgVar5;
            case 5:
                er erVar6 = new er((sq9) this.X, (Continuation) obj3, 5);
                qqg qqgVar6 = qqg.a;
                erVar6.n(qqgVar6);
                return qqgVar6;
            case 6:
                er erVar7 = new er((ja5) this.X, (Continuation) obj3, 6);
                qqg qqgVar7 = qqg.a;
                erVar7.n(qqgVar7);
                return qqgVar7;
            case 7:
                er erVar8 = new er(3, (Continuation) obj3, 7);
                erVar8.X = (EndlessRecyclerView2) obj;
                qqg qqgVar8 = qqg.a;
                erVar8.n(qqgVar8);
                return qqgVar8;
            case 8:
                er erVar9 = new er(3, (Continuation) obj3, 8);
                erVar9.X = (muc) obj;
                qqg qqgVar9 = qqg.a;
                erVar9.n(qqgVar9);
                return qqgVar9;
            case 9:
                er erVar10 = new er(3, (Continuation) obj3, 9);
                erVar10.X = (ImageView) obj;
                qqg qqgVar10 = qqg.a;
                erVar10.n(qqgVar10);
                return qqgVar10;
            case 10:
                er erVar11 = new er((urb) this.X, (Continuation) obj3, 10);
                qqg qqgVar11 = qqg.a;
                erVar11.n(qqgVar11);
                return qqgVar11;
            case 11:
                er erVar12 = new er(3, (Continuation) obj3, 11);
                erVar12.X = (p6c) obj;
                qqg qqgVar12 = qqg.a;
                erVar12.n(qqgVar12);
                return qqgVar12;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                er erVar13 = new er(3, (Continuation) obj3, 12);
                erVar13.X = (o6c) obj;
                qqg qqgVar13 = qqg.a;
                erVar13.n(qqgVar13);
                return qqgVar13;
            case 13:
                er erVar14 = new er((uid) this.X, (Continuation) obj3, 13);
                qqg qqgVar14 = qqg.a;
                erVar14.n(qqgVar14);
                return qqgVar14;
            default:
                er erVar15 = new er((o7h) this.X, (Continuation) obj3, 14);
                qqg qqgVar15 = qqg.a;
                erVar15.n(qqgVar15);
                return qqgVar15;
        }
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        qqg qqgVar = qqg.a;
        switch (i) {
            case 0:
                g8j.b(obj);
                MaterialButton materialButton = (MaterialButton) this.X;
                int[][] iArr = {new int[]{R.attr.state_checked}, new int[]{-16842912}};
                v1a v1aVar = a93.s0;
                materialButton.setTextColor(new ColorStateList(iArr, new int[]{v1aVar.y(materialButton).getText().j, v1aVar.y(materialButton).getText().g}));
                materialButton.setBackgroundTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{v1aVar.y(materialButton).b().h, v1aVar.y(materialButton).b().k}));
                materialButton.setRippleColor(ColorStateList.valueOf(v1aVar.y(materialButton).c().a.a.i));
                materialButton.setStrokeColor(ColorStateList.valueOf(v1aVar.y(materialButton).i().b.b));
                break;
            case 1:
                g8j.b(obj);
                sh0 sh0Var = (sh0) this.X;
                sh0Var.a.unregisterActivityLifecycleCallbacks(sh0Var.f);
                break;
            case 2:
                g8j.b(obj);
                lx0 lx0Var = (lx0) this.X;
                TextPaint textPaint = lx0Var.A0;
                Paint paint = lx0Var.z0;
                Paint paint2 = lx0Var.y0;
                Paint paint3 = lx0Var.w0;
                v1a v1aVar2 = a93.s0;
                v1aVar2.y(lx0Var).getText();
                textPaint.setColor(-1);
                lx0Var.B0.setColor(v1aVar2.y(lx0Var).getText().e);
                if (lx0Var.Q0) {
                    paint3.setColor(v1aVar2.y(lx0Var).a().G().b.e);
                } else {
                    paint3.setColor(v1aVar2.y(lx0Var).a().i().a.a.a);
                }
                lx0Var.x0.setColor(v1aVar2.y(lx0Var).a().G().b.m);
                if (lx0Var.Q0) {
                    paint2.setColor(v1aVar2.y(lx0Var).a().G().e.a.a.a.a);
                    paint.setColor(v1aVar2.y(lx0Var).a().G().e.a.a.b);
                    oj7 oj7Var = lx0Var.L0;
                    if (oj7Var != null) {
                        v1aVar2.y(lx0Var).d();
                        oj7Var.b = new int[]{0, -1};
                    }
                } else {
                    paint2.setColor(v1aVar2.y(lx0Var).a().i().a.a.c);
                    paint.setColor(v1aVar2.y(lx0Var).a().i().a.a.c);
                    oj7 oj7Var2 = lx0Var.L0;
                    if (oj7Var2 != null) {
                        oj7Var2.b = new int[]{0, v1aVar2.y(lx0Var).d().e.a.a};
                    }
                }
                v1aVar2.y(lx0Var).getIcon();
                lx0Var.J0 = ColorStateList.valueOf(-1);
                lx0Var.K0 = ColorStateList.valueOf(v1aVar2.y(lx0Var).getIcon().f);
                lx0Var.invalidate();
                break;
            case 3:
                g8j.b(obj);
                f82 f82Var = (f82) this.X;
                f82Var.setBackgroundColor(a93.s0.y(f82Var).a().k().a.d);
                break;
            case 4:
                g8j.b(obj);
                ug2 ug2Var = (ug2) this.X;
                ug2Var.a.f(ug2Var);
                break;
            case 5:
                g8j.b(obj);
                sq9 sq9Var = (sq9) this.X;
                sq9Var.a.f(sq9Var);
                break;
            case 6:
                g8j.b(obj);
                ja5 ja5Var = (ja5) this.X;
                int i2 = ja5.G0;
                ImageView imageView = (ImageView) ja5Var.a;
                int i3 = a93.s0.y(imageView).c().a.a.i;
                ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                shapeDrawable.getPaint().setColor(-1);
                imageView.setBackground(new RippleDrawable(ColorStateList.valueOf(i3), null, shapeDrawable));
                break;
            case 7:
                g8j.b(obj);
                EndlessRecyclerView2 endlessRecyclerView2 = (EndlessRecyclerView2) this.X;
                v1a v1aVar3 = a93.s0;
                endlessRecyclerView2.setBackgroundColor(v1aVar3.y(endlessRecyclerView2).b().n);
                a93.h(v1aVar3.x(endlessRecyclerView2.getContext()), endlessRecyclerView2);
                endlessRecyclerView2.Y();
                break;
            case 8:
                g8j.b(obj);
                muc mucVar = (muc) this.X;
                mucVar.setBackgroundColor(a93.s0.y(mucVar).a().k().a.d);
                break;
            case 9:
                g8j.b(obj);
                ImageView imageView2 = (ImageView) this.X;
                v1a v1aVar4 = a93.s0;
                imageView2.setImageTintList(ColorStateList.valueOf(v1aVar4.y(imageView2).getIcon().f));
                imageView2.setBackgroundColor(v1aVar4.y(imageView2).b().a.h);
                break;
            case 10:
                g8j.b(obj);
                urb urbVar = (urb) this.X;
                urbVar.a.unregisterActivityLifecycleCallbacks(urbVar.c);
                break;
            case 11:
                g8j.b(obj);
                p6c p6cVar = (p6c) this.X;
                int i4 = p6cVar.getCurrentTheme().c().a.a.e;
                ShapeDrawable shapeDrawable2 = new ShapeDrawable(new RectShape());
                shapeDrawable2.getPaint().setColor(p6cVar.getCurrentTheme().b().h);
                p6cVar.setBackground(new RippleDrawable(ColorStateList.valueOf(i4), shapeDrawable2, null));
                break;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                g8j.b(obj);
                o6c o6cVar = (o6c) this.X;
                a93.s0.y(o6cVar).b();
                o6cVar.setBackground(new ColorDrawable(-1728053248));
                break;
            case 13:
                g8j.b(obj);
                ((qt7) ((uid) this.X).a).cancel(null);
                break;
            default:
                g8j.b(obj);
                o7h o7hVar = (o7h) this.X;
                o7hVar.b.setTintList(ColorStateList.valueOf(o7hVar.getVolumeIconBackgroundColor()));
                o7hVar.c.setTintList(ColorStateList.valueOf(o7hVar.getVolumeIconColor()));
                break;
        }
        return qqgVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ er(Object obj, Continuation continuation, int i) {
        super(3, continuation);
        this.o = i;
        this.X = obj;
    }
}
