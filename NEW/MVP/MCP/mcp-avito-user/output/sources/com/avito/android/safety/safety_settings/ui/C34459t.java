package com.avito.android.safety.safety_settings.ui;

import androidx.compose.foundation.layout.T1;
import androidx.compose.runtime.C22066f2;
import com.avito.android.safety.safety_settings.mvi.entity.SafetySettingsElement;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SafetySettingsScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.safety.safety_settings.ui.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34459t extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.l<com.avito.android.safety.safety_settings.mvi.entity.a, G0> f257894l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ List<SafetySettingsElement> f257895m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f257896n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ T1 f257897o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f257898p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f257899q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34459t(Y41.l lVar, List list, boolean z12, T1 t12, androidx.compose.ui.v vVar, int i12) {
        super(2);
        this.f257894l = lVar;
        this.f257895m = list;
        this.f257896n = z12;
        this.f257897o = t12;
        this.f257898p = vVar;
        this.f257899q = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f257899q | 1);
        androidx.compose.ui.v vVar = this.f257898p;
        List<SafetySettingsElement> list = this.f257895m;
        boolean z12 = this.f257896n;
        z.c(this.f257894l, list, z12, this.f257897o, vVar, a12, iA2);
        return G0.f406611a;
    }
}
