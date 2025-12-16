package com.avito.android.lib.util.groupable_item.immutable;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupingResult.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/util/groupable_item/immutable/Edges;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class Edges {

    /* renamed from: b, reason: collision with root package name */
    public static final Edges f181360b;

    /* renamed from: c, reason: collision with root package name */
    public static final Edges f181361c;

    /* renamed from: d, reason: collision with root package name */
    public static final Edges f181362d;

    /* renamed from: e, reason: collision with root package name */
    public static final Edges f181363e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ Edges[] f181364f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ a f181365g;

    static {
        Edges edges = new Edges("TOP", 0);
        f181360b = edges;
        Edges edges2 = new Edges("BOTTOM", 1);
        f181361c = edges2;
        Edges edges3 = new Edges("ALL", 2);
        f181362d = edges3;
        Edges edges4 = new Edges("NONE", 3);
        f181363e = edges4;
        Edges[] edgesArr = {edges, edges2, edges3, edges4};
        f181364f = edgesArr;
        f181365g = c.a(edgesArr);
    }

    public Edges() {
        throw null;
    }

    public static Edges valueOf(String str) {
        return (Edges) Enum.valueOf(Edges.class, str);
    }

    public static Edges[] values() {
        return (Edges[]) f181364f.clone();
    }
}
