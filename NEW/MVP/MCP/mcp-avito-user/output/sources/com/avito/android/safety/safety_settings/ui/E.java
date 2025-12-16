package com.avito.android.safety.safety_settings.ui;

import androidx.compose.runtime.C22066f2;
import com.avito.android.safety.safety_settings.mvi.entity.SafetySettingsElement;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SafetySettingsSessionBottomSheet.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class E extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<SafetySettingsElement.SessionItem.a> f257820l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f257821m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<com.avito.android.safety.safety_settings.mvi.entity.a, G0> f257822n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f257823o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(List list, boolean z12, Y41.l lVar, androidx.compose.ui.v vVar, int i12) {
        super(2);
        this.f257820l = list;
        this.f257821m = z12;
        this.f257822n = lVar;
        this.f257823o = vVar;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(9);
        F.a(this.f257820l, this.f257821m, this.f257822n, a12, iA2);
        return G0.f406611a;
    }
}
