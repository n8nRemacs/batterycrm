package wo;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: ApiCheckoutV9Response.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0016\u0018\u00002\u00020\u0001BE\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u001c\u0010\u0015R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0013\u001a\u0004\b \u0010\u0015¨\u0006!"}, d2 = {"Lwo/e;", "", "Lwo/d;", "action", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "Lwo/j;", "icon", "", "isRemoved", "price", "", "serviceId", "title", "<init>", "(Lwo/d;Lcom/avito/android/remote/model/text/AttributedText;Lwo/j;ZLcom/avito/android/remote/model/text/AttributedText;JLcom/avito/android/remote/model/text/AttributedText;)V", "Lwo/d;", "a", "()Lwo/d;", "Lcom/avito/android/remote/model/text/AttributedText;", "b", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lwo/j;", "c", "()Lwo/j;", "Z", "g", "()Z", "d", "J", "e", "()J", "f", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e {

    @com.google.gson.annotations.c("action")
    @l
    private final d action;

    @com.google.gson.annotations.c("description")
    @l
    private final AttributedText description;

    @com.google.gson.annotations.c("icon")
    @l
    private final j icon;

    @com.google.gson.annotations.c("isRemoved")
    private final boolean isRemoved;

    @com.google.gson.annotations.c("price")
    @k
    private final AttributedText price;

    @com.google.gson.annotations.c("serviceId")
    private final long serviceId;

    @com.google.gson.annotations.c("title")
    @k
    private final AttributedText title;

    public e(@l d dVar, @l AttributedText attributedText, @l j jVar, boolean z12, @k AttributedText attributedText2, long j12, @k AttributedText attributedText3) {
        this.action = dVar;
        this.description = attributedText;
        this.icon = jVar;
        this.isRemoved = z12;
        this.price = attributedText2;
        this.serviceId = j12;
        this.title = attributedText3;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final d getAction() {
        return this.action;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final j getIcon() {
        return this.icon;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final AttributedText getPrice() {
        return this.price;
    }

    /* renamed from: e, reason: from getter */
    public final long getServiceId() {
        return this.serviceId;
    }

    @k
    /* renamed from: f, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getIsRemoved() {
        return this.isRemoved;
    }
}
