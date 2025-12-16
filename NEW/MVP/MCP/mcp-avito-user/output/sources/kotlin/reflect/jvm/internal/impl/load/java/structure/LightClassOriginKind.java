package kotlin.reflect.jvm.internal.impl.load.java.structure;

import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: javaElements.kt */
/* loaded from: classes8.dex */
public final class LightClassOriginKind {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ LightClassOriginKind[] f408302b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f408303c;

    static {
        LightClassOriginKind[] lightClassOriginKindArr = {new LightClassOriginKind("SOURCE", 0), new LightClassOriginKind("BINARY", 1)};
        f408302b = lightClassOriginKindArr;
        f408303c = c.a(lightClassOriginKindArr);
    }

    public LightClassOriginKind() {
        throw null;
    }

    public static LightClassOriginKind valueOf(String str) {
        return (LightClassOriginKind) Enum.valueOf(LightClassOriginKind.class, str);
    }

    public static LightClassOriginKind[] values() {
        return (LightClassOriginKind[]) f408302b.clone();
    }
}
