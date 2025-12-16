package vh;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: Api4BblConfigureResponse.kt */
@P
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lvh/h;", "", "Lvh/i;", "button", "Lvh/j;", "contacts", "Lvh/g;", "secondButton", "Lcom/avito/android/remote/model/text/AttributedText;", "terms", "<init>", "(Lvh/i;Lvh/j;Lvh/g;Lcom/avito/android/remote/model/text/AttributedText;)V", "Lvh/i;", "a", "()Lvh/i;", "Lvh/j;", "b", "()Lvh/j;", "Lvh/g;", "c", "()Lvh/g;", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h {

    @com.google.gson.annotations.c("button")
    @Y61.k
    private final i button;

    @com.google.gson.annotations.c("contacts")
    @Y61.l
    private final j contacts;

    @com.google.gson.annotations.c("secondButton")
    @Y61.l
    private final g secondButton;

    @com.google.gson.annotations.c("terms")
    @Y61.l
    private final AttributedText terms;

    public h(@Y61.k i iVar, @Y61.l j jVar, @Y61.l g gVar, @Y61.l AttributedText attributedText) {
        this.button = iVar;
        this.contacts = jVar;
        this.secondButton = gVar;
        this.terms = attributedText;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final i getButton() {
        return this.button;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final j getContacts() {
        return this.contacts;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final g getSecondButton() {
        return this.secondButton;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final AttributedText getTerms() {
        return this.terms;
    }
}
