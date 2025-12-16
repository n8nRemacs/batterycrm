package com.avito.android.messenger.conversation;

import android.content.Context;
import android.content.DialogInterface;
import com.avito.android.util.InterfaceC35845m2;
import kotlin.Metadata;

/* compiled from: ChannelFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class I1 extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Context f189101l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ChannelFragment f189102m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ DialogInterface f189103n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I1(Context context, ChannelFragment channelFragment, DialogInterface dialogInterface) {
        super(0);
        this.f189101l = context;
        this.f189102m = channelFragment;
        this.f189103n = dialogInterface;
    }

    @Override // Y41.a
    public final kotlin.G0 invoke() {
        InterfaceC35845m2 interfaceC35845m2 = this.f189102m.f189011x0;
        if (interfaceC35845m2 == null) {
            interfaceC35845m2 = null;
        }
        this.f189101l.startActivity(interfaceC35845m2.i());
        this.f189103n.dismiss();
        return kotlin.G0.f406611a;
    }
}
