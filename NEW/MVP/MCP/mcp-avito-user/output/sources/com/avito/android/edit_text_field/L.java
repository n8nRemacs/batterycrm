package com.avito.android.edit_text_field;

import android.content.Context;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.edit_text_field.y;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import com.avito.android.util.C35835l0;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: EditTextFieldViewModeDelegate.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_text_field/L;", "Lcom/avito/android/edit_text_field/J;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class L implements J {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Input f146922a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Button f146923b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Integer f146924c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Y41.p<String, CharSequence, G0> f146925d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Context f146926e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final DecimalFormat f146927f;

    /* compiled from: EditTextFieldViewModeDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<String, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            String str2 = str;
            L l12 = L.this;
            l12.f146923b.setEnabled(l12.b());
            l12.f146925d.invoke(str2, l12.c(str2.length()));
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public L(@Y61.k Input input, @Y61.k Button button, @Y61.l Integer num, @Y61.k Y41.p<? super String, ? super CharSequence, G0> pVar) {
        this.f146922a = input;
        this.f146923b = button;
        this.f146924c = num;
        this.f146925d = pVar;
        this.f146926e = input.getContext();
        DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getInstance(new Locale("ru", "RU"));
        decimalFormat.setGroupingSize(3);
        decimalFormat.getDecimalFormatSymbols().setGroupingSeparator((char) 160);
        this.f146927f = decimalFormat;
    }

    @Override // com.avito.android.edit_text_field.J
    public final void a() {
        String string;
        Input input = this.f146922a;
        Editable editableM53getText = input.m53getText();
        if (editableM53getText == null || (string = editableM53getText.toString()) == null) {
            string = "";
        }
        ((y.c) this.f146925d).invoke(string, c(string.length()));
        input.o(input.getContext().getResources().getInteger(R.integer.edit_text_field_max_lines), input.getContext().getResources().getInteger(R.integer.edit_text_field_min_lines));
        com.avito.android.lib.design.input.n.c(input, new a());
    }

    @Override // com.avito.android.edit_text_field.J
    public final boolean b() {
        String strValueOf = String.valueOf(this.f146922a.m53getText());
        if (strValueOf.length() >= 0) {
            int length = strValueOf.length();
            Integer num = this.f146924c;
            if (length <= (num != null ? num.intValue() : 3000)) {
                return true;
            }
        }
        return false;
    }

    public final CharSequence c(int i12) {
        Integer num = this.f146924c;
        int iIntValue = num != null ? num.intValue() : 3000;
        Integer numValueOf = Integer.valueOf(iIntValue);
        DecimalFormat decimalFormat = this.f146927f;
        String str = decimalFormat.format(numValueOf);
        Context context = this.f146926e;
        if (i12 == 0) {
            return context.getString(R.string.edit_text_field_default_hint, str);
        }
        String str2 = decimalFormat.format(Integer.valueOf(i12));
        String string = context.getString(R.string.edit_text_field_hint, str2, str);
        if (i12 <= iIntValue) {
            return string;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(C35835l0.d(R.attr.red, this.f146922a.getContext())), 0, str2.length(), 33);
        return spannableStringBuilder;
    }
}
