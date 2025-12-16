package com.avito.android.messenger.conversation.mvi.send;

import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: SendMessageView.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/tooltip/o;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/tooltip/o;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class a1 extends kotlin.jvm.internal.N implements Y41.l<com.avito.android.lib.design.tooltip.o, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Q0 f194474l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.lib.design.tooltip.k f194475m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(Q0 q02, com.avito.android.lib.design.tooltip.k kVar) {
        super(1);
        this.f194474l = q02;
        this.f194475m = kVar;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(com.avito.android.lib.design.tooltip.o oVar) {
        com.avito.android.lib.design.tooltip.o oVar2 = oVar;
        oVar2.b(this.f194474l.f194371d.getString(R.string.messenger_attach_file_tooltip_onboarding_text));
        oVar2.f(true);
        oVar2.e(new Z0(this.f194475m));
        return kotlin.G0.f406611a;
    }
}
