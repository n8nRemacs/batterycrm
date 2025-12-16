package com.avito.android.lib.design.description_list;

import Y61.k;
import Y61.l;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.akita.compose.component.accordion.s;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DescriptionItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/description_list/a;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final CharSequence f179017a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final CharSequence f179018b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final View.OnClickListener f179019c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Drawable f179020d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Integer f179021e;

    public a(@k CharSequence charSequence, @k CharSequence charSequence2, @l View.OnClickListener onClickListener, @l Drawable drawable, @l Integer num) {
        this.f179017a = charSequence;
        this.f179018b = charSequence2;
        this.f179019c = onClickListener;
        this.f179020d = drawable;
        this.f179021e = num;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f179017a, aVar.f179017a) && L.f(this.f179018b, aVar.f179018b) && L.f(this.f179019c, aVar.f179019c) && L.f(this.f179020d, aVar.f179020d) && L.f(this.f179021e, aVar.f179021e);
    }

    public final int hashCode() {
        int iC2 = com.avito.android.advert.item.delivery_suggests.l.c(this.f179017a.hashCode() * 31, 31, this.f179018b);
        View.OnClickListener onClickListener = this.f179019c;
        int iHashCode = (iC2 + (onClickListener == null ? 0 : onClickListener.hashCode())) * 31;
        Drawable drawable = this.f179020d;
        int iHashCode2 = (iHashCode + (drawable == null ? 0 : drawable.hashCode())) * 31;
        Integer num = this.f179021e;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DescriptionItem(leftText=");
        sb2.append((Object) this.f179017a);
        sb2.append(", rightText=");
        sb2.append((Object) this.f179018b);
        sb2.append(", tipClickListener=");
        sb2.append(this.f179019c);
        sb2.append(", tipIcon=");
        sb2.append(this.f179020d);
        sb2.append(", tipIconTint=");
        return s.j(sb2, this.f179021e, ')');
    }

    public /* synthetic */ a(CharSequence charSequence, CharSequence charSequence2, View.OnClickListener onClickListener, Drawable drawable, Integer num, int i12, C42822w c42822w) {
        this(charSequence, charSequence2, (i12 & 4) != 0 ? null : onClickListener, (i12 & 8) != 0 ? null : drawable, (i12 & 16) != 0 ? null : num);
    }
}
