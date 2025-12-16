package com.avito.android.messenger.conversation;

import Cd.C13243a;
import android.animation.Animator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.C22082i3;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.view.C22981N;
import androidx.view.C22984Q;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.P0;
import com.avito.android.B2;
import com.avito.android.C30277e1;
import com.avito.android.CalledFrom;
import com.avito.android.R;
import com.avito.android.ab_tests.configs.MessengerQuickRepliesWithTitleTestGroup;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.ChannelScreen;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.lib.design.modal.a;
import com.avito.android.messenger.InterfaceC32572u;
import com.avito.android.messenger.analytics.C31657m;
import com.avito.android.messenger.conversation.ChannelActivityArguments;
import com.avito.android.messenger.conversation.R1;
import com.avito.android.messenger.conversation.mvi.context.InterfaceC31987a;
import com.avito.android.messenger.conversation.mvi.context.d0;
import com.avito.android.messenger.conversation.mvi.in_app_calls.ChannelIacInteractor;
import com.avito.android.messenger.conversation.mvi.menu.t;
import com.avito.android.messenger.conversation.mvi.message_menu.l;
import com.avito.android.messenger.conversation.mvi.messages.g0;
import com.avito.android.messenger.conversation.mvi.messages.preview.parameter_providers.MessengerPreviewParameterProvider;
import com.avito.android.messenger.conversation.mvi.multi_message.m;
import com.avito.android.messenger.conversation.mvi.new_messages.k;
import com.avito.android.messenger.conversation.mvi.platform_actions.f;
import com.avito.android.messenger.conversation.mvi.quick_replies.d;
import com.avito.android.messenger.conversation.mvi.send.SendMessagePresenter;
import com.avito.android.messenger.di.InterfaceC32419a;
import com.avito.android.messenger.di.InterfaceC32428d;
import com.avito.android.messenger.di.n2;
import com.avito.android.messenger.di.o2;
import com.avito.android.mvi.e;
import com.avito.android.permissions.C33032b;
import com.avito.android.permissions.t;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.messenger.context_actions.PlatformActions;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.ui.fragments.TabBaseFragment;
import com.avito.android.util.C35967w2;
import com.avito.android.util.C35971x;
import com.avito.android.util.C35974x2;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.K2;
import com.avito.android.util.L5;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.operators.observable.C41982q1;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC42830m;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.sequences.C43033p;
import kotlinx.coroutines.C43259k;
import md.InterfaceC44055a;
import z1.AbstractC50339a;
import zn0.InterfaceC50594a;

/* compiled from: ChannelFragment.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/messenger/conversation/ChannelFragment;", "Lcom/avito/android/ui/fragments/TabBaseFragment;", "Lcom/avito/android/messenger/conversation/Z1;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"NonComposeScreen"})
/* loaded from: classes15.dex */
public final class ChannelFragment extends TabBaseFragment implements Z1, InterfaceC28477j.b {

    /* renamed from: o3, reason: collision with root package name */
    @Y61.k
    public static final a f188932o3 = new a(null);

    /* renamed from: A0, reason: collision with root package name */
    @Inject
    public B2 f188933A0;

    /* renamed from: B0, reason: collision with root package name */
    @Inject
    public com.avito.android.messenger.conversation.mvi.channel_feature.o f188934B0;

    /* renamed from: C0, reason: collision with root package name */
    @Y61.k
    public final androidx.view.O0 f188935C0;

    /* renamed from: D0, reason: collision with root package name */
    @Inject
    public h31.e<com.avito.android.messenger.conversation.mvi.platform_actions.f> f188936D0;

    /* renamed from: E0, reason: collision with root package name */
    @Inject
    @TY.a
    public com.avito.konveyor.adapter.h f188937E0;

    /* renamed from: F0, reason: collision with root package name */
    @Inject
    @TY.a
    public com.avito.konveyor.a f188938F0;

    /* renamed from: G0, reason: collision with root package name */
    @Inject
    public SendMessagePresenter f188939G0;

    /* renamed from: H0, reason: collision with root package name */
    @Inject
    public com.avito.android.messenger.conversation.mvi.context.V f188940H0;

    /* renamed from: H1, reason: collision with root package name */
    public com.avito.android.messenger.conversation.mvi.platform_actions.buttons.c f188941H1;

    /* renamed from: H2, reason: collision with root package name */
    public com.avito.android.messenger.conversation.mvi.send.Q0 f188942H2;

    /* renamed from: I0, reason: collision with root package name */
    @Inject
    public com.avito.android.photo_download.feature.mvi.k f188943I0;

    /* renamed from: J0, reason: collision with root package name */
    @Y61.k
    public final androidx.view.O0 f188944J0;

    /* renamed from: K0, reason: collision with root package name */
    @Inject
    public com.avito.android.messenger.conversation.mvi.menu.l f188945K0;

    /* renamed from: L0, reason: collision with root package name */
    @Inject
    public com.avito.android.messenger.conversation.mvi.in_app_calls.h f188946L0;

    /* renamed from: M0, reason: collision with root package name */
    @Inject
    public com.avito.android.messenger.conversation.mvi.message_suggests.s f188947M0;

    /* renamed from: N0, reason: collision with root package name */
    @Inject
    public h31.e<com.avito.android.messenger.conversation.mvi.message_scrollable_suggests.g> f188948N0;

    /* renamed from: O0, reason: collision with root package name */
    @Inject
    public com.avito.android.messenger.conversation.mvi.message_menu.l f188949O0;

    /* renamed from: P0, reason: collision with root package name */
    @Inject
    public com.avito.android.messenger.conversation.mvi.message_menu.i f188950P0;

    /* renamed from: P2, reason: collision with root package name */
    public com.avito.android.messenger.conversation.mvi.context.f0 f188951P2;

    /* renamed from: Q0, reason: collision with root package name */
    @Inject
    public com.avito.android.messenger.conversation.mvi.new_messages.a f188952Q0;

    /* renamed from: Q2, reason: collision with root package name */
    public com.avito.android.messenger.conversation.mvi.menu.u f188953Q2;

    /* renamed from: R0, reason: collision with root package name */
    @Inject
    public com.avito.android.messenger.conversation.mvi.voice.Q f188954R0;

    /* renamed from: R2, reason: collision with root package name */
    public com.avito.android.messenger.conversation.mvi.message_suggests.H f188955R2;

    /* renamed from: S0, reason: collision with root package name */
    @Inject
    @n2
    public com.avito.konveyor.adapter.a f188956S0;

    /* renamed from: S2, reason: collision with root package name */
    public com.avito.android.messenger.conversation.mvi.message_scrollable_suggests.o f188957S2;

    /* renamed from: T0, reason: collision with root package name */
    @Inject
    @n2
    public com.avito.konveyor.a f188958T0;

    /* renamed from: T2, reason: collision with root package name */
    public com.avito.android.messenger.conversation.mvi.message_menu.t f188959T2;

    /* renamed from: U0, reason: collision with root package name */
    @Inject
    public com.avito.android.messenger.conversation.mvi.quick_replies.d f188960U0;

    /* renamed from: U2, reason: collision with root package name */
    public com.avito.android.messenger.conversation.mvi.quick_replies.r f188961U2;

    /* renamed from: V0, reason: collision with root package name */
    @Inject
    public com.avito.android.connection_quality.connectivity.a f188962V0;

    /* renamed from: V2, reason: collision with root package name */
    public com.avito.android.messenger.conversation.mvi.multi_message.i f188963V2;

    /* renamed from: W0, reason: collision with root package name */
    @Inject
    public com.avito.android.util.C f188964W0;

    /* renamed from: W2, reason: collision with root package name */
    public String f188965W2;

    /* renamed from: X0, reason: collision with root package name */
    @Inject
    public com.avito.android.messenger.conversation.analytics.b f188966X0;

    /* renamed from: X1, reason: collision with root package name */
    public com.avito.android.messenger.conversation.mvi.platform_actions.items_list.b f188967X1;

    /* renamed from: X2, reason: collision with root package name */
    @Y61.l
    public String f188968X2;

    /* renamed from: Y0, reason: collision with root package name */
    @Inject
    public com.avito.android.permissions.x f188969Y0;

    /* renamed from: Y2, reason: collision with root package name */
    @Y61.l
    public String f188970Y2;

    /* renamed from: Z0, reason: collision with root package name */
    @Inject
    public com.avito.android.permissions.G f188971Z0;

    /* renamed from: Z2, reason: collision with root package name */
    @Y61.l
    public Integer f188972Z2;

    /* renamed from: a1, reason: collision with root package name */
    @Inject
    public InterfaceC32572u f188973a1;

    /* renamed from: a3, reason: collision with root package name */
    @Y61.l
    public CalledFrom f188974a3;

    /* renamed from: b1, reason: collision with root package name */
    @Inject
    public com.avito.android.messenger.notification.e f188975b1;

    /* renamed from: b3, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.y f188976b3;

    /* renamed from: c1, reason: collision with root package name */
    @Inject
    public com.avito.android.messenger.conversation.mvi.messages.utils.p f188977c1;

    /* renamed from: c3, reason: collision with root package name */
    @Y61.l
    public Y1 f188978c3;

    /* renamed from: d1, reason: collision with root package name */
    @Inject
    public com.avito.android.messenger.conversation.mvi.messages.utils.d f188979d1;

    /* renamed from: d3, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f188980d3;

    /* renamed from: e1, reason: collision with root package name */
    @Inject
    public u3.g<MessengerQuickRepliesWithTitleTestGroup> f188981e1;

    /* renamed from: e3, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f188982e3;

    /* renamed from: f1, reason: collision with root package name */
    @Inject
    public com.avito.android.messenger.conversation.uxf.a f188983f1;

    /* renamed from: f3, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f188984f3;

    /* renamed from: g1, reason: collision with root package name */
    @Inject
    public ChannelIacInteractor f188985g1;

    /* renamed from: g3, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.b<Boolean> f188986g3;

    /* renamed from: h1, reason: collision with root package name */
    @Inject
    public com.avito.android.util.R0 f188987h1;

    /* renamed from: h3, reason: collision with root package name */
    public boolean f188988h3;

    /* renamed from: i1, reason: collision with root package name */
    @Inject
    public com.avito.android.deep_linking.x f188989i1;

    /* renamed from: i3, reason: collision with root package name */
    @Y61.l
    public kotlin.jvm.internal.N f188990i3;

    /* renamed from: j1, reason: collision with root package name */
    @Inject
    public com.avito.android.util.text.a f188991j1;

    /* renamed from: j3, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.modal.a f188992j3;

    /* renamed from: k1, reason: collision with root package name */
    @Inject
    public com.avito.android.messenger.conversation.mvi.multi_message.m f188993k1;

