package com.google.common.io;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@XY0.c
@InterfaceC37521x
@XY0.d
/* loaded from: classes6.dex */
public final class FileWriteMode {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ FileWriteMode[] f360311b = {new FileWriteMode("APPEND", 0)};

    /* JADX INFO: Fake field, exist only in values array */
    FileWriteMode EF5;

    public FileWriteMode() {
        throw null;
    }

    public static FileWriteMode valueOf(String str) {
        return (FileWriteMode) Enum.valueOf(FileWriteMode.class, str);
    }

    public static FileWriteMode[] values() {
        return (FileWriteMode[]) f360311b.clone();
    }
}
