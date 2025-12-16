package X50;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: Vertical.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LX50/e;", "", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f18590a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f18591b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f18592c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<d> f18593d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Integer f18594e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f18595f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final AttributedText f18596g;

    public e(int i12, @k String str, @k String str2, @k List<d> list, @l Integer num, boolean z12, @l AttributedText attributedText) {
        this.f18590a = i12;
        this.f18591b = str;
        this.f18592c = str2;
        this.f18593d = list;
        this.f18594e = num;
        this.f18595f = z12;
        this.f18596g = attributedText;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f18590a == eVar.f18590a && L.f(this.f18591b, eVar.f18591b) && L.f(this.f18592c, eVar.f18592c) && L.f(this.f18593d, eVar.f18593d) && L.f(this.f18594e, eVar.f18594e) && this.f18595f == eVar.f18595f && L.f(this.f18596g, eVar.f18596g);
    }

    public final int hashCode() {
        int iE2 = H.e(H.d(H.d(Integer.hashCode(this.f18590a) * 31, 31, this.f18591b), 31, this.f18592c), 31, this.f18593d);
        Integer num = this.f18594e;
        int i12 = r.i((iE2 + (num == null ? 0 : num.hashCode())) * 31, 31, this.f18595f);
        AttributedText attributedText = this.f18596g;
        return i12 + (attributedText != null ? attributedText.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Vertical(id=");
        sb2.append(this.f18590a);
        sb2.append(", title=");
        sb2.append(this.f18591b);
        sb2.append(", description=");
        sb2.append(this.f18592c);
        sb2.append(", specifics=");
        sb2.append(this.f18593d);
        sb2.append(", defaultSpecificId=");
        sb2.append(this.f18594e);
        sb2.append(", disabled=");
        sb2.append(this.f18595f);
        sb2.append(", disablingText=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f18596g, ')');
    }

    public /* synthetic */ e(int i12, String str, String str2, List list, Integer num, boolean z12, AttributedText attributedText, int i13, C42822w c42822w) {
        this(i12, str, str2, list, num, z12, (i13 & 64) != 0 ? null : attributedText);
    }
}
