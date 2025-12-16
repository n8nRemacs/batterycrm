package com.avito.android.analytics.clickstream;

import com.avito.android.util.V2;
import com.google.protobuf.InterfaceC37707w0;
import java.io.OutputStream;
import kotlin.Metadata;
import proto.events.apps.EventOuterClass;

/* compiled from: DiskStorageConverter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/analytics/clickstream/d0;", "Lcom/google/protobuf/w0;", "T", "Lcom/avito/android/analytics/inhouse_transport/c;", "_common_analytics-clickstream_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class d0<T extends InterfaceC37707w0> implements com.avito.android.analytics.inhouse_transport.c<T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final EventOuterClass.Event.a f89782a;

    public d0(@Y61.k EventOuterClass.Event.a aVar) {
        this.f89782a = aVar;
    }

    @Override // com.squareup.tape2.c.a
    public final void a(Object obj, OutputStream outputStream) {
        ((InterfaceC37707w0) obj).writeTo(outputStream);
    }

    @Override // com.squareup.tape2.c.a
    public final Object b(byte[] bArr) {
        try {
            EventOuterClass.Event.a aVarClone = this.f89782a.clone();
            aVarClone.i(bArr.length, bArr);
            return aVarClone.c5();
        } catch (Exception e12) {
            V2.f318762a.a("ClickStream", "deserialization error", e12);
            return null;
        }
    }
}
