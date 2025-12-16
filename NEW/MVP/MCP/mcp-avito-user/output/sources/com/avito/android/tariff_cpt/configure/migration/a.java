package com.avito.android.tariff_cpt.configure.migration;

import Y41.l;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.tariff_cpt.configure.migration.viewmodel.h;
import com.avito.konveyor.adapter.d;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CptMigrationFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/tariff_cpt/configure/migration/viewmodel/h$b;", "kotlin.jvm.PlatformType", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/tariff_cpt/configure/migration/viewmodel/h$b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class a extends N implements l<h.b, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ CptMigrationFragment f298014l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(CptMigrationFragment cptMigrationFragment) {
        super(1);
        this.f298014l = cptMigrationFragment;
    }

    @Override // Y41.l
    public final G0 invoke(h.b bVar) {
        h.b bVar2 = bVar;
        boolean z12 = bVar2 instanceof h.b.C9106b;
        CptMigrationFragment cptMigrationFragment = this.f298014l;
        if (z12) {
            com.avito.android.progress_overlay.l lVar = cptMigrationFragment.f298004s0;
            if (lVar == null) {
                lVar = null;
            }
            lVar.k(null);
        } else if (bVar2 instanceof h.b.c) {
            com.avito.android.progress_overlay.l lVar2 = cptMigrationFragment.f298004s0;
            if (lVar2 == null) {
                lVar2 = null;
            }
            lVar2.j();
            d dVar = cptMigrationFragment.f298000o0;
            if (dVar == null) {
                dVar = null;
            }
            dVar.l(((h.b.c) bVar2).f298092a.f437543a, null);
        } else if (bVar2 instanceof h.b.a) {
            com.avito.android.progress_overlay.l lVar3 = cptMigrationFragment.f298004s0;
            (lVar3 != null ? lVar3 : null).a(((h.b.a) bVar2).f298090a);
        }
        return G0.f406611a;
    }
}
