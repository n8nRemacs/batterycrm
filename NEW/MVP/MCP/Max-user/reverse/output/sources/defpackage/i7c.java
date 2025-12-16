package defpackage;

import android.os.strictmode.CustomViolation;
import android.os.strictmode.DiskReadViolation;
import android.os.strictmode.NetworkViolation;
import android.os.strictmode.UntaggedSocketViolation;
import android.text.PrecomputedText;
import android.text.TextPaint;

/* loaded from: classes.dex */
public abstract /* synthetic */ class i7c {
    public static /* synthetic */ PrecomputedText.Params.Builder i(TextPaint textPaint) {
        return new PrecomputedText.Params.Builder(textPaint);
    }

    public static /* bridge */ /* synthetic */ Class l() {
        return DiskReadViolation.class;
    }

    public static /* bridge */ /* synthetic */ boolean v(CharSequence charSequence) {
        return charSequence instanceof PrecomputedText;
    }

    public static /* bridge */ /* synthetic */ Class x() {
        return UntaggedSocketViolation.class;
    }

    public static /* bridge */ /* synthetic */ Class y() {
        return CustomViolation.class;
    }

    public static /* bridge */ /* synthetic */ Class z() {
        return NetworkViolation.class;
    }
}