    /* renamed from: k3, reason: collision with root package name */
    @Y61.l
    public SendMessagePresenter.RecordingVideoFileReference f188994k3;

    /* renamed from: l1, reason: collision with root package name */
    @Inject
    public com.avito.android.messenger.conversation.mvi.common.a f188995l1;

    /* renamed from: l3, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.b<g0.c> f188996l3;

    /* renamed from: m1, reason: collision with root package name */
    @Inject
    public u3.g<SimpleTestGroupWithNone> f188997m1;

    /* renamed from: m3, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<kotlin.Q<T1, T1>> f188998m3;

    /* renamed from: n1, reason: collision with root package name */
    @Inject
    public JY.a f188999n1;

    /* renamed from: n3, reason: collision with root package name */
    @Y61.k
    public String f189000n3;

    /* renamed from: o1, reason: collision with root package name */
    public com.avito.android.messenger.conversation.mvi.messages.q0 f189001o1;

    /* renamed from: p1, reason: collision with root package name */
    public com.avito.android.messenger.conversation.mvi.new_messages.m f189002p1;

    /* renamed from: q1, reason: collision with root package name */
    public com.avito.android.messenger.conversation.mvi.platform_actions.z f189003q1;

    /* renamed from: r1, reason: collision with root package name */
    public com.avito.android.messenger.conversation.mvi.platform_actions.buttons.s f189004r1;

    /* renamed from: s1, reason: collision with root package name */
    public com.avito.android.messenger.conversation.mvi.platform_actions.buttons.c f189005s1;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f189006t0;

    /* renamed from: t1, reason: collision with root package name */
    public com.avito.android.messenger.conversation.mvi.platform_actions.buttons.m f189007t1;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public com.avito.android.messenger.F f189008u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public InterfaceC50594a f189009v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public com.avito.android.webview.l f189010w0;

    /* renamed from: x0, reason: collision with root package name */
    @Inject
    public InterfaceC35845m2 f189011x0;

    /* renamed from: y0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f189012y0;

    /* renamed from: z0, reason: collision with root package name */
    @Inject
    public C30277e1 f189013z0;

