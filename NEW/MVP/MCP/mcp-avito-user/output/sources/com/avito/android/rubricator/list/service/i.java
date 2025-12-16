package com.avito.android.rubricator.list.service;

import Y61.k;
import androidx.compose.runtime.internal.P;
import androidx.view.C23038g0;
import androidx.view.M0;
import com.avito.android.rubricator.list.service.model.ServiceListArguments;
import com.avito.android.rubricator.list.service.model.ServiceListItem;
import java.util.List;
import kotlin.Metadata;
import wn0.InterfaceC49655a;

/* compiled from: ServiceListViewModel.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rubricator/list/service/i;", "Landroidx/lifecycle/M0;", "Lcom/avito/android/rubricator/list/service/h;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i extends M0 implements h {

    /* renamed from: E, reason: collision with root package name */
    @k
    public final C23038g0<String> f255989E;

    /* renamed from: J, reason: collision with root package name */
    @k
    public final C23038g0<List<ServiceListItem>> f255990J;

    public i(@k ServiceListArguments serviceListArguments, @k InterfaceC49655a interfaceC49655a) {
        C23038g0<String> c23038g0 = new C23038g0<>();
        this.f255989E = c23038g0;
        C23038g0<List<ServiceListItem>> c23038g02 = new C23038g0<>();
        this.f255990J = c23038g02;
        c23038g0.postValue(serviceListArguments.f256008b);
        c23038g02.postValue(interfaceC49655a.a(serviceListArguments.f256009c));
    }

    @Override // com.avito.android.rubricator.list.service.h
    /* renamed from: E4, reason: from getter */
    public final C23038g0 getF255990J() {
        return this.f255990J;
    }

    @Override // com.avito.android.rubricator.list.service.h
    /* renamed from: Y, reason: from getter */
    public final C23038g0 getF255989E() {
        return this.f255989E;
    }
}
