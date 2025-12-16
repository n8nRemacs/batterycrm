package com.avito.android.advert_core.analytics.toolbar;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ActionWithNoteTreeEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/analytics/toolbar/NoteAction;", "", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class NoteAction {

    /* renamed from: b, reason: collision with root package name */
    public static final NoteAction f82885b;

    /* renamed from: c, reason: collision with root package name */
    public static final NoteAction f82886c;

    /* renamed from: d, reason: collision with root package name */
    public static final NoteAction f82887d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ NoteAction[] f82888e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f82889f;

    static {
        NoteAction noteAction = new NoteAction("ADD", 0);
        f82885b = noteAction;
        NoteAction noteAction2 = new NoteAction("EDIT", 1);
        f82886c = noteAction2;
        NoteAction noteAction3 = new NoteAction("REMOVE", 2);
        f82887d = noteAction3;
        NoteAction[] noteActionArr = {noteAction, noteAction2, noteAction3};
        f82888e = noteActionArr;
        f82889f = c.a(noteActionArr);
    }

    public NoteAction() {
        throw null;
    }

    public static NoteAction valueOf(String str) {
        return (NoteAction) Enum.valueOf(NoteAction.class, str);
    }

    public static NoteAction[] values() {
        return (NoteAction[]) f82888e.clone();
    }
}
