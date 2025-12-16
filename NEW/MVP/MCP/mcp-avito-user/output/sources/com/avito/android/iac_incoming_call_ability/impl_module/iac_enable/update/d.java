package com.avito.android.iac_incoming_call_ability.impl_module.iac_enable.update;

import com.avito.android.util.V2;
import kotlin.Metadata;

/* compiled from: IacDeviceAvailabilityUpdater.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class d<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f168359b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f168360c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f168361d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f168362e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f168363f;

    public d(c cVar, boolean z12, boolean z13, String str, String str2) {
        this.f168359b = cVar;
        this.f168360c = z12;
        this.f168361d = z13;
        this.f168362e = str;
        this.f168363f = str2;
    }

    @Override // l41.g
    public final void accept(@Y61.k Object obj) {
        V2.f318762a.c("IacDeviceAvailabilityUpdater", "availability was successfully updated", null);
        c cVar = this.f168359b;
        cVar.f168356h.h(this.f168360c);
        boolean z12 = this.f168361d;
        com.avito.android.iac_incoming_call_ability.impl_module.iac_enable.a aVar = cVar.f168356h;
        aVar.c(z12);
        aVar.k(this.f168362e);
        aVar.e(this.f168363f);
    }
}
