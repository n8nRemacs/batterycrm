package Sx0;

import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: Api4StrOrderSellerByOrderIdGetResponse.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LSx0/x;", "", "LSx0/A;", "action", "LSx0/Q;", "backgroundColor", "Lcom/avito/android/remote/model/text/AttributedText;", "content", "LSx0/B;", "icon", "<init>", "(LSx0/A;LSx0/Q;Lcom/avito/android/remote/model/text/AttributedText;LSx0/B;)V", "LSx0/A;", "a", "()LSx0/A;", "LSx0/Q;", "b", "()LSx0/Q;", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "LSx0/B;", "d", "()LSx0/B;", "_avito-discouraged_avito-network_str-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class x {

    @com.google.gson.annotations.c("action")
    @Y61.l
    private final C15251A action;

    @com.google.gson.annotations.c("backgroundColor")
    @Y61.k
    private final Q backgroundColor;

    @com.google.gson.annotations.c("content")
    @Y61.l
    private final AttributedText content;

    @com.google.gson.annotations.c("icon")
    @Y61.l
    private final B icon;

    public x(@Y61.l C15251A c15251a, @Y61.k Q q12, @Y61.l AttributedText attributedText, @Y61.l B b12) {
        this.action = c15251a;
        this.backgroundColor = q12;
        this.content = attributedText;
        this.icon = b12;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final C15251A getAction() {
        return this.action;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final Q getBackgroundColor() {
        return this.backgroundColor;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final AttributedText getContent() {
        return this.content;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final B getIcon() {
        return this.icon;
    }
}
