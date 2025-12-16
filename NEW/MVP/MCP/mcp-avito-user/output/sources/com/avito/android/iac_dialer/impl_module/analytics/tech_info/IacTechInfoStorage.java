package com.avito.android.iac_dialer.impl_module.analytics.tech_info;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.statsd.D;
import com.avito.android.iac_dialer_models.abstract_module.IacCallDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.text.C43066x;

/* compiled from: IacTechInfoStorage.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/analytics/tech_info/IacTechInfoStorage;", "", "a", "Type", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface IacTechInfoStorage {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: IacTechInfoStorage.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/analytics/tech_info/IacTechInfoStorage$Type;", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        /* renamed from: c, reason: collision with root package name */
        public static final Type f165701c;

        /* renamed from: d, reason: collision with root package name */
        public static final Type f165702d;

        /* renamed from: e, reason: collision with root package name */
        public static final Type f165703e;

        /* renamed from: f, reason: collision with root package name */
        public static final Type f165704f;

        /* renamed from: g, reason: collision with root package name */
        public static final Type f165705g;

        /* renamed from: h, reason: collision with root package name */
        public static final Type f165706h;

        /* renamed from: i, reason: collision with root package name */
        public static final Type f165707i;

        /* renamed from: j, reason: collision with root package name */
        public static final Type f165708j;

        /* renamed from: k, reason: collision with root package name */
        public static final Type f165709k;

        /* renamed from: l, reason: collision with root package name */
        public static final Type f165710l;

        /* renamed from: m, reason: collision with root package name */
        public static final /* synthetic */ Type[] f165711m;

        /* renamed from: n, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f165712n;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f165713b;

        static {
            Type type = new Type("VENDOR", 0, "device_vendor");
            f165701c = type;
            Type type2 = new Type("MODEL", 1, "device_model");
            f165702d = type2;
            Type type3 = new Type("ANDROID_API", 2, "android_api");
            f165703e = type3;
            Type type4 = new Type("TELECOM_INCOMING", 3, "use_telecom_in");
            f165704f = type4;
            Type type5 = new Type("TELECOM_OUTGOING", 4, "use_telecom_out");
            f165705g = type5;
            Type type6 = new Type("HAS_NOTIFICATION_PERMISSION", 5, "prms_notification");
            f165706h = type6;
            Type type7 = new Type("HAS_FULL_SCREEN_INTENT_PERMISSION", 6, "prms_fsi");
            f165707i = type7;
            Type type8 = new Type("HAS_MIC_PERMISSION", 7, "prms_mic");
            f165708j = type8;
            Type type9 = new Type("HAS_CAMERA_PERMISSION", 8, "prms_camera");
            f165709k = type9;
            Type type10 = new Type("IS_MIUI", 9, "is_miui");
            f165710l = type10;
            Type[] typeArr = {type, type2, type3, type4, type5, type6, type7, type8, type9, type10};
            f165711m = typeArr;
            f165712n = kotlin.enums.c.a(typeArr);
        }

        public Type(String str, int i12, String str2) {
            this.f165713b = str2;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f165711m.clone();
        }
    }

    /* compiled from: IacTechInfoStorage.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/analytics/tech_info/IacTechInfoStorage$a;", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Type f165714a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f165715b;

        public a(@k Type type, @l String str) {
            this.f165714a = type;
            this.f165715b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f165714a == aVar.f165714a && L.f(this.f165715b, aVar.f165715b);
        }

        public final int hashCode() {
            int iHashCode = this.f165714a.hashCode() * 31;
            String str = this.f165715b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            C43066x.k(sb2, D.a(this.f165714a.f165713b), "-");
            String str = this.f165715b;
            if (str != null) {
                sb2.append(D.a(str));
            }
            return sb2.toString();
        }
    }

    void a(@k String str, @k IacCallDirection iacCallDirection, @l List<String> list);

    @l
    String b(@k String str);
}
