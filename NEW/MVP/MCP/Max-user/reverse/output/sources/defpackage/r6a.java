package defpackage;

import android.R;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import one.me.sdk.richvector.EnhancedVectorDrawable;

/* loaded from: classes2.dex */
public final /* synthetic */ class r6a implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ u6a b;

    public /* synthetic */ r6a(u6a u6aVar, int i) {
        this.a = i;
        this.b = u6aVar;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.c.a();
                return qqg.a;
            default:
                Context context = this.b.a.getContext();
                EnhancedVectorDrawable enhancedVectorDrawable = new EnhancedVectorDrawable(context, y9b.m);
                v1a v1aVar = a93.s0;
                z18.e(enhancedVectorDrawable, "circle_background", ctd.f(v1aVar, context).k);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(1);
                float f = 24;
                gradientDrawable.setSize(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density));
                gradientDrawable.setColor(v1aVar.x(context).k().b().f);
                gradientDrawable.setStroke(kti.d(2 * vw4.d().getDisplayMetrics().density), v1aVar.x(context).k().i().c);
                StateListDrawable stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(new int[]{R.attr.state_checked}, enhancedVectorDrawable);
                stateListDrawable.addState(new int[]{-16842912}, gradientDrawable);
                return stateListDrawable;
        }
    }
}
