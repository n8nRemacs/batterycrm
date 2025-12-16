package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.Spanned;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import one.me.sdk.uikit.common.span.FitFontImageSpan;

/* loaded from: classes2.dex */
public final class e16 implements Drawable.Callback {
    public final WeakHashMap a;
    public final WeakHashMap b = new WeakHashMap();
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final ArrayList d = new ArrayList();
    public final /* synthetic */ FitFontImageSpan o;

    public e16(FitFontImageSpan fitFontImageSpan, WeakHashMap weakHashMap) {
        this.o = fitFontImageSpan;
        this.a = weakHashMap;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        FitFontImageSpan fitFontImageSpan;
        ArrayList arrayList;
        Object[] spans;
        AtomicBoolean atomicBoolean = this.c;
        if (atomicBoolean.compareAndSet(false, true)) {
            WeakHashMap weakHashMap = this.a;
            Iterator it = weakHashMap.keySet().iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                fitFontImageSpan = this.o;
                arrayList = this.d;
                if (!zHasNext) {
                    break;
                }
                Object next = it.next();
                View view = (View) next;
                spans = null;
                Object[] spans2 = null;
                if (view instanceof TextView) {
                    TextView textView = (TextView) view;
                    ArrayList arrayList2 = b6g.a;
                    CharSequence text = textView.getText();
                    Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
                    if (spanned != null && (spans = spanned.getSpans(0, textView.length(), fitFontImageSpan.getClass())) != null) {
                        for (Object obj : spans) {
                            if (obj == fitFontImageSpan) {
                                break;
                            }
                        }
                    }
                    arrayList.add(next);
                } else if (view instanceof xta) {
                    CharSequence spannableText = ((xta) view).getSpannableText();
                    if (spannableText != null) {
                        int length = spannableText.length();
                        try {
                            Spanned spanned2 = spannableText instanceof Spanned ? (Spanned) spannableText : null;
                            if (spanned2 != null) {
                                spans2 = spanned2.getSpans(0, length, FitFontImageSpan.class);
                            }
                        } catch (Throwable unused) {
                        }
                        if (spans2 != null) {
                            for (Object obj2 : spans2) {
                                if (obj2 == fitFontImageSpan) {
                                    break;
                                }
                            }
                        }
                    }
                    arrayList.add(next);
                }
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                fitFontImageSpan.detach((View) arrayList.get(i));
            }
            arrayList.clear();
            for (View view2 : weakHashMap.keySet()) {
                if (!Looper.getMainLooper().isCurrentThread()) {
                    Handler handler = view2.getHandler();
                    if (handler != null) {
                        handler.postAtFrontOfQueue(new b16(fitFontImageSpan, view2, this, 0));
                    } else {
                        view2.post(new b16(fitFontImageSpan, view2, this, 1));
                    }
                } else if (fitFontImageSpan.shouldInvalidateSpan) {
                    mgb.a(view2, new b6i(2, view2, view2, fitFontImageSpan, this, false));
                } else {
                    view2.invalidate();
                    atomicBoolean.set(false);
                }
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        FitFontImageSpan fitFontImageSpan = this.o;
        boolean z = fitFontImageSpan.shouldInvalidateSpan;
        WeakHashMap weakHashMap = this.a;
        if (!z) {
            View view = (View) ue3.H(weakHashMap.keySet());
            if (view != null) {
                view.postDelayed(runnable, j - SystemClock.uptimeMillis());
                return;
            }
            return;
        }
        se5 se5Var = new se5(runnable, this, fitFontImageSpan, 8);
        this.b.put(runnable, se5Var);
        View view2 = (View) ue3.H(weakHashMap.keySet());
        if (view2 != null) {
            view2.postDelayed(se5Var, j - SystemClock.uptimeMillis());
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        boolean z = this.o.shouldInvalidateSpan;
        WeakHashMap weakHashMap = this.a;
        if (!z) {
            for (View view : weakHashMap.keySet()) {
                if (Looper.getMainLooper().isCurrentThread()) {
                    view.removeCallbacks(runnable);
                } else {
                    Handler handler = view.getHandler();
                    if (handler != null) {
                        handler.postAtFrontOfQueue(new c16(view, runnable, 0));
                    } else {
                        view.post(new d16(view, runnable, 0));
                    }
                }
            }
            return;
        }
        Runnable runnable2 = (Runnable) this.b.remove(runnable);
        for (View view2 : weakHashMap.keySet()) {
            if (Looper.getMainLooper().isCurrentThread()) {
                view2.removeCallbacks(runnable2);
            } else {
                Handler handler2 = view2.getHandler();
                if (handler2 != null) {
                    handler2.postAtFrontOfQueue(new c16(view2, runnable2, 1));
                } else {
                    view2.post(new d16(view2, runnable2, 1));
                }
            }
        }
    }
}
