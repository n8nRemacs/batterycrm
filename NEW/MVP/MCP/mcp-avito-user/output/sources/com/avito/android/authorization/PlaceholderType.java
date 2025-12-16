package com.avito.android.authorization;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UserAgreementBuilder.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/PlaceholderType;", "", "_avito_authorization_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PlaceholderType {

    /* renamed from: b, reason: collision with root package name */
    public static final PlaceholderType f92738b;

    /* renamed from: c, reason: collision with root package name */
    public static final PlaceholderType f92739c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ PlaceholderType[] f92740d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a f92741e;

    static {
        PlaceholderType placeholderType = new PlaceholderType("AUTH_BOTTOM_SHEET", 0);
        f92738b = placeholderType;
        PlaceholderType placeholderType2 = new PlaceholderType("REGISTRATION", 1);
        f92739c = placeholderType2;
        PlaceholderType[] placeholderTypeArr = {placeholderType, placeholderType2};
        f92740d = placeholderTypeArr;
        f92741e = c.a(placeholderTypeArr);
    }

    public PlaceholderType() {
        throw null;
    }

    public static PlaceholderType valueOf(String str) {
        return (PlaceholderType) Enum.valueOf(PlaceholderType.class, str);
    }

    public static PlaceholderType[] values() {
        return (PlaceholderType[]) f92740d.clone();
    }
}
