package defpackage;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class cc5 implements lb5 {
    public final ac5 a;
    public final Context b;
    public final a84 c;
    public final jve d;
    public final x26 e;
    public final bwf f;
    public final ConcurrentHashMap g;

    public cc5(a84 a84Var, ac5 ac5Var, k18 k18Var, Context context) {
        this.a = ac5Var;
        this.b = context;
        this.c = a84Var;
        jve jveVarB = kve.b(0, 1, 1);
        this.d = jveVarB;
        this.e = gw0.k(new gbd(jveVarB), 100L);
        this.f = new bwf(new qn2(this, 8, k18Var));
        this.g = new ConcurrentHashMap(25);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void c(View view) {
        if (view == 0 || view.getVisibility() != 0) {
            return;
        }
        if (view instanceof hb5) {
            ((hb5) view).c();
            return;
        }
        j7f[] j7fVarArr = null;
        spans = null;
        Object[] spans = null;
        int i = 0;
        if (view instanceof RecyclerView) {
            RecyclerView recyclerView = (RecyclerView) view;
            int childCount = recyclerView.getChildCount();
            while (i < childCount) {
                View childAt = recyclerView.getChildAt(i);
                if (childAt != null) {
                    mid midVarT = recyclerView.T(childAt);
                    hb5 hb5Var = midVarT instanceof hb5 ? (hb5) midVarT : null;
                    if (hb5Var == null) {
                        c(childAt);
                    } else {
                        hb5Var.c();
                    }
                }
                i++;
            }
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount2 = viewGroup.getChildCount();
            while (i < childCount2) {
                c(viewGroup.getChildAt(i));
                i++;
            }
            return;
        }
        if (view instanceof EditText) {
            ((EditText) view).requestLayout();
            return;
        }
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            CharSequence text = textView.getText();
            if (text instanceof Spanned) {
                int length = text.length();
                try {
                    Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
                    if (spanned != null) {
                        spans = spanned.getSpans(0, length, j7f.class);
                    }
                } catch (Throwable unused) {
                }
                j7fVarArr = (j7f[]) spans;
            }
            if (j7fVarArr == null) {
                return;
            }
            int length2 = j7fVarArr.length;
            while (i < length2) {
                if (j7fVarArr[i].b() instanceof o8f) {
                    textView.invalidate();
                }
                i++;
            }
        }
    }

    @Override // defpackage.lb5
    public final x26 a() {
        return this.e;
    }

    @Override // defpackage.lb5
    public final void b(Activity activity) {
        View viewFindViewById = activity.findViewById(R.id.content);
        if (viewFindViewById == null) {
            return;
        }
        c(viewFindViewById);
    }
}
