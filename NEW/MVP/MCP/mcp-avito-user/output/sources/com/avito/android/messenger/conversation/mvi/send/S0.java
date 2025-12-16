package com.avito.android.messenger.conversation.mvi.send;

import android.view.View;
import kotlin.Metadata;

/* compiled from: SendMessageView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class S0 extends kotlin.jvm.internal.N implements Y41.l<View, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Q0 f194404l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S0(Q0 q02) {
        super(1);
        this.f194404l = q02;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(View view) {
        com.jakewharton.rxrelay3.c cVar = this.f194404l.f194353F;
        kotlin.G0 g02 = kotlin.G0.f406611a;
        cVar.accept(g02);
        return g02;
    }
}
