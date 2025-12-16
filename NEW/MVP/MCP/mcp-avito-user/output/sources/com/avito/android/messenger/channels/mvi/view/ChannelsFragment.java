package com.avito.android.messenger.channels.mvi.view;

import Cd.C13243a;
import FY.a;
import Zd.InterfaceC19542a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.C30277e1;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.ChannelsScreen;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.app.task.InterfaceC28559h;
import com.avito.android.app.task.InterfaceC28580o;
import com.avito.android.app.task.MessengerBackgroundTask;
import com.avito.android.app.task.MessengerBlockingTask;
import com.avito.android.bottom_navigation.NavigationTab;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.bottom_navigation.ui.fragment.factory.NavigationState;
import com.avito.android.bottom_navigation.ui.fragment.g;
import com.avito.android.deep_linking.links.SupportChatFormLink;
import com.avito.android.deep_linking.links.WebViewLink;
import com.avito.android.deep_linking.links.WebViewLinkSettings;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.di.module.InterfaceC30106l7;
import com.avito.android.lib.design.input.ComponentType;
import com.avito.android.lib.design.input.Input;
import com.avito.android.messenger.InterfaceC32572u;
import com.avito.android.messenger.analytics.C31667x;
import com.avito.android.messenger.channels.ChannelsFragmentArguments;
import com.avito.android.messenger.channels.a;
import com.avito.android.messenger.channels.mvi.di.InterfaceC31741i;
import com.avito.android.messenger.channels.mvi.di.InterfaceC31742j;
import com.avito.android.messenger.channels.mvi.view.ChannelsFragment;
import com.avito.android.messenger.conversation.mvi.data.MessengerDbException;
import com.avito.android.messenger.di.o2;
import com.avito.android.messenger.map.viewing.PlatformMapActivity;
import com.avito.android.persistence.messenger.MessengerDatabase;
import com.avito.android.remote.model.messenger.geo.GeoMarker;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.ui.fragments.TabBaseFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35966w1;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.L5;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.internal.operators.completable.C41826q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import l41.InterfaceC43543a;
import md.InterfaceC44055a;
import oW.InterfaceC44697a;
import ru.avito.messenger.internal.entity.jsonrpc.MessengerJsonRpcCallException;
import ru.avito.messenger.internal.entity.jsonrpc.MessengerJsonRpcParsingException;
import z1.AbstractC50339a;

/* compiled from: ChannelsFragment.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00020\u00050\u00042\u00020\u00062\u00020\u00072\u00020\b:\u0002\u000b\fB\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/view/ChannelsFragment;", "Lcom/avito/android/ui/fragments/TabBaseFragment;", "Lcom/avito/android/bottom_navigation/ui/fragment/l;", "Lcom/avito/android/bottom_navigation/ui/fragment/g;", "Lmd/a;", "Lcom/avito/android/messenger/channels/mvi/di/i;", "Lcom/avito/android/messenger/channels/a$a;", "Lcom/avito/android/bottom_navigation/ui/fragment/g$a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "b", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"NonComposeScreen"})
/* loaded from: classes15.dex */
public final class ChannelsFragment extends TabBaseFragment implements com.avito.android.bottom_navigation.ui.fragment.l, com.avito.android.bottom_navigation.ui.fragment.g, InterfaceC44055a<InterfaceC31741i>, a.InterfaceC5481a, g.a, InterfaceC28477j.b {

    /* renamed from: S0, reason: collision with root package name */
    @Y61.k
    public static final a f188594S0 = new a(null);

    /* renamed from: A0, reason: collision with root package name */
    @Inject
    public InterfaceC35845m2 f188595A0;

    /* renamed from: B0, reason: collision with root package name */
    @Inject
    public InterfaceC19542a f188596B0;

    /* renamed from: C0, reason: collision with root package name */
    @Inject
    public com.avito.android.messenger.F f188597C0;

    /* renamed from: D0, reason: collision with root package name */
    @Inject
    public MessengerDatabase f188598D0;

    /* renamed from: E0, reason: collision with root package name */
    @Inject
    public InterfaceC31872a f188599E0;

    /* renamed from: F0, reason: collision with root package name */
    @Inject
    public InterfaceC32572u f188600F0;

