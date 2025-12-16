package com.avito.android.advert.item.complementary;

import TV0.g;
import Tp0.InterfaceC15392b;
import Tp0.InterfaceC15395e;
import Tp0.InterfaceC15396f;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.favorite.q;
import com.avito.android.section.SectionItem;
import com.avito.android.section.horizontal.adapter.HorizontalSectionAdapterItem;
import com.avito.android.section.o;
import com.avito.android.section.s;
import com.avito.android.section.v;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: RestyleComplementarySectionBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/complementary/h;", "LTV0/b;", "Lcom/avito/android/section/s;", "Lcom/avito/android/section/SectionItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h implements TV0.b<s, SectionItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final o f74605a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Tp0.s f74606b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final q f74607c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.advert.viewed.i f74608d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.konveyor.a f74609e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final g.a<v> f74610f = new g.a<>(R.layout.complementary_section_restyle, new g(this));

    @Inject
    public h(@k o oVar, @InterfaceC15396f @k Tp0.s sVar, @InterfaceC15392b @k q qVar, @Tp0.k @k com.avito.android.advert.viewed.i iVar, @InterfaceC15395e @k com.avito.konveyor.a aVar) {
        this.f74605a = oVar;
        this.f74606b = sVar;
        this.f74607c = qVar;
        this.f74608d = iVar;
        this.f74609e = aVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f74605a;
    }

    @Override // TV0.b
    @k
    public final g.a<v> b() {
        return this.f74610f;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return (aVar instanceof HorizontalSectionAdapterItem) && !((HorizontalSectionAdapterItem) aVar).f264687k;
    }
}
