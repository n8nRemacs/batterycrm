package Hg0;

import com.avito.android.remote.model.Image;
import kotlin.Metadata;

/* compiled from: Api11ProfileRatingsGetResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LHg0/A;", "", "Lcom/avito/android/remote/model/Image;", "image", "LHg0/B;", "originalSize", "<init>", "(Lcom/avito/android/remote/model/Image;LHg0/B;)V", "Lcom/avito/android/remote/model/Image;", "a", "()Lcom/avito/android/remote/model/Image;", "LHg0/B;", "b", "()LHg0/B;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Hg0.A, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C13987A {

    @com.google.gson.annotations.c("image")
    @Y61.k
    private final Image image;

    @com.google.gson.annotations.c("originalSize")
    @Y61.k
    private final B originalSize;

    public C13987A(@Y61.k Image image, @Y61.k B b12) {
        this.image = image;
        this.originalSize = b12;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final Image getImage() {
        return this.image;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final B getOriginalSize() {
        return this.originalSize;
    }
}
