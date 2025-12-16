package pi;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.remote.model.Image;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import qi.C47400a;

/* compiled from: Gallery.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0011\u0010\r¨\u0006\u0012"}, d2 = {"Lpi/d;", "", "", "Lcom/avito/android/remote/model/Image;", "images", "Lqi/a;", "imageEvent", "Lcom/avito/android/beduin_models/BeduinAction;", "onSwipeActions", "<init>", "(Ljava/util/List;Lqi/a;Ljava/util/List;)V", "Ljava/util/List;", "b", "()Ljava/util/List;", "Lqi/a;", "a", "()Lqi/a;", "c", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pi.d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* data */ class C47093d {

    @com.google.gson.annotations.c("onImageViewEvent")
    @l
    private final C47400a imageEvent;

    @com.google.gson.annotations.c("images")
    @l
    private final List<Image> images;

    @com.google.gson.annotations.c("onSwipeActions")
    @l
    private final List<BeduinAction> onSwipeActions;

    /* JADX WARN: Multi-variable type inference failed */
    public C47093d(@l List<Image> list, @l C47400a c47400a, @l List<? extends BeduinAction> list2) {
        this.images = list;
        this.imageEvent = c47400a;
        this.onSwipeActions = list2;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final C47400a getImageEvent() {
        return this.imageEvent;
    }

    @l
    public final List<Image> b() {
        return this.images;
    }

    @l
    public final List<BeduinAction> c() {
        return this.onSwipeActions;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47093d)) {
            return false;
        }
        C47093d c47093d = (C47093d) obj;
        return L.f(this.images, c47093d.images) && L.f(this.imageEvent, c47093d.imageEvent) && L.f(this.onSwipeActions, c47093d.onSwipeActions);
    }

    public final int hashCode() {
        List<Image> list = this.images;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        C47400a c47400a = this.imageEvent;
        int iHashCode2 = (iHashCode + (c47400a == null ? 0 : c47400a.hashCode())) * 31;
        List<BeduinAction> list2 = this.onSwipeActions;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Gallery(images=");
        sb2.append(this.images);
        sb2.append(", imageEvent=");
        sb2.append(this.imageEvent);
        sb2.append(", onSwipeActions=");
        return H.p(sb2, this.onSwipeActions, ')');
    }
}
