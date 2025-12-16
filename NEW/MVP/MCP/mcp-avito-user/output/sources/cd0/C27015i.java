package cD0;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.tariff.remote.model.edit.TariffBanner;
import java.util.List;
import kotlin.Metadata;

/* compiled from: TariffEditInfoResult.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"LcD0/i;", "", "", "title", "Lcom/avito/android/tariff/remote/model/edit/TariffBanner;", "tariffBanner", "", "LcD0/e;", "periods", "Lcom/avito/android/deep_linking/links/DeepLink;", "uxFeedbackUri", "<init>", "(Ljava/lang/String;Lcom/avito/android/tariff/remote/model/edit/TariffBanner;Ljava/util/List;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Lcom/avito/android/tariff/remote/model/edit/TariffBanner;", "b", "()Lcom/avito/android/tariff/remote/model/edit/TariffBanner;", "Ljava/util/List;", "a", "()Ljava/util/List;", "Lcom/avito/android/deep_linking/links/DeepLink;", "d", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cD0.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C27015i {

    @com.google.gson.annotations.c("periods")
    @Y61.k
    private final List<C27011e> periods;

    @com.google.gson.annotations.c("tariffBanner")
    @Y61.l
    private final TariffBanner tariffBanner;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    @com.google.gson.annotations.c("uxFeedbackUri")
    @Y61.l
    private final DeepLink uxFeedbackUri;

    public C27015i(@Y61.k String str, @Y61.l TariffBanner tariffBanner, @Y61.k List<C27011e> list, @Y61.l DeepLink deepLink) {
        this.title = str;
        this.tariffBanner = tariffBanner;
        this.periods = list;
        this.uxFeedbackUri = deepLink;
    }

    @Y61.k
    public final List<C27011e> a() {
        return this.periods;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final TariffBanner getTariffBanner() {
        return this.tariffBanner;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final DeepLink getUxFeedbackUri() {
        return this.uxFeedbackUri;
    }
}
