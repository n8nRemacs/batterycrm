package com.avito.android.advert.icebreakerseditor;

import androidx.compose.foundation.lazy.m0;
import androidx.compose.runtime.internal.C22096n;
import b4.C25408d;
import b4.InterfaceC25405a;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: IcebreakersEditorScreen.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/m0;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/m0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class B extends N implements Y41.l<m0, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C25408d f71183l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC25405a, G0> f71184m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(Y41.l lVar, C25408d c25408d) {
        super(1);
        this.f71183l = c25408d;
        this.f71184m = lVar;
    }

    @Override // Y41.l
    public final G0 invoke(m0 m0Var) {
        m0 m0Var2 = m0Var;
        List<C25408d.c> list = this.f71183l.f56891a;
        x xVar = x.f71305l;
        m0Var2.a(list.size(), xVar != null ? new y(xVar, list) : null, new z(list), new C22096n(-1091073711, new A(this.f71184m, list), true));
        return G0.f406611a;
    }
}
