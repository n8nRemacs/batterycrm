package LG;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.TooltipAttribute;
import kotlin.Metadata;

/* compiled from: SlotV7Response.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"LLG/i;", "", "LLG/x;", "icon", "", "title", TooltipAttribute.PARAM_DEEP_LINK, "<init>", "(LLG/x;Ljava/lang/String;Ljava/lang/String;)V", "LLG/x;", "a", "()LLG/x;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i {

    @com.google.gson.annotations.c("icon")
    @Y61.k
    private final x icon;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    @com.google.gson.annotations.c(TooltipAttribute.PARAM_DEEP_LINK)
    @Y61.k
    private final String uri;

    public i(@Y61.k x xVar, @Y61.k String str, @Y61.k String str2) {
        this.icon = xVar;
        this.title = str;
        this.uri = str2;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final x getIcon() {
        return this.icon;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getUri() {
        return this.uri;
    }
}
