package com.avito.android.serp.adapter.header;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import j.f0;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import ss0.C48409a;

/* compiled from: HeaderWidget.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/header/HeaderWidget;", "Landroid/widget/LinearLayout;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HeaderWidget extends LinearLayout {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f270133f = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f270134b;

    /* renamed from: c, reason: collision with root package name */
    public final int f270135c;

    /* renamed from: d, reason: collision with root package name */
    public final int f270136d;

    /* renamed from: e, reason: collision with root package name */
    public final int f270137e;

    @j
    public HeaderWidget(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public final void a(@f0 int i12, @l String str, @l List list) {
        removeAllViews();
        if (str != null) {
            com.avito.android.lib.design.text_view.a aVar = new com.avito.android.lib.design.text_view.a(getContext(), null, 0, 0, 14, null);
            aVar.setTextAppearance(i12);
            aVar.setText(str);
            addView(aVar);
            if (list != null && (!list.isEmpty())) {
                ((LinearLayout.LayoutParams) aVar.getLayoutParams()).bottomMargin = this.f270134b;
            }
        }
        if (list != null) {
            Iterator it = list.iterator();
            int i13 = 0;
            while (it.hasNext()) {
                int i14 = i13 + 1;
                String str2 = (String) it.next();
                com.avito.android.lib.design.text_view.a aVar2 = new com.avito.android.lib.design.text_view.a(getContext(), null, 0, 0, 14, null);
                aVar2.setTextAppearance(this.f270136d);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) str2);
                int i15 = 0;
                int i16 = 0;
                while (i15 < spannableStringBuilder.length()) {
                    int i17 = i16 + 1;
                    if (spannableStringBuilder.charAt(i15) == 183) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(C35835l0.d(R.attr.gray28, getContext())), i16, i17, 17);
                    }
                    i15++;
                    i16 = i17;
                }
                aVar2.setText(spannableStringBuilder);
                addView(aVar2);
                if (i13 != list.size() - 1) {
                    ((LinearLayout.LayoutParams) aVar2.getLayoutParams()).bottomMargin = this.f270135c;
                }
                i13 = i14;
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HeaderWidget(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        attributeSet = (i14 & 2) != 0 ? null : attributeSet;
        i12 = (i14 & 4) != 0 ? R.attr.headerWidget : i12;
        i13 = (i14 & 8) != 0 ? R.style.Widget_HeaderWidget : i13;
        super(context, attributeSet, i12, i13);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C48409a.k.f438902a, i12, i13);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f270137e = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.f270136d = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        }
        this.f270135c = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, this.f270135c);
        this.f270134b = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, this.f270134b);
        typedArrayObtainStyledAttributes.recycle();
    }
}
