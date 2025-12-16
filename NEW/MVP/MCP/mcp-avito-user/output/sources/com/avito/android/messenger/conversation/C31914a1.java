package com.avito.android.messenger.conversation;

import androidx.view.InterfaceC23040h0;
import kotlin.Metadata;

/* compiled from: LiveDatas.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "onChanged", "(Ljava/lang/Object;)V", "com/avito/android/util/architecture_components/t", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.a1, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C31914a1<T> implements InterfaceC23040h0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChannelFragment f189253b;

    public C31914a1(ChannelFragment channelFragment) {
        this.f189253b = channelFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.view.InterfaceC23040h0
    public final void onChanged(T t12) {
        if (t12 != 0) {
            String str = (String) t12;
            ChannelFragment channelFragment = this.f189253b;
            com.avito.android.messenger.F f12 = channelFragment.f189008u0;
            if (f12 == null) {
                f12 = null;
            }
            channelFragment.startActivityForResult(f12.b(str), 4);
        }
    }
}
