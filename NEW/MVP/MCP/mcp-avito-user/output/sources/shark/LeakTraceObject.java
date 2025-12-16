package shark;

import androidx.compose.ui.platform.C22491k0;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C42822w;

/* compiled from: LeakTraceObject.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lshark/LeakTraceObject;", "Ljava/io/Serializable;", "a", "LeakingStatus", "ObjectType", "shark"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final /* data */ class LeakTraceObject implements Serializable {

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public static final a f438116i = new a(null);
    private static final long serialVersionUID = -3616216391305196341L;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ObjectType f438117b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f438118c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final LinkedHashSet f438119d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final LeakingStatus f438120e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final String f438121f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Integer f438122g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final Integer f438123h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LeakTraceObject.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lshark/LeakTraceObject$LeakingStatus;", "", "shark"}, k = 1, mv = {1, 4, 1})
    public static final class LeakingStatus {

        /* renamed from: b, reason: collision with root package name */
        public static final LeakingStatus f438124b;

        /* renamed from: c, reason: collision with root package name */
        public static final LeakingStatus f438125c;

        /* renamed from: d, reason: collision with root package name */
        public static final LeakingStatus f438126d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ LeakingStatus[] f438127e;

        static {
            LeakingStatus leakingStatus = new LeakingStatus("NOT_LEAKING", 0);
            f438124b = leakingStatus;
            LeakingStatus leakingStatus2 = new LeakingStatus("LEAKING", 1);
            f438125c = leakingStatus2;
            LeakingStatus leakingStatus3 = new LeakingStatus(GrsBaseInfo.CountryCodeSource.UNKNOWN, 2);
            f438126d = leakingStatus3;
            f438127e = new LeakingStatus[]{leakingStatus, leakingStatus2, leakingStatus3};
        }

        public LeakingStatus() {
            throw null;
        }

        public static LeakingStatus valueOf(String str) {
            return (LeakingStatus) Enum.valueOf(LeakingStatus.class, str);
        }

        public static LeakingStatus[] values() {
            return (LeakingStatus[]) f438127e.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LeakTraceObject.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lshark/LeakTraceObject$ObjectType;", "", "shark"}, k = 1, mv = {1, 4, 1})
    public static final class ObjectType {

        /* renamed from: b, reason: collision with root package name */
        public static final ObjectType f438128b;

        /* renamed from: c, reason: collision with root package name */
        public static final ObjectType f438129c;

        /* renamed from: d, reason: collision with root package name */
        public static final ObjectType f438130d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ ObjectType[] f438131e;

        static {
            ObjectType objectType = new ObjectType("CLASS", 0);
            f438128b = objectType;
            ObjectType objectType2 = new ObjectType("ARRAY", 1);
            f438129c = objectType2;
            ObjectType objectType3 = new ObjectType("INSTANCE", 2);
            f438130d = objectType3;
            f438131e = new ObjectType[]{objectType, objectType2, objectType3};
        }

        public ObjectType() {
            throw null;
        }

        public static ObjectType valueOf(String str) {
            return (ObjectType) Enum.valueOf(ObjectType.class, str);
        }

        public static ObjectType[] values() {
            return (ObjectType[]) f438131e.clone();
        }
    }

    /* compiled from: LeakTraceObject.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lshark/LeakTraceObject$a;", "", "<init>", "()V", "", "serialVersionUID", "J", "shark"}, k = 1, mv = {1, 4, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }
    }

    public LeakTraceObject(@Y61.k ObjectType objectType, @Y61.k String str, @Y61.k LinkedHashSet linkedHashSet, @Y61.k LeakingStatus leakingStatus, @Y61.k String str2, @Y61.l Integer num, @Y61.l Integer num2) {
        this.f438117b = objectType;
        this.f438118c = str;
        this.f438119d = linkedHashSet;
        this.f438120e = leakingStatus;
        this.f438121f = str2;
        this.f438122g = num;
        this.f438123h = num2;
    }

    @Y61.k
    public final String a(@Y61.k String str, @Y61.k String str2, @Y61.k String str3) {
        String strA;
        String str4;
        int iOrdinal = this.f438120e.ordinal();
        String str5 = this.f438121f;
        if (iOrdinal == 0) {
            strA = C22491k0.a(')', "NO (", str5);
        } else if (iOrdinal == 1) {
            strA = C22491k0.a(')', "YES (", str5);
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            strA = GrsBaseInfo.CountryCodeSource.UNKNOWN;
        }
        StringBuilder sb2 = new StringBuilder("");
        sb2.append(str);
        String str6 = androidx.compose.foundation.H.o(sb2, this.f438118c, ' ', str3) + '\n' + str2 + "Leaking: " + strA;
        Integer num = this.f438122g;
        if (num != null) {
            long jIntValue = num.intValue();
            f438116i.getClass();
            if (jIntValue < 1000) {
                str4 = jIntValue + " B";
            } else {
                double d12 = jIntValue;
                double d13 = 1000;
                int iLog = (int) (Math.log(d12) / Math.log(d13));
                char cCharAt = "kMGTPE".charAt(iLog - 1);
                kotlin.jvm.internal.u0 u0Var = kotlin.jvm.internal.u0.f406856a;
                str4 = String.format("%.1f %sB", Arrays.copyOf(new Object[]{Double.valueOf(d12 / Math.pow(d13, iLog)), Character.valueOf(cCharAt)}, 2));
            }
            str6 = str6 + '\n' + str2 + "Retaining " + str4 + " in " + this.f438123h + " objects";
        }
        Iterator it = this.f438119d.iterator();
        while (it.hasNext()) {
            str6 = str6 + '\n' + str2 + ((String) it.next());
        }
        return str6;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeakTraceObject)) {
            return false;
        }
        LeakTraceObject leakTraceObject = (LeakTraceObject) obj;
        return this.f438117b.equals(leakTraceObject.f438117b) && kotlin.jvm.internal.L.f(this.f438118c, leakTraceObject.f438118c) && kotlin.jvm.internal.L.f(this.f438119d, leakTraceObject.f438119d) && kotlin.jvm.internal.L.f(this.f438120e, leakTraceObject.f438120e) && kotlin.jvm.internal.L.f(this.f438121f, leakTraceObject.f438121f) && kotlin.jvm.internal.L.f(this.f438122g, leakTraceObject.f438122g) && kotlin.jvm.internal.L.f(this.f438123h, leakTraceObject.f438123h);
    }

    public final int hashCode() {
        int iHashCode = this.f438117b.hashCode() * 31;
        String str = this.f438118c;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        LinkedHashSet linkedHashSet = this.f438119d;
        int iHashCode3 = (iHashCode2 + (linkedHashSet != null ? linkedHashSet.hashCode() : 0)) * 31;
        LeakingStatus leakingStatus = this.f438120e;
        int iHashCode4 = (iHashCode3 + (leakingStatus != null ? leakingStatus.hashCode() : 0)) * 31;
        String str2 = this.f438121f;
        int iHashCode5 = (iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.f438122g;
        int iHashCode6 = (iHashCode5 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.f438123h;
        return iHashCode6 + (num2 != null ? num2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        String strName = this.f438117b.name();
        Locale locale = Locale.US;
        if (strName != null) {
            return a("", "\u200b  ", strName.toLowerCase(locale));
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }
}
