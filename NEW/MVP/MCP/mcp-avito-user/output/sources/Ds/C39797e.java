package ds;

import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.TooltipAttribute;
import kotlin.Metadata;

/* compiled from: Api3CpaCjmCpxPromoGetDataGetResponse.kt */
@P
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lds/e;", "", "Lds/v;", "color", "", "name", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "<init>", "(Lds/v;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Lds/v;", "a", "()Lds/v;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DeepLink;", "c", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ds.e, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C39797e {

    @com.google.gson.annotations.c("color")
    @Y61.k
    private final v color;

    @com.google.gson.annotations.c("name")
    @Y61.k
    private final String name;

    @com.google.gson.annotations.c(TooltipAttribute.PARAM_DEEP_LINK)
    @Y61.l
    private final DeepLink uri;

    public C39797e(@Y61.k v vVar, @Y61.k String str, @Y61.l DeepLink deepLink) {
        this.color = vVar;
        this.name = str;
        this.uri = deepLink;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final v getColor() {
        return this.color;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final DeepLink getUri() {
        return this.uri;
    }
}
