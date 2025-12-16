package com.avito.android.tariff.remote.model.edit;

import Y61.k;
import kotlin.Metadata;

/* compiled from: BottomSheetAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u000eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/avito/android/tariff/remote/model/edit/BottomSheetAction;", "", "", "title", "Lcom/avito/android/tariff/remote/model/edit/BottomSheetAction$ActionType;", "type", "<init>", "(Ljava/lang/String;Lcom/avito/android/tariff/remote/model/edit/BottomSheetAction$ActionType;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Lcom/avito/android/tariff/remote/model/edit/BottomSheetAction$ActionType;", "getType", "()Lcom/avito/android/tariff/remote/model/edit/BottomSheetAction$ActionType;", "ActionType", "_avito_tariff_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BottomSheetAction {

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    @com.google.gson.annotations.c("type")
    @k
    private final ActionType type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BottomSheetAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/tariff/remote/model/edit/BottomSheetAction$ActionType;", "", "(Ljava/lang/String;I)V", "APPLY_CHANGES", "SHOW_NEXT", "_avito_tariff_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ActionType {

        @com.google.gson.annotations.c("applyChanges")
        public static final ActionType APPLY_CHANGES;

        @com.google.gson.annotations.c("showNext")
        public static final ActionType SHOW_NEXT;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ ActionType[] f297493b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f297494c;

        static {
            ActionType actionType = new ActionType("APPLY_CHANGES", 0);
            APPLY_CHANGES = actionType;
            ActionType actionType2 = new ActionType("SHOW_NEXT", 1);
            SHOW_NEXT = actionType2;
            ActionType[] actionTypeArr = {actionType, actionType2};
            f297493b = actionTypeArr;
            f297494c = kotlin.enums.c.a(actionTypeArr);
        }

        private ActionType(String str, int i12) {
        }

        public static ActionType valueOf(String str) {
            return (ActionType) Enum.valueOf(ActionType.class, str);
        }

        public static ActionType[] values() {
            return (ActionType[]) f297493b.clone();
        }
    }

    public BottomSheetAction(@k String str, @k ActionType actionType) {
        this.title = str;
        this.type = actionType;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
