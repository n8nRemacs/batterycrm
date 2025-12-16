package com.avito.android.str_booking.ui;

import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ScreenType.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_booking/ui/ScreenType;", "", "a", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ScreenType {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f285864b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ ScreenType[] f285865c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f285866d;

    /* compiled from: ScreenType.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_booking/ui/ScreenType$a;", "", "<init>", "()V", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static ScreenType a(@Y61.l String str) {
            ScreenType screenType;
            ScreenType[] screenTypeArrValues = ScreenType.values();
            int length = screenTypeArrValues.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    screenType = null;
                    break;
                }
                screenType = screenTypeArrValues[i12];
                if (L.f(screenType.name(), str)) {
                    break;
                }
                i12++;
            }
            if (screenType != null) {
                return screenType;
            }
            StringBuilder sbA = r.A("This name: <", str, "> view not implemented for ");
            sbA.append(a.class.getSimpleName());
            throw new IllegalArgumentException(sbA.toString());
        }

        public a() {
        }
    }

    static {
        ScreenType[] screenTypeArr = {new ScreenType("BUYER_SCREEN", 0), new ScreenType("SELLER_SCREEN", 1)};
        f285865c = screenTypeArr;
        f285866d = kotlin.enums.c.a(screenTypeArr);
        f285864b = new a(null);
    }

    public ScreenType() {
        throw null;
    }

    public static ScreenType valueOf(String str) {
        return (ScreenType) Enum.valueOf(ScreenType.class, str);
    }

    public static ScreenType[] values() {
        return (ScreenType[]) f285865c.clone();
    }
}
