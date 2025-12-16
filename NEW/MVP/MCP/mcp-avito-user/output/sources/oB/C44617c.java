package oB;

import com.avito.android.extended_profile_widgets.adapter.about_v2.AboutV2Item;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileWidgetAction.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LoB/c;", "LoB/k;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: oB.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* data */ class C44617c implements k {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AboutV2Item f419506b;

    public C44617c(@Y61.k AboutV2Item aboutV2Item) {
        this.f419506b = aboutV2Item;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C44617c) && L.f(this.f419506b, ((C44617c) obj).f419506b);
    }

    public final int hashCode() {
        return this.f419506b.hashCode();
    }

    @Y61.k
    public final String toString() {
        return "AboutV2TextExpandClickAction(item=" + this.f419506b + ')';
    }
}
