package Sr;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;

/* compiled from: EstimateActivateV3Response.kt */
@P
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LSr/n;", "", "Lcom/avito/android/remote/model/Image;", "image", "", "pricePenny", "", "title", "<init>", "(Lcom/avito/android/remote/model/Image;JLjava/lang/String;)V", "Lcom/avito/android/remote/model/Image;", "a", "()Lcom/avito/android/remote/model/Image;", "J", "b", "()J", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class n {

    @com.google.gson.annotations.c("image")
    @Y61.k
    private final Image image;

    @com.google.gson.annotations.c("pricePenny")
    private final long pricePenny;

    @com.google.gson.annotations.c("title")
    @Y61.l
    private final String title;

    public n(@Y61.k Image image, long j12, @Y61.l String str) {
        this.image = image;
        this.pricePenny = j12;
        this.title = str;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final Image getImage() {
        return this.image;
    }

    /* renamed from: b, reason: from getter */
    public final long getPricePenny() {
        return this.pricePenny;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
