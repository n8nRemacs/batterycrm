package com.akita.view.foundation.ui.text;

import Y41.p;
import Y61.k;
import Y61.l;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.akita.view.foundation.ui.inflater.a;
import j3.C42187a;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import l3.C43532a;
import l3.d;
import l3.e;
import l3.f;
import l3.g;
import l3.i;

/* compiled from: AvitoTextView.kt */
@s0
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0013J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/akita/view/foundation/ui/text/a;", "Landroidx/appcompat/widget/AppCompatTextView;", "Ll3/c;", "Ll3/i;", "getAkitaTextStyleData", "()Ll3/i;", "styleData", "Lkotlin/G0;", "setAkitaTextStyleData", "(Ll3/i;)V", "", "resId", "setTextAppearance", "(I)V", "b", "Ll3/i;", "getTextStyleData$annotations", "()V", "textStyleData", "c", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"CustomViewStyleable"})
/* loaded from: classes10.dex */
public class a extends AppCompatTextView implements l3.c {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final c f67004c = new c(null);

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a.d f67005d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a.d f67006e;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    public i textStyleData;

    /* compiled from: AvitoTextView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.akita.view.foundation.ui.text.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C2120a extends C42801a implements p<Context, AttributeSet, a> {

        /* renamed from: b, reason: collision with root package name */
        public static final C2120a f67008b = new C2120a();

        public C2120a() {
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
        public static final b f67009b = new b();

        public b() {
            super(2, a.class, "<init>", "<init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V", 0);
        }

        @Override // Y41.p
        public final a invoke(Context context, AttributeSet attributeSet) {
            return new a(context, attributeSet, 0, 0, 12, null);
        }
    }

