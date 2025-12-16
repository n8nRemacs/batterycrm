package com.avito.android.serp.adapter.vertical_main;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VerticalFormType.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/VerticalFormType;", "", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class VerticalFormType {

    /* renamed from: c, reason: collision with root package name */
    public static final VerticalFormType f272519c;

    /* renamed from: d, reason: collision with root package name */
    public static final VerticalFormType f272520d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ VerticalFormType[] f272521e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f272522f;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f272523b;

    static {
        VerticalFormType verticalFormType = new VerticalFormType("SEARCH", 0, "form");
        f272519c = verticalFormType;
        VerticalFormType verticalFormType2 = new VerticalFormType("PUBLISH", 1, "publish_form");
        f272520d = verticalFormType2;
        VerticalFormType[] verticalFormTypeArr = {verticalFormType, verticalFormType2};
        f272521e = verticalFormTypeArr;
        f272522f = kotlin.enums.c.a(verticalFormTypeArr);
    }

    public VerticalFormType(String str, int i12, String str2) {
        this.f272523b = str2;
    }

    public static VerticalFormType valueOf(String str) {
        return (VerticalFormType) Enum.valueOf(VerticalFormType.class, str);
    }

    public static VerticalFormType[] values() {
        return (VerticalFormType[]) f272521e.clone();
    }
}
