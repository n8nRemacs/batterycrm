package com.avito.android.services_portfolio.project.buyer.analytics;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ServicesPortfolioBuyerActionsEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/services_portfolio/project/buyer/analytics/ServicesPortfolioBuyerActionType;", "", "_avito_services-portfolio_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ServicesPortfolioBuyerActionType {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ ServicesPortfolioBuyerActionType[] f280000b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f280001c;

    static {
        ServicesPortfolioBuyerActionType[] servicesPortfolioBuyerActionTypeArr = {new ServicesPortfolioBuyerActionType("DESCRIPTION_ACTION", 0), new ServicesPortfolioBuyerActionType("PHOTO_ACTION", 1)};
        f280000b = servicesPortfolioBuyerActionTypeArr;
        f280001c = c.a(servicesPortfolioBuyerActionTypeArr);
    }

    public static ServicesPortfolioBuyerActionType valueOf(String str) {
        return (ServicesPortfolioBuyerActionType) Enum.valueOf(ServicesPortfolioBuyerActionType.class, str);
    }

    public static ServicesPortfolioBuyerActionType[] values() {
        return (ServicesPortfolioBuyerActionType[]) f280000b.clone();
    }
}
