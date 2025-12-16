package shark.internal;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ReferenceLocationType.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lshark/internal/ReferenceLocationType;", "", "shark"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class ReferenceLocationType {

    /* renamed from: b, reason: collision with root package name */
    public static final ReferenceLocationType f438449b;

    /* renamed from: c, reason: collision with root package name */
    public static final ReferenceLocationType f438450c;

    /* renamed from: d, reason: collision with root package name */
    public static final ReferenceLocationType f438451d;

    /* renamed from: e, reason: collision with root package name */
    public static final ReferenceLocationType f438452e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ ReferenceLocationType[] f438453f;

    static {
        ReferenceLocationType referenceLocationType = new ReferenceLocationType("INSTANCE_FIELD", 0);
        f438449b = referenceLocationType;
        ReferenceLocationType referenceLocationType2 = new ReferenceLocationType("STATIC_FIELD", 1);
        f438450c = referenceLocationType2;
        ReferenceLocationType referenceLocationType3 = new ReferenceLocationType("LOCAL", 2);
        f438451d = referenceLocationType3;
        ReferenceLocationType referenceLocationType4 = new ReferenceLocationType("ARRAY_ENTRY", 3);
        f438452e = referenceLocationType4;
        f438453f = new ReferenceLocationType[]{referenceLocationType, referenceLocationType2, referenceLocationType3, referenceLocationType4};
    }

    public ReferenceLocationType() {
        throw null;
    }

    public static ReferenceLocationType valueOf(String str) {
        return (ReferenceLocationType) Enum.valueOf(ReferenceLocationType.class, str);
    }

    public static ReferenceLocationType[] values() {
        return (ReferenceLocationType[]) f438453f.clone();
    }
}
