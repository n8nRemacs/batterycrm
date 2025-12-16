package wC0;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ApiTariffCptInfoV3Response.kt */
@P
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LwC0/p;", "", "", "LwC0/n;", "features", "Lcom/avito/android/remote/model/text/AttributedText;", "name", "", "slug", "<init>", "(Ljava/util/List;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Lcom/avito/android/remote/model/text/AttributedText;", "b", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class p {

    @com.google.gson.annotations.c("features")
    @Y61.l
    private final List<n> features;

    @com.google.gson.annotations.c("name")
    @Y61.l
    private final AttributedText name;

    @com.google.gson.annotations.c("slug")
    @Y61.l
    private final String slug;

    public p(@Y61.l List<n> list, @Y61.l AttributedText attributedText, @Y61.l String str) {
        this.features = list;
        this.name = attributedText;
        this.slug = str;
    }

    @Y61.l
    public final List<n> a() {
        return this.features;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final AttributedText getName() {
        return this.name;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final String getSlug() {
        return this.slug;
    }
}
