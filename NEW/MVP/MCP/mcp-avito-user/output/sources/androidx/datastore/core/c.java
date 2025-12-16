package androidx.datastore.core;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: DataMigration.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/datastore/core/c;", "T", "", "datastore-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface c<T> {
    @Y61.l
    G0 s();

    @Y61.l
    Object t(Object obj, @Y61.k ContinuationImpl continuationImpl);

    @Y61.l
    Object u(T t12, @Y61.k Continuation<? super T> continuation);
}
