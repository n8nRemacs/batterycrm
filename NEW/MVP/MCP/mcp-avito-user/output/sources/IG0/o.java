package Ig0;

import com.avito.android.remote.model.Image;
import kotlin.Metadata;

/* compiled from: Api9ProfileReviewsGetResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LIg0/o;", "", "Lcom/avito/android/remote/model/Image;", "image", "LIg0/p;", "originalSize", "<init>", "(Lcom/avito/android/remote/model/Image;LIg0/p;)V", "Lcom/avito/android/remote/model/Image;", "a", "()Lcom/avito/android/remote/model/Image;", "LIg0/p;", "b", "()LIg0/p;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class o {

    @com.google.gson.annotations.c("image")
    @Y61.k
    private final Image image;

    @com.google.gson.annotations.c("originalSize")
    @Y61.k
    private final p originalSize;

    public o(@Y61.k Image image, @Y61.k p pVar) {
        this.image = image;
        this.originalSize = pVar;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final Image getImage() {
        return this.image;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final p getOriginalSize() {
        return this.originalSize;
    }
}
