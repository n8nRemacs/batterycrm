package com.avito.android.advert.item.beduin.v2.viewed;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.beduin.v2.render.android_view.A;
import com.avito.beduin.v2.render.android_view.InterfaceC36343m;
import com.avito.beduin.v2.render.android_view.n;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ViewedTagComponentFactory.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/beduin/v2/viewed/b;", "Lcom/avito/beduin/v2/render/android_view/n;", "Lcom/avito/android/advert/item/beduin/v2/viewed/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b extends n<a> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Y41.a<com.avito.android.advert.viewed.d> f73379c;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public b(@k Y41.a<? extends com.avito.android.advert.viewed.d> aVar) {
        super(i.f73386c);
        this.f73379c = aVar;
    }

    @Override // com.avito.beduin.v2.render.android_view.n
    @k
    public final InterfaceC36343m b(@k A a12) {
        return new a(this.f73379c.invoke());
    }
}
