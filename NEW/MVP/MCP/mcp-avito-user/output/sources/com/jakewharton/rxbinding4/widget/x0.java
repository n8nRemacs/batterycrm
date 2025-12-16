package com.jakewharton.rxbinding4.widget;

import android.widget.SeekBar;
import kotlin.Metadata;

/* compiled from: SeekBarChangeEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/jakewharton/rxbinding4/widget/x0;", "Lcom/jakewharton/rxbinding4/widget/s0;", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public final /* data */ class x0 extends s0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final SeekBar f364255a;

    public x0(@Y61.k SeekBar seekBar) {
        super(null);
        this.f364255a = seekBar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x0) {
            return kotlin.jvm.internal.L.f(this.f364255a, ((x0) obj).f364255a);
        }
        return false;
    }

    public final int hashCode() {
        SeekBar seekBar = this.f364255a;
        if (seekBar != null) {
            return seekBar.hashCode();
        }
        return 0;
    }

    @Y61.k
    public final String toString() {
        return "SeekBarStopChangeEvent(view=" + this.f364255a + ")";
    }
}
