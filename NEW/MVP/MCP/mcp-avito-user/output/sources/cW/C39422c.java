package cw;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: Api2LogisticsSellerTariffGetResponse.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcw/c;", "", "", "badgeText", "Lcw/d;", "button", "Lcom/avito/android/remote/model/text/AttributedText;", "text", "<init>", "(Ljava/lang/String;Lcw/d;Lcom/avito/android/remote/model/text/AttributedText;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Lcw/d;", "b", "()Lcw/d;", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cw.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C39422c {

    @com.google.gson.annotations.c("badgeText")
    @l
    private final String badgeText;

    @com.google.gson.annotations.c("button")
    @l
    private final C39423d button;

    @com.google.gson.annotations.c("text")
    @k
    private final AttributedText text;

    public C39422c(@l String str, @l C39423d c39423d, @k AttributedText attributedText) {
        this.badgeText = str;
        this.button = c39423d;
        this.text = attributedText;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final String getBadgeText() {
        return this.badgeText;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final C39423d getButton() {
        return this.button;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final AttributedText getText() {
        return this.text;
    }
}
