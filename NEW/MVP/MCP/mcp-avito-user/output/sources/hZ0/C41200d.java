package hz0;

import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: Api2StrSellerOrdersListPostResponse.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\r\u001a\u0004\b\u0017\u0010\u000fR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\u0018\u0010\u000f¨\u0006\u0019"}, d2 = {"Lhz0/d;", "", "Lcom/avito/android/remote/model/text/AttributedText;", "bottomSheetTitle", "Lhz0/p;", "clickstream", "", "iconName", "id", "subtitle", "title", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lhz0/p;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "a", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lhz0/p;", "b", "()Lhz0/p;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", "e", "f", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: hz0.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C41200d {

    @com.google.gson.annotations.c("bottomSheetTitle")
    @Y61.l
    private final AttributedText bottomSheetTitle;

    @com.google.gson.annotations.c("clickstream")
    @Y61.l
    private final p clickstream;

    @com.google.gson.annotations.c("iconName")
    @Y61.l
    private final String iconName;

    @com.google.gson.annotations.c("id")
    @Y61.l
    private final String id;

    @com.google.gson.annotations.c("subtitle")
    @Y61.l
    private final AttributedText subtitle;

    @com.google.gson.annotations.c("title")
    @Y61.l
    private final AttributedText title;

    public C41200d(@Y61.l AttributedText attributedText, @Y61.l p pVar, @Y61.l String str, @Y61.l String str2, @Y61.l AttributedText attributedText2, @Y61.l AttributedText attributedText3) {
        this.bottomSheetTitle = attributedText;
        this.clickstream = pVar;
        this.iconName = str;
        this.id = str2;
        this.subtitle = attributedText2;
        this.title = attributedText3;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final AttributedText getBottomSheetTitle() {
        return this.bottomSheetTitle;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final p getClickstream() {
        return this.clickstream;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final String getIconName() {
        return this.iconName;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Y61.l
    /* renamed from: e, reason: from getter */
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }

    @Y61.l
    /* renamed from: f, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }
}
