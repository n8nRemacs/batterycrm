package b91;

import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: GetChannelByIdResponse.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lb91/b0;", "", "Lb91/o;", "button", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "Lb91/l0;", "image", "<init>", "(Lb91/o;Lcom/avito/android/remote/model/text/AttributedText;Lb91/l0;)V", "Lb91/o;", "a", "()Lb91/o;", "Lcom/avito/android/remote/model/text/AttributedText;", "b", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lb91/l0;", "c", "()Lb91/l0;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class b0 {

    @com.google.gson.annotations.c("button")
    @Y61.l
    private final C25473o button;

    @com.google.gson.annotations.c("description")
    @Y61.l
    private final AttributedText description;

    @com.google.gson.annotations.c("image")
    @Y61.k
    private final l0 image;

    public b0(@Y61.l C25473o c25473o, @Y61.l AttributedText attributedText, @Y61.k l0 l0Var) {
        this.button = c25473o;
        this.description = attributedText;
        this.image = l0Var;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final C25473o getButton() {
        return this.button;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final l0 getImage() {
        return this.image;
    }
}
