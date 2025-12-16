package com.avito.android.messenger.conversation.mvi.platform_actions;

import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.deep_linking.links.UnsupportedPlatformActionLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.messenger.analytics.J;
import com.avito.android.messenger.analytics.K;
import com.avito.android.messenger.conversation.mvi.context.InterfaceC31987a;
import com.avito.android.messenger.conversation.mvi.in_app_calls.ChannelIacInteractor;
import com.avito.android.messenger.conversation.mvi.messages.InterfaceC32129a;
import com.avito.android.messenger.conversation.mvi.platform_actions.f;
import com.avito.android.messenger.deeplink.ChannelIacCallLink;
import com.avito.android.messenger.deeplink.IacSellerChannelCallLinkV1;
import com.avito.android.messenger.deeplink.IacSellerChannelCallLinkV2;
import com.avito.android.multi_message_send.ab_test.MultiMessageSendTestGroup;
import com.avito.android.mvi.rx3.with_monolithic_state.AbstractC32892c;
import com.avito.android.mvi.rx3.with_monolithic_state.C32890a;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.RawJson;
import com.avito.android.remote.model.messenger.ActionConfirmation;
import com.avito.android.remote.model.messenger.context_actions.ContextAction;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.messenger.context_actions.ItemsRequest;
import com.avito.android.remote.model.messenger.context_actions.PlatformActions;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import com.avito.android.util.architecture_components.D;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.internal.operators.single.U;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: PlatformActionsPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003:\u000b\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/platform_actions/g;", "Lcom/avito/android/messenger/conversation/mvi/platform_actions/f;", "Lcom/avito/android/messenger/conversation/mvi/common/d;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/c;", "Lcom/avito/android/messenger/conversation/mvi/platform_actions/f$f;", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g extends AbstractC32892c<f.InterfaceC5732f> implements com.avito.android.messenger.conversation.mvi.platform_actions.f, com.avito.android.messenger.conversation.mvi.common.d {

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32187a f193932V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public final InterfaceC31987a f193933W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public final ChannelIacInteractor f193934X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC32129a> f193935Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deep_linking.x f193936Z;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f193937a0;

    /* renamed from: b0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35741a1 f193938b0;

    /* renamed from: c0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f193939c0;

    /* renamed from: d0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.conversation.mvi.common.a f193940d0;

    /* renamed from: e0, reason: collision with root package name */
    @Y61.k
    public final D<PrintableText> f193941e0;

    /* renamed from: f0, reason: collision with root package name */
    @Y61.k
    public final D<Uri> f193942f0;

    /* renamed from: g0, reason: collision with root package name */
    @Y61.k
    public final D<String> f193943g0;

    /* renamed from: h0, reason: collision with root package name */
    @Y61.k
    public final D<G0> f193944h0;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.core.z<Boolean> f193945i0;

    /* renamed from: j0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f193946j0;

    /* compiled from: PlatformActionsPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/platform_actions/f$f;", VoiceInfo.STATE, "", "apply", "(Lcom/avito/android/messenger/conversation/mvi/platform_actions/f$f;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T, R> f193947b = new a<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            f.InterfaceC5732f interfaceC5732f = (f.InterfaceC5732f) obj;
            if (!(interfaceC5732f instanceof f.InterfaceC5732f.b.a.C5733a ? true : interfaceC5732f instanceof f.InterfaceC5732f.b.a.C5734b ? true : interfaceC5732f instanceof f.InterfaceC5732f.b.InterfaceC5735b.a ? true : interfaceC5732f instanceof f.InterfaceC5732f.b.InterfaceC5735b.C5736b ? true : interfaceC5732f instanceof f.InterfaceC5732f.b.c.a ? true : interfaceC5732f instanceof f.InterfaceC5732f.b.c.C5737b ? true : interfaceC5732f instanceof f.InterfaceC5732f.b.c.C5738c)) {
                if (!(interfaceC5732f.equals(f.InterfaceC5732f.a.f193899a) ? true : interfaceC5732f instanceof f.InterfaceC5732f.b.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* compiled from: PlatformActionsPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/platform_actions/g$b;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/n;", "Lcom/avito/android/messenger/conversation/mvi/platform_actions/f$f;", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class b extends com.avito.android.mvi.rx3.with_monolithic_state.n<f.InterfaceC5732f> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final Y41.a<List<com.avito.android.mvi.rx3.with_monolithic_state.x<f.InterfaceC5732f>>> f193948d;

        /* compiled from: PlatformActionsPresenter.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/platform_actions/g$b$a;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/p;", "Lcom/avito/android/messenger/conversation/mvi/platform_actions/f$f;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public final class a extends com.avito.android.mvi.rx3.with_monolithic_state.p<f.InterfaceC5732f> {

            /* renamed from: d, reason: collision with root package name */
            @Y61.k
            public final String f193950d;

            /* renamed from: e, reason: collision with root package name */
            @Y61.l
            public final RawJson f193951e;

            /* renamed from: f, reason: collision with root package name */
            @Y61.l
            public final ContextActionHandler.MethodCall.Reaction f193952f;

            public a(@Y61.k String str, @Y61.l RawJson rawJson, @Y61.l ContextActionHandler.MethodCall.Reaction reaction) {
                super("ActionMethodCallComposite.MethodCallMutator", "methodName = " + str + ", methodParams = " + rawJson + ", reaction=" + reaction);
                this.f193950d = str;
                this.f193951e = rawJson;
                this.f193952f = reaction;
            }

            @Override // com.avito.android.mvi.rx3.with_monolithic_state.p
            public final I<f.InterfaceC5732f> b(f.InterfaceC5732f interfaceC5732f) {
                final f.InterfaceC5732f interfaceC5732f2 = interfaceC5732f;
                boolean z12 = interfaceC5732f2 instanceof f.InterfaceC5732f.b.InterfaceC5735b.a;
                RawJson rawJson = this.f193951e;
                String str = this.f193950d;
                b bVar = b.this;
                if (z12) {
                    I<RawJson> iA2 = g.this.f193932V.a(str, rawJson);
                    final g gVar = g.this;
                    final int i12 = 0;
                    return iA2.z(gVar.f207140R).n(new com.avito.android.messenger.conversation.mvi.platform_actions.i(this, gVar, interfaceC5732f2)).u(new l41.o() { // from class: com.avito.android.messenger.conversation.mvi.platform_actions.h
                        @Override // l41.o
                        public final Object apply(Object obj) {
                            Throwable th2 = (Throwable) obj;
                            switch (i12) {
                                case 0:
                                    g gVar2 = gVar;
                                    gVar2.getClass();
                                    gVar2.f193941e0.postValue(InterfaceC35741a1.a.a(gVar2.f193938b0, com.avito.android.messenger.util.q.a(th2), null, null, 6));
                                    V2.f318762a.c(gVar2.f207131E, "Method call failed", th2);
                                    return g.oe(gVar2, (f.InterfaceC5732f.b.InterfaceC5735b.a) interfaceC5732f2);
                                default:
                                    g gVar3 = gVar;
                                    gVar3.getClass();
                                    gVar3.f193941e0.postValue(InterfaceC35741a1.a.a(gVar3.f193938b0, com.avito.android.messenger.util.q.a(th2), null, null, 6));
                                    V2.f318762a.c(gVar3.f207131E, "Method call failed", th2);
                                    return g.ne(gVar3, (f.InterfaceC5732f.b.a.C5733a) interfaceC5732f2);
                            }
                        }
                    });
                }
                if (!(interfaceC5732f2 instanceof f.InterfaceC5732f.b.a.C5733a)) {
                    return I.q(interfaceC5732f2);
                }
                I<RawJson> iA3 = g.this.f193932V.a(str, rawJson);
                final g gVar2 = g.this;
                final int i13 = 1;
                return iA3.z(gVar2.f207140R).n(new com.avito.android.messenger.conversation.mvi.platform_actions.j(this, gVar2, interfaceC5732f2)).u(new l41.o() { // from class: com.avito.android.messenger.conversation.mvi.platform_actions.h
                    @Override // l41.o
                    public final Object apply(Object obj) {
                        Throwable th2 = (Throwable) obj;
                        switch (i13) {
                            case 0:
                                g gVar22 = gVar2;
                                gVar22.getClass();
                                gVar22.f193941e0.postValue(InterfaceC35741a1.a.a(gVar22.f193938b0, com.avito.android.messenger.util.q.a(th2), null, null, 6));
                                V2.f318762a.c(gVar22.f207131E, "Method call failed", th2);
                                return g.oe(gVar22, (f.InterfaceC5732f.b.InterfaceC5735b.a) interfaceC5732f2);
                            default:
                                g gVar3 = gVar2;
                                gVar3.getClass();
                                gVar3.f193941e0.postValue(InterfaceC35741a1.a.a(gVar3.f193938b0, com.avito.android.messenger.util.q.a(th2), null, null, 6));
                                V2.f318762a.c(gVar3.f207131E, "Method call failed", th2);
                                return g.ne(gVar3, (f.InterfaceC5732f.b.a.C5733a) interfaceC5732f2);
                        }
                    }
                });
            }
        }

        /* compiled from: PlatformActionsPresenter.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "Lcom/avito/android/mvi/rx3/with_monolithic_state/x;", "Lcom/avito/android/messenger/conversation/mvi/platform_actions/f$f;", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.messenger.conversation.mvi.platform_actions.g$b$b, reason: collision with other inner class name */
        public static final class C5739b extends N implements Y41.a<List<? extends com.avito.android.mvi.rx3.with_monolithic_state.x<f.InterfaceC5732f>>> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ g f193954l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ b f193955m;

            /* renamed from: n, reason: collision with root package name */
            public final /* synthetic */ String f193956n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ RawJson f193957o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ ContextActionHandler.MethodCall.Reaction f193958p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5739b(g gVar, b bVar, String str, RawJson rawJson, ContextActionHandler.MethodCall.Reaction reaction) {
                super(0);
                this.f193954l = gVar;
                this.f193955m = bVar;
                this.f193956n = str;
                this.f193957o = rawJson;
                this.f193958p = reaction;
            }

            @Override // Y41.a
            public final List<? extends com.avito.android.mvi.rx3.with_monolithic_state.x<f.InterfaceC5732f>> invoke() {
                return C42745f0.U(this.f193954l.new h("ActionMethodCallComposite."), this.f193955m.new a(this.f193956n, this.f193957o, this.f193958p));
            }
        }

        public b(@Y61.k String str, @Y61.l RawJson rawJson, @Y61.l ContextActionHandler.MethodCall.Reaction reaction) {
            super(null, "methodName = " + str + ", methodParams = " + rawJson + ", reaction=" + reaction, null, 5, null);
            this.f193948d = new C5739b(g.this, this, str, rawJson, reaction);
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.n
        @Y61.k
        public final Y41.a<List<com.avito.android.mvi.rx3.with_monolithic_state.x<f.InterfaceC5732f>>> b() {
            return this.f193948d;
        }
    }

    /* compiled from: PlatformActionsPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/platform_actions/g$c;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/conversation/mvi/platform_actions/f$f;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class c extends com.avito.android.mvi.rx3.with_monolithic_state.o<f.InterfaceC5732f> {
        public c() {
            super(null, null, 3, null);
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final f.InterfaceC5732f d(f.InterfaceC5732f interfaceC5732f) {
            f.InterfaceC5732f interfaceC5732f2 = interfaceC5732f;
            f.InterfaceC5732f.b.c cVar = interfaceC5732f2 instanceof f.InterfaceC5732f.b.c ? (f.InterfaceC5732f.b.c) interfaceC5732f2 : null;
            if (cVar == null) {
                return interfaceC5732f2;
            }
            ContextActionHandler.MethodCall f193928c = cVar.getF193928c();
            if (f193928c != null) {
                g gVar = g.this;
                I<RawJson> iA2 = gVar.f193932V.a(f193928c.getMethod(), f193928c.getParams());
                iA2.getClass();
                gVar.f193946j0.b(new io.reactivex.rxjava3.internal.operators.completable.v(iA2).x(gVar.f207133K.a()).l(new com.avito.android.messenger.conversation.mvi.platform_actions.k(gVar)).r().u());
            }
            return new f.InterfaceC5732f.b.d(cVar.getF193931a());
        }
    }

    /* compiled from: PlatformActionsPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/platform_actions/g$d;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/conversation/mvi/platform_actions/f$f;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class d extends com.avito.android.mvi.rx3.with_monolithic_state.o<f.InterfaceC5732f> {
        public d() {
            throw null;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final f.InterfaceC5732f d(f.InterfaceC5732f interfaceC5732f) {
            f.InterfaceC5732f interfaceC5732f2 = interfaceC5732f;
            if (interfaceC5732f2 instanceof f.InterfaceC5732f.b.InterfaceC5735b.C5736b) {
                f.InterfaceC5732f.b.InterfaceC5735b.C5736b c5736b = (f.InterfaceC5732f.b.InterfaceC5735b.C5736b) interfaceC5732f2;
                f.e.a aVar = f.e.a.f193896a;
                return !L.f(c5736b.f193915d, aVar) ? f.InterfaceC5732f.b.InterfaceC5735b.C5736b.e(c5736b, aVar) : c5736b;
            }
            if (!(interfaceC5732f2 instanceof f.InterfaceC5732f.b.a.C5734b)) {
                return interfaceC5732f2;
            }
            f.InterfaceC5732f.b.a.C5734b c5734b = (f.InterfaceC5732f.b.a.C5734b) interfaceC5732f2;
            f.e.a aVar2 = f.e.a.f193896a;
            return !L.f(c5734b.f193908e, aVar2) ? f.InterfaceC5732f.b.a.C5734b.e(c5734b, aVar2) : c5734b;
        }
    }

    /* compiled from: PlatformActionsPresenter.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/platform_actions/g$e;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/p;", "Lcom/avito/android/messenger/conversation/mvi/platform_actions/f$f;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class e extends com.avito.android.mvi.rx3.with_monolithic_state.p<f.InterfaceC5732f> {
        public e() {
            super(null, null, 3, null);
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.p
        public final I<f.InterfaceC5732f> b(f.InterfaceC5732f interfaceC5732f) {
            f.InterfaceC5732f interfaceC5732f2 = interfaceC5732f;
            U u12 = null;
            f.InterfaceC5732f.b.c.C5738c c5738c = interfaceC5732f2 instanceof f.InterfaceC5732f.b.c.C5738c ? (f.InterfaceC5732f.b.c.C5738c) interfaceC5732f2 : null;
            if (c5738c != null) {
                g gVar = g.this;
                InterfaceC32187a interfaceC32187a = gVar.f193932V;
                ItemsRequest itemsRequest = c5738c.f193929d;
                u12 = interfaceC32187a.b(itemsRequest.getMethod(), itemsRequest.getParams()).r(new com.avito.android.messenger.conversation.mvi.platform_actions.l(gVar, c5738c, this)).u(new com.avito.android.iac_dialer_watcher.impl_module.logging.repository.d(3, gVar, c5738c));
            }
            return u12 == null ? I.q(interfaceC5732f2) : u12;
        }
    }

    /* compiled from: PlatformActionsPresenter.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/platform_actions/g$f;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/conversation/mvi/platform_actions/f$f;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class f extends com.avito.android.mvi.rx3.with_monolithic_state.o<f.InterfaceC5732f> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final f.c f193961d;

        public f(@Y61.k f.c cVar) {
            super(null, "data = " + cVar, 1, null);
            this.f193961d = cVar;
        }

        public static ArrayList e(PlatformActions.Actions actions, String str, String str2) {
            List<ContextAction> actions2 = actions.getActions();
            ArrayList arrayList = new ArrayList(C42745f0.q(actions2, 10));
            for (ContextAction contextAction : actions2) {
                String title = contextAction.getTitle();
                boolean zF2 = L.f(contextAction.getType(), "primary");
                f.b bVar = new f.b(contextAction.getHandler(), str, actions.getMessageId(), str2, contextAction.getAnalytics());
                ActionConfirmation confirmation = contextAction.getConfirmation();
                arrayList.add(new f.a(title, zF2, bVar, confirmation != null ? new f.d(confirmation.getTitle(), confirmation.getMessage(), confirmation.getConfirmButtonText(), confirmation.getCancelButtonText()) : null));
            }
            return arrayList;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0079  */
        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.avito.android.messenger.conversation.mvi.platform_actions.f.InterfaceC5732f d(com.avito.android.messenger.conversation.mvi.platform_actions.f.InterfaceC5732f r13) {
            /*
                Method dump skipped, instructions count: 249
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.conversation.mvi.platform_actions.g.f.d(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: PlatformActionsPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/platform_actions/g$g;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/conversation/mvi/platform_actions/f$f;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.platform_actions.g$g, reason: collision with other inner class name */
    public final class C5740g extends com.avito.android.mvi.rx3.with_monolithic_state.o<f.InterfaceC5732f> {
        public C5740g() {
            super(null, null, 3, null);
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final f.InterfaceC5732f d(f.InterfaceC5732f interfaceC5732f) {
            f.InterfaceC5732f interfaceC5732f2 = interfaceC5732f;
            f.InterfaceC5732f.b.c.C5737b c5737b = interfaceC5732f2 instanceof f.InterfaceC5732f.b.c.C5737b ? (f.InterfaceC5732f.b.c.C5737b) interfaceC5732f2 : null;
            if (c5737b == null) {
                return interfaceC5732f2;
            }
            g gVar = g.this;
            gVar.getClass();
            f.InterfaceC5732f.b.c.C5738c c5738c = new f.InterfaceC5732f.b.c.C5738c(c5737b.f193921a, c5737b.f193922b, c5737b.f193923c, c5737b.f193924d);
            gVar.le().s(gVar.new e());
            return c5738c;
        }
    }

    /* compiled from: PlatformActionsPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/platform_actions/g$i;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/conversation/mvi/platform_actions/f$f;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class i extends com.avito.android.mvi.rx3.with_monolithic_state.o<f.InterfaceC5732f> {
        public i() {
            super(null, null, 3, null);
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final f.InterfaceC5732f d(f.InterfaceC5732f interfaceC5732f) {
            f.InterfaceC5732f interfaceC5732f2 = interfaceC5732f;
            boolean z12 = interfaceC5732f2 instanceof f.InterfaceC5732f.b.InterfaceC5735b.a;
            g gVar = g.this;
            return z12 ? g.oe(gVar, (f.InterfaceC5732f.b.InterfaceC5735b.a) interfaceC5732f2) : interfaceC5732f2 instanceof f.InterfaceC5732f.b.a.C5733a ? g.ne(gVar, (f.InterfaceC5732f.b.a.C5733a) interfaceC5732f2) : interfaceC5732f2;
        }
    }

    /* compiled from: PlatformActionsPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/platform_actions/g$j;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/conversation/mvi/platform_actions/f$f;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class j extends com.avito.android.mvi.rx3.with_monolithic_state.o<f.InterfaceC5732f> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final f.a f193966d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final f.d f193967e;

        public j(@Y61.k f.a aVar, @Y61.k f.d dVar) {
            super(null, "actionButtonAwaitingConfirmation = " + aVar, 1, null);
            this.f193966d = aVar;
            this.f193967e = dVar;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final f.InterfaceC5732f d(f.InterfaceC5732f interfaceC5732f) {
            f.InterfaceC5732f interfaceC5732f2 = interfaceC5732f;
            boolean z12 = interfaceC5732f2 instanceof f.InterfaceC5732f.b.InterfaceC5735b.C5736b;
            f.a aVar = this.f193966d;
            f.d dVar = this.f193967e;
            return z12 ? f.InterfaceC5732f.b.InterfaceC5735b.C5736b.e((f.InterfaceC5732f.b.InterfaceC5735b.C5736b) interfaceC5732f2, new f.e.b(aVar, dVar)) : interfaceC5732f2 instanceof f.InterfaceC5732f.b.a.C5734b ? f.InterfaceC5732f.b.a.C5734b.e((f.InterfaceC5732f.b.a.C5734b) interfaceC5732f2, new f.e.b(aVar, dVar)) : interfaceC5732f2;
        }
    }

    /* compiled from: PlatformActionsPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/platform_actions/g$k;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/a;", "Lcom/avito/android/messenger/conversation/mvi/platform_actions/f$f;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class k extends C32890a<f.InterfaceC5732f> {
        public k() {
            super(null, null, 3, null);
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.C32890a
        public final void b(f.InterfaceC5732f interfaceC5732f) {
            String str;
            f.InterfaceC5732f interfaceC5732f2 = interfaceC5732f;
            f.InterfaceC5732f.b bVar = interfaceC5732f2 instanceof f.InterfaceC5732f.b ? (f.InterfaceC5732f.b) interfaceC5732f2 : null;
            if (bVar == null || (str = bVar.getF193931a().f193890c) == null) {
                return;
            }
            g.this.f193939c0.c(new J(bVar.getF193931a().f193889b, str));
        }
    }

    /* compiled from: PlatformActionsPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/platform_actions/g$l;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/a;", "Lcom/avito/android/messenger/conversation/mvi/platform_actions/f$f;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class l extends C32890a<f.InterfaceC5732f> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f193969d;

        public l(@Y61.k String str) {
            super(null, null, 3, null);
            this.f193969d = str;
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.C32890a
        public final void b(f.InterfaceC5732f interfaceC5732f) {
            f.InterfaceC5732f interfaceC5732f2 = interfaceC5732f;
            f.InterfaceC5732f.b bVar = interfaceC5732f2 instanceof f.InterfaceC5732f.b ? (f.InterfaceC5732f.b) interfaceC5732f2 : null;
            if (bVar != null) {
                g.this.f193939c0.c(new K(bVar.getF193931a().f193889b, this.f193969d));
            }
        }
    }

    @Inject
    public g(@Y61.k InterfaceC32187a interfaceC32187a, @Y61.k InterfaceC31987a interfaceC31987a, @Y61.k ChannelIacInteractor channelIacInteractor, @Y61.k h31.e<InterfaceC32129a> eVar, @Y61.k com.avito.android.deep_linking.x xVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k InterfaceC35741a1 interfaceC35741a1, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.messenger.conversation.mvi.common.a aVar2, @x20.d @Y61.k u3.l<MultiMessageSendTestGroup> lVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.mvi.rx3.with_monolithic_state.t<f.InterfaceC5732f> tVar) {
        super("PlatformActionsPresenter", f.InterfaceC5732f.a.f193899a, interfaceC35745a5, null, tVar, null, null, null, 232, null);
        this.f193932V = interfaceC32187a;
        this.f193933W = interfaceC31987a;
        this.f193934X = channelIacInteractor;
        this.f193935Y = eVar;
        this.f193936Z = xVar;
        this.f193937a0 = aVar;
        this.f193938b0 = interfaceC35741a1;
        this.f193939c0 = interfaceC28373a;
        this.f193940d0 = aVar2;
        this.f193941e0 = new D<>();
        this.f193942f0 = new D<>();
        this.f193943g0 = new D<>();
        this.f193944h0 = new D<>();
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        this.f193946j0 = cVar;
        io.reactivex.rxjava3.core.z<InterfaceC32129a.c> zVarM0 = eVar.get().M0();
        InterfaceC35745a5 interfaceC35745a52 = this.f207133K;
        io.reactivex.rxjava3.core.z zVarA = com.avito.android.util.rx3.arrow.b.a(io.reactivex.rxjava3.core.z.k(interfaceC31987a.M0().j0(interfaceC35745a52.c()), zVarM0.j0(interfaceC35745a52.c()).k0(InterfaceC32129a.c.C5680c.class).z0(1L), new n()).d0(o.f194031b));
        l41.o<Object, Object> oVar = io.reactivex.rxjava3.internal.functions.a.f401991a;
        cVar.b(zVarA.D(oVar).t0(new p(this)));
        if (!lVar.f439745a.f439749b.a()) {
            this.f193945i0 = this.f207139Q.d0(a.f193947b).D(oVar);
        } else {
            aVar2.c(this);
            this.f193945i0 = io.reactivex.rxjava3.internal.operators.observable.U.f403867b;
        }
    }

    public static f.InterfaceC5732f.b.a.C5734b ne(g gVar, f.InterfaceC5732f.b.a.C5733a c5733a) {
        f.e.a aVar = f.e.a.f193896a;
        gVar.getClass();
        return new f.InterfaceC5732f.b.a.C5734b(c5733a.f193900a, c5733a.f193901b, c5733a.f193902c, c5733a.f193903d, aVar);
    }

    public static f.InterfaceC5732f.b.InterfaceC5735b.C5736b oe(g gVar, f.InterfaceC5732f.b.InterfaceC5735b.a aVar) {
        f.e.a aVar2 = f.e.a.f193896a;
        gVar.getClass();
        return new f.InterfaceC5732f.b.InterfaceC5735b.C5736b(aVar.f193909a, aVar.f193910b, aVar.f193911c, aVar2);
    }

    @Override // com.avito.android.messenger.conversation.mvi.platform_actions.f
    /* renamed from: G0, reason: from getter */
    public final D getF193944h0() {
        return this.f193944h0;
    }

    @Override // com.avito.android.messenger.conversation.mvi.common.d
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.observable.L Ga() {
        return this.f207139Q.d0(m.f194030b).D(io.reactivex.rxjava3.internal.functions.a.f401991a);
    }

    @Override // com.avito.android.messenger.conversation.mvi.platform_actions.f
    public final void J6(@Y61.k f.a aVar) {
        f.d dVar = aVar.f193882d;
        if (dVar != null) {
            le().s(new j(aVar, dVar));
        } else {
            me(aVar.f193881c);
        }
    }

    @Override // com.avito.android.messenger.conversation.mvi.platform_actions.f
    public final void M3() {
        le().s(new C5740g());
    }

    @Override // com.avito.android.messenger.conversation.mvi.platform_actions.f
    /* renamed from: N0, reason: from getter */
    public final D getF193942f0() {
        return this.f193942f0;
    }

    @Override // com.avito.android.messenger.conversation.mvi.platform_actions.f
    public final void O3(@Y61.k f.a aVar) {
        me(aVar.f193881c);
    }

    @Override // com.avito.android.messenger.conversation.mvi.platform_actions.f
    /* renamed from: Ob, reason: from getter */
    public final D getF193943g0() {
        return this.f193943g0;
    }

    @Override // com.avito.android.messenger.conversation.mvi.platform_actions.f
    /* renamed from: T, reason: from getter */
    public final D getF193941e0() {
        return this.f193941e0;
    }

    @Override // com.avito.android.messenger.conversation.mvi.platform_actions.f
    public final void T5() {
        le().s(new i());
    }

    @Override // com.avito.android.messenger.conversation.mvi.platform_actions.f
    public final void X8(@Y61.k ContextActionHandler.MethodCall methodCall) {
        le().s(new b(methodCall.getMethod(), methodCall.getParams(), methodCall.getReaction()));
    }

    @Override // com.avito.android.messenger.conversation.mvi.platform_actions.f
    public final void Ya() {
        le().s(new c());
    }

    @Override // com.avito.android.messenger.conversation.mvi.platform_actions.f
    public final void c7() {
        le().s(new d(null, null, 3, null));
    }

    @Override // com.avito.android.messenger.conversation.mvi.platform_actions.items_list.snippet.e
    public final void hc(@Y61.k String str) {
        le().s(new l(str));
        this.f193943g0.postValue(str);
    }

    @Override // com.avito.android.messenger.conversation.mvi.platform_actions.A
    @Y61.k
    public final io.reactivex.rxjava3.core.z<Boolean> m8() {
        return this.f193945i0;
    }

    public final void me(f.b bVar) {
        ContextActionHandler contextActionHandler = bVar.f193883a;
        if (!(contextActionHandler instanceof ContextActionHandler.Link)) {
            if (contextActionHandler instanceof ContextActionHandler.MethodCall) {
                ContextActionHandler.MethodCall methodCall = (ContextActionHandler.MethodCall) contextActionHandler;
                le().s(new b(methodCall.getMethod(), methodCall.getParams(), methodCall.getReaction()));
                pe(bVar, ContextActionHandler.MethodCall.TYPE);
                return;
            } else {
                if (contextActionHandler instanceof ContextActionHandler.Unknown) {
                    this.f193941e0.postValue(com.avito.android.printable_text.b.c(R.string.messenger_unsupported_context_action_type, new Serializable[0]));
                    pe(bVar, "unknown");
                    return;
                }
                return;
            }
        }
        ContextActionHandler.Link link = (ContextActionHandler.Link) contextActionHandler;
        String deepLink = link.getDeepLink();
        DeepLink deepLinkB = deepLink != null ? this.f193936Z.b(deepLink) : null;
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f193937a0;
        if (deepLinkB == null || (deepLinkB instanceof NoMatchLink)) {
            String link2 = link.getLink();
            if (link2 != null && !C43066x.K(link2)) {
                this.f193942f0.postValue(Uri.parse(link.getLink()));
                pe(bVar, "link");
                return;
            } else {
                if (deepLinkB == null || !(deepLinkB instanceof NoMatchLink)) {
                    return;
                }
                b.a.a(aVar, new UnsupportedPlatformActionLink(), null, null, 6);
                return;
            }
        }
        boolean z12 = deepLinkB instanceof LL.a;
        ChannelIacInteractor channelIacInteractor = this.f193934X;
        if (z12) {
            channelIacInteractor.Ub();
        }
        if (deepLinkB instanceof IacSellerChannelCallLinkV1) {
            channelIacInteractor.t6();
        } else if (deepLinkB instanceof IacSellerChannelCallLinkV2) {
            channelIacInteractor.zc((IacSellerChannelCallLinkV2) deepLinkB);
        } else if (deepLinkB instanceof ChannelIacCallLink) {
            channelIacInteractor.z3((ChannelIacCallLink) deepLinkB);
        } else {
            b.a.a(aVar, deepLinkB, null, null, 6);
        }
        pe(bVar, "deep_link");
    }

    @Override // com.avito.android.messenger.conversation.mvi.platform_actions.f
    public final void nd() {
        le().s(new k());
    }

    @Override // com.avito.android.mvi.rx3.with_monolithic_state.AbstractC32892c, androidx.view.M0
    public final void onCleared() {
        this.f193946j0.e();
        this.f193940d0.b(this);
        super.onCleared();
    }

    public final void pe(f.b bVar, String str) {
        String str2;
        String str3 = bVar.f193885c;
        if (str3 == null || (str2 = bVar.f193886d) == null) {
            return;
        }
        this.f193939c0.c(new com.avito.android.messenger.analytics.I(bVar.f193884b, str3, str2, str, bVar.f193887e));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.messenger.conversation.mvi.platform_actions.f
    public final void r5() {
        le().s(new h(this, null, 1, 0 == true ? 1 : 0));
    }

    /* compiled from: PlatformActionsPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/platform_actions/g$h;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/conversation/mvi/platform_actions/f$f;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class h extends com.avito.android.mvi.rx3.with_monolithic_state.o<f.InterfaceC5732f> {
        public h(@Y61.k String str) {
            super(str.concat("SetActionInProgressMutator"), null, 2, null);
        }

        @Override // com.avito.android.mvi.rx3.with_monolithic_state.o
        public final f.InterfaceC5732f d(f.InterfaceC5732f interfaceC5732f) {
            f.InterfaceC5732f c5733a;
            f.InterfaceC5732f interfaceC5732f2 = interfaceC5732f;
            boolean z12 = interfaceC5732f2 instanceof f.InterfaceC5732f.b.InterfaceC5735b.C5736b;
            g gVar = g.this;
            if (z12) {
                f.InterfaceC5732f.b.InterfaceC5735b.C5736b c5736b = (f.InterfaceC5732f.b.InterfaceC5735b.C5736b) interfaceC5732f2;
                gVar.getClass();
                c5733a = new f.InterfaceC5732f.b.InterfaceC5735b.a(c5736b.f193912a, c5736b.f193913b, c5736b.f193914c);
            } else {
                if (!(interfaceC5732f2 instanceof f.InterfaceC5732f.b.a.C5734b)) {
                    return interfaceC5732f2;
                }
                f.InterfaceC5732f.b.a.C5734b c5734b = (f.InterfaceC5732f.b.a.C5734b) interfaceC5732f2;
                gVar.getClass();
                ArrayList arrayList = c5734b.f193906c;
                c5733a = new f.InterfaceC5732f.b.a.C5733a(c5734b.f193904a, c5734b.f193905b, arrayList, c5734b.f193907d);
            }
            return c5733a;
        }

        public /* synthetic */ h(g gVar, String str, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? "" : str);
        }
    }
}
