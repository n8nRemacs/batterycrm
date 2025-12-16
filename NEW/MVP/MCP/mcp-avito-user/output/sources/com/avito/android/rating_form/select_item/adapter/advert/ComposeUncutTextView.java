package com.avito.android.rating_form.select_item.adapter.advert;

import android.content.Context;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: ComposeUncutTextView.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0001\u000fR*\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR*\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0005\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/avito/android/rating_form/select_item/adapter/advert/ComposeUncutTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "", "value", "b", "Ljava/lang/String;", "getTruncateString", "()Ljava/lang/String;", "setTruncateString", "(Ljava/lang/String;)V", "truncateString", "c", "getUncutString", "setUncutString", "uncutString", "a", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ComposeUncutTextView extends AppCompatTextView {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public String truncateString;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public String uncutString;

    /* compiled from: ComposeUncutTextView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/rating_form/select_item/adapter/advert/ComposeUncutTextView$a;", "", "<init>", "()V", "", "ELLIPSIZE_SYMBOL", "Ljava/lang/String;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @X41.j
    public ComposeUncutTextView(@Y61.k Context context, @Y61.l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final StaticLayout b(String str) {
        return StaticLayout.Builder.obtain(str, 0, str.length(), new TextPaint(getPaint()), getWidth()).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(getLineSpacingExtra(), getLineSpacingMultiplier()).setMaxLines(2).setEllipsize(TextUtils.TruncateAt.END).build();
    }

    public final void f(String str, String str2) {
        SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder().append((CharSequence) str);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(C35835l0.d(R.attr.gray54, getContext()));
        int length = spannableStringBuilderAppend.length();
        spannableStringBuilderAppend.append((CharSequence) str2);
        spannableStringBuilderAppend.setSpan(foregroundColorSpan, length, spannableStringBuilderAppend.length(), 17);
        setText(SpannableString.valueOf(spannableStringBuilderAppend));
    }

    @Y61.k
    public final String getTruncateString() {
        return this.truncateString;
    }

    @Y61.k
    public final String getUncutString() {
        return this.uncutString;
    }

    public final void setTruncateString(@Y61.k String str) {
        this.truncateString = str;
        post(new com.avito.android.publish.screen.objects.view.actions.h(this, 4));
    }

    public final void setUncutString(@Y61.k String str) {
        String string = C43066x.A0(str).toString();
        this.uncutString = string.length() == 0 ? "" : " ".concat(string);
        post(new com.avito.android.publish.screen.objects.view.actions.h(this, 4));
    }

    public ComposeUncutTextView(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        this.truncateString = "";
        this.uncutString = "";
    }
}
