package XJ0;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;

/* compiled from: Api1SellersPrivateStatisticsGeneralDynamicsLocationsPostResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LXJ0/c;", "", "Lcom/avito/android/remote/model/Image;", "image", "", "text", "<init>", "(Lcom/avito/android/remote/model/Image;Ljava/lang/String;)V", "Lcom/avito/android/remote/model/Image;", "a", "()Lcom/avito/android/remote/model/Image;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c {

    @com.google.gson.annotations.c("image")
    @l
    private final Image image;

    @com.google.gson.annotations.c("text")
    @k
    private final String text;

    public c(@l Image image, @k String str) {
        this.image = image;
        this.text = str;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final Image getImage() {
        return this.image;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getText() {
        return this.text;
    }
}
