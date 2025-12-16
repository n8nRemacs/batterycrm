package sD0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.Image;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;

/* compiled from: LandingResult.kt */
@P
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"LsD0/b;", "", "", "title", "Lcom/avito/android/remote/model/Image;", "image", "Lcom/avito/android/remote/model/ButtonAction;", "button", "", "LsD0/a;", "features", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/ButtonAction;Ljava/util/List;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/Image;", "c", "()Lcom/avito/android/remote/model/Image;", "Lcom/avito/android/remote/model/ButtonAction;", "a", "()Lcom/avito/android/remote/model/ButtonAction;", "Ljava/util/List;", "b", "()Ljava/util/List;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: sD0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C48034b {

    @c("button")
    @k
    private final ButtonAction button;

    @c("features")
    @k
    private final List<C48033a> features;

    @c("images")
    @l
    private final Image image;

    @c("title")
    @k
    private final String title;

    public C48034b(@k String str, @l Image image, @k ButtonAction buttonAction, @k List<C48033a> list) {
        this.title = str;
        this.image = image;
        this.button = buttonAction;
        this.features = list;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final ButtonAction getButton() {
        return this.button;
    }

    @k
    public final List<C48033a> b() {
        return this.features;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Image getImage() {
        return this.image;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
