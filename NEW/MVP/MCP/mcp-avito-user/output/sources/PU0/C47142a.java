package pu0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.service_fee_conditions.generated.api.api_1_sf_conditions_get.OkResponseSuccessBanner;
import com.my.tracker.ads.AdFormat;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api1SfConditionsGetResponse.kt */
@P
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0007\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lpu0/a;", "", "Lcom/avito/android/service_fee_conditions/generated/api/api_1_sf_conditions_get/OkResponseSuccessBanner;", AdFormat.BANNER, "", "Lpu0/b;", "bullets", "Lpu0/c;", "closeButton", "Lpu0/d;", "continueButton", "Lpu0/e;", "navBar", "Lpu0/f;", "snippet", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "<init>", "(Lcom/avito/android/service_fee_conditions/generated/api/api_1_sf_conditions_get/OkResponseSuccessBanner;Ljava/util/List;Lpu0/c;Lpu0/d;Lpu0/e;Lpu0/f;Lcom/avito/android/remote/model/text/AttributedText;)V", "Lcom/avito/android/service_fee_conditions/generated/api/api_1_sf_conditions_get/OkResponseSuccessBanner;", "a", "()Lcom/avito/android/service_fee_conditions/generated/api/api_1_sf_conditions_get/OkResponseSuccessBanner;", "Ljava/util/List;", "b", "()Ljava/util/List;", "Lpu0/c;", "c", "()Lpu0/c;", "Lpu0/d;", "d", "()Lpu0/d;", "Lpu0/e;", "e", "()Lpu0/e;", "Lpu0/f;", "f", "()Lpu0/f;", "Lcom/avito/android/remote/model/text/AttributedText;", "g", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito_service-fee-conditions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pu0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C47142a {

    @com.google.gson.annotations.c(AdFormat.BANNER)
    @l
    private final OkResponseSuccessBanner banner;

    @com.google.gson.annotations.c("bullets")
    @k
    private final List<C47143b> bullets;

    @com.google.gson.annotations.c("closeButton")
    @l
    private final C47144c closeButton;

    @com.google.gson.annotations.c("continueButton")
    @l
    private final C47145d continueButton;

    @com.google.gson.annotations.c("navBar")
    @l
    private final C47146e navBar;

    @com.google.gson.annotations.c("snippet")
    @k
    private final C47147f snippet;

    @com.google.gson.annotations.c("title")
    @k
    private final AttributedText title;

    public C47142a(@l OkResponseSuccessBanner okResponseSuccessBanner, @k List<C47143b> list, @l C47144c c47144c, @l C47145d c47145d, @l C47146e c47146e, @k C47147f c47147f, @k AttributedText attributedText) {
        this.banner = okResponseSuccessBanner;
        this.bullets = list;
        this.closeButton = c47144c;
        this.continueButton = c47145d;
        this.navBar = c47146e;
        this.snippet = c47147f;
        this.title = attributedText;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final OkResponseSuccessBanner getBanner() {
        return this.banner;
    }

    @k
    public final List<C47143b> b() {
        return this.bullets;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final C47144c getCloseButton() {
        return this.closeButton;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final C47145d getContinueButton() {
        return this.continueButton;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final C47146e getNavBar() {
        return this.navBar;
    }

    @k
    /* renamed from: f, reason: from getter */
    public final C47147f getSnippet() {
        return this.snippet;
    }

    @k
    /* renamed from: g, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }
}
