package com.avito.android.remote.model;

import UV0.a;
import java.io.Closeable;
import kotlin.Metadata;

/* compiled from: CloseableDataSource.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/model/CloseableDataSource;", "T", "LUV0/a;", "Ljava/io/Closeable;", "_common_konveyor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface CloseableDataSource<T> extends a<T>, Closeable {
    @Override // UV0.a
    /* synthetic */ int getCount();

    @Override // UV0.a
    /* synthetic */ Object getItem(int i12);

    @Override // UV0.a
    /* synthetic */ boolean isEmpty();
}
