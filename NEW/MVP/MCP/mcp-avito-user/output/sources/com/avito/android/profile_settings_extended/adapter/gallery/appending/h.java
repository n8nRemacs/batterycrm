package com.avito.android.profile_settings_extended.adapter.gallery.appending;

import Rb0.C15027c;
import Rb0.InterfaceC15026b;
import Y61.k;
import android.view.View;
import androidx.compose.runtime.internal.P;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ImageAppendingItemView.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/gallery/appending/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/profile_settings_extended/adapter/gallery/appending/g;", "LRb0/b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends com.avito.konveyor.adapter.b implements g, InterfaceC15026b {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f229400d = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f229401b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C15027c f229402c;

    public h(@k View view) {
        super(view);
        this.f229401b = view;
        this.f229402c = new C15027c(view);
    }

    @Override // com.avito.android.profile_settings_extended.adapter.gallery.appending.g
    public final void a(@k Y41.a<G0> aVar) {
        this.f229401b.setOnClickListener(new com.avito.android.profile_phones.phones_list.phone_item.g(9, aVar));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f229401b.setOnClickListener(null);
    }

    @Override // Rb0.InterfaceC15026b
    public final void xT(boolean z12) {
        this.f229402c.xT(z12);
    }
}
