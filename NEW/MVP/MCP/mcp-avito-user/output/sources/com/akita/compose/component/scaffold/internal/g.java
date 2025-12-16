package com.akita.compose.component.scaffold.internal;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ScaffoldLayout.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/akita/compose/component/scaffold/internal/g;", "", "scaffold_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class g {

    /* renamed from: b, reason: collision with root package name */
    public static final g f62535b;

    /* renamed from: c, reason: collision with root package name */
    public static final g f62536c;

    /* renamed from: d, reason: collision with root package name */
    public static final g f62537d;

    /* renamed from: e, reason: collision with root package name */
    public static final g f62538e;

    /* renamed from: f, reason: collision with root package name */
    public static final g f62539f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ g[] f62540g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f62541h;

    static {
        g gVar = new g("TopBar", 0);
        f62535b = gVar;
        g gVar2 = new g("BottomBar", 1);
        f62536c = gVar2;
        g gVar3 = new g("MainContent", 2);
        f62537d = gVar3;
        g gVar4 = new g("ToastBar", 3);
        f62538e = gVar4;
        g gVar5 = new g("FloatingContainer", 4);
        f62539f = gVar5;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5};
        f62540g = gVarArr;
        f62541h = kotlin.enums.c.a(gVarArr);
    }

    public g() {
        throw null;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f62540g.clone();
    }
}
