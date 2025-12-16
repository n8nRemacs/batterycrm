package com.avito.android.beduin.common.component.photo_picker.items.Placeholder;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PlaceholderItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/photo_picker/items/Placeholder/a;", "Lcom/avito/conveyor_item/a;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f102010b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f102011c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f102012d;

    public a() {
        this(null, false, null, 7, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f102010b, aVar.f102010b) && this.f102011c == aVar.f102011c && L.f(this.f102012d, aVar.f102012d);
    }

    @Override // TV0.a
    public final long getId() {
        return getF102010b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF102010b() {
        return this.f102010b;
    }

    public final int hashCode() {
        int i12 = r.i(this.f102010b.hashCode() * 31, 31, this.f102011c);
        String str = this.f102012d;
        return i12 + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlaceholderItem(stringId=");
        sb2.append(this.f102010b);
        sb2.append(", hasBorder=");
        sb2.append(this.f102011c);
        sb2.append(", errorMessage=");
        return C22026a.c(sb2, this.f102012d, ')');
    }

    public a(@k String str, boolean z12, @l String str2) {
        this.f102010b = str;
        this.f102011c = z12;
        this.f102012d = str2;
    }

    public /* synthetic */ a(String str, boolean z12, String str2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "photo_picker_placeholder" : str, (i12 & 2) != 0 ? false : z12, (i12 & 4) != 0 ? null : str2);
    }
}
