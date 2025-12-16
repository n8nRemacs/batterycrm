package tR;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.lib.design.chips.e;
import com.avito.android.lib.design.chips.g;
import com.avito.android.lib.design.chips.h;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.text.AttributedText;
import j.InterfaceC42156l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: LfLevelChipable.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LtR/a;", "Lcom/avito/android/lib/design/chips/h;", "_avito_lf-levels_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: tR.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* data */ class C48597a implements h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f439252b;

    /* renamed from: c, reason: collision with root package name */
    public final int f439253c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ButtonAction f439254d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final AttributedText f439255e;

    public C48597a(@k String str, int i12, @k ButtonAction buttonAction, @l AttributedText attributedText) {
        this.f439252b = str;
        this.f439253c = i12;
        this.f439254d = buttonAction;
        this.f439255e = attributedText;
    }

    @Override // com.avito.android.lib.design.chips.h
    public final boolean A1() {
        return true;
    }

    @Override // com.avito.android.lib.design.chips.h
    @l
    public final Y41.l<Boolean, G0> L() {
        return null;
    }

    @Override // com.avito.android.lib.design.chips.h
    public final boolean P1() {
        return false;
    }

    @Override // com.avito.android.lib.design.chips.h
    @l
    public final g Q1() {
        return null;
    }

    @Override // com.avito.android.lib.design.chips.h
    public final boolean V1(@k Object obj) {
        if (obj instanceof C48597a) {
            if (this.f439253c == ((C48597a) obj).f439253c) {
                return true;
            }
        }
        return false;
    }

    @Override // com.avito.android.lib.design.chips.h
    @k
    /* renamed from: W */
    public final CharSequence getF199741b() {
        return this.f439252b;
    }

    @Override // com.avito.android.lib.design.chips.h
    @l
    public final e e2() {
        return null;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48597a)) {
            return false;
        }
        C48597a c48597a = (C48597a) obj;
        return L.f(this.f439252b, c48597a.f439252b) && this.f439253c == c48597a.f439253c && L.f(this.f439254d, c48597a.f439254d) && L.f(this.f439255e, c48597a.f439255e);
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: g0 */
    public final boolean getF293858c() {
        return false;
    }

    @Override // com.avito.android.lib.design.chips.h
    @l
    @InterfaceC42156l
    /* renamed from: getIconColor */
    public final Integer getF178767g() {
        return null;
    }

    @Override // com.avito.android.lib.design.chips.h
    @l
    public final e getImage() {
        return null;
    }

    public final int hashCode() {
        int iHashCode = (this.f439254d.hashCode() + r.e(this.f439253c, this.f439252b.hashCode() * 31, 31)) * 31;
        AttributedText attributedText = this.f439255e;
        return iHashCode + (attributedText == null ? 0 : attributedText.hashCode());
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: isActive */
    public final boolean getF178770j() {
        return true;
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: isEnabled */
    public final boolean getF281693d() {
        return true;
    }

    @Override // com.avito.android.lib.design.chips.h
    @l
    public final e q1() {
        return null;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LfLevelChipable(chipTitle=");
        sb2.append((Object) this.f439252b);
        sb2.append(", id=");
        sb2.append(this.f439253c);
        sb2.append(", button=");
        sb2.append(this.f439254d);
        sb2.append(", extraInfo=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f439255e, ')');
    }
}
