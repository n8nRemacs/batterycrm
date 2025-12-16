package com.avito.android.rating.details.di;

import com.avito.android.rating.details.mvi.I;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: RatingDetailsModule.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final /* synthetic */ class d extends H implements Y41.a<I> {
    @Override // Y41.a
    public final I invoke() {
        return (I) ((Provider) this.receiver).get();
    }
}
