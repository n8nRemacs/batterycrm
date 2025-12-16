package cQ0;

import com.avito.android.work_profile.generated.api.get_profile_about_v_3.PaymentItem;
import com.avito.android.work_profile.generated.api.get_profile_about_v_3.PersonalItemV3;
import com.avito.android.work_profile.generated.api.get_profile_about_v_3.ProfileAboutBlock;
import java.util.List;
import kotlin.Metadata;

/* compiled from: GetProfileAboutV3Response.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001BS\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"LcQ0/e;", "", "LcQ0/c;", "bannerBan", "", "Lcom/avito/android/work_profile/generated/api/get_profile_about_v_3/ProfileAboutBlock;", "blocks", "LcQ0/k;", "motivations", "Lcom/avito/android/work_profile/generated/api/get_profile_about_v_3/PaymentItem;", "payment", "Lcom/avito/android/work_profile/generated/api/get_profile_about_v_3/PersonalItemV3;", "personal", "LcQ0/r;", "slots", "<init>", "(LcQ0/c;Ljava/util/List;LcQ0/k;Ljava/util/List;Ljava/util/List;LcQ0/r;)V", "LcQ0/c;", "a", "()LcQ0/c;", "Ljava/util/List;", "b", "()Ljava/util/List;", "LcQ0/k;", "c", "()LcQ0/k;", "d", "e", "LcQ0/r;", "f", "()LcQ0/r;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e {

    @com.google.gson.annotations.c("bannerBan")
    @Y61.l
    private final C27087c bannerBan;

    @com.google.gson.annotations.c("blocks")
    @Y61.k
    private final List<ProfileAboutBlock> blocks;

    @com.google.gson.annotations.c("motivations")
    @Y61.l
    private final k motivations;

    @com.google.gson.annotations.c("payment")
    @Y61.l
    private final List<PaymentItem> payment;

    @com.google.gson.annotations.c("personal")
    @Y61.l
    private final List<PersonalItemV3> personal;

    @com.google.gson.annotations.c("slots")
    @Y61.l
    private final r slots;

    public e(@Y61.l C27087c c27087c, @Y61.k List<ProfileAboutBlock> list, @Y61.l k kVar, @Y61.l List<PaymentItem> list2, @Y61.l List<PersonalItemV3> list3, @Y61.l r rVar) {
        this.bannerBan = c27087c;
        this.blocks = list;
        this.motivations = kVar;
        this.payment = list2;
        this.personal = list3;
        this.slots = rVar;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final C27087c getBannerBan() {
        return this.bannerBan;
    }

    @Y61.k
    public final List<ProfileAboutBlock> b() {
        return this.blocks;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final k getMotivations() {
        return this.motivations;
    }

    @Y61.l
    public final List<PaymentItem> d() {
        return this.payment;
    }

    @Y61.l
    public final List<PersonalItemV3> e() {
        return this.personal;
    }

    @Y61.l
    /* renamed from: f, reason: from getter */
    public final r getSlots() {
        return this.slots;
    }
}
