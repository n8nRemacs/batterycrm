package com.avito.android.advert_details.generated.api.api_1_str_booking_neighboring_dates_by_item_id_get;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import ba.C25605b;
import ba.C25607d;
import ba.e;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: Api1StrBookingNeighboringDatesByItemIdGetResponse.kt */
@P
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0018B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/avito/android/advert_details/generated/api/api_1_str_booking_neighboring_dates_by_item_id_get/NeighboringDatesV3ItemsItem;", "", "Lba/b;", "content", "Lba/d;", "later", "Lba/e;", "previously", "Lcom/avito/android/advert_details/generated/api/api_1_str_booking_neighboring_dates_by_item_id_get/NeighboringDatesV3ItemsItem$Type;", "type", "<init>", "(Lba/b;Lba/d;Lba/e;Lcom/avito/android/advert_details/generated/api/api_1_str_booking_neighboring_dates_by_item_id_get/NeighboringDatesV3ItemsItem$Type;)V", "Lba/b;", "a", "()Lba/b;", "Lba/d;", "b", "()Lba/d;", "Lba/e;", "c", "()Lba/e;", "Lcom/avito/android/advert_details/generated/api/api_1_str_booking_neighboring_dates_by_item_id_get/NeighboringDatesV3ItemsItem$Type;", "d", "()Lcom/avito/android/advert_details/generated/api/api_1_str_booking_neighboring_dates_by_item_id_get/NeighboringDatesV3ItemsItem$Type;", "Type", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class NeighboringDatesV3ItemsItem {

    @c("content")
    @k
    private final C25605b content;

    @c("later")
    @l
    private final C25607d later;

    @c("previously")
    @l
    private final e previously;

    @c("type")
    @k
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Api1StrBookingNeighboringDatesByItemIdGetResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/advert_details/generated/api/api_1_str_booking_neighboring_dates_by_item_id_get/NeighboringDatesV3ItemsItem$Type;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "DefaultDate", "SelectDate", "StartPositionDate", "PreloaderDate", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        @c("defaultDate")
        public static final Type DefaultDate;

        @c("preloaderDate")
        public static final Type PreloaderDate;

        @c("selectDate")
        public static final Type SelectDate;

        @c("startPositionDate")
        public static final Type StartPositionDate;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Type[] f84417b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f84418c;

        static {
            Type type = new Type("DefaultDate", 0, "defaultDate");
            DefaultDate = type;
            Type type2 = new Type("SelectDate", 1, "selectDate");
            SelectDate = type2;
            Type type3 = new Type("StartPositionDate", 2, "startPositionDate");
            StartPositionDate = type3;
            Type type4 = new Type("PreloaderDate", 3, "preloaderDate");
            PreloaderDate = type4;
            Type[] typeArr = {type, type2, type3, type4};
            f84417b = typeArr;
            f84418c = kotlin.enums.c.a(typeArr);
        }

        private Type(String str, int i12, String str2) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f84417b.clone();
        }
    }

    public NeighboringDatesV3ItemsItem(@k C25605b c25605b, @l C25607d c25607d, @l e eVar, @k Type type) {
        this.content = c25605b;
        this.later = c25607d;
        this.previously = eVar;
        this.type = type;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final C25605b getContent() {
        return this.content;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final C25607d getLater() {
        return this.later;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final e getPreviously() {
        return this.previously;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final Type getType() {
        return this.type;
    }
}
