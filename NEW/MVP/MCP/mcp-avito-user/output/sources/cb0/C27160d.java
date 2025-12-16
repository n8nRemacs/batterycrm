package cb0;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: ServicesSellerTypeOptionsListResponse.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcb0/d;", "", "Lcb0/e;", "image", "Lcb0/f;", "primaryButton", "Lcb0/g;", "secondaryButton", "Lcom/avito/android/remote/model/text/AttributedText;", "subtitle", "", "title", "<init>", "(Lcb0/e;Lcb0/f;Lcb0/g;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;)V", "Lcb0/e;", "getImage", "()Lcb0/e;", "Lcb0/f;", "getPrimaryButton", "()Lcb0/f;", "Lcb0/g;", "getSecondaryButton", "()Lcb0/g;", "Lcom/avito/android/remote/model/text/AttributedText;", "getSubtitle", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cb0.d, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C27160d {

    @com.google.gson.annotations.c("image")
    @l
    private final C27161e image;

    @com.google.gson.annotations.c("primaryButton")
    @l
    private final f primaryButton;

    @com.google.gson.annotations.c("secondaryButton")
    @l
    private final g secondaryButton;

    @com.google.gson.annotations.c("subtitle")
    @k
    private final AttributedText subtitle;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    public C27160d(@l C27161e c27161e, @l f fVar, @l g gVar, @k AttributedText attributedText, @k String str) {
        this.image = c27161e;
        this.primaryButton = fVar;
        this.secondaryButton = gVar;
        this.subtitle = attributedText;
        this.title = str;
    }
}
