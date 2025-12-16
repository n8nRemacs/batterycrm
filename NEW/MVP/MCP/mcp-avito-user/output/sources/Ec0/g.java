package eC0;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;

/* compiled from: CpxConfigureLandingResult.kt */
@P
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0007\u0018\u00002\u00020\u0001BO\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"LeC0/g;", "", "LuZ/d;", "navBar", "LeC0/m;", "header", "LeC0/n;", RequestReviewResultKt.INFO_TYPE, "", "LeC0/c;", "cards", "LeC0/a;", "accordion", "Lcom/avito/android/remote/model/text/AttributedText;", "terms", "Lcom/avito/android/remote/model/ButtonAction;", "button", "<init>", "(LuZ/d;LeC0/m;LeC0/n;Ljava/util/List;LeC0/a;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/ButtonAction;)V", "LuZ/d;", "f", "()LuZ/d;", "LeC0/m;", "d", "()LeC0/m;", "LeC0/n;", "e", "()LeC0/n;", "Ljava/util/List;", "c", "()Ljava/util/List;", "LeC0/a;", "a", "()LeC0/a;", "Lcom/avito/android/remote/model/text/AttributedText;", "g", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/remote/model/ButtonAction;", "b", "()Lcom/avito/android/remote/model/ButtonAction;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g {

    @com.google.gson.annotations.c("accordion")
    @Y61.l
    private final C39989a accordion;

    @com.google.gson.annotations.c("button")
    @Y61.k
    private final ButtonAction button;

    @com.google.gson.annotations.c("cards")
    @Y61.l
    private final List<c> cards;

    @com.google.gson.annotations.c("header")
    @Y61.k
    private final m header;

    @com.google.gson.annotations.c(RequestReviewResultKt.INFO_TYPE)
    @Y61.l
    private final n info;

    @com.google.gson.annotations.c("navbar")
    @Y61.l
    private final uZ.d navBar;

    @com.google.gson.annotations.c("terms")
    @Y61.l
    private final AttributedText terms;

    public g(@Y61.l uZ.d dVar, @Y61.k m mVar, @Y61.l n nVar, @Y61.l List<c> list, @Y61.l C39989a c39989a, @Y61.l AttributedText attributedText, @Y61.k ButtonAction buttonAction) {
        this.navBar = dVar;
        this.header = mVar;
        this.info = nVar;
        this.cards = list;
        this.accordion = c39989a;
        this.terms = attributedText;
        this.button = buttonAction;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final C39989a getAccordion() {
        return this.accordion;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final ButtonAction getButton() {
        return this.button;
    }

    @Y61.l
    public final List<c> c() {
        return this.cards;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final m getHeader() {
        return this.header;
    }

    @Y61.l
    /* renamed from: e, reason: from getter */
    public final n getInfo() {
        return this.info;
    }

    @Y61.l
    /* renamed from: f, reason: from getter */
    public final uZ.d getNavBar() {
        return this.navBar;
    }

    @Y61.l
    /* renamed from: g, reason: from getter */
    public final AttributedText getTerms() {
        return this.terms;
    }
}
