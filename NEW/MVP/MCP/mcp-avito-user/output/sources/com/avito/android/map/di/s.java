package com.avito.android.map.di;

import com.avito.android.map.mvi.C31630t;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: MapModule.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class s extends H implements Y41.a<C31630t> {
    @Override // Y41.a
    public final C31630t invoke() {
        return (C31630t) ((Provider) this.receiver).get();
    }
}
