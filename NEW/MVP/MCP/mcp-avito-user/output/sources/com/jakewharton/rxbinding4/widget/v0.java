package com.jakewharton.rxbinding4.widget;

import android.widget.SeekBar;
import kotlin.Metadata;

/* compiled from: SeekBarChangeEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/jakewharton/rxbinding4/widget/v0;", "Lcom/jakewharton/rxbinding4/widget/s0;", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public final /* data */ class v0 extends s0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final SeekBar f364250a;

    /* renamed from: b, reason: collision with root package name */
    public final int f364251b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f364252c;

    public v0(@Y61.k SeekBar seekBar, int i12, boolean z12) {
        super(null);
        this.f364250a = seekBar;
        this.f364251b = i12;
        this.f364252c = z12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return kotlin.jvm.internal.L.f(this.f364250a, v0Var.f364250a) && this.f364251b == v0Var.f364251b && this.f364252c == v0Var.f364252c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        SeekBar seekBar = this.f364250a;
        int iE2 = androidx.appcompat.app.r.e(this.f364251b, (seekBar != null ? seekBar.hashCode() : 0) * 31, 31);
        boolean z12 = this.f364252c;
        int i12 = z12;
        if (z12 != 0) {
            i12 = 1;
        }
        return iE2 + i12;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SeekBarProgressChangeEvent(view=");
        sb2.append(this.f364250a);
        sb2.append(", progress=");
        sb2.append(this.f364251b);
        sb2.append(", fromUser=");
        return androidx.appcompat.app.r.s(")", sb2, this.f364252c);
    }
}
