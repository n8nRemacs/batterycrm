package com.avito.android.map_core.view.draw_button;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DrawingState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map_core/view/draw_button/DrawingState;", "", "_avito-discouraged_avito-libs_search-map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DrawingState {

    /* renamed from: b, reason: collision with root package name */
    public static final DrawingState f185715b;

    /* renamed from: c, reason: collision with root package name */
    public static final DrawingState f185716c;

    /* renamed from: d, reason: collision with root package name */
    public static final DrawingState f185717d;

    /* renamed from: e, reason: collision with root package name */
    public static final DrawingState f185718e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ DrawingState[] f185719f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ a f185720g;

    static {
        DrawingState drawingState = new DrawingState("IDLE", 0);
        f185715b = drawingState;
        DrawingState drawingState2 = new DrawingState("DRAWING", 1);
        f185716c = drawingState2;
        DrawingState drawingState3 = new DrawingState("DRAWN", 2);
        f185717d = drawingState3;
        DrawingState drawingState4 = new DrawingState("DRAWN_EMPTY", 3);
        f185718e = drawingState4;
        DrawingState[] drawingStateArr = {drawingState, drawingState2, drawingState3, drawingState4};
        f185719f = drawingStateArr;
        f185720g = c.a(drawingStateArr);
    }

    public DrawingState() {
        throw null;
    }

    public static DrawingState valueOf(String str) {
        return (DrawingState) Enum.valueOf(DrawingState.class, str);
    }

    public static DrawingState[] values() {
        return (DrawingState[]) f185719f.clone();
    }
}
