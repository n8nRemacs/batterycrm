package com.avito.android.remote.model;

import X41.n;
import Y61.k;
import dagger.internal.h;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SuggestParamsConverterImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\n¨\u0006\f"}, d2 = {"Lcom/avito/android/remote/model/SuggestParamsConverterImpl_Factory;", "Ldagger/internal/h;", "Lcom/avito/android/remote/model/SuggestParamsConverterImpl;", "Ljavax/inject/Provider;", "Lcom/avito/android/remote/model/SearchParamsConverter;", "searchParamsConverter", "<init>", "(Ljavax/inject/Provider;)V", "get", "()Lcom/avito/android/remote/model/SuggestParamsConverterImpl;", "Ljavax/inject/Provider;", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SuggestParamsConverterImpl_Factory implements h<SuggestParamsConverterImpl> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    private final Provider<SearchParamsConverter> searchParamsConverter;

    /* compiled from: SuggestParamsConverterImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0007H\u0007¨\u0006\n"}, d2 = {"Lcom/avito/android/remote/model/SuggestParamsConverterImpl_Factory$Companion;", "", "()V", "create", "Lcom/avito/android/remote/model/SuggestParamsConverterImpl_Factory;", "searchParamsConverter", "Ljavax/inject/Provider;", "Lcom/avito/android/remote/model/SearchParamsConverter;", "newInstance", "Lcom/avito/android/remote/model/SuggestParamsConverterImpl;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @n
        @k
        public final SuggestParamsConverterImpl_Factory create(@k Provider<SearchParamsConverter> searchParamsConverter) {
            return new SuggestParamsConverterImpl_Factory(searchParamsConverter);
        }

        @n
        @k
        public final SuggestParamsConverterImpl newInstance(@k SearchParamsConverter searchParamsConverter) {
            return new SuggestParamsConverterImpl(searchParamsConverter);
        }

        private Companion() {
        }
    }

    public SuggestParamsConverterImpl_Factory(@k Provider<SearchParamsConverter> provider) {
        this.searchParamsConverter = provider;
    }

    @n
    @k
    public static final SuggestParamsConverterImpl_Factory create(@k Provider<SearchParamsConverter> provider) {
        return INSTANCE.create(provider);
    }

    @n
    @k
    public static final SuggestParamsConverterImpl newInstance(@k SearchParamsConverter searchParamsConverter) {
        return INSTANCE.newInstance(searchParamsConverter);
    }

    @Override // javax.inject.Provider
    @k
    public SuggestParamsConverterImpl get() {
        return INSTANCE.newInstance(this.searchParamsConverter.get());
    }
}
