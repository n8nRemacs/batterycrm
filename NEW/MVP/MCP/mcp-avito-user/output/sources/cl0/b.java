package CL0;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.beduin.common.component.cart_item.BeduinCartItemModel;
import com.avito.android.remote.model.UniversalImage;
import kotlin.Metadata;

/* compiled from: CompetitiveVasIcon.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"LCL0/b;", "", "Lcom/avito/android/remote/model/UniversalImage;", "selected", BeduinCartItemModel.DISABLED_STRING, "<init>", "(Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/UniversalImage;)V", "Lcom/avito/android/remote/model/UniversalImage;", "b", "()Lcom/avito/android/remote/model/UniversalImage;", "a", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b {

    @com.google.gson.annotations.c(BeduinCartItemModel.DISABLED_STRING)
    @l
    private final UniversalImage disabled;

    @com.google.gson.annotations.c("selected")
    @l
    private final UniversalImage selected;

    public b(@l UniversalImage universalImage, @l UniversalImage universalImage2) {
        this.selected = universalImage;
        this.disabled = universalImage2;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final UniversalImage getDisabled() {
        return this.disabled;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final UniversalImage getSelected() {
        return this.selected;
    }
}
