package DG;

import com.avito.android.gig.shift_list.generated.api.get_giger_slots_v_1.Header;
import com.avito.android.gig.shift_list.generated.api.get_giger_slots_v_1.Timer;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import com.avito.android.remote.model.text.TooltipAttribute;
import kotlin.Metadata;

/* compiled from: GetGigerSlotsV1Response.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0017\u001a\u0004\b*\u0010\u0019¨\u0006+"}, d2 = {"LDG/n;", "", "LDG/j;", "actionButtons", "", "gigerEndTime", "gigerStartTime", "Lcom/avito/android/gig/shift_list/generated/api/get_giger_slots_v_1/Header;", "header", "", "id", "LDG/i;", RequestReviewResultKt.INFO_TYPE, "", "isDisable", "Lcom/avito/android/gig/shift_list/generated/api/get_giger_slots_v_1/Timer;", "timer", TooltipAttribute.PARAM_DEEP_LINK, "<init>", "(LDG/j;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/gig/shift_list/generated/api/get_giger_slots_v_1/Header;JLDG/i;ZLcom/avito/android/gig/shift_list/generated/api/get_giger_slots_v_1/Timer;Ljava/lang/String;)V", "LDG/j;", "a", "()LDG/j;", "Ljava/lang/String;", "getGigerEndTime", "()Ljava/lang/String;", "getGigerStartTime", "Lcom/avito/android/gig/shift_list/generated/api/get_giger_slots_v_1/Header;", "b", "()Lcom/avito/android/gig/shift_list/generated/api/get_giger_slots_v_1/Header;", "J", "getId", "()J", "LDG/i;", "c", "()LDG/i;", "Z", "f", "()Z", "Lcom/avito/android/gig/shift_list/generated/api/get_giger_slots_v_1/Timer;", "d", "()Lcom/avito/android/gig/shift_list/generated/api/get_giger_slots_v_1/Timer;", "e", "_avito_gig_shift-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class n {

    @com.google.gson.annotations.c("actionButtons")
    @Y61.k
    private final j actionButtons;

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
    private final i info;

    @com.google.gson.annotations.c("isDisable")
    private final boolean isDisable;

    @com.google.gson.annotations.c("timer")
    @Y61.l
    private final Timer timer;

    @com.google.gson.annotations.c(TooltipAttribute.PARAM_DEEP_LINK)
    @Y61.k
    private final String uri;

    public n(@Y61.k j jVar, @Y61.l String str, @Y61.l String str2, @Y61.l Header header, long j12, @Y61.k i iVar, boolean z12, @Y61.l Timer timer, @Y61.k String str3) {
        this.actionButtons = jVar;
        this.gigerEndTime = str;
        this.gigerStartTime = str2;
        this.header = header;
        this.id = j12;
        this.info = iVar;
        this.isDisable = z12;
        this.timer = timer;
        this.uri = str3;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final j getActionButtons() {
        return this.actionButtons;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final Header getHeader() {
        return this.header;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final i getInfo() {
        return this.info;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final Timer getTimer() {
        return this.timer;
    }

    @Y61.k
    /* renamed from: e, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getIsDisable() {
        return this.isDisable;
    }
}
