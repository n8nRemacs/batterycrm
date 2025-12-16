package com.avito.android.extended_profile_adverts.mvi;

import com.avito.android.extended_profile_adverts.di.n;
import com.avito.android.remote.model.SearchParams;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ProfileAdvertsBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile_adverts/mvi/f;", "Lcom/avito/android/arch/mvi/b;", "LpA/b;", "_avito_extended-profile-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class f implements com.avito.android.arch.mvi.b<pA.b> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f150925a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f150926b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f150927c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f150928d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f150929e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.extended_profile_adverts.d f150930f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final SearchParams f150931g;

    @Inject
    public f(@n.i @Y61.k String str, @n.g @Y61.k String str2, @n.h boolean z12, @Y61.l @n.c String str3, @Y61.l @n.f String str4, @Y61.k com.avito.android.extended_profile_adverts.d dVar, @n.a @Y61.l SearchParams searchParams) {
        this.f150925a = str;
        this.f150926b = str2;
        this.f150927c = z12;
        this.f150928d = str3;
        this.f150929e = str4;
        this.f150930f = dVar;
        this.f150931g = searchParams;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<pA.b> a() {
        return this.f150930f.a(this.f150925a, this.f150926b, this.f150927c, 0, 1, this.f150928d, this.f150929e, this.f150931g);
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
