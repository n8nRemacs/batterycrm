package O40;

import Y61.k;
import com.avito.android.beduin_models.BeduinModel;
import java.util.List;
import kotlin.Metadata;

/* compiled from: OrderDetails.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LO40/a;", "", "", "mainFormId", "title", "", "Lcom/avito/android/beduin_models/BeduinModel;", "mainComponents", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "Ljava/util/List;", "a", "()Ljava/util/List;", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a {

    @com.google.gson.annotations.c("components")
    @k
    private final List<BeduinModel> mainComponents;

    @com.google.gson.annotations.c("mainFormId")
    @k
    private final String mainFormId;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public a(@k String str, @k String str2, @k List<? extends BeduinModel> list) {
        this.mainFormId = str;
        this.title = str2;
        this.mainComponents = list;
    }

    @k
    public final List<BeduinModel> a() {
        return this.mainComponents;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getMainFormId() {
        return this.mainFormId;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
