package com.avito.android.saved_searches.presentation.items;

import kotlin.Metadata;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CommunicationType.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/saved_searches/presentation/items/CommunicationType;", "", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CommunicationType {

    /* renamed from: b, reason: collision with root package name */
    public static final CommunicationType f258417b;

    /* renamed from: c, reason: collision with root package name */
    public static final CommunicationType f258418c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ CommunicationType[] f258419d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f258420e;

    static {
        CommunicationType communicationType = new CommunicationType("PUSH", 0);
        f258417b = communicationType;
        CommunicationType communicationType2 = new CommunicationType("EMAIL", 1);
        f258418c = communicationType2;
        CommunicationType[] communicationTypeArr = {communicationType, communicationType2};
        f258419d = communicationTypeArr;
        f258420e = c.a(communicationTypeArr);
    }

    public CommunicationType() {
        throw null;
    }

    public static CommunicationType valueOf(String str) {
        return (CommunicationType) Enum.valueOf(CommunicationType.class, str);
    }

    public static CommunicationType[] values() {
        return (CommunicationType[]) f258419d.clone();
    }
}
