package defpackage;

import android.text.DynamicLayout;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class jgh {
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

    public static final kgh a(TextView textView) {
        kgh kghVar = new kgh(textView);
        textView.addTextChangedListener(kghVar);
        textView.addOnAttachStateChangeListener(kghVar);
        yta ytaVar = textView instanceof yta ? (yta) textView : null;
        if (ytaVar != null) {
            ytaVar.setObserverSpanListener(kghVar);
        }
        return kghVar;
    }

    public static final void b(xta xtaVar, Object obj) {
        Object obj2;
        CharSequence spannableText = xtaVar.getSpannableText();
        Object[] spans = null;
        Spannable spannable = spannableText instanceof Spannable ? (Spannable) spannableText : null;
        if (spannable == null) {
            xtaVar.invalidate();
            return;
        }
        int spanStart = spannable.getSpanStart(obj);
        if (spanStart == -1) {
            xtaVar.invalidate();
            return;
        }
        int spanEnd = spannable.getSpanEnd(obj);
        if (spanEnd >= spanStart) {
            CharSequence spannableText2 = xtaVar.getSpannableText();
            int i = 0;
            if (spannableText2 != null) {
                int length = spannableText2.length();
                try {
                    Spanned spanned = spannableText2 instanceof Spanned ? (Spanned) spannableText2 : null;
                    if (spanned != null) {
                        spans = spanned.getSpans(0, length, SpanWatcher.class);
                    }
                } catch (Throwable unused) {
                }
                if (spans == null) {
                    spans = new SpanWatcher[0];
                }
            } else {
                spans = new SpanWatcher[0];
            }
            SpanWatcher[] spanWatcherArr = (SpanWatcher[]) spans;
            if (spanWatcherArr.length == 0) {
                xtaVar.invalidate();
                return;
            }
            int length2 = spanWatcherArr.length;
            while (i < length2) {
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
}
