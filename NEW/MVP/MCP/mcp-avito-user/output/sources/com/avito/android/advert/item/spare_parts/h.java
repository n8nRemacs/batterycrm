package com.avito.android.advert.item.spare_parts;

import Nl0.InterfaceC14587a;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.SparePartsFilters;
import com.avito.android.remote.model.SparePartsParameters;
import com.avito.android.remote.models.SparePartsV2Response;
import com.avito.android.util.P2;
import com.avito.android.util.R0;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.Q0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.p2;
import kotlinx.coroutines.internal.C43238h;
import vx0.InterfaceC49391a;

/* compiled from: SparePartsRepository.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/spare_parts/h;", "Lcom/avito/android/advert/item/spare_parts/d;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h implements d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC49391a> f80471a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC14587a> f80472b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.remote.error.f f80473c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final C43238h f80474d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public Z1<P2<SparePartsV2Response>> f80475e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public Z1<P2<com.avito.android.advert.item.spare_parts.data.a>> f80476f;

    @Inject
    public h(@k h31.e<InterfaceC49391a> eVar, @k h31.e<InterfaceC14587a> eVar2, @k com.avito.android.remote.error.f fVar, @k R0 r02) {
        this.f80471a = eVar;
        this.f80472b = eVar2;
        this.f80473c = fVar;
        this.f80474d = U.a(r02.a());
    }

    @Override // com.avito.android.advert.item.spare_parts.d
    @k
    public final Z1 a(@k SparePartsParameters sparePartsParameters, @k String str) {
        Z1<P2<SparePartsV2Response>> z12 = this.f80475e;
        if (z12 != null && !(z12.getValue() instanceof P2.a)) {
            return this.f80475e;
        }
        Z1<P2<SparePartsV2Response>> z1A = p2.a(P2.c.f318721a);
        this.f80475e = z1A;
        C43259k.d(this.f80474d, null, null, new e(this, sparePartsParameters, str, z1A, null), 3);
        return z1A;
    }

    @Override // com.avito.android.advert.item.spare_parts.d
    @k
    public final Z1 b(@k String str, @k Map map) {
        Z1<P2<com.avito.android.advert.item.spare_parts.data.a>> z12 = this.f80476f;
        if (z12 != null && !(z12.getValue() instanceof P2.a)) {
            return this.f80476f;
        }
        Z1<P2<com.avito.android.advert.item.spare_parts.data.a>> z1A = p2.a(P2.c.f318721a);
        this.f80476f = z1A;
        C43259k.d(this.f80474d, null, null, new g(this, map, str, z1A, null), 3);
        return z1A;
    }

    @Override // com.avito.android.advert.item.spare_parts.d
    @k
    public final Z1 c(@k SparePartsFilters sparePartsFilters, @k String str) {
        Z1<P2<com.avito.android.advert.item.spare_parts.data.a>> z12 = this.f80476f;
        if (z12 != null && !(z12.getValue() instanceof P2.a)) {
            return this.f80476f;
        }
        Z1<P2<com.avito.android.advert.item.spare_parts.data.a>> z1A = p2.a(P2.c.f318721a);
        this.f80476f = z1A;
        C43259k.d(this.f80474d, null, null, new f(z1A, this, str, sparePartsFilters, null), 3);
        return z1A;
    }

    @Override // com.avito.android.advert.item.spare_parts.d
    public final void m0() {
        Q0.d(this.f80474d.f411905b);
        this.f80475e = null;
        this.f80476f = null;
    }
}
