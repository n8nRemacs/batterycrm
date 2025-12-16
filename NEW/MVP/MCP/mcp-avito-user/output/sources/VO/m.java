package vo;

import com.avito.android.remote.model.Image;
import kotlin.Metadata;

/* compiled from: ApiCheckoutV8Response.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lvo/m;", "", "Lcom/avito/android/remote/model/Image;", "value", "valueDark", "<init>", "(Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/Image;)V", "Lcom/avito/android/remote/model/Image;", "a", "()Lcom/avito/android/remote/model/Image;", "b", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class m {

    @com.google.gson.annotations.c("value")
    @Y61.k
    private final Image value;

    @com.google.gson.annotations.c("valueDark")
    @Y61.l
    private final Image valueDark;

    public m(@Y61.k Image image, @Y61.l Image image2) {
        this.value = image;
        this.valueDark = image2;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final Image getValue() {
        return this.value;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final Image getValueDark() {
        return this.valueDark;
    }
}
