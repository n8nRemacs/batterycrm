package com.avito.android.messenger.conversation;

import Cd.C13243a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22969B;
import androidx.view.InterfaceC23040h0;
import androidx.view.P0;
import com.avito.android.C30277e1;
import com.avito.android.R;
import com.avito.android.analytics.provider.clickstream.ScreenIdField;
import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import com.avito.android.analytics.screens.ChannelScreen;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.bottom_navigation.ui.fragment.factory.NavigationState;
import com.avito.android.deep_linking.links.AdvertDetailsLink;
import com.avito.android.deep_linking.links.MyAdvertDetailsLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.C29972i;
import com.avito.android.di.module.InterfaceC30106l7;
import com.avito.android.feedback_adverts.c;
import com.avito.android.messenger.InterfaceC32572u;
import com.avito.android.messenger.conversation.ChannelActivityArguments;
import com.avito.android.messenger.conversation.ChannelFragment;
import com.avito.android.messenger.conversation.create.CreateChannelFragment;
import com.avito.android.messenger.conversation.mvi.send.SendMessagePresenter;
import com.avito.android.messenger.di.C32453l0;
import com.avito.android.messenger.di.InterfaceC32419a;
import com.avito.android.messenger.di.InterfaceC32422b;
import com.avito.android.photo_gallery.PhotoGalleryIntentFactory;
import com.avito.android.remote.feedback.FeedbackAdvertItem;
import com.avito.android.remote.model.messenger.context_actions.PlatformActions;
import com.avito.android.remote.model.notification.NotificationOpenAtTab;
import com.avito.android.ui.fragments.TabBaseFragment;
import com.avito.android.util.C35974x2;
import com.avito.android.util.V2;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import md.InterfaceC44055a;
import ru.avito.messenger.C47733d;
import ru.avito.messenger.C47743i;
import y30.InterfaceC50050d;
import z1.AbstractC50339a;

/* compiled from: ChannelActivityFragment.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\b\u0012\u0004\u0012\u00020\u00060\u00052\u00020\u0007:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/messenger/conversation/ChannelActivityFragment;", "Lcom/avito/android/ui/fragments/TabBaseFragment;", "Lcom/avito/android/messenger/conversation/Y1;", "Lcom/avito/android/messenger/conversation/create/s;", "Lcom/avito/android/ui/fragments/c;", "Lmd/a;", "Lcom/avito/android/messenger/di/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"DS_TCH_BDGT_ARCHITECTURE [Forbidden]", "DS_TCH_BDGT_ARCHITECTURE [Deprecated]", "NonComposeScreen"})
/* loaded from: classes15.dex */
public final class ChannelActivityFragment extends TabBaseFragment implements Y1, com.avito.android.messenger.conversation.create.s, com.avito.android.ui.fragments.c, InterfaceC44055a<InterfaceC32419a>, InterfaceC28477j.b {

    /* renamed from: G0, reason: collision with root package name */
    @Y61.k
    public static final a f188908G0 = new a(null);

    /* renamed from: A0, reason: collision with root package name */
    @Inject
    public InterfaceC50050d f188909A0;

    /* renamed from: B0, reason: collision with root package name */
    @Inject
    public C47743i f188910B0;

    /* renamed from: C0, reason: collision with root package name */
    @Y61.k
    public final androidx.view.O0 f188911C0;

    /* renamed from: D0, reason: collision with root package name */
    public ChannelActivityArguments f188912D0;

    /* renamed from: E0, reason: collision with root package name */
    public InterfaceC32419a f188913E0;

    /* renamed from: F0, reason: collision with root package name */
    @Y61.k
    public final NavigationState f188914F0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public com.avito.android.feedback_adverts.c f188915t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public PhotoGalleryIntentFactory f188916u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f188917v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public C30277e1 f188918w0;

    /* renamed from: x0, reason: collision with root package name */
    @Inject
    public com.avito.android.I1 f188919x0;

    /* renamed from: y0, reason: collision with root package name */
    @Inject
    public com.avito.android.analytics.provider.e f188920y0;

