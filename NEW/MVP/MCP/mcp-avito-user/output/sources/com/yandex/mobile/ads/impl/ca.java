package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes8.dex */
public final class ca {

    /* renamed from: j, reason: collision with root package name */
    private static final RectF f384215j = new RectF();

    /* renamed from: k, reason: collision with root package name */
    @SuppressLint({"BanConcurrentHashMap"})
    private static ConcurrentHashMap<String, Method> f384216k = new ConcurrentHashMap<>();

    /* renamed from: l, reason: collision with root package name */
    @SuppressLint({"BanConcurrentHashMap"})
    private static ConcurrentHashMap<String, Field> f384217l = new ConcurrentHashMap<>();

    /* renamed from: a, reason: collision with root package name */
    private int f384218a = 0;

    /* renamed from: b, reason: collision with root package name */
    private boolean f384219b = false;

    /* renamed from: c, reason: collision with root package name */
    private float f384220c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    private float f384221d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    private int[] f384222e = new int[0];

    /* renamed from: f, reason: collision with root package name */
    private TextPaint f384223f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    private final TextView f384224g;

    /* renamed from: h, reason: collision with root package name */
    private final Context f384225h;

    /* renamed from: i, reason: collision with root package name */
    private final c f384226i;

    @j.X
    public static class a extends c {
        @Override // com.yandex.mobile.ads.impl.ca.c
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) ca.a(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    @j.X
    public static class b extends a {
        @Override // com.yandex.mobile.ads.impl.ca.c
        public final boolean a(TextView textView) {
            return textView.isHorizontallyScrollable();
        }

        @Override // com.yandex.mobile.ads.impl.ca.a, com.yandex.mobile.ads.impl.ca.c
        public final void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }
    }

    public static class c {
        public void a(StaticLayout.Builder builder, TextView textView) {
        }

        public boolean a(TextView textView) {
            return ((Boolean) ca.a(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    public ca(@j.N TextView textView) {
        this.f384224g = textView;
        this.f384225h = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f384226i = new b();
        } else {
            this.f384226i = new a();
        }
    }

    @RestrictTo
    public final void a() {
        if (b()) {
            if (this.f384219b) {
                if (this.f384224g.getMeasuredHeight() <= 0 || this.f384224g.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f384226i.a(this.f384224g) ? 1048576 : (this.f384224g.getMeasuredWidth() - this.f384224g.getTotalPaddingLeft()) - this.f384224g.getTotalPaddingRight();
                int height = (this.f384224g.getHeight() - this.f384224g.getCompoundPaddingBottom()) - this.f384224g.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f384215j;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fA2 = a(rectF);
                        if (fA2 != this.f384224g.getTextSize()) {
                            a(0, fA2);
                        }
                    } finally {
                    }
                }
            }
            this.f384219b = true;
        }
    }

    @RestrictTo
    public final boolean b() {
        return ((this.f384224g instanceof EditText) || this.f384218a == 0) ? false : true;
    }

    @RestrictTo
    public final void a(int i12, float f12) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Resources resources;
        Method declaredMethod;
        Context context = this.f384225h;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        float fApplyDimension = TypedValue.applyDimension(i12, f12, resources.getDisplayMetrics());
        if (fApplyDimension != this.f384224g.getPaint().getTextSize()) {
            this.f384224g.getPaint().setTextSize(fApplyDimension);
            boolean zIsInLayout = this.f384224g.isInLayout();
            if (this.f384224g.getLayout() != null) {
                this.f384219b = false;
                try {
                    declaredMethod = f384216k.get("nullLayouts");
                    if (declaredMethod == null && (declaredMethod = TextView.class.getDeclaredMethod("nullLayouts", new Class[0])) != null) {
                        declaredMethod.setAccessible(true);
                        f384216k.put("nullLayouts", declaredMethod);
                    }
                } catch (Exception unused) {
                    declaredMethod = null;
                }
                if (declaredMethod != null) {
                    try {
                        declaredMethod.invoke(this.f384224g, new Object[0]);
                    } catch (Exception unused2) {
                    }
                }
                if (!zIsInLayout) {
                    this.f384224g.requestLayout();
                } else {
                    this.f384224g.forceLayout();
                }
                this.f384224g.invalidate();
            }
        }
    }

