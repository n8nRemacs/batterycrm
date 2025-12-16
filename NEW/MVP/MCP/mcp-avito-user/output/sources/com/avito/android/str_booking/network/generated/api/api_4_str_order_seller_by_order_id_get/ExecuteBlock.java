package com.avito.android.str_booking.network.generated.api.api_4_str_order_seller_by_order_id_get;

import Sx0.u;
import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: Api4StrOrderSellerByOrderIdGetResponse.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0001\u0013B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/avito/android/str_booking/network/generated/api/api_4_str_order_seller_by_order_id_get/ExecuteBlock;", "", "LSx0/u;", "executable", "", "id", "Lcom/avito/android/str_booking/network/generated/api/api_4_str_order_seller_by_order_id_get/ExecuteBlock$Pattern;", "pattern", "<init>", "(LSx0/u;Ljava/lang/String;Lcom/avito/android/str_booking/network/generated/api/api_4_str_order_seller_by_order_id_get/ExecuteBlock$Pattern;)V", "LSx0/u;", "getExecutable", "()LSx0/u;", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Lcom/avito/android/str_booking/network/generated/api/api_4_str_order_seller_by_order_id_get/ExecuteBlock$Pattern;", "getPattern", "()Lcom/avito/android/str_booking/network/generated/api/api_4_str_order_seller_by_order_id_get/ExecuteBlock$Pattern;", "Pattern", "_avito-discouraged_avito-network_str-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ExecuteBlock {

    @c("executable")
    @k
    private final u executable;

    @c("id")
    @k
    private final String id;

    @c("pattern")
    @k
    private final Pattern pattern;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Api4StrOrderSellerByOrderIdGetResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/str_booking/network/generated/api/api_4_str_order_seller_by_order_id_get/ExecuteBlock$Pattern;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Once", "Always", "_avito-discouraged_avito-network_str-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Pattern {

        @c("always")
        public static final Pattern Always;

        @c("once")
        public static final Pattern Once;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Pattern[] f285856b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f285857c;

        static {
            Pattern pattern = new Pattern("Once", 0, "once");
            Once = pattern;
            Pattern pattern2 = new Pattern("Always", 1, "always");
            Always = pattern2;
            Pattern[] patternArr = {pattern, pattern2};
            f285856b = patternArr;
            f285857c = kotlin.enums.c.a(patternArr);
        }

        private Pattern(String str, int i12, String str2) {
        }

        public static Pattern valueOf(String str) {
            return (Pattern) Enum.valueOf(Pattern.class, str);
        }

        public static Pattern[] values() {
            return (Pattern[]) f285856b.clone();
        }
    }

    public ExecuteBlock(@k u uVar, @k String str, @k Pattern pattern) {
        this.executable = uVar;
        this.id = str;
        this.pattern = pattern;
    }
}
