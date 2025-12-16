package hu.akarnokd.rxjava3.util;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class BiFunctionSecondIdentity implements l41.c<Object, Object, Object> {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ BiFunctionSecondIdentity[] f398283b = {new BiFunctionSecondIdentity("INSTANCE", 0)};

    /* JADX INFO: Fake field, exist only in values array */
    BiFunctionSecondIdentity EF5;

    public BiFunctionSecondIdentity() {
        throw null;
    }

    public static BiFunctionSecondIdentity valueOf(String str) {
        return (BiFunctionSecondIdentity) Enum.valueOf(BiFunctionSecondIdentity.class, str);
    }

    public static BiFunctionSecondIdentity[] values() {
        return (BiFunctionSecondIdentity[]) f398283b.clone();
    }

    @Override // l41.c
    public final Object apply(Object obj, Object obj2) {
        return obj2;
    }
}
