package com.akita.compose.component.tab_group;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TabGroup.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/akita/compose/component/tab_group/v;", "", "tab-group_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class v {

    /* renamed from: b, reason: collision with root package name */
    public static final v f63100b;

    /* renamed from: c, reason: collision with root package name */
    public static final v f63101c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ v[] f63102d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f63103e;

    static {
        v vVar = new v("Tabs", 0);
        f63100b = vVar;
        v vVar2 = new v("Indicator", 1);
        f63101c = vVar2;
        v[] vVarArr = {vVar, vVar2};
        f63102d = vVarArr;
        f63103e = kotlin.enums.c.a(vVarArr);
    }

    public v() {
        throw null;
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) f63102d.clone();
    }
}
