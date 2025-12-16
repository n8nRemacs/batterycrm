package com.avito.android.lib.design.text_view;

import PK0.b;
import PK0.n;
import X41.j;
import Y41.p;
import Y61.k;
import Y61.l;
import android.R;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.DynamicLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.TextAppearanceSpan;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.avito.android.lib.design.d;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.util.C35763c0;
import com.avito.android.util.y6;
import java.util.concurrent.ExecutionException;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import l3.i;

/* compiled from: AvitoTextView.kt */
@s0
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001!J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001a\u001a\u00020\b2\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010 \u001a\u00020\u000b8\u0002@\u0002X\u0083.¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcom/avito/android/lib/design/text_view/a;", "Landroidx/appcompat/widget/AppCompatTextView;", "LPK0/e;", "Ll3/c;", "Ll3/i;", "getAkitaTextStyleData", "()Ll3/i;", "styleData", "Lkotlin/G0;", "setAkitaTextStyleData", "(Ll3/i;)V", "LPK0/n;", "getTextStyleData", "()LPK0/n;", "setTextStyleData", "(LPK0/n;)V", "Landroid/text/TextUtils$TruncateAt;", "where", "setEllipsize", "(Landroid/text/TextUtils$TruncateAt;)V", "", "resId", "setTextAppearance", "(I)V", "Lkotlin/Function0;", "onExpand", "setOnExpandListener", "(LY41/a;)V", "b", "LPK0/n;", "getTextStyleData$annotations", "()V", "textStyleData", "c", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"CustomViewStyleable"})
/* loaded from: classes14.dex */
public class a extends AppCompatTextView implements PK0.e, l3.c {

    /* renamed from: m, reason: collision with root package name */
    @k
    public static final c f180919m = new c(null);

    /* renamed from: n, reason: collision with root package name */
    @k
    public static final AvitoLayoutInflater.c f180920n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public static final AvitoLayoutInflater.c f180921o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f180922p;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SuppressLint({"UiComponentLateinitVar"})
    public n textStyleData;

    /* renamed from: c, reason: collision with root package name */
    @l
    public i f180924c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public CharSequence f180925d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f180926e;

    /* renamed from: f, reason: collision with root package name */
    public int f180927f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public ValueAnimator f180928g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public Object f180929h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public StaticLayout f180930i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public CharSequence f180931j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f180932k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public Y41.a<G0> f180933l;

    /* compiled from: AvitoTextView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.design.text_view.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C5323a extends C42801a implements p<Context, AttributeSet, a> {

        /* renamed from: b, reason: collision with root package name */
        public static final C5323a f180934b = new C5323a();

        public C5323a() {
            super(2, a.class, "<init>", "<init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V", 0);
        }

