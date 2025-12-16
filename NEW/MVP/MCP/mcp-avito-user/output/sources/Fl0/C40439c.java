package fl0;

import Y61.l;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.category_parameters.ConstraintKt;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: Api1PublishItemRestrictionCheckGetResponse.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b'\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b$\u0010#R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010+\u001a\u0004\b,\u0010-R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010.\u001a\u0004\b/\u00100R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001e\u001a\u0004\b\u0011\u0010 R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u00101\u001a\u0004\b2\u00103R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001e\u001a\u0004\b4\u0010 R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u001b\u001a\u0004\b5\u0010\u001dR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u00101\u001a\u0004\b6\u00103R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u00101\u001a\u0004\b7\u00103R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u00101\u001a\u0004\b8\u00103¨\u00069"}, d2 = {"Lfl0/c;", "", "Lfl0/b;", "button", "", "closeButton", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "descriptionHeader", "Lfl0/d;", "dynamicImage", "Lfl0/e;", "footer", "Lcom/avito/android/remote/model/Image;", "image", "", "imageRelativeWidth", "isButtonsFloating", "", "onDismissDeepLink", "overlayHeader", "secondaryButton", BeduinPromoBlockModel.SERIALIZED_NAME_THEME, "title", ConstraintKt.WARNING, "<init>", "(Lfl0/b;Ljava/lang/Boolean;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lfl0/d;Lfl0/e;Lcom/avito/android/remote/model/Image;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Lfl0/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lfl0/b;", "a", "()Lfl0/b;", "Ljava/lang/Boolean;", "b", "()Ljava/lang/Boolean;", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "d", "Lfl0/d;", "e", "()Lfl0/d;", "Lfl0/e;", "f", "()Lfl0/e;", "Lcom/avito/android/remote/model/Image;", "g", "()Lcom/avito/android/remote/model/Image;", "Ljava/lang/Double;", "h", "()Ljava/lang/Double;", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "j", "k", "l", "m", "n", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: fl0.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C40439c {

    @com.google.gson.annotations.c("button")
    @l
    private final C40438b button;

    @com.google.gson.annotations.c("closeButton")
    @l
    private final Boolean closeButton;

    @com.google.gson.annotations.c("description")
    @l
    private final AttributedText description;

    @com.google.gson.annotations.c("descriptionHeader")
    @l
    private final AttributedText descriptionHeader;

    @com.google.gson.annotations.c("dynamicImage")
    @l
    private final C40440d dynamicImage;

    @com.google.gson.annotations.c("footer")
    @l
    private final e footer;

    @com.google.gson.annotations.c("image")
    @l
    private final Image image;

    @com.google.gson.annotations.c("imageRelativeWidth")
    @l
    private final Double imageRelativeWidth;

    @com.google.gson.annotations.c("isButtonsFloating")
    @l
    private final Boolean isButtonsFloating;

    @com.google.gson.annotations.c("onDismissDeepLink")
    @l
    private final String onDismissDeepLink;

    @com.google.gson.annotations.c("overlayHeader")
    @l
    private final Boolean overlayHeader;

    @com.google.gson.annotations.c("secondaryButton")
    @l
    private final C40438b secondaryButton;

    @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_THEME)
    @l
    private final String theme;

    @com.google.gson.annotations.c("title")
    @l
    private final String title;

    @com.google.gson.annotations.c(ConstraintKt.WARNING)
    @l
    private final String warning;

    public C40439c(@l C40438b c40438b, @l Boolean bool, @l AttributedText attributedText, @l AttributedText attributedText2, @l C40440d c40440d, @l e eVar, @l Image image, @l Double d12, @l Boolean bool2, @l String str, @l Boolean bool3, @l C40438b c40438b2, @l String str2, @l String str3, @l String str4) {
        this.button = c40438b;
        this.closeButton = bool;
        this.description = attributedText;
        this.descriptionHeader = attributedText2;
        this.dynamicImage = c40440d;
        this.footer = eVar;
        this.image = image;
        this.imageRelativeWidth = d12;
        this.isButtonsFloating = bool2;
        this.onDismissDeepLink = str;
        this.overlayHeader = bool3;
        this.secondaryButton = c40438b2;
        this.theme = str2;
        this.title = str3;
        this.warning = str4;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final C40438b getButton() {
        return this.button;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final Boolean getCloseButton() {
        return this.closeButton;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final AttributedText getDescriptionHeader() {
        return this.descriptionHeader;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final C40440d getDynamicImage() {
        return this.dynamicImage;
    }

    @l
    /* renamed from: f, reason: from getter */
    public final e getFooter() {
        return this.footer;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final Image getImage() {
        return this.image;
    }

    @l
    /* renamed from: h, reason: from getter */
    public final Double getImageRelativeWidth() {
        return this.imageRelativeWidth;
    }

    @l
    /* renamed from: i, reason: from getter */
    public final String getOnDismissDeepLink() {
        return this.onDismissDeepLink;
    }

    @l
    /* renamed from: j, reason: from getter */
    public final Boolean getOverlayHeader() {
        return this.overlayHeader;
    }

    @l
    /* renamed from: k, reason: from getter */
    public final C40438b getSecondaryButton() {
        return this.secondaryButton;
    }

    @l
    /* renamed from: l, reason: from getter */
    public final String getTheme() {
        return this.theme;
    }

    @l
    /* renamed from: m, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: n, reason: from getter */
    public final String getWarning() {
        return this.warning;
    }
}
