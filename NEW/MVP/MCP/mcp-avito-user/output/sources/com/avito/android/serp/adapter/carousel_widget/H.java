package com.avito.android.serp.adapter.carousel_widget;

import android.text.StaticLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import com.google.android.flexbox.FlexboxLayout;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: FlexboxLayoutTextHelper.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/carousel_widget/H;", "", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final FlexboxLayout f269285a;

    /* renamed from: b, reason: collision with root package name */
    public final int f269286b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ArrayList f269287c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ArrayList f269288d = new ArrayList();

    public H(@Y61.k FlexboxLayout flexboxLayout) {
        this.f269285a = flexboxLayout;
        this.f269286b = C35835l0.j(R.attr.textH20, flexboxLayout.getContext());
    }

    public final void a(TextView textView, CharSequence charSequence, StaticLayout staticLayout, int i12) {
        textView.setText(charSequence.subSequence(staticLayout.getLineStart(i12), staticLayout.getLineEnd(i12)));
        boolean z12 = i12 == staticLayout.getLineCount() - 1;
        FlexboxLayout.LayoutParams layoutParams = new FlexboxLayout.LayoutParams(-2, -2);
        layoutParams.f348436e = 2;
        if (z12) {
            layoutParams.f348442k = true;
        }
        G0 g02 = G0.f406611a;
        this.f269285a.addView(textView, i12, layoutParams);
        this.f269287c.add(textView);
    }

    public final TextView b() {
        TextView aVar = (TextView) C42745f0.o0(this.f269288d);
        if (aVar == null) {
            aVar = new com.avito.android.lib.design.text_view.a(this.f269285a.getContext(), null, 0, 0, 14, null);
        }
        aVar.setTextAppearance(this.f269286b);
        return aVar;
    }

    public final void c(int i12, @Y61.l CharSequence charSequence) {
        ArrayList arrayList = this.f269287c;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f269285a.removeView((TextView) it.next());
        }
        this.f269288d.addAll(arrayList);
        arrayList.clear();
        if (charSequence == null || charSequence.length() == 0) {
            return;
        }
        TextView textViewB = b();
        StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textViewB.getPaint(), i12).build();
        a(textViewB, charSequence, staticLayoutBuild, 0);
        int lineCount = staticLayoutBuild.getLineCount();
        for (int i13 = 1; i13 < lineCount; i13++) {
            a(b(), charSequence, staticLayoutBuild, i13);
        }
    }
}
