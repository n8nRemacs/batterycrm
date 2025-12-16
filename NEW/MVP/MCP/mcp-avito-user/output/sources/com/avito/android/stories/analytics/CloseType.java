package com.avito.android.stories.analytics;

import Y61.k;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CloseType.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/stories/analytics/CloseType;", "", "_avito_stories_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CloseType {

    /* renamed from: b, reason: collision with root package name */
    public static final CloseType f285074b;

    /* renamed from: c, reason: collision with root package name */
    public static final CloseType f285075c;

    /* renamed from: d, reason: collision with root package name */
    public static final CloseType f285076d;

    /* renamed from: e, reason: collision with root package name */
    public static final CloseType f285077e;

    /* renamed from: f, reason: collision with root package name */
    public static final CloseType f285078f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ CloseType[] f285079g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f285080h;

    /* compiled from: CloseType.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[CloseType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CloseType closeType = CloseType.f285074b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                CloseType closeType2 = CloseType.f285074b;
                iArr[4] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                CloseType closeType3 = CloseType.f285074b;
                iArr[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                CloseType closeType4 = CloseType.f285074b;
                iArr[3] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        CloseType closeType = new CloseType("CLOSE_WITH_CROSS", 0);
        f285074b = closeType;
        CloseType closeType2 = new CloseType("CLOSE_WITH_SWIPE", 1);
        f285075c = closeType2;
        CloseType closeType3 = new CloseType("SOME_PROBLEM", 2);
        f285076d = closeType3;
        CloseType closeType4 = new CloseType("CLOSE_BY_USER", 3);
        f285077e = closeType4;
        CloseType closeType5 = new CloseType("WEBVIEW_PROBLEM", 4);
        f285078f = closeType5;
        CloseType[] closeTypeArr = {closeType, closeType2, closeType3, closeType4, closeType5};
        f285079g = closeTypeArr;
        f285080h = c.a(closeTypeArr);
    }

    public CloseType() {
        throw null;
    }

    public static CloseType valueOf(String str) {
        return (CloseType) Enum.valueOf(CloseType.class, str);
    }

    public static CloseType[] values() {
        return (CloseType[]) f285079g.clone();
    }

    @k
    public final String a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "close_with_cross";
        }
        if (iOrdinal == 1) {
            return "close_with_swipe";
        }
        if (iOrdinal == 2) {
            return "no_200";
        }
        if (iOrdinal == 3) {
            return "close_by_user";
        }
        if (iOrdinal == 4) {
            return "no_webview_answer";
        }
        throw new NoWhenBranchMatchedException();
    }
}
