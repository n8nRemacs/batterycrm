package com.avito.android.remote.autoteka.model;

import Hj0.e;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.C42822w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AutotekaPreviewResponse.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0013\b\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/remote/autoteka/model/AutotekaPreviewStatus;", "", "LHj0/e;", "", "isTerminal", "<init>", "(Ljava/lang/String;IZ)V", "SUCCESS", "REPORT_NOT_FOUND", "AUTO_NOT_FOUND", "PENDING", "_avito-discouraged_avito-api_autoteka"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AutotekaPreviewStatus implements e {

    @c("vinNotFound")
    public static final AutotekaPreviewStatus AUTO_NOT_FOUND;

    @c("pending")
    public static final AutotekaPreviewStatus PENDING;

    @c("reportNotFound")
    public static final AutotekaPreviewStatus REPORT_NOT_FOUND;

    @c("completed")
    public static final AutotekaPreviewStatus SUCCESS;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AutotekaPreviewStatus[] f253291c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a f253292d;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f253293b;

    static {
        AutotekaPreviewStatus autotekaPreviewStatus = new AutotekaPreviewStatus("SUCCESS", 0, false, 1, null);
        SUCCESS = autotekaPreviewStatus;
        AutotekaPreviewStatus autotekaPreviewStatus2 = new AutotekaPreviewStatus("REPORT_NOT_FOUND", 1, false, 1, null);
        REPORT_NOT_FOUND = autotekaPreviewStatus2;
        AutotekaPreviewStatus autotekaPreviewStatus3 = new AutotekaPreviewStatus("AUTO_NOT_FOUND", 2, false, 1, null);
        AUTO_NOT_FOUND = autotekaPreviewStatus3;
        AutotekaPreviewStatus autotekaPreviewStatus4 = new AutotekaPreviewStatus("PENDING", 3, false);
        PENDING = autotekaPreviewStatus4;
        AutotekaPreviewStatus[] autotekaPreviewStatusArr = {autotekaPreviewStatus, autotekaPreviewStatus2, autotekaPreviewStatus3, autotekaPreviewStatus4};
        f253291c = autotekaPreviewStatusArr;
        f253292d = kotlin.enums.c.a(autotekaPreviewStatusArr);
    }

    private AutotekaPreviewStatus(String str, int i12, boolean z12) {
        this.f253293b = z12;
    }

    public static AutotekaPreviewStatus valueOf(String str) {
        return (AutotekaPreviewStatus) Enum.valueOf(AutotekaPreviewStatus.class, str);
    }

    public static AutotekaPreviewStatus[] values() {
        return (AutotekaPreviewStatus[]) f253291c.clone();
    }

    public /* synthetic */ AutotekaPreviewStatus(String str, int i12, boolean z12, int i13, C42822w c42822w) {
        this(str, i12, (i13 & 1) != 0 ? true : z12);
    }
}
