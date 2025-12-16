package PO0;

import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: GetWalletServiceInfoResponse.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u00002\u00020\u0001BK\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\r\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001d\u001a\u0004\b \u0010\u001f¨\u0006!"}, d2 = {"LPO0/i;", "", "LPO0/j;", "action", "LPO0/k;", "backgroundColor", "LPO0/l;", "events", "LPO0/e;", "leftIcon", "rightIcon", "Lcom/avito/android/remote/model/text/AttributedText;", "subtitle", "title", "<init>", "(LPO0/j;LPO0/k;LPO0/l;LPO0/e;LPO0/e;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;)V", "LPO0/j;", "a", "()LPO0/j;", "LPO0/k;", "b", "()LPO0/k;", "LPO0/l;", "c", "()LPO0/l;", "LPO0/e;", "d", "()LPO0/e;", "e", "Lcom/avito/android/remote/model/text/AttributedText;", "f", "()Lcom/avito/android/remote/model/text/AttributedText;", "g", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class i {

    @com.google.gson.annotations.c("action")
    @Y61.l
    private final j action;

    @com.google.gson.annotations.c("backgroundColor")
    @Y61.l
    private final k backgroundColor;

    @com.google.gson.annotations.c("events")
    @Y61.l
    private final l events;

    @com.google.gson.annotations.c("leftIcon")
    @Y61.l
    private final e leftIcon;

    @com.google.gson.annotations.c("rightIcon")
    @Y61.l
    private final e rightIcon;

    @com.google.gson.annotations.c("subtitle")
    @Y61.l
    private final AttributedText subtitle;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final AttributedText title;

    public i(@Y61.l j jVar, @Y61.l k kVar, @Y61.l l lVar, @Y61.l e eVar, @Y61.l e eVar2, @Y61.l AttributedText attributedText, @Y61.k AttributedText attributedText2) {
        this.action = jVar;
        this.backgroundColor = kVar;
        this.events = lVar;
        this.leftIcon = eVar;
        this.rightIcon = eVar2;
        this.subtitle = attributedText;
        this.title = attributedText2;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final j getAction() {
        return this.action;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final k getBackgroundColor() {
        return this.backgroundColor;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final l getEvents() {
        return this.events;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final e getLeftIcon() {
        return this.leftIcon;
    }

    @Y61.l
    /* renamed from: e, reason: from getter */
    public final e getRightIcon() {
        return this.rightIcon;
    }

    @Y61.l
    /* renamed from: f, reason: from getter */
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }

    @Y61.k
    /* renamed from: g, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }
}
