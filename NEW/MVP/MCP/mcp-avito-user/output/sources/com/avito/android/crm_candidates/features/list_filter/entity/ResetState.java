package com.avito.android.crm_candidates.features.list_filter.entity;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: JobCrmListFilterState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_candidates/features/list_filter/entity/ResetState;", "", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ResetState {

    /* renamed from: b, reason: collision with root package name */
    public static final ResetState f129677b;

    /* renamed from: c, reason: collision with root package name */
    public static final ResetState f129678c;

    /* renamed from: d, reason: collision with root package name */
    public static final ResetState f129679d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ ResetState[] f129680e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f129681f;

    static {
        ResetState resetState = new ResetState("HIDDEN", 0);
        f129677b = resetState;
        ResetState resetState2 = new ResetState("DISABLED", 1);
        f129678c = resetState2;
        ResetState resetState3 = new ResetState("ENABLED", 2);
        f129679d = resetState3;
        ResetState[] resetStateArr = {resetState, resetState2, resetState3};
        f129680e = resetStateArr;
        f129681f = c.a(resetStateArr);
    }

    public ResetState() {
        throw null;
    }

    public static ResetState valueOf(String str) {
        return (ResetState) Enum.valueOf(ResetState.class, str);
    }

    public static ResetState[] values() {
        return (ResetState[]) f129680e.clone();
    }
}
