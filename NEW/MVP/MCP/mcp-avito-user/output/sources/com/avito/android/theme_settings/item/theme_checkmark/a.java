package com.avito.android.theme_settings.item.theme_checkmark;

import Y61.k;
import Y61.l;
import android.graphics.drawable.Drawable;
import androidx.compose.foundation.H;
import com.avito.android.serp.adapter.i1;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ThemeCheckmarkItem.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/theme_settings/item/theme_checkmark/a;", "Lcom/avito/conveyor_item/a;", "Lcom/avito/android/serp/adapter/i1;", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.conveyor_item.a, i1 {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f301350b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f301351c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Drawable f301352d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.android.theme_settings.viewmodel.a f301353e;

    public a(@k String str, @k String str2, @k Drawable drawable, @k com.avito.android.theme_settings.viewmodel.a aVar) {
        this.f301350b = str;
        this.f301351c = str2;
        this.f301352d = drawable;
        this.f301353e = aVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f301350b, aVar.f301350b) && L.f(this.f301351c, aVar.f301351c) && L.f(this.f301352d, aVar.f301352d) && L.f(this.f301353e, aVar.f301353e);
    }

    @Override // TV0.a
    public final long getId() {
        return getF268951d().hashCode();
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount */
    public final int getF268950c() {
        return 1;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF268951d() {
        return this.f301350b;
    }

    public final int hashCode() {
        return this.f301353e.hashCode() + ((this.f301352d.hashCode() + H.d(this.f301350b.hashCode() * 31, 31, this.f301351c)) * 31);
    }

    @k
    public final String toString() {
        return "ThemeCheckmarkItem(stringId=" + this.f301350b + ", title=" + this.f301351c + ", image=" + this.f301352d + ", state=" + this.f301353e + ')';
    }
}
