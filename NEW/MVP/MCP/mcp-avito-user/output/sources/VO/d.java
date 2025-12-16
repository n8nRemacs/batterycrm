package vo;

import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: ApiCheckoutV8Response.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lvo/d;", "", "Lvo/a;", "button", "Lvo/b;", "contacts", "secondButton", "Lcom/avito/android/remote/model/text/AttributedText;", "terms", "<init>", "(Lvo/a;Lvo/b;Lvo/a;Lcom/avito/android/remote/model/text/AttributedText;)V", "Lvo/a;", "a", "()Lvo/a;", "Lvo/b;", "b", "()Lvo/b;", "c", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d {

    @com.google.gson.annotations.c("button")
    @Y61.k
    private final C49359a button;

    @com.google.gson.annotations.c("contacts")
    @Y61.l
    private final C49360b contacts;

    @com.google.gson.annotations.c("secondButton")
    @Y61.l
    private final C49359a secondButton;

    @com.google.gson.annotations.c("terms")
    @Y61.l
    private final AttributedText terms;

    public d(@Y61.k C49359a c49359a, @Y61.l C49360b c49360b, @Y61.l C49359a c49359a2, @Y61.l AttributedText attributedText) {
        this.button = c49359a;
        this.contacts = c49360b;
        this.secondButton = c49359a2;
        this.terms = attributedText;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final C49359a getButton() {
        return this.button;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final C49360b getContacts() {
        return this.contacts;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final C49359a getSecondButton() {
        return this.secondButton;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final AttributedText getTerms() {
        return this.terms;
    }
}
