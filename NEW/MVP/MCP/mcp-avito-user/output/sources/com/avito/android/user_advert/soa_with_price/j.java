package com.avito.android.user_advert.soa_with_price;

import com.avito.android.remote.model.my_advert.CloseReason;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SoaWithPriceViewModel.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/user_advert/soa_with_price/j;", "", "<init>", "()V", "a", "b", "c", "d", "Lcom/avito/android/user_advert/soa_with_price/j$a;", "Lcom/avito/android/user_advert/soa_with_price/j$b;", "Lcom/avito/android/user_advert/soa_with_price/j$c;", "Lcom/avito/android/user_advert/soa_with_price/j$d;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class j {

    /* compiled from: SoaWithPriceViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_advert/soa_with_price/j$a;", "Lcom/avito/android/user_advert/soa_with_price/j;", "<init>", "()V", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends j {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f311928a = new a();

        public a() {
            super(null);
        }
    }

    /* compiled from: SoaWithPriceViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/soa_with_price/j$b;", "Lcom/avito/android/user_advert/soa_with_price/j;", "Lcom/avito/android/user_advert/soa_with_price/F;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends j implements F {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f311929a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final NavigationButtonType f311930b;

        public b(@Y61.k String str) {
            super(null);
            this.f311929a = str;
            this.f311930b = NavigationButtonType.f311839b;
        }
    }

    /* compiled from: SoaWithPriceViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/soa_with_price/j$c;", "Lcom/avito/android/user_advert/soa_with_price/j;", "Lcom/avito/android/user_advert/soa_with_price/F;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends j implements F {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f311931a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final NavigationButtonType f311932b;

        public c(@Y61.k String str) {
            super(null);
            this.f311931a = str;
            this.f311932b = NavigationButtonType.f311840c;
        }
    }

    /* compiled from: SoaWithPriceViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/soa_with_price/j$d;", "Lcom/avito/android/user_advert/soa_with_price/j;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d extends j {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final CloseReason f311933a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f311934b;

        public d(@Y61.k CloseReason closeReason, @Y61.l String str) {
            super(null);
            this.f311933a = closeReason;
            this.f311934b = str;
        }

        public /* synthetic */ d(CloseReason closeReason, String str, int i12, C42822w c42822w) {
            this(closeReason, (i12 & 2) != 0 ? null : str);
        }
    }

    public /* synthetic */ j(C42822w c42822w) {
        this();
    }

    public j() {
    }
}
