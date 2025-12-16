package com.avito.android.seller_promotions.model;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BeduinFormType.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/seller_promotions/model/BeduinFormType;", "", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BeduinFormType {

    /* renamed from: b, reason: collision with root package name */
    public static final BeduinFormType f267873b;

    /* renamed from: c, reason: collision with root package name */
    public static final BeduinFormType f267874c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ BeduinFormType[] f267875d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a f267876e;

    static {
        BeduinFormType beduinFormType = new BeduinFormType("TOP", 0);
        f267873b = beduinFormType;
        BeduinFormType beduinFormType2 = new BeduinFormType("BOTTOM", 1);
        f267874c = beduinFormType2;
        BeduinFormType[] beduinFormTypeArr = {beduinFormType, beduinFormType2};
        f267875d = beduinFormTypeArr;
        f267876e = c.a(beduinFormTypeArr);
    }

    public BeduinFormType() {
        throw null;
    }

    public static BeduinFormType valueOf(String str) {
        return (BeduinFormType) Enum.valueOf(BeduinFormType.class, str);
    }

    public static BeduinFormType[] values() {
        return (BeduinFormType[]) f267875d.clone();
    }
}
