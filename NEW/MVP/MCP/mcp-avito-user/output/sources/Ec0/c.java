package eC0;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.tariff.remote.model.cpx.Badge;
import java.util.List;
import kotlin.Metadata;

/* compiled from: CpxConfigureLandingResult.kt */
@P
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B;\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"LeC0/c;", "", "", "Lcom/avito/android/tariff/remote/model/cpx/Badge;", "badges", "LeC0/u;", "texts", "Lcom/avito/android/remote/model/UniversalImage;", "image", "Lcom/avito/android/remote/model/ButtonAction;", "button", "<init>", "(Ljava/util/List;Ljava/util/List;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/ButtonAction;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "d", "Lcom/avito/android/remote/model/UniversalImage;", "c", "()Lcom/avito/android/remote/model/UniversalImage;", "Lcom/avito/android/remote/model/ButtonAction;", "b", "()Lcom/avito/android/remote/model/ButtonAction;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c {

    @com.google.gson.annotations.c("badges")
    @Y61.l
    private final List<Badge> badges;

    @com.google.gson.annotations.c("button")
    @Y61.l
    private final ButtonAction button;

    @com.google.gson.annotations.c("image")
    @Y61.l
    private final UniversalImage image;

    @com.google.gson.annotations.c("texts")
    @Y61.l
    private final List<u> texts;

    public c(@Y61.l List<Badge> list, @Y61.l List<u> list2, @Y61.l UniversalImage universalImage, @Y61.l ButtonAction buttonAction) {
        this.badges = list;
        this.texts = list2;
        this.image = universalImage;
        this.button = buttonAction;
    }

    @Y61.l
    public final List<Badge> a() {
        return this.badges;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final ButtonAction getButton() {
        return this.button;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final UniversalImage getImage() {
        return this.image;
    }

    @Y61.l
    public final List<u> d() {
        return this.texts;
    }
}
