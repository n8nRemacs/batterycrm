package com.google.android.gms.common.data;

import j.N;
import java.io.Closeable;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
public interface b<T> extends Iterable<T>, com.google.android.gms.common.api.o, Closeable {
    @N
    T get(int i12);

    int getCount();
}
