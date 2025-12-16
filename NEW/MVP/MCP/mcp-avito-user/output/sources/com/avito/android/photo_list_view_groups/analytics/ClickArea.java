package com.avito.android.photo_list_view_groups.analytics;

import Y61.l;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PhotoItemGroupsImagesGroupsTracker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_list_view_groups/analytics/ClickArea;", "", "_avito_photo-list-view-groups_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ClickArea {

    /* renamed from: c, reason: collision with root package name */
    public static final ClickArea f218471c;

    /* renamed from: d, reason: collision with root package name */
    public static final ClickArea f218472d;

    /* renamed from: e, reason: collision with root package name */
    public static final ClickArea f218473e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ ClickArea[] f218474f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ a f218475g;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f218476b;

    static {
        ClickArea clickArea = new ClickArea("LABEL", 0, "tag");
        f218471c = clickArea;
        ClickArea clickArea2 = new ClickArea("IMAGE", 1, null);
        f218472d = clickArea2;
        ClickArea clickArea3 = new ClickArea("ACTION", 2, "icon");
        f218473e = clickArea3;
        ClickArea[] clickAreaArr = {clickArea, clickArea2, clickArea3};
        f218474f = clickAreaArr;
        f218475g = c.a(clickAreaArr);
    }

    public ClickArea(String str, int i12, String str2) {
        this.f218476b = str2;
    }

    public static ClickArea valueOf(String str) {
        return (ClickArea) Enum.valueOf(ClickArea.class, str);
    }

    public static ClickArea[] values() {
        return (ClickArea[]) f218474f.clone();
    }
}