        @Override // Y41.p
        public final a invoke(Context context, AttributeSet attributeSet) {
            return new a(context, attributeSet, 0, 0, 12, null);
        }
    }

    /* compiled from: AvitoTextView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends C42801a implements p<Context, AttributeSet, a> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f180935b = new b();

        public b() {
            super(2, a.class, "<init>", "<init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V", 0);
        }

        @Override // Y41.p
        public final a invoke(Context context, AttributeSet attributeSet) {
            return new a(context, attributeSet, 0, 0, 12, null);
        }
    }

    /* compiled from: AvitoTextView.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/avito/android/lib/design/text_view/a$c;", "", "<init>", "()V", "", "ELLIPSIS", "C", "", "EXPAND_TEXT_HEIGHT_ANIMATION_MAX_VALUE", "J", "EXPAND_TEXT_HEIGHT_ANIMATION_MULTIPLIER", "", "EXPAND_TEXT_ICON_INDENT", "I", "NBSP", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
        }
    }

    static {
        AvitoLayoutInflater avitoLayoutInflater = AvitoLayoutInflater.f181382a;
        b bVar = b.f180935b;
        avitoLayoutInflater.getClass();
        f180920n = AvitoLayoutInflater.a(bVar, "TextView");
        f180921o = AvitoLayoutInflater.a(C5323a.f180934b, AvitoLayoutInflater.f181385d);
        f180922p = y6.b(4);
    }

    @j
    public a(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public final void b(Typeface typeface, Float f12, ColorStateList colorStateList, Integer num, Integer num2, Integer num3, Integer num4, PK0.b bVar) {
        if (typeface != null) {
            setTypeface(typeface);
        }
        if (f12 != null) {
            setTextSize(0, f12.floatValue());
        }
        if (colorStateList != null) {
            setTextColor(colorStateList);
        }
        if (num != null) {
            setLineHeight(num.intValue());
        }
        if (num2 != null) {
            setLinkTextColor(num2.intValue());
        }
        if (num3 != null || num4 != null) {
            setIncludeFontPadding(true);
            if (Build.VERSION.SDK_INT >= 33) {
                setFallbackLineSpacing(false);
            }
        }
        if (num3 != null) {
            setFirstBaselineToTopHeight(num3.intValue());
        }
        if (num4 != null) {
            setLastBaselineToBottomHeight(num4.intValue());
        }
        if (bVar != null) {
            n nVar = this.textStyleData;
            if (nVar == null) {
                nVar = null;
            }
            PK0.b bVar2 = nVar.f12999m;
            if (bVar2 == null) {
                this.f180929h = new SpannableString("");
            } else {
                int length = String.valueOf((char) 8230).length();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("… " + bVar2.f12969a);
                spannableStringBuilder.setSpan(new com.avito.android.lib.design.text_view.c(this), length, spannableStringBuilder.length(), 33);
                setMovementMethod(LinkMovementMethod.getInstance());
                b.a aVar = bVar2.f12975g;
                if (aVar == null) {
                    spannableStringBuilder.setSpan(new TextAppearanceSpan(getContext(), bVar2.f12972d), length, spannableStringBuilder.length(), 33);
                } else {
                    Float f13 = aVar.f12976a;
                    if (f13 != null) {
                        spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) f13.floatValue(), false), length, spannableStringBuilder.length(), 33);
                    }
                    Typeface typeface2 = aVar.f12977b;
                    if (typeface2 != null) {
                        spannableStringBuilder.setSpan(new PK0.a(typeface2, null), length, spannableStringBuilder.length(), 33);
                    }
                }
                C35763c0 c35763c0 = bVar2.f12973e;
                if (c35763c0 != null) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(c35763c0.f318848a), length, spannableStringBuilder.length(), 33);
                }
                Drawable drawable = bVar2.f12974f;
                if (drawable != null) {
                    if (c35763c0 != null) {
                        drawable.setTint(c35763c0.f318848a);
                    }
                    drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                    spannableStringBuilder.append("_", new com.avito.android.lib.util.a(drawable, f180922p), 17);
                }
                this.f180929h = spannableStringBuilder;
            }
            m((getMeasuredWidth() - getCompoundPaddingStart()) - getCompoundPaddingEnd());
        }
    }

    public final void f() {
        n nVar = this.textStyleData;
        if (nVar == null) {
            nVar = null;
        }
        Typeface typeface = nVar.f12989c;
        C35763c0 c35763c0 = nVar.f12988b;
        b(typeface, nVar.f12987a, c35763c0 != null ? c35763c0.b() : null, nVar.f12991e, nVar.f12993g, nVar.f12997k, nVar.f12998l, nVar.f12999m);
    }

    @k
    public i getAkitaTextStyleData() {
        i iVar = this.f180924c;
        if (iVar != null) {
            return iVar;
        }
        return new i(null, null, null, 0, null, null, null, null, null, null, null, 2047, null);
    }

    @Override // PK0.o
    @k
    public n getTextStyleData() {
        n nVar = this.textStyleData;
        if (nVar == null) {
            return null;
        }
        return nVar;
    }

    @SuppressLint({"CustomColorsKotlin"})
    public final n h(AttributeSet attributeSet, int i12) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d.n.f178938O0, 0, i12);
        d dVar = d.f180938a;
        Context context = getContext();
        dVar.getClass();
        n nVarB = d.b(typedArrayObtainStyledAttributes, context);
        typedArrayObtainStyledAttributes.recycle();
        return nVarB;
    }

    public final StaticLayout k(int i12, int i13, CharSequence charSequence) {
        if (i13 < 0) {
            i13 = 0;
        }
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), getPaint(), i13).setIncludePad(false).setMaxLines(i12).setAlignment(Layout.Alignment.ALIGN_NORMAL).setEllipsize(TextUtils.TruncateAt.END).setLineSpacing(getLineSpacingExtra(), getLineSpacingMultiplier()).build();
    }

    public final void l(StaticLayout staticLayout, SpannableStringBuilder spannableStringBuilder) {
        n nVar = this.textStyleData;
        if (nVar == null) {
            nVar = null;
        }
        PK0.b bVar = nVar.f12999m;
        if (bVar != null) {
            int width = staticLayout.getWidth();
            DynamicLayout dynamicLayoutBuild = Build.VERSION.SDK_INT >= 28 ? DynamicLayout.Builder.obtain(spannableStringBuilder, getPaint(), width).setAlignment(Layout.Alignment.ALIGN_NORMAL).setIncludePad(false).setLineSpacing(getLineSpacingExtra(), getLineSpacingMultiplier()).build() : new DynamicLayout(spannableStringBuilder, spannableStringBuilder, getPaint(), width, Layout.Alignment.ALIGN_NORMAL, getLineSpacingMultiplier(), getLineSpacingExtra(), false);
            for (int I12 = C43066x.I(spannableStringBuilder, this.f180930i.getText().toString(), 0, false, 6) - 1; I12 >= 0 && dynamicLayoutBuild.getLineCount() > bVar.f12970b; I12--) {
                spannableStringBuilder.delete(I12, I12 + 1);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0049 A[PHI: r12
  0x0049: PHI (r12v4 java.lang.CharSequence) = 
  (r12v12 java.lang.CharSequence)
  (r12v13 java.lang.CharSequence)
  (r12v14 java.lang.CharSequence)
  (r12v15 java.lang.CharSequence)
  (r12v16 java.lang.CharSequence)
  (r12v17 java.lang.CharSequence)
 binds: [B:16:0x002d, B:18:0x0033, B:21:0x0038, B:23:0x0047, B:47:0x00c9, B:40:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.CharSequence, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(int r12) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.design.text_view.a.m(int):void");
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public final void onDetachedFromWindow() {
        ValueAnimator valueAnimator = this.f180928g;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i12, int i13) throws ExecutionException, InterruptedException {
        ValueAnimator valueAnimator;
        n nVar = this.textStyleData;
        if (nVar == null) {
            nVar = null;
        }
        if (nVar.f12999m == null) {
            super.onMeasure(i12, i13);
            return;
        }
        int size = (View.MeasureSpec.getSize(i12) - getCompoundPaddingStart()) - getCompoundPaddingEnd();
        if (size == this.f180927f || ((valueAnimator = this.f180928g) != null && valueAnimator.isRunning())) {
            super.onMeasure(i12, i13);
            return;
        }
        this.f180927f = size;
        m(size);
        super.onMeasure(i12, i13);
    }

    @Override // l3.c
    public void setAkitaTextStyleData(@k i styleData) {
        this.f180924c = styleData;
        com.akita.view.foundation.util.a aVar = styleData.f413424b;
        b(styleData.f413425c, styleData.f413423a, aVar != null ? aVar.a() : null, styleData.f413427e, styleData.f413429g, styleData.f413432j, styleData.f413433k, null);
    }

    @Override // android.widget.TextView
    public void setEllipsize(@l TextUtils.TruncateAt where) {
        n nVar = this.textStyleData;
        if (nVar != null) {
            if (nVar == null) {
                nVar = null;
            }
            if (nVar.f12999m != null) {
                super.setEllipsize(TextUtils.TruncateAt.END);
                return;
            }
        }
        super.setEllipsize(where);
    }

    public final void setOnExpandListener(@l Y41.a<G0> onExpand) {
        this.f180933l = onExpand;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a2 A[PHI: r14
  0x00a2: PHI (r14v7 java.lang.Integer) = (r14v3 java.lang.Integer), (r14v9 java.lang.Integer) binds: [B:42:0x00ae, B:36:0x00a0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r16v0, types: [android.widget.TextView, com.avito.android.lib.design.text_view.a] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.text.SpannableStringBuilder, android.text.Spanned, java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.CharSequence] */
    @Override // android.widget.TextView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setText(@Y61.l java.lang.CharSequence r17, @Y61.l android.widget.TextView.BufferType r18) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.design.text_view.a.setText(java.lang.CharSequence, android.widget.TextView$BufferType):void");
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int resId) {
        super.setTextAppearance(resId);
        this.textStyleData = h(null, resId);
        f();
    }

    @Override // PK0.e
    public void setTextStyleData(@k n styleData) {
        this.textStyleData = styleData;
        f();
    }

    public /* synthetic */ a(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? R.attr.textViewStyle : i12, (i14 & 8) != 0 ? 0 : i13);
    }

    @j
    public a(@k Context context, @l AttributeSet attributeSet, int i12, int i13) {
        super(context, attributeSet, i12);
        this.f180925d = "";
        this.f180929h = new SpannableString("");
        this.textStyleData = h(null, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.n.f178938O0, i12, i13);
        n nVarH = h(attributeSet, typedArrayObtainStyledAttributes.getResourceId(0, 0));
        d.f180938a.getClass();
        n nVarB = d.b(typedArrayObtainStyledAttributes, context);
        Float f12 = nVarB.f12987a;
        Float f13 = f12 == null ? nVarH.f12987a : f12;
        C35763c0 c35763c0 = nVarB.f12988b;
        C35763c0 c35763c02 = c35763c0 == null ? nVarH.f12988b : c35763c0;
        Typeface typeface = nVarB.f12989c;
        Typeface typeface2 = typeface == null ? nVarH.f12989c : typeface;
        Integer num = nVarB.f12997k;
        Integer num2 = num == null ? nVarH.f12997k : num;
        Integer num3 = nVarB.f12998l;
        Integer num4 = num3 == null ? nVarH.f12998l : num3;
        PK0.b bVar = nVarB.f12999m;
        this.textStyleData = n.a(nVarH, f13, c35763c02, typeface2, null, null, null, num2, num4, bVar == null ? nVarH.f12999m : bVar, 1016);
        f();
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void setTextAppearance(@l Context context, int i12) {
        super.setTextAppearance(context, i12);
        this.textStyleData = h(null, i12);
        f();
    }

    private static /* synthetic */ void getTextStyleData$annotations() {
    }
}
