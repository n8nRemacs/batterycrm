package Tb;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AssistantChatResponse.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTb/d;", "", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final AttributedText f15737a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final UniversalImage f15738b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f15739c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f15740d;

    public d(@k AttributedText attributedText, @k UniversalImage universalImage, @k String str, @l String str2) {
        this.f15737a = attributedText;
        this.f15738b = universalImage;
        this.f15739c = str;
        this.f15740d = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f15737a, dVar.f15737a) && L.f(this.f15738b, dVar.f15738b) && L.f(this.f15739c, dVar.f15739c) && L.f(this.f15740d, dVar.f15740d);
    }

    public final int hashCode() {
        int iD2 = H.d(com.avito.android.actions_sheet.a.a(this.f15737a.hashCode() * 31, 31, this.f15738b), 31, this.f15739c);
        String str = this.f15740d;
        return iD2 + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FallbackMessage(attributedText=");
        sb2.append(this.f15737a);
        sb2.append(", image=");
        sb2.append(this.f15738b);
        sb2.append(", title=");
        sb2.append(this.f15739c);
        sb2.append(", toastText=");
        return C22026a.c(sb2, this.f15740d, ')');
    }
}
