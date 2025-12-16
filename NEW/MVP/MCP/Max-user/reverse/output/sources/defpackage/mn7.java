package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.widget.ImageView;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class mn7 extends dtf implements um6 {
    public /* synthetic */ int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mn7(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.o = i2;
        switch (i2) {
            case 1:
                this.X = i;
                super(3, continuation);
                break;
            default:
                break;
        }
    }

    @Override // defpackage.um6
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.o) {
            case 0:
                int iIntValue = ((Number) obj2).intValue();
                mn7 mn7Var = new mn7(3, (Continuation) obj3, 0);
                mn7Var.Y = (String) obj;
                mn7Var.X = iIntValue;
                return mn7Var.n(qqg.a);
            default:
                mn7 mn7Var2 = new mn7(this.X, (Continuation) obj3, 1);
                mn7Var2.Y = (ImageView) obj;
                qqg qqgVar = qqg.a;
                mn7Var2.n(qqgVar);
                return qqgVar;
        }
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        boolean z = true;
        switch (this.o) {
            case 0:
                g8j.b(obj);
                String str = (String) this.Y;
                int i = this.X;
                if (str.length() != i && i != -1) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                g8j.b(obj);
                ImageView imageView = (ImageView) this.Y;
                int i2 = yud.F;
                v1a v1aVar = a93.s0;
                int i3 = v1aVar.y(imageView).getIcon().i;
                Drawable drawableMutate = r34.b(imageView.getContext(), i2).mutate();
                cei.k(drawableMutate, i3);
                ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                int i4 = this.X;
                shapeDrawable.setIntrinsicWidth(i4);
                shapeDrawable.setIntrinsicHeight(i4);
                shapeDrawable.setTint(v1aVar.y(imageView).b().a.h);
                int iD = (i4 - kti.d(16 * vw4.d().getDisplayMetrics().density)) / 2;
                int iD2 = (i4 - kti.d(12 * vw4.d().getDisplayMetrics().density)) / 2;
                LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, drawableMutate});
                layerDrawable.setLayerInset(1, iD, iD2, iD, iD2);
                imageView.setImageDrawable(layerDrawable);
                return qqg.a;
        }
    }
}
