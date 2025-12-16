package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.util.SparseArray;

/* loaded from: classes.dex */
public final class u49 extends AsyncTask {
    public final int a;
    public final Context b;
    public final /* synthetic */ v49 c;

    public u49(v49 v49Var, int i, Context context) {
        this.c = v49Var;
        this.a = i;
        this.b = context;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        SparseArray sparseArray = v49.E0;
        int i = this.a;
        if (((Drawable.ConstantState) sparseArray.get(i)) == null) {
            return eri.a(this.b, i);
        }
        return null;
    }

    @Override // android.os.AsyncTask
    public final void onCancelled(Object obj) {
        Drawable drawable = (Drawable) obj;
        if (drawable != null) {
            v49.E0.put(this.a, drawable.getConstantState());
        }
        this.c.t0 = null;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Drawable drawableNewDrawable = (Drawable) obj;
        int i = this.a;
        v49 v49Var = this.c;
        if (drawableNewDrawable != null) {
            v49.E0.put(i, drawableNewDrawable.getConstantState());
            v49Var.t0 = null;
        } else {
            Drawable.ConstantState constantState = (Drawable.ConstantState) v49.E0.get(i);
            if (constantState != null) {
                drawableNewDrawable = constantState.newDrawable();
            }
            v49Var.t0 = null;
        }
        v49Var.setRemoteIndicatorDrawableInternal(drawableNewDrawable);
    }
}
