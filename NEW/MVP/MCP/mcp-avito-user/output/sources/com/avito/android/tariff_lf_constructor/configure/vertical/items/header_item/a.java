package com.avito.android.tariff_lf_constructor.configure.vertical.items.header_item;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ConstructorConfigureVerticalHeaderItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/vertical/items/header_item/a;", "Lcom/avito/conveyor_item/a;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f300628b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f300629c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f300630d;

    public a(@k String str, @l String str2, @l String str3) {
        this.f300628b = str;
        this.f300629c = str2;
        this.f300630d = str3;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF287650b() {
        return getF291866c().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF291866c() {
        return this.f300628b;
    }

    public /* synthetic */ a(String str, String str2, String str3, int i12, C42822w c42822w) {
        this(str, str2, (i12 & 4) != 0 ? null : str3);
    }
}
