package cQ0;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.avito.android.work_profile.generated.api.get_profile_about_v_3.Header;
import com.avito.android.work_profile.generated.api.get_profile_about_v_3.Timer;
import kotlin.Metadata;

/* compiled from: GetProfileAboutV3Response.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010+\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"LcQ0/q;", "", "LcQ0/o;", "actionButtons", "", "gigerEndTime", "gigerStartTime", "Lcom/avito/android/work_profile/generated/api/get_profile_about_v_3/Header;", "header", "", "id", "LcQ0/n;", RequestReviewResultKt.INFO_TYPE, "", "isDisable", "Lcom/avito/android/work_profile/generated/api/get_profile_about_v_3/Timer;", "timer", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "<init>", "(LcQ0/o;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/work_profile/generated/api/get_profile_about_v_3/Header;JLcQ0/n;ZLcom/avito/android/work_profile/generated/api/get_profile_about_v_3/Timer;Lcom/avito/android/deep_linking/links/DeepLink;)V", "LcQ0/o;", "a", "()LcQ0/o;", "Ljava/lang/String;", "getGigerEndTime", "()Ljava/lang/String;", "getGigerStartTime", "Lcom/avito/android/work_profile/generated/api/get_profile_about_v_3/Header;", "b", "()Lcom/avito/android/work_profile/generated/api/get_profile_about_v_3/Header;", "J", "getId", "()J", "LcQ0/n;", "c", "()LcQ0/n;", "Z", "f", "()Z", "Lcom/avito/android/work_profile/generated/api/get_profile_about_v_3/Timer;", "d", "()Lcom/avito/android/work_profile/generated/api/get_profile_about_v_3/Timer;", "Lcom/avito/android/deep_linking/links/DeepLink;", "e", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class q {

    @com.google.gson.annotations.c("actionButtons")
    @Y61.k
    private final o actionButtons;

    @com.google.gson.annotations.c("gigerEndTime")
    @Y61.l
    private final String gigerEndTime;

    @com.google.gson.annotations.c("gigerStartTime")
    @Y61.l
    private final String gigerStartTime;

    @com.google.gson.annotations.c("header")
    @Y61.l
    private final Header header;

    @com.google.gson.annotations.c("id")
    private final long id;

    @com.google.gson.annotations.c(RequestReviewResultKt.INFO_TYPE)
    @Y61.k
    private final n info;

    @com.google.gson.annotations.c("isDisable")
    private final boolean isDisable;

    @com.google.gson.annotations.c("timer")
    @Y61.l
    private final Timer timer;

    @com.google.gson.annotations.c(TooltipAttribute.PARAM_DEEP_LINK)
    @Y61.k
    private final DeepLink uri;

    public q(@Y61.k o oVar, @Y61.l String str, @Y61.l String str2, @Y61.l Header header, long j12, @Y61.k n nVar, boolean z12, @Y61.l Timer timer, @Y61.k DeepLink deepLink) {
        this.actionButtons = oVar;
        this.gigerEndTime = str;
        this.gigerStartTime = str2;
        this.header = header;
        this.id = j12;
        this.info = nVar;
        this.isDisable = z12;
        this.timer = timer;
        this.uri = deepLink;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final o getActionButtons() {
        return this.actionButtons;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final Header getHeader() {
        return this.header;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final n getInfo() {
        return this.info;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final Timer getTimer() {
        return this.timer;
    }

    @Y61.k
    /* renamed from: e, reason: from getter */
    public final DeepLink getUri() {
        return this.uri;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getIsDisable() {
        return this.isDisable;
    }
}
