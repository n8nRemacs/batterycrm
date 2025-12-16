package androidx.core.widget;

import Fc1.O2;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Paint;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.text.g;
import j.F;
import j.InterfaceC42167x;
import j.N;
import j.P;
import j.U;
import j.X;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* compiled from: TextViewCompat.java */
/* loaded from: classes.dex */
public final class n {

    /* compiled from: TextViewCompat.java */
    @X
    public static class a {
    }

    /* compiled from: TextViewCompat.java */
    @X
    public static class b {
    }

    /* compiled from: TextViewCompat.java */
    @X
    public static class c {
    }

    /* compiled from: TextViewCompat.java */
    @X
    public static class d {
        public static String[] a(DecimalFormatSymbols decimalFormatSymbols) {
            return decimalFormatSymbols.getDigitStrings();
        }

        public static PrecomputedText.Params b(AppCompatTextView appCompatTextView) {
            return appCompatTextView.getTextMetricsParams();
        }

        public static void c(TextView textView, int i12) {
            textView.setFirstBaselineToTopHeight(i12);
        }
    }

    /* compiled from: TextViewCompat.java */
    @X
    public static class e {
        public static void a(@N TextView textView, int i12, @InterfaceC42167x float f12) {
            textView.setLineHeight(i12, f12);
        }
    }

    /* compiled from: TextViewCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface f {
    }

    /* compiled from: TextViewCompat.java */
    @X
    public static class g implements ActionMode.Callback {

        /* renamed from: a, reason: collision with root package name */
        public final ActionMode.Callback f45161a;

        /* renamed from: b, reason: collision with root package name */
        public final TextView f45162b;

        /* renamed from: c, reason: collision with root package name */
        public Class<?> f45163c;

        /* renamed from: d, reason: collision with root package name */
        public Method f45164d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f45165e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f45166f = false;

        public g(ActionMode.Callback callback, TextView textView) {
            this.f45161a = callback;
            this.f45162b = textView;
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f45161a.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f45161a.onCreateActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public final void onDestroyActionMode(ActionMode actionMode) {
            this.f45161a.onDestroyActionMode(actionMode);
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
            String str;
            TextView textView = this.f45162b;
            Context context = textView.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.f45166f) {
                this.f45166f = true;
                try {
                    Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f45163c = cls;
                    this.f45164d = cls.getDeclaredMethod("removeItemAt", Integer.TYPE);
                    this.f45165e = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f45163c = null;
                    this.f45164d = null;
                    this.f45165e = false;
                }
            }
            try {
                Method declaredMethod = (this.f45165e && this.f45163c.isInstance(menu)) ? this.f45164d : menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        declaredMethod.invoke(menu, Integer.valueOf(size));
                    }
                }
                ArrayList arrayList = new ArrayList();
                if (context instanceof Activity) {
                    for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0)) {
                        if (!context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                            ActivityInfo activityInfo = resolveInfo.activityInfo;
                            if (activityInfo.exported && ((str = activityInfo.permission) == null || context.checkSelfPermission(str) == 0)) {
                            }
                        }
                        arrayList.add(resolveInfo);
                    }
                }
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    ResolveInfo resolveInfo2 = (ResolveInfo) arrayList.get(i12);
                    MenuItem menuItemAdd = menu.add(0, 0, i12 + 100, resolveInfo2.loadLabel(packageManager));
                    Intent intentPutExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !((textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled()));
                    ActivityInfo activityInfo2 = resolveInfo2.activityInfo;
                    menuItemAdd.setIntent(intentPutExtra.setClassName(activityInfo2.packageName, activityInfo2.name)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
            return this.f45161a.onPrepareActionMode(actionMode, menu);
        }
    }

    @N
    public static g.b a(@N AppCompatTextView appCompatTextView) {
        TextDirectionHeuristic textDirectionHeuristic;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 28) {
            return new g.b(d.b(appCompatTextView));
        }
        TextPaint textPaint = new TextPaint(appCompatTextView.getPaint());
        g.b.a aVar = new g.b.a();
        aVar.f44877a = 1;
        aVar.f44878b = 1;
        TextDirectionHeuristic textDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        aVar.f44877a = appCompatTextView.getBreakStrategy();
        aVar.f44878b = appCompatTextView.getHyphenationFrequency();
        if (appCompatTextView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            if (i12 < 28 || (appCompatTextView.getInputType() & 15) != 3) {
                boolean z12 = appCompatTextView.getLayoutDirection() == 1;
                switch (appCompatTextView.getTextDirection()) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case 3:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case 5:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case 6:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                        break;
                    case 7:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (!z12) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                            break;
                        } else {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                }
            } else {
                byte directionality = Character.getDirectionality(d.a(DecimalFormatSymbols.getInstance(appCompatTextView.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            }
        }
        return new g.b(textPaint, textDirectionHeuristic, aVar.f44877a, aVar.f44878b);
    }

    public static void b(@N TextView textView, @U @F int i12) {
        androidx.core.util.z.d(i12);
        if (Build.VERSION.SDK_INT >= 28) {
            d.c(textView, i12);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i13 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i12 > Math.abs(i13)) {
            textView.setPadding(textView.getPaddingLeft(), i12 + i13, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void c(@N TextView textView, @U @F int i12) {
        androidx.core.util.z.d(i12);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i13 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i12 > Math.abs(i13)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i12 - i13);
        }
    }

    public static void d(@N TextView textView, @U @F int i12) {
        androidx.core.util.z.d(i12);
        if (i12 != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i12 - r0, 1.0f);
        }
    }

    public static void e(@N TextView textView, int i12, @InterfaceC42167x float f12) {
        if (Build.VERSION.SDK_INT >= 34) {
            e.a(textView, i12, f12);
        } else {
            d(textView, Math.round(TypedValue.applyDimension(i12, f12, textView.getResources().getDisplayMetrics())));
        }
    }

    public static void f(@N AppCompatTextView appCompatTextView, @N androidx.core.text.g gVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            gVar.getClass();
            appCompatTextView.setText(O2.y(null) ? O2.m(null) : null);
            return;
        }
        g.b bVarA = a(appCompatTextView);
        gVar.getClass();
        if (!bVarA.a(null)) {
            throw new IllegalArgumentException("Given text can not be applied to TextView.");
        }
        appCompatTextView.setText(gVar);
    }

    @RestrictTo
    @P
    public static ActionMode.Callback g(@P ActionMode.Callback callback) {
        return callback instanceof g ? ((g) callback).f45161a : callback;
    }

    @RestrictTo
    @P
    public static ActionMode.Callback h(@P ActionMode.Callback callback, @N TextView textView) {
        return (Build.VERSION.SDK_INT > 27 || (callback instanceof g) || callback == null) ? callback : new g(callback, textView);
    }
}
