package shark;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: LeakTraceReference.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lshark/LeakTraceReference;", "Ljava/io/Serializable;", "a", "ReferenceType", "shark"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final /* data */ class LeakTraceReference implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final LeakTraceObject f438132b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ReferenceType f438133c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f438134d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f438135e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LeakTraceReference.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lshark/LeakTraceReference$ReferenceType;", "", "shark"}, k = 1, mv = {1, 4, 1})
    public static final class ReferenceType {

        /* renamed from: b, reason: collision with root package name */
        public static final ReferenceType f438136b;

        /* renamed from: c, reason: collision with root package name */
        public static final ReferenceType f438137c;

        /* renamed from: d, reason: collision with root package name */
        public static final ReferenceType f438138d;

        /* renamed from: e, reason: collision with root package name */
        public static final ReferenceType f438139e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ ReferenceType[] f438140f;

        static {
            ReferenceType referenceType = new ReferenceType("INSTANCE_FIELD", 0);
            f438136b = referenceType;
            ReferenceType referenceType2 = new ReferenceType("STATIC_FIELD", 1);
            f438137c = referenceType2;
            ReferenceType referenceType3 = new ReferenceType("LOCAL", 2);
            f438138d = referenceType3;
            ReferenceType referenceType4 = new ReferenceType("ARRAY_ENTRY", 3);
            f438139e = referenceType4;
            f438140f = new ReferenceType[]{referenceType, referenceType2, referenceType3, referenceType4};
        }

        public ReferenceType() {
            throw null;
        }

        public static ReferenceType valueOf(String str) {
            return (ReferenceType) Enum.valueOf(ReferenceType.class, str);
        }

        public static ReferenceType[] values() {
            return (ReferenceType[]) f438140f.clone();
        }
    }

    /* compiled from: LeakTraceReference.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lshark/LeakTraceReference$a;", "", "<init>", "()V", "", "serialVersionUID", "J", "shark"}, k = 1, mv = {1, 4, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }
    }

    static {
        new a(null);
    }

    public LeakTraceReference(@Y61.k LeakTraceObject leakTraceObject, @Y61.k ReferenceType referenceType, @Y61.k String str, @Y61.k String str2) {
        this.f438132b = leakTraceObject;
        this.f438133c = referenceType;
        this.f438134d = str;
        this.f438135e = str2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeakTraceReference)) {
            return false;
        }
        LeakTraceReference leakTraceReference = (LeakTraceReference) obj;
        return kotlin.jvm.internal.L.f(this.f438132b, leakTraceReference.f438132b) && kotlin.jvm.internal.L.f(this.f438133c, leakTraceReference.f438133c) && kotlin.jvm.internal.L.f(this.f438134d, leakTraceReference.f438134d) && kotlin.jvm.internal.L.f(this.f438135e, leakTraceReference.f438135e);
    }

    public final int hashCode() {
        LeakTraceObject leakTraceObject = this.f438132b;
        int iHashCode = (leakTraceObject != null ? leakTraceObject.hashCode() : 0) * 31;
        ReferenceType referenceType = this.f438133c;
        int iHashCode2 = (iHashCode + (referenceType != null ? referenceType.hashCode() : 0)) * 31;
        String str = this.f438134d;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f438135e;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LeakTraceReference(originObject=");
        sb2.append(this.f438132b);
        sb2.append(", referenceType=");
        sb2.append(this.f438133c);
        sb2.append(", owningClassName=");
        sb2.append(this.f438134d);
        sb2.append(", referenceName=");
        return AK.c.s(sb2, this.f438135e, ")");
    }
}
