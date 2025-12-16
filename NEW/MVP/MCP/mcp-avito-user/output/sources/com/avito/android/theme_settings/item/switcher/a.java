package com.avito.android.theme_settings.item.switcher;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.serp.adapter.i1;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SwitcherItem.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/theme_settings/item/switcher/a;", "Lcom/avito/conveyor_item/a;", "Lcom/avito/android/serp/adapter/i1;", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.conveyor_item.a, i1 {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f301336b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f301337c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f301338d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.android.theme_settings.viewmodel.a f301339e;

    public a(@k String str, @k String str2, @k String str3, @k com.avito.android.theme_settings.viewmodel.a aVar) {
        this.f301336b = str;
        this.f301337c = str2;
        this.f301338d = str3;
        this.f301339e = aVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f301336b, aVar.f301336b) && L.f(this.f301337c, aVar.f301337c) && L.f(this.f301338d, aVar.f301338d) && L.f(this.f301339e, aVar.f301339e);
    }

    @Override // TV0.a
    public final long getId() {
        return getF268951d().hashCode();
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount */
    public final int getF268950c() {
        return 2;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF268951d() {
        return this.f301336b;
    }

    public final int hashCode() {
        return this.f301339e.hashCode() + H.d(H.d(this.f301336b.hashCode() * 31, 31, this.f301337c), 31, this.f301338d);
    }

    @k
    public final String toString() {
        return "SwitcherItem(stringId=" + this.f301336b + ", title=" + this.f301337c + ", subtitle=" + this.f301338d + ", state=" + this.f301339e + ')';
    }
}
