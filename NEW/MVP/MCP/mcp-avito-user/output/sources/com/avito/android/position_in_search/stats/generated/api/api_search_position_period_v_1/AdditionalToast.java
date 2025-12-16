package com.avito.android.position_in_search.stats.generated.api.api_search_position_period_v_1;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: ApiSearchPositionPeriodV1Response.kt */
@P
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0015B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/avito/android/position_in_search/stats/generated/api/api_search_position_period_v_1/AdditionalToast;", "", "", "closable", "", "message", "showRefreshButton", "Lcom/avito/android/position_in_search/stats/generated/api/api_search_position_period_v_1/AdditionalToast$Type;", "type", "<init>", "(ZLjava/lang/String;ZLcom/avito/android/position_in_search/stats/generated/api/api_search_position_period_v_1/AdditionalToast$Type;)V", "Z", "a", "()Z", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "Lcom/avito/android/position_in_search/stats/generated/api/api_search_position_period_v_1/AdditionalToast$Type;", "d", "()Lcom/avito/android/position_in_search/stats/generated/api/api_search_position_period_v_1/AdditionalToast$Type;", "Type", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AdditionalToast {

    @c("closable")
    private final boolean closable;

    @c("message")
    @k
    private final String message;

    @c("showRefreshButton")
    private final boolean showRefreshButton;

    @c("type")
    @k
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ApiSearchPositionPeriodV1Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/position_in_search/stats/generated/api/api_search_position_period_v_1/AdditionalToast$Type;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Default", "Error", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        @c("default")
        public static final Type Default;

        @c("error")
        public static final Type Error;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Type[] f220342b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f220343c;

        static {
            Type type = new Type("Default", 0, "default");
            Default = type;
            Type type2 = new Type("Error", 1, "error");
            Error = type2;
            Type[] typeArr = {type, type2};
            f220342b = typeArr;
            f220343c = kotlin.enums.c.a(typeArr);
        }

        private Type(String str, int i12, String str2) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f220342b.clone();
        }
    }

    public AdditionalToast(boolean z12, @k String str, boolean z13, @k Type type) {
        this.closable = z12;
        this.message = str;
        this.showRefreshButton = z13;
        this.type = type;
    }

    /* renamed from: a, reason: from getter */
    public final boolean getClosable() {
        return this.closable;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getShowRefreshButton() {
        return this.showRefreshButton;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final Type getType() {
        return this.type;
    }
}