    /* renamed from: G0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f188601G0;

    /* renamed from: H0, reason: collision with root package name */
    @Inject
    public JY.a f188602H0;

    /* renamed from: I0, reason: collision with root package name */
    @Y61.l
    public C31886o f188603I0;

    /* renamed from: J0, reason: collision with root package name */
    @Y61.l
    public Toolbar f188604J0;

    /* renamed from: K0, reason: collision with root package name */
    @Y61.l
    public View f188605K0;

    /* renamed from: L0, reason: collision with root package name */
    public com.avito.android.messenger.channels.b f188606L0;

    /* renamed from: M0, reason: collision with root package name */
    @Y61.k
    public final NavigationState f188607M0;

    /* renamed from: N0, reason: collision with root package name */
    public C31667x f188608N0;

    /* renamed from: O0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f188609O0;

    /* renamed from: P0, reason: collision with root package name */
    public InterfaceC31741i f188610P0;

    /* renamed from: Q0, reason: collision with root package name */
    @Y61.l
    public ChannelsListFragment f188611Q0;

    /* renamed from: R0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f188612R0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public InterfaceC28580o f188613t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f188614u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public com.avito.android.messenger.channels.filter.a f188615v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public C30277e1 f188616w0;

    /* renamed from: x0, reason: collision with root package name */
    @Inject
    public com.avito.android.messenger.channels.analytics.d f188617x0;

    /* renamed from: y0, reason: collision with root package name */
    @Inject
    public com.avito.android.messenger.channels.mvi.header_feature.N f188618y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.k
    public final O0 f188619z0;

    /* compiled from: ChannelsFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/view/ChannelsFragment$a;", "", "<init>", "()V", "", "KEY_ARGUMENTS", "Ljava/lang/String;", "TAG", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: ChannelsFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.messenger.channels.mvi.view.ChannelsFragment$a$a, reason: collision with other inner class name */
        public static final class C5557a extends kotlin.jvm.internal.N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ ChannelsFragmentArguments f188620l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5557a(ChannelsFragmentArguments channelsFragmentArguments) {
                super(1);
                this.f188620l = channelsFragmentArguments;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putParcelable("channels_fragment_arguments", this.f188620l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static ChannelsFragment a(@Y61.l ChannelsFragmentArguments channelsFragmentArguments) {
            ChannelsFragment channelsFragment = new ChannelsFragment();
            C35966w1.a(channelsFragment, -1, new C5557a(channelsFragmentArguments));
            return channelsFragment;
        }

        public a() {
        }
    }

