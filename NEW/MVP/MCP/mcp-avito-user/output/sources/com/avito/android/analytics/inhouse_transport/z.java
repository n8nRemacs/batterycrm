package com.avito.android.analytics.inhouse_transport;

import com.avito.android.util.V2;
import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DiskStorageConverter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/analytics/inhouse_transport/z;", "T", "Lcom/avito/android/analytics/inhouse_transport/c;", "<init>", "()V", "_common_analytics-transport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class z<T> implements c<T> {
    @Override // com.squareup.tape2.c.a
    public final void a(T t12, @Y61.k OutputStream outputStream) {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        try {
            objectOutputStream.writeObject(t12);
            G0 g02 = G0.f406611a;
            kotlin.io.c.a(objectOutputStream, null);
        } finally {
        }
    }

    @Override // com.squareup.tape2.c.a
    @Y61.l
    public final T b(@Y61.k byte[] bArr) {
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(bArr));
            try {
                T t12 = (T) objectInputStream.readObject();
                kotlin.io.c.a(objectInputStream, null);
                return t12;
            } finally {
            }
        } catch (Exception e12) {
            V2.f318762a.a("AnalyticsTransport", "EventRecord deserialization error", e12);
            return null;
        }
    }
}
