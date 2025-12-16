package com.avito.android.messenger.conversation.mvi.messages.composables;

import androidx.compose.foundation.lazy.m0;
import androidx.compose.runtime.internal.C22096n;
import com.avito.android.messenger.conversation.T1;
import com.avito.android.messenger.conversation.mvi.messages.g0;
import com.avito.android.messenger.conversation.mvi.messages.h0;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MessageList.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/m0;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/m0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class k extends N implements Y41.l<m0, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<T1> f192203l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g0.b f192204m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<h0, G0> f192205n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k(List<? extends T1> list, g0.b bVar, Y41.l<? super h0, G0> lVar) {
        super(1);
        this.f192203l = list;
        this.f192204m = bVar;
        this.f192205n = lVar;
    }

    @Override // Y41.l
    public final G0 invoke(m0 m0Var) {
        m0 m0Var2 = m0Var;
        List<T1> list = this.f192203l;
        if (!list.isEmpty()) {
            m0Var2.c(null, null, new C22096n(1188642616, new g(this.f192204m), true));
        }
        m0Var2.a(list.size(), new h(list), new i(list), new C22096n(-1019894646, new j(this.f192205n, list), true));
        return G0.f406611a;
    }
}