    /* compiled from: ChannelsFragment.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/view/ChannelsFragment$b;", "", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static class b {
    }

    /* compiled from: ChannelsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/header_feature/M;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/messenger/channels/mvi/header_feature/M;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.a<com.avito.android.messenger.channels.mvi.header_feature.M> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.messenger.channels.mvi.header_feature.M invoke() {
            com.avito.android.messenger.channels.mvi.header_feature.N n12 = ChannelsFragment.this.f188618y0;
            if (n12 == null) {
                n12 = null;
            }
            return (com.avito.android.messenger.channels.mvi.header_feature.M) n12.get();
        }
    }

    /* compiled from: ChannelsFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/messenger/channels/ChannelsFragmentArguments;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends kotlin.jvm.internal.N implements Y41.a<ChannelsFragmentArguments> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final ChannelsFragmentArguments invoke() {
            Bundle arguments = ChannelsFragment.this.getArguments();
            if (arguments != null) {
                return (ChannelsFragmentArguments) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("channels_fragment_arguments", ChannelsFragmentArguments.class) : arguments.getParcelable("channels_fragment_arguments"));
            }
            return null;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends kotlin.jvm.internal.N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f188623l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.a aVar) {
            super(0);
            this.f188623l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f188623l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends kotlin.jvm.internal.N implements Y41.a<Fragment> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return ChannelsFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends kotlin.jvm.internal.N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ f f188625l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f fVar) {
            super(0);
            this.f188625l = fVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f188625l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends kotlin.jvm.internal.N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f188626l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f188626l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f188626l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends kotlin.jvm.internal.N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f188627l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f188627l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f188627l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    public ChannelsFragment() {
        super(0, 1, null);
        e eVar = new e(new c());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new g(new f()));
        this.f188619z0 = new O0(m0.f406844a.b(com.avito.android.messenger.channels.mvi.header_feature.M.class), new h(interfaceC42726CB), eVar, new i(interfaceC42726CB));
        this.f188607M0 = new NavigationState(false, new NavigationState.NavbarBusiness360.Show(false, false, 3, null), 1, null);
        this.f188609O0 = new io.reactivex.rxjava3.disposables.c();
        this.f188612R0 = C42727D.c(new d());
    }

    public static boolean D5(final ChannelsFragment channelsFragment, MenuItem menuItem) {
        final int i12 = 0;
        final int i13 = 1;
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            ActivityC22955m activityC22955mL1 = channelsFragment.l1();
            if (activityC22955mL1 == null) {
                return true;
            }
            activityC22955mL1.onBackPressed();
            return true;
        }
        if (itemId == R.id.menu_blacklist) {
            com.avito.android.messenger.channels.b bVar = channelsFragment.f188606L0;
            com.avito.android.messenger.channels.b bVar2 = bVar != null ? bVar : null;
            bVar2.f187142a.startActivity(bVar2.f187144c.a());
            return true;
        }
        if (itemId == R.id.menu_clear_database) {
            channelsFragment.f188609O0.b(new C41826q(new InterfaceC43543a(channelsFragment) { // from class: com.avito.android.messenger.channels.mvi.view.c

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ ChannelsFragment f188740c;

                {
                    this.f188740c = channelsFragment;
                }

                @Override // l41.InterfaceC43543a
                public final void run() {
                    ChannelsFragment channelsFragment2 = this.f188740c;
                    switch (i12) {
                        case 0:
                            MessengerDatabase messengerDatabase = channelsFragment2.f188598D0;
                            if (messengerDatabase == null) {
                                messengerDatabase = null;
                            }
                            messengerDatabase.d();
                            break;
                        default:
                            ChannelsFragment.a aVar = ChannelsFragment.f188594S0;
                            Context context = channelsFragment2.getContext();
                            if (context != null) {
                                L5.b(context, "Messenger database cleared", 0);
                                break;
                            }
                            break;
                    }
                }
            }).x(io.reactivex.rxjava3.schedulers.b.f404943c).q(io.reactivex.rxjava3.android.schedulers.b.b()).v(new InterfaceC43543a(channelsFragment) { // from class: com.avito.android.messenger.channels.mvi.view.c

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ ChannelsFragment f188740c;

                {
                    this.f188740c = channelsFragment;
                }

                @Override // l41.InterfaceC43543a
                public final void run() {
                    ChannelsFragment channelsFragment2 = this.f188740c;
                    switch (i13) {
                        case 0:
                            MessengerDatabase messengerDatabase = channelsFragment2.f188598D0;
                            if (messengerDatabase == null) {
                                messengerDatabase = null;
                            }
                            messengerDatabase.d();
                            break;
                        default:
                            ChannelsFragment.a aVar = ChannelsFragment.f188594S0;
                            Context context = channelsFragment2.getContext();
                            if (context != null) {
                                L5.b(context, "Messenger database cleared", 0);
                                break;
                            }
                            break;
                    }
                }
            }, io.reactivex.rxjava3.internal.functions.a.f401996f));
            return true;
        }
        if (itemId == R.id.menu_map) {
            Context context = channelsFragment.getContext();
            if (context == null) {
                return true;
            }
            PlatformMapActivity.a aVar = PlatformMapActivity.f196792m;
            List listE0 = C43066x.e0(C43066x.E0(C43066x.A0("\n                                    Адрес: 140090, Дзержинский г, Лесная ул, д.21\nТелефон: +7(499)391-56-22\nРежим работы: пн-вс:10.00-20.00\nТип оплаты: выдача заказов с оплатой по факту получения и предоплаченных\nОстановка: Профилакторий, Угрешская 30. Вход в Фотостудию со стороны улицы. Большая вывеска \"Фотостудия\" Жилой 12-ти этажный дом. 1 этаж. От остановки \"Профилакторий\" необходимо повернуть направо и пройти 50 метров до вывески \"Фотостудия\", главный вход. От остановки \"Угрешская 30\" необходимо перейти дорогу пройти 50 метров налево до вывески \"Фотостудия\".\n\nТелефон: +7(499)391-56-22\nРежим работы: пн-вс:10.00-20.00\nТип оплаты: выдача заказов с оплатой по факту получения и предоплаченных\nОстановка: Профилакторий, Угрешская 30. Вход в Фотостудию со стороны улицы. Большая вывеска \"Фотостудия\" Жилой 12-ти этажный дом. 1 этаж. От остановки \"Профилакторий\" необходимо повернуть направо и пройти 50 метров до вывески \"Фотостудия\", главный вход. От остановки \"Угрешская 30\" необходимо перейти дорогу пройти 50 метров налево до вывески \"Фотостудия\".\n\n                                ").toString()), new char[]{'\n'});
            ArrayList arrayList = new ArrayList(C42745f0.q(listE0, 10));
            Iterator it = listE0.iterator();
            while (it.hasNext()) {
                arrayList.add(new AttributedText((String) it.next(), C42784z0.f406748b, 0, 4, null));
            }
            GeoMarker geoMarker = new GeoMarker(55.7558d, 37.6173d, "Адрес №1 с очень длинным заголовком, который не помещается в шторку!", arrayList);
            List listE02 = C43066x.e0(C43066x.E0(C43066x.A0("\n                                    Адрес: 140090, Дзержинский г, Лесная ул, д.21\nТелефон: +7(499)391-56-22\nРежим работы: пн-вс:10.00-20.00\nТип оплаты: выдача заказов с оплатой по факту получения и предоплаченных\nОстановка: Профилакторий, Угрешская 30. Вход в Фотостудию со стороны улицы. Большая вывеска \"Фотостудия\" Жилой 12-ти этажный дом. 1 этаж.\n").toString()), new char[]{'\n'});
            ArrayList arrayList2 = new ArrayList(C42745f0.q(listE02, 10));
            Iterator it2 = listE02.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new AttributedText((String) it2.next(), C42784z0.f406748b, 0, 4, null));
            }
            GeoMarker geoMarker2 = new GeoMarker(55.78d, 37.64d, "Адрес №2", arrayList2);
            List listE03 = C43066x.e0(C43066x.E0(C43066x.A0("\n                                    Адрес: 140090, Дзержинский г, Лесная ул, д.21\nТелефон: +7(499)391-56-22\nРежим работы: пн-вс:10.00-20.00\nТип оплаты: выдача заказов с оплатой по факту получения и предоплаченных\nОстановка: Профилакторий, Угрешская 30. Вход в Фотостудию со стороны улицы. Большая вывеска \"Фотостудия\" Жилой 12-ти этажный дом. 1 этаж. От остановки \"Профилакторий\" необходимо повернуть направо и пройти 50 метров до вывески \"Фотостудия\", главный вход. От остановки \"Угрешская 30\" необходимо перейти дорогу пройти 50 метров налево до вывески \"Фотостудия\".\n\nТелефон: +7(499)391-56-22\nРежим работы: пн-вс:10.00-20.00\nТип оплаты: выдача заказов с оплатой по факту получения и предоплаченных\nОстановка: Профилакторий, Угрешская 30. Вход в Фотостудию со стороны улицы. Большая вывеска \"Фотостудия\" Жилой 12-ти этажный дом. 1 этаж. От остановки \"Профилакторий\" необходимо повернуть направо и пройти 50 метров до вывески \"Фотостудия\", главный вход. От остановки \"Угрешская 30\" необходимо перейти дорогу пройти 50 метров налево до вывески \"Фотостудия\".\n                                ").toString()), new char[]{'\n'});
            ArrayList arrayList3 = new ArrayList(C42745f0.q(listE03, 10));
            Iterator it3 = listE03.iterator();
            while (it3.hasNext()) {
                arrayList3.add(new AttributedText((String) it3.next(), C42784z0.f406748b, 0, 4, null));
            }
            GeoMarker[] geoMarkerArr = {geoMarker, geoMarker2, new GeoMarker(55.765d, 37.625d, null, arrayList3)};
            aVar.getClass();
            Intent intentA = PlatformMapActivity.a.a(context, "Platform Map Title", geoMarkerArr, null, false);
            ActivityC22955m activityC22955mL12 = channelsFragment.l1();
            if (activityC22955mL12 == null) {
                return true;
            }
            activityC22955mL12.startActivity(intentA);
            return true;
        }
        if (itemId == R.id.menu_error_tracking_test) {
            C31667x c31667x = channelsFragment.f188608N0;
            C31667x c31667x2 = c31667x != null ? c31667x : null;
            kotlin.random.f.f406882b.getClass();
            kotlin.random.f fVar = kotlin.random.f.f406883c;
            int iK2 = fVar.k(3);
            c31667x2.a(iK2 != 0 ? iK2 != 1 ? new MessengerDbException(fVar.b(), "test", null, 4, null) : new MessengerJsonRpcParsingException("test", null, null, null, null, 30, null) : new MessengerJsonRpcCallException(-1, "test", null, null, null, null, 60, null), "Test Event", Collections.singletonMap("test_extra", new GeoMarker(55.7558d, 37.6173d, "1", null)));
            return true;
        }
        if (itemId == R.id.menu_support_chat_form_test) {
            SupportChatFormLink supportChatFormLink = new SupportChatFormLink(123);
            com.avito.android.deeplink_handler.handler.composite.a aVar2 = channelsFragment.f188601G0;
            if (aVar2 == null) {
                aVar2 = null;
            }
            b.a.a(aVar2, supportChatFormLink, null, null, 6);
            return true;
        }
        if (itemId == R.id.menu_crashlytics_crash_test) {
            throw new RuntimeException();
        }
        if (itemId == R.id.menu_webview_auth_test_prod) {
            com.avito.android.deeplink_handler.handler.composite.a aVar3 = channelsFragment.f188601G0;
            if (aVar3 == null) {
                aVar3 = null;
            }
            b.a.a(aVar3, new WebViewLink.OnlyAvitoDomain(Uri.parse("https://www.avito.ru/profile"), new WebViewLinkSettings(false, true, false, false, false, null, null, false, false, false, false, 2045, null), null, 4, null), null, null, 6);
            return true;
        }
        if (itemId != R.id.menu_webview_auth_test_staging) {
            if (itemId == R.id.menu_filter) {
                return true;
            }
            return super.onOptionsItemSelected(menuItem);
        }
        com.avito.android.deeplink_handler.handler.composite.a aVar4 = channelsFragment.f188601G0;
        if (aVar4 == null) {
            aVar4 = null;
        }
        b.a.a(aVar4, new WebViewLink.OnlyAvitoDomain(Uri.parse("https://staging-www.k.avito.ru/profile"), new WebViewLinkSettings(false, true, false, false, false, null, null, false, false, false, false, 2045, null), null, 4, null), null, null, 6);
        return true;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.g.a
    public final void B4(@Y61.l ChannelsListFragment channelsListFragment) {
        this.f188611Q0 = channelsListFragment;
    }

    @Override // com.avito.android.messenger.channels.a.InterfaceC5481a
    @Y61.k
    public final com.avito.android.messenger.channels.a D1() {
        com.avito.android.messenger.channels.b bVar = this.f188606L0;
        if (bVar != null) {
            return bVar;
        }
        return null;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.g
    public final void K3() {
        ChannelsListFragment channelsListFragment = this.f188611Q0;
        if (channelsListFragment != null) {
            channelsListFragment.K3();
        }
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.l
    public final boolean b0(@Y61.k NavigationTabSetItem navigationTabSetItem) {
        return navigationTabSetItem == NavigationTab.f106973i;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(@Y61.k Context context) {
        super.onAttach(context);
        Resources resources = requireContext().getApplicationContext().getResources();
        InterfaceC31741i.a aVarA = com.avito.android.messenger.channels.mvi.di.C.a();
        aVarA.e((InterfaceC31742j) C29972i.a(C29972i.b(this), InterfaceC31742j.class));
        aVarA.l((InterfaceC30106l7) C29972i.a(C29972i.b(this), InterfaceC30106l7.class));
        aVarA.a(cv.c.b(this));
        aVarA.f((InterfaceC44697a) C29972i.a(C29972i.b(this), InterfaceC44697a.class));
        aVarA.g(new C28478k(ChannelsScreen.f90321d, com.avito.android.analytics.screens.s.c(this), null, 4, null));
        aVarA.c(o2.f196167a);
        aVarA.d(this);
        aVarA.b(resources);
        aVarA.h(this);
        InterfaceC31741i interfaceC31741iBuild = aVarA.build();
        this.f188610P0 = interfaceC31741iBuild;
        interfaceC31741iBuild.b(this);
        InterfaceC28580o interfaceC28580o = this.f188613t0;
        if (interfaceC28580o == null) {
            interfaceC28580o = null;
        }
        interfaceC28580o.c(MessengerBlockingTask.class, InterfaceC28559h.b.a.class);
        InterfaceC28580o interfaceC28580o2 = this.f188613t0;
        if (interfaceC28580o2 == null) {
            interfaceC28580o2 = null;
        }
        interfaceC28580o2.c(MessengerBackgroundTask.class, InterfaceC28559h.b.C2696b.class);
        V2.f318762a.i("ChannelsFragment", "init lazy VM " + ((com.avito.android.messenger.channels.mvi.header_feature.M) this.f188619z0.getValue()), null);
        InterfaceC28373a interfaceC28373a = this.f188614u0;
        if (interfaceC28373a == null) {
            interfaceC28373a = null;
        }
        C30277e1 c30277e1 = this.f188616w0;
        if (c30277e1 == null) {
            c30277e1 = null;
        }
        this.f188608N0 = new C31667x(interfaceC28373a, c30277e1);
        InterfaceC19542a interfaceC19542a = this.f188596B0;
        if (interfaceC19542a == null) {
            interfaceC19542a = null;
        }
        com.avito.android.messenger.F f12 = this.f188597C0;
        if (f12 == null) {
            f12 = null;
        }
        InterfaceC35845m2 interfaceC35845m2 = this.f188595A0;
        this.f188606L0 = new com.avito.android.messenger.channels.b(this, interfaceC19542a, f12, interfaceC35845m2 != null ? interfaceC35845m2 : null);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        com.avito.android.messenger.channels.analytics.d dVar = this.f188617x0;
        if (dVar == null) {
            dVar = null;
        }
        dVar.e();
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.messenger_channels, viewGroup, false);
        View viewFindViewById = viewGroup2.findViewById(R.id.navbar_offset);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(v5() ? 0 : 8);
        }
        View viewFindViewById2 = viewGroup2.findViewById(R.id.toolbar);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.Toolbar");
        }
        Toolbar toolbar = (Toolbar) viewFindViewById2;
        this.f188604J0 = toolbar;
        JY.a aVar = this.f188602H0;
        layoutInflater.inflate(!(aVar != null ? aVar : null).v() ? R.layout.messenger_channels_toolbar_content_tab_global : R.layout.messenger_channels_toolbar_content_tab, (ViewGroup) toolbar, true);
        View viewFindViewById3 = viewGroup2.findViewById(R.id.screen_title);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f188605K0 = viewFindViewById3;
        toolbar.setTitle(R.string.my_messages);
        View view = this.f188605K0;
        if (view instanceof Input) {
            ((Input) view).setComponentType(ComponentType.f179284e);
        } else if (view instanceof TextView) {
            ((TextView) view).setText(R.string.my_messages);
        }
        toolbar.setElevation(0.0f);
        toolbar.setOverflowIcon(C35835l0.h(R.attr.ic_more24, requireContext()));
        Drawable overflowIcon = toolbar.getOverflowIcon();
        if (overflowIcon != null) {
            overflowIcon.setTint(C35835l0.d(R.attr.black, requireContext()));
        }
        return viewGroup2;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f188603I0 = null;
        this.f188605K0 = null;
        this.f188604J0 = null;
        InterfaceC31872a interfaceC31872a = this.f188599E0;
        (interfaceC31872a != null ? interfaceC31872a : null).destroy();
        super.onDestroyView();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        InterfaceC32572u interfaceC32572u = this.f188600F0;
        if (interfaceC32572u == null) {
            interfaceC32572u = null;
        }
        interfaceC32572u.b("ChannelsFragment");
        super.onPause();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        InterfaceC32572u interfaceC32572u = this.f188600F0;
        if (interfaceC32572u == null) {
            interfaceC32572u = null;
        }
        interfaceC32572u.a("ChannelsFragment");
        JY.a aVar = this.f188602H0;
        if ((aVar != null ? aVar : null).a()) {
            ((com.avito.android.messenger.channels.mvi.header_feature.M) this.f188619z0.getValue()).accept(a.c.f4755a);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        View view;
        super.onStart();
        JY.a aVar = this.f188602H0;
        if (aVar == null) {
            aVar = null;
        }
        if (!aVar.v() || (view = this.f188605K0) == null) {
            return;
        }
        view.setOnClickListener(new ViewOnClickListenerC31873b(this, 0));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        com.avito.android.messenger.channels.analytics.d dVar = this.f188617x0;
        if (dVar == null) {
            dVar = null;
        }
        dVar.c();
        this.f188609O0.e();
        super.onStop();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        MenuItem menuItemFindItem;
        MenuInflater menuInflater;
        Toolbar toolbar = this.f188604J0;
        if (toolbar != null) {
            toolbar.m(R.menu.messenger_channels);
            C30277e1 c30277e1 = this.f188616w0;
            if (c30277e1 == null) {
                c30277e1 = null;
            }
            c30277e1.getClass();
            kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[16];
            if (((Boolean) c30277e1.f145035r.a().invoke()).booleanValue()) {
                Menu menu = toolbar.getMenu();
                SubMenu subMenuAddSubMenu = menu != null ? menu.addSubMenu(R.string.messenger_channels_debug_menu) : null;
                ActivityC22955m activityC22955mL1 = l1();
                if (activityC22955mL1 != null && (menuInflater = activityC22955mL1.getMenuInflater()) != null) {
                    menuInflater.inflate(R.menu.messenger_channels_debug, subMenuAddSubMenu);
                }
            }
            JY.a aVar = this.f188602H0;
            if (aVar == null) {
                aVar = null;
            }
            if (!aVar.s() && (menuItemFindItem = toolbar.getMenu().findItem(R.id.menu_blacklist)) != null) {
                menuItemFindItem.setVisible(false);
                menuItemFindItem.setEnabled(false);
            }
            com.avito.android.ui.d.b(toolbar, new com.avito.android.beduin.ui.screen.fragment.bottom_sheet.c(this, 25));
        }
        com.avito.android.deeplink_handler.handler.composite.a aVar2 = this.f188601G0;
        if (aVar2 == null) {
            aVar2 = null;
        }
        InterfaceC28373a interfaceC28373a = this.f188614u0;
        if (interfaceC28373a == null) {
            interfaceC28373a = null;
        }
        com.avito.android.messenger.channels.filter.a aVar3 = this.f188615v0;
        if (aVar3 == null) {
            aVar3 = null;
        }
        this.f188603I0 = new C31886o(view, aVar2, interfaceC28373a, aVar3);
        InterfaceC31872a interfaceC31872a = this.f188599E0;
        if (interfaceC31872a == null) {
            interfaceC31872a = null;
        }
        View viewFindViewById = view.findViewById(R.id.channels_content_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ViewGroup viewGroup = (ViewGroup) viewFindViewById;
        InterfaceC42726C interfaceC42726C = this.f188612R0;
        ChannelsFragmentArguments channelsFragmentArguments = (ChannelsFragmentArguments) interfaceC42726C.getValue();
        String str = channelsFragmentArguments != null ? channelsFragmentArguments.f186710b : null;
        ChannelsFragmentArguments channelsFragmentArguments2 = (ChannelsFragmentArguments) interfaceC42726C.getValue();
        interfaceC31872a.a(viewGroup, str, channelsFragmentArguments2 != null ? channelsFragmentArguments2.f186711c : null);
        com.avito.android.arch.mvi.android.f.a((com.avito.android.messenger.channels.mvi.header_feature.M) this.f188619z0.getValue(), getViewLifecycleOwner(), Lifecycle.State.f46682e, new C31875d(this), new C31877f(this));
        super.onViewCreated(view, bundle);
    }

    @Override // md.InterfaceC44055a
    public final InterfaceC31741i r0() {
        InterfaceC31741i interfaceC31741i = this.f188610P0;
        if (interfaceC31741i == null) {
            return null;
        }
        return interfaceC31741i;
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment
    @Y61.k
    /* renamed from: s5, reason: from getter */
    public final NavigationState getF107594z0() {
        return this.f188607M0;
    }
}
