package oB;

import com.avito.android.extended_profile_widgets.adapter.categorizer.adapter.CategorizerSnippetItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileWidgetAction.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LoB/h;", "LoB/k;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class h implements k {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final CategorizerSnippetItem f419513b;

    public h(@Y61.k CategorizerSnippetItem categorizerSnippetItem) {
        this.f419513b = categorizerSnippetItem;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && L.f(this.f419513b, ((h) obj).f419513b);
    }

    public final int hashCode() {
        return this.f419513b.hashCode();
    }

    @Y61.k
    public final String toString() {
        return "CategorizerItemClickAction(item=" + this.f419513b + ')';
    }
}
