package com.yandex.div.core.dagger;

import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: DivKitHistogramsModule.kt */
@Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
final /* synthetic */ class r extends H implements Y41.a<com.yandex.div.histogram.reporter.a> {
    @Override // Y41.a
    public final com.yandex.div.histogram.reporter.a invoke() {
        return (com.yandex.div.histogram.reporter.a) ((Provider) this.receiver).get();
    }
}
