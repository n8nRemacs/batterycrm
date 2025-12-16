package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.style.RelativeSizeSpan;

/* loaded from: classes2.dex */
public final class p17 extends RelativeSizeSpan implements ep8, Parcelable {
    public static final Parcelable.Creator<p17> CREATOR = new wf4(21);
    public final float a;
    public final int b;

    public /* synthetic */ p17() {
        this(1.3f);
    }

    @Override // defpackage.g74
    public final g74 copy() {
        return new p17(this.a);
    }

    @Override // defpackage.ep8
    public final int getType() {
        return this.b;
    }

    @Override // android.text.style.RelativeSizeSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setFakeBoldText(true);
    }

    @Override // android.text.style.RelativeSizeSpan, android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        super.updateMeasureState(textPaint);
        textPaint.setFakeBoldText(true);
    }

    @Override // android.text.style.RelativeSizeSpan, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.a);
    }

    public p17(float f) {
        super(f);
        this.a = f;
        this.b = 8;
    }
}
