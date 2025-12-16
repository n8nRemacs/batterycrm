package defpackage;

import android.app.Notification;
import android.content.Intent;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.biometric.BiometricFragment;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes.dex */
public final class hp implements Runnable {
    public final /* synthetic */ int a;
    public final int b;
    public final Object c;
    public final Object d;

    public /* synthetic */ hp(Object obj, int i, Object obj2, int i2) {
        this.a = i2;
        this.d = obj;
        this.b = i;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tu1 tu1Var;
        ArrayList arrayList;
        int iDecrementAndGet;
        int i = this.a;
        int i2 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((TextView) obj2).setTypeface((Typeface) obj, i2);
                return;
            case 1:
                ((BiometricFragment) obj).y0(i2, (CharSequence) obj2);
                return;
            case 2:
                int i3 = BottomSheetBehavior.f0;
                ((BottomSheetBehavior) obj).N(i2, (View) obj2, false);
                return;
            case 3:
                ArrayList arrayList2 = (ArrayList) obj2;
                int size = arrayList2.size();
                if (i2 != 1) {
                    while (i < size) {
                        ((ra5) arrayList2.get(i)).h((Throwable) obj);
                        i++;
                    }
                    return;
                } else {
                    while (i < size) {
                        ((ra5) arrayList2.get(i)).i();
                        i++;
                    }
                    return;
                }
            case 4:
                s98 s98Var = (s98) obj;
                ha8 ha8Var = (ha8) obj2;
                boolean z = s98Var.c;
                AtomicInteger atomicInteger = s98Var.d;
                ArrayList arrayList3 = s98Var.b;
                if (!s98Var.isDone()) {
                    try {
                        if (arrayList3 != null) {
                            try {
                                try {
                                    try {
                                        z5j.f("Tried to set value from future which is not done", ha8Var.isDone());
                                        arrayList3.set(i2, wsf.e(ha8Var));
                                        iDecrementAndGet = atomicInteger.decrementAndGet();
                                        z5j.f("Less than 0 remaining futures", iDecrementAndGet >= 0);
                                    } catch (ExecutionException e) {
                                        if (z) {
                                            s98Var.X.d(e.getCause());
                                        }
                                        int iDecrementAndGet2 = atomicInteger.decrementAndGet();
                                        z5j.f("Less than 0 remaining futures", iDecrementAndGet2 >= 0);
                                        if (iDecrementAndGet2 != 0) {
                                            return;
                                        }
                                        ArrayList arrayList4 = s98Var.b;
                                        if (arrayList4 != null) {
                                            tu1Var = s98Var.X;
                                            arrayList = new ArrayList(arrayList4);
                                        }
                                    }
                                } catch (RuntimeException e2) {
                                    if (z) {
                                        s98Var.X.d(e2);
                                    }
                                    int iDecrementAndGet3 = atomicInteger.decrementAndGet();
                                    z5j.f("Less than 0 remaining futures", iDecrementAndGet3 >= 0);
                                    if (iDecrementAndGet3 != 0) {
                                        return;
                                    }
                                    ArrayList arrayList5 = s98Var.b;
                                    if (arrayList5 != null) {
                                        tu1Var = s98Var.X;
                                        arrayList = new ArrayList(arrayList5);
                                    }
                                }
                            } catch (Error e3) {
                                s98Var.X.d(e3);
                                int iDecrementAndGet4 = atomicInteger.decrementAndGet();
                                z5j.f("Less than 0 remaining futures", iDecrementAndGet4 >= 0);
                                if (iDecrementAndGet4 != 0) {
                                    return;
                                }
                                ArrayList arrayList6 = s98Var.b;
                                if (arrayList6 != null) {
                                    tu1Var = s98Var.X;
                                    arrayList = new ArrayList(arrayList6);
                                }
                            } catch (CancellationException unused) {
                                if (z) {
                                    s98Var.cancel(false);
                                }
                                int iDecrementAndGet5 = atomicInteger.decrementAndGet();
                                z5j.f("Less than 0 remaining futures", iDecrementAndGet5 >= 0);
                                if (iDecrementAndGet5 != 0) {
                                    return;
                                }
                                ArrayList arrayList7 = s98Var.b;
                                if (arrayList7 != null) {
                                    tu1Var = s98Var.X;
                                    arrayList = new ArrayList(arrayList7);
                                }
                            }
                            if (iDecrementAndGet == 0) {
                                ArrayList arrayList8 = s98Var.b;
                                if (arrayList8 != null) {
                                    tu1Var = s98Var.X;
                                    arrayList = new ArrayList(arrayList8);
                                    tu1Var.b(arrayList);
                                    return;
                                }
                                z5j.f(null, s98Var.isDone());
                                return;
                            }
                            return;
                        }
                    } catch (Throwable th) {
                        int iDecrementAndGet6 = atomicInteger.decrementAndGet();
                        z5j.f("Less than 0 remaining futures", iDecrementAndGet6 >= 0);
                        if (iDecrementAndGet6 == 0) {
                            ArrayList arrayList9 = s98Var.b;
                            if (arrayList9 != null) {
                                s98Var.X.b(new ArrayList(arrayList9));
                            } else {
                                z5j.f(null, s98Var.isDone());
                            }
                        }
                        throw th;
                    }
                }
                z5j.f("Future was done before all dependencies completed", z);
                return;
            case 5:
                ((hwf) obj2).b((Intent) obj, i2);
                return;
            case 6:
                ((SystemForegroundService) obj).o.notify(i2, (Notification) obj2);
                return;
            default:
                OneMeButton oneMeButton = (OneMeButton) obj2;
                ScrollView scrollView = (ScrollView) obj;
                ViewGroup.LayoutParams layoutParams = oneMeButton.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                scrollView.setPadding(scrollView.getPaddingLeft(), scrollView.getPaddingTop(), scrollView.getPaddingRight(), oneMeButton.getMeasuredHeight() + (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0) + i2);
                return;
        }
    }

    public /* synthetic */ hp(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }

    public hp(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.a = 2;
        this.d = bottomSheetBehavior;
        this.c = view;
        this.b = i;
    }

    public hp(List list, int i, Throwable th) {
        this.a = 3;
        z5j.e(list, "initCallbacks cannot be null");
        this.c = new ArrayList(list);
        this.b = i;
        this.d = th;
    }
}
