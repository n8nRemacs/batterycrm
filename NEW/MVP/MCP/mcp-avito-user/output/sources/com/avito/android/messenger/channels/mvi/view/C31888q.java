package com.avito.android.messenger.channels.mvi.view;

import FY.a;
import GY.a;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.messenger.analytics.C31649e;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ChannelsHeaderView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/view/q;", "Lcom/avito/android/lib/design/chips/Chips$c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.channels.mvi.view.q, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C31888q implements Chips.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C31886o f188792a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y41.l<FY.a, G0> f188793b;

    /* JADX WARN: Multi-variable type inference failed */
    public C31888q(C31886o c31886o, Y41.l<? super FY.a, G0> lVar) {
        this.f188792a = c31886o;
        this.f188793b = lVar;
    }

    @Override // com.avito.android.lib.design.chips.Chips.c
    public final void b(@Y61.k com.avito.android.lib.design.chips.h hVar) {
        if (hVar instanceof GY.a) {
            GY.a aVar = (GY.a) hVar;
            boolean z12 = aVar instanceof a.C0355a;
            Y41.l<FY.a, G0> lVar = this.f188793b;
            C31886o c31886o = this.f188792a;
            if (z12) {
                c31886o.f188780e.a();
                ((C31876e) lVar).invoke(new a.b(false));
            } else if (aVar instanceof a.b) {
                c31886o.f188780e.c();
                c31886o.f188779d.c(new C31649e("top_page"));
                ((C31876e) lVar).invoke(new a.b(true));
            }
        }
    }

    @Override // com.avito.android.lib.design.chips.Chips.c
    public final void a(@Y61.k com.avito.android.lib.design.chips.h hVar) {
    }
}
