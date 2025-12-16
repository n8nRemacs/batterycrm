package defpackage;

import android.graphics.Rect;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;
import java.util.WeakHashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class yni {
    public static final int[] a = new int[2];

    public static final s00 a(wvg wvgVar) {
        switch (evg.$EnumSwitchMapping$0[wvgVar.ordinal()]) {
            case 1:
                return s00.UNKNOWN;
            case 2:
                return s00.VIDEO;
            case 3:
                return s00.VIDEO_MSG;
            case 4:
            case 5:
                return s00.PHOTO;
            case 6:
                return s00.FILE;
            case 7:
                return s00.AUDIO;
            case 8:
                return s00.STICKER;
            default:
                return s00.UNKNOWN;
        }
    }

    public static void b(View view, int i) {
        WeakHashMap weakHashMap = hfh.a;
        if (view.getPaddingStart() != i) {
            view.setPaddingRelative(i, view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom());
        }
    }

    public static void c(Rect rect, View view) {
        int[] iArr = a;
        view.getLocationInWindow(iArr);
        int i = iArr[1];
        Rect rect2 = i < rect.top ? new Rect(0, rect.top - i, view.getWidth(), view.getHeight()) : null;
        if (view.getHeight() + i > rect.bottom) {
            int height = view.getHeight() - ((view.getHeight() + i) - rect.bottom);
            if (rect2 == null) {
                rect2 = new Rect(0, 0, view.getWidth(), height);
            } else {
                rect2.bottom = height;
            }
        }
        if (rect2 != null) {
            view.setClipBounds(rect2);
        } else {
            view.setClipBounds(null);
        }
    }

    public static int[] d(int i, int i2, int i3, int i4) {
        float f = i4;
        float f2 = i3;
        int i5 = (int) ((f / f2) * i);
        if (i5 > i2) {
            i = (int) ((f2 / f) * i2);
        } else {
            i2 = i5;
        }
        Size size = new Size(i, i2);
        return new int[]{size.getWidth(), size.getHeight()};
    }

    public static void e(View view, boolean z) {
        if (view != null) {
            view.setVisibility(z ? 8 : 0);
        }
    }

    public static void f(View view, int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams.getMarginEnd() != i) {
            marginLayoutParams.setMarginEnd(i);
            view.setLayoutParams(marginLayoutParams);
        }
    }

    public static final String g(JSONObject jSONObject, String str) {
        if (jSONObject.has(str)) {
            return jSONObject.optString(str);
        }
        return null;
    }

    public static void h(ViewGroup viewGroup) {
        viewGroup.setEnabled(false);
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != null) {
                if (childAt instanceof Spinner) {
                    Spinner spinner = (Spinner) childAt;
                    if (spinner.getSelectedView() != null) {
                        spinner.getSelectedView().setEnabled(false);
                    }
                } else if (childAt instanceof ViewGroup) {
                    h((ViewGroup) childAt);
                }
                childAt.setEnabled(false);
            }
        }
    }
}
