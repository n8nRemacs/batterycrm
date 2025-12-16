package com.avito.android.iac_dialer.impl_module.analytics.tech_info;

import PL.i;
import Y61.k;
import Y61.l;
import android.os.Build;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer.impl_module.analytics.tech_info.IacTechInfoStorage;
import com.avito.android.permissions.u;
import com.avito.android.util.C;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.collections.C42756l;

/* compiled from: IacTechInfoDefaultParamsProvider.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/analytics/tech_info/b;", "Lcom/avito/android/iac_dialer/impl_module/analytics/tech_info/a;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes14.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C f165716a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.iac_dialer.impl_module.telecom.e f165717b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final u f165718c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final i f165719d;

    @Inject
    public b(@k C c12, @k com.avito.android.iac_dialer.impl_module.telecom.e eVar, @k u uVar, @k i iVar) {
        this.f165716a = c12;
        this.f165717b = eVar;
        this.f165718c = uVar;
        this.f165719d = iVar;
    }

    @Override // com.avito.android.iac_dialer.impl_module.analytics.tech_info.a
    @k
    public final ArrayList a(@l List list) {
        IacTechInfoStorage.Type type = IacTechInfoStorage.Type.f165701c;
        C c12 = this.f165716a;
        IacTechInfoStorage.a aVar = new IacTechInfoStorage.a(type, c12.getF125483c());
        IacTechInfoStorage.a aVar2 = new IacTechInfoStorage.a(IacTechInfoStorage.Type.f165702d, c12.getF125482b());
        IacTechInfoStorage.a aVar3 = new IacTechInfoStorage.a(IacTechInfoStorage.Type.f165703e, String.valueOf(c12.getF125487g()));
        IacTechInfoStorage.Type type2 = IacTechInfoStorage.Type.f165704f;
        com.avito.android.iac_dialer.impl_module.telecom.e eVar = this.f165717b;
        IacTechInfoStorage.a aVar4 = new IacTechInfoStorage.a(type2, String.valueOf(eVar.c(list)));
        IacTechInfoStorage.a aVar5 = new IacTechInfoStorage.a(IacTechInfoStorage.Type.f165705g, String.valueOf(eVar.a()));
        int i12 = Build.VERSION.SDK_INT;
        u uVar = this.f165718c;
        return C42756l.B(new IacTechInfoStorage.a[]{aVar, aVar2, aVar3, aVar4, aVar5, i12 >= 33 ? new IacTechInfoStorage.a(IacTechInfoStorage.Type.f165707i, String.valueOf(uVar.b("android.permission.USE_FULL_SCREEN_INTENT"))) : null, i12 >= 29 ? new IacTechInfoStorage.a(IacTechInfoStorage.Type.f165706h, String.valueOf(uVar.b("android.permission.POST_NOTIFICATIONS"))) : null, new IacTechInfoStorage.a(IacTechInfoStorage.Type.f165708j, String.valueOf(uVar.b("android.permission.RECORD_AUDIO"))), new IacTechInfoStorage.a(IacTechInfoStorage.Type.f165709k, String.valueOf(uVar.b("android.permission.CAMERA"))), new IacTechInfoStorage.a(IacTechInfoStorage.Type.f165710l, String.valueOf(this.f165719d.a()))});
    }
}
