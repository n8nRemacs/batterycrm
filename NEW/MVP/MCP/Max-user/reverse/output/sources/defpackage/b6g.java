package defpackage;

import android.graphics.drawable.Drawable;
import android.text.DynamicLayout;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class b6g {
    public static final ArrayList a;

    static {
        List listD = ys.D(DynamicLayout.class.getDeclaredClasses());
        ArrayList arrayList = new ArrayList();
        for (Object obj : listD) {
            if (SpanWatcher.class.isAssignableFrom((Class) obj)) {
                arrayList.add(obj);
            }
        }
        a = arrayList;
    }

    public static final xzg a(TextView textView) {
        Drawable drawable = textView.getCompoundDrawablesRelative()[2];
        if (drawable instanceof xzg) {
            return (xzg) drawable;
        }
        return null;
    }

    public static final void b(TextView textView, Object obj) {
        int spanEnd;
        Object obj2;
        CharSequence text = textView.getText();
        Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
        if (spannable == null) {
            textView.invalidate();
            return;
        }
        int spanStart = spannable.getSpanStart(obj);
        if (spanStart != -1 && (spanEnd = spannable.getSpanEnd(obj)) >= spanStart) {
            CharSequence text2 = textView.getText();
            Spanned spanned = text2 instanceof Spanned ? (Spanned) text2 : null;
            int i = 0;
            Object[] spans = spanned != null ? spanned.getSpans(0, textView.getText().length(), SpanWatcher.class) : null;
            if (spans == null) {
                spans = new SpanWatcher[0];
            }
            SpanWatcher[] spanWatcherArr = (SpanWatcher[]) spans;
            if (spanWatcherArr.length == 0) {
                return;
            }
            int length = spanWatcherArr.length;
            while (i < length) {
                SpanWatcher spanWatcher = spanWatcherArr[i];
                ArrayList arrayList = a;
                if (arrayList == null || !arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (((Class) it.next()) == spanWatcher.getClass()) {
                            obj2 = obj;
                            break;
                        }
                    }
                    obj2 = obj;
                    spanWatcher.onSpanChanged(spannable, obj2, spanStart, spanEnd, spanStart, spanEnd);
                } else {
                    obj2 = obj;
                    spanWatcher.onSpanChanged(spannable, obj2, spanStart, spanEnd, spanStart, spanEnd);
                }
                i++;
                obj = obj2;
            }
        }
    }

    public static final boolean c(TextView textView) {
        int i;
        xzg xzgVarA = a(textView);
        return (xzgVarA == null || (i = xzgVarA.a) == 0 || kpi.r(e(textView)) == i) ? false : true;
    }

    public static final void d(TextView textView, xzg xzgVar) {
        int i;
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, xzgVar, (Drawable) null);
        textView.setCompoundDrawablePadding((xzgVar == null || (i = xzgVar.a) == 0) ? 0 : kti.d(xrf.d(i) * vw4.d().getDisplayMetrics().density));
    }

    public static final float e(TextView textView) {
        return textView.getPaint().getTextSize() / textView.getResources().getDisplayMetrics().density;
    }
}
