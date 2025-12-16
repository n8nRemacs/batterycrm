package Mp;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;

/* compiled from: AgentRoomGetDealByUuidApiResponse.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"LMp/i;", "", "Lcom/avito/android/remote/model/Image;", "darkImage", "lightImage", "<init>", "(Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/Image;)V", "Lcom/avito/android/remote/model/Image;", "a", "()Lcom/avito/android/remote/model/Image;", "b", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class i {

    @com.google.gson.annotations.c("darkImage")
    @Y61.l
    private final Image darkImage;

    @com.google.gson.annotations.c("lightImage")
    @Y61.l
    private final Image lightImage;

    public i(@Y61.l Image image, @Y61.l Image image2) {
        this.darkImage = image;
        this.lightImage = image2;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final Image getDarkImage() {
        return this.darkImage;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final Image getLightImage() {
        return this.lightImage;
    }
}
