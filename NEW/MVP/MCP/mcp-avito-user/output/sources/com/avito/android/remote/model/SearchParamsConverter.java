package com.avito.android.remote.model;

import Y41.l;
import Y61.k;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SearchParamsConverter.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J^\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000e2\u0006\u0010\u0003\u001a\u00020\u00022#\b\u0002\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH&¢\u0006\u0004\b\u000f\u0010\u0010JJ\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022#\b\u0002\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u0004H&¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/remote/model/SearchParamsConverter;", "", "Lcom/avito/android/remote/model/SearchParams;", "searchParams", "Lkotlin/Function1;", "", "Lkotlin/S;", "name", "key", "keyWrapper", "", "isSubscribeSearch", "Lcom/avito/android/remote/model/PresentationType;", PresentationTypeKt.PRESENTATION_TYPE, "", "convertToMap", "(Lcom/avito/android/remote/model/SearchParams;LY41/l;ZLcom/avito/android/remote/model/PresentationType;)Ljava/util/Map;", "convertParamsToMap", "(Lcom/avito/android/remote/model/SearchParams;LY41/l;)Ljava/util/Map;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface SearchParamsConverter {

    /* compiled from: SearchParamsConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Map convertParamsToMap$default(SearchParamsConverter searchParamsConverter, SearchParams searchParams, l lVar, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: convertParamsToMap");
            }
            if ((i12 & 2) != 0) {
                lVar = AnonymousClass1.INSTANCE;
            }
            return searchParamsConverter.convertParamsToMap(searchParams, lVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Map convertToMap$default(SearchParamsConverter searchParamsConverter, SearchParams searchParams, l lVar, boolean z12, PresentationType presentationType, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: convertToMap");
            }
            if ((i12 & 2) != 0) {
                lVar = C343291.INSTANCE;
            }
            if ((i12 & 4) != 0) {
                z12 = false;
            }
            if ((i12 & 8) != 0) {
                presentationType = null;
            }
            return searchParamsConverter.convertToMap(searchParams, lVar, z12, presentationType);
        }
    }

    /* compiled from: SearchParamsConverter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "it", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.remote.model.SearchParamsConverter$convertParamsToMap$1, reason: invalid class name */
    public static final class AnonymousClass1 extends N implements l<String, String> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // Y41.l
        @k
        public final String invoke(@k String str) {
            return str;
        }
    }

    /* compiled from: SearchParamsConverter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "it", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.remote.model.SearchParamsConverter$convertToMap$1, reason: invalid class name and case insensitive filesystem */
    public static final class C343291 extends N implements l<String, String> {
        public static final C343291 INSTANCE = new C343291();

        public C343291() {
            super(1);
        }

        @Override // Y41.l
        @k
        public final String invoke(@k String str) {
            return str;
        }
    }

    @k
    Map<String, String> convertParamsToMap(@Y61.l SearchParams searchParams, @k l<? super String, String> keyWrapper);

    @k
    Map<String, String> convertToMap(@k SearchParams searchParams, @k l<? super String, String> keyWrapper, boolean isSubscribeSearch, @Y61.l PresentationType presentationType);
}
