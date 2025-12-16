package com.avito.android.map_core.analytics.event;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SourceAction.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map_core/analytics/event/SourceAction;", "", "_avito-discouraged_avito-libs_search-map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SourceAction {

    /* renamed from: c, reason: collision with root package name */
    public static final SourceAction f185597c;

    /* renamed from: d, reason: collision with root package name */
    public static final SourceAction f185598d;

    /* renamed from: e, reason: collision with root package name */
    public static final SourceAction f185599e;

    /* renamed from: f, reason: collision with root package name */
    public static final SourceAction f185600f;

    /* renamed from: g, reason: collision with root package name */
    public static final SourceAction f185601g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ SourceAction[] f185602h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f185603i;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f185604b;

    static {
        SourceAction sourceAction = new SourceAction("MAP_SOURCE_ACTION_INIT", 0, "init");
        f185597c = sourceAction;
        SourceAction sourceAction2 = new SourceAction("MAP_SOURCE_ACTION_CHANGE_FILTERS", 1, "change_filters");
        f185598d = sourceAction2;
        SourceAction sourceAction3 = new SourceAction("MAP_SOURCE_ACTION_CANCEL_DRAWING", 2, "cancel_drawing");
        f185599e = sourceAction3;
        SourceAction sourceAction4 = new SourceAction("MAP_SOURCE_ACTION_SAVE_DRAW_AREA", 3, "save_draw_area");
        f185600f = sourceAction4;
        SourceAction sourceAction5 = new SourceAction("MAP_SOURCE_ACTION_RESET_DRAW_AREA", 4, "reset_draw_area");
        f185601g = sourceAction5;
        SourceAction[] sourceActionArr = {sourceAction, sourceAction2, sourceAction3, sourceAction4, sourceAction5};
        f185602h = sourceActionArr;
        f185603i = kotlin.enums.c.a(sourceActionArr);
    }

    public SourceAction(String str, int i12, String str2) {
        this.f185604b = str2;
    }

    public static SourceAction valueOf(String str) {
        return (SourceAction) Enum.valueOf(SourceAction.class, str);
    }

    public static SourceAction[] values() {
        return (SourceAction[]) f185602h.clone();
    }
}
