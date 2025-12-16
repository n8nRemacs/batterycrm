package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;

/* loaded from: classes8.dex */
public interface CallableMemberDescriptor extends InterfaceC42848a, B {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Kind {

        /* renamed from: b, reason: collision with root package name */
        public static final Kind f407408b;

        /* renamed from: c, reason: collision with root package name */
        public static final Kind f407409c;

        /* renamed from: d, reason: collision with root package name */
        public static final Kind f407410d;

        /* renamed from: e, reason: collision with root package name */
        public static final Kind f407411e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ Kind[] f407412f;

        static {
            Kind kind = new Kind("DECLARATION", 0);
            f407408b = kind;
            Kind kind2 = new Kind("FAKE_OVERRIDE", 1);
            f407409c = kind2;
            Kind kind3 = new Kind("DELEGATION", 2);
            f407410d = kind3;
            Kind kind4 = new Kind("SYNTHESIZED", 3);
            f407411e = kind4;
            f407412f = new Kind[]{kind, kind2, kind3, kind4};
        }

        public Kind() {
            throw null;
        }

        public static Kind valueOf(String str) {
            return (Kind) Enum.valueOf(Kind.class, str);
        }

        public static Kind[] values() {
            return (Kind[]) f407412f.clone();
        }
    }

    @Y61.k
    CallableMemberDescriptor V(InterfaceC42851d interfaceC42851d, Modality modality, AbstractC42887p abstractC42887p);

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k
    @Y61.k
    CallableMemberDescriptor a();

    @Y61.k
    Kind getKind();

    void l0(@Y61.k Collection<? extends CallableMemberDescriptor> collection);

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a
    @Y61.k
    Collection<? extends CallableMemberDescriptor> p();
}
