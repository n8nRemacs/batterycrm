package KI0;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SoaInfoDialog.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LKI0/a;", "", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f9384a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AttributedText f9385b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f9386c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Image f9387d;

    public a(@k String str, @k AttributedText attributedText, @k String str2, @k Image image) {
        this.f9384a = str;
        this.f9385b = attributedText;
        this.f9386c = str2;
        this.f9387d = image;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f9384a, aVar.f9384a) && L.f(this.f9385b, aVar.f9385b) && L.f(this.f9386c, aVar.f9386c) && L.f(this.f9387d, aVar.f9387d);
    }

    public final int hashCode() {
        return this.f9387d.hashCode() + H.d(com.avito.android.actions_sheet.a.b(this.f9384a.hashCode() * 31, 31, this.f9385b), 31, this.f9386c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SoaInfoDialog(title=");
        sb2.append(this.f9384a);
        sb2.append(", attributedText=");
        sb2.append(this.f9385b);
        sb2.append(", confirmTitle=");
        sb2.append(this.f9386c);
        sb2.append(", image=");
        return c.o(sb2, this.f9387d, ')');
    }
}
