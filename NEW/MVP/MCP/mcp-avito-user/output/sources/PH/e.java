package Ph;

import Y61.k;
import Y61.l;
import android.content.res.ColorStateList;
import com.avito.android.beduin.network.model.StrikethroughStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: LineAppearanceProperty.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPh/e;", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class e {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final StrikethroughStyle f13237a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Float f13238b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final ColorStateList f13239c;

    public e() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f13237a == eVar.f13237a && L.f(this.f13238b, eVar.f13238b) && L.f(this.f13239c, eVar.f13239c);
    }

    public final int hashCode() {
        StrikethroughStyle strikethroughStyle = this.f13237a;
        int iHashCode = (strikethroughStyle == null ? 0 : strikethroughStyle.hashCode()) * 31;
        Float f12 = this.f13238b;
        int iHashCode2 = (iHashCode + (f12 == null ? 0 : f12.hashCode())) * 31;
        ColorStateList colorStateList = this.f13239c;
        return iHashCode2 + (colorStateList != null ? colorStateList.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "LineAppearanceProperty(style=" + this.f13237a + ", thickness=" + this.f13238b + ", color=" + this.f13239c + ')';
    }

    public e(@l StrikethroughStyle strikethroughStyle, @l Float f12, @l ColorStateList colorStateList) {
        this.f13237a = strikethroughStyle;
        this.f13238b = f12;
        this.f13239c = colorStateList;
    }

    public /* synthetic */ e(StrikethroughStyle strikethroughStyle, Float f12, ColorStateList colorStateList, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : strikethroughStyle, (i12 & 2) != 0 ? null : f12, (i12 & 4) != 0 ? null : colorStateList);
    }
}
