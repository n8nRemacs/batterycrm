package xL0;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.vas_performance.generated.api.api_vas_visual_v_1.Button;
import kotlin.Metadata;

/* compiled from: ApiVasVisualV1Response.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LxL0/f;", "", "Lcom/avito/android/vas_performance/generated/api/api_vas_visual_v_1/Button;", "button", "LxL0/g;", "contacts", "<init>", "(Lcom/avito/android/vas_performance/generated/api/api_vas_visual_v_1/Button;LxL0/g;)V", "Lcom/avito/android/vas_performance/generated/api/api_vas_visual_v_1/Button;", "a", "()Lcom/avito/android/vas_performance/generated/api/api_vas_visual_v_1/Button;", "LxL0/g;", "b", "()LxL0/g;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class f {

    @com.google.gson.annotations.c("button")
    @Y61.k
    private final Button button;

    @com.google.gson.annotations.c("contacts")
    @l
    private final g contacts;

    public f(@Y61.k Button button, @l g gVar) {
        this.button = button;
        this.contacts = gVar;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final Button getButton() {
        return this.button;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final g getContacts() {
        return this.contacts;
    }
}
