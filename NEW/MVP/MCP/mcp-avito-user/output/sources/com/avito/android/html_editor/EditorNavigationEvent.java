package com.avito.android.html_editor;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EditorNavigationEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/html_editor/EditorNavigationEvent;", "", "_avito_html-editor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EditorNavigationEvent {

    /* renamed from: b, reason: collision with root package name */
    public static final EditorNavigationEvent f164126b;

    /* renamed from: c, reason: collision with root package name */
    public static final EditorNavigationEvent f164127c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EditorNavigationEvent[] f164128d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f164129e;

    static {
        EditorNavigationEvent editorNavigationEvent = new EditorNavigationEvent("UNDO", 0);
        f164126b = editorNavigationEvent;
        EditorNavigationEvent editorNavigationEvent2 = new EditorNavigationEvent("REDO", 1);
        f164127c = editorNavigationEvent2;
        EditorNavigationEvent[] editorNavigationEventArr = {editorNavigationEvent, editorNavigationEvent2};
        f164128d = editorNavigationEventArr;
        f164129e = kotlin.enums.c.a(editorNavigationEventArr);
    }

    public EditorNavigationEvent() {
        throw null;
    }

    public static EditorNavigationEvent valueOf(String str) {
        return (EditorNavigationEvent) Enum.valueOf(EditorNavigationEvent.class, str);
    }

    public static EditorNavigationEvent[] values() {
        return (EditorNavigationEvent[]) f164128d.clone();
    }
}
