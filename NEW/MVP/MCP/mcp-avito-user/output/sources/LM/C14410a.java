package Lm;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.beduin_models.BeduinModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Cart.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016¨\u0006\u0019"}, d2 = {"LLm/a;", "", "", "title", "topFormId", "mainFormId", "bottomFormId", "", "Lcom/avito/android/beduin_models/BeduinModel;", "topComponents", "mainComponents", "bottomComponents", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getTopFormId", "getMainFormId", "getBottomFormId", "Ljava/util/List;", "getTopComponents", "()Ljava/util/List;", "getMainComponents", "getBottomComponents", "_avito-discouraged_avito-api_cart"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Lm.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C14410a {

    @com.google.gson.annotations.c("bottomComponents")
    @l
    private final List<BeduinModel> bottomComponents;

    @com.google.gson.annotations.c("bottomFormId")
    @l
    private final String bottomFormId;

    @com.google.gson.annotations.c("mainComponents")
    @l
    private final List<BeduinModel> mainComponents;

    @com.google.gson.annotations.c("mainFormId")
    @l
    private final String mainFormId;

    @com.google.gson.annotations.c("title")
    @l
    private final String title;

    @com.google.gson.annotations.c("topComponents")
    @l
    private final List<BeduinModel> topComponents;

    @com.google.gson.annotations.c("topFormId")
    @l
    private final String topFormId;

    /* JADX WARN: Multi-variable type inference failed */
    public C14410a(@l String str, @l String str2, @l String str3, @l String str4, @l List<? extends BeduinModel> list, @l List<? extends BeduinModel> list2, @l List<? extends BeduinModel> list3) {
        this.title = str;
        this.topFormId = str2;
        this.mainFormId = str3;
        this.bottomFormId = str4;
        this.topComponents = list;
        this.mainComponents = list2;
        this.bottomComponents = list3;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14410a)) {
            return false;
        }
        C14410a c14410a = (C14410a) obj;
        return L.f(this.title, c14410a.title) && L.f(this.topFormId, c14410a.topFormId) && L.f(this.mainFormId, c14410a.mainFormId) && L.f(this.bottomFormId, c14410a.bottomFormId) && L.f(this.topComponents, c14410a.topComponents) && L.f(this.mainComponents, c14410a.mainComponents) && L.f(this.bottomComponents, c14410a.bottomComponents);
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.topFormId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.mainFormId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.bottomFormId;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<BeduinModel> list = this.topComponents;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List<BeduinModel> list2 = this.mainComponents;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<BeduinModel> list3 = this.bottomComponents;
        return iHashCode6 + (list3 != null ? list3.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Cart(title=");
        sb2.append(this.title);
        sb2.append(", topFormId=");
        sb2.append(this.topFormId);
        sb2.append(", mainFormId=");
        sb2.append(this.mainFormId);
        sb2.append(", bottomFormId=");
        sb2.append(this.bottomFormId);
        sb2.append(", topComponents=");
        sb2.append(this.topComponents);
        sb2.append(", mainComponents=");
        sb2.append(this.mainComponents);
        sb2.append(", bottomComponents=");
        return H.p(sb2, this.bottomComponents, ')');
    }
}
