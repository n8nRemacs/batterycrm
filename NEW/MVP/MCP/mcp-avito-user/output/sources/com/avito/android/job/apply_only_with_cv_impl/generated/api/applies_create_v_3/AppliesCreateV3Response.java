package com.avito.android.job.apply_only_with_cv_impl.generated.api.applies_create_v_3;

import PO.a;
import PO.b;
import Y61.k;
import Y61.l;
import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: AppliesCreateV3Response.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001:\u0001\u001dB5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/avito/android/job/apply_only_with_cv_impl/generated/api/applies_create_v_3/AppliesCreateV3Response;", "", "Lcom/avito/android/job/apply_only_with_cv_impl/generated/api/applies_create_v_3/AppliesCreateV3Response$Action;", "action", "LPO/b;", "bottomSheet", "LPO/a;", "bottomSheetDetails", "", "canApply", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "<init>", "(Lcom/avito/android/job/apply_only_with_cv_impl/generated/api/applies_create_v_3/AppliesCreateV3Response$Action;LPO/b;LPO/a;ZLcom/avito/android/deep_linking/links/DeepLink;)V", "Lcom/avito/android/job/apply_only_with_cv_impl/generated/api/applies_create_v_3/AppliesCreateV3Response$Action;", "a", "()Lcom/avito/android/job/apply_only_with_cv_impl/generated/api/applies_create_v_3/AppliesCreateV3Response$Action;", "LPO/b;", "getBottomSheet", "()LPO/b;", "LPO/a;", "b", "()LPO/a;", "Z", "getCanApply", "()Z", "Lcom/avito/android/deep_linking/links/DeepLink;", "c", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Action", "_avito_job_apply-only-with-cv_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AppliesCreateV3Response {

    @c("action")
    @k
    private final Action action;

    @c("bottomSheet")
    @l
    private final b bottomSheet;

    @c("bottomSheetDetails")
    @l
    private final a bottomSheetDetails;

    @c("canApply")
    private final boolean canApply;

    @c(Constants.DEEPLINK)
    @l
    private final DeepLink deeplink;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AppliesCreateV3Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/avito/android/job/apply_only_with_cv_impl/generated/api/applies_create_v_3/AppliesCreateV3Response$Action;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "ShowDefaultCreateCvScreen", "ShowChooseOrCreateCvScreen", "CanApply", "NeedCv", "ShowEnrichmentScreen", "OpenChat", "ShowQuickApplyForm", "_avito_job_apply-only-with-cv_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Action {

        @c("can_apply")
        public static final Action CanApply;

        @c("need_cv")
        public static final Action NeedCv;

        @c("open_chat")
        public static final Action OpenChat;

        @c("show_choose_or_create_cv_screen")
        public static final Action ShowChooseOrCreateCvScreen;

        @c("show_default_create_cv_screen")
        public static final Action ShowDefaultCreateCvScreen;

        @c("show_enrichment_screen")
        public static final Action ShowEnrichmentScreen;

        @c("show_quick_apply_form")
        public static final Action ShowQuickApplyForm;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Action[] f173948b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f173949c;

        static {
            Action action = new Action("ShowDefaultCreateCvScreen", 0, "show_default_create_cv_screen");
            ShowDefaultCreateCvScreen = action;
            Action action2 = new Action("ShowChooseOrCreateCvScreen", 1, "show_choose_or_create_cv_screen");
            ShowChooseOrCreateCvScreen = action2;
            Action action3 = new Action("CanApply", 2, "can_apply");
            CanApply = action3;
            Action action4 = new Action("NeedCv", 3, "need_cv");
            NeedCv = action4;
            Action action5 = new Action("ShowEnrichmentScreen", 4, "show_enrichment_screen");
            ShowEnrichmentScreen = action5;
            Action action6 = new Action("OpenChat", 5, "open_chat");
            OpenChat = action6;
            Action action7 = new Action("ShowQuickApplyForm", 6, "show_quick_apply_form");
            ShowQuickApplyForm = action7;
            Action[] actionArr = {action, action2, action3, action4, action5, action6, action7};
            f173948b = actionArr;
            f173949c = kotlin.enums.c.a(actionArr);
        }

        private Action(String str, int i12, String str2) {
        }

        public static Action valueOf(String str) {
            return (Action) Enum.valueOf(Action.class, str);
        }

        public static Action[] values() {
            return (Action[]) f173948b.clone();
        }
    }

    public AppliesCreateV3Response(@k Action action, @l b bVar, @l a aVar, boolean z12, @l DeepLink deepLink) {
        this.action = action;
        this.bottomSheet = bVar;
        this.bottomSheetDetails = aVar;
        this.canApply = z12;
        this.deeplink = deepLink;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final Action getAction() {
        return this.action;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final a getBottomSheetDetails() {
        return this.bottomSheetDetails;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }
}