    /* renamed from: z0, reason: collision with root package name */
    @Inject
    public InterfaceC32572u f188921z0;

    /* compiled from: ChannelActivityFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/ChannelActivityFragment$a;", "", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ChannelActivityFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lru/avito/messenger/d;", "kotlin.jvm.PlatformType", "invoke", "()Lru/avito/messenger/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<C47733d> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final C47733d invoke() {
            C47743i c47743i = ChannelActivityFragment.this.f188910B0;
            if (c47743i == null) {
                c47743i = null;
            }
            return (C47733d) c47743i.get();
        }
    }

    /* compiled from: LiveDatas.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "onChanged", "(Ljava/lang/Object;)V", "ru/avito/messenger/f", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements InterfaceC23040h0 {
        public c() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.view.InterfaceC23040h0
        public final void onChanged(T t12) {
            if (t12 != 0) {
                ChannelActivityFragment.this.close();
            }
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends kotlin.jvm.internal.N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f188924l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y41.a aVar) {
            super(0);
            this.f188924l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f188924l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends kotlin.jvm.internal.N implements Y41.a<Fragment> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return ChannelActivityFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends kotlin.jvm.internal.N implements Y41.a<androidx.view.T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ e f188926l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e eVar) {
            super(0);
            this.f188926l = eVar;
        }

        @Override // Y41.a
        public final androidx.view.T0 invoke() {
            return (androidx.view.T0) this.f188926l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends kotlin.jvm.internal.N implements Y41.a<androidx.view.S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f188927l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f188927l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final androidx.view.S0 invoke() {
            return ((androidx.view.T0) this.f188927l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends kotlin.jvm.internal.N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f188928l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f188928l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            androidx.view.T0 t02 = (androidx.view.T0) this.f188928l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    public ChannelActivityFragment() {
        super(0, 1, null);
        d dVar = new d(new b());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new f(new e()));
        this.f188911C0 = new androidx.view.O0(kotlin.jvm.internal.m0.f406844a.b(C47733d.class), new g(interfaceC42726CB), dVar, new h(interfaceC42726CB));
        this.f188914F0 = new NavigationState(false, null, 2, null);
    }

    @Override // com.avito.android.messenger.conversation.Y1
    public final void D2(@Y61.k c.a aVar) {
        com.avito.android.feedback_adverts.c cVar = this.f188915t0;
        if (cVar == null) {
            cVar = null;
        }
        startActivityForResult(cVar.a(aVar), 1);
    }

    public final void D5() {
        Bundle arguments = getArguments();
        ChannelActivityArguments channelActivityArguments = arguments != null ? (ChannelActivityArguments) arguments.getParcelable("arguments") : null;
        if (channelActivityArguments != null) {
            this.f188912D0 = channelActivityArguments;
        } else {
            throw new IllegalArgumentException(("arguments was not passed to " + this).toString());
        }
    }

    public final void E5() {
        ChannelActivityArguments channelActivityArguments = this.f188912D0;
        if (channelActivityArguments == null) {
            channelActivityArguments = null;
        }
        if (!(channelActivityArguments instanceof ChannelActivityArguments.Open)) {
            if (channelActivityArguments instanceof ChannelActivityArguments.Create) {
                androidx.fragment.app.H hE2 = getChildFragmentManager().e();
                CreateChannelFragment.f189497n0.getClass();
                CreateChannelFragment createChannelFragment = new CreateChannelFragment();
                Bundle bundle = new Bundle();
                bundle.putParcelable("create_channel_params", (ChannelActivityArguments.Create) channelActivityArguments);
                createChannelFragment.setArguments(bundle);
                hE2.n(R.id.fragment_container, createChannelFragment, "ChannelFragment");
                hE2.e();
                return;
            }
            return;
        }
        androidx.fragment.app.H hE3 = getChildFragmentManager().e();
        ChannelFragment.a aVar = ChannelFragment.f188932o3;
        ChannelActivityArguments.Open open = (ChannelActivityArguments.Open) channelActivityArguments;
        String str = open.f188897b;
        aVar.getClass();
        Bundle bundle2 = new Bundle(1);
        bundle2.putString("channelId", str);
        bundle2.putString(PlatformActions.MESSAGE_ID, open.f188899d);
        bundle2.putString("searchQuery", open.f188900e);
        Integer num = open.f188898c;
        if (num != null) {
            bundle2.putInt("numberInList", num.intValue());
        }
        bundle2.putBoolean("sendDraftMessageImmediately", open.f188902g);
        bundle2.putString("xHash", open.f188903h);
        bundle2.putParcelable("key_performance_params", open.f188905j);
        bundle2.putString("flowId", open.f188904i);
        ChannelFragment channelFragment = new ChannelFragment();
        channelFragment.setArguments(bundle2);
        hE3.n(R.id.fragment_container, channelFragment, "ChannelFragment");
        hE3.e();
    }

    @Override // com.avito.android.messenger.conversation.Y1
    public final void F(int i12, @Y61.k String str, @Y61.k List list) {
        PhotoGalleryIntentFactory photoGalleryIntentFactory = this.f188916u0;
        if (photoGalleryIntentFactory == null) {
            photoGalleryIntentFactory = null;
        }
        C30277e1 c30277e1 = this.f188918w0;
        C30277e1 c30277e12 = c30277e1 != null ? c30277e1 : null;
        c30277e12.getClass();
        kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[52];
        startActivity(photoGalleryIntentFactory.b(list, i12, ((Boolean) c30277e12.f144997Z.a().invoke()).booleanValue(), new PhotoGalleryIntentFactory.AnalyticsParameters(str)));
    }

    @Override // com.avito.android.messenger.conversation.create.s
    public final void M(@Y61.k String str, boolean z12, @Y61.l String str2, @Y61.l ChannelActivityArguments.PerformanceParams performanceParams) {
        B5(-1, null);
        Bundle bundle = new Bundle();
        bundle.putParcelable("arguments", new ChannelActivityArguments.Open(str, null, null, null, false, z12, str2, null, performanceParams, 144, null));
        setArguments(bundle);
        D5();
        E5();
    }

    @Override // com.avito.android.messenger.conversation.Y1
    public final void P4(@Y61.k String str) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("up_intent", null);
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f188917v0;
        if (aVar == null) {
            aVar = null;
        }
        b.a.a(aVar, new MyAdvertDetailsLink(str, null, false, 6, null), null, bundle, 2);
    }

    @Override // com.avito.android.messenger.conversation.Y1
    public final void Z(@Y61.k String str, boolean z12) {
        com.avito.android.analytics.provider.e eVar = this.f188920y0;
        if (eVar == null) {
            eVar = null;
        }
        long jA2 = eVar.a();
        ScreenIdField screenIdField = ScreenIdField.f90251c;
        TreeClickStreamParent treeClickStreamParent = new TreeClickStreamParent(jA2, "msg_recommendations", null, null);
        if (!z12) {
            treeClickStreamParent = null;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("click_time", SystemClock.elapsedRealtime());
        if (treeClickStreamParent != null) {
            bundle.putParcelable("tree_parent", treeClickStreamParent);
        }
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f188917v0;
        if (aVar == null) {
            aVar = null;
        }
        b.a.a(aVar, new AdvertDetailsLink(str, null, null, null, null, null, null, null, null, null, null, 2044, null), null, bundle, 2);
    }

    @Override // com.avito.android.messenger.conversation.Y1
    public final void close() {
        com.avito.android.I1 i12 = this.f188919x0;
        if (i12 == null) {
            i12 = null;
        }
        if (i12.v().invoke().booleanValue() && !(l1() instanceof ChannelActivity)) {
            r5();
            return;
        }
        com.avito.android.ui.activity.a aVar = (com.avito.android.ui.activity.a) requireActivity();
        Intent intent = aVar.f304538c;
        if (intent != null) {
            C35974x2.d(intent);
            try {
                aVar.startActivity(intent);
            } catch (Exception e12) {
                V2.f318762a.a("ChannelActivity", "Unable to start up intent", e12);
            }
        }
        aVar.finish();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final a.g e5() {
        return new com.avito.android.employee_stub_impl.view.a(this, (com.avito.android.deeplink_handler.view.impl.i) super.e5(), 1);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final a.i f5() {
        return new a2(requireActivity());
    }

    @Override // com.avito.android.ui.fragments.c
    public final boolean i0() {
        return false;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final boolean j5() {
        C30277e1 c30277e1 = this.f188918w0;
        if (c30277e1 == null) {
            c30277e1 = null;
        }
        c30277e1.getClass();
        kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[91];
        return ((Boolean) c30277e1.f144970L0.a().invoke()).booleanValue();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onActivityResult(int i12, int i13, @Y61.l Intent intent) {
        FeedbackAdvertItem feedbackAdvertItem;
        super.onActivityResult(i12, i13, intent);
        if (i12 != 1 || intent == null || (feedbackAdvertItem = (FeedbackAdvertItem) intent.getParcelableExtra("item")) == null) {
            return;
        }
        Fragment fragmentH = getChildFragmentManager().H("ChannelFragment");
        ChannelFragment channelFragment = fragmentH instanceof ChannelFragment ? (ChannelFragment) fragmentH : null;
        if (channelFragment == null || !channelFragment.isAdded()) {
            return;
        }
        SendMessagePresenter sendMessagePresenter = channelFragment.f188939G0;
        (sendMessagePresenter != null ? sendMessagePresenter : null).bN(feedbackAdvertItem);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(@Y61.k Context context) {
        super.onAttach(context);
        InterfaceC32419a interfaceC32419aA = C32453l0.a().a((InterfaceC32422b) C29972i.a(C29972i.b(this), InterfaceC32422b.class), (InterfaceC30106l7) C29972i.a(C29972i.b(this), InterfaceC30106l7.class), cv.c.b(this), ChannelScreen.f90318d, this);
        this.f188913E0 = interfaceC32419aA;
        interfaceC32419aA.a(this);
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment, com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        D5();
        if (bundle == null) {
            InterfaceC50050d interfaceC50050d = this.f188909A0;
            if (interfaceC50050d == null) {
                interfaceC50050d = null;
            }
            interfaceC50050d.b(kotlin.jvm.internal.m0.f406844a.b(NotificationOpenAtTab.Messenger.class));
            E5();
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_container, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        InterfaceC32572u interfaceC32572u = this.f188921z0;
        if (interfaceC32572u == null) {
            interfaceC32572u = null;
        }
        interfaceC32572u.b("ChannelActivity");
        super.onPause();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        InterfaceC32572u interfaceC32572u = this.f188921z0;
        if (interfaceC32572u == null) {
            interfaceC32572u = null;
        }
        interfaceC32572u.a("ChannelActivity");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        C47733d c47733d = (C47733d) this.f188911C0.getValue();
        c47733d.f430743J.observe(getViewLifecycleOwner(), new c());
    }

    @Override // com.avito.android.messenger.conversation.Y1, com.avito.android.messenger.conversation.create.s
    public final void p(int i12) {
        com.avito.android.I1 i13 = this.f188919x0;
        if (i13 == null) {
            i13 = null;
        }
        if (!i13.v().invoke().booleanValue() || (l1() instanceof ChannelActivity)) {
            requireActivity().setResult(i12);
        } else {
            B5(i12, null);
        }
        close();
    }

    @Override // md.InterfaceC44055a
    public final InterfaceC32419a r0() {
        InterfaceC32419a interfaceC32419a = this.f188913E0;
        if (interfaceC32419a == null) {
            return null;
        }
        return interfaceC32419a;
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment
    @Y61.k
    /* renamed from: s5, reason: from getter */
    public final NavigationState getF173252U0() {
        return this.f188914F0;
    }
}
