package com.avito.android.publish;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PublishAppbarView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/ActionMode;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ActionMode {

    /* renamed from: b, reason: collision with root package name */
    public static final ActionMode f231832b;

    /* renamed from: c, reason: collision with root package name */
    public static final ActionMode f231833c;

    /* renamed from: d, reason: collision with root package name */
    public static final ActionMode f231834d;

    /* renamed from: e, reason: collision with root package name */
    public static final ActionMode f231835e;

    /* renamed from: f, reason: collision with root package name */
    public static final ActionMode f231836f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ ActionMode[] f231837g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f231838h;

    static {
        ActionMode actionMode = new ActionMode("SAVE_AND_CLOSE", 0);
        f231832b = actionMode;
        ActionMode actionMode2 = new ActionMode("CLOSE", 1);
        f231833c = actionMode2;
        ActionMode actionMode3 = new ActionMode("CLEAR_LIST", 2);
        f231834d = actionMode3;
        ActionMode actionMode4 = new ActionMode("REMOVE", 3);
        f231835e = actionMode4;
        ActionMode actionMode5 = new ActionMode("NONE", 4);
        f231836f = actionMode5;
        ActionMode[] actionModeArr = {actionMode, actionMode2, actionMode3, actionMode4, actionMode5};
        f231837g = actionModeArr;
        f231838h = kotlin.enums.c.a(actionModeArr);
    }

    public ActionMode() {
        throw null;
    }

    public static ActionMode valueOf(String str) {
        return (ActionMode) Enum.valueOf(ActionMode.class, str);
    }

    public static ActionMode[] values() {
        return (ActionMode[]) f231837g.clone();
    }
}
