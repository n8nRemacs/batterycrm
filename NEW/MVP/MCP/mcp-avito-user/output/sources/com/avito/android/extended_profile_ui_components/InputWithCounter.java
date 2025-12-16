package com.avito.android.extended_profile_ui_components;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.lib.design.input.Input;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import j.f0;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: InputWithCounter.kt */
@s0
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u000fJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\b\b\u0001\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/avito/android/extended_profile_ui_components/InputWithCounter;", "Landroid/widget/LinearLayout;", "Lcom/avito/android/extended_profile_ui_components/InputWithCounter$a;", VoiceInfo.STATE, "Lkotlin/G0;", "setState", "(Lcom/avito/android/extended_profile_ui_components/InputWithCounter$a;)V", "", "hint", "setHint", "(Ljava/lang/CharSequence;)V", "", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "setInputAppearance", "(I)V", "a", "_avito_extended-profile-ui-components_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class InputWithCounter extends LinearLayout {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f153302e = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Input f153303b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f153304c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public a f153305d;

    /* compiled from: InputWithCounter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_ui_components/InputWithCounter$a;", "", "_avito_extended-profile-ui-components_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f153306a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f153307b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final Integer f153308c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f153309d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final String f153310e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f153311f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final String f153312g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f153313h;

        public a() {
            this(null, false, null, null, null, false, null, false, 255, null);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f153306a, aVar.f153306a) && this.f153307b == aVar.f153307b && L.f(this.f153308c, aVar.f153308c) && L.f(this.f153309d, aVar.f153309d) && L.f(this.f153310e, aVar.f153310e) && this.f153311f == aVar.f153311f && L.f(this.f153312g, aVar.f153312g) && this.f153313h == aVar.f153313h;
        }

        public final int hashCode() {
            String str = this.f153306a;
            int i12 = androidx.appcompat.app.r.i((str == null ? 0 : str.hashCode()) * 31, 31, this.f153307b);
            Integer num = this.f153308c;
            int iHashCode = (i12 + (num == null ? 0 : num.hashCode())) * 31;
            String str2 = this.f153309d;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f153310e;
            int i13 = androidx.appcompat.app.r.i((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f153311f);
            String str4 = this.f153312g;
            return Boolean.hashCode(this.f153313h) + ((i13 + (str4 != null ? str4.hashCode() : 0)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("InputWithCounterState(hint=");
            sb2.append(this.f153306a);
            sb2.append(", isMultiline=");
            sb2.append(this.f153307b);
            sb2.append(", textLimit=");
            sb2.append(this.f153308c);
            sb2.append(", errorInput=");
            sb2.append(this.f153309d);
            sb2.append(", errorMessage=");
            sb2.append(this.f153310e);
            sb2.append(", isRequired=");
            sb2.append(this.f153311f);
            sb2.append(", requiredMessage=");
            sb2.append(this.f153312g);
            sb2.append(", showRequiredError=");
            return androidx.appcompat.app.r.x(sb2, this.f153313h, ')');
        }

        public a(@Y61.l String str, boolean z12, @Y61.l Integer num, @Y61.l String str2, @Y61.l String str3, boolean z13, @Y61.l String str4, boolean z14) {
            this.f153306a = str;
            this.f153307b = z12;
            this.f153308c = num;
            this.f153309d = str2;
            this.f153310e = str3;
            this.f153311f = z13;
            this.f153312g = str4;
            this.f153313h = z14;
        }

        public /* synthetic */ a(String str, boolean z12, Integer num, String str2, String str3, boolean z13, String str4, boolean z14, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? false : z12, (i12 & 4) != 0 ? null : num, (i12 & 8) != 0 ? null : str2, (i12 & 16) != 0 ? null : str3, (i12 & 32) != 0 ? false : z13, (i12 & 64) == 0 ? str4 : null, (i12 & 128) == 0 ? z14 : false);
        }
    }

    @X41.j
    public InputWithCounter(@Y61.k Context context, @Y61.l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public static void a(InputWithCounter inputWithCounter, CharSequence charSequence) {
        Input input = inputWithCounter.f153303b;
        String strValueOf = String.valueOf(input.m53getText());
        String string = charSequence != null ? charSequence.toString() : null;
        if (string == null) {
            string = "";
        }
        if (strValueOf.equals(string)) {
            return;
        }
        input.s(charSequence, false, false);
    }

    public final void b(boolean z12, CharSequence charSequence) {
        TextView textView = this.f153304c;
        I5.a(textView, charSequence, false);
        Input input = this.f153303b;
        if (z12) {
            textView.setTextColor(C35835l0.d(R.attr.red600, getContext()));
            int[] f179312e = input.getF179312E();
            Input.f179303W.getClass();
            int[] iArr = Input.f179305b0;
            if (Arrays.equals(f179312e, iArr)) {
                return;
            }
            input.setState(iArr);
            return;
        }
        textView.setTextColor(C35835l0.d(R.attr.gray54, getContext()));
        int[] f179312e2 = input.getF179312E();
        Input.f179303W.getClass();
        int[] iArr2 = Input.f179304a0;
        if (Arrays.equals(f179312e2, iArr2)) {
            return;
        }
        input.setState(iArr2);
    }

    public final void c(boolean z12) {
        String strValueOf = String.valueOf(this.f153303b.m53getText());
        Integer num = this.f153305d.f153308c;
        if (!C43066x.K(strValueOf) && strValueOf.equals(this.f153305d.f153309d)) {
            String str = this.f153305d.f153310e;
            if (!(str == null || C43066x.K(str))) {
                b(true, this.f153305d.f153310e);
                return;
            }
        }
        a aVar = this.f153305d;
        if (aVar.f153313h && aVar.f153311f && strValueOf.length() == 0) {
            String str2 = this.f153305d.f153312g;
            if (!(str2 == null || C43066x.K(str2))) {
                b(true, this.f153305d.f153312g);
                return;
            }
        }
        if (num == null || (!z12 && strValueOf.length() <= num.intValue())) {
            b(false, null);
            return;
        }
        int length = strValueOf.length();
        int iIntValue = num.intValue();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getResources().getString(R.string.input_with_counter_counter_text, Integer.valueOf(length), num));
        if (length > iIntValue) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(C35835l0.d(R.attr.red600, getContext())), 0, String.valueOf(length).length(), 33);
        }
        b(strValueOf.length() > num.intValue(), spannableStringBuilder);
        this.f153304c.setTextColor(C35835l0.d(R.attr.gray54, getContext()));
    }

    public final void setHint(@Y61.l CharSequence hint) {
        Input input = this.f153303b;
        if (L.f(input.getHint(), hint)) {
            return;
        }
        input.setHint(hint);
    }

    public final void setInputAppearance(@f0 int style) throws Resources.NotFoundException {
        this.f153303b.setAppearance(style);
    }

    public final void setState(@Y61.k a state) {
        if (L.f(this.f153305d, state)) {
            return;
        }
        this.f153305d = state;
        setHint(state.f153306a);
        boolean z12 = state.f153307b;
        Input input = this.f153303b;
        if (z12) {
            Input.p(input, 0, 5, 1);
        } else {
            input.r();
        }
        c(input.hasFocus());
    }

    public InputWithCounter(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        this.f153305d = new a(null, false, null, null, null, false, null, false, 255, null);
        LayoutInflater.from(new androidx.appcompat.view.d(context, R.style.Theme_DesignSystem_Re23)).inflate(R.layout.extended_profile_input_with_counter, this);
        Input input = (Input) findViewById(R.id.extended_profile_input_with_counter_input);
        this.f153303b = input;
        this.f153304c = (TextView) findViewById(R.id.extended_profile_input_with_counter_status);
        input.b(new com.avito.android.lib.design.input.s("", new q(this)));
        input.setOnFocusChangeListener(new com.avito.android.advert.item.fmp.calculator.l(this, 7));
        setOrientation(1);
    }
}
