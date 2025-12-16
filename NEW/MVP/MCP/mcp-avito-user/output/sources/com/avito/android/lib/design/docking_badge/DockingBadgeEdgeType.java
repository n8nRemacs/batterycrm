package com.avito.android.lib.design.docking_badge;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DockinBadgeItem.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/lib/design/docking_badge/DockingBadgeEdgeType;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "a", "Square", "Flag", "Pipka", "Pyramid", "AntiPyramid", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DockingBadgeEdgeType {

    @c("antiPyramid")
    public static final DockingBadgeEdgeType AntiPyramid;

    @c("flag")
    public static final DockingBadgeEdgeType Flag;

    @c("pipka")
    public static final DockingBadgeEdgeType Pipka;

    @c("pyramid")
    public static final DockingBadgeEdgeType Pyramid;

    @c("square")
    public static final DockingBadgeEdgeType Square;

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f179123c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ DockingBadgeEdgeType[] f179124d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f179125e;

    /* renamed from: b, reason: collision with root package name */
    public final int f179126b;

    /* compiled from: DockinBadgeItem.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/docking_badge/DockingBadgeEdgeType$a;", "", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        DockingBadgeEdgeType dockingBadgeEdgeType = new DockingBadgeEdgeType("Square", 0, 0);
        Square = dockingBadgeEdgeType;
        DockingBadgeEdgeType dockingBadgeEdgeType2 = new DockingBadgeEdgeType("Flag", 1, 1);
        Flag = dockingBadgeEdgeType2;
        DockingBadgeEdgeType dockingBadgeEdgeType3 = new DockingBadgeEdgeType("Pipka", 2, 2);
        Pipka = dockingBadgeEdgeType3;
        DockingBadgeEdgeType dockingBadgeEdgeType4 = new DockingBadgeEdgeType("Pyramid", 3, 3);
        Pyramid = dockingBadgeEdgeType4;
        DockingBadgeEdgeType dockingBadgeEdgeType5 = new DockingBadgeEdgeType("AntiPyramid", 4, 4);
        AntiPyramid = dockingBadgeEdgeType5;
        DockingBadgeEdgeType[] dockingBadgeEdgeTypeArr = {dockingBadgeEdgeType, dockingBadgeEdgeType2, dockingBadgeEdgeType3, dockingBadgeEdgeType4, dockingBadgeEdgeType5};
        f179124d = dockingBadgeEdgeTypeArr;
        f179125e = kotlin.enums.c.a(dockingBadgeEdgeTypeArr);
        f179123c = new a(null);
    }

    private DockingBadgeEdgeType(String str, int i12, int i13) {
        this.f179126b = i13;
    }

    public static DockingBadgeEdgeType valueOf(String str) {
        return (DockingBadgeEdgeType) Enum.valueOf(DockingBadgeEdgeType.class, str);
    }

    public static DockingBadgeEdgeType[] values() {
        return (DockingBadgeEdgeType[]) f179124d.clone();
    }
}
