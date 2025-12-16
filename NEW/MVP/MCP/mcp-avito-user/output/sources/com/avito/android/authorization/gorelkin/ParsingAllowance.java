package com.avito.android.authorization.gorelkin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ParsingAllowance.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/gorelkin/ParsingAllowance;", "", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ParsingAllowance {

    /* renamed from: c, reason: collision with root package name */
    public static final ParsingAllowance f93859c;

    /* renamed from: d, reason: collision with root package name */
    public static final ParsingAllowance f93860d;

    /* renamed from: e, reason: collision with root package name */
    public static final ParsingAllowance f93861e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ ParsingAllowance[] f93862f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f93863g;

    /* renamed from: b, reason: collision with root package name */
    public final int f93864b;

    static {
        ParsingAllowance parsingAllowance = new ParsingAllowance("ALLOW", 0, 1);
        f93859c = parsingAllowance;
        ParsingAllowance parsingAllowance2 = new ParsingAllowance("MAYBE", 1, 2);
        f93860d = parsingAllowance2;
        ParsingAllowance parsingAllowance3 = new ParsingAllowance("DENY", 2, 3);
        f93861e = parsingAllowance3;
        ParsingAllowance[] parsingAllowanceArr = {parsingAllowance, parsingAllowance2, parsingAllowance3};
        f93862f = parsingAllowanceArr;
        f93863g = kotlin.enums.c.a(parsingAllowanceArr);
    }

    public ParsingAllowance(String str, int i12, int i13) {
        this.f93864b = i13;
    }

    public static ParsingAllowance valueOf(String str) {
        return (ParsingAllowance) Enum.valueOf(ParsingAllowance.class, str);
    }

    public static ParsingAllowance[] values() {
        return (ParsingAllowance[]) f93862f.clone();
    }
}
