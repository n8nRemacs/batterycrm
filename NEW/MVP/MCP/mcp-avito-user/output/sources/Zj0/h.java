package ZJ0;

import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: Api3SellersPrivateStatisticsGeneralConfigPostResponse.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LZJ0/h;", "", "Lcom/avito/android/remote/model/Image;", "icon", "", "id", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "<init>", "(Lcom/avito/android/remote/model/Image;Ljava/lang/Long;Lcom/avito/android/remote/model/text/AttributedText;)V", "Lcom/avito/android/remote/model/Image;", "a", "()Lcom/avito/android/remote/model/Image;", "Ljava/lang/Long;", "b", "()Ljava/lang/Long;", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class h {

    @com.google.gson.annotations.c("icon")
    @Y61.l
    private final Image icon;

    @com.google.gson.annotations.c("id")
    @Y61.l
    private final Long id;

    @com.google.gson.annotations.c("title")
    @Y61.l
    private final AttributedText title;

    public h(@Y61.l Image image, @Y61.l Long l12, @Y61.l AttributedText attributedText) {
        this.icon = image;
        this.id = l12;
        this.title = attributedText;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final Image getIcon() {
        return this.icon;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final Long getId() {
        return this.id;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }
}
