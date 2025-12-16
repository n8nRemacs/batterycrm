package com.avito.android.passport.profile_add.merge.domain;

import com.adjust.sdk.Constants;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MergeFlow.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/domain/MergeFlow;", "", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MergeFlow {

    /* renamed from: c, reason: collision with root package name */
    public static final MergeFlow f212986c;

    /* renamed from: d, reason: collision with root package name */
    public static final MergeFlow f212987d;

    /* renamed from: e, reason: collision with root package name */
    public static final MergeFlow f212988e;

    /* renamed from: f, reason: collision with root package name */
    public static final MergeFlow f212989f;

    /* renamed from: g, reason: collision with root package name */
    public static final MergeFlow f212990g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ MergeFlow[] f212991h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f212992i;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f212993b;

    static {
        MergeFlow mergeFlow = new MergeFlow("SHORT", 0, "short");
        f212986c = mergeFlow;
        MergeFlow mergeFlow2 = new MergeFlow("LONG", 1, Constants.LONG);
        f212987d = mergeFlow2;
        MergeFlow mergeFlow3 = new MergeFlow("PROFILE_LIST_ONLY", 2, "profile_list_only");
        f212988e = mergeFlow3;
        MergeFlow mergeFlow4 = new MergeFlow("PROFILE_LIST_AND_PROFILE_PROF_CONVERTATION", 3, "profile_list_and_profile_prof_convertation");
        f212989f = mergeFlow4;
        MergeFlow mergeFlow5 = new MergeFlow("PROFILE_LIST_AND_BUSINESS_VRF_DUPLICATION", 4, "profile_list_and_business_vrf_duplication");
        f212990g = mergeFlow5;
        MergeFlow[] mergeFlowArr = {mergeFlow, mergeFlow2, mergeFlow3, mergeFlow4, mergeFlow5};
        f212991h = mergeFlowArr;
        f212992i = kotlin.enums.c.a(mergeFlowArr);
    }

    public MergeFlow(String str, int i12, String str2) {
        this.f212993b = str2;
    }

    public static MergeFlow valueOf(String str) {
        return (MergeFlow) Enum.valueOf(MergeFlow.class, str);
    }

    public static MergeFlow[] values() {
        return (MergeFlow[]) f212991h.clone();
    }
}
