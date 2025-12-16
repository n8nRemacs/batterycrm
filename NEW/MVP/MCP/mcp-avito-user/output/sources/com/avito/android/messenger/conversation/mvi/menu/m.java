package com.avito.android.messenger.conversation.mvi.menu;

import android.content.res.Resources;
import androidx.compose.runtime.internal.P;
import arrow.core.Y0;
import com.avito.android.R;
import com.avito.android.ab_tests.groups.MessengerFolderTabsTestGroup;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.DeleteChannelLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.deep_linking.links.PinChannelLink;
import com.avito.android.deep_linking.links.UnpinChannelLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.messenger.conversation.mvi.in_app_calls.ChannelIacInteractor;
import com.avito.android.messenger.conversation.mvi.menu.InterfaceC32109a;
import com.avito.android.messenger.conversation.mvi.menu.t;
import com.avito.android.messenger.conversation.mvi.send.C32216i;
import com.avito.android.messenger.conversation.mvi.send.InterfaceC32208e;
import com.avito.android.messenger.conversation.mvi.send.Onboarding;
import com.avito.android.mvi.rx3.with_monolithic_state.AbstractC32892c;
import com.avito.android.mvi.rx3.with_monolithic_state.C32890a;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.messenger.Channel;
import com.avito.android.remote.model.messenger.ChannelDisplayInfo;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.messenger.context.ChannelMenuAction;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import java.io.Serializable;
import java.util.List;
import java.util.SortedSet;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kv.C43501a;

