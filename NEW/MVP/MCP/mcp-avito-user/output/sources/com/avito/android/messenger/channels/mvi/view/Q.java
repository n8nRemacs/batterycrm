package com.avito.android.messenger.channels.mvi.view;

import HY.e;
import android.view.View;
import com.avito.android.messenger.channels.adapter.ChannelsListItem;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ChannelsListView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class Q extends kotlin.jvm.internal.N implements Y41.l<View, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.lib.design.bottom_sheet.o f188705l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ H f188706m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ e.b f188707n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(com.avito.android.lib.design.bottom_sheet.o oVar, H h12, e.b bVar) {
        super(1);
        this.f188705l = oVar;
        this.f188706m = h12;
        this.f188707n = bVar;
    }

    @Override // Y41.l
    public final G0 invoke(View view) {
        this.f188705l.r();
        Y41.p<? super ChannelsListItem.b, ? super Boolean, G0> pVar = this.f188706m.f188659G;
        if (pVar != null) {
            ((C31892v) pVar).invoke(this.f188707n.f7188a, Boolean.TRUE);
        }
        return G0.f406611a;
    }
}
