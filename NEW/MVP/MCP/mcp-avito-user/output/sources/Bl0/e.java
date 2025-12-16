package BL0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import kotlin.Metadata;

/* compiled from: VasBundleBanner.kt */
@P
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LBL0/e;", "", "", "text", "Lcom/avito/android/remote/model/UniversalColor;", "backgroundColor", "Lcom/avito/android/remote/model/UniversalImage;", "image", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalImage;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/UniversalColor;", "a", "()Lcom/avito/android/remote/model/UniversalColor;", "Lcom/avito/android/remote/model/UniversalImage;", "b", "()Lcom/avito/android/remote/model/UniversalImage;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e {

    @com.google.gson.annotations.c("backgroundColor")
    @k
    private final UniversalColor backgroundColor;

    @com.google.gson.annotations.c("image")
    @l
    private final UniversalImage image;

    @com.google.gson.annotations.c("text")
    @k
    private final String text;

    public e(@k String str, @k UniversalColor universalColor, @l UniversalImage universalImage) {
        this.text = str;
        this.backgroundColor = universalColor;
        this.image = universalImage;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final UniversalColor getBackgroundColor() {
        return this.backgroundColor;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final UniversalImage getImage() {
        return this.image;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getText() {
        return this.text;
    }
}
