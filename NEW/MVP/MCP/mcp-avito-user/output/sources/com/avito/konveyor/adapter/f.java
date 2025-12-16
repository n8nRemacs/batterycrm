package com.avito.konveyor.adapter;

import Y61.k;
import android.os.Trace;
import kotlin.Metadata;

/* compiled from: SimpleAdapterPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/konveyor/adapter/f;", "", "a", "b", "_common_konveyor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface f {

    /* compiled from: SimpleAdapterPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/konveyor/adapter/f$a;", "Lcom/avito/konveyor/adapter/f;", "<init>", "()V", "_common_konveyor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements f {
        @Override // com.avito.konveyor.adapter.f
        public final <T> T a(@k String str, @k Y41.a<? extends T> aVar) {
            Trace.beginSection(str);
            try {
                return aVar.invoke();
            } finally {
                Trace.endSection();
            }
        }
    }

    /* compiled from: SimpleAdapterPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/konveyor/adapter/f$b;", "Lcom/avito/konveyor/adapter/f;", "<init>", "()V", "_common_konveyor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements f {
        static {
            new b();
        }

        @Override // com.avito.konveyor.adapter.f
        public final <T> T a(@k String str, @k Y41.a<? extends T> aVar) {
            return aVar.invoke();
        }
    }

    <T> T a(@k String str, @k Y41.a<? extends T> aVar);
}
