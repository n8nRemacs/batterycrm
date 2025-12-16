package com.avito.beduin.v2.avito.component.docking_badge.state;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractC42738c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AvitoDockingBadgeState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/avito/component/docking_badge/state/EdgeType;", "", "a", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EdgeType {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f334313c;

    /* renamed from: d, reason: collision with root package name */
    public static final EdgeType f334314d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EdgeType[] f334315e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f334316f;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f334317b;

    /* compiled from: AvitoDockingBadgeState.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/avito/component/docking_badge/state/EdgeType$a;", "", "<init>", "()V", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.l
        public static EdgeType a(@Y61.l String str) {
            Object next;
            Iterator it = ((AbstractC42738c) EdgeType.f334316f).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((EdgeType) next).f334317b.equals(str)) {
                    break;
                }
            }
            return (EdgeType) next;
        }

        public a() {
        }
    }

    static {
        EdgeType edgeType = new EdgeType("Square", 0, "square");
        f334314d = edgeType;
        EdgeType[] edgeTypeArr = {edgeType, new EdgeType("Flag", 1, "flag"), new EdgeType("Pipka", 2, "pipka"), new EdgeType("Pyramid", 3, "pyramid"), new EdgeType("AntiPyramid", 4, "antiPyramid")};
        f334315e = edgeTypeArr;
        f334316f = kotlin.enums.c.a(edgeTypeArr);
        f334313c = new a(null);
    }

    public EdgeType(String str, int i12, String str2) {
        this.f334317b = str2;
    }

    public static EdgeType valueOf(String str) {
        return (EdgeType) Enum.valueOf(EdgeType.class, str);
    }

    public static EdgeType[] values() {
        return (EdgeType[]) f334315e.clone();
    }
}
