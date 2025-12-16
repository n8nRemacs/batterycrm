package com.avito.android.lf_levels.domain;

import Y61.k;
import com.avito.android.lf_levels.di.m;
import com.avito.android.lf_levels.mvi.entity.LfLevelsInternalAction;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import xR.InterfaceC49877a;

/* compiled from: LfLevelsUseCase.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lf_levels/domain/c;", "Lcom/avito/android/lf_levels/domain/a;", "_avito_lf-levels_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c implements a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f175365b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC49877a f175366c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final R0 f175367d;

    @Inject
    public c(@k @m String str, @k InterfaceC49877a interfaceC49877a, @k R0 r02) {
        this.f175365b = str;
        this.f175366c = interfaceC49877a;
        this.f175367d = r02;
    }

    @Override // Y41.a
    public final InterfaceC43160i<? extends LfLevelsInternalAction> invoke() {
        return C43175k.I(this.f175367d.a(), C43175k.G(new b(this, null)));
    }
}
