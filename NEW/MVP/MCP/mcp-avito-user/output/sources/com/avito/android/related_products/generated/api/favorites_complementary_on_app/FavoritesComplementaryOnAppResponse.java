package com.avito.android.related_products.generated.api.favorites_complementary_on_app;

import Y61.l;
import com.avito.android.remote.model.BeduinV2;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: FavoritesComplementaryOnAppResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u000eB\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/avito/android/related_products/generated/api/favorites_complementary_on_app/FavoritesComplementaryOnAppResponse;", "", "Lcom/avito/android/remote/model/BeduinV2;", "result", "Lcom/avito/android/related_products/generated/api/favorites_complementary_on_app/FavoritesComplementaryOnAppResponse$Status;", "status", "<init>", "(Lcom/avito/android/remote/model/BeduinV2;Lcom/avito/android/related_products/generated/api/favorites_complementary_on_app/FavoritesComplementaryOnAppResponse$Status;)V", "Lcom/avito/android/remote/model/BeduinV2;", "a", "()Lcom/avito/android/remote/model/BeduinV2;", "Lcom/avito/android/related_products/generated/api/favorites_complementary_on_app/FavoritesComplementaryOnAppResponse$Status;", "getStatus", "()Lcom/avito/android/related_products/generated/api/favorites_complementary_on_app/FavoritesComplementaryOnAppResponse$Status;", "Status", "_avito_related-products_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class FavoritesComplementaryOnAppResponse {

    @c("result")
    @l
    private final BeduinV2 result;

    @c("status")
    @l
    private final Status status;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FavoritesComplementaryOnAppResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/related_products/generated/api/favorites_complementary_on_app/FavoritesComplementaryOnAppResponse$Status;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ok", "_avito_related-products_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Status {

        /* renamed from: Ok, reason: collision with root package name */
        @c("ok")
        public static final Status f252999Ok;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Status[] f253000b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f253001c;

        static {
            Status status = new Status("Ok", 0, "ok");
            f252999Ok = status;
            Status[] statusArr = {status};
            f253000b = statusArr;
            f253001c = kotlin.enums.c.a(statusArr);
        }

        private Status(String str, int i12, String str2) {
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) f253000b.clone();
        }
    }

    public FavoritesComplementaryOnAppResponse(@l BeduinV2 beduinV2, @l Status status) {
        this.result = beduinV2;
        this.status = status;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final BeduinV2 getResult() {
        return this.result;
    }
}
