package com.avito.android.early_access.mvi;

import Mx.InterfaceC14538a;
import androidx.compose.foundation.lazy.m0;
import androidx.compose.runtime.internal.C22096n;
import com.avito.android.early_access.mvi.entity.EarlyAccessState;
import com.avito.conveyor_item.ParcelableItem;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: EarlyAccessScreen.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/m0;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/m0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class K extends kotlin.jvm.internal.N implements Y41.l<m0, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ EarlyAccessState.Content f145410l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.N f145411m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public K(EarlyAccessState.Content content, Y41.l<? super InterfaceC14538a, G0> lVar) {
        super(1);
        this.f145410l = content;
        this.f145411m = (kotlin.jvm.internal.N) lVar;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // Y41.l
    public final G0 invoke(m0 m0Var) {
        List<ParcelableItem> list = this.f145410l.f145476f;
        m0Var.a(list.size(), null, new I(G.f145405l, list), new C22096n(-632812321, new J(this.f145411m, list), true));
        return G0.f406611a;
    }
}
