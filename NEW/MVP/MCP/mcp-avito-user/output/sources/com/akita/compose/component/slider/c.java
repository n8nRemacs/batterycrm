package com.akita.compose.component.slider;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Slider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/akita/compose/component/slider/c;", "", "slider_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final c f62690b;

    /* renamed from: c, reason: collision with root package name */
    public static final c f62691c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ c[] f62692d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f62693e;

    static {
        c cVar = new c("THUMB", 0);
        f62690b = cVar;
        c cVar2 = new c("TRACK", 1);
        f62691c = cVar2;
        c[] cVarArr = {cVar, cVar2};
        f62692d = cVarArr;
        f62693e = kotlin.enums.c.a(cVarArr);
    }

    public c() {
        throw null;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f62692d.clone();
    }
}
