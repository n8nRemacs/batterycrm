package com.avito.android.sx_address.entry;

import DA0.a;
import androidx.compose.foundation.lazy.m0;
import androidx.compose.runtime.internal.C22096n;
import com.avito.android.deep_linking.links.DeepLink;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SxAddressEntryScreen.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/m0;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/m0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class o extends N implements Y41.l<m0, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a.C0157a f292977l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f292978m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o(a.C0157a c0157a, Y41.l<? super DeepLink, G0> lVar) {
        super(1);
        this.f292977l = c0157a;
        this.f292978m = lVar;
    }

    @Override // Y41.l
    public final G0 invoke(m0 m0Var) {
        List<com.avito.android.sx_address.entry.domain.a> list = this.f292977l.f3079a;
        m0Var.a(list.size(), null, new m(k.f292949l, list), new C22096n(-632812321, new n(this.f292978m, list), true));
        return G0.f406611a;
    }
}
