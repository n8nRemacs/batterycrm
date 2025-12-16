package UB0;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ApiTariffCpxInfoV4Response.kt */
@P
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"LUB0/o;", "", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "LUB0/p;", "featureBanner", "", "LUB0/q;", "featureGroups", "LUB0/s;", "filters", "", "title", "LUB0/t;", "titleButton", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;LUB0/p;Ljava/util/List;Ljava/util/List;Ljava/lang/String;LUB0/t;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "a", "()Lcom/avito/android/remote/model/text/AttributedText;", "LUB0/p;", "b", "()LUB0/p;", "Ljava/util/List;", "c", "()Ljava/util/List;", "d", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "LUB0/t;", "f", "()LUB0/t;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class o {

    @com.google.gson.annotations.c("description")
    @Y61.l
    private final AttributedText description;

    @com.google.gson.annotations.c("featureBanner")
    @Y61.l
    private final p featureBanner;

    @com.google.gson.annotations.c("featureGroups")
    @Y61.l
    private final List<q> featureGroups;

    @com.google.gson.annotations.c("filters")
    @Y61.l
    private final List<s> filters;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    @com.google.gson.annotations.c("titleButton")
    @Y61.l
    private final t titleButton;

    public o(@Y61.l AttributedText attributedText, @Y61.l p pVar, @Y61.l List<q> list, @Y61.l List<s> list2, @Y61.k String str, @Y61.l t tVar) {
        this.description = attributedText;
        this.featureBanner = pVar;
        this.featureGroups = list;
        this.filters = list2;
        this.title = str;
        this.titleButton = tVar;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final p getFeatureBanner() {
        return this.featureBanner;
    }

    @Y61.l
    public final List<q> c() {
        return this.featureGroups;
    }

    @Y61.l
    public final List<s> d() {
        return this.filters;
    }

    @Y61.k
    /* renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Y61.l
    /* renamed from: f, reason: from getter */
    public final t getTitleButton() {
        return this.titleButton;
    }
}
