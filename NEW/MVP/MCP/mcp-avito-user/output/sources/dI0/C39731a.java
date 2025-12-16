package di0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api1NdTrxDevelopmentsByDevelopmentIdBuildingsGetResponse.kt */
@P
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B/\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\t\u0010\u0014¨\u0006\u0015"}, d2 = {"Ldi0/a;", "", "", "Ldi0/b;", "buildings", "Lcom/avito/android/remote/model/Image;", "developmentImage", "genPlanImage", "", "isCheckerboardAvailable", "<init>", "(Ljava/util/List;Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/Image;Z)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Lcom/avito/android/remote/model/Image;", "b", "()Lcom/avito/android/remote/model/Image;", "getGenPlanImage", "Z", "()Z", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: di0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C39731a {

    @com.google.gson.annotations.c("buildings")
    @k
    private final List<C39732b> buildings;

    @com.google.gson.annotations.c("developmentImage")
    @k
    private final Image developmentImage;

    @com.google.gson.annotations.c("genPlanImage")
    @l
    private final Image genPlanImage;

    @com.google.gson.annotations.c("isCheckerboardAvailable")
    private final boolean isCheckerboardAvailable;

    public C39731a(@k List<C39732b> list, @k Image image, @l Image image2, boolean z12) {
        this.buildings = list;
        this.developmentImage = image;
        this.genPlanImage = image2;
        this.isCheckerboardAvailable = z12;
    }

    @k
    public final List<C39732b> a() {
        return this.buildings;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final Image getDevelopmentImage() {
        return this.developmentImage;
    }
}
