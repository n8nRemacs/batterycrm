package oB;

import com.avito.android.extended_profile_widgets.adapter.info.TextItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileWidgetAction.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LoB/D;", "LoB/k;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class D implements k {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TextItem f419499b;

    public D(@Y61.k TextItem textItem) {
        this.f419499b = textItem;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof D) && L.f(this.f419499b, ((D) obj).f419499b);
    }

    public final int hashCode() {
        return this.f419499b.hashCode();
    }

    @Y61.k
    public final String toString() {
        return "TextItemExpandAction(item=" + this.f419499b + ')';
    }
}
