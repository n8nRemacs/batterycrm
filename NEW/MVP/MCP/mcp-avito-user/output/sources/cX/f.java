package cX;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BadgeDetailsField.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LcX/f;", "LcX/a;", "_avito-discouraged_avito-network_loyalty"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class f implements InterfaceC27115a {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final AttributedText f57917a;

    public f(@l AttributedText attributedText) {
        this.f57917a = attributedText;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && L.f(this.f57917a, ((f) obj).f57917a);
    }

    public final int hashCode() {
        AttributedText attributedText = this.f57917a;
        if (attributedText == null) {
            return 0;
        }
        return attributedText.hashCode();
    }

    @k
    public final String toString() {
        return com.avito.android.actions_sheet.a.w(new StringBuilder("TextField(attributedText="), this.f57917a, ')');
    }
}
