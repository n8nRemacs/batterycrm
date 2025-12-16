package com.avito.android.reward_bug_entry_impl.domain;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PositionOnScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/reward_bug_entry_impl/domain/PositionOnScreen;", "", "a", "_avito_reward-bug-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PositionOnScreen {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f255594b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final PositionOnScreen f255595c;

    /* renamed from: d, reason: collision with root package name */
    public static final PositionOnScreen f255596d;

    /* renamed from: e, reason: collision with root package name */
    public static final PositionOnScreen f255597e;

    /* renamed from: f, reason: collision with root package name */
    public static final PositionOnScreen f255598f;

    /* renamed from: g, reason: collision with root package name */
    public static final PositionOnScreen f255599g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ PositionOnScreen[] f255600h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f255601i;

    /* compiled from: PositionOnScreen.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/reward_bug_entry_impl/domain/PositionOnScreen$a;", "", "<init>", "()V", "_avito_reward-bug-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        PositionOnScreen positionOnScreen = new PositionOnScreen("TOP_RIGHT", 0);
        f255596d = positionOnScreen;
        PositionOnScreen positionOnScreen2 = new PositionOnScreen("TOP_LEFT", 1);
        f255597e = positionOnScreen2;
        PositionOnScreen positionOnScreen3 = new PositionOnScreen("BOTTOM_RIGHT", 2);
        f255598f = positionOnScreen3;
        PositionOnScreen positionOnScreen4 = new PositionOnScreen("BOTTOM_LEFT", 3);
        f255599g = positionOnScreen4;
        PositionOnScreen[] positionOnScreenArr = {positionOnScreen, positionOnScreen2, positionOnScreen3, positionOnScreen4};
        f255600h = positionOnScreenArr;
        f255601i = kotlin.enums.c.a(positionOnScreenArr);
        f255594b = new a(null);
        f255595c = positionOnScreen3;
    }

    public PositionOnScreen() {
        throw null;
    }

    public static PositionOnScreen valueOf(String str) {
        return (PositionOnScreen) Enum.valueOf(PositionOnScreen.class, str);
    }

    public static PositionOnScreen[] values() {
        return (PositionOnScreen[]) f255600h.clone();
    }
}
