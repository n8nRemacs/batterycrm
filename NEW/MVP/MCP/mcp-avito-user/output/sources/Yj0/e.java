package YJ0;

import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: Api2SellersPrivateStatisticsGeneralDynamicsDatesPostResponse.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LYJ0/e;", "", "Lcom/avito/android/remote/model/Image;", "icon", "Lcom/avito/android/remote/model/text/AttributedText;", "name", "period", "", "slug", "<init>", "(Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;)V", "Lcom/avito/android/remote/model/Image;", "a", "()Lcom/avito/android/remote/model/Image;", "Lcom/avito/android/remote/model/text/AttributedText;", "b", "()Lcom/avito/android/remote/model/text/AttributedText;", "c", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e {

    @com.google.gson.annotations.c("icon")
    @Y61.l
    private final Image icon;

    @com.google.gson.annotations.c("name")
    @Y61.l
    private final AttributedText name;

    @com.google.gson.annotations.c("period")
    @Y61.l
    private final AttributedText period;

    @com.google.gson.annotations.c("slug")
    @Y61.l
    private final String slug;

    public e(@Y61.l Image image, @Y61.l AttributedText attributedText, @Y61.l AttributedText attributedText2, @Y61.l String str) {
        this.icon = image;
        this.name = attributedText;
        this.period = attributedText2;
        this.slug = str;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final Image getIcon() {
        return this.icon;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final AttributedText getName() {
        return this.name;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final AttributedText getPeriod() {
        return this.period;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final String getSlug() {
        return this.slug;
    }
}
