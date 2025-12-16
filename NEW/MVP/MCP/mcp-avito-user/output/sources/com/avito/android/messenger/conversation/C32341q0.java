package com.avito.android.messenger.conversation;

import android.net.Uri;
import androidx.view.InterfaceC23040h0;
import com.avito.android.util.C35966w1;
import com.avito.android.util.InterfaceC35845m2;
import kotlin.Metadata;

/* compiled from: LiveDatas.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "onChanged", "(Ljava/lang/Object;)V", "com/avito/android/util/architecture_components/t", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.q0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32341q0<T> implements InterfaceC23040h0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChannelFragment f195238b;

    public C32341q0(ChannelFragment channelFragment) {
        this.f195238b = channelFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.view.InterfaceC23040h0
    public final void onChanged(T t12) {
        if (t12 != 0) {
            Uri uri = (Uri) t12;
            ChannelFragment channelFragment = this.f195238b;
            InterfaceC35845m2 interfaceC35845m2 = channelFragment.f189011x0;
            if (interfaceC35845m2 == null) {
                interfaceC35845m2 = null;
            }
            C35966w1.g(channelFragment, interfaceC35845m2.u(uri, (6 & 2) == 0, (6 & 4) == 0), new C32358w0(channelFragment));
        }
    }
}
