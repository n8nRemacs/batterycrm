package com.yandex.div.core.dagger;

import java.util.concurrent.Executor;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: DivKitHistogramsModule.kt */
@Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
final /* synthetic */ class s extends H implements Y41.a<Executor> {
    @Override // Y41.a
    public final Executor invoke() {
        return (Executor) ((Provider) this.receiver).get();
    }
}
