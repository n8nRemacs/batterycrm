package Qb;

import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: OpenV2Response.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"LQb/j;", "", "", "cooldown", "Lcom/avito/android/remote/model/text/AttributedText;", ServiceTransportationWidget.DisclaimerField.TYPE, "", "isEmptyChat", "isLastChunk", "", "legalText", "<init>", "(Ljava/lang/Long;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V", "Ljava/lang/Long;", "a", "()Ljava/lang/Long;", "Lcom/avito/android/remote/model/text/AttributedText;", "b", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/lang/Boolean;", "c", "()Ljava/lang/Boolean;", "d", "Ljava/lang/String;", "getLegalText", "()Ljava/lang/String;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j {

    @com.google.gson.annotations.c("cooldown")
    @Y61.l
    private final Long cooldown;

    @com.google.gson.annotations.c(ServiceTransportationWidget.DisclaimerField.TYPE)
    @Y61.l
    private final AttributedText disclaimer;

    @com.google.gson.annotations.c("isEmptyChat")
    @Y61.l
    private final Boolean isEmptyChat;

    @com.google.gson.annotations.c("isLastChunk")
    @Y61.l
    private final Boolean isLastChunk;

    @com.google.gson.annotations.c("legalText")
    @Y61.l
    private final String legalText;

    public j(@Y61.l Long l12, @Y61.l AttributedText attributedText, @Y61.l Boolean bool, @Y61.l Boolean bool2, @Y61.l String str) {
        this.cooldown = l12;
        this.disclaimer = attributedText;
        this.isEmptyChat = bool;
        this.isLastChunk = bool2;
        this.legalText = str;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final Long getCooldown() {
        return this.cooldown;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final AttributedText getDisclaimer() {
        return this.disclaimer;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final Boolean getIsEmptyChat() {
        return this.isEmptyChat;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final Boolean getIsLastChunk() {
        return this.isLastChunk;
    }
}
