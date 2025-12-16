package com.avito.android.remote.model;

import X41.n;
import Y61.k;
import dagger.internal.h;
import kotlin.Metadata;

/* compiled from: SearchParamsConverterImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lcom/avito/android/remote/model/SearchParamsConverterImpl_Factory;", "Ldagger/internal/h;", "Lcom/avito/android/remote/model/SearchParamsConverterImpl;", "<init>", "()V", "create", "()Lcom/avito/android/remote/model/SearchParamsConverterImpl_Factory;", "newInstance", "()Lcom/avito/android/remote/model/SearchParamsConverterImpl;", "get", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SearchParamsConverterImpl_Factory implements h<SearchParamsConverterImpl> {

    @k
    public static final SearchParamsConverterImpl_Factory INSTANCE = new SearchParamsConverterImpl_Factory();

    private SearchParamsConverterImpl_Factory() {
    }

    @n
    @k
    public static final SearchParamsConverterImpl_Factory create() {
        return INSTANCE;
    }

    @n
    @k
    public static final SearchParamsConverterImpl newInstance() {
        return new SearchParamsConverterImpl();
    }

    @Override // javax.inject.Provider
    @k
    public SearchParamsConverterImpl get() {
        return newInstance();
    }
}
