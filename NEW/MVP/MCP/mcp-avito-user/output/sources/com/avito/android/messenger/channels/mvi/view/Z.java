package com.avito.android.messenger.channels.mvi.view;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.avito.android.messenger.channels.mvi.view.ChannelsListFragment;
import com.avito.android.persistence.messenger.C33126v0;
import com.avito.android.util.C35966w1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ChannelsContentDelegate.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/view/Z;", "Lcom/avito/android/messenger/channels/mvi/view/a;", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class Z implements InterfaceC31872a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Fragment f188725b;

    /* compiled from: ChannelsContentDelegate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/view/Z$a;", "", "<init>", "()V", "", "CHANNELS_LIST_FRAGMENT_TAG", "Ljava/lang/String;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public Z(@Y61.k Fragment fragment) {
        this.f188725b = fragment;
    }

    @Override // com.avito.android.messenger.channels.mvi.view.InterfaceC31872a
    public final void a(@Y61.k ViewGroup viewGroup, @Y61.l String str, @Y61.l Boolean bool) {
        FragmentManager childFragmentManager = this.f188725b.getChildFragmentManager();
        com.avito.android.messenger.folders.e.f196349a.getClass();
        com.avito.android.messenger.folders.a aVar = com.avito.android.messenger.folders.e.f196350b;
        Fragment fragmentH = childFragmentManager.H("channels_list_fragment_tag");
        if (fragmentH == null) {
            ChannelsListFragment.a aVar2 = ChannelsListFragment.f188628A0;
            C33126v0 c33126v0 = aVar.f196345c;
            C33126v0 c33126v02 = aVar.f196347e;
            aVar2.getClass();
            fragmentH = new ChannelsListFragment();
            C35966w1.a(fragmentH, 8, new r(c33126v0, c33126v02, str, aVar.f196346d, bool));
        }
        if (fragmentH.isAdded()) {
            return;
        }
        androidx.fragment.app.H hE2 = childFragmentManager.e();
        hE2.n(viewGroup.getId(), fragmentH, "channels_list_fragment_tag");
        hE2.e();
    }

    @Override // com.avito.android.messenger.channels.mvi.view.InterfaceC31872a
    public final void destroy() {
    }
}
