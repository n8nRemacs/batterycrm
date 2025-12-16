package com.avito.android.job.vacancy_call_action.generated.api.vacancy_call_action_v_3;

import PQ.a;
import Y61.l;
import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: VacancyCallActionV3Response.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0001\u0013B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/avito/android/job/vacancy_call_action/generated/api/vacancy_call_action_v_3/VacancyCallActionV3Response;", "", "Lcom/avito/android/job/vacancy_call_action/generated/api/vacancy_call_action_v_3/VacancyCallActionV3Response$Action;", "action", "LPQ/a;", "bottomSheet", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "<init>", "(Lcom/avito/android/job/vacancy_call_action/generated/api/vacancy_call_action_v_3/VacancyCallActionV3Response$Action;LPQ/a;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Lcom/avito/android/job/vacancy_call_action/generated/api/vacancy_call_action_v_3/VacancyCallActionV3Response$Action;", "a", "()Lcom/avito/android/job/vacancy_call_action/generated/api/vacancy_call_action_v_3/VacancyCallActionV3Response$Action;", "LPQ/a;", "getBottomSheet", "()LPQ/a;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Action", "_avito_job_vacancy-call-action_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class VacancyCallActionV3Response {

    @c("action")
    @l
    private final Action action;

    @c("bottomSheet")
    @l
    private final a bottomSheet;

    @c(Constants.DEEPLINK)
    @l
    private final DeepLink deeplink;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VacancyCallActionV3Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/job/vacancy_call_action/generated/api/vacancy_call_action_v_3/VacancyCallActionV3Response$Action;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Bypass", "ShowDefaultCreateCvScreen", "_avito_job_vacancy-call-action_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Action {

        @c("bypass")
        public static final Action Bypass;

        @c("show_default_create_cv_screen")
        public static final Action ShowDefaultCreateCvScreen;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Action[] f174711b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f174712c;

        static {
            Action action = new Action("Bypass", 0, "bypass");
            Bypass = action;
            Action action2 = new Action("ShowDefaultCreateCvScreen", 1, "show_default_create_cv_screen");
            ShowDefaultCreateCvScreen = action2;
            Action[] actionArr = {action, action2};
            f174711b = actionArr;
            f174712c = kotlin.enums.c.a(actionArr);
        }

        private Action(String str, int i12, String str2) {
        }

        public static Action valueOf(String str) {
            return (Action) Enum.valueOf(Action.class, str);
        }

        public static Action[] values() {
            return (Action[]) f174711b.clone();
        }
    }

    public VacancyCallActionV3Response(@l Action action, @l a aVar, @l DeepLink deepLink) {
        this.action = action;
        this.bottomSheet = aVar;
        this.deeplink = deepLink;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final Action getAction() {
        return this.action;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }
}
