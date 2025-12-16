package com.avito.android.virtual_deal_room_client_creation.clients;

import androidx.compose.foundation.lazy.m0;
import androidx.compose.runtime.internal.C22096n;
import com.avito.android.virtual_deal_room_client_creation.clients.model.PagingState;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ClientsScreen.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/m0;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/m0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class D extends N implements Y41.l<m0, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ NN0.c f326501l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<NN0.a, G0> f326502m;

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
                PagingState pagingState = PagingState.f326628b;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                PagingState pagingState2 = PagingState.f326628b;
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                PagingState pagingState3 = PagingState.f326628b;
                iArr[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                PagingState pagingState4 = PagingState.f326628b;
                iArr[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                PagingState pagingState5 = PagingState.f326628b;
                iArr[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                PagingState pagingState6 = PagingState.f326628b;
                iArr[5] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public D(NN0.c cVar, Y41.l<? super NN0.a, G0> lVar) {
        super(1);
        this.f326501l = cVar;
        this.f326502m = lVar;
    }

    @Override // Y41.l
    public final G0 invoke(m0 m0Var) {
        m0 m0Var2 = m0Var;
        NN0.c cVar = this.f326501l;
        boolean z12 = cVar.f11409g.f11415e;
        Y41.l<NN0.a, G0> lVar = this.f326502m;
        if (z12) {
            m0Var2.c(null, null, new C22096n(-27686985, new u(lVar), true));
        }
        NN0.d dVar = cVar.f11409g;
        List<PN0.a> list = dVar.f11412b;
        v vVar = v.f326683l;
        m0Var2.a(list.size(), vVar != null ? new F(vVar, list) : null, new G(E.f326503l, list), new C22096n(-632812321, new H(lVar, list), true));
        int iOrdinal = dVar.f11411a.ordinal();
        if (iOrdinal == 1) {
            L.f326513a.getClass();
            m0Var2.c(null, null, L.f326515c);
        } else if (iOrdinal == 2) {
            L.f326513a.getClass();
            m0Var2.c(null, null, L.f326516d);
        } else if (iOrdinal == 3) {
            m0Var2.c(null, null, new C22096n(-486389860, new y(lVar), true));
        } else if (iOrdinal == 4) {
            m0Var2.c(null, null, new C22096n(245785595, new A(lVar), true));
        } else if (iOrdinal == 6) {
            m0Var2.c(null, null, new C22096n(977961050, new C(lVar), true));
        }
        return G0.f406611a;
    }
}
