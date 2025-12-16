package com.avito.android.messenger.conversation;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Resources;
import androidx.fragment.app.ActivityC22955m;
import androidx.view.InterfaceC23040h0;
import com.avito.android.R;
import com.avito.android.util.L5;
import kotlin.Metadata;

/* compiled from: LiveDatas.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "onChanged", "(Ljava/lang/Object;)V", "com/avito/android/util/architecture_components/t", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class V<T> implements InterfaceC23040h0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChannelFragment f189234b;

    public V(ChannelFragment channelFragment) {
        this.f189234b = channelFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.view.InterfaceC23040h0
    public final void onChanged(T t12) throws Resources.NotFoundException {
        if (t12 != 0) {
            ClipData clipData = (ClipData) t12;
            ChannelFragment channelFragment = this.f189234b;
            ActivityC22955m activityC22955mL1 = channelFragment.l1();
            Object systemService = activityC22955mL1 != null ? activityC22955mL1.getSystemService("clipboard") : null;
            ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
            if (clipboardManager != null) {
                clipboardManager.setPrimaryClip(clipData);
            }
            String string = channelFragment.getResources().getString(R.string.text_is_copied);
            Context context = channelFragment.getContext();
            if (context != null) {
                L5.b(context, string, 0);
            }
        }
    }
}
