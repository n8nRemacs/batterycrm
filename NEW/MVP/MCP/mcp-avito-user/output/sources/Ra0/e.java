package RA0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ApiSellerAddressListResponse.kt */
@P
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b'\b\u0007\u0018\u00002\u00020\u0001B«\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000f\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0004\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b(\u0010\u001eR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b*\u0010+R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010)\u001a\u0004\b,\u0010+R\u001a\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010-\u001a\u0004\b.\u0010/R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00100\u001a\u0004\b1\u00102R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00100\u001a\u0004\b3\u00102R\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001f\u001a\u0004\b4\u0010!R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u00100\u001a\u0004\b5\u00102R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\"\u001a\u0004\b6\u0010$R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\"\u001a\u0004\b7\u0010$R\u001a\u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001c\u001a\u0004\b8\u0010\u001eR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010)\u001a\u0004\b9\u0010+¨\u0006:"}, d2 = {"LRA0/e;", "", "", "addUnavailableMessage", "", "LRA0/a;", "addresses", "", "batchMaxAddressCount", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "esid", "LRA0/f;", "infoBanner", "innMigratedAddressesPopup", "", "isAddAvailable", "isEditButtonAvailable", "isUploadFileAvailable", "LRA0/h;", "promotion", "shouldShowFilters", "tariffId", "tariffLevelId", "title", "uploadFileInfoBanner", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;LRA0/f;LRA0/f;ZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;LRA0/f;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Ljava/util/List;", "b", "()Ljava/util/List;", "Ljava/lang/Long;", "getBatchMaxAddressCount", "()Ljava/lang/Long;", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "d", "LRA0/f;", "e", "()LRA0/f;", "f", "Z", "l", "()Z", "Ljava/lang/Boolean;", "m", "()Ljava/lang/Boolean;", "n", "g", "h", "i", "j", "k", "getUploadFileInfoBanner", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e {

    @com.google.gson.annotations.c("addUnavailableMessage")
    @l
    private final String addUnavailableMessage;

    @com.google.gson.annotations.c("addresses")
    @l
    private final List<a> addresses;

    @com.google.gson.annotations.c("batchMaxAddressCount")
    @l
    private final Long batchMaxAddressCount;

    @com.google.gson.annotations.c("description")
    @k
    private final AttributedText description;

    @com.google.gson.annotations.c("esid")
    @k
    private final String esid;

    @com.google.gson.annotations.c("infoBanner")
    @l
    private final f infoBanner;

    @com.google.gson.annotations.c("innMigratedAddressesPopup")
    @l
    private final f innMigratedAddressesPopup;

    @com.google.gson.annotations.c("isAddAvailable")
    private final boolean isAddAvailable;

    @com.google.gson.annotations.c("isEditButtonAvailable")
    @l
    private final Boolean isEditButtonAvailable;

    @com.google.gson.annotations.c("isUploadFileAvailable")
    @l
    private final Boolean isUploadFileAvailable;

    @com.google.gson.annotations.c("promotion")
    @l
    private final List<h> promotion;

    @com.google.gson.annotations.c("shouldShowFilters")
    @l
    private final Boolean shouldShowFilters;

    @com.google.gson.annotations.c("tariffId")
    @l
    private final Long tariffId;

    @com.google.gson.annotations.c("tariffLevelId")
    @l
    private final Long tariffLevelId;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    @com.google.gson.annotations.c("uploadFileInfoBanner")
    @l
    private final f uploadFileInfoBanner;

    public e(@l String str, @l List<a> list, @l Long l12, @k AttributedText attributedText, @k String str2, @l f fVar, @l f fVar2, boolean z12, @l Boolean bool, @l Boolean bool2, @l List<h> list2, @l Boolean bool3, @l Long l13, @l Long l14, @k String str3, @l f fVar3) {
        this.addUnavailableMessage = str;
        this.addresses = list;
        this.batchMaxAddressCount = l12;
        this.description = attributedText;
        this.esid = str2;
        this.infoBanner = fVar;
        this.innMigratedAddressesPopup = fVar2;
        this.isAddAvailable = z12;
        this.isEditButtonAvailable = bool;
        this.isUploadFileAvailable = bool2;
        this.promotion = list2;
        this.shouldShowFilters = bool3;
        this.tariffId = l13;
        this.tariffLevelId = l14;
        this.title = str3;
        this.uploadFileInfoBanner = fVar3;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final String getAddUnavailableMessage() {
        return this.addUnavailableMessage;
    }

    @l
    public final List<a> b() {
        return this.addresses;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getEsid() {
        return this.esid;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final f getInfoBanner() {
        return this.infoBanner;
    }

    @l
    /* renamed from: f, reason: from getter */
    public final f getInnMigratedAddressesPopup() {
        return this.innMigratedAddressesPopup;
    }

    @l
    public final List<h> g() {
        return this.promotion;
    }

    @l
    /* renamed from: h, reason: from getter */
    public final Boolean getShouldShowFilters() {
        return this.shouldShowFilters;
    }

    @l
    /* renamed from: i, reason: from getter */
    public final Long getTariffId() {
        return this.tariffId;
    }

    @l
    /* renamed from: j, reason: from getter */
    public final Long getTariffLevelId() {
        return this.tariffLevelId;
    }

    @k
    /* renamed from: k, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: l, reason: from getter */
    public final boolean getIsAddAvailable() {
        return this.isAddAvailable;
    }

    @l
    /* renamed from: m, reason: from getter */
    public final Boolean getIsEditButtonAvailable() {
        return this.isEditButtonAvailable;
    }

    @l
    /* renamed from: n, reason: from getter */
    public final Boolean getIsUploadFileAvailable() {
        return this.isUploadFileAvailable;
    }
}
