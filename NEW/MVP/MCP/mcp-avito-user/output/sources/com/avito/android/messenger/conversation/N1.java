package com.avito.android.messenger.conversation;

import android.content.DialogInterface;
import com.avito.android.permissions.t;
import kotlin.Metadata;

/* compiled from: ChannelFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class N1 extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ChannelFragment f189123l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ DialogInterface f189124m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N1(ChannelFragment channelFragment, DialogInterface dialogInterface) {
        super(0);
        this.f189123l = channelFragment;
        this.f189124m = dialogInterface;
    }

    @Override // Y41.a
    public final kotlin.G0 invoke() {
        com.avito.android.permissions.x xVar = this.f189123l.f188969Y0;
        if (xVar == null) {
            xVar = null;
        }
        com.avito.android.permissions.t.f215141z.getClass();
        xVar.d(11, t.a.f215143b);
        this.f189124m.dismiss();
        return kotlin.G0.f406611a;
    }
}
