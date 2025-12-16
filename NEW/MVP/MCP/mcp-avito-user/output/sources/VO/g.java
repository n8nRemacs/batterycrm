package vo;

import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: ApiCheckoutV8Response.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0015\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a¨\u0006\u001f"}, d2 = {"Lvo/g;", "", "Lvo/h;", "action", "Lvo/m;", "icon", "", "isRemoved", "Lcom/avito/android/remote/model/text/AttributedText;", "price", "", "serviceId", "title", "<init>", "(Lvo/h;Lvo/m;ZLcom/avito/android/remote/model/text/AttributedText;JLcom/avito/android/remote/model/text/AttributedText;)V", "Lvo/h;", "a", "()Lvo/h;", "Lvo/m;", "b", "()Lvo/m;", "Z", "f", "()Z", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "J", "d", "()J", "e", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g {

    @com.google.gson.annotations.c("action")
    @Y61.l
    private final h action;

    @com.google.gson.annotations.c("icon")
    @Y61.l
    private final m icon;

    @com.google.gson.annotations.c("isRemoved")
    private final boolean isRemoved;

    @com.google.gson.annotations.c("price")
    @Y61.k
    private final AttributedText price;

    @com.google.gson.annotations.c("serviceId")
    private final long serviceId;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final AttributedText title;

    public g(@Y61.l h hVar, @Y61.l m mVar, boolean z12, @Y61.k AttributedText attributedText, long j12, @Y61.k AttributedText attributedText2) {
        this.action = hVar;
        this.icon = mVar;
        this.isRemoved = z12;
        this.price = attributedText;
        this.serviceId = j12;
        this.title = attributedText2;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final h getAction() {
        return this.action;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final m getIcon() {
        return this.icon;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final AttributedText getPrice() {
        return this.price;
    }

    /* renamed from: d, reason: from getter */
    public final long getServiceId() {
        return this.serviceId;
    }

    @Y61.k
    /* renamed from: e, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getIsRemoved() {
        return this.isRemoved;
    }
}
