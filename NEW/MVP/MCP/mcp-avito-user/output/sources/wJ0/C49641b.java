package wj0;

import Y61.k;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: MobileItemEditingTagResponse.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lwj0/b;", "", "Lwj0/c;", "applyButton", "Lwj0/d;", "cancelButton", "Lcom/avito/android/remote/model/text/AttributedText;", "terms", "<init>", "(Lwj0/c;Lwj0/d;Lcom/avito/android/remote/model/text/AttributedText;)V", "Lwj0/c;", "a", "()Lwj0/c;", "Lwj0/d;", "b", "()Lwj0/d;", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito-discouraged_avito-api_auction"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: wj0.b, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C49641b {

    @com.google.gson.annotations.c("applyButton")
    @k
    private final C49642c applyButton;

    @com.google.gson.annotations.c("cancelButton")
    @k
    private final C49643d cancelButton;

    @com.google.gson.annotations.c("terms")
    @k
    private final AttributedText terms;

    public C49641b(@k C49642c c49642c, @k C49643d c49643d, @k AttributedText attributedText) {
        this.applyButton = c49642c;
        this.cancelButton = c49643d;
        this.terms = attributedText;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final C49642c getApplyButton() {
        return this.applyButton;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final C49643d getCancelButton() {
        return this.cancelButton;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final AttributedText getTerms() {
        return this.terms;
    }
}
