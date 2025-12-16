package com.avito.android.authorization.gorelkin.event;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ParsingPermissionFormOpenEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/gorelkin/event/ParsingPermissionFormOpenSource;", "", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ParsingPermissionFormOpenSource {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ ParsingPermissionFormOpenSource[] f93920b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f93921c;

    static {
        ParsingPermissionFormOpenSource[] parsingPermissionFormOpenSourceArr = {new ParsingPermissionFormOpenSource("ITEM_ADD", 0, "item_add"), new ParsingPermissionFormOpenSource("AUTH", 1, "auth")};
        f93920b = parsingPermissionFormOpenSourceArr;
        f93921c = c.a(parsingPermissionFormOpenSourceArr);
    }

    public ParsingPermissionFormOpenSource(String str, int i12, String str2) {
    }

    public static ParsingPermissionFormOpenSource valueOf(String str) {
        return (ParsingPermissionFormOpenSource) Enum.valueOf(ParsingPermissionFormOpenSource.class, str);
    }

    public static ParsingPermissionFormOpenSource[] values() {
        return (ParsingPermissionFormOpenSource[]) f93920b.clone();
    }
}
