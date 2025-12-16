package com.avito.android.tariff_lf_constructor.configure.category.items.content;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: ConfigureCategoryItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/category/items/content/a;", "Lcom/avito/conveyor_item/a;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f299392b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f299393c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f299394d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f299395e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f299396f;

    public a(@k String str, @k String str2, @k String str3, @l String str4, boolean z12) {
        this.f299392b = str;
        this.f299393c = str2;
        this.f299394d = str3;
        this.f299395e = z12;
        this.f299396f = str4;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF287660b() {
        return getF299392b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF299392b() {
        return this.f299392b;
    }
}
