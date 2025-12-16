package com.avito.android.messenger.conversation;

import android.content.Context;
import androidx.view.InterfaceC23040h0;
import com.avito.android.lib.design.modal.a;
import kotlin.Metadata;

/* compiled from: LiveDatas.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "onChanged", "(Ljava/lang/Object;)V", "com/avito/android/util/architecture_components/t", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class V0<T> implements InterfaceC23040h0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChannelFragment f189235b;

    public V0(ChannelFragment channelFragment) {
        this.f189235b = channelFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.view.InterfaceC23040h0
    public final void onChanged(T t12) {
        if (t12 != 0) {
            ChannelFragment channelFragment = this.f189235b;
            com.avito.android.permissions.x xVar = channelFragment.f188969Y0;
            if (xVar == null) {
                xVar = null;
            }
            boolean zB2 = xVar.b("android.permission.RECORD_AUDIO");
            Context context = channelFragment.getContext();
            if (zB2 || context == null) {
                return;
            }
            com.avito.android.permissions.G g12 = channelFragment.f188971Z0;
            if (g12 == null) {
                g12 = null;
            }
            g12.f();
            com.avito.android.permissions.G g13 = channelFragment.f188971Z0;
            if (g13 == null) {
                g13 = null;
            }
            boolean zM2 = g13.m();
            com.avito.android.permissions.x xVar2 = channelFragment.f188969Y0;
            com.avito.android.lib.util.g.a(a.C5284a.c(com.avito.android.lib.design.modal.a.f179704d, context, new L1(!(xVar2 != null ? xVar2 : null).a("android.permission.RECORD_AUDIO") && zM2, context, channelFragment)));
        }
    }
}
