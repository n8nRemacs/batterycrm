package com.avito.android.edit_carousel.adapter.advert;

import androidx.compose.runtime.internal.P;
import com.avito.android.edit_carousel.adapter.advert.a;
import com.avito.android.profile_settings_extended.entity.ExtendedProfileSettingsAdvert;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import ty.InterfaceC48738a;

/* compiled from: EditCarouselAdvertItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_carousel/adapter/advert/g;", "Lcom/avito/android/edit_carousel/adapter/advert/d;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g implements d {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC48738a, G0> f146253b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.edit_carousel.k f146254c;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public g(@Y61.k Y41.l<? super InterfaceC48738a, G0> lVar, @Y61.k com.avito.android.edit_carousel.k kVar) {
        this.f146253b = lVar;
        this.f146254c = kVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        j jVar = (j) eVar;
        a aVar2 = (a) aVar;
        if (aVar2 instanceof a.c) {
            jVar.uQ((a.c) aVar2, new e(this, aVar2));
        } else if (aVar2 instanceof a.b) {
            a.b bVar = (a.b) aVar2;
            f fVar = new f(this, aVar2);
            ExtendedProfileSettingsAdvert.Status status = ((a.b) aVar2).f146239b.f230273h;
            jVar.mA(fVar, bVar, status.f230278b < 10 && !L.f(status.f230280d, Boolean.TRUE));
        }
        ExtendedProfileSettingsAdvert.Status status2 = aVar2.getF146242b().f230273h;
        int i13 = status2.f230278b;
        String str = status2.f230279c;
        if (i13 == 10) {
            jVar.eN(str != null ? str : "");
            return;
        }
        if (i13 <= 10) {
            if (!L.f(status2.f230280d, Boolean.TRUE)) {
                jVar.jf(this.f146254c.c((int) aVar2.getF146242b().f230276k));
                return;
            }
        }
        jVar.n20(str != null ? str : "");
    }
}
