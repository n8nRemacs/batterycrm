package com.avito.android.vas_performance.ui.visual_legacy;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VisualVasViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/ui/visual_legacy/VisualVasCloseEvent;", "", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class VisualVasCloseEvent {

    /* renamed from: b, reason: collision with root package name */
    public static final VisualVasCloseEvent f322070b;

    /* renamed from: c, reason: collision with root package name */
    public static final VisualVasCloseEvent f322071c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ VisualVasCloseEvent[] f322072d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f322073e;

    static {
        VisualVasCloseEvent visualVasCloseEvent = new VisualVasCloseEvent("CLOSE", 0);
        f322070b = visualVasCloseEvent;
        VisualVasCloseEvent visualVasCloseEvent2 = new VisualVasCloseEvent("FINISH", 1);
        f322071c = visualVasCloseEvent2;
        VisualVasCloseEvent[] visualVasCloseEventArr = {visualVasCloseEvent, visualVasCloseEvent2};
        f322072d = visualVasCloseEventArr;
        f322073e = kotlin.enums.c.a(visualVasCloseEventArr);
    }

    public VisualVasCloseEvent() {
        throw null;
    }

    public static VisualVasCloseEvent valueOf(String str) {
        return (VisualVasCloseEvent) Enum.valueOf(VisualVasCloseEvent.class, str);
    }

    public static VisualVasCloseEvent[] values() {
        return (VisualVasCloseEvent[]) f322072d.clone();
    }
}
