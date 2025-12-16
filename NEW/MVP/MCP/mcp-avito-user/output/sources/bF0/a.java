package BF0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Banner.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBF0/a;", "", "_avito_travel-seller-banners_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f1261a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f1262b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f1263c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final UniversalImage f1264d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final UniversalColor f1265e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final DeepLink f1266f;

    public a(@k String str, @k String str2, @k AttributedText attributedText, @k UniversalImage universalImage, @k UniversalColor universalColor, @k DeepLink deepLink) {
        this.f1261a = str;
        this.f1262b = str2;
        this.f1263c = attributedText;
        this.f1264d = universalImage;
        this.f1265e = universalColor;
        this.f1266f = deepLink;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f1261a, aVar.f1261a) && L.f(this.f1262b, aVar.f1262b) && L.f(this.f1263c, aVar.f1263c) && L.f(this.f1264d, aVar.f1264d) && L.f(this.f1265e, aVar.f1265e) && L.f(this.f1266f, aVar.f1266f);
    }

    public final int hashCode() {
        return this.f1266f.hashCode() + com.avito.android.actions_sheet.a.i(this.f1265e, com.avito.android.actions_sheet.a.a(com.avito.android.actions_sheet.a.b(H.d(this.f1261a.hashCode() * 31, 31, this.f1262b), 31, this.f1263c), 31, this.f1264d), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Banner(id=");
        sb2.append(this.f1261a);
        sb2.append(", title=");
        sb2.append(this.f1262b);
        sb2.append(", subtitle=");
        sb2.append(this.f1263c);
        sb2.append(", image=");
        sb2.append(this.f1264d);
        sb2.append(", backgroundColor=");
        sb2.append(this.f1265e);
        sb2.append(", deeplink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f1266f, ')');
    }
}
