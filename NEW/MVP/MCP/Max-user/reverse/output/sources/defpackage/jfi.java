package defpackage;

import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class jfi {
    public static final int[][] a = {new int[]{-46922, -30155}, new int[]{-14019, -31958}, new int[]{-15408683, -16529630}, new int[]{-16197645, -11298561}, new int[]{-4220929, -11374849}};

    public static final void a(View view, int i, int i2) {
        Rect rect = new Rect();
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new wdg(view, rect, i, i2));
            return;
        }
        view.getHitRect(rect);
        if (rect.width() < i) {
            int iWidth = (i - rect.width()) / 2;
            rect.left -= iWidth;
            rect.right += iWidth;
        }
        if (rect.height() < i2) {
            int iHeight = (i2 - rect.height()) / 2;
            rect.top -= iHeight;
            rect.bottom += iHeight;
        }
        view.setTouchDelegate(new en5(rect, view));
    }

    public static void b(int i, View view, ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        viewGroup.post(new nm3(view, 0, 0, i, 0, viewGroup, 1));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public static me7 c(InputStream inputStream) {
        int iD;
        ne7 ne7Var = (ne7) ne7.d.getValue();
        int i = ne7Var.a;
        byte[] bArr = new byte[i];
        if (inputStream.markSupported()) {
            try {
                inputStream.mark(i);
                iD = qwi.d(inputStream, bArr, i);
            } finally {
                inputStream.reset();
            }
        } else {
            iD = qwi.d(inputStream, bArr, i);
        }
        me7 me7VarA = ne7Var.c.a(iD, bArr);
        boolean zEquals = me7VarA.equals(mn4.m);
        me7 me7Var = me7.c;
        if (zEquals) {
            me7VarA = me7Var;
        }
        if (me7VarA != me7Var) {
            return me7VarA;
        }
        ArrayList arrayList = ne7Var.b;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                me7 me7VarA2 = ((le7) it.next()).a(iD, bArr);
                if (me7VarA2 != me7Var) {
                    return me7VarA2;
                }
            }
        }
        return me7Var;
    }

    public static final int d(View view) {
        AccessibilityNodeInfo.TouchDelegateInfo touchDelegateInfo;
        Rect bounds;
        if (Build.VERSION.SDK_INT < 29) {
            return view.getLeft();
        }
        TouchDelegate touchDelegate = view.getTouchDelegate();
        if (touchDelegate == null || (touchDelegateInfo = touchDelegate.getTouchDelegateInfo()) == null) {
            return -1;
        }
        Region regionAt = touchDelegateInfo.getRegionCount() <= 0 ? null : touchDelegateInfo.getRegionAt(0);
        if (regionAt == null || (bounds = regionAt.getBounds()) == null) {
            return -1;
        }
        return bounds.left;
    }
}