    /* compiled from: AvitoTextView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/akita/view/foundation/ui/text/a$c;", "", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
        }
    }

    static {
        com.akita.view.foundation.ui.inflater.a aVar = com.akita.view.foundation.ui.inflater.a.f66995a;
        b bVar = b.f67009b;
        aVar.getClass();
        f67005d = com.akita.view.foundation.ui.inflater.a.a(bVar, "TextView");
        f67006e = com.akita.view.foundation.ui.inflater.a.a(C2120a.f67008b, com.akita.view.foundation.ui.inflater.a.f66996b);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) throws Resources.NotFoundException {
        AttributeSet attributeSet2 = (i14 & 2) != 0 ? null : attributeSet;
        int i15 = (i14 & 4) != 0 ? R.attr.textViewStyle : i12;
        int i16 = (i14 & 8) != 0 ? 0 : i13;
        super(context, attributeSet2, i15);
        this.textStyleData = f(null, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet2, C42187a.b.f405423a, i15, i16);
        i iVarF = f(attributeSet2, typedArrayObtainStyledAttributes.getResourceId(0, 0));
        i.f413422l.getClass();
        i iVarA = i.a.a(typedArrayObtainStyledAttributes, context);
        Float f12 = iVarA.f413423a;
        Float f13 = f12 == null ? iVarF.f413423a : f12;
        com.akita.view.foundation.util.a aVar = iVarA.f413424b;
        com.akita.view.foundation.util.a aVar2 = aVar == null ? iVarF.f413424b : aVar;
        Typeface typeface = iVarA.f413425c;
        Typeface typeface2 = typeface == null ? iVarF.f413425c : typeface;
        Integer num = iVarA.f413432j;
        Integer num2 = num == null ? iVarF.f413432j : num;
        Integer num3 = iVarA.f413433k;
        this.textStyleData = new i(f13, aVar2, typeface2, iVarF.f413426d, iVarF.f413427e, iVarF.f413428f, iVarF.f413429g, iVarF.f413430h, iVarF.f413431i, num2, num3 == null ? iVarF.f413433k : num3);
        b();
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r3 = this;
            l3.i r0 = r3.textStyleData
            if (r0 == 0) goto Lb
            android.graphics.Typeface r0 = r0.f413425c
            if (r0 == 0) goto Lb
            r3.setTypeface(r0)
        Lb:
            l3.i r0 = r3.textStyleData
            if (r0 == 0) goto L1b
            java.lang.Float r0 = r0.f413423a
            if (r0 == 0) goto L1b
            float r0 = r0.floatValue()
            r1 = 0
            r3.setTextSize(r1, r0)
        L1b:
            l3.i r0 = r3.textStyleData
            if (r0 == 0) goto L2c
            com.akita.view.foundation.util.a r0 = r0.f413424b
            if (r0 == 0) goto L2c
            android.content.res.ColorStateList r0 = r0.a()
            if (r0 == 0) goto L2c
            r3.setTextColor(r0)
        L2c:
            l3.i r0 = r3.textStyleData
            if (r0 == 0) goto L3b
            java.lang.Integer r0 = r0.f413427e
            if (r0 == 0) goto L3b
            int r0 = r0.intValue()
            r3.setLineHeight(r0)
        L3b:
            l3.i r0 = r3.textStyleData
            if (r0 == 0) goto L4a
            java.lang.Integer r0 = r0.f413429g
            if (r0 == 0) goto L4a
            int r0 = r0.intValue()
            r3.setLinkTextColor(r0)
        L4a:
            l3.i r0 = r3.textStyleData
            r1 = 0
            if (r0 == 0) goto L52
            java.lang.Integer r2 = r0.f413432j
            goto L53
        L52:
            r2 = r1
        L53:
            if (r2 != 0) goto L5b
            if (r0 == 0) goto L59
            java.lang.Integer r1 = r0.f413433k
        L59:
            if (r1 == 0) goto L68
        L5b:
            r0 = 1
            r3.setIncludeFontPadding(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L68
            androidx.media.p.u(r3)
        L68:
            l3.i r0 = r3.textStyleData
            if (r0 == 0) goto L77
            java.lang.Integer r0 = r0.f413432j
            if (r0 == 0) goto L77
            int r0 = r0.intValue()
            r3.setFirstBaselineToTopHeight(r0)
        L77:
            l3.i r0 = r3.textStyleData
            if (r0 == 0) goto L86
            java.lang.Integer r0 = r0.f413433k
            if (r0 == 0) goto L86
            int r0 = r0.intValue()
            r3.setLastBaselineToBottomHeight(r0)
        L86:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.akita.view.foundation.ui.text.a.b():void");
    }

    @SuppressLint({"CustomColorsKotlin"})
    public final i f(AttributeSet attributeSet, int i12) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C42187a.b.f405423a, 0, i12);
        i.a aVar = i.f413422l;
        Context context = getContext();
        aVar.getClass();
        i iVarA = i.a.a(typedArrayObtainStyledAttributes, context);
        typedArrayObtainStyledAttributes.recycle();
        return iVarA;
    }

    @k
    public i getAkitaTextStyleData() {
        i iVar = this.textStyleData;
        return iVar == null ? new i(null, null, null, 0, null, null, null, null, null, null, null, 2047, null) : iVar;
    }

    @Override // l3.c
    public void setAkitaTextStyleData(@k i styleData) {
        this.textStyleData = styleData;
        b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [android.widget.TextView, com.akita.view.foundation.ui.text.a] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.text.SpannableStringBuilder, android.text.Spanned, java.lang.CharSequence] */
    @Override // android.widget.TextView
    public final void setText(@l CharSequence charSequence, @l TextView.BufferType bufferType) {
        Integer num;
        Integer num2;
        ?? ValueOf = charSequence;
        if (this.textStyleData != null && ValueOf != 0) {
            Class[] clsArr = {l3.l.class, d.class, f.class};
            int i12 = 0;
            while (true) {
                if (i12 >= 3) {
                    break;
                }
                Class cls = clsArr[i12];
                if (ValueOf instanceof Spanned ? !(((Spanned) ValueOf).getSpans(0, charSequence.length(), cls).length == 0) : false) {
                    ValueOf = SpannableStringBuilder.valueOf(charSequence);
                    l3.l[] lVarArr = (l3.l[]) ValueOf.getSpans(0, ValueOf.length(), l3.l.class);
                    if (lVarArr.length == 1 && ValueOf.getSpanStart(C42756l.Z(lVarArr)) == 0 && ValueOf.getSpanEnd(C42756l.Z(lVarArr)) == ValueOf.length()) {
                        l3.l lVar = (l3.l) C42756l.Z(lVarArr);
                        ValueOf.removeSpan(lVar);
                        lVar.getClass();
                        setAkitaTextStyleData(null);
                    }
                    for (d dVar : (d[]) ValueOf.getSpans(0, ValueOf.length(), d.class)) {
                        int spanStart = ValueOf.getSpanStart(dVar);
                        int spanEnd = ValueOf.getSpanEnd(dVar);
                        ValueOf.removeSpan(dVar);
                        i iVar = this.textStyleData;
                        int lineHeight = (iVar == null || (num2 = iVar.f413427e) == null) ? getLineHeight() : num2.intValue();
                        i iVar2 = this.textStyleData;
                        ValueOf.setSpan(new e(lineHeight, (iVar2 == null || (num = iVar2.f413428f) == null) ? 0 : num.intValue(), dVar.f413417a), spanStart, spanEnd, 33);
                    }
                    for (f fVar : (f[]) ValueOf.getSpans(0, ValueOf.length(), f.class)) {
                        int spanStart2 = ValueOf.getSpanStart(fVar);
                        int spanEnd2 = ValueOf.getSpanEnd(fVar);
                        Object[] spans = ValueOf.getSpans(spanStart2, spanEnd2, g.class);
                        g gVar = (g) (spans.length == 0 ? null : spans[spans.length - 1]);
                        if (gVar != null) {
                            gVar.a();
                            throw null;
                        }
                        i iVar3 = this.textStyleData;
                        Typeface typeface = iVar3 != null ? iVar3.f413431i : null;
                        if (gVar != null) {
                            gVar.c();
                            throw null;
                        }
                        if (typeface != null) {
                            ValueOf.setSpan(new C43532a(typeface, null), spanStart2, spanEnd2, 33);
                        }
                    }
                } else {
                    i12++;
                }
            }
        }
        super.setText(ValueOf, bufferType);
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int resId) {
        super.setTextAppearance(resId);
        this.textStyleData = f(null, resId);
        b();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    @InterfaceC42830m
    public final void setTextAppearance(@l Context context, int i12) {
        super.setTextAppearance(context, i12);
        this.textStyleData = f(null, i12);
        b();
    }

    private static /* synthetic */ void getTextStyleData$annotations() {
    }
}
