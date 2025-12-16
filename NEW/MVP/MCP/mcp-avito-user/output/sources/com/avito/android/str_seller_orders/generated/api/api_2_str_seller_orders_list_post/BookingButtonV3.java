package com.avito.android.str_seller_orders.generated.api.api_2_str_seller_orders_list_post;

import Y61.k;
import Y61.l;
import com.google.gson.annotations.c;
import hz0.m;
import hz0.p;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: Api2StrSellerOrdersListPostResponse.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u00002\u00020\u0001:\u0001\u0018B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/avito/android/str_seller_orders/generated/api/api_2_str_seller_orders_list_post/BookingButtonV3;", "", "Lhz0/m;", "action", "Lhz0/p;", "clickstream", "Lcom/avito/android/str_seller_orders/generated/api/api_2_str_seller_orders_list_post/BookingButtonV3$Preset;", "preset", "", "title", "<init>", "(Lhz0/m;Lhz0/p;Lcom/avito/android/str_seller_orders/generated/api/api_2_str_seller_orders_list_post/BookingButtonV3$Preset;Ljava/lang/String;)V", "Lhz0/m;", "a", "()Lhz0/m;", "Lhz0/p;", "b", "()Lhz0/p;", "Lcom/avito/android/str_seller_orders/generated/api/api_2_str_seller_orders_list_post/BookingButtonV3$Preset;", "c", "()Lcom/avito/android/str_seller_orders/generated/api/api_2_str_seller_orders_list_post/BookingButtonV3$Preset;", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "Preset", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BookingButtonV3 {

    @c("action")
    @l
    private final m action;

    @c("clickstream")
    @l
    private final p clickstream;

    @c("preset")
    @l
    private final Preset preset;

    @c("title")
    @l
    private final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Api2StrSellerOrdersListPostResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/str_seller_orders/generated/api/api_2_str_seller_orders_list_post/BookingButtonV3$Preset;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Primary", "Secondary", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Preset {

        @c("primary")
        public static final Preset Primary;

        @c("secondary")
        public static final Preset Secondary;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ Preset[] f288798c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ a f288799d;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f288800b;

        static {
            Preset preset = new Preset("Primary", 0, "primary");
            Primary = preset;
            Preset preset2 = new Preset("Secondary", 1, "secondary");
            Secondary = preset2;
            Preset[] presetArr = {preset, preset2};
            f288798c = presetArr;
            f288799d = kotlin.enums.c.a(presetArr);
        }

        private Preset(String str, int i12, String str2) {
            this.f288800b = str2;
        }

        public static Preset valueOf(String str) {
            return (Preset) Enum.valueOf(Preset.class, str);
        }

        public static Preset[] values() {
            return (Preset[]) f288798c.clone();
        }
    }

    public BookingButtonV3(@l m mVar, @l p pVar, @l Preset preset, @l String str) {
        this.action = mVar;
        this.clickstream = pVar;
        this.preset = preset;
        this.title = str;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final m getAction() {
        return this.action;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final p getClickstream() {
        return this.clickstream;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Preset getPreset() {
        return this.preset;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
