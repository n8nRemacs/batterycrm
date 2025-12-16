package cD0;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.TooltipAttribute;
import fC0.C40276a;
import java.util.List;
import kotlin.Metadata;

/* compiled from: PackageElement.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LcD0/j;", "LcD0/d;", "", "plannedTitle", "plannedAmount", "locations", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "", "LfC0/a;", "microcategories", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/util/List;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "c", "a", "Lcom/avito/android/deep_linking/links/DeepLink;", "e", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/util/List;", "b", "()Ljava/util/List;", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cD0.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C27016j implements InterfaceC27010d {

    @com.google.gson.annotations.c("locations")
    @Y61.k
    private final String locations;

    @com.google.gson.annotations.c("microcategories")
    @Y61.l
    private final List<C40276a> microcategories;

    @com.google.gson.annotations.c("plannedAmount")
    @Y61.k
    private final String plannedAmount;

    @com.google.gson.annotations.c("plannedTitle")
    @Y61.k
    private final String plannedTitle;

    @com.google.gson.annotations.c(TooltipAttribute.PARAM_DEEP_LINK)
    @Y61.k
    private final DeepLink uri;

    public C27016j(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k DeepLink deepLink, @Y61.l List<C40276a> list) {
        this.plannedTitle = str;
        this.plannedAmount = str2;
        this.locations = str3;
        this.uri = deepLink;
        this.microcategories = list;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final String getLocations() {
        return this.locations;
    }

    @Y61.l
    public final List<C40276a> b() {
        return this.microcategories;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getPlannedAmount() {
        return this.plannedAmount;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final String getPlannedTitle() {
        return this.plannedTitle;
    }

    @Y61.k
    /* renamed from: e, reason: from getter */
    public final DeepLink getUri() {
        return this.uri;
    }
}