    /* compiled from: ChannelFragment.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/ChannelFragment$a;", "", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ChannelFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/channel_feature/n;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/messenger/conversation/mvi/channel_feature/n;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<com.avito.android.messenger.conversation.mvi.channel_feature.n> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.messenger.conversation.mvi.channel_feature.n invoke() {
            com.avito.android.messenger.conversation.mvi.channel_feature.o oVar = ChannelFragment.this.f188934B0;
            if (oVar == null) {
                oVar = null;
            }
            return (com.avito.android.messenger.conversation.mvi.channel_feature.n) oVar.get();
        }
    }

    /* compiled from: ChannelFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Lcom/avito/android/messenger/conversation/T1;", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.a<List<? extends T1>> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f189015l = new c();

        public c() {
            super(0);
        }

        @Override // Y41.a
        public final List<? extends T1> invoke() {
            return C43033p.D(C43033p.r(new com.avito.android.messenger.conversation.mvi.messages.preview.parameter_providers.a(MessengerPreviewParameterProvider.PreviewConfig.f193054b).a()));
        }
    }

    /* compiled from: ChannelFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Lcom/avito/android/messenger/conversation/T1;", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends kotlin.jvm.internal.N implements Y41.a<List<? extends T1>> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f189016l = new d();

        public d() {
            super(0);
        }

        @Override // Y41.a
        public final List<? extends T1> invoke() {
            return C43033p.D(C43033p.r(new com.avito.android.messenger.conversation.mvi.messages.preview.parameter_providers.a(MessengerPreviewParameterProvider.PreviewConfig.f193056d).a()));
        }
    }

    /* compiled from: ChannelFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e extends kotlin.jvm.internal.H implements Y41.l<Integer, Boolean> {
        @Override // Y41.l
        public final Boolean invoke(Integer num) {
            return Boolean.valueOf(((com.avito.android.messenger.conversation.mvi.messages.g0) this.receiver).a(num.intValue()));
        }
    }

    /* compiled from: ChannelFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/photo_download/feature/mvi/j;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/photo_download/feature/mvi/j;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends kotlin.jvm.internal.N implements Y41.a<com.avito.android.photo_download.feature.mvi.j> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.photo_download.feature.mvi.j invoke() {
            com.avito.android.photo_download.feature.mvi.k kVar = ChannelFragment.this.f188943I0;
            if (kVar == null) {
                kVar = null;
            }
            return (com.avito.android.photo_download.feature.mvi.j) kVar.get();
        }
    }

    /* compiled from: ChannelFragment.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/design/modal/a$b;", "Landroid/content/DialogInterface;", "dialog", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/modal/a$b;Landroid/content/DialogInterface;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends kotlin.jvm.internal.N implements Y41.p<a.b, DialogInterface, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ boolean f189018l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Context f189019m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ ChannelFragment f189020n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(boolean z12, Context context, ChannelFragment channelFragment) {
            super(2);
            this.f189018l = z12;
            this.f189019m = context;
            this.f189020n = channelFragment;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(a.b bVar, DialogInterface dialogInterface) {
            a.b bVar2 = bVar;
            DialogInterface dialogInterface2 = dialogInterface;
            bVar2.setTitle(R.string.messenger_file_download_permission_dialog_title);
            bVar2.setSubtitle(R.string.messenger_file_download_permission_dialog_subtitle);
            bVar2.setButtonsOrientation(1);
            boolean z12 = this.f189018l;
            ChannelFragment channelFragment = this.f189020n;
            if (z12) {
                bVar2.O3(R.string.messenger_file_download_permission_dialog_settings_button, new M1(this.f189019m, channelFragment, dialogInterface2));
            } else {
                bVar2.O3(R.string.messenger_file_download_permission_dialog_grant_button, new N1(channelFragment, dialogInterface2));
            }
            bVar2.T3(R.string.messenger_file_download_permission_dialog_deny_button, new O1(dialogInterface2));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends kotlin.jvm.internal.N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f189021l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f189021l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            androidx.view.T0 t02 = (androidx.view.T0) this.f189021l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends kotlin.jvm.internal.N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f189022l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Y41.a aVar) {
            super(0);
            this.f189022l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f189022l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends kotlin.jvm.internal.N implements Y41.a<Fragment> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return ChannelFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends kotlin.jvm.internal.N implements Y41.a<androidx.view.T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ j f189024l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(j jVar) {
            super(0);
            this.f189024l = jVar;
        }

        @Override // Y41.a
        public final androidx.view.T0 invoke() {
            return (androidx.view.T0) this.f189024l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends kotlin.jvm.internal.N implements Y41.a<androidx.view.S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f189025l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f189025l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final androidx.view.S0 invoke() {
            return ((androidx.view.T0) this.f189025l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends kotlin.jvm.internal.N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f189026l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f189026l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            androidx.view.T0 t02 = (androidx.view.T0) this.f189026l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends kotlin.jvm.internal.N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f189027l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Y41.a aVar) {
            super(0);
            this.f189027l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f189027l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class o extends kotlin.jvm.internal.N implements Y41.a<Fragment> {
        public o() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return ChannelFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class p extends kotlin.jvm.internal.N implements Y41.a<androidx.view.T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ o f189029l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(o oVar) {
            super(0);
            this.f189029l = oVar;
        }

        @Override // Y41.a
        public final androidx.view.T0 invoke() {
            return (androidx.view.T0) this.f189029l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class q extends kotlin.jvm.internal.N implements Y41.a<androidx.view.S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f189030l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f189030l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final androidx.view.S0 invoke() {
            return ((androidx.view.T0) this.f189030l.getValue()).getF42820b();
        }
    }

    public ChannelFragment() {
        super(0, 1, null);
        i iVar = new i(new b());
        j jVar = new j();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406616d;
        InterfaceC42726C interfaceC42726CB = C42727D.b(lazyThreadSafetyMode, new k(jVar));
        kotlin.jvm.internal.n0 n0Var = kotlin.jvm.internal.m0.f406844a;
        this.f188935C0 = new androidx.view.O0(n0Var.b(com.avito.android.messenger.conversation.mvi.channel_feature.n.class), new l(interfaceC42726CB), iVar, new m(interfaceC42726CB));
        n nVar = new n(new f());
        InterfaceC42726C interfaceC42726CB2 = C42727D.b(lazyThreadSafetyMode, new p(new o()));
        this.f188944J0 = new androidx.view.O0(n0Var.b(com.avito.android.photo_download.feature.mvi.j.class), new q(interfaceC42726CB2), nVar, new h(interfaceC42726CB2));
        this.f188980d3 = new io.reactivex.rxjava3.disposables.c();
        this.f188982e3 = new io.reactivex.rxjava3.disposables.c();
        this.f188984f3 = new io.reactivex.rxjava3.disposables.c();
        this.f188986g3 = com.jakewharton.rxrelay3.b.N0(Boolean.FALSE);
        this.f188996l3 = new com.jakewharton.rxrelay3.b<>();
        this.f188998m3 = new com.jakewharton.rxrelay3.c<>();
        this.f189000n3 = "";
    }

    public final com.avito.android.messenger.conversation.mvi.channel_feature.n D5() {
        return (com.avito.android.messenger.conversation.mvi.channel_feature.n) this.f188935C0.getValue();
    }

    public final void E5(@Y61.k String str) {
        Context context = getContext();
        if (context == null) {
            return;
        }
        Uri uri = Uri.parse(str);
        InterfaceC35845m2 interfaceC35845m2 = this.f189011x0;
        if (interfaceC35845m2 == null) {
            interfaceC35845m2 = null;
        }
        Intent intentU = interfaceC35845m2.u(uri, (6 & 2) == 0, (6 & 4) == 0);
        intentU.putExtra("com.android.browser.application_id", context.getPackageName());
        C35974x2.d(intentU);
        try {
            context.startActivity(intentU);
        } catch (Exception unused) {
            Context context2 = getContext();
            if (context2 != null) {
                L5.a(context2, R.string.no_application_installed_to_perform_this_action, 0);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void F5(Y41.a<kotlin.G0> aVar) {
        com.avito.android.permissions.x xVar = this.f188969Y0;
        if (xVar == null) {
            xVar = null;
        }
        com.avito.android.permissions.t.f215141z.getClass();
        String str = t.a.f215143b;
        boolean zB2 = xVar.b(str);
        Context context = getContext();
        if (zB2 || context == null) {
            return;
        }
        this.f188990i3 = (kotlin.jvm.internal.N) aVar;
        com.avito.android.permissions.G g12 = this.f188971Z0;
        if (g12 == null) {
            g12 = null;
        }
        g12.c();
        com.avito.android.permissions.G g13 = this.f188971Z0;
        if (g13 == null) {
            g13 = null;
        }
        boolean zG2 = g13.g();
        com.avito.android.permissions.x xVar2 = this.f188969Y0;
        com.avito.android.lib.util.g.a(a.C5284a.c(com.avito.android.lib.design.modal.a.f179704d, context, new g(!(xVar2 != null ? xVar2 : null).a(str) && zG2, context, this)));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    /* renamed from: h5 */
    public final boolean getF304598h0() {
        C30277e1 c30277e1 = this.f189013z0;
        if (c30277e1 == null) {
            c30277e1 = null;
        }
        c30277e1.getClass();
        kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[91];
        return !((Boolean) c30277e1.f144970L0.a().invoke()).booleanValue();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    @InterfaceC42830m
    public final void onActivityResult(int i12, int i13, @Y61.l Intent intent) {
        Context context;
        SendMessagePresenter.RecordingVideoFileReference recordingVideoFileReference;
        super.onActivityResult(i12, i13, intent);
        if (i13 != -1) {
            if (i12 != 7 || (context = getContext()) == null) {
                return;
            }
            L5.a(context, R.string.something_went_wrong, 0);
            return;
        }
        if (i12 == 4) {
            String stringExtra = intent != null ? intent.getStringExtra("operation_id") : null;
            if (stringExtra != null) {
                SendMessagePresenter sendMessagePresenter = this.f188939G0;
                (sendMessagePresenter != null ? sendMessagePresenter : null).Hs(stringExtra);
                return;
            }
            return;
        }
        if (i12 == 8) {
            MessageBody.Location location = intent != null ? (MessageBody.Location) intent.getParcelableExtra("shared_location") : null;
            if (location != null) {
                SendMessagePresenter sendMessagePresenter2 = this.f188939G0;
                (sendMessagePresenter2 != null ? sendMessagePresenter2 : null).gv(location);
                return;
            }
            return;
        }
        if (i12 == 9) {
            Uri data = intent != null ? intent.getData() : null;
            Context context2 = getContext();
            if (data == null || context2 == null) {
                return;
            }
            context2.getContentResolver().takePersistableUriPermission(data, 1);
            SendMessagePresenter sendMessagePresenter3 = this.f188939G0;
            (sendMessagePresenter3 != null ? sendMessagePresenter3 : null).C70(data);
            return;
        }
        if (i12 != 13) {
            if (i12 == 14 && (recordingVideoFileReference = this.f188994k3) != null) {
                SendMessagePresenter sendMessagePresenter4 = this.f188939G0;
                if (sendMessagePresenter4 == null) {
                    sendMessagePresenter4 = null;
                }
                sendMessagePresenter4.Zy(recordingVideoFileReference.f194410b, recordingVideoFileReference.f194411c);
                this.f188994k3 = null;
                return;
            }
            return;
        }
        Uri data2 = intent != null ? intent.getData() : null;
        Context context3 = getContext();
        if (data2 == null || context3 == null) {
            return;
        }
        context3.getContentResolver().takePersistableUriPermission(data2, 1);
        SendMessagePresenter sendMessagePresenter5 = this.f188939G0;
        (sendMessagePresenter5 != null ? sendMessagePresenter5 : null).P60(data2);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(@Y61.k Context context) {
        super.onAttach(context);
        this.f188978c3 = (Y1) getParentFragment();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00df  */
    @Override // androidx.fragment.app.Fragment
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(@Y61.k android.view.LayoutInflater r19, @Y61.l android.view.ViewGroup r20, @Y61.l android.os.Bundle r21) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.conversation.ChannelFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        com.avito.android.messenger.conversation.uxf.a aVar = this.f188983f1;
        if (aVar == null) {
            aVar = null;
        }
        aVar.a(C22981N.a(getLifecycle()));
        com.avito.android.messenger.conversation.mvi.send.Q0 q02 = this.f188942H2;
        if (q02 == null) {
            q02 = null;
        }
        q02.f194364Q.e();
        q02.f194375h.getClass();
        ((Animator) q02.f194381n.getValue()).cancel();
        com.avito.android.lib.design.toast_bar.k kVar = q02.f194366S;
        if (kVar != null) {
            kVar.f();
        }
        q02.f194366S = null;
        com.avito.android.messenger.conversation.mvi.messages.q0 q0Var = this.f189001o1;
        if (q0Var == null) {
            q0Var = null;
        }
        q0Var.f193114l.h(null);
        io.reactivex.rxjava3.internal.observers.y yVar = this.f188976b3;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        com.avito.android.messenger.conversation.mvi.menu.u uVar = this.f188953Q2;
        if (uVar == null) {
            uVar = null;
        }
        com.avito.android.util.N0.a(uVar.f191543k);
        com.avito.android.messenger.conversation.mvi.platform_actions.z zVar = this.f189003q1;
        if (zVar == null) {
            zVar = null;
        }
        zVar.f194071r.e();
        com.avito.android.messenger.conversation.mvi.context.f0 f0Var = this.f188951P2;
        if (f0Var == null) {
            f0Var = null;
        }
        f0Var.f190375f.ea();
        this.f188982e3.e();
        Lifecycle lifecycle = getViewLifecycleOwner().getLifecycle();
        com.avito.android.messenger.conversation.mvi.voice.Q q12 = this.f188954R0;
        if (q12 == null) {
            q12 = null;
        }
        lifecycle.c(q12);
        com.avito.android.messenger.conversation.mvi.common.a aVar2 = this.f188995l1;
        (aVar2 != null ? aVar2 : null).destroy();
        super.onDestroyView();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onDetach() {
        this.f188978c3 = null;
        super.onDetach();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        com.avito.android.messenger.notification.e eVar = this.f188975b1;
        if (eVar == null) {
            eVar = null;
        }
        eVar.a(null);
        InterfaceC32572u interfaceC32572u = this.f188973a1;
        (interfaceC32572u != null ? interfaceC32572u : null).b("ChannelFragment");
        super.onPause();
    }

    /* JADX WARN: Type inference failed for: r5v10, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // androidx.fragment.app.Fragment
    @InterfaceC42830m
    public final void onRequestPermissionsResult(int i12, @Y61.k String[] strArr, @Y61.k int[] iArr) {
        if (i12 == 11) {
            com.avito.android.permissions.x xVar = this.f188969Y0;
            if (xVar == null) {
                xVar = null;
            }
            com.avito.android.permissions.t.f215141z.getClass();
            String str = t.a.f215143b;
            if (xVar.c(strArr, iArr, str)) {
                ?? r52 = this.f188990i3;
                if (r52 != 0) {
                    r52.invoke();
                }
                this.f188990i3 = null;
                return;
            }
            Context context = getContext();
            if (context != null) {
                L5.a(context, R.string.messenger_file_download_permission_required, 0);
            }
            com.avito.android.permissions.x xVar2 = this.f188969Y0;
            if (xVar2 == null) {
                xVar2 = null;
            }
            if (xVar2.a(str)) {
                return;
            }
            com.avito.android.permissions.G g12 = this.f188971Z0;
            (g12 != null ? g12 : null).e(true);
            return;
        }
        if (i12 == 12) {
            com.avito.android.permissions.x xVar3 = this.f188969Y0;
            if (xVar3 == null) {
                xVar3 = null;
            }
            if (xVar3.c(strArr, iArr, "android.permission.RECORD_AUDIO")) {
                return;
            }
            Context context2 = getContext();
            if (context2 != null) {
                L5.a(context2, R.string.messenger_mic_permission_required, 0);
            }
            com.avito.android.permissions.x xVar4 = this.f188969Y0;
            if (xVar4 == null) {
                xVar4 = null;
            }
            if (xVar4.a("android.permission.RECORD_AUDIO")) {
                return;
            }
            com.avito.android.permissions.G g13 = this.f188971Z0;
            (g13 != null ? g13 : null).b(true);
            return;
        }
        if (i12 != 15) {
            super.onRequestPermissionsResult(i12, strArr, iArr);
            return;
        }
        com.avito.android.permissions.x xVar5 = this.f188969Y0;
        if (xVar5 == null) {
            xVar5 = null;
        }
        if (xVar5.c(strArr, iArr, "android.permission.CAMERA")) {
            return;
        }
        Context context3 = getContext();
        if (context3 != null) {
            L5.a(context3, R.string.messenger_camera_permission_required, 0);
        }
        com.avito.android.permissions.x xVar6 = this.f188969Y0;
        if (xVar6 == null) {
            xVar6 = null;
        }
        if (xVar6.a("android.permission.CAMERA")) {
            return;
        }
        com.avito.android.permissions.G g14 = this.f188971Z0;
        (g14 != null ? g14 : null).p(true);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        InterfaceC28373a interfaceC28373a = this.f189006t0;
        if (interfaceC28373a == null) {
            interfaceC28373a = null;
        }
        interfaceC28373a.c(new C31657m());
        InterfaceC32572u interfaceC32572u = this.f188973a1;
        if (interfaceC32572u == null) {
            interfaceC32572u = null;
        }
        interfaceC32572u.a("ChannelFragment");
        com.avito.android.messenger.notification.e eVar = this.f188975b1;
        if (eVar == null) {
            eVar = null;
        }
        String str = this.f188965W2;
        eVar.a(str != null ? str : null);
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ActivityC22955m activityC22955mL1 = l1();
        if (activityC22955mL1 != null && !activityC22955mL1.isChangingConfigurations()) {
            SendMessagePresenter sendMessagePresenter = this.f188939G0;
            if (sendMessagePresenter == null) {
                sendMessagePresenter = null;
            }
            bundle.putParcelable("sendMessagePresenter", sendMessagePresenter.l9());
        }
        bundle.putBoolean("user_changed_text", this.f188988h3);
        bundle.putParcelable("video_file_ref", this.f188994k3);
        com.avito.android.messenger.conversation.mvi.messages.q0 q0Var = this.f189001o1;
        if (q0Var != null) {
            ((Number) ((C22082i3) q0Var.f193105c.f192967a).getF42167b()).intValue();
            com.avito.android.messenger.conversation.mvi.messages.q0 q0Var2 = this.f189001o1;
            bundle.putInt("messageListExtraPaddingBottom", ((Number) ((C22082i3) (q0Var2 != null ? q0Var2 : null).f193105c.f192967a).getF42167b()).intValue());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        io.reactivex.rxjava3.core.H h12 = io.reactivex.rxjava3.schedulers.b.f404942b;
        io.reactivex.rxjava3.disposables.d dVarT0 = this.f188998m3.j0(h12).q0(1L).N(H.f189094b).B(I.f189099a).j0(io.reactivex.rxjava3.android.schedulers.b.b()).t0(new J(this));
        io.reactivex.rxjava3.disposables.c cVar = this.f188980d3;
        cVar.b(dVarT0);
        io.reactivex.rxjava3.internal.operators.observable.I0 i0J0 = this.f188996l3.j0(h12);
        l41.o<Object, Object> oVar = io.reactivex.rxjava3.internal.functions.a.f401991a;
        cVar.b(i0J0.D(oVar).x0(h12).j0(io.reactivex.rxjava3.android.schedulers.b.b()).t0(new L(this)));
        com.avito.android.messenger.conversation.mvi.messages.q0 q0Var = this.f189001o1;
        if (q0Var == null) {
            q0Var = null;
        }
        cVar.b(q0Var.f193098F.j0(io.reactivex.rxjava3.android.schedulers.b.b()).t0(new M(this)));
        com.avito.android.messenger.conversation.mvi.messages.q0 q0Var2 = this.f189001o1;
        if (q0Var2 == null) {
            q0Var2 = null;
        }
        io.reactivex.rxjava3.internal.operators.observable.I0 i0J02 = q0Var2.f193093A.j0(h12);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        io.reactivex.rxjava3.internal.operators.observable.L lD2 = i0J02.D0(200L, timeUnit, h12).D(oVar);
        final com.avito.android.messenger.conversation.mvi.new_messages.a aVar = this.f188952Q0;
        if (aVar == null) {
            aVar = null;
        }
        cVar.b(lD2.t0(new l41.g() { // from class: com.avito.android.messenger.conversation.N
            @Override // l41.g
            public final void accept(Object obj) {
                aVar.h60(((Boolean) obj).booleanValue());
            }
        }));
        com.avito.android.messenger.conversation.mvi.messages.q0 q0Var3 = this.f189001o1;
        if (q0Var3 == null) {
            q0Var3 = null;
        }
        com.jakewharton.rxrelay3.b bVar = q0Var3.f193096D;
        bVar.getClass();
        cVar.b(bVar.D(oVar).j0(h12).t0(new O(this)));
        com.avito.android.messenger.conversation.mvi.new_messages.a aVar2 = this.f188952Q0;
        if (aVar2 == null) {
            aVar2 = null;
        }
        io.reactivex.rxjava3.core.z<k.b> zVarM0 = aVar2.M0();
        zVarM0.getClass();
        C41982q1 c41982q1X0 = zVarM0.D0(200L, timeUnit, h12).j0(io.reactivex.rxjava3.android.schedulers.b.b()).x0(h12);
        final com.avito.android.messenger.conversation.mvi.new_messages.m mVar = this.f189002p1;
        if (mVar == null) {
            mVar = null;
        }
        cVar.b(c41982q1X0.t0(new l41.g() { // from class: com.avito.android.messenger.conversation.l0
            @Override // l41.g
            public final void accept(Object obj) {
                com.avito.android.messenger.conversation.mvi.new_messages.m mVar2 = mVar;
                mVar2.getClass();
                e.a.a(mVar2, (k.b) obj);
            }
        }));
        com.avito.android.messenger.conversation.mvi.new_messages.m mVar2 = this.f189002p1;
        if (mVar2 == null) {
            mVar2 = null;
        }
        cVar.b(mVar2.f193822d.j0(io.reactivex.rxjava3.android.schedulers.b.b()).t0(new C31952m0(this)));
        com.avito.android.messenger.conversation.mvi.menu.l lVar = this.f188945K0;
        if (lVar == null) {
            lVar = null;
        }
        io.reactivex.rxjava3.core.z<t.e> zVarM02 = lVar.M0();
        C32348t c32348t = new C32348t(timeUnit, h12);
        zVarM02.getClass();
        cVar.b(new io.reactivex.rxjava3.internal.operators.observable.N0(zVarM02, c32348t).j0(io.reactivex.rxjava3.android.schedulers.b.b()).x0(io.reactivex.rxjava3.android.schedulers.b.b()).t0(new A(this)));
        com.avito.android.messenger.conversation.mvi.menu.l lVar2 = this.f188945K0;
        if (lVar2 == null) {
            lVar2 = null;
        }
        lVar2.getF191468e0().observe(getViewLifecycleOwner(), new C32351u(this));
        com.avito.android.messenger.conversation.mvi.menu.l lVar3 = this.f188945K0;
        if (lVar3 == null) {
            lVar3 = null;
        }
        lVar3.getF191469f0().observe(getViewLifecycleOwner(), new C32354v(this));
        com.avito.android.messenger.conversation.mvi.menu.l lVar4 = this.f188945K0;
        if (lVar4 == null) {
            lVar4 = null;
        }
        lVar4.getF191470g0().observe(getViewLifecycleOwner(), new C32357w(this));
        com.avito.android.messenger.conversation.mvi.menu.l lVar5 = this.f188945K0;
        if (lVar5 == null) {
            lVar5 = null;
        }
        lVar5.getF191471h0().observe(getViewLifecycleOwner(), new C32360x(this));
        com.avito.android.messenger.conversation.mvi.in_app_calls.h hVar = this.f188946L0;
        if (hVar == null) {
            hVar = null;
        }
        hVar.getF191404M().observe(getViewLifecycleOwner(), new C32363y(this));
        com.avito.android.messenger.conversation.mvi.in_app_calls.h hVar2 = this.f188946L0;
        if (hVar2 == null) {
            hVar2 = null;
        }
        hVar2.getF191403L().observe(getViewLifecycleOwner(), new C32366z(this));
        com.avito.android.messenger.conversation.mvi.menu.u uVar = this.f188953Q2;
        if (uVar == null) {
            uVar = null;
        }
        com.jakewharton.rxrelay3.c cVar2 = uVar.f191537e;
        cVar2.getClass();
        cVar.b(cVar2.y(300L, timeUnit, h12).j0(io.reactivex.rxjava3.android.schedulers.b.b()).t0(new C(this)));
        com.avito.android.messenger.conversation.mvi.menu.u uVar2 = this.f188953Q2;
        if (uVar2 == null) {
            uVar2 = null;
        }
        cVar.b(uVar2.f191538f.j0(io.reactivex.rxjava3.android.schedulers.b.b()).t0(new D(this)));
        com.avito.android.messenger.conversation.mvi.context.V v12 = this.f188940H0;
        if (v12 == null) {
            v12 = null;
        }
        io.reactivex.rxjava3.core.z<d0.c> zVarM03 = v12.M0();
        C31924d c31924d = new C31924d(timeUnit, h12);
        zVarM03.getClass();
        cVar.b(new io.reactivex.rxjava3.internal.operators.observable.N0(zVarM03, c31924d).j0(io.reactivex.rxjava3.android.schedulers.b.b()).x0(io.reactivex.rxjava3.android.schedulers.b.b()).t0(new C32334o(this)));
        com.avito.android.messenger.conversation.mvi.context.V v13 = this.f188940H0;
        if (v13 == null) {
            v13 = null;
        }
        v13.M6().observe(getViewLifecycleOwner(), new C31927e(this));
        com.avito.android.messenger.conversation.mvi.context.V v14 = this.f188940H0;
        if (v14 == null) {
            v14 = null;
        }
        v14.getF190221i0().observe(getViewLifecycleOwner(), new C31930f(this));
        com.avito.android.messenger.conversation.mvi.context.V v15 = this.f188940H0;
        if (v15 == null) {
            v15 = null;
        }
        v15.Q3().observe(getViewLifecycleOwner(), new C31933g(this));
        com.avito.android.messenger.conversation.mvi.context.V v16 = this.f188940H0;
        if (v16 == null) {
            v16 = null;
        }
        v16.getF190222j0().observe(getViewLifecycleOwner(), new C31936h(this));
        com.avito.android.messenger.conversation.mvi.context.f0 f0Var = this.f188951P2;
        if (f0Var == null) {
            f0Var = null;
        }
        cVar.b(f0Var.f190375f.ha().t0(new C32337p(this)));
        com.avito.android.messenger.conversation.mvi.context.f0 f0Var2 = this.f188951P2;
        if (f0Var2 == null) {
            f0Var2 = null;
        }
        io.reactivex.rxjava3.core.z<kotlin.G0> zVarIa = f0Var2.f190375f.ia();
        zVarIa.getClass();
        cVar.b(zVarIa.y(300L, timeUnit, h12).j0(io.reactivex.rxjava3.android.schedulers.b.b()).t0(new C32340q(this)));
        com.avito.android.messenger.conversation.mvi.context.f0 f0Var3 = this.f188951P2;
        if (f0Var3 == null) {
            f0Var3 = null;
        }
        io.reactivex.rxjava3.core.z<kotlin.G0> zVarAa = f0Var3.f190375f.aa();
        zVarAa.getClass();
        cVar.b(zVarAa.y(300L, timeUnit, h12).j0(io.reactivex.rxjava3.android.schedulers.b.b()).t0(new r(this)));
        com.avito.android.messenger.conversation.mvi.context.f0 f0Var4 = this.f188951P2;
        if (f0Var4 == null) {
            f0Var4 = null;
        }
        cVar.b(f0Var4.f190375f.ca().y(300L, timeUnit, h12).j0(io.reactivex.rxjava3.android.schedulers.b.b()).t0(new C32345s(this)));
        com.avito.android.messenger.conversation.mvi.context.f0 f0Var5 = this.f188951P2;
        if (f0Var5 == null) {
            f0Var5 = null;
        }
        cVar.b(f0Var5.f190375f.getF189407G().j0(io.reactivex.rxjava3.android.schedulers.b.b()).t0(new C31939i(this)));
        com.avito.android.messenger.conversation.mvi.context.f0 f0Var6 = this.f188951P2;
        if (f0Var6 == null) {
            f0Var6 = null;
        }
        cVar.b(f0Var6.f190375f.getF189408H().j0(io.reactivex.rxjava3.android.schedulers.b.b()).t0(new C31942j(this)));
        com.avito.android.messenger.conversation.mvi.context.f0 f0Var7 = this.f188951P2;
        if (f0Var7 == null) {
            f0Var7 = null;
        }
        cVar.b(f0Var7.f190375f.getF189409I().j0(io.reactivex.rxjava3.android.schedulers.b.b()).t0(new C31945k(this)));
        com.avito.android.messenger.conversation.mvi.context.f0 f0Var8 = this.f188951P2;
        if (f0Var8 == null) {
            f0Var8 = null;
        }
        cVar.b(f0Var8.f190375f.getF189408H().j0(io.reactivex.rxjava3.android.schedulers.b.b()).t0(new C31948l(this)));
        com.avito.android.messenger.conversation.mvi.context.f0 f0Var9 = this.f188951P2;
        if (f0Var9 == null) {
            f0Var9 = null;
        }
        cVar.b(f0Var9.f190375f.getF189402B().j0(io.reactivex.rxjava3.android.schedulers.b.b()).t0(new C31951m(this)));
        com.avito.android.messenger.conversation.mvi.context.f0 f0Var10 = this.f188951P2;
        if (f0Var10 == null) {
            f0Var10 = null;
        }
        cVar.b(f0Var10.f190375f.ja().j0(io.reactivex.rxjava3.android.schedulers.b.b()).t0(new C32331n(this)));
        h31.e<com.avito.android.messenger.conversation.mvi.platform_actions.f> eVar = this.f188936D0;
        if (eVar == null) {
            eVar = null;
        }
        final com.avito.android.messenger.conversation.mvi.platform_actions.f fVar = eVar.get();
        fVar.getF193943g0().observe(getViewLifecycleOwner(), new C32335o0(this));
        fVar.getF193941e0().observe(getViewLifecycleOwner(), new C32338p0(this));
        fVar.getF193942f0().observe(getViewLifecycleOwner(), new C32341q0(this));
        fVar.getF193944h0().observe(getViewLifecycleOwner(), new C32343r0(this));
        com.jakewharton.rxrelay3.b<Boolean> bVar2 = this.f188986g3;
        bVar2.getClass();
        io.reactivex.rxjava3.internal.operators.observable.L lD3 = bVar2.D(oVar);
        final com.avito.android.messenger.conversation.mvi.platform_actions.z zVar = this.f189003q1;
        if (zVar == null) {
            zVar = null;
        }
        cVar.b(lD3.t0(new l41.g() { // from class: com.avito.android.messenger.conversation.x0
            @Override // l41.g
            public final void accept(Object obj) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                com.avito.android.messenger.conversation.mvi.platform_actions.z zVar2 = zVar;
                C35971x c35971x = zVar2.f194061h;
                kotlin.reflect.n<Object> nVar = com.avito.android.messenger.conversation.mvi.platform_actions.z.f194054s[0];
                f.InterfaceC5732f interfaceC5732f = (f.InterfaceC5732f) c35971x.f319122b;
                if (zVar2.f194070q == zBooleanValue || interfaceC5732f == null) {
                    return;
                }
                zVar2.f194070q = zBooleanValue;
                zVar2.c(null, interfaceC5732f);
            }
        }));
        com.avito.android.messenger.conversation.mvi.platform_actions.z zVar2 = this.f189003q1;
        if (zVar2 == null) {
            zVar2 = null;
        }
        cVar.b(zVar2.f194062i.j0(io.reactivex.rxjava3.android.schedulers.b.b()).t0(new C32364y0(fVar)));
        com.avito.android.messenger.conversation.mvi.platform_actions.buttons.s sVar = this.f189004r1;
        if (sVar == null) {
            sVar = null;
        }
        com.jakewharton.rxrelay3.c cVar3 = sVar.f193865c;
        com.avito.android.messenger.conversation.mvi.platform_actions.buttons.m mVar3 = this.f189007t1;
        if (mVar3 == null) {
            mVar3 = null;
        }
        io.reactivex.rxjava3.core.z zVarG0 = io.reactivex.rxjava3.core.z.g0(cVar3, mVar3.f193847c);
        zVarG0.getClass();
        cVar.b(zVarG0.C0(300L, timeUnit, h12).j0(io.reactivex.rxjava3.android.schedulers.b.b()).t0(new l41.g() { // from class: com.avito.android.messenger.conversation.z0
            @Override // l41.g
            public final void accept(Object obj) {
                fVar.J6((f.a) obj);
            }
        }));
        com.avito.android.messenger.conversation.mvi.platform_actions.buttons.c cVar4 = this.f189005s1;
        if (cVar4 == null) {
            cVar4 = null;
        }
        com.jakewharton.rxrelay3.c cVar5 = cVar4.f193830b;
        com.avito.android.messenger.conversation.mvi.platform_actions.buttons.c cVar6 = this.f188941H1;
        if (cVar6 == null) {
            cVar6 = null;
        }
        io.reactivex.rxjava3.core.z zVarG02 = io.reactivex.rxjava3.core.z.g0(cVar5, cVar6.f193830b);
        zVarG02.getClass();
        cVar.b(zVarG02.C0(300L, timeUnit, h12).j0(io.reactivex.rxjava3.android.schedulers.b.b()).t0(new l41.g() { // from class: com.avito.android.messenger.conversation.A0
            @Override // l41.g
            public final void accept(Object obj) {
                fVar.O3((f.a) obj);
            }
        }));
        com.avito.android.messenger.conversation.mvi.platform_actions.buttons.c cVar7 = this.f189005s1;
        if (cVar7 == null) {
            cVar7 = null;
        }
        com.jakewharton.rxrelay3.c cVar8 = cVar7.f193831c;
        com.avito.android.messenger.conversation.mvi.platform_actions.buttons.c cVar9 = this.f188941H1;
        if (cVar9 == null) {
            cVar9 = null;
        }
        cVar.b(io.reactivex.rxjava3.core.z.g0(cVar8, cVar9.f193831c).j0(io.reactivex.rxjava3.android.schedulers.b.b()).t0(new B0(fVar)));
        com.avito.android.messenger.conversation.mvi.platform_actions.buttons.m mVar4 = this.f189007t1;
        if (mVar4 == null) {
            mVar4 = null;
        }
        com.jakewharton.rxrelay3.c cVar10 = mVar4.f193848d;
        cVar10.getClass();
        cVar.b(cVar10.C0(300L, timeUnit, h12).j0(io.reactivex.rxjava3.android.schedulers.b.b()).t0(new l41.g() { // from class: com.avito.android.messenger.conversation.s0
            @Override // l41.g
            public final void accept(Object obj) {
                fVar.X8((ContextActionHandler.MethodCall) obj);
            }
        }));
        com.avito.android.messenger.conversation.mvi.platform_actions.items_list.b bVar3 = this.f188967X1;
        if (bVar3 == null) {
            bVar3 = null;
        }
        com.jakewharton.rxrelay3.c<kotlin.G0> cVar11 = bVar3.f193978b;
        cVar11.getClass();
        cVar.b(cVar11.C0(300L, timeUnit, h12).j0(io.reactivex.rxjava3.android.schedulers.b.b()).t0(new C32349t0(fVar)));
        com.avito.android.messenger.conversation.mvi.platform_actions.items_list.b bVar4 = this.f188967X1;
        if (bVar4 == null) {
            bVar4 = null;
        }
        com.jakewharton.rxrelay3.c<kotlin.G0> cVar12 = bVar4.f193979c;
        cVar12.getClass();
        cVar.b(cVar12.C0(300L, timeUnit, h12).j0(io.reactivex.rxjava3.android.schedulers.b.b()).t0(new C32352u0(fVar)));
        io.reactivex.rxjava3.internal.operators.observable.I0 i0J03 = fVar.M0().j0(io.reactivex.rxjava3.android.schedulers.b.b());
        final com.avito.android.messenger.conversation.mvi.platform_actions.z zVar3 = this.f189003q1;
        if (zVar3 == null) {
            zVar3 = null;
        }
        cVar.b(i0J03.t0(new l41.g() { // from class: com.avito.android.messenger.conversation.v0
            @Override // l41.g
            public final void accept(Object obj) {
                com.avito.android.messenger.conversation.mvi.platform_actions.z zVar4 = zVar3;
                zVar4.getClass();
                e.a.a(zVar4, (f.InterfaceC5732f) obj);
            }
        }));
        SendMessagePresenter sendMessagePresenter = this.f188939G0;
        if (sendMessagePresenter == null) {
            sendMessagePresenter = null;
        }
        sendMessagePresenter.getF194191I0().observe(getViewLifecycleOwner(), new U0(this));
        SendMessagePresenter sendMessagePresenter2 = this.f188939G0;
        if (sendMessagePresenter2 == null) {
            sendMessagePresenter2 = null;
        }
        sendMessagePresenter2.getF194190H0().observe(getViewLifecycleOwner(), new V0(this));
        SendMessagePresenter sendMessagePresenter3 = this.f188939G0;
        if (sendMessagePresenter3 == null) {
            sendMessagePresenter3 = null;
        }
        sendMessagePresenter3.getF194192J0().observe(getViewLifecycleOwner(), new W0(this));
        SendMessagePresenter sendMessagePresenter4 = this.f188939G0;
        if (sendMessagePresenter4 == null) {
            sendMessagePresenter4 = null;
        }
        sendMessagePresenter4.getF194185C0().observe(getViewLifecycleOwner(), new Q0(this));
        SendMessagePresenter sendMessagePresenter5 = this.f188939G0;
        if (sendMessagePresenter5 == null) {
            sendMessagePresenter5 = null;
        }
        sendMessagePresenter5.getF194186D0().observe(getViewLifecycleOwner(), new X0(this));
        SendMessagePresenter sendMessagePresenter6 = this.f188939G0;
        if (sendMessagePresenter6 == null) {
            sendMessagePresenter6 = null;
        }
        sendMessagePresenter6.getF194183A0().observe(getViewLifecycleOwner(), new Y0(this));
        SendMessagePresenter sendMessagePresenter7 = this.f188939G0;
        if (sendMessagePresenter7 == null) {
            sendMessagePresenter7 = null;
        }
        sendMessagePresenter7.getF194184B0().observe(getViewLifecycleOwner(), new Z0(this));
        SendMessagePresenter sendMessagePresenter8 = this.f188939G0;
        if (sendMessagePresenter8 == null) {
            sendMessagePresenter8 = null;
        }
        sendMessagePresenter8.getF194221x0().observe(getViewLifecycleOwner(), new C31914a1(this));
        SendMessagePresenter sendMessagePresenter9 = this.f188939G0;
        if (sendMessagePresenter9 == null) {
            sendMessagePresenter9 = null;
        }
        sendMessagePresenter9.getF194187E0().observe(getViewLifecycleOwner(), new C31920b1(this));
        SendMessagePresenter sendMessagePresenter10 = this.f188939G0;
        if (sendMessagePresenter10 == null) {
            sendMessagePresenter10 = null;
        }
        sendMessagePresenter10.getF194188F0().observe(getViewLifecycleOwner(), new C31923c1(this));
        SendMessagePresenter sendMessagePresenter11 = this.f188939G0;
        if (sendMessagePresenter11 == null) {
            sendMessagePresenter11 = null;
        }
        sendMessagePresenter11.getF194222y0().observe(getViewLifecycleOwner(), new S0(this));
        SendMessagePresenter sendMessagePresenter12 = this.f188939G0;
        if (sendMessagePresenter12 == null) {
            sendMessagePresenter12 = null;
        }
        sendMessagePresenter12.getF194223z0().observe(getViewLifecycleOwner(), new R0(this));
        SendMessagePresenter sendMessagePresenter13 = this.f188939G0;
        if (sendMessagePresenter13 == null) {
            sendMessagePresenter13 = null;
        }
        sendMessagePresenter13.getF194189G0().observe(getViewLifecycleOwner(), new T0(this));
        com.avito.android.messenger.conversation.mvi.send.Q0 q02 = this.f188942H2;
        if (q02 == null) {
            q02 = null;
        }
        cVar.b(q02.f194356I.t0(new C31926d1(this)));
        com.avito.android.messenger.conversation.mvi.send.Q0 q03 = this.f188942H2;
        if (q03 == null) {
            q03 = null;
        }
        cVar.b(q03.f194350C.t0(new C31929e1(this)));
        com.avito.android.messenger.conversation.mvi.send.Q0 q04 = this.f188942H2;
        if (q04 == null) {
            q04 = null;
        }
        cVar.b(q04.f194387t.t0(new C31932f1(this)));
        com.avito.android.messenger.conversation.mvi.send.Q0 q05 = this.f188942H2;
        if (q05 == null) {
            q05 = null;
        }
        cVar.b(q05.f194386s.t0(new C31935g1(this)));
        com.avito.android.messenger.conversation.mvi.send.Q0 q06 = this.f188942H2;
        if (q06 == null) {
            q06 = null;
        }
        cVar.b(q06.f194388u.t0(new C31938h1(this)));
        com.avito.android.messenger.conversation.mvi.send.Q0 q07 = this.f188942H2;
        if (q07 == null) {
            q07 = null;
        }
        cVar.b(q07.f194358K.t0(new C31941i1(this)));
        com.avito.android.messenger.conversation.mvi.send.Q0 q08 = this.f188942H2;
        if (q08 == null) {
            q08 = null;
        }
        cVar.b(q08.f194359L.t0(new C31944j1(this)));
        com.avito.android.messenger.conversation.mvi.send.Q0 q09 = this.f188942H2;
        if (q09 == null) {
            q09 = null;
        }
        cVar.b(q09.f194360M.t0(new C31947k1(this)));
        C30277e1 c30277e1 = this.f189013z0;
        if (c30277e1 == null) {
            c30277e1 = null;
        }
        if (c30277e1.x().invoke().booleanValue()) {
            C30277e1 c30277e12 = this.f189013z0;
            if (c30277e12 == null) {
                c30277e12 = null;
            }
            c30277e12.getClass();
            kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[43];
            if (((Boolean) c30277e12.f144979Q.a().invoke()).booleanValue()) {
                com.avito.android.messenger.conversation.mvi.send.Q0 q010 = this.f188942H2;
                if (q010 == null) {
                    q010 = null;
                }
                cVar.b(q010.f194389v.t0(new C31950l1(this)));
                com.avito.android.messenger.conversation.mvi.send.Q0 q011 = this.f188942H2;
                if (q011 == null) {
                    q011 = null;
                }
                cVar.b(q011.f194391x.t0(new C31953m1(this)));
                com.avito.android.messenger.conversation.mvi.send.Q0 q012 = this.f188942H2;
                if (q012 == null) {
                    q012 = null;
                }
                cVar.b(q012.f194390w.t0(new C32333n1(this)));
                com.avito.android.messenger.conversation.mvi.send.Q0 q013 = this.f188942H2;
                if (q013 == null) {
                    q013 = null;
                }
                cVar.b(q013.f194392y.t0(new C32336o1(this)));
                com.avito.android.messenger.conversation.mvi.send.Q0 q014 = this.f188942H2;
                if (q014 == null) {
                    q014 = null;
                }
                cVar.b(q014.f194393z.t0(new C32339p1(this)));
            }
        }
        com.avito.android.messenger.conversation.mvi.send.Q0 q015 = this.f188942H2;
        if (q015 == null) {
            q015 = null;
        }
        cVar.b(q015.f194348A.t0(new C32342q1(this)));
        com.avito.android.messenger.conversation.mvi.send.Q0 q016 = this.f188942H2;
        if (q016 == null) {
            q016 = null;
        }
        cVar.b(q016.f194351D.t0(new C32344r1(this)));
        com.avito.android.messenger.conversation.mvi.send.Q0 q017 = this.f188942H2;
        if (q017 == null) {
            q017 = null;
        }
        cVar.b(q017.f194352E.t0(new C32347s1(this)));
        com.avito.android.messenger.conversation.mvi.send.Q0 q018 = this.f188942H2;
        if (q018 == null) {
            q018 = null;
        }
        cVar.b(q018.f194353F.t0(new C32350t1(this)));
        com.avito.android.messenger.conversation.mvi.send.Q0 q019 = this.f188942H2;
        if (q019 == null) {
            q019 = null;
        }
        cVar.b(q019.f194354G.t0(new C32353u1(this)));
        com.avito.android.messenger.conversation.mvi.send.Q0 q020 = this.f188942H2;
        if (q020 == null) {
            q020 = null;
        }
        cVar.b(q020.f194355H.t0(new C32356v1(this)));
        com.avito.android.messenger.conversation.mvi.send.Q0 q021 = this.f188942H2;
        if (q021 == null) {
            q021 = null;
        }
        cVar.b(q021.f194357J.t0(new C32359w1(this)));
        com.avito.android.messenger.conversation.mvi.send.Q0 q022 = this.f188942H2;
        if (q022 == null) {
            q022 = null;
        }
        cVar.b(q022.f194361N.t0(new C32362x1(this)));
        SendMessagePresenter sendMessagePresenter14 = this.f188939G0;
        if (sendMessagePresenter14 == null) {
            sendMessagePresenter14 = null;
        }
        cVar.b(sendMessagePresenter14.M0().j0(io.reactivex.rxjava3.android.schedulers.b.b()).t0(new C32365y1(this)));
        com.avito.android.messenger.conversation.mvi.multi_message.m mVar5 = this.f188993k1;
        if (mVar5 == null) {
            mVar5 = null;
        }
        io.reactivex.rxjava3.core.z<T> zVarQ0 = mVar5.M0().j0(io.reactivex.rxjava3.android.schedulers.b.b()).q0(1L);
        final com.avito.android.messenger.conversation.mvi.multi_message.i iVar = this.f188963V2;
        if (iVar == null) {
            iVar = null;
        }
        cVar.b(zVarQ0.t0(new l41.g() { // from class: com.avito.android.messenger.conversation.i0
            @Override // l41.g
            public final void accept(Object obj) {
                com.avito.android.messenger.conversation.mvi.multi_message.i iVar2 = iVar;
                iVar2.getClass();
                e.a.a(iVar2, (m.b) obj);
            }
        }));
        com.avito.android.messenger.conversation.mvi.multi_message.i iVar2 = this.f188963V2;
        if (iVar2 == null) {
            iVar2 = null;
        }
        cVar.b(iVar2.f193703d.j0(io.reactivex.rxjava3.android.schedulers.b.b()).t0(new C31943j0(this)));
        com.avito.android.messenger.conversation.mvi.multi_message.i iVar3 = this.f188963V2;
        if (iVar3 == null) {
            iVar3 = null;
        }
        cVar.b(iVar3.f193705f.j0(io.reactivex.rxjava3.android.schedulers.b.b()).t0(new C31946k0(this)));
        com.avito.android.messenger.conversation.mvi.multi_message.m mVar6 = this.f188993k1;
        if (mVar6 == null) {
            mVar6 = null;
        }
        mVar6.getF193729e0().observe(getViewLifecycleOwner(), new C31937h0(this));
        C30277e1 c30277e13 = this.f189013z0;
        if (c30277e13 == null) {
            c30277e13 = null;
        }
        c30277e13.getClass();
        kotlin.reflect.n<Object> nVar2 = C30277e1.f144946d1[92];
        if (((Boolean) c30277e13.f144972M0.a().invoke()).booleanValue() && kotlin.jvm.internal.L.f(this.f189000n3, "ai-assistant")) {
            h31.e<com.avito.android.messenger.conversation.mvi.message_scrollable_suggests.g> eVar2 = this.f188948N0;
            if (eVar2 == null) {
                eVar2 = null;
            }
            com.avito.android.messenger.conversation.mvi.message_scrollable_suggests.g gVar = eVar2.get();
            cVar.b(gVar.M0().j0(io.reactivex.rxjava3.android.schedulers.b.b()).t0(new L0(this)));
            gVar.getF191854Z().observe(getViewLifecycleOwner(), new R1.a(new M0(this)));
            com.avito.android.messenger.conversation.mvi.message_scrollable_suggests.o oVar2 = this.f188957S2;
            if (oVar2 == null) {
                oVar2 = null;
            }
            cVar.b(oVar2.f191879i.j0(io.reactivex.rxjava3.android.schedulers.b.b()).t0(new N0(gVar, this)));
            com.avito.android.messenger.conversation.mvi.send.Q0 q023 = this.f188942H2;
            if (q023 == null) {
                q023 = null;
            }
            cVar.b(q023.f194387t.x(O0.f189126b).j0(io.reactivex.rxjava3.android.schedulers.b.b()).t0(new P0(gVar)));
        } else {
            com.avito.android.messenger.conversation.mvi.message_suggests.s sVar2 = this.f188947M0;
            if (sVar2 == null) {
                sVar2 = null;
            }
            cVar.b(sVar2.M0().j0(io.reactivex.rxjava3.android.schedulers.b.b()).x0(io.reactivex.rxjava3.android.schedulers.b.b()).t0(new C31928e0(this)));
            com.avito.android.messenger.conversation.mvi.message_suggests.s sVar3 = this.f188947M0;
            if (sVar3 == null) {
                sVar3 = null;
            }
            sVar3.getF192010h0().observe(getViewLifecycleOwner(), new C31925d0(this));
            com.avito.android.messenger.conversation.mvi.message_suggests.H h13 = this.f188955R2;
            if (h13 == null) {
                h13 = null;
            }
            cVar.b(h13.f191909d.j0(io.reactivex.rxjava3.android.schedulers.b.b()).t0(new C31931f0(this)));
            com.avito.android.messenger.conversation.mvi.message_suggests.H h14 = this.f188955R2;
            if (h14 == null) {
                h14 = null;
            }
            cVar.b(h14.f191911f.j0(io.reactivex.rxjava3.android.schedulers.b.b()).t0(new C31934g0(this)));
        }
        com.avito.android.messenger.conversation.mvi.message_menu.l lVar6 = this.f188949O0;
        if (lVar6 == null) {
            lVar6 = null;
        }
        io.reactivex.rxjava3.core.z<l.a> zVarM04 = lVar6.M0();
        zVarM04.getClass();
        cVar.b(zVarM04.D(oVar).j0(io.reactivex.rxjava3.android.schedulers.b.b()).t0(new X(this)));
        com.avito.android.messenger.conversation.mvi.message_menu.t tVar = this.f188959T2;
        if (tVar == null) {
            tVar = null;
        }
        com.jakewharton.rxrelay3.c cVar13 = tVar.f191812e;
        cVar13.getClass();
        cVar.b(cVar13.C0(500L, timeUnit, h12).t0(new Y(this)));
        com.avito.android.messenger.conversation.mvi.message_menu.t tVar2 = this.f188959T2;
        if (tVar2 == null) {
            tVar2 = null;
        }
        com.jakewharton.rxrelay3.c cVar14 = tVar2.f191810c;
        cVar14.getClass();
        cVar.b(cVar14.C0(500L, timeUnit, h12).t0(new Z(this)));
        com.avito.android.messenger.conversation.mvi.message_menu.t tVar3 = this.f188959T2;
        if (tVar3 == null) {
            tVar3 = null;
        }
        com.jakewharton.rxrelay3.c cVar15 = tVar3.f191811d;
        cVar15.getClass();
        cVar.b(cVar15.C0(500L, timeUnit, h12).t0(new C31913a0(this)));
        com.avito.android.messenger.conversation.mvi.message_menu.i iVar4 = this.f188950P0;
        if (iVar4 == null) {
            iVar4 = null;
        }
        iVar4.getF191757K().observe(getViewLifecycleOwner(), new P(this));
        com.avito.android.messenger.conversation.mvi.message_menu.i iVar5 = this.f188950P0;
        if (iVar5 == null) {
            iVar5 = null;
        }
        iVar5.getF191759M().observe(getViewLifecycleOwner(), new Q(this));
        com.avito.android.messenger.conversation.mvi.message_menu.i iVar6 = this.f188950P0;
        if (iVar6 == null) {
            iVar6 = null;
        }
        iVar6.getF191756J().observe(getViewLifecycleOwner(), new S(this));
        com.avito.android.messenger.conversation.mvi.message_menu.i iVar7 = this.f188950P0;
        if (iVar7 == null) {
            iVar7 = null;
        }
        iVar7.getF191760N().observe(getViewLifecycleOwner(), new T(this));
        com.avito.android.messenger.conversation.mvi.message_menu.i iVar8 = this.f188950P0;
        if (iVar8 == null) {
            iVar8 = null;
        }
        iVar8.getF191761O().observe(getViewLifecycleOwner(), new U(this));
        com.avito.android.messenger.conversation.mvi.message_menu.i iVar9 = this.f188950P0;
        if (iVar9 == null) {
            iVar9 = null;
        }
        iVar9.getF191758L().observe(getViewLifecycleOwner(), new V(this));
        JY.a aVar3 = this.f188999n1;
        if (aVar3 == null) {
            aVar3 = null;
        }
        if (aVar3.l()) {
            u3.g<MessengerQuickRepliesWithTitleTestGroup> gVar2 = this.f188981e1;
            if (gVar2 == null) {
                gVar2 = null;
            }
            MessengerQuickRepliesWithTitleTestGroup messengerQuickRepliesWithTitleTestGroup = gVar2.f439742a.f439749b;
            messengerQuickRepliesWithTitleTestGroup.getClass();
            if (messengerQuickRepliesWithTitleTestGroup == MessengerQuickRepliesWithTitleTestGroup.f67878e) {
                com.avito.android.messenger.conversation.mvi.message_menu.i iVar10 = this.f188950P0;
                if (iVar10 == null) {
                    iVar10 = null;
                }
                iVar10.getF191762P().observe(getViewLifecycleOwner(), new W(this));
            }
        }
        JY.a aVar4 = this.f188999n1;
        if (aVar4 == null) {
            aVar4 = null;
        }
        if (aVar4.l()) {
            com.avito.android.messenger.conversation.mvi.quick_replies.d dVar = this.f188960U0;
            if (dVar == null) {
                dVar = null;
            }
            dVar.getF194102Y().observe(getViewLifecycleOwner(), new C0(this));
            com.avito.android.messenger.conversation.mvi.quick_replies.d dVar2 = this.f188960U0;
            if (dVar2 == null) {
                dVar2 = null;
            }
            dVar2.getF194103Z().observe(getViewLifecycleOwner(), new D0(this));
            u3.g<MessengerQuickRepliesWithTitleTestGroup> gVar3 = this.f188981e1;
            if (gVar3 == null) {
                gVar3 = null;
            }
            MessengerQuickRepliesWithTitleTestGroup messengerQuickRepliesWithTitleTestGroup2 = gVar3.f439742a.f439749b;
            messengerQuickRepliesWithTitleTestGroup2.getClass();
            MessengerQuickRepliesWithTitleTestGroup messengerQuickRepliesWithTitleTestGroup3 = MessengerQuickRepliesWithTitleTestGroup.f67878e;
            if (messengerQuickRepliesWithTitleTestGroup2 == messengerQuickRepliesWithTitleTestGroup3) {
                com.avito.android.messenger.conversation.mvi.quick_replies.d dVar3 = this.f188960U0;
                if (dVar3 == null) {
                    dVar3 = null;
                }
                dVar3.getF194104a0().observe(getViewLifecycleOwner(), new E0(this));
            }
            com.avito.android.messenger.conversation.mvi.quick_replies.r rVar = this.f188961U2;
            if (rVar == null) {
                rVar = null;
            }
            cVar.b(rVar.f194127g.t0(new F0(this)));
            com.avito.android.messenger.conversation.mvi.quick_replies.r rVar2 = this.f188961U2;
            if (rVar2 == null) {
                rVar2 = null;
            }
            cVar.b(rVar2.f194128h.t0(new G0(this)));
            com.avito.android.messenger.conversation.mvi.quick_replies.r rVar3 = this.f188961U2;
            if (rVar3 == null) {
                rVar3 = null;
            }
            cVar.b(rVar3.f194129i.t0(new H0(this)));
            com.avito.android.messenger.conversation.mvi.quick_replies.r rVar4 = this.f188961U2;
            if (rVar4 == null) {
                rVar4 = null;
            }
            cVar.b(rVar4.f194130j.t0(new I0(this)));
            com.avito.android.messenger.conversation.mvi.quick_replies.r rVar5 = this.f188961U2;
            if (rVar5 == null) {
                rVar5 = null;
            }
            cVar.b(rVar5.f194131k.t0(new J0(this)));
            com.avito.android.messenger.conversation.mvi.quick_replies.d dVar4 = this.f188960U0;
            if (dVar4 == null) {
                dVar4 = null;
            }
            io.reactivex.rxjava3.internal.operators.observable.I0 i0J04 = dVar4.M0().j0(io.reactivex.rxjava3.android.schedulers.b.b());
            final com.avito.android.messenger.conversation.mvi.quick_replies.r rVar6 = this.f188961U2;
            if (rVar6 == null) {
                rVar6 = null;
            }
            cVar.b(i0J04.t0(new l41.g() { // from class: com.avito.android.messenger.conversation.K0
                @Override // l41.g
                public final void accept(Object obj) {
                    com.avito.android.messenger.conversation.mvi.quick_replies.r rVar7 = rVar6;
                    rVar7.getClass();
                    e.a.a(rVar7, (d.a) obj);
                }
            }));
            u3.g<MessengerQuickRepliesWithTitleTestGroup> gVar4 = this.f188981e1;
            if (gVar4 == null) {
                gVar4 = null;
            }
            MessengerQuickRepliesWithTitleTestGroup messengerQuickRepliesWithTitleTestGroup4 = gVar4.f439742a.f439749b;
            messengerQuickRepliesWithTitleTestGroup4.getClass();
            if (messengerQuickRepliesWithTitleTestGroup4 == messengerQuickRepliesWithTitleTestGroup3 || messengerQuickRepliesWithTitleTestGroup4 == MessengerQuickRepliesWithTitleTestGroup.f67877d) {
                u3.g<MessengerQuickRepliesWithTitleTestGroup> gVar5 = this.f188981e1;
                (gVar5 != null ? gVar5 : null).b();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        ActivityC22955m activityC22955mL1;
        com.avito.android.messenger.conversation.analytics.b bVar = this.f188966X0;
        if (bVar == null) {
            bVar = null;
        }
        bVar.c();
        this.f188980d3.e();
        com.avito.android.messenger.conversation.mvi.context.f0 f0Var = this.f188951P2;
        if (f0Var == null) {
            f0Var = null;
        }
        io.reactivex.rxjava3.internal.observers.y yVar = f0Var.f190376g;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f188984f3.e();
        View view = getView();
        if (view != null) {
            view.setKeepScreenOn(false);
        }
        C30277e1 c30277e1 = this.f189013z0;
        if (c30277e1 == null) {
            c30277e1 = null;
        }
        c30277e1.getClass();
        kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[43];
        if (((Boolean) c30277e1.f144979Q.a().invoke()).booleanValue() && (activityC22955mL1 = l1()) != null && !activityC22955mL1.isChangingConfigurations()) {
            SendMessagePresenter sendMessagePresenter = this.f188939G0;
            (sendMessagePresenter != null ? sendMessagePresenter : null).Vx();
        }
        super.onStop();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ActivityC22955m activityC22955mRequireActivity = requireActivity();
        this.f189002p1 = new com.avito.android.messenger.conversation.mvi.new_messages.m(view);
        ViewGroup viewGroup = (ViewGroup) view;
        com.avito.android.messenger.conversation.mvi.messages.q0 q0Var = this.f189001o1;
        if (q0Var == null) {
            q0Var = null;
        }
        io.reactivex.rxjava3.core.z<kotlin.G0> zVar = q0Var.f193099G;
        com.avito.android.messenger.conversation.analytics.b bVar = this.f188966X0;
        com.avito.android.messenger.conversation.analytics.b bVar2 = bVar != null ? bVar : null;
        C30277e1 c30277e1 = this.f189013z0;
        this.f188951P2 = new com.avito.android.messenger.conversation.mvi.context.f0(viewGroup, zVar, this.f188986g3, bVar2, c30277e1 != null ? c30277e1 : null);
        InterfaceC28373a interfaceC28373a = this.f189006t0;
        if (interfaceC28373a == null) {
            interfaceC28373a = null;
        }
        C30277e1 c30277e12 = this.f189013z0;
        if (c30277e12 == null) {
            c30277e12 = null;
        }
        this.f188953Q2 = new com.avito.android.messenger.conversation.mvi.menu.u(view, interfaceC28373a, c30277e12);
        this.f188976b3 = (io.reactivex.rxjava3.internal.observers.y) K2.h(activityC22955mRequireActivity).y(getResources().getInteger(android.R.integer.config_shortAnimTime), TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.b.f404942b).j0(io.reactivex.rxjava3.android.schedulers.b.b()).t0(this.f188986g3);
        C30277e1 c30277e13 = this.f189013z0;
        if (c30277e13 == null) {
            c30277e13 = null;
        }
        B2 b22 = this.f188933A0;
        if (b22 == null) {
            b22 = null;
        }
        this.f188942H2 = new com.avito.android.messenger.conversation.mvi.send.Q0(viewGroup, c30277e13, b22);
        Context context = viewGroup.getContext();
        Resources resources = context.getResources();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        com.avito.android.messenger.conversation.mvi.platform_actions.buttons.c cVar = new com.avito.android.messenger.conversation.mvi.platform_actions.buttons.c(context);
        this.f189005s1 = cVar;
        this.f189004r1 = new com.avito.android.messenger.conversation.mvi.platform_actions.buttons.s(resources, layoutInflaterFrom, cVar);
        com.avito.android.messenger.conversation.mvi.platform_actions.buttons.c cVar2 = new com.avito.android.messenger.conversation.mvi.platform_actions.buttons.c(context);
        this.f188941H1 = cVar2;
        this.f189007t1 = new com.avito.android.messenger.conversation.mvi.platform_actions.buttons.m(resources, layoutInflaterFrom, cVar2);
        com.avito.konveyor.adapter.h hVar = this.f188937E0;
        if (hVar == null) {
            hVar = null;
        }
        com.avito.konveyor.a aVar = this.f188938F0;
        if (aVar == null) {
            aVar = null;
        }
        this.f188967X1 = new com.avito.android.messenger.conversation.mvi.platform_actions.items_list.b(context, layoutInflaterFrom, hVar, aVar);
        com.avito.android.messenger.conversation.mvi.platform_actions.buttons.s sVar = this.f189004r1;
        com.avito.android.messenger.conversation.mvi.platform_actions.buttons.s sVar2 = sVar == null ? null : sVar;
        com.avito.android.messenger.conversation.mvi.platform_actions.buttons.m mVar = this.f189007t1;
        com.avito.android.messenger.conversation.mvi.platform_actions.buttons.m mVar2 = mVar == null ? null : mVar;
        com.avito.android.messenger.conversation.mvi.platform_actions.items_list.b bVar3 = this.f188967X1;
        com.avito.android.messenger.conversation.mvi.platform_actions.items_list.b bVar4 = bVar3 == null ? null : bVar3;
        com.avito.android.messenger.conversation.mvi.messages.q0 q0Var2 = this.f189001o1;
        e eVar = new e(1, q0Var2 == null ? null : q0Var2, com.avito.android.messenger.conversation.mvi.messages.g0.class, "setExtraPaddingBottom", "setExtraPaddingBottom(I)Z", 0);
        com.avito.android.messenger.conversation.mvi.send.Q0 q02 = this.f188942H2;
        this.f189003q1 = new com.avito.android.messenger.conversation.mvi.platform_actions.z(context, viewGroup, sVar2, mVar2, bVar4, eVar, q02 == null ? null : q02);
        this.f188955R2 = new com.avito.android.messenger.conversation.mvi.message_suggests.H(viewGroup);
        this.f188957S2 = new com.avito.android.messenger.conversation.mvi.message_scrollable_suggests.o(viewGroup);
        this.f188959T2 = new com.avito.android.messenger.conversation.mvi.message_menu.t(view);
        com.avito.konveyor.adapter.a aVar2 = this.f188956S0;
        if (aVar2 == null) {
            aVar2 = null;
        }
        com.avito.konveyor.a aVar3 = this.f188958T0;
        if (aVar3 == null) {
            aVar3 = null;
        }
        u3.g<MessengerQuickRepliesWithTitleTestGroup> gVar = this.f188981e1;
        if (gVar == null) {
            gVar = null;
        }
        MessengerQuickRepliesWithTitleTestGroup messengerQuickRepliesWithTitleTestGroup = gVar.f439742a.f439749b;
        messengerQuickRepliesWithTitleTestGroup.getClass();
        this.f188961U2 = new com.avito.android.messenger.conversation.mvi.quick_replies.r(viewGroup, aVar2, aVar3, messengerQuickRepliesWithTitleTestGroup == MessengerQuickRepliesWithTitleTestGroup.f67878e ? R.string.messenger_quick_replies_empty_subtitle : R.string.messenger_quick_replies_empty_subtitle_old);
        this.f188963V2 = new com.avito.android.messenger.conversation.mvi.multi_message.i(viewGroup);
        com.avito.android.messenger.conversation.analytics.b bVar5 = this.f188966X0;
        if (bVar5 == null) {
            bVar5 = null;
        }
        bVar5.d();
        com.avito.android.deeplink_handler.handler.composite.a aVar4 = this.f189012y0;
        if (aVar4 == null) {
            aVar4 = null;
        }
        this.f188982e3.b(aVar4.d9().t0(new C1(this)));
        Lifecycle lifecycle = getViewLifecycleOwner().getLifecycle();
        com.avito.android.messenger.conversation.mvi.voice.Q q12 = this.f188954R0;
        if (q12 == null) {
            q12 = null;
        }
        lifecycle.a(q12);
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new C32332n0(this, null), 3);
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new G(this, D5(), null), 3);
        com.avito.android.messenger.conversation.mvi.new_messages.a aVar5 = this.f188952Q0;
        if (aVar5 == null) {
            aVar5 = null;
        }
        aVar5.getF193783c0().observe(getViewLifecycleOwner(), new E(this));
        com.avito.android.messenger.conversation.mvi.new_messages.a aVar6 = this.f188952Q0;
        (aVar6 != null ? aVar6 : null).getF193784d0().observe(getViewLifecycleOwner(), new F(this));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        ChannelActivityArguments.PerformanceParams performanceParams;
        Intent intent;
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("channelId") : null;
        if (string == null) {
            throw new IllegalArgumentException("channelId required");
        }
        this.f188965W2 = string;
        Bundle arguments2 = getArguments();
        this.f188968X2 = arguments2 != null ? arguments2.getString(PlatformActions.MESSAGE_ID) : null;
        Bundle arguments3 = getArguments();
        this.f188970Y2 = arguments3 != null ? arguments3.getString("searchQuery") : null;
        Bundle arguments4 = getArguments();
        this.f188972Z2 = (arguments4 == null || !arguments4.containsKey("numberInList")) ? null : Integer.valueOf(arguments4.getInt("numberInList"));
        ActivityC22955m activityC22955mL1 = l1();
        this.f188974a3 = (activityC22955mL1 == null || (intent = activityC22955mL1.getIntent()) == null) ? null : C35967w2.a(intent);
        Bundle arguments5 = getArguments();
        boolean z12 = arguments5 != null ? arguments5.getBoolean("sendDraftMessageImmediately", false) : false;
        Bundle arguments6 = getArguments();
        String string2 = arguments6 != null ? arguments6.getString("xHash") : null;
        Bundle arguments7 = getArguments();
        String string3 = arguments7 != null ? arguments7.getString("flowId") : null;
        Bundle arguments8 = getArguments();
        if (arguments8 != null) {
            performanceParams = (ChannelActivityArguments.PerformanceParams) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments8.getParcelable("key_performance_params", ChannelActivityArguments.PerformanceParams.class) : arguments8.getParcelable("key_performance_params"));
        } else {
            performanceParams = null;
        }
        this.f189000n3 = string3 == null ? "" : string3;
        com.avito.android.analytics.screens.D.f90335a.getClass();
        com.avito.android.analytics.screens.F fA2 = D.a.a();
        SendMessagePresenter.State state = bundle != null ? (SendMessagePresenter.State) bundle.getParcelable("sendMessagePresenter") : null;
        OpenedFrom openedFrom = this.f188972Z2 != null ? OpenedFrom.f189128b : this.f188974a3 instanceof CalledFrom.Push ? OpenedFrom.f189129c : OpenedFrom.f189130d;
        this.f188988h3 = bundle != null ? bundle.getBoolean("user_changed_text") : false;
        this.f188994k3 = bundle != null ? (SendMessagePresenter.RecordingVideoFileReference) bundle.getParcelable("video_file_ref") : null;
        InterfaceC32428d.a aVarB = ((InterfaceC32419a) ((InterfaceC44055a) getParentFragment()).r0()).b();
        o2 o2Var = o2.f196167a;
        C28478k c28478k = new C28478k(ChannelScreen.f90318d, com.avito.android.analytics.screens.s.c(this), null, 4, null);
        Resources resources = getResources();
        String str = this.f188965W2;
        W1 w12 = new W1(str == null ? null : str, this.f188972Z2, this.f188968X2, this.f188970Y2, z12, string2, string3, performanceParams);
        if (state == null) {
            state = new SendMessagePresenter.State(null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, null, null, false, null, false, null, false, false, null, null, null, null, null, null, null, null, null, false, null, null, -1, 7, null);
        }
        InterfaceC31987a.C5631a.f190234e.getClass();
        ChannelActivityArguments.PerformanceParams performanceParams2 = performanceParams;
        aVarB.a(this, c28478k, resources, w12, openedFrom, state, InterfaceC31987a.C5631a.f190235f, new d0.c.a(null, null, null, null, false, false, false, false, false, false, false, false, null, null, null, 32767, null), new C33032b(this), new A1(this), getString(R.string.messenger_voice_message_media_metadata_title), getString(R.string.messenger_voice_message_legacy_media_metadata_title), getString(R.string.messenger_yandex_geo_bubble_snippet_language), getString(R.string.messenger_google_geo_bubble_snippet_language), getString(R.string.messenger_google_geo_bubble_snippet_region)).a(this);
        if ((performanceParams2 != null ? performanceParams2.f188906b : null) != null && performanceParams2.f188907c != null) {
            long jCurrentTimeMillis = System.currentTimeMillis() - performanceParams2.f188906b.longValue();
            com.avito.android.messenger.conversation.analytics.b bVar = this.f188966X0;
            if (bVar == null) {
                bVar = null;
            }
            bVar.b(Long.valueOf(jCurrentTimeMillis), performanceParams2.f188907c);
        }
        com.avito.android.messenger.conversation.analytics.b bVar2 = this.f188966X0;
        if (bVar2 == null) {
            bVar2 = null;
        }
        bVar2.a(fA2.b());
        com.avito.android.messenger.conversation.analytics.b bVar3 = this.f188966X0;
        if (bVar3 == null) {
            bVar3 = null;
        }
        bVar3.v(g5(), this);
        V2.f318762a.i("ChannelFragment", "init lazy VM " + D5(), null);
    }
}
