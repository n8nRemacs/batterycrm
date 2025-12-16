package com.avito.android.visual_rubricator;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Space.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/visual_rubricator/Space;", "", "_avito_bx-content_widget_visual-rubricator_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Space {

    /* renamed from: b, reason: collision with root package name */
    public static final Space f327296b;

    /* renamed from: c, reason: collision with root package name */
    public static final Space f327297c;

    /* renamed from: d, reason: collision with root package name */
    public static final Space f327298d;

    /* renamed from: e, reason: collision with root package name */
    public static final Space f327299e;

    /* renamed from: f, reason: collision with root package name */
    public static final Space f327300f;

    /* renamed from: g, reason: collision with root package name */
    public static final Space f327301g;

    /* renamed from: h, reason: collision with root package name */
    public static final Space f327302h;

    /* renamed from: i, reason: collision with root package name */
    public static final Space f327303i;

    /* renamed from: j, reason: collision with root package name */
    public static final Space f327304j;

    /* renamed from: k, reason: collision with root package name */
    public static final Space f327305k;

    /* renamed from: l, reason: collision with root package name */
    public static final Space f327306l;

    /* renamed from: m, reason: collision with root package name */
    public static final Space f327307m;

    /* renamed from: n, reason: collision with root package name */
    public static final Space f327308n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ Space[] f327309o;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f327310p;

    static {
        Space space = new Space("HOME", 0);
        f327296b = space;
        Space space2 = new Space("VERTICAL_MAIN", 1);
        f327297c = space2;
        Space space3 = new Space("SALE_WIDGET_DOUBLE_ROW", 2);
        f327298d = space3;
        Space space4 = new Space("SALE_WIDGET_STATIC", 3);
        f327299e = space4;
        Space space5 = new Space("DEAL_CABINET", 4);
        f327300f = space5;
        Space space6 = new Space("HOME_NO_RECS", 5);
        f327301g = space6;
        Space space7 = new Space("HOME_REDESIGN", 6);
        f327302h = space7;
        Space space8 = new Space("HOME_SMALL_ALL_CAT", 7);
        f327303i = space8;
        Space space9 = new Space("HOME_TINY_ALL_CAT", 8);
        f327304j = space9;
        Space space10 = new Space("HOME_FIRST_ALL_CAT", 9);
        f327305k = space10;
        Space space11 = new Space("HOME_GLOBAL", 10);
        f327306l = space11;
        Space space12 = new Space("VERTICAL_MAIN_GLOBAL", 11);
        f327307m = space12;
        Space space13 = new Space("ONE_LINE_SCROLLABLE", 12);
        f327308n = space13;
        Space[] spaceArr = {space, space2, space3, space4, space5, space6, space7, space8, space9, space10, space11, space12, space13};
        f327309o = spaceArr;
        f327310p = kotlin.enums.c.a(spaceArr);
    }

    public Space() {
        throw null;
    }

    public static Space valueOf(String str) {
        return (Space) Enum.valueOf(Space.class, str);
    }

    public static Space[] values() {
        return (Space[]) f327309o.clone();
    }

    public final boolean a() {
        return this == f327299e || this == f327298d;
    }

    public final boolean b() {
        return this == f327297c;
    }
}
