package com.avito.android.lib.design.input;

import android.text.Editable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.widget.EditText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: CustomMaskFormatter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/input/b;", "Landroid/text/TextWatcher;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements TextWatcher {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final EditText f179388b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public String f179389c = "";

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ EditText f179390d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ FormatterType f179391e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f179392f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f179393g;

    public b(EditText editText, FormatterType formatterType, int i12, int i13) {
        this.f179390d = editText;
        this.f179391e = formatterType;
        this.f179392f = i12;
        this.f179393g = i13;
        this.f179388b = editText;
    }

    public final void a(@Y61.l CharSequence charSequence, @Y61.k CharSequence charSequence2) {
        String str;
        String str2;
        EditText editText = this.f179388b;
        int selectionEnd = editText.getSelectionEnd();
        EditText editText2 = this.f179390d;
        d dVarD = c.d(this.f179391e, charSequence, charSequence2, selectionEnd, c.e(editText2), editText.hasFocus());
        String string = charSequence2.toString();
        FormatterType formatterType = this.f179391e;
        String strC = c.c(formatterType, string);
        String string2 = editText2.getText().toString();
        String str3 = dVarD.f179394a;
        if (!L.f(string2, str3) || strC.length() == 0) {
            SpannableString spannableString = new SpannableString(str3);
            if (str3.length() != 0) {
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(this.f179392f);
                ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(this.f179393g);
                ForegroundColorSpan foregroundColorSpan3 = new ForegroundColorSpan(editText.getTextColors().getColorForState(editText.getDrawableState(), editText.getCurrentTextColor()));
                MaskParameters maskParameters = formatterType.f179302d;
                int length = (maskParameters == null || (str2 = maskParameters.f179371b) == null) ? 0 : str2.length();
                int length2 = (maskParameters == null || (str = maskParameters.f179373d) == null) ? 0 : str.length();
                String str4 = maskParameters != null ? maskParameters.f179373d : null;
                boolean z12 = str4 != null ? C43066x.z(str3, str4, false) : false;
                spannableString.setSpan(foregroundColorSpan, 0, length, 34);
                if (z12) {
                    spannableString.setSpan(foregroundColorSpan2, Math.max(str3.length() - length2, 0), str3.length(), 34);
                }
                spannableString.setSpan(foregroundColorSpan3, length, z12 ? Math.max(str3.length() - length2, 0) : str3.length(), 34);
            }
            editText.removeTextChangedListener(this);
            editText.setText(spannableString);
            editText.addTextChangedListener(this);
            editText.setSelection(Math.min(editText.getText().length(), dVarD.f179395b));
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
        String string;
        if (charSequence == null || (string = charSequence.toString()) == null) {
            string = "";
        }
        this.f179389c = string;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
        if (charSequence == null) {
            return;
        }
        FormatterType.f179288e.getClass();
        if (L.f(this.f179391e, FormatterType.f179289f)) {
            return;
        }
        a(charSequence, this.f179389c);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(@Y61.l Editable editable) {
    }
}
