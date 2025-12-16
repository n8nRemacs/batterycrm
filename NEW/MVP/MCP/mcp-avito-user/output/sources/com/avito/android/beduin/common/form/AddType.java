package com.avito.android.beduin.common.form;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AddType.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/form/AddType;", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AddType {

    /* renamed from: b, reason: collision with root package name */
    public static final AddType f103316b;

    /* renamed from: c, reason: collision with root package name */
    public static final AddType f103317c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AddType[] f103318d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f103319e;

    static {
        AddType addType = new AddType("BEFORE", 0);
        f103316b = addType;
        AddType addType2 = new AddType("AFTER", 1);
        f103317c = addType2;
        AddType[] addTypeArr = {addType, addType2};
        f103318d = addTypeArr;
        f103319e = kotlin.enums.c.a(addTypeArr);
    }

    public AddType() {
        throw null;
    }

    public static AddType valueOf(String str) {
        return (AddType) Enum.valueOf(AddType.class, str);
    }

    public static AddType[] values() {
        return (AddType[]) f103318d.clone();
    }
}
