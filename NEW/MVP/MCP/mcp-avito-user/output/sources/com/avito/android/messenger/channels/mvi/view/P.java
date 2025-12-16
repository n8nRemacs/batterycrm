package com.avito.android.messenger.channels.mvi.view;

import HY.e;
import android.view.View;
import com.avito.android.messenger.channels.adapter.ChannelsListItem;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ChannelsListView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class P extends kotlin.jvm.internal.N implements Y41.l<View, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.lib.design.bottom_sheet.o f188702l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ H f188703m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ e.a f188704n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(com.avito.android.lib.design.bottom_sheet.o oVar, H h12, e.a aVar) {
        super(1);
        this.f188702l = oVar;
        this.f188703m = h12;
        this.f188704n = aVar;
    }

    @Override // Y41.l
    public final G0 invoke(View view) {
        this.f188702l.r();
        Y41.l<? super ChannelsListItem.b, G0> lVar = this.f188703m.f188658F;
        if (lVar != null) {
            ((C31891u) lVar).invoke(this.f188704n.f7187a);
        }
        return G0.f406611a;
    }
}
