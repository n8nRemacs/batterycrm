package eC0;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.UniversalImage;
import java.util.List;
import kotlin.Metadata;

/* compiled from: CpxLevelsResult.kt */
@P
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"LeC0/i;", "", "Lcom/avito/android/remote/model/UniversalImage;", "icon", "disabledIcon", "", "name", "", "LeC0/k;", "levels", "<init>", "(Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/UniversalImage;Ljava/lang/String;Ljava/util/List;)V", "Lcom/avito/android/remote/model/UniversalImage;", "b", "()Lcom/avito/android/remote/model/UniversalImage;", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "Ljava/util/List;", "c", "()Ljava/util/List;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i {

    @com.google.gson.annotations.c("disabledIcon")
    @Y61.l
    private final UniversalImage disabledIcon;

    @com.google.gson.annotations.c("icon")
    @Y61.k
    private final UniversalImage icon;

    @com.google.gson.annotations.c("levels")
    @Y61.k
    private final List<k> levels;

    @com.google.gson.annotations.c("name")
    @Y61.k
    private final String name;

    public i(@Y61.k UniversalImage universalImage, @Y61.l UniversalImage universalImage2, @Y61.k String str, @Y61.k List<k> list) {
        this.icon = universalImage;
        this.disabledIcon = universalImage2;
        this.name = str;
        this.levels = list;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final UniversalImage getDisabledIcon() {
        return this.disabledIcon;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final UniversalImage getIcon() {
        return this.icon;
    }

    @Y61.k
    public final List<k> c() {
        return this.levels;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final String getName() {
        return this.name;
    }
}
