package com.avito.android.lib.design.docking_badge;

import Y61.k;
import com.adjust.sdk.Constants;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DockinBadgeItem.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/avito/android/lib/design/docking_badge/DockingBadgeSize;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "a", "SMALL", "MEDIUM", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DockingBadgeSize {

    @c("medium")
    public static final DockingBadgeSize MEDIUM;

    @c(Constants.SMALL)
    public static final DockingBadgeSize SMALL;

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f179132c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ DockingBadgeSize[] f179133d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f179134e;

    /* renamed from: b, reason: collision with root package name */
    public final int f179135b;

    /* compiled from: DockinBadgeItem.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/docking_badge/DockingBadgeSize$a;", "", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        DockingBadgeSize dockingBadgeSize = new DockingBadgeSize("SMALL", 0, 0);
        SMALL = dockingBadgeSize;
        DockingBadgeSize dockingBadgeSize2 = new DockingBadgeSize("MEDIUM", 1, 1);
        MEDIUM = dockingBadgeSize2;
        DockingBadgeSize[] dockingBadgeSizeArr = {dockingBadgeSize, dockingBadgeSize2};
        f179133d = dockingBadgeSizeArr;
        f179134e = kotlin.enums.c.a(dockingBadgeSizeArr);
        f179132c = new a(null);
    }

    private DockingBadgeSize(String str, int i12, int i13) {
        this.f179135b = i13;
    }

    public static DockingBadgeSize valueOf(String str) {
        return (DockingBadgeSize) Enum.valueOf(DockingBadgeSize.class, str);
    }

    public static DockingBadgeSize[] values() {
        return (DockingBadgeSize[]) f179133d.clone();
    }
}
