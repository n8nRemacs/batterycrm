package org.mockito.mock;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class SerializableMode {

    /* renamed from: b, reason: collision with root package name */
    public static final SerializableMode f421782b;

    /* renamed from: c, reason: collision with root package name */
    public static final SerializableMode f421783c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ SerializableMode[] f421784d;

    static {
        SerializableMode serializableMode = new SerializableMode("NONE", 0);
        f421782b = serializableMode;
        SerializableMode serializableMode2 = new SerializableMode("BASIC", 1);
        SerializableMode serializableMode3 = new SerializableMode("ACROSS_CLASSLOADERS", 2);
        f421783c = serializableMode3;
        f421784d = new SerializableMode[]{serializableMode, serializableMode2, serializableMode3};
    }

    public SerializableMode() {
        throw null;
    }

    public static SerializableMode valueOf(String str) {
        return (SerializableMode) Enum.valueOf(SerializableMode.class, str);
    }

    public static SerializableMode[] values() {
        return (SerializableMode[]) f421784d.clone();
    }
}
