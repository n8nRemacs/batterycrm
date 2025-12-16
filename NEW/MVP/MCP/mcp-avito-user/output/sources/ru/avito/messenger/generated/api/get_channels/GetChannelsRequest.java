package ru.avito.messenger.generated.api.get_channels;

import Y61.k;
import Y61.l;
import c91.C26994z;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: GetChannelsRequest.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0015B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0016"}, d2 = {"Lru/avito/messenger/generated/api/get_channels/GetChannelsRequest;", "", "Lru/avito/messenger/generated/api/get_channels/GetChannelsRequest$Category;", "category", "Lc91/z;", "filters", "", "limit", "offsetTimestamp", "<init>", "(Lru/avito/messenger/generated/api/get_channels/GetChannelsRequest$Category;Lc91/z;Ljava/lang/Long;Ljava/lang/Long;)V", "Lru/avito/messenger/generated/api/get_channels/GetChannelsRequest$Category;", "getCategory", "()Lru/avito/messenger/generated/api/get_channels/GetChannelsRequest$Category;", "Lc91/z;", "getFilters", "()Lc91/z;", "Ljava/lang/Long;", "getLimit", "()Ljava/lang/Long;", "getOffsetTimestamp", "Category", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class GetChannelsRequest {

    @c("category")
    @k
    private final Category category;

    @c("filters")
    @l
    private final C26994z filters;

    @c("limit")
    @l
    private final Long limit;

    @c("offsetTimestamp")
    @l
    private final Long offsetTimestamp;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GetChannelsRequest.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/avito/messenger/generated/api/get_channels/GetChannelsRequest$Category;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "Int0", "Int1", "Int6", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Category {

        @c("0")
        public static final Category Int0;

        @c("1")
        public static final Category Int1;

        @c("6")
        public static final Category Int6;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ Category[] f430978c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ a f430979d;

        /* renamed from: b, reason: collision with root package name */
        public final int f430980b;

        static {
            Category category = new Category("Int0", 0, 0);
            Int0 = category;
            Category category2 = new Category("Int1", 1, 1);
            Int1 = category2;
            Category category3 = new Category("Int6", 2, 6);
            Int6 = category3;
            Category[] categoryArr = {category, category2, category3};
            f430978c = categoryArr;
            f430979d = kotlin.enums.c.a(categoryArr);
        }

        private Category(String str, int i12, int i13) {
            this.f430980b = i13;
        }

        public static Category valueOf(String str) {
            return (Category) Enum.valueOf(Category.class, str);
        }

        public static Category[] values() {
            return (Category[]) f430978c.clone();
        }
    }

    public GetChannelsRequest(@k Category category, @l C26994z c26994z, @l Long l12, @l Long l13) {
        this.category = category;
        this.filters = c26994z;
        this.limit = l12;
        this.offsetTimestamp = l13;
    }
}
