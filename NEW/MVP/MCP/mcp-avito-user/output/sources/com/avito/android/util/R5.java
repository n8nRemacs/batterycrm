package com.avito.android.util;

import androidx.transition.T;
import kotlin.Metadata;

/* compiled from: Transitions.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/util/R5;", "Landroidx/transition/T;", "T", "Lcom/avito/android/util/Q5;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class R5<T extends androidx.transition.T> extends Q5<T> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final T f318733e;

    public R5(@Y61.k T t12) {
        super(t12);
        this.f318733e = t12;
    }

    @Override // com.avito.android.util.Q5
    public final androidx.transition.L d() {
        return this.f318733e;
    }

    public final <T extends androidx.transition.L> void e(@Y61.k T t12, @Y61.k Y41.l<? super Q5<T>, kotlin.G0> lVar) {
        Q5 q52 = new Q5(t12);
        lVar.invoke(q52);
        this.f318733e.N(q52.c());
    }
}
