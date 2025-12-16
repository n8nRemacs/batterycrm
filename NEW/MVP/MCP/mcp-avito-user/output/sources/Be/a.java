package BE;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.fees_methods.generated.api.api_1_fees_by_package_get.OkResponseSuccessButton;
import com.avito.android.remote.model.text.AttributedText;
import com.my.tracker.ads.AdFormat;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api1FeesByPackageGetResponse.kt */
@P
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"LBE/a;", "", "LBE/b;", AdFormat.BANNER, "", "LBE/c;", "bullets", "Lcom/avito/android/fees_methods/generated/api/api_1_fees_by_package_get/OkResponseSuccessButton;", "button", "Lcom/avito/android/remote/model/text/AttributedText;", "offerInfo", "LBE/e;", "snippet", "", "title", "<init>", "(LBE/b;Ljava/util/List;Lcom/avito/android/fees_methods/generated/api/api_1_fees_by_package_get/OkResponseSuccessButton;Lcom/avito/android/remote/model/text/AttributedText;LBE/e;Ljava/lang/String;)V", "LBE/b;", "a", "()LBE/b;", "Ljava/util/List;", "b", "()Ljava/util/List;", "Lcom/avito/android/fees_methods/generated/api/api_1_fees_by_package_get/OkResponseSuccessButton;", "c", "()Lcom/avito/android/fees_methods/generated/api/api_1_fees_by_package_get/OkResponseSuccessButton;", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "LBE/e;", "e", "()LBE/e;", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a {

    @com.google.gson.annotations.c(AdFormat.BANNER)
    @l
    private final b banner;

    @com.google.gson.annotations.c("bullets")
    @l
    private final List<c> bullets;

    @com.google.gson.annotations.c("button")
    @k
    private final OkResponseSuccessButton button;

    @com.google.gson.annotations.c("offerInfo")
    @l
    private final AttributedText offerInfo;

    @com.google.gson.annotations.c("snippet")
    @k
    private final e snippet;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    public a(@l b bVar, @l List<c> list, @k OkResponseSuccessButton okResponseSuccessButton, @l AttributedText attributedText, @k e eVar, @k String str) {
        this.banner = bVar;
        this.bullets = list;
        this.button = okResponseSuccessButton;
        this.offerInfo = attributedText;
        this.snippet = eVar;
        this.title = str;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final b getBanner() {
        return this.banner;
    }

    @l
    public final List<c> b() {
        return this.bullets;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final OkResponseSuccessButton getButton() {
        return this.button;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final AttributedText getOfferInfo() {
        return this.offerInfo;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final e getSnippet() {
        return this.snippet;
    }

    @k
    /* renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
