package com.avito.android.passport.network.model;

import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CreatedProfileStatus.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/passport/network/model/CreatedProfileStatus;", "", "(Ljava/lang/String;I)V", "FINALIZED", "DRAFT", "_avito_passport-lib_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CreatedProfileStatus {

    @c("draft")
    public static final CreatedProfileStatus DRAFT;

    @c("finalized")
    public static final CreatedProfileStatus FINALIZED;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ CreatedProfileStatus[] f211141b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f211142c;

    static {
        CreatedProfileStatus createdProfileStatus = new CreatedProfileStatus("FINALIZED", 0);
        FINALIZED = createdProfileStatus;
        CreatedProfileStatus createdProfileStatus2 = new CreatedProfileStatus("DRAFT", 1);
        DRAFT = createdProfileStatus2;
        CreatedProfileStatus[] createdProfileStatusArr = {createdProfileStatus, createdProfileStatus2};
        f211141b = createdProfileStatusArr;
        f211142c = kotlin.enums.c.a(createdProfileStatusArr);
    }

    private CreatedProfileStatus(String str, int i12) {
    }

    public static CreatedProfileStatus valueOf(String str) {
        return (CreatedProfileStatus) Enum.valueOf(CreatedProfileStatus.class, str);
    }

    public static CreatedProfileStatus[] values() {
        return (CreatedProfileStatus[]) f211141b.clone();
    }
}
