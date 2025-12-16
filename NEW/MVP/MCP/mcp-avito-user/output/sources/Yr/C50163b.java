package yR;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.UniversalImage;
import java.util.List;
import kotlin.Metadata;

/* compiled from: LfLevelsResult.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"LyR/b;", "", "Lcom/avito/android/remote/model/UniversalImage;", "icon", "disabledIcon", "", "name", "", "LyR/d;", "levels", "<init>", "(Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/UniversalImage;Ljava/lang/String;Ljava/util/List;)V", "Lcom/avito/android/remote/model/UniversalImage;", "b", "()Lcom/avito/android/remote/model/UniversalImage;", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "Ljava/util/List;", "c", "()Ljava/util/List;", "_avito_lf-levels_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: yR.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C50163b {

    @com.google.gson.annotations.c("disabledIcon")
    @l
    private final UniversalImage disabledIcon;

    @com.google.gson.annotations.c("icon")
    @k
    private final UniversalImage icon;

    @com.google.gson.annotations.c("levels")
    @k
    private final List<d> levels;

    @com.google.gson.annotations.c("name")
    @k
    private final String name;

    public C50163b(@k UniversalImage universalImage, @l UniversalImage universalImage2, @k String str, @k List<d> list) {
        this.icon = universalImage;
        this.disabledIcon = universalImage2;
        this.name = str;
        this.levels = list;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final UniversalImage getDisabledIcon() {
        return this.disabledIcon;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final UniversalImage getIcon() {
        return this.icon;
    }

    @k
    public final List<d> c() {
        return this.levels;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getName() {
        return this.name;
    }
}
