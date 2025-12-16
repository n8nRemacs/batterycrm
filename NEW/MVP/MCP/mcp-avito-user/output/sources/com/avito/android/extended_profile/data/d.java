package com.avito.android.extended_profile.data;

import Y61.l;
import com.avito.android.remote.model.DeeplinkAction;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfilePlaceholder.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile/data/d;", "", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f149478a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AttributedText f149479b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final DeeplinkAction f149480c;

    public d(@Y61.k String str, @Y61.k AttributedText attributedText, @l DeeplinkAction deeplinkAction) {
        this.f149478a = str;
        this.f149479b = attributedText;
        this.f149480c = deeplinkAction;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f149478a, dVar.f149478a) && L.f(this.f149479b, dVar.f149479b) && L.f(this.f149480c, dVar.f149480c);
    }

    public final int hashCode() {
        int iB2 = com.avito.android.actions_sheet.a.b(this.f149478a.hashCode() * 31, 31, this.f149479b);
        DeeplinkAction deeplinkAction = this.f149480c;
        return iB2 + (deeplinkAction == null ? 0 : deeplinkAction.hashCode());
    }

    @Y61.k
    public final String toString() {
        return "ExtendedProfilePlaceholder(title=" + this.f149478a + ", subtitle=" + this.f149479b + ", action=" + this.f149480c + ')';
    }
}
