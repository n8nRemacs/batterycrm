package com.avito.android.gig.shift_action_impl.generated.api.qr_scan_v_2;

import Y61.k;
import Y61.l;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.a;
import uG.e;

/* compiled from: QrScanV2Response.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0001\u0014B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/avito/android/gig/shift_action_impl/generated/api/qr_scan_v_2/ActionV2;", "", "Lcom/avito/android/gig/shift_action_impl/generated/api/qr_scan_v_2/ActionV2$ActionName;", "actionName", "", "Lcom/avito/android/gig/shift_action_impl/generated/api/qr_scan_v_2/Reason;", "reasons", "LuG/e;", "sheet", "<init>", "(Lcom/avito/android/gig/shift_action_impl/generated/api/qr_scan_v_2/ActionV2$ActionName;Ljava/util/List;LuG/e;)V", "Lcom/avito/android/gig/shift_action_impl/generated/api/qr_scan_v_2/ActionV2$ActionName;", "a", "()Lcom/avito/android/gig/shift_action_impl/generated/api/qr_scan_v_2/ActionV2$ActionName;", "Ljava/util/List;", "b", "()Ljava/util/List;", "LuG/e;", "getSheet", "()LuG/e;", "ActionName", "_avito_gig_shift-action_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ActionV2 {

    @c("actionName")
    @k
    private final ActionName actionName;

    @c("reasons")
    @l
    private final List<Reason> reasons;

    @c("sheet")
    @k
    private final e sheet;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: QrScanV2Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/avito/android/gig/shift_action_impl/generated/api/qr_scan_v_2/ActionV2$ActionName;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "CheckIn", "CheckOut", "CancelV1", "_avito_gig_shift-action_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ActionName {

        @c("cancel_v1")
        public static final ActionName CancelV1;

        @c("check-in")
        public static final ActionName CheckIn;

        @c("check-out")
        public static final ActionName CheckOut;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ ActionName[] f159447b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f159448c;

        static {
            ActionName actionName = new ActionName("CheckIn", 0, "check-in");
            CheckIn = actionName;
            ActionName actionName2 = new ActionName("CheckOut", 1, "check-out");
            CheckOut = actionName2;
            ActionName actionName3 = new ActionName("CancelV1", 2, "cancel_v1");
            CancelV1 = actionName3;
            ActionName[] actionNameArr = {actionName, actionName2, actionName3};
            f159447b = actionNameArr;
            f159448c = kotlin.enums.c.a(actionNameArr);
        }

        private ActionName(String str, int i12, String str2) {
        }

        public static ActionName valueOf(String str) {
            return (ActionName) Enum.valueOf(ActionName.class, str);
        }

        public static ActionName[] values() {
            return (ActionName[]) f159447b.clone();
        }
    }

    public ActionV2(@k ActionName actionName, @l List<Reason> list, @k e eVar) {
        this.actionName = actionName;
        this.reasons = list;
        this.sheet = eVar;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final ActionName getActionName() {
        return this.actionName;
    }

    @l
    public final List<Reason> b() {
        return this.reasons;
    }
}
