package com.avito.android.developments_agency_search.screen.deal_room_development.adapter.lot;

import Dw.InterfaceC13445a;
import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: LotItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room_development/adapter/lot/d;", "LTV0/d;", "Lcom/avito/android/developments_agency_search/screen/deal_room_development/adapter/lot/h;", "Lcom/avito/android/developments_agency_search/screen/deal_room_development/adapter/lot/a;", "a", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d implements TV0.d<h, com.avito.android.developments_agency_search.screen.deal_room_development.adapter.lot.a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC13445a, G0> f137860b;

    /* compiled from: LotItemPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room_development/adapter/lot/d$a;", "", "<init>", "()V", "", "DEFAULT_OPACITY", "F", "OPACITY_ON_TRANSLUCENT", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public d(@k l<? super InterfaceC13445a, G0> lVar) {
        this.f137860b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        com.avito.android.developments_agency_search.screen.deal_room_development.adapter.lot.a aVar2 = (com.avito.android.developments_agency_search.screen.deal_room_development.adapter.lot.a) aVar;
        hVar.XS(aVar2.f137848d ? 0.5f : 1.0f);
        hVar.l(aVar2.f137849e);
        hVar.p(aVar2.f137850f);
        if (aVar2.f137851g != null) {
            hVar.n7(true);
            hVar.i8(new e(this, aVar2));
        } else {
            hVar.n7(false);
            hVar.i8(null);
        }
        hVar.pB(aVar2.f137852h);
        hVar.Xj(aVar2.f137853i);
        hVar.Cx(aVar2.f137854j);
        hVar.ek(new f(this, aVar2));
        hVar.Rl(aVar2.f137855k);
    }
}
