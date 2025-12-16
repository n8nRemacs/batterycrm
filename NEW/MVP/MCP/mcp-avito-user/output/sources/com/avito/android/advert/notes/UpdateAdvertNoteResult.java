package com.avito.android.advert.notes;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UpdateAdvertNoteResult.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/notes/UpdateAdvertNoteResult;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class UpdateAdvertNoteResult {

    /* renamed from: b, reason: collision with root package name */
    public static final UpdateAdvertNoteResult f80878b;

    /* renamed from: c, reason: collision with root package name */
    public static final UpdateAdvertNoteResult f80879c;

    /* renamed from: d, reason: collision with root package name */
    public static final UpdateAdvertNoteResult f80880d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ UpdateAdvertNoteResult[] f80881e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f80882f;

    static {
        UpdateAdvertNoteResult updateAdvertNoteResult = new UpdateAdvertNoteResult("CREATED", 0);
        f80878b = updateAdvertNoteResult;
        UpdateAdvertNoteResult updateAdvertNoteResult2 = new UpdateAdvertNoteResult("UPDATED", 1);
        f80879c = updateAdvertNoteResult2;
        UpdateAdvertNoteResult updateAdvertNoteResult3 = new UpdateAdvertNoteResult("DELETED", 2);
        f80880d = updateAdvertNoteResult3;
        UpdateAdvertNoteResult[] updateAdvertNoteResultArr = {updateAdvertNoteResult, updateAdvertNoteResult2, updateAdvertNoteResult3};
        f80881e = updateAdvertNoteResultArr;
        f80882f = kotlin.enums.c.a(updateAdvertNoteResultArr);
    }

    public UpdateAdvertNoteResult() {
        throw null;
    }

    public static UpdateAdvertNoteResult valueOf(String str) {
        return (UpdateAdvertNoteResult) Enum.valueOf(UpdateAdvertNoteResult.class, str);
    }

    public static UpdateAdvertNoteResult[] values() {
        return (UpdateAdvertNoteResult[]) f80881e.clone();
    }
}
