package com.avito.android.messenger.conversation;

import android.content.DialogInterface;
import kotlin.Metadata;

/* compiled from: ChannelFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class F1 extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ChannelFragment f189060l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ DialogInterface f189061m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F1(ChannelFragment channelFragment, DialogInterface dialogInterface) {
        super(0);
        this.f189060l = channelFragment;
        this.f189061m = dialogInterface;
    }

    @Override // Y41.a
    public final kotlin.G0 invoke() {
        com.avito.android.permissions.x xVar = this.f189060l.f188969Y0;
        if (xVar == null) {
            xVar = null;
        }
        xVar.d(15, "android.permission.CAMERA");
        this.f189061m.dismiss();
        return kotlin.G0.f406611a;
    }
}
