package com.avito.android.messenger.channels.mvi.list_feature;

import HY.g;
import com.avito.android.messenger.channels.mvi.list_feature.C31772a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ChannelsListActor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LHY/a;", "action", "Lcom/avito/android/messenger/channels/mvi/list_feature/a$a;", "invoke", "(LHY/a;)Lcom/avito/android/messenger/channels/mvi/list_feature/a$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class M extends kotlin.jvm.internal.N implements Y41.l<HY.a, C31772a.InterfaceC5527a> {

    /* renamed from: l, reason: collision with root package name */
    public static final M f187773l = new M();

    public M() {
        super(1);
    }

    @Override // Y41.l
    public final C31772a.InterfaceC5527a invoke(HY.a aVar) {
        HY.a aVar2 = aVar;
        if (aVar2 instanceof HY.g) {
            HY.g gVar = (HY.g) aVar2;
            if (gVar instanceof g.b) {
                return C31772a.InterfaceC5527a.d.f187950a;
            }
            if (gVar instanceof g.a) {
                return C31772a.InterfaceC5527a.c.f187949a;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (aVar2 instanceof HY.c) {
            HY.c cVar = (HY.c) aVar2;
            return cVar instanceof HY.n ? C31772a.InterfaceC5527a.d.f187950a : cVar instanceof HY.k ? C31772a.InterfaceC5527a.c.f187949a : C31772a.InterfaceC5527a.b.f187948a;
        }
        if (aVar2 instanceof HY.d) {
            return C31772a.InterfaceC5527a.C5528a.f187947a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
