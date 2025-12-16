package com.avito.android.developments_agency_search.domain;

import Y61.k;
import com.avito.android.developments_agency_search_impl.generated.api.api_1_nd_trx_mortgage_list_post.MortgageApplicationView;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GetMortgageListRequest.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/domain/GetMortgageListRequestStatus;", "", "a", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GetMortgageListRequestStatus {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f136527c;

    /* renamed from: d, reason: collision with root package name */
    public static final GetMortgageListRequestStatus f136528d;

    /* renamed from: e, reason: collision with root package name */
    public static final GetMortgageListRequestStatus f136529e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ GetMortgageListRequestStatus[] f136530f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f136531g;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f136532b;

    /* compiled from: GetMortgageListRequest.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/domain/GetMortgageListRequestStatus$a;", "", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: GetMortgageListRequest.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.developments_agency_search.domain.GetMortgageListRequestStatus$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C4119a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f136533a;

            static {
                int[] iArr = new int[MortgageApplicationView.Status.values().length];
                try {
                    iArr[MortgageApplicationView.Status.Active.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[MortgageApplicationView.Status.Archived.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f136533a = iArr;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        GetMortgageListRequestStatus getMortgageListRequestStatus = new GetMortgageListRequestStatus("ACTIVE", 0, "active");
        f136528d = getMortgageListRequestStatus;
        GetMortgageListRequestStatus getMortgageListRequestStatus2 = new GetMortgageListRequestStatus("ARCHIVED", 1, "archived");
        f136529e = getMortgageListRequestStatus2;
        GetMortgageListRequestStatus[] getMortgageListRequestStatusArr = {getMortgageListRequestStatus, getMortgageListRequestStatus2};
        f136530f = getMortgageListRequestStatusArr;
        f136531g = c.a(getMortgageListRequestStatusArr);
        f136527c = new a(null);
    }

    public GetMortgageListRequestStatus(String str, int i12, String str2) {
        this.f136532b = str2;
    }

    public static GetMortgageListRequestStatus valueOf(String str) {
        return (GetMortgageListRequestStatus) Enum.valueOf(GetMortgageListRequestStatus.class, str);
    }

    public static GetMortgageListRequestStatus[] values() {
        return (GetMortgageListRequestStatus[]) f136530f.clone();
    }
}
