package com.avito.android.str_cancellation_settings.composables;

import Sy0.InterfaceC15270a;
import androidx.compose.runtime.internal.C22096n;
import com.avito.android.str_cancellation_settings.mvi.entity.a;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: StrCancellationSettingsContent.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/m0;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/m0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class n0 extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.foundation.lazy.m0, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a.b f288244l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC15270a, G0> f288245m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n0(a.b bVar, Y41.l<? super InterfaceC15270a, G0> lVar) {
        super(1);
        this.f288244l = bVar;
        this.f288245m = lVar;
    }

    @Override // Y41.l
    public final G0 invoke(androidx.compose.foundation.lazy.m0 m0Var) {
        androidx.compose.foundation.lazy.m0 m0Var2 = m0Var;
        List<com.avito.conveyor_item.a> list = this.f288244l.f288489f;
        e0 e0Var = e0.f288217l;
        m0Var2.a(list.size(), e0Var != null ? new k0(e0Var, list) : null, new l0(j0.f288227l, list), new C22096n(-632812321, new m0(this.f288245m, list), true));
        return G0.f406611a;
    }
}
