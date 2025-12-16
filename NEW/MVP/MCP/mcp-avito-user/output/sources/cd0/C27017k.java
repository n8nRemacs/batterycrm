package cD0;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.TooltipAttribute;
import fC0.C40276a;
import java.util.List;
import kotlin.Metadata;

/* compiled from: PackageElement.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B/\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"LcD0/k;", "LcD0/d;", "", "LfC0/a;", "microcategories", "", "locations", "LYB0/c;", "bar", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "<init>", "(Ljava/util/List;Ljava/lang/String;LYB0/c;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Ljava/util/List;", "c", "()Ljava/util/List;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "LYB0/c;", "a", "()LYB0/c;", "Lcom/avito/android/deep_linking/links/DeepLink;", "d", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cD0.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C27017k implements InterfaceC27010d {

    @com.google.gson.annotations.c("bar")
    @Y61.k
    private final YB0.c bar;

    @com.google.gson.annotations.c("locations")
    @Y61.k
    private final String locations;

    @com.google.gson.annotations.c("microcategories")
    @Y61.l
    private final List<C40276a> microcategories;

    @com.google.gson.annotations.c(TooltipAttribute.PARAM_DEEP_LINK)
    @Y61.k
    private final DeepLink uri;

    public C27017k(@Y61.l List<C40276a> list, @Y61.k String str, @Y61.k YB0.c cVar, @Y61.k DeepLink deepLink) {
        this.microcategories = list;
        this.locations = str;
        this.bar = cVar;
        this.uri = deepLink;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final YB0.c getBar() {
        return this.bar;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getLocations() {
        return this.locations;
    }

    @Y61.l
    public final List<C40276a> c() {
        return this.microcategories;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final DeepLink getUri() {
        return this.uri;
    }
}
