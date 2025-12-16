package com.jakewharton.rxbinding4.widget;

import android.widget.SeekBar;
import kotlin.Metadata;

/* compiled from: SeekBarChangeEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/jakewharton/rxbinding4/widget/w0;", "Lcom/jakewharton/rxbinding4/widget/s0;", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public final /* data */ class w0 extends s0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final SeekBar f364254a;

    public w0(@Y61.k SeekBar seekBar) {
        super(null);
        this.f364254a = seekBar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w0) {
            return kotlin.jvm.internal.L.f(this.f364254a, ((w0) obj).f364254a);
        }
        return false;
    }

    public final int hashCode() {
        SeekBar seekBar = this.f364254a;
        if (seekBar != null) {
            return seekBar.hashCode();
        }
        return 0;
    }

    @Y61.k
    public final String toString() {
        return "SeekBarStartChangeEvent(view=" + this.f364254a + ")";
    }
}
