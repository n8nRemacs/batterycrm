package on;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.beduin_models.BeduinModel;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CartSimilarItems.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015¨\u0006\u0018"}, d2 = {"Lon/a;", "", "", "title", "xHash", "paginationRequest", "", "LSq0/c;", "mainComponents", "topFormId", "Lcom/avito/android/beduin_models/BeduinModel;", "topComponents", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "f", "b", "Ljava/util/List;", "a", "()Ljava/util/List;", "e", "d", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: on.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C44825a {

    @c("mainComponents")
    @k
    private final List<Sq0.c> mainComponents;

    @c("paginationRequest")
    @l
    private final String paginationRequest;

    @c("title")
    @k
    private final String title;

    @c("topComponents")
    @l
    private final List<BeduinModel> topComponents;

    @c("topFormId")
    @l
    private final String topFormId;

    @c("xHash")
    @l
    private final String xHash;

    /* JADX WARN: Multi-variable type inference failed */
    public C44825a(@k String str, @l String str2, @l String str3, @k List<? extends Sq0.c> list, @l String str4, @l List<? extends BeduinModel> list2) {
        this.title = str;
        this.xHash = str2;
        this.paginationRequest = str3;
        this.mainComponents = list;
        this.topFormId = str4;
        this.topComponents = list2;
    }

    @k
    public final List<Sq0.c> a() {
        return this.mainComponents;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getPaginationRequest() {
        return this.paginationRequest;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    public final List<BeduinModel> d() {
        return this.topComponents;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final String getTopFormId() {
        return this.topFormId;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44825a)) {
            return false;
        }
        C44825a c44825a = (C44825a) obj;
        return L.f(this.title, c44825a.title) && L.f(this.xHash, c44825a.xHash) && L.f(this.paginationRequest, c44825a.paginationRequest) && L.f(this.mainComponents, c44825a.mainComponents) && L.f(this.topFormId, c44825a.topFormId) && L.f(this.topComponents, c44825a.topComponents);
    }

    @l
    /* renamed from: f, reason: from getter */
    public final String getXHash() {
        return this.xHash;
    }

    public final int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.xHash;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.paginationRequest;
        int iE2 = H.e((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.mainComponents);
        String str3 = this.topFormId;
        int iHashCode3 = (iE2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<BeduinModel> list = this.topComponents;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CartSimilarItems(title=");
        sb2.append(this.title);
        sb2.append(", xHash=");
        sb2.append(this.xHash);
        sb2.append(", paginationRequest=");
        sb2.append(this.paginationRequest);
        sb2.append(", mainComponents=");
        sb2.append(this.mainComponents);
        sb2.append(", topFormId=");
        sb2.append(this.topFormId);
        sb2.append(", topComponents=");
        return H.p(sb2, this.topComponents, ')');
    }
}
