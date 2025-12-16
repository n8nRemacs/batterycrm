package com.avito.android.messenger.conversation;

import android.content.Context;
import com.avito.android.R;
import com.avito.android.util.L5;
import com.avito.android.util.V2;
import kotlin.Metadata;

/* compiled from: ChannelFragment.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/lang/Exception;", "Lkotlin/Exception;", "error", "Lkotlin/G0;", "invoke", "(Ljava/lang/Exception;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.w0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32358w0 extends kotlin.jvm.internal.N implements Y41.l<Exception, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ChannelFragment f195269l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32358w0(ChannelFragment channelFragment) {
        super(1);
        this.f195269l = channelFragment;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(Exception exc) {
        V2.f318762a.c("ChannelFragment", "Unable to start activity", exc);
        Context context = this.f195269l.getContext();
        if (context != null) {
            L5.a(context, R.string.no_application_installed_to_perform_this_action, 0);
        }
        return kotlin.G0.f406611a;
    }
}
