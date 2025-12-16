package com.avito.android.remote.model.converters;

import X41.n;
import Y61.k;
import dagger.internal.h;
import kotlin.Metadata;

/* compiled from: SharingButtonConverterImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lcom/avito/android/remote/model/converters/SharingButtonConverterImpl_Factory;", "Ldagger/internal/h;", "Lcom/avito/android/remote/model/converters/SharingButtonConverterImpl;", "<init>", "()V", "create", "()Lcom/avito/android/remote/model/converters/SharingButtonConverterImpl_Factory;", "newInstance", "()Lcom/avito/android/remote/model/converters/SharingButtonConverterImpl;", "get", "_avito-discouraged_avito-api_search"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SharingButtonConverterImpl_Factory implements h<SharingButtonConverterImpl> {

    @k
    public static final SharingButtonConverterImpl_Factory INSTANCE = new SharingButtonConverterImpl_Factory();

    private SharingButtonConverterImpl_Factory() {
    }

    @n
    @k
    public static final SharingButtonConverterImpl_Factory create() {
        return INSTANCE;
    }

    @n
    @k
    public static final SharingButtonConverterImpl newInstance() {
        return new SharingButtonConverterImpl();
    }

    @Override // javax.inject.Provider
    @k
    public SharingButtonConverterImpl get() {
        return newInstance();
    }
}
