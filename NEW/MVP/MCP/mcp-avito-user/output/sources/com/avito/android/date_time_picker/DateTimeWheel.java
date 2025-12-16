package com.avito.android.date_time_picker;

import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DateTimeWheel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/date_time_picker/DateTimeWheel;", "", "Type", "_avito_date-time-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DateTimeWheel {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Type f132589a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Integer f132590b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Integer f132591c;

    /* renamed from: d, reason: collision with root package name */
    public final int f132592d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DateTimeWheel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/date_time_picker/DateTimeWheel$Type;", "", "_avito_date-time-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        /* renamed from: b, reason: collision with root package name */
        public static final Type f132593b;

        /* renamed from: c, reason: collision with root package name */
        public static final Type f132594c;

        /* renamed from: d, reason: collision with root package name */
        public static final Type f132595d;

        /* renamed from: e, reason: collision with root package name */
        public static final Type f132596e;

        /* renamed from: f, reason: collision with root package name */
        public static final Type f132597f;

        /* renamed from: g, reason: collision with root package name */
        public static final Type f132598g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ Type[] f132599h;

        /* renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f132600i;

        static {
            Type type = new Type("DAY", 0);
            f132593b = type;
            Type type2 = new Type("MONTH", 1);
            f132594c = type2;
            Type type3 = new Type("YEAR", 2);
            f132595d = type3;
            Type type4 = new Type("HOUR", 3);
            f132596e = type4;
            Type type5 = new Type("MINUTE", 4);
            f132597f = type5;
            Type type6 = new Type("HOUR_MINUTE", 5);
            f132598g = type6;
            Type[] typeArr = {type, type2, type3, type4, type5, type6};
            f132599h = typeArr;
            f132600i = kotlin.enums.c.a(typeArr);
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f132599h.clone();
        }
    }

    public DateTimeWheel(@Y61.k Type type, @l Integer num, @l Integer num2, int i12) {
        this.f132589a = type;
        this.f132590b = num;
        this.f132591c = num2;
        this.f132592d = i12;
        if (i12 <= 0) {
            throw new IllegalArgumentException("delta should be greater than 0");
        }
        if (num != null && num2 != null && num.intValue() >= num2.intValue()) {
            throw new IllegalArgumentException("min should be smaller than max");
        }
    }

    public /* synthetic */ DateTimeWheel(Type type, Integer num, Integer num2, int i12, int i13, C42822w c42822w) {
        this(type, (i13 & 2) != 0 ? null : num, (i13 & 4) != 0 ? null : num2, (i13 & 8) != 0 ? 1 : i12);
    }
}
