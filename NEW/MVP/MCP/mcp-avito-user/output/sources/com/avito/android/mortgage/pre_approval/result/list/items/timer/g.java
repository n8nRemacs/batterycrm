package com.avito.android.mortgage.pre_approval.result.list.items.timer;

import Y61.k;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.circular_counter.CircularCounter;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;

/* compiled from: TimerView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/result/list/items/timer/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/mortgage/pre_approval/result/list/items/timer/f;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final CircularCounter f202079b;

    public g(@k View view) {
        super(view);
        this.f202079b = (CircularCounter) view.findViewById(R.id.timer_progress);
    }

    @Override // com.avito.android.mortgage.pre_approval.result.list.items.timer.f
    public final void FG(@k PrintableText printableText) {
        this.f202079b.setStringCounter(printableText.k0(this.itemView.getContext()));
    }

    @Override // com.avito.android.mortgage.pre_approval.result.list.items.timer.f
    public final void jt(long j12) {
        this.f202079b.setProgressMax(Float.valueOf(j12));
    }

    @Override // com.avito.android.mortgage.pre_approval.result.list.items.timer.f
    public final void n5(float f12) {
        this.f202079b.setProgress(Float.valueOf(f12));
    }
}
