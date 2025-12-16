package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class mfh {
    public static final kc3 a = new kc3(19);
    public static Field b;
    public static Field c;

    public static final CharSequence a(CharSequence charSequence, TextView textView, int i) {
        Spanned spanned;
        if (charSequence != null && !vmf.F(charSequence)) {
            if (i <= 0) {
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setMaxLines(1);
                return charSequence;
            }
            CharSequence charSequence2 = null;
            try {
                textView.setEllipsize(null);
                if (textView.getPaint().measureText(charSequence, 0, charSequence.length()) <= i) {
                    return charSequence;
                }
                CharSequence charSequenceSubSequence = charSequence.subSequence(charSequence.length() - 1, charSequence.length());
                int length = charSequenceSubSequence.length();
                try {
                    spanned = charSequenceSubSequence instanceof Spanned ? (Spanned) charSequenceSubSequence : null;
                } catch (Throwable unused) {
                }
                Object[] spans = spanned != null ? spanned.getSpans(0, length, ImageSpan.class) : null;
                if (spans == null) {
                    spans = new ImageSpan[0];
                }
                if (spans.length != 0) {
                    charSequence2 = charSequenceSubSequence;
                }
                StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textView.getPaint(), (i - (charSequence2 != null ? kti.d(textView.getPaint().measureText(charSequence2, 0, charSequence2.length())) : 0)) - kti.d(textView.getPaint().measureText("…", 0, 1))).setAlignment(Layout.Alignment.ALIGN_NORMAL).setIncludePad(false).setHyphenationFrequency(0).build();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                CharSequence charSequenceC0 = vmf.c0(staticLayoutBuild.getText().subSequence(staticLayoutBuild.getLineStart(0), staticLayoutBuild.getLineEnd(0)));
                spannableStringBuilder.append(charSequenceC0);
                if (!fni.a(charSequenceC0, charSequence)) {
                    spannableStringBuilder.append((CharSequence) "…");
                    if (charSequence2 != null && charSequence2.length() != 0) {
                        spannableStringBuilder.append(charSequence2);
                    }
                }
                return new SpannedString(spannableStringBuilder);
            } catch (Exception unused2) {
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setMaxLines(1);
            }
        }
        return charSequence;
    }

    public static final void b(View view, Rect rect, float f) {
        view.setClipToOutline(true);
        view.setOutlineProvider(new utd(rect, f, 1));
    }

    public static final int c(int i, Object obj) {
        return (i * 31) + (obj != null ? obj.hashCode() : 0);
    }

    public static final int d(ree reeVar, ew7 ew7Var, String str) {
        lw7 lw7Var = ew7Var.a;
        i(ew7Var, reeVar);
        int iD = reeVar.d(str);
        if (iD != -3 || !ew7Var.a.f) {
            return iD;
        }
        ao6 ao6Var = ew7Var.c;
        qn2 qn2Var = new qn2(reeVar, 23, ew7Var);
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) ao6Var.b;
        Map map = (Map) concurrentHashMap.get(reeVar);
        kc3 kc3Var = a;
        Object obj = map != null ? map.get(kc3Var) : null;
        Object objInvoke = obj != null ? obj : null;
        if (objInvoke == null) {
            objInvoke = qn2Var.invoke();
            Object concurrentHashMap2 = concurrentHashMap.get(reeVar);
            if (concurrentHashMap2 == null) {
                concurrentHashMap2 = new ConcurrentHashMap(2);
                concurrentHashMap.put(reeVar, concurrentHashMap2);
            }
            ((Map) concurrentHashMap2).put(kc3Var, objInvoke);
        }
        Integer num = (Integer) ((Map) objInvoke).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public static final PointF e(Context context) {
        r1e r1eVarB = i9j.b(context);
        float f = 16;
        return new PointF(u45.q(f, vw4.d().getDisplayMetrics().density, u45.q(118, vw4.d().getDisplayMetrics().density, r1eVarB.b)), u45.q(f, vw4.d().getDisplayMetrics().density, u45.q(174, vw4.d().getDisplayMetrics().density, r1eVarB.a)) - r1eVarB.d);
    }

    public static final Drawable f(TextView textView) {
        if (Build.VERSION.SDK_INT >= 29) {
            return textView.getTextCursorDrawable();
        }
        try {
            if (b == null) {
                Field declaredField = TextView.class.getDeclaredField("mEditor");
                declaredField.setAccessible(true);
                b = declaredField;
            }
            Field field = b;
            if (field == null) {
                field = null;
            }
            if (field.get(textView) == null) {
                Method declaredMethod = textView.getClass().getDeclaredMethod("createEditorIfNeeded", null);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(textView, null);
            }
            if (b == null) {
                Field declaredField2 = TextView.class.getDeclaredField("mEditor");
                declaredField2.setAccessible(true);
                b = declaredField2;
            }
            Field field2 = b;
            if (field2 == null) {
                field2 = null;
            }
            Object obj = field2.get(textView);
            if (obj != null) {
                if (c == null) {
                    Field declaredField3 = obj.getClass().getDeclaredField("mCursorDrawable");
                    declaredField3.setAccessible(true);
                    c = declaredField3;
                }
                Field field3 = c;
                if (field3 == null) {
                    field3 = null;
                }
                Object obj2 = field3.get(obj);
                Object[] objArr = obj2 instanceof Object[] ? (Object[]) obj2 : null;
                if (objArr != null) {
                    Object objW = ys.w(objArr);
                    if (objW instanceof Drawable) {
                        return (Drawable) objW;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static final void g(ln lnVar, boolean z) {
        if (z) {
            lnVar.getWindow().addFlags(6815872);
        } else {
            lnVar.getWindow().clearFlags(6815872);
        }
        if (Build.VERSION.SDK_INT >= 27) {
            lnVar.setShowWhenLocked(z);
            lnVar.setTurnScreenOn(z);
        }
    }

    public static final Drawable h(int i, int i2, Context context) {
        Drawable drawableMutate = r34.b(context, i).mutate();
        cei.k(drawableMutate, i2);
        return drawableMutate;
    }

    public static final void i(ew7 ew7Var, ree reeVar) {
        if (fni.a(reeVar.e(), nnf.b)) {
            lw7 lw7Var = ew7Var.a;
        }
    }

    public static final void j(View view, float f) {
        view.setClipToOutline(true);
        view.setOutlineProvider(new ls0(f));
    }

    public static final void k(TextView textView, boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            textView.setFallbackLineSpacing(z);
        }
    }

    public static final void l(EditText editText, GradientDrawable gradientDrawable) {
        if (Build.VERSION.SDK_INT >= 29) {
            editText.setTextCursorDrawable(gradientDrawable);
            return;
        }
        try {
            if (b == null) {
                Field declaredField = TextView.class.getDeclaredField("mEditor");
                declaredField.setAccessible(true);
                b = declaredField;
            }
            Field field = b;
            Field field2 = null;
            if (field == null) {
                field = null;
            }
            if (field.get(editText) == null) {
                Method declaredMethod = editText.getClass().getDeclaredMethod("createEditorIfNeeded", null);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(editText, null);
            }
            if (b == null) {
                Field declaredField2 = TextView.class.getDeclaredField("mEditor");
                declaredField2.setAccessible(true);
                b = declaredField2;
            }
            Field field3 = b;
            if (field3 == null) {
                field3 = null;
            }
            Object obj = field3.get(editText);
            if (obj == null) {
                return;
            }
            if (c == null) {
                Field declaredField3 = obj.getClass().getDeclaredField("mCursorDrawable");
                declaredField3.setAccessible(true);
                c = declaredField3;
            }
            Field field4 = c;
            if (field4 != null) {
                field2 = field4;
            }
            field2.set(obj, new Drawable[]{gradientDrawable, gradientDrawable});
        } catch (Throwable unused) {
        }
    }

    public static final void m(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if ((marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0) == i) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams2.bottomMargin = i;
        view.setLayoutParams(marginLayoutParams2);
    }

    public static final void n(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if ((marginLayoutParams != null ? marginLayoutParams.topMargin : 0) == i) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams2.topMargin = i;
        view.setLayoutParams(marginLayoutParams2);
    }

    public static final void o(ViewGroup viewGroup, boolean z) {
        int i = z ? 0 : 4;
        if (viewGroup.getVisibility() != i) {
            viewGroup.setVisibility(i);
        }
    }
}
