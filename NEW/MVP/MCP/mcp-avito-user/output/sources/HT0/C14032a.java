package Ht0;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.service_booking_public.generated.api.api_2_booking_form.BookingFormResponseV3SuccessParamsItem;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api2BookingFormResponse.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b(\u0018\u00002\u00020\u0001B³\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0018\u001a\u00020\t\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b#\u0010\"R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b$\u0010\"R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b%\u0010\"R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b)\u0010(R\u001c\u0010\f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b*\u0010(R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010+\u001a\u0004\b,\u0010-R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010.\u001a\u0004\b/\u00100R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00101\u001a\u0004\b2\u00103R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u00104\u001a\u0004\b5\u00106R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010&\u001a\u0004\b7\u0010(R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010&\u001a\u0004\b8\u0010(R\u001a\u0010\u0018\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010&\u001a\u0004\b9\u0010(R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010&\u001a\u0004\b:\u0010(R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010&\u001a\u0004\b;\u0010(¨\u0006<"}, d2 = {"LHt0/a;", "", "LHt0/c;", "bdui", "", "hasBackButton", "hasCloseButton", "hasNextButton", "hasReloadButton", "", "message", "mode", "moveToStepId", "LHt0/d;", "nextAction", "LHt0/e;", "onStartAnimation", "Lcom/avito/android/deep_linking/links/DeepLink;", "onboardingAction", "", "Lcom/avito/android/service_booking_public/generated/api/api_2_booking_form/BookingFormResponseV3SuccessParamsItem;", "params", "prevActionButton", "returnButtonText", "status", "step", "title", "<init>", "(LHt0/c;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LHt0/d;LHt0/e;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "LHt0/c;", "a", "()LHt0/c;", "Ljava/lang/Boolean;", "b", "()Ljava/lang/Boolean;", "c", "d", "e", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "getMode", "g", "LHt0/d;", "h", "()LHt0/d;", "LHt0/e;", "i", "()LHt0/e;", "Lcom/avito/android/deep_linking/links/DeepLink;", "j", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/util/List;", "k", "()Ljava/util/List;", "l", "m", "n", "getStep", "o", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ht0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14032a {

    @com.google.gson.annotations.c("bdui")
    @l
    private final c bdui;

    @com.google.gson.annotations.c("hasBackButton")
    @l
    private final Boolean hasBackButton;

    @com.google.gson.annotations.c("hasCloseButton")
    @l
    private final Boolean hasCloseButton;

    @com.google.gson.annotations.c("hasNextButton")
    @l
    private final Boolean hasNextButton;

    @com.google.gson.annotations.c("hasReloadButton")
    @l
    private final Boolean hasReloadButton;

    @com.google.gson.annotations.c("message")
    @l
    private final String message;

    @com.google.gson.annotations.c("mode")
    @l
    private final String mode;

    @com.google.gson.annotations.c("moveToStepId")
    @l
    private final String moveToStepId;

    @com.google.gson.annotations.c("nextAction")
    @l
    private final d nextAction;

    @com.google.gson.annotations.c("onStartAnimation")
    @l
    private final e onStartAnimation;

    @com.google.gson.annotations.c("onboardingAction")
    @l
    private final DeepLink onboardingAction;

    @com.google.gson.annotations.c("params")
    @k
    private final List<BookingFormResponseV3SuccessParamsItem> params;

    @com.google.gson.annotations.c("prevActionButton")
    @l
    private final String prevActionButton;

    @com.google.gson.annotations.c("returnButtonText")
    @l
    private final String returnButtonText;

    @com.google.gson.annotations.c("status")
    @k
    private final String status;

    @com.google.gson.annotations.c("step")
    @l
    private final String step;

    @com.google.gson.annotations.c("title")
    @l
    private final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public C14032a(@l c cVar, @l Boolean bool, @l Boolean bool2, @l Boolean bool3, @l Boolean bool4, @l String str, @l String str2, @l String str3, @l d dVar, @l e eVar, @l DeepLink deepLink, @k List<? extends BookingFormResponseV3SuccessParamsItem> list, @l String str4, @l String str5, @k String str6, @l String str7, @l String str8) {
        this.bdui = cVar;
        this.hasBackButton = bool;
        this.hasCloseButton = bool2;
        this.hasNextButton = bool3;
        this.hasReloadButton = bool4;
        this.message = str;
        this.mode = str2;
        this.moveToStepId = str3;
        this.nextAction = dVar;
        this.onStartAnimation = eVar;
        this.onboardingAction = deepLink;
        this.params = list;
        this.prevActionButton = str4;
        this.returnButtonText = str5;
        this.status = str6;
        this.step = str7;
        this.title = str8;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final c getBdui() {
        return this.bdui;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final Boolean getHasBackButton() {
        return this.hasBackButton;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Boolean getHasCloseButton() {
        return this.hasCloseButton;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final Boolean getHasNextButton() {
        return this.hasNextButton;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final Boolean getHasReloadButton() {
        return this.hasReloadButton;
    }

    @l
    /* renamed from: f, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final String getMoveToStepId() {
        return this.moveToStepId;
    }

    @l
    /* renamed from: h, reason: from getter */
    public final d getNextAction() {
        return this.nextAction;
    }

    @l
    /* renamed from: i, reason: from getter */
    public final e getOnStartAnimation() {
        return this.onStartAnimation;
    }

    @l
    /* renamed from: j, reason: from getter */
    public final DeepLink getOnboardingAction() {
        return this.onboardingAction;
    }

    @k
    public final List<BookingFormResponseV3SuccessParamsItem> k() {
        return this.params;
    }

    @l
    /* renamed from: l, reason: from getter */
    public final String getPrevActionButton() {
        return this.prevActionButton;
    }

    @l
    /* renamed from: m, reason: from getter */
    public final String getReturnButtonText() {
        return this.returnButtonText;
    }

    @k
    /* renamed from: n, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @l
    /* renamed from: o, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
