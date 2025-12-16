package x5;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AdvertDetailsAddressGeoDistanceAnalytics.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lx5/a;", "", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: x5.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public interface InterfaceC49771a {

    /* compiled from: AdvertDetailsAddressGeoDistanceAnalytics.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, d2 = {"Lx5/a$a;", "", "", "onFootInMinutes", "byCarInMinutes", "byTransportInMinutes", "onFootSimpleInMinutes", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "Ljava/lang/Long;", "getOnFootInMinutes", "()Ljava/lang/Long;", "getByCarInMinutes", "getByTransportInMinutes", "getOnFootSimpleInMinutes", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x5.a$a, reason: collision with other inner class name */
    public static final class C12844a {

        @com.google.gson.annotations.c("by_car")
        @l
        private final Long byCarInMinutes;

        @com.google.gson.annotations.c("by_transport")
        @l
        private final Long byTransportInMinutes;

        @com.google.gson.annotations.c("on_foot")
        @l
        private final Long onFootInMinutes;

        @com.google.gson.annotations.c("on_foot_simple")
        @l
        private final Long onFootSimpleInMinutes;

        public C12844a() {
            this(null, null, null, null, 15, null);
        }

        public C12844a(@l Long l12, @l Long l13, @l Long l14, @l Long l15) {
            this.onFootInMinutes = l12;
            this.byCarInMinutes = l13;
            this.byTransportInMinutes = l14;
            this.onFootSimpleInMinutes = l15;
        }

        public /* synthetic */ C12844a(Long l12, Long l13, Long l14, Long l15, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? -2L : l12, (i12 & 2) != 0 ? -2L : l13, (i12 & 4) != 0 ? -2L : l14, (i12 & 8) != 0 ? -2L : l15);
        }
    }

    void a(@l String str);

    void b(@k C12844a c12844a);
}
