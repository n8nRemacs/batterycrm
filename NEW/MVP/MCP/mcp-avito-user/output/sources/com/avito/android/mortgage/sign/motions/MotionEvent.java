package com.avito.android.mortgage.sign.motions;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MotionEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/sign/motions/MotionEvent;", "", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MotionEvent {

    /* renamed from: b, reason: collision with root package name */
    public static final MotionEvent f203736b;

    /* renamed from: c, reason: collision with root package name */
    public static final MotionEvent f203737c;

    /* renamed from: d, reason: collision with root package name */
    public static final MotionEvent f203738d;

    /* renamed from: e, reason: collision with root package name */
    public static final MotionEvent f203739e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ MotionEvent[] f203740f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f203741g;

    static {
        MotionEvent motionEvent = new MotionEvent("Idle", 0);
        f203736b = motionEvent;
        MotionEvent motionEvent2 = new MotionEvent("Down", 1);
        f203737c = motionEvent2;
        MotionEvent motionEvent3 = new MotionEvent("Move", 2);
        f203738d = motionEvent3;
        MotionEvent motionEvent4 = new MotionEvent("Up", 3);
        f203739e = motionEvent4;
        MotionEvent[] motionEventArr = {motionEvent, motionEvent2, motionEvent3, motionEvent4};
        f203740f = motionEventArr;
        f203741g = kotlin.enums.c.a(motionEventArr);
    }

    public MotionEvent() {
        throw null;
    }

    public static MotionEvent valueOf(String str) {
        return (MotionEvent) Enum.valueOf(MotionEvent.class, str);
    }

    public static MotionEvent[] values() {
        return (MotionEvent[]) f203740f.clone();
    }
}