/* compiled from: ChannelMenuPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0004\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/menu/m;", "Lcom/avito/android/messenger/conversation/mvi/menu/l;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/c;", "Lcom/avito/android/messenger/conversation/mvi/menu/t$e;", "k", "l", "m", "n", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class m extends AbstractC32892c<t.e> implements com.avito.android.messenger.conversation.mvi.menu.l {

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32109a f191459V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public final ChannelIacInteractor f191460W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32208e f191461X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.blacklist_reasons.m f191462Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public final Resources f191463Z;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35741a1 f191464a0;

    /* renamed from: b0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f191465b0;

    /* renamed from: c0, reason: collision with root package name */
    @Y61.k
    public final JY.a f191466c0;

    /* renamed from: d0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f191467d0;

    /* renamed from: e0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<G0> f191468e0;

    /* renamed from: f0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<Boolean> f191469f0;

    /* renamed from: g0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<G0> f191470g0;

    /* renamed from: h0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<PrintableText> f191471h0;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f191472i0;

    /* compiled from: ChannelMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/printable_text/PrintableText;", "errorMessage", "Lkotlin/G0;", "accept", "(Lcom/avito/android/printable_text/PrintableText;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            m.this.f191471h0.postValue((PrintableText) obj);
        }
    }

    /* compiled from: ChannelMenuPresenter.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u000b\u0010\u0002\u001a\u00070\u0000¢\u0006\u0002\b\u00012\u000b\u0010\u0003\u001a\u00070\u0000¢\u0006\u0002\b\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/menu/a$a;", "Lj41/e;", "prev", "cur", "", "test", "(Lcom/avito/android/messenger/conversation/mvi/menu/a$a;Lcom/avito/android/messenger/conversation/mvi/menu/a$a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T1, T2> implements l41.d {
        @Override // l41.d
        public final boolean a(Object obj, Object obj2) {
            InterfaceC32109a.AbstractC5655a abstractC5655a = (InterfaceC32109a.AbstractC5655a) obj;
            InterfaceC32109a.AbstractC5655a abstractC5655a2 = (InterfaceC32109a.AbstractC5655a) obj2;
            if (abstractC5655a.getClass().equals(abstractC5655a2.getClass()) && L.f(abstractC5655a.getF191422a(), abstractC5655a2.getF191422a())) {
                Channel f191423b = abstractC5655a.getF191423b();
                ChannelDisplayInfo displayInfo = f191423b != null ? f191423b.getDisplayInfo() : null;
                Channel f191423b2 = abstractC5655a2.getF191423b();
                if (L.f(displayInfo, f191423b2 != null ? f191423b2.getDisplayInfo() : null)) {
                    Channel f191423b3 = abstractC5655a.getF191423b();
                    ChannelContext context = f191423b3 != null ? f191423b3.getContext() : null;
                    Channel f191423b4 = abstractC5655a2.getF191423b();
                    if (L.f(context, f191423b4 != null ? f191423b4.getContext() : null)) {
                        Channel f191423b5 = abstractC5655a.getF191423b();
                        SortedSet<String> tags = f191423b5 != null ? f191423b5.getTags() : null;
                        Channel f191423b6 = abstractC5655a2.getF191423b();
                        if (L.f(tags, f191423b6 != null ? f191423b6.getTags() : null)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
    }

    /* compiled from: ChannelMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/menu/a$a;", "menuInteractorState", "", "isPinnedChannelsOnboardingNeeded", "Lkotlin/Q;", "apply", "(Lcom/avito/android/messenger/conversation/mvi/menu/a$a;Z)Lkotlin/Q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T1, T2, R> implements l41.c {

        /* renamed from: b, reason: collision with root package name */
        public static final c<T1, T2, R> f191474b = new c<>();

        @Override // l41.c
        public final Object apply(Object obj, Object obj2) {
            Boolean bool = (Boolean) obj2;
            bool.booleanValue();
            return new Q((InterfaceC32109a.AbstractC5655a) obj, bool);
        }
    }

    /* compiled from: ChannelMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Q;", "Lcom/avito/android/messenger/conversation/mvi/menu/a$a;", "", "<name for destructuring parameter 0>", "Lkotlin/G0;", "accept", "(Lkotlin/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements l41.g {
        public d() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // l41.g
        public final void accept(Object obj) {
            Q q12 = (Q) obj;
            InterfaceC32109a.AbstractC5655a abstractC5655a = (InterfaceC32109a.AbstractC5655a) q12.f406619b;
            boolean zBooleanValue = ((Boolean) q12.f406620c).booleanValue();
            m mVar = m.this;
            mVar.le().s(mVar.new k(abstractC5655a, zBooleanValue));
        }
    }

    /* compiled from: ChannelMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e<T> implements l41.g {
        public e() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            m.this.f191468e0.postValue(G0.f406611a);
        }
    }

    /* compiled from: ChannelMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "it", "", "apply", "(Lkv/a;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final f<T, R> f191477b = new f<>();

        @Override // l41.o
        public final /* bridge */ /* synthetic */ Object apply(Object obj) {
            return Boolean.FALSE;
        }
    }

    /* compiled from: ChannelMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/G0;", "it", "", "apply", "(Lkotlin/G0;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final g<T, R> f191478b = new g<>();

        @Override // l41.o
        public final /* bridge */ /* synthetic */ Object apply(Object obj) {
            return Boolean.TRUE;
        }
    }

    /* compiled from: ChannelMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "showToast", "Lkotlin/G0;", "accept", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h<T> implements l41.g {
        public h() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            m.this.f191469f0.postValue(bool);
        }
    }

    /* compiled from: ChannelMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i<T> implements l41.g {
        public i() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            m.this.f191470g0.postValue(G0.f406611a);
        }
    }

    /* compiled from: ChannelMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/printable_text/PrintableText;", "error", "", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class j<T, R> implements l41.o {
        public j() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return InterfaceC35741a1.a.a(m.this.f191464a0, (Throwable) obj, null, null, 6);
        }
    }

    /* compiled from: ChannelMenuPresenter.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/menu/m$k;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/conversation/mvi/menu/t$e;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class k extends com.avito.android.mvi.rx3.with_monolithic_state.o<t.e> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final InterfaceC32109a.AbstractC5655a f191482d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f191483e;

        public k(@Y61.k InterfaceC32109a.AbstractC5655a abstractC5655a, boolean z12) {
            super("NewInteractorStateMutator(" + abstractC5655a + ')', null, 2, null);
            this.f191482d = abstractC5655a;
            this.f191483e = z12;
        }

        /* JADX WARN: Removed duplicated region for block: B:192:0x04db  */
        /* JADX WARN: Removed duplicated region for block: B:350:0x08e1  */
        /* JADX WARN: Removed duplicated region for block: B:471:0x0c0f  */
        /* JADX WARN: Removed duplicated region for block: B:636:0x1001  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x01ad  */
        /* JADX WARN: Removed duplicated region for block: B:757:0x132f  */
        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        @Y61.k
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.avito.android.messenger.conversation.mvi.menu.t.e d(@Y61.k com.avito.android.messenger.conversation.mvi.menu.t.e r82) {
            /*
                Method dump skipped, instructions count: 6030
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.conversation.mvi.menu.m.k.d(com.avito.android.messenger.conversation.mvi.menu.t$e):com.avito.android.messenger.conversation.mvi.menu.t$e");
        }
    }

    /* compiled from: ChannelMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/menu/m$l;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/conversation/mvi/menu/t$e;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class l extends com.avito.android.mvi.rx3.with_monolithic_state.o<t.e> {
        public l() {
            throw null;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final t.e d(t.e eVar) {
            t.e eVar2 = eVar;
            if (eVar2 instanceof t.e.c) {
                t.e.c cVar = (t.e.c) eVar2;
                return new t.e.b(cVar.f191530a, ((t.e.c) eVar2).f191531b);
            }
            if ((eVar2 instanceof t.e.b) || eVar2.equals(t.e.a.f191527a)) {
                return eVar2;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: ChannelMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/menu/m$m;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/a;", "Lcom/avito/android/messenger/conversation/mvi/menu/t$e;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.menu.m$m, reason: collision with other inner class name */
    public final class C5657m extends C32890a<t.e> {
        public C5657m() {
            super(null, null, 3, null);
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.C32890a
        public final void b(t.e eVar) {
            Action f191523b;
            t.d dVarC = eVar.getF191530a().f191505a.c();
            DeepLink deepLink = (dVarC == null || (f191523b = dVarC.getF191523b()) == null) ? null : f191523b.getDeepLink();
            m mVar = m.this;
            if (deepLink == null || (deepLink instanceof NoMatchLink)) {
                mVar.f191471h0.postValue(com.avito.android.printable_text.b.c(R.string.messenger_profile_is_not_available, new Serializable[0]));
                return;
            }
            String f191524c = dVarC.getF191524c();
            if (f191524c != null) {
                mVar.f191459V.i9(f191524c);
            }
            b.a.a(mVar.f191465b0, deepLink, null, null, 6);
        }
    }

    /* compiled from: ChannelMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/menu/m$n;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/conversation/mvi/menu/t$e;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class n extends com.avito.android.mvi.rx3.with_monolithic_state.o<t.e> {
        public n() {
            super(null, null, 3, null);
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final t.e d(t.e eVar) {
            t.e eVar2 = eVar;
            if (!(eVar2 instanceof t.e.b)) {
                if (eVar2.equals(t.e.a.f191527a) || (eVar2 instanceof t.e.c)) {
                    return eVar2;
                }
                throw new NoWhenBranchMatchedException();
            }
            t.b bVar = ((t.e.b) eVar2).f191528a;
            List<t.c> list = bVar.f191506b;
            Y0<t.d> y02 = bVar.f191505a;
            boolean zIsEmpty = list.isEmpty();
            m mVar = m.this;
            if (zIsEmpty && y02.b()) {
                mVar.f191471h0.postValue(com.avito.android.printable_text.b.c(R.string.messenger_profile_is_not_available, new Serializable[0]));
                return eVar2;
            }
            mVar.f191459V.Q2();
            boolean z12 = ((t.e.b) eVar2).f191529b;
            if (z12) {
                mVar.f191462Y.J3(true);
            }
            return new t.e.c(bVar, z12, new com.avito.android.messenger.conversation.mvi.menu.n(mVar));
        }
    }

    /* compiled from: ChannelMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "resultEvent", "", "test", "(Lkv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class o<T> implements l41.r {

        /* renamed from: b, reason: collision with root package name */
        public static final o<T> f191487b = new o<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C43501a) obj).f413261b instanceof DeleteChannelLink.b.c;
        }
    }

    /* compiled from: ChannelMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class p extends N implements Y41.a<Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ u3.g<MessengerFolderTabsTestGroup> f191488l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(u3.g<MessengerFolderTabsTestGroup> gVar) {
            super(0);
            this.f191488l = gVar;
        }

        @Override // Y41.a
        public final Boolean invoke() {
            MessengerFolderTabsTestGroup messengerFolderTabsTestGroup = this.f191488l.f439742a.f439749b;
            messengerFolderTabsTestGroup.getClass();
            return Boolean.valueOf(messengerFolderTabsTestGroup == MessengerFolderTabsTestGroup.f67952d);
        }
    }

    @Inject
    public m(@Y61.k InterfaceC32109a interfaceC32109a, @Y61.k ChannelIacInteractor channelIacInteractor, @Y61.k InterfaceC32208e interfaceC32208e, @Y61.k com.avito.android.messenger.blacklist_reasons.m mVar, @Y61.k Resources resources, @Y61.k InterfaceC35741a1 interfaceC35741a1, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k JY.a aVar2, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k u3.g<MessengerFolderTabsTestGroup> gVar) {
        super("ChannelMenuPresenter", t.e.a.f191527a, interfaceC35745a5, null, null, null, null, null, 248, null);
        this.f191459V = interfaceC32109a;
        this.f191460W = channelIacInteractor;
        this.f191461X = interfaceC32208e;
        this.f191462Y = mVar;
        this.f191463Z = resources;
        this.f191464a0 = interfaceC35741a1;
        this.f191465b0 = aVar;
        this.f191466c0 = aVar2;
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        this.f191467d0 = cVar;
        this.f191468e0 = new com.avito.android.util.architecture_components.D<>();
        this.f191469f0 = new com.avito.android.util.architecture_components.D<>();
        this.f191470g0 = new com.avito.android.util.architecture_components.D<>();
        this.f191471h0 = new com.avito.android.util.architecture_components.D<>();
        this.f191472i0 = C42727D.c(new p(gVar));
        cVar.b(interfaceC32109a.M0().j0(interfaceC35745a5.c()).B(new b()).I0(C32216i.a(interfaceC32208e, Onboarding.f194326e), c.f191474b).t0(new d()));
        io.reactivex.rxjava3.core.z zVarB = com.avito.android.util.rx3.arrow.a.b(interfaceC32109a.Z().j0(interfaceC35745a5.c()));
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        cVar.b(zVarB.C0(12000L, timeUnit, interfaceC35745a5.c()).t0(new e()));
        cVar.b(io.reactivex.rxjava3.core.z.g0(aVar.d9().N(o.f191487b).d0(f.f191477b), com.avito.android.util.rx3.arrow.a.b(interfaceC32109a.D0()).d0(g.f191478b)).j0(interfaceC35745a5.c()).C0(12000L, timeUnit, interfaceC35745a5.c()).t0(new h()));
        cVar.b(com.avito.android.util.rx3.arrow.a.b(interfaceC32109a.D1()).j0(interfaceC35745a5.c()).t0(new i()));
        cVar.b(io.reactivex.rxjava3.core.z.e0(com.avito.android.util.rx3.arrow.a.a(interfaceC32109a.D0()), com.avito.android.util.rx3.arrow.a.a(interfaceC32109a.Z()), com.avito.android.util.rx3.arrow.a.a(interfaceC32109a.D1())).j0(interfaceC35745a5.c()).d0(new j()).t0(new a()));
    }

    public static final boolean pe(m mVar, ChannelMenuAction channelMenuAction) {
        mVar.getClass();
        return (channelMenuAction.getDeepLink() instanceof PinChannelLink) || (channelMenuAction.getDeepLink() instanceof UnpinChannelLink);
    }

    @Override // com.avito.android.messenger.conversation.mvi.menu.l
    /* renamed from: D0, reason: from getter */
    public final com.avito.android.util.architecture_components.D getF191469f0() {
        return this.f191469f0;
    }

    @Override // com.avito.android.messenger.conversation.mvi.menu.l
    /* renamed from: D1, reason: from getter */
    public final com.avito.android.util.architecture_components.D getF191470g0() {
        return this.f191470g0;
    }

    @Override // com.avito.android.messenger.conversation.mvi.menu.l
    public final void Q5() {
        le().s(new n());
    }

    @Override // com.avito.android.messenger.conversation.mvi.menu.l
    /* renamed from: T, reason: from getter */
    public final com.avito.android.util.architecture_components.D getF191471h0() {
        return this.f191471h0;
    }

    @Override // com.avito.android.messenger.conversation.mvi.menu.l
    /* renamed from: Z, reason: from getter */
    public final com.avito.android.util.architecture_components.D getF191468e0() {
        return this.f191468e0;
    }

    @Override // com.avito.android.mvi.rx3.with_monolithic_state.AbstractC32892c, androidx.view.M0
    public final void onCleared() {
        this.f191467d0.e();
        super.onCleared();
    }

    @Override // com.avito.android.messenger.conversation.mvi.menu.l
    public final void q1(@Y61.k String str) {
        this.f191459V.q1(str);
    }

    @Override // com.avito.android.messenger.conversation.mvi.menu.l
    public final void v9() {
        le().s(new C5657m());
    }
}
