package com.avito.android.tariff_lf_publication.region.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.tariff_lf_publication.region.mvi.entity.TariffLfPublicationRegionInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: TariffLfPublicationRegionActor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/tariff_lf_publication/region/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LVD0/a;", "Lcom/avito/android/tariff_lf_publication/region/mvi/entity/TariffLfPublicationRegionInternalAction;", "LVD0/c;", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements com.avito.android.arch.mvi.a<VD0.a, TariffLfPublicationRegionInternalAction, VD0.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.tariff_lf_publication.region.domain.a f301093a;

    @Inject
    public a(@Y61.k com.avito.android.tariff_lf_publication.region.domain.a aVar) {
        this.f301093a = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0078  */
    @Override // com.avito.android.arch.mvi.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlinx.coroutines.flow.InterfaceC43160i<com.avito.android.tariff_lf_publication.region.mvi.entity.TariffLfPublicationRegionInternalAction> b(VD0.a r4, VD0.c r5) {
        /*
            r3 = this;
            VD0.a r4 = (VD0.a) r4
            VD0.c r5 = (VD0.c) r5
            boolean r0 = r4 instanceof VD0.a.b
            if (r0 == 0) goto L10
            com.avito.android.tariff_lf_publication.region.domain.a r4 = r3.f301093a
            kotlinx.coroutines.flow.i r4 = r4.a()
            goto Lc1
        L10:
            boolean r0 = r4 instanceof VD0.a.C1166a
            if (r0 == 0) goto L1e
            com.avito.android.tariff_lf_publication.region.mvi.entity.TariffLfPublicationRegionInternalAction$Close r4 = com.avito.android.tariff_lf_publication.region.mvi.entity.TariffLfPublicationRegionInternalAction.Close.f301104b
            kotlinx.coroutines.flow.w r5 = new kotlinx.coroutines.flow.w
            r5.<init>(r4)
            r4 = r5
            goto Lc1
        L1e:
            boolean r0 = r4 instanceof VD0.a.e
            if (r0 == 0) goto L52
            wZ.b r0 = r5.f17023e
            if (r0 == 0) goto L4c
            com.avito.android.deep_linking.links.DeepLink r0 = r0.f441547b
            if (r0 == 0) goto L4c
            VD0.a$e r4 = (VD0.a.e) r4
            android.os.Bundle r4 = r4.f17012a
            java.lang.String r1 = "tariff_lf_publication_region_id"
            java.lang.String r2 = r5.f17025g
            r4.putString(r1, r2)
            kotlin.G0 r1 = kotlin.G0.f406611a
            boolean r5 = r5.f17024f
            if (r5 == 0) goto L40
            kotlinx.coroutines.flow.i r4 = kotlinx.coroutines.flow.C43175k.w()
            goto L4a
        L40:
            com.avito.android.tariff_lf_publication.region.mvi.entity.TariffLfPublicationRegionInternalAction$HandleDeeplink r5 = new com.avito.android.tariff_lf_publication.region.mvi.entity.TariffLfPublicationRegionInternalAction$HandleDeeplink
            r5.<init>(r0, r4)
            kotlinx.coroutines.flow.w r4 = new kotlinx.coroutines.flow.w
            r4.<init>(r5)
        L4a:
            if (r4 != 0) goto Lc1
        L4c:
            kotlinx.coroutines.flow.i r4 = kotlinx.coroutines.flow.C43175k.w()
            goto Lc1
        L52:
            boolean r0 = r4 instanceof VD0.a.d
            r1 = 0
            if (r0 == 0) goto L93
            VD0.a$d r4 = (VD0.a.d) r4
            com.avito.android.deeplink_handler.handler.bundle.a r5 = r4.f17010a
            if (r5 == 0) goto L78
            android.os.Bundle r5 = r5.f134522c
            if (r5 == 0) goto L78
            java.lang.String r0 = "tariff_lf_publication_show_button_progress"
            boolean r2 = r5.containsKey(r0)
            if (r2 == 0) goto L71
            boolean r5 = r5.getBoolean(r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
        L71:
            if (r1 == 0) goto L78
            boolean r5 = r1.booleanValue()
            goto L79
        L78:
            r5 = 0
        L79:
            boolean r4 = r4.f17011b
            if (r5 == 0) goto L88
            com.avito.android.tariff_lf_publication.region.mvi.entity.TariffLfPublicationRegionInternalAction$ChangeNextButtonLoading r5 = new com.avito.android.tariff_lf_publication.region.mvi.entity.TariffLfPublicationRegionInternalAction$ChangeNextButtonLoading
            r5.<init>(r4)
            kotlinx.coroutines.flow.w r4 = new kotlinx.coroutines.flow.w
            r4.<init>(r5)
            goto Lc1
        L88:
            com.avito.android.tariff_lf_publication.region.mvi.entity.TariffLfPublicationRegionInternalAction$ShowSimpleDeeplinkLoading r5 = new com.avito.android.tariff_lf_publication.region.mvi.entity.TariffLfPublicationRegionInternalAction$ShowSimpleDeeplinkLoading
            r5.<init>(r4)
            kotlinx.coroutines.flow.w r4 = new kotlinx.coroutines.flow.w
            r4.<init>(r5)
            goto Lc1
        L93:
            boolean r0 = r4 instanceof VD0.a.c
            if (r0 == 0) goto Laf
            VD0.a$c r4 = (VD0.a.c) r4
            com.avito.android.deep_linking.links.DeepLink r4 = r4.f17009a
            boolean r5 = r5.f17024f
            if (r5 == 0) goto La4
            kotlinx.coroutines.flow.i r4 = kotlinx.coroutines.flow.C43175k.w()
            goto Lc1
        La4:
            com.avito.android.tariff_lf_publication.region.mvi.entity.TariffLfPublicationRegionInternalAction$HandleDeeplink r5 = new com.avito.android.tariff_lf_publication.region.mvi.entity.TariffLfPublicationRegionInternalAction$HandleDeeplink
            r5.<init>(r4, r1)
            kotlinx.coroutines.flow.w r4 = new kotlinx.coroutines.flow.w
            r4.<init>(r5)
            goto Lc1
        Laf:
            boolean r5 = r4 instanceof VD0.a.f
            if (r5 == 0) goto Lc2
            com.avito.android.tariff_lf_publication.region.mvi.entity.TariffLfPublicationRegionInternalAction$ChangeRegion r5 = new com.avito.android.tariff_lf_publication.region.mvi.entity.TariffLfPublicationRegionInternalAction$ChangeRegion
            VD0.a$f r4 = (VD0.a.f) r4
            java.lang.String r4 = r4.f17013a
            r5.<init>(r4)
            kotlinx.coroutines.flow.w r4 = new kotlinx.coroutines.flow.w
            r4.<init>(r5)
        Lc1:
            return r4
        Lc2:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.tariff_lf_publication.region.mvi.a.b(java.lang.Object, java.lang.Object):kotlinx.coroutines.flow.i");
    }
}
