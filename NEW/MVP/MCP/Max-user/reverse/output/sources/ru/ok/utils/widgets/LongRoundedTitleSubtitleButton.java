package ru.ok.utils.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.TextAppearanceSpan;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import defpackage.bq4;
import defpackage.bwf;
import defpackage.cei;
import defpackage.f6d;
import defpackage.kti;
import defpackage.nca;
import defpackage.q1g;
import defpackage.r5d;
import defpackage.u1g;
import defpackage.vw4;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002J\u0017\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lru/ok/utils/widgets/LongRoundedTitleSubtitleButton;", "Landroidx/appcompat/widget/AppCompatButton;", "Lu1g;", "", "title", "Lqqg;", "setTitle", "(Ljava/lang/CharSequence;)V", "subtitle", "setSubtitle", "ui-utils_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LongRoundedTitleSubtitleButton extends AppCompatButton implements u1g {
    public CharSequence d;
    public CharSequence o;
    public final TextAppearanceSpan s0;
    public final TextAppearanceSpan t0;

    public LongRoundedTitleSubtitleButton(Context context, AttributeSet attributeSet) {
        q1g q1gVarD;
        super(context, attributeSet, 0);
        this.s0 = new TextAppearanceSpan(context, r5d.UiUtils_TextAppearance_LongRoundedTitleSubtitleButton_Title);
        this.t0 = new TextAppearanceSpan(context, r5d.UiUtils_TextAppearance_LongRoundedTitleSubtitleButton_Subtitle);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f6d.LongRoundedTitleSubtitleButton);
        String string = typedArrayObtainStyledAttributes.getString(f6d.LongRoundedTitleSubtitleButton_lrts_title);
        String string2 = typedArrayObtainStyledAttributes.getString(f6d.LongRoundedTitleSubtitleButton_lrts_subtitle);
        b(string == null ? "" : string, string2 == null ? "" : string2);
        typedArrayObtainStyledAttributes.recycle();
        setGravity(17);
        if (isInEditMode()) {
            q1gVarD = bq4.e0;
        } else {
            Context context2 = getContext();
            bwf bwfVar = q1g.a0;
            q1gVarD = nca.d(context2);
        }
        k(q1gVarD);
    }

    public final void b(CharSequence charSequence, CharSequence charSequence2) {
        SpannableString spannableStringValueOf;
        SpannableString spannableStringValueOf2;
        CharSequence charSequence3 = this.d;
        SpannableString spannableString = null;
        CharSequence charSequence4 = charSequence3;
        if (charSequence != charSequence3) {
            if (charSequence == null || (spannableStringValueOf2 = SpannableString.valueOf(charSequence)) == null) {
                charSequence4 = null;
            } else {
                spannableStringValueOf2.setSpan(this.s0, 0, charSequence.length(), 17);
                charSequence4 = spannableStringValueOf2;
            }
        }
        this.d = charSequence4;
        CharSequence charSequence5 = this.o;
        if (charSequence2 != charSequence5) {
            if (charSequence2 != null && (spannableStringValueOf = SpannableString.valueOf(charSequence2)) != null) {
                spannableStringValueOf.setSpan(this.t0, 0, charSequence2.length(), 17);
                spannableString = spannableStringValueOf;
            }
            charSequence5 = spannableString;
        }
        this.o = charSequence5;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        CharSequence charSequence6 = this.d;
        if (charSequence6 == null) {
            charSequence6 = "";
        }
        SpannableStringBuilder spannableStringBuilderAppend = spannableStringBuilder.append(charSequence6);
        CharSequence charSequence7 = this.o;
        if (charSequence7 != null) {
            spannableStringBuilderAppend.append((CharSequence) "\n").append(charSequence7);
        }
        setText(spannableStringBuilderAppend);
    }

    @Override // defpackage.u1g
    public final void k(q1g q1gVar) {
        cei.b(q1gVar, this, kti.d(42 * vw4.d().getDisplayMetrics().density));
    }

    public final void setSubtitle(CharSequence subtitle) {
        b(this.d, subtitle);
    }

    public final void setTitle(CharSequence title) {
        b(title, this.o);
    }
}