    private int a(RectF rectF) {
        CharSequence transformation;
        int length = this.f384222e.length;
        if (length != 0) {
            int i12 = length - 1;
            int i13 = 1;
            int i14 = 0;
            while (i13 <= i12) {
                int i15 = (i13 + i12) / 2;
                int i16 = this.f384222e[i15];
                CharSequence text = this.f384224g.getText();
                TransformationMethod transformationMethod = this.f384224g.getTransformationMethod();
                if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f384224g)) != null) {
                    text = transformation;
                }
                int maxLines = this.f384224g.getMaxLines();
                TextPaint textPaint = this.f384223f;
                if (textPaint == null) {
                    this.f384223f = new TextPaint();
                } else {
                    textPaint.reset();
                }
                this.f384223f.set(this.f384224g.getPaint());
                this.f384223f.setTextSize(i16);
                Layout.Alignment alignment = (Layout.Alignment) a(this.f384224g, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
                StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(text, 0, text.length(), this.f384223f, Math.round(rectF.right));
                builderObtain.setAlignment(alignment).setLineSpacing(this.f384224g.getLineSpacingExtra(), this.f384224g.getLineSpacingMultiplier()).setIncludePad(this.f384224g.getIncludeFontPadding()).setBreakStrategy(this.f384224g.getBreakStrategy()).setHyphenationFrequency(this.f384224g.getHyphenationFrequency()).setMaxLines(maxLines == -1 ? Integer.MAX_VALUE : maxLines);
                try {
                    this.f384226i.a(builderObtain, this.f384224g);
                } catch (ClassCastException unused) {
                }
                StaticLayout staticLayoutBuild = builderObtain.build();
                if ((maxLines == -1 || (staticLayoutBuild.getLineCount() <= maxLines && staticLayoutBuild.getLineEnd(staticLayoutBuild.getLineCount() - 1) == text.length())) && staticLayoutBuild.getHeight() <= rectF.bottom) {
                    int i17 = i15 + 1;
                    i14 = i13;
                    i13 = i17;
                } else {
                    i14 = i15 - 1;
                    i12 = i14;
                }
            }
            return this.f384222e[i14];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    public static <T> T a(@j.N Object obj, @j.N String str, @j.N T t12) {
        Method declaredMethod;
        try {
            declaredMethod = f384216k.get(str);
            if (declaredMethod == null && (declaredMethod = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                declaredMethod.setAccessible(true);
                f384216k.put(str, declaredMethod);
            }
        } catch (Exception unused) {
            declaredMethod = null;
        }
        try {
            return (T) declaredMethod.invoke(obj, new Object[0]);
        } catch (Exception unused2) {
            return t12;
        }
    }

    @j.P
    private static Field a(@j.N String str) throws SecurityException {
        try {
            Field declaredField = f384217l.get(str);
            if (declaredField == null && (declaredField = TextView.class.getDeclaredField(str)) != null) {
                declaredField.setAccessible(true);
                f384217l.put(str, declaredField);
            }
            return declaredField;
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    @RestrictTo
    public final void a(int i12) {
        if (this.f384224g instanceof EditText) {
            return;
        }
        if (i12 == 0) {
            this.f384218a = 0;
            this.f384221d = -1.0f;
            this.f384220c = -1.0f;
            this.f384222e = new int[0];
            this.f384219b = false;
            return;
        }
        if (i12 == 1) {
            DisplayMetrics displayMetrics = this.f384225h.getResources().getDisplayMetrics();
            float fApplyDimension = TypedValue.applyDimension(2, 12.0f, displayMetrics);
            float fApplyDimension2 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
            if (fApplyDimension <= 0.0f) {
                throw new IllegalArgumentException("Minimum auto-size text size (" + fApplyDimension + "px) is less or equal to (0px)");
            }
            if (fApplyDimension2 > fApplyDimension) {
                this.f384218a = 1;
                this.f384221d = fApplyDimension;
                this.f384220c = 1.0f;
                if (!(this.f384224g instanceof EditText)) {
                    int iFloor = ((int) Math.floor((fApplyDimension2 - fApplyDimension) / 1.0f)) + 1;
                    int[] iArr = new int[iFloor];
                    for (int i13 = 0; i13 < iFloor; i13++) {
                        iArr[i13] = Math.round((i13 * this.f384220c) + this.f384221d);
                    }
                    if (iFloor != 0) {
                        Arrays.sort(iArr);
                        ArrayList arrayList = new ArrayList();
                        for (int i14 = 0; i14 < iFloor; i14++) {
                            int i15 = iArr[i14];
                            if (i15 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i15)) < 0) {
                                arrayList.add(Integer.valueOf(i15));
                            }
                        }
                        if (iFloor != arrayList.size()) {
                            int size = arrayList.size();
                            iArr = new int[size];
                            for (int i16 = 0; i16 < size; i16++) {
                                iArr[i16] = ((Integer) arrayList.get(i16)).intValue();
                            }
                        }
                    }
                    this.f384222e = iArr;
                    this.f384219b = true;
                } else {
                    this.f384219b = false;
                }
                if (this.f384219b) {
                    a();
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Maximum auto-size text size (" + fApplyDimension2 + "px) is less or equal to minimum auto-size text size (" + fApplyDimension + "px)");
        }
        throw new IllegalArgumentException(ba.a("Unknown auto-size text type: ", i12));
    }
}
