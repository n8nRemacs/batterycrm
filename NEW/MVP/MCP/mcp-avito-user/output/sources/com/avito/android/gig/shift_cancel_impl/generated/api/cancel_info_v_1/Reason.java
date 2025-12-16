package com.avito.android.gig.shift_cancel_impl.generated.api.cancel_info_v_1;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: CancelInfoV1Response.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u000eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/avito/android/gig/shift_cancel_impl/generated/api/cancel_info_v_1/Reason;", "", "", "label", "Lcom/avito/android/gig/shift_cancel_impl/generated/api/cancel_info_v_1/Reason$ReasonName;", "reasonName", "<init>", "(Ljava/lang/String;Lcom/avito/android/gig/shift_cancel_impl/generated/api/cancel_info_v_1/Reason$ReasonName;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Lcom/avito/android/gig/shift_cancel_impl/generated/api/cancel_info_v_1/Reason$ReasonName;", "b", "()Lcom/avito/android/gig/shift_cancel_impl/generated/api/cancel_info_v_1/Reason$ReasonName;", "ReasonName", "_avito_gig_shift-cancel_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class Reason {

    @c("label")
    @k
    private final String label;

    @c("reasonName")
    @k
    private final ReasonName reasonName;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CancelInfoV1Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/avito/android/gig/shift_cancel_impl/generated/api/cancel_info_v_1/Reason$ReasonName;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "NoWork", "Personal", "FinishEarly", "_avito_gig_shift-cancel_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ReasonName {

        @c("finish_early")
        public static final ReasonName FinishEarly;

        @c("no_work")
        public static final ReasonName NoWork;

        @c("personal")
        public static final ReasonName Personal;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ ReasonName[] f159456c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ a f159457d;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f159458b;

        static {
            ReasonName reasonName = new ReasonName("NoWork", 0, "no_work");
            NoWork = reasonName;
            ReasonName reasonName2 = new ReasonName("Personal", 1, "personal");
            Personal = reasonName2;
            ReasonName reasonName3 = new ReasonName("FinishEarly", 2, "finish_early");
            FinishEarly = reasonName3;
            ReasonName[] reasonNameArr = {reasonName, reasonName2, reasonName3};
            f159456c = reasonNameArr;
            f159457d = kotlin.enums.c.a(reasonNameArr);
        }

        private ReasonName(String str, int i12, String str2) {
            this.f159458b = str2;
        }

        public static ReasonName valueOf(String str) {
            return (ReasonName) Enum.valueOf(ReasonName.class, str);
        }

        public static ReasonName[] values() {
            return (ReasonName[]) f159456c.clone();
        }
    }

    public Reason(@k String str, @k ReasonName reasonName) {
        this.label = str;
        this.reasonName = reasonName;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final ReasonName getReasonName() {
        return this.reasonName;
    }
}
