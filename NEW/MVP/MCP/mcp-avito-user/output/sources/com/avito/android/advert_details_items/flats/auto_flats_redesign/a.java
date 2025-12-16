package com.avito.android.advert_details_items.flats.auto_flats_redesign;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22082i3;
import com.avito.android.remote.model.AdvertParameters;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertDetailsFlatTwoColumnWithDots.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class a extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<AdvertParameters.Parameter> f84674l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f84675m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ b f84676n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(List<AdvertParameters.Parameter> list, boolean z12, b bVar) {
        super(2);
        this.f84674l = list;
        this.f84675m = z12;
        this.f84676n = bVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            b bVar = this.f84676n;
            com.avito.android.advert_core.advert.k kVar = bVar.f84677a;
            Integer num2 = (Integer) ((C22082i3) bVar.f84679c).getF42167b();
            i.b(this.f84674l, this.f84675m, kVar, num2, a13, 520);
        }
        return G0.f406611a;
    }
}
