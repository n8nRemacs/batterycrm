package com.avito.android.developments_agency_search.domain;

import Y61.k;
import com.avito.android.remote.model.ProfileTab;
import kotlin.Metadata;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GetClientListRequest.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/domain/GetClientListRequestStage;", "", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GetClientListRequestStage {

    /* renamed from: c, reason: collision with root package name */
    public static final GetClientListRequestStage f136497c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ GetClientListRequestStage[] f136498d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f136499e;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f136500b;

    static {
        GetClientListRequestStage getClientListRequestStage = new GetClientListRequestStage("ALL", 0, ProfileTab.ALL);
        f136497c = getClientListRequestStage;
        GetClientListRequestStage[] getClientListRequestStageArr = {getClientListRequestStage, new GetClientListRequestStage("SELECTION", 1, "selection"), new GetClientListRequestStage("BINDING", 2, "binding"), new GetClientListRequestStage("BOOKING", 3, "booking"), new GetClientListRequestStage("DEAL", 4, "deal"), new GetClientListRequestStage("REVENUE", 5, "revenue"), new GetClientListRequestStage("ARCHIVED", 6, "archived")};
        f136498d = getClientListRequestStageArr;
        f136499e = c.a(getClientListRequestStageArr);
    }

    public GetClientListRequestStage(String str, int i12, String str2) {
        this.f136500b = str2;
    }

    public static GetClientListRequestStage valueOf(String str) {
        return (GetClientListRequestStage) Enum.valueOf(GetClientListRequestStage.class, str);
    }

    public static GetClientListRequestStage[] values() {
        return (GetClientListRequestStage[]) f136498d.clone();
    }
}
