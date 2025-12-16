package com.avito.android.comfortable_deal.clients;

import androidx.compose.foundation.lazy.m0;
import androidx.compose.runtime.internal.C22096n;
import com.avito.android.comfortable_deal.common.view.client.ClientCardData;
import com.avito.android.comfortable_deal.paging.PagingState;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kp.InterfaceC43479e;

/* compiled from: ClientsScreen.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/m0;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/m0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class D extends kotlin.jvm.internal.N implements Y41.l<m0, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43479e.a f120109l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<ClientCardData, G0> f120110m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f120111n;

    /* compiled from: ClientsScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[PagingState.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PagingState pagingState = PagingState.f122408b;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public D(InterfaceC43479e.a aVar, Y41.l<? super ClientCardData, G0> lVar, Y41.a<G0> aVar2) {
        super(1);
        this.f120109l = aVar;
        this.f120110m = lVar;
        this.f120111n = aVar2;
    }

    @Override // Y41.l
    public final G0 invoke(m0 m0Var) {
        m0 m0Var2 = m0Var;
        l0.f120257a.getClass();
        m0Var2.c(null, null, l0.f120259c);
        InterfaceC43479e.a aVar = this.f120109l;
        List<ClientCardData> list = aVar.f413196a;
        C29449z c29449z = C29449z.f120476l;
        m0Var2.a(list.size(), c29449z != null ? new E(c29449z, list) : null, new F(A.f120088l, list), new C22096n(-632812321, new G(this.f120110m, list), true));
        int iOrdinal = aVar.f413197b.ordinal();
        if (iOrdinal == 1) {
            m0Var2.c(ChannelContext.Item.PLACEHOLDER, ChannelContext.Item.PLACEHOLDER, l0.f120260d);
        } else if (iOrdinal == 2) {
            m0Var2.c(null, null, new C22096n(-1197722347, new C(this.f120111n), true));
        }
        return G0.f406611a;
    }
}
