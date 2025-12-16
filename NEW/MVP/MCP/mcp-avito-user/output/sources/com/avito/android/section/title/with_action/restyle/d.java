package com.avito.android.section.title.with_action.restyle;

import Y61.k;
import Y61.l;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import m.C43852a;

/* compiled from: SectionTitleWithActionRestyleItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/section/title/with_action/restyle/d;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/section/title/with_action/restyle/c;", "a", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d extends com.avito.konveyor.adapter.b implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f264909b;

    /* compiled from: SectionTitleWithActionRestyleItemView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/section/title/with_action/restyle/d$a;", "Landroid/text/style/ImageSpan;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends ImageSpan {
        @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
        public final void draw(@k Canvas canvas, @l CharSequence charSequence, int i12, int i13, float f12, int i14, int i15, int i16, @k Paint paint) {
            Drawable drawable = getDrawable();
            canvas.save();
            canvas.translate(f12, (i16 - drawable.getBounds().bottom) - y6.b(1));
            drawable.draw(canvas);
            canvas.restore();
        }
    }

    /* compiled from: SectionTitleWithActionRestyleItemView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/section/title/with_action/restyle/d$b", "Landroid/text/style/ClickableSpan;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends ClickableSpan {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f264910b;

        public b(Y41.a<G0> aVar) {
            this.f264910b = aVar;
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(@k View view) {
            this.f264910b.invoke();
        }
    }

    public d(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.section_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById;
        this.f264909b = textView;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // com.avito.android.section.title.with_action.restyle.c
    public final void SW(@l String str, boolean z12, @k Y41.a<G0> aVar) {
        TextView textView = this.f264909b;
        if (str == null) {
            D6.w(textView);
            return;
        }
        if (!z12) {
            I5.a(textView, str, false);
            return;
        }
        Drawable drawableA = C43852a.a(textView.getContext(), R.drawable.ic_forward_restyle);
        if (drawableA == null) {
            I5.a(textView, str, false);
            return;
        }
        drawableA.setBounds(0, 0, drawableA.getIntrinsicWidth(), drawableA.getIntrinsicHeight());
        a aVar2 = new a(drawableA);
        b bVar = new b(aVar);
        SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder(str).append((CharSequence) " ").append("_", aVar2, 33);
        spannableStringBuilderAppend.setSpan(bVar, spannableStringBuilderAppend.length() - 1, spannableStringBuilderAppend.length(), 33);
        textView.setText(spannableStringBuilderAppend);
    }
}
