package com.avito.android.advert.item.complementary.redesign;

import TV0.d;
import TV0.g;
import Tp0.InterfaceC15392b;
import Tp0.j;
import Tp0.t;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.advert.viewed.i;
import com.avito.android.favorite.q;
import com.avito.android.section.SectionItem;
import com.avito.android.section.horizontal.adapter.HorizontalSectionAdapterItem;
import com.avito.android.section.o;
import com.avito.android.section.s;
import com.avito.android.section.v;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ComplementarySectionRedesignBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/complementary/redesign/b;", "LTV0/b;", "Lcom/avito/android/section/s;", "Lcom/avito/android/section/SectionItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b implements TV0.b<s, SectionItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final o f74617a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final t f74618b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final q f74619c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final i f74620d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.konveyor.a f74621e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final g.a<v> f74622f = new g.a<>(R.layout.complementary_section_restyle, new a(this));

    @Inject
    public b(@k o oVar, @j @k t tVar, @InterfaceC15392b @k q qVar, @Tp0.k @k i iVar, @Tp0.i @k com.avito.konveyor.a aVar) {
        this.f74617a = oVar;
        this.f74618b = tVar;
        this.f74619c = qVar;
        this.f74620d = iVar;
        this.f74621e = aVar;
    }

    @Override // TV0.b
    public final d a() {
        return this.f74617a;
    }

    @Override // TV0.b
    @k
    public final g.a<v> b() {
        return this.f74622f;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return (aVar instanceof HorizontalSectionAdapterItem) && ((HorizontalSectionAdapterItem) aVar).f264687k;
    }
}
