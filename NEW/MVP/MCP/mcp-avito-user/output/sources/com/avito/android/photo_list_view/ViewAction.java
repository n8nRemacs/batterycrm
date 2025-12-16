package com.avito.android.photo_list_view;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ViewAction.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_list_view/ViewAction;", "", "_avito_photo-list-view_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ViewAction {

    /* renamed from: b, reason: collision with root package name */
    public static final ViewAction f218107b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ ViewAction[] f218108c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f218109d;

    static {
        ViewAction viewAction = new ViewAction("OPEN_PHOTO_PICKER", 0);
        f218107b = viewAction;
        ViewAction[] viewActionArr = {viewAction};
        f218108c = viewActionArr;
        f218109d = kotlin.enums.c.a(viewActionArr);
    }

    public ViewAction() {
        throw null;
    }

    public static ViewAction valueOf(String str) {
        return (ViewAction) Enum.valueOf(ViewAction.class, str);
    }

    public static ViewAction[] values() {
        return (ViewAction[]) f218108c.clone();
    }
}
