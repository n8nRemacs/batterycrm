package Zz0;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.AvatarStatus;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: Api1StrSellerOrdersImportantToNotePostResponse.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"LZz0/c;", "", "Lcom/avito/android/remote/model/Image;", "image", "Lcom/avito/android/remote/model/text/AttributedText;", "name", AvatarStatus.REVIEW, "<init>", "(Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;)V", "Lcom/avito/android/remote/model/Image;", "a", "()Lcom/avito/android/remote/model/Image;", "Lcom/avito/android/remote/model/text/AttributedText;", "getName", "()Lcom/avito/android/remote/model/text/AttributedText;", "b", "_avito_str-seller-orders-important-to-note_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Zz0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C19629c {

    @com.google.gson.annotations.c("image")
    @l
    private final Image image;

    @com.google.gson.annotations.c("name")
    @l
    private final AttributedText name;

    @com.google.gson.annotations.c(AvatarStatus.REVIEW)
    @l
    private final AttributedText review;

    public C19629c(@l Image image, @l AttributedText attributedText, @l AttributedText attributedText2) {
        this.image = image;
        this.name = attributedText;
        this.review = attributedText2;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final Image getImage() {
        return this.image;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final AttributedText getReview() {
        return this.review;
    }
}
