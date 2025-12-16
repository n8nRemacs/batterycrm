package We;

import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import java.util.List;
import kotlin.Metadata;

/* compiled from: GetMessengerByItemIdForApiv3Response.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u00002\u00020\u0001By\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u001a\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u001c\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b \u0010\u001dR\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0017\u001a\u0004\b!\u0010\u0019R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001b\u001a\u0004\b%\u0010\u001d¨\u0006&"}, d2 = {"LWe/x;", "", "", "defaultBundleId", "", "LWe/g;", "legalV2", "LWe/v;", "packages", "", "packagesActionTitle", "packagesDescription", "packagesExplanation", "packagesTitle", "LWe/m;", AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, "singleContact", "singleContactTitle", "<init>", "(Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;LWe/v;Ljava/lang/String;)V", "Ljava/lang/Long;", "a", "()Ljava/lang/Long;", "Ljava/util/List;", "b", "()Ljava/util/List;", "c", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "e", "f", "g", "h", "LWe/v;", "i", "()LWe/v;", "j", "_avito_auto-reseller-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class x {

    @com.google.gson.annotations.c("defaultBundleId")
    @Y61.l
    private final Long defaultBundleId;

    @com.google.gson.annotations.c("legalV2")
    @Y61.l
    private final List<g> legalV2;

    @com.google.gson.annotations.c("packages")
    @Y61.k
    private final List<v> packages;

    @com.google.gson.annotations.c("packagesActionTitle")
    @Y61.l
    private final String packagesActionTitle;

    @com.google.gson.annotations.c("packagesDescription")
    @Y61.l
    private final String packagesDescription;

    @com.google.gson.annotations.c("packagesExplanation")
    @Y61.k
    private final String packagesExplanation;

    @com.google.gson.annotations.c("packagesTitle")
    @Y61.l
    private final String packagesTitle;

    @com.google.gson.annotations.c(AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS)
    @Y61.l
    private final List<m> parameters;

    @com.google.gson.annotations.c("singleContact")
    @Y61.l
    private final v singleContact;

    @com.google.gson.annotations.c("singleContactTitle")
    @Y61.l
    private final String singleContactTitle;

    public x(@Y61.l Long l12, @Y61.l List<g> list, @Y61.k List<v> list2, @Y61.l String str, @Y61.l String str2, @Y61.k String str3, @Y61.l String str4, @Y61.l List<m> list3, @Y61.l v vVar, @Y61.l String str5) {
        this.defaultBundleId = l12;
        this.legalV2 = list;
        this.packages = list2;
        this.packagesActionTitle = str;
        this.packagesDescription = str2;
        this.packagesExplanation = str3;
        this.packagesTitle = str4;
        this.parameters = list3;
        this.singleContact = vVar;
        this.singleContactTitle = str5;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final Long getDefaultBundleId() {
        return this.defaultBundleId;
    }

    @Y61.l
    public final List<g> b() {
        return this.legalV2;
    }

    @Y61.k
    public final List<v> c() {
        return this.packages;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final String getPackagesActionTitle() {
        return this.packagesActionTitle;
    }

    @Y61.l
    /* renamed from: e, reason: from getter */
    public final String getPackagesDescription() {
        return this.packagesDescription;
    }

    @Y61.k
    /* renamed from: f, reason: from getter */
    public final String getPackagesExplanation() {
        return this.packagesExplanation;
    }

    @Y61.l
    /* renamed from: g, reason: from getter */
    public final String getPackagesTitle() {
        return this.packagesTitle;
    }

    @Y61.l
    public final List<m> h() {
        return this.parameters;
    }

    @Y61.l
    /* renamed from: i, reason: from getter */
    public final v getSingleContact() {
        return this.singleContact;
    }

    @Y61.l
    /* renamed from: j, reason: from getter */
    public final String getSingleContactTitle() {
        return this.singleContactTitle;
    }
}
