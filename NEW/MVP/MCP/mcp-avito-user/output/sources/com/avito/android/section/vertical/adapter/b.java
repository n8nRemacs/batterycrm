package com.avito.android.section.vertical.adapter;

import TV0.g;
import Tp0.InterfaceC15395e;
import Tp0.InterfaceC15396f;
import Tp0.s;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.advert_core.advert.q;
import kotlin.Metadata;

/* compiled from: SectionVerticalAdapterBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/section/vertical/adapter/b;", "LTV0/b;", "Lcom/avito/android/section/vertical/adapter/f;", "Lcom/avito/android/section/vertical/adapter/SectionVerticalAdapterItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements TV0.b<f, SectionVerticalAdapterItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f264935a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final s f264936b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.konveyor.a f264937c;

    /* renamed from: d, reason: collision with root package name */
    public final int f264938d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final q f264939e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final g.a<h> f264940f = new g.a<>(R.layout.section_vertical_view, new a(this));

    public b(@k c cVar, @InterfaceC15396f @k s sVar, @InterfaceC15395e @k com.avito.konveyor.a aVar, int i12, @k q qVar) {
        this.f264935a = cVar;
        this.f264936b = sVar;
        this.f264937c = aVar;
        this.f264938d = i12;
        this.f264939e = qVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f264935a;
    }

    @Override // TV0.b
    @k
    public final g.a<h> b() {
        return this.f264940f;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof SectionVerticalAdapterItem;
    }
}
