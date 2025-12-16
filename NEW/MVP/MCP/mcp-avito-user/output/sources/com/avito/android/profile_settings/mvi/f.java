package com.avito.android.profile_settings.mvi;

import Db0.InterfaceC13382a;
import com.avito.android.arch.mvi.q;
import com.avito.android.profile_settings.mvi.entity.ProfileSettingsState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ProfileSettingsFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LDb0/a;", "Lcom/avito/android/profile_settings/mvi/entity/a;", "Lcom/avito/android/profile_settings/mvi/entity/ProfileSettingsState;", "LDb0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class f extends N implements Y41.l<q<InterfaceC13382a, com.avito.android.profile_settings.mvi.entity.a, ProfileSettingsState, Db0.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f228480l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b f228481m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ k f228482n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ i f228483o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, b bVar, k kVar, i iVar) {
        super(1);
        this.f228480l = dVar;
        this.f228481m = bVar;
        this.f228482n = kVar;
        this.f228483o = iVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC13382a, com.avito.android.profile_settings.mvi.entity.a, ProfileSettingsState, Db0.b> qVar) {
        q<InterfaceC13382a, com.avito.android.profile_settings.mvi.entity.a, ProfileSettingsState, Db0.b> qVar2 = qVar;
        qVar2.f92008d = this.f228480l;
        qVar2.f92009e = this.f228481m;
        qVar2.f92011g = this.f228482n;
        qVar2.f92010f = this.f228483o;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
