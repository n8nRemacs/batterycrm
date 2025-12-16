package com.yandex.div.core.dagger;

import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: DivHistogramsModule.kt */
@Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
final /* synthetic */ class n extends H implements Y41.a<com.yandex.div.histogram.m> {
    @Override // Y41.a
    public final com.yandex.div.histogram.m invoke() {
        return (com.yandex.div.histogram.m) ((Provider) this.receiver).get();
    }
}
