package com.avito.android.beduin_shared.model.action.custom;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ScrollHandlerScrollParameters.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin_shared/model/action/custom/BeduinScrollPosition;", "", "_avito_beduin-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BeduinScrollPosition {

    /* renamed from: b, reason: collision with root package name */
    public static final BeduinScrollPosition f105279b;

    /* renamed from: c, reason: collision with root package name */
    public static final BeduinScrollPosition f105280c;

    /* renamed from: d, reason: collision with root package name */
    public static final BeduinScrollPosition f105281d;

    /* renamed from: e, reason: collision with root package name */
    public static final BeduinScrollPosition f105282e;

    /* renamed from: f, reason: collision with root package name */
    public static final BeduinScrollPosition f105283f;

    /* renamed from: g, reason: collision with root package name */
    public static final BeduinScrollPosition f105284g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ BeduinScrollPosition[] f105285h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f105286i;

    static {
        BeduinScrollPosition beduinScrollPosition = new BeduinScrollPosition("TOP", 0);
        f105279b = beduinScrollPosition;
        BeduinScrollPosition beduinScrollPosition2 = new BeduinScrollPosition("BOTTOM", 1);
        f105280c = beduinScrollPosition2;
        BeduinScrollPosition beduinScrollPosition3 = new BeduinScrollPosition("LEFT", 2);
        f105281d = beduinScrollPosition3;
        BeduinScrollPosition beduinScrollPosition4 = new BeduinScrollPosition("RIGHT", 3);
        f105282e = beduinScrollPosition4;
        BeduinScrollPosition beduinScrollPosition5 = new BeduinScrollPosition("CENTERED_VERTICALLY", 4);
        f105283f = beduinScrollPosition5;
        BeduinScrollPosition beduinScrollPosition6 = new BeduinScrollPosition("CENTERED_HORIZONTALLY", 5);
        f105284g = beduinScrollPosition6;
        BeduinScrollPosition[] beduinScrollPositionArr = {beduinScrollPosition, beduinScrollPosition2, beduinScrollPosition3, beduinScrollPosition4, beduinScrollPosition5, beduinScrollPosition6};
        f105285h = beduinScrollPositionArr;
        f105286i = kotlin.enums.c.a(beduinScrollPositionArr);
    }

    public BeduinScrollPosition() {
        throw null;
    }

    public static BeduinScrollPosition valueOf(String str) {
        return (BeduinScrollPosition) Enum.valueOf(BeduinScrollPosition.class, str);
    }

    public static BeduinScrollPosition[] values() {
        return (BeduinScrollPosition[]) f105285h.clone();
    }
}
