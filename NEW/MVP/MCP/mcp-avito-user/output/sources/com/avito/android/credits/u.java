package com.avito.android.credits;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import m.C43852a;
import sK0.C48063a;

/* compiled from: CreditContestUtils.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_credits_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class u {

    /* compiled from: CreditContestUtils.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ TextView f129053l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(TextView textView) {
            super(0);
            this.f129053l = textView;
        }

        @Override // Y41.a
        public final Boolean invoke() {
            TextView textView = this.f129053l;
            textView.getPaint().setShader(new LinearGradient(0.0f, 0.0f, textView.getMeasuredWidth(), textView.getMeasuredHeight(), new int[]{androidx.core.content.d.getColor(textView.getContext(), R.color.green), androidx.core.content.d.getColor(textView.getContext(), R.color.blue700), androidx.core.content.d.getColor(textView.getContext(), R.color.red600), androidx.core.content.d.getColor(textView.getContext(), R.color.violet600)}, (float[]) null, Shader.TileMode.CLAMP));
            return Boolean.FALSE;
        }
    }

    public static final void a(@Y61.k TextView textView, @Y61.l String str, @Y61.l UniversalColor universalColor) {
        if (str == null) {
            D6.w(textView);
            return;
        }
        SpannableString spannableString = new SpannableString(str.concat("   "));
        Drawable drawableA = C43852a.a(textView.getContext(), R.drawable.ic_arrow_10);
        Integer num = null;
        if (universalColor != null) {
            int iA2 = C48063a.f437606a.a(textView.getContext(), universalColor);
            Integer numValueOf = Integer.valueOf(iA2);
            textView.setTextColor(iA2);
            textView.getPaint().setShader(null);
            num = numValueOf;
        }
        if (drawableA != null) {
            drawableA.setTint(num != null ? num.intValue() : androidx.core.content.d.getColor(textView.getContext(), R.color.contest_arrow_icon_color));
            drawableA.setBounds(0, 0, drawableA.getIntrinsicWidth(), drawableA.getIntrinsicHeight());
            spannableString.setSpan(new ImageSpan(drawableA, 1), spannableString.length() - 1, spannableString.length(), 33);
        }
        I5.a(textView, spannableString, false);
        if (num == null) {
            D6.C(new a(textView), textView);
        }
    }
}
