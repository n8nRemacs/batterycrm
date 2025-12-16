package LG;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.TooltipAttribute;
import kotlin.Metadata;

/* compiled from: SlotV7Response.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"LLG/q;", "", "", "label", TooltipAttribute.PARAM_DEEP_LINK, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class q {

    @com.google.gson.annotations.c("label")
    @Y61.k
    private final String label;

    @com.google.gson.annotations.c(TooltipAttribute.PARAM_DEEP_LINK)
    @Y61.l
    private final String uri;

    public q(@Y61.k String str, @Y61.l String str2) {
        this.label = str;
        this.uri = str2;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final String getUri() {
        return this.uri;
    }
}
