package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.C42822w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Modality.kt */
/* loaded from: classes8.dex */
public final class Modality {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f407438b;

    /* renamed from: c, reason: collision with root package name */
    public static final Modality f407439c;

    /* renamed from: d, reason: collision with root package name */
    public static final Modality f407440d;

    /* renamed from: e, reason: collision with root package name */
    public static final Modality f407441e;

    /* renamed from: f, reason: collision with root package name */
    public static final Modality f407442f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ Modality[] f407443g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f407444h;

    /* compiled from: Modality.kt */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static Modality a(boolean z12, boolean z13, boolean z14) {
            return z12 ? Modality.f407440d : z13 ? Modality.f407442f : z14 ? Modality.f407441e : Modality.f407439c;
        }

        public a() {
        }
    }

    static {
        Modality modality = new Modality("FINAL", 0);
        f407439c = modality;
        Modality modality2 = new Modality("SEALED", 1);
        f407440d = modality2;
        Modality modality3 = new Modality("OPEN", 2);
        f407441e = modality3;
        Modality modality4 = new Modality("ABSTRACT", 3);
        f407442f = modality4;
        Modality[] modalityArr = {modality, modality2, modality3, modality4};
        f407443g = modalityArr;
        f407444h = kotlin.enums.c.a(modalityArr);
        f407438b = new a(null);
    }

    public Modality() {
        throw null;
    }

    public static Modality valueOf(String str) {
        return (Modality) Enum.valueOf(Modality.class, str);
    }

    public static Modality[] values() {
        return (Modality[]) f407443g.clone();
    }
}
