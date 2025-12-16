package com.avito.android.str_seller_orders_calendar.strorderscalendar.items.date_item;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DateItem.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/items/date_item/DateItem;", "Lcom/avito/conveyor_item/a;", "Type", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DateItem implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f290897b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Type f290898c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f290899d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DateItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/items/date_item/DateItem$Type;", "", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        /* renamed from: b, reason: collision with root package name */
        public static final Type f290900b;

        /* renamed from: c, reason: collision with root package name */
        public static final Type f290901c;

        /* renamed from: d, reason: collision with root package name */
        public static final Type f290902d;

        /* renamed from: e, reason: collision with root package name */
        public static final Type f290903e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ Type[] f290904f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f290905g;

        static {
            Type type = new Type("UNAVAILABLE", 0);
            f290900b = type;
            Type type2 = new Type("TODAY", 1);
            f290901c = type2;
            Type type3 = new Type("REGULAR", 2);
            f290902d = type3;
            Type type4 = new Type("WEEKEND", 3);
            f290903e = type4;
            Type[] typeArr = {type, type2, type3, type4};
            f290904f = typeArr;
            f290905g = kotlin.enums.c.a(typeArr);
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f290904f.clone();
        }
    }

    public DateItem(@k String str, @k Type type) {
        this.f290897b = str;
        this.f290898c = type;
        this.f290899d = str;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DateItem)) {
            return false;
        }
        DateItem dateItem = (DateItem) obj;
        return L.f(this.f290897b, dateItem.f290897b) && this.f290898c == dateItem.f290898c;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF273715b() {
        return getF289436b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF289436b() {
        return this.f290899d;
    }

    public final int hashCode() {
        return this.f290898c.hashCode() + (this.f290897b.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "DateItem(formattedDate=" + this.f290897b + ", type=" + this.f290898c + ')';
    }
}
