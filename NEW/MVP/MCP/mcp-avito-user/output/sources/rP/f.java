package Rp;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;

/* compiled from: Api1MortgageProfessionalApplicationListPostResponse.kt */
@P
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0018\b\u0007\u0018\u00002\u00020\u0001BY\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u001a\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u001c\u0010\u0015R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0013\u001a\u0004\b#\u0010\u0015R\u001a\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"LRp/f;", "", "", "avatar", "LRp/g;", "calculation", "calculationV2", "currentStep", "fullname", "id", "", "isArchived", "Lcom/avito/android/deep_linking/links/DeepLink;", "link", "phone", "", "progress", "<init>", "(Ljava/lang/String;LRp/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;D)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "LRp/g;", "b", "()LRp/g;", "getCalculationV2", "c", "d", "e", "Z", "i", "()Z", "Lcom/avito/android/deep_linking/links/DeepLink;", "f", "()Lcom/avito/android/deep_linking/links/DeepLink;", "g", "D", "h", "()D", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f {

    @com.google.gson.annotations.c("avatar")
    @l
    private final String avatar;

    @com.google.gson.annotations.c("calculation")
    @k
    private final g calculation;

    @com.google.gson.annotations.c("calculationV2")
    @k
    private final String calculationV2;

    @com.google.gson.annotations.c("currentStep")
    @k
    private final String currentStep;

    @com.google.gson.annotations.c("fullname")
    @k
    private final String fullname;

    @com.google.gson.annotations.c("id")
    @k
    private final String id;

    @com.google.gson.annotations.c("isArchived")
    private final boolean isArchived;

    @com.google.gson.annotations.c("link")
    @k
    private final DeepLink link;

    @com.google.gson.annotations.c("phone")
    @k
    private final String phone;

    @com.google.gson.annotations.c("progress")
    private final double progress;

    public f(@l String str, @k g gVar, @k String str2, @k String str3, @k String str4, @k String str5, boolean z12, @k DeepLink deepLink, @k String str6, double d12) {
        this.avatar = str;
        this.calculation = gVar;
        this.calculationV2 = str2;
        this.currentStep = str3;
        this.fullname = str4;
        this.id = str5;
        this.isArchived = z12;
        this.link = deepLink;
        this.phone = str6;
        this.progress = d12;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final String getAvatar() {
        return this.avatar;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final g getCalculation() {
        return this.calculation;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getCurrentStep() {
        return this.currentStep;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getFullname() {
        return this.fullname;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @k
    /* renamed from: f, reason: from getter */
    public final DeepLink getLink() {
        return this.link;
    }

    @k
    /* renamed from: g, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    /* renamed from: h, reason: from getter */
    public final double getProgress() {
        return this.progress;
    }

    /* renamed from: i, reason: from getter */
    public final boolean getIsArchived() {
        return this.isArchived;
    }
}
