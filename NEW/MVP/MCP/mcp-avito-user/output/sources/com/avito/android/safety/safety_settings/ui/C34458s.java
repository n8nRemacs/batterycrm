package com.avito.android.safety.safety_settings.ui;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.lazy.m0;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.safety.safety_settings.mvi.entity.SafetySettingsElement;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SafetySettingsScreen.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/m0;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/m0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.safety.safety_settings.ui.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34458s extends kotlin.jvm.internal.N implements Y41.l<m0, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<SafetySettingsElement> f257892l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<com.avito.android.safety.safety_settings.mvi.entity.a, G0> f257893m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34458s(Y41.l lVar, List list) {
        super(1);
        this.f257892l = list;
        this.f257893m = lVar;
    }

    @Override // Y41.l
    public final G0 invoke(m0 m0Var) {
        m0 m0Var2 = m0Var;
        v.a aVar = androidx.compose.ui.v.f42878y1;
        float f12 = 16;
        h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
        androidx.compose.ui.v vVarD = C20588k2.d(R1.m(aVar, f12, 0.0f, f12, 0.0f, 10), 1.0f);
        C34441a.f257856a.getClass();
        m0Var2.c(null, null, C34441a.f257857b);
        C34454n c34454n = C34454n.f257883l;
        List<SafetySettingsElement> list = this.f257892l;
        m0Var2.a(list.size(), c34454n != null ? new C34456p(c34454n, list) : null, new C34457q(list), new C22096n(-1091073711, new r(list, vVarD, this.f257893m, list), true));
        m0Var2.c(null, null, C34441a.f257858c);
        return G0.f406611a;
    }
}
