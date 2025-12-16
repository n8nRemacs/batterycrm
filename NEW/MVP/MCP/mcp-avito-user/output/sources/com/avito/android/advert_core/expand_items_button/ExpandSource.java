package com.avito.android.advert_core.expand_items_button;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ExpandItemsButtonItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/expand_items_button/ExpandSource;", "", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ExpandSource {

    /* renamed from: b, reason: collision with root package name */
    public static final ExpandSource f83570b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ ExpandSource[] f83571c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f83572d;

    static {
        ExpandSource expandSource = new ExpandSource("Parameters", 0);
        f83570b = expandSource;
        ExpandSource[] expandSourceArr = {expandSource};
        f83571c = expandSourceArr;
        f83572d = kotlin.enums.c.a(expandSourceArr);
    }

    public ExpandSource() {
        throw null;
    }

    public static ExpandSource valueOf(String str) {
        return (ExpandSource) Enum.valueOf(ExpandSource.class, str);
    }

    public static ExpandSource[] values() {
        return (ExpandSource[]) f83571c.clone();
    }
}
