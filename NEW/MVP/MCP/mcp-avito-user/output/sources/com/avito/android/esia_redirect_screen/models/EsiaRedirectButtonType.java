package com.avito.android.esia_redirect_screen.models;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EsiaRedirectButtonType.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/esia_redirect_screen/models/EsiaRedirectButtonType;", "", "_avito_gig_esia-redirect-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EsiaRedirectButtonType {

    /* renamed from: b, reason: collision with root package name */
    public static final EsiaRedirectButtonType f148051b;

    /* renamed from: c, reason: collision with root package name */
    public static final EsiaRedirectButtonType f148052c;

    /* renamed from: d, reason: collision with root package name */
    public static final EsiaRedirectButtonType f148053d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EsiaRedirectButtonType[] f148054e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f148055f;

    static {
        EsiaRedirectButtonType esiaRedirectButtonType = new EsiaRedirectButtonType("PRIMARY", 0);
        f148051b = esiaRedirectButtonType;
        EsiaRedirectButtonType esiaRedirectButtonType2 = new EsiaRedirectButtonType("SECONDARY", 1);
        f148052c = esiaRedirectButtonType2;
        EsiaRedirectButtonType esiaRedirectButtonType3 = new EsiaRedirectButtonType("LINK", 2);
        f148053d = esiaRedirectButtonType3;
        EsiaRedirectButtonType[] esiaRedirectButtonTypeArr = {esiaRedirectButtonType, esiaRedirectButtonType2, esiaRedirectButtonType3};
        f148054e = esiaRedirectButtonTypeArr;
        f148055f = c.a(esiaRedirectButtonTypeArr);
    }

    public EsiaRedirectButtonType() {
        throw null;
    }

    public static EsiaRedirectButtonType valueOf(String str) {
        return (EsiaRedirectButtonType) Enum.valueOf(EsiaRedirectButtonType.class, str);
    }

    public static EsiaRedirectButtonType[] values() {
        return (EsiaRedirectButtonType[]) f148054e.clone();
    }
}
