package Hj0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.remote.autoteka.model.AutotekaReportFeatures;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutotekaPreviewResponse.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"LHj0/b;", "", "", "title", "equipmentSummary", "Lcom/avito/android/remote/autoteka/model/AutotekaReportFeatures;", "reportFeatures", "Lcom/avito/android/remote/model/Image;", "image", "originalImage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/autoteka/model/AutotekaReportFeatures;Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/Image;)V", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "a", "Lcom/avito/android/remote/autoteka/model/AutotekaReportFeatures;", "d", "()Lcom/avito/android/remote/autoteka/model/AutotekaReportFeatures;", "Lcom/avito/android/remote/model/Image;", "b", "()Lcom/avito/android/remote/model/Image;", "c", "_avito-discouraged_avito-api_autoteka"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class b {

    @com.google.gson.annotations.c("equipmentSummary")
    @k
    private final String equipmentSummary;

    @com.google.gson.annotations.c("image")
    @l
    private final Image image;

    @com.google.gson.annotations.c("originalImage")
    @l
    private final Image originalImage;

    @com.google.gson.annotations.c("reportFeatures")
    @k
    private final AutotekaReportFeatures reportFeatures;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    public b(@k String str, @k String str2, @k AutotekaReportFeatures autotekaReportFeatures, @l Image image, @l Image image2) {
        this.title = str;
        this.equipmentSummary = str2;
        this.reportFeatures = autotekaReportFeatures;
        this.image = image;
        this.originalImage = image2;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getEquipmentSummary() {
        return this.equipmentSummary;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final Image getImage() {
        return this.image;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Image getOriginalImage() {
        return this.originalImage;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final AutotekaReportFeatures getReportFeatures() {
        return this.reportFeatures;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.title, bVar.title) && L.f(this.equipmentSummary, bVar.equipmentSummary) && L.f(this.reportFeatures, bVar.reportFeatures) && L.f(this.image, bVar.image) && L.f(this.originalImage, bVar.originalImage);
    }

    public final int hashCode() {
        int iHashCode = (this.reportFeatures.hashCode() + H.d(this.title.hashCode() * 31, 31, this.equipmentSummary)) * 31;
        Image image = this.image;
        int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
        Image image2 = this.originalImage;
        return iHashCode2 + (image2 != null ? image2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AutotekaPreview(title=");
        sb2.append(this.title);
        sb2.append(", equipmentSummary=");
        sb2.append(this.equipmentSummary);
        sb2.append(", reportFeatures=");
        sb2.append(this.reportFeatures);
        sb2.append(", image=");
        sb2.append(this.image);
        sb2.append(", originalImage=");
        return AK.c.o(sb2, this.originalImage, ')');
    }
}
