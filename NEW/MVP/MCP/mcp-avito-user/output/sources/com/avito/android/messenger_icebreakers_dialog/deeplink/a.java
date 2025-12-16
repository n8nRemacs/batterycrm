package com.avito.android.messenger_icebreakers_dialog.deeplink;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import bv.C25719a;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.y;
import com.avito.android.async_phone.public_module.phone_request_link.PhoneRequestLink;
import com.avito.android.component.toast.c;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.CreateChannelLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.favorite_sellers.C30597v;
import com.avito.android.iac_dialer_models.abstract_module.IacCallContext;
import com.avito.android.iac_dialer_models.abstract_module.IacItemInfo;
import com.avito.android.iac_dialer_models.abstract_module.IacPeerInfo;
import com.avito.android.messenger_icebreakers_dialog.MessengerIcebreakerDialogResult;
import com.avito.android.messenger_icebreakers_dialog.deeplink.MessengerIcebreakerDialogDeeplink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.messenger.message_suggests.MessageSuggest;
import com.avito.android.util.C35755b0;
import com.avito.android.util.C35837l2;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35863o4;
import com.avito.android.util.R0;
import com.avito.android.util.X2;
import ev.AbstractC40161a;
import io.reactivex.rxjava3.internal.operators.observable.T;
import io.reactivex.rxjava3.kotlin.A1;
import java.io.Serializable;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.internal.C43238h;
import ru.avito.messenger.A;
import ru.avito.messenger.F0;
import ru.avito.messenger.InterfaceC47842z;
import ru.avito.messenger.api.entity.Channel;
import ru.avito.messenger.api.entity.ChannelInfo;
import ru.avito.messenger.api.entity.ChannelUser;
import ru.avito.messenger.api.entity.context.ChannelContext;
import rv.C47919b;

/* compiled from: MessengerIcebreakerDialogDeeplinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger_icebreakers_dialog/deeplink/a;", "Lev/a;", "Lcom/avito/android/messenger_icebreakers_dialog/deeplink/MessengerIcebreakerDialogDeeplink;", "a", "_avito_messenger-icebreakers-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a extends AbstractC40161a<MessengerIcebreakerDialogDeeplink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final a.f f197557f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a.d f197558g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final a.i f197559h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f197560i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47842z f197561j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final A f197562k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final F0 f197563l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35863o4 f197564m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f197565n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final C25719a f197566o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f197567p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger_icebreakers_dialog.a f197568q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final Context f197569r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger_icebreakers_dialog.features.a f197570s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35741a1 f197571t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final WL.a f197572u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f197573v = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final C43238h f197574w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.l
    public C5819a f197575x;

    /* compiled from: MessengerIcebreakerDialogDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger_icebreakers_dialog/deeplink/a$a;", "", "_avito_messenger-icebreakers-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger_icebreakers_dialog.deeplink.a$a, reason: collision with other inner class name */
    public static final /* data */ class C5819a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Channel f197576a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f197577b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final List<MessageSuggest> f197578c;

        public C5819a(@Y61.k Channel channel, @Y61.k String str, @Y61.l List<MessageSuggest> list) {
            this.f197576a = channel;
            this.f197577b = str;
            this.f197578c = list;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5819a)) {
                return false;
            }
            C5819a c5819a = (C5819a) obj;
            return L.f(this.f197576a, c5819a.f197576a) && L.f(this.f197577b, c5819a.f197577b) && L.f(this.f197578c, c5819a.f197578c);
        }

        public final int hashCode() {
            int iD2 = H.d(this.f197576a.hashCode() * 31, 31, this.f197577b);
            List<MessageSuggest> list = this.f197578c;
            return iD2 + (list == null ? 0 : list.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ChannelData(channel=");
            sb2.append(this.f197576a);
            sb2.append(", currentUserId=");
            sb2.append(this.f197577b);
            sb2.append(", suggestList=");
            return H.p(sb2, this.f197578c, ')');
        }
    }

    /* compiled from: MessengerIcebreakerDialogDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<Throwable, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f197580m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ IacCallContext f197581n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Boolean f197582o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, IacCallContext iacCallContext, Boolean bool) {
            super(1);
            this.f197580m = str;
            this.f197581n = iacCallContext;
            this.f197582o = bool;
        }

        @Override // Y41.l
        public final G0 invoke(Throwable th2) {
            Throwable th3 = th2;
            X2.f318778a.c("MessengerIcebreakerDialogDeeplinkHandler", "checkPhoneCallStart onError " + th3, null);
            a aVar = a.this;
            a.i.C4057a.d(aVar.f197559h, InterfaceC35741a1.a.a(aVar.f197571t, th3, null, null, 6), null, Collections.singletonList(new c.a.C3719a(aVar.f197569r.getString(R.string.messenger_icebreakers_try_again), true, null, new n(aVar, this.f197580m, this.f197581n, this.f197582o), 4, null)), new f.c(th3), 5000, null, null, null, 1994);
            return G0.f406611a;
        }
    }

    /* compiled from: MessengerIcebreakerDialogDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "phoneDeeplink", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<DeepLink, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(DeepLink deepLink) {
            MessengerIcebreakerDialogDeeplink.b.d dVar = MessengerIcebreakerDialogDeeplink.b.d.f197555b;
            a aVar = a.this;
            aVar.i(dVar, aVar.f197567p, deepLink);
            return G0.f406611a;
        }
    }

    /* compiled from: MessengerIcebreakerDialogDeeplinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends C42801a implements Y41.p<C47919b, Continuation<? super G0>, Object>, SuspendFunction {
        @Override // Y41.p
        public final Object invoke(C47919b c47919b, Continuation<? super G0> continuation) {
            String str;
            String categoryId;
            Channel channel;
            a aVar = (a) this.receiver;
            aVar.getClass();
            MessengerIcebreakerDialogResult.a aVar2 = MessengerIcebreakerDialogResult.f197529U1;
            Bundle bundle = c47919b.f437159b;
            aVar2.getClass();
            MessengerIcebreakerDialogResult messengerIcebreakerDialogResult = (MessengerIcebreakerDialogResult) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle.getParcelable("messenger_icebreakers_dialog.MessengerIcebreakerDialogResult", MessengerIcebreakerDialogResult.class) : bundle.getParcelable("messenger_icebreakers_dialog.MessengerIcebreakerDialogResult"));
            if (messengerIcebreakerDialogResult != null) {
                cVar = null;
                D8.c cVar = null;
                if (messengerIcebreakerDialogResult instanceof MessengerIcebreakerDialogResult.OnSendMessage) {
                    MessengerIcebreakerDialogResult.OnSendMessage onSendMessage = (MessengerIcebreakerDialogResult.OnSendMessage) messengerIcebreakerDialogResult;
                    aVar.m(onSendMessage.f197537b, onSendMessage.f197538c, onSendMessage.f197539d, null);
                } else if (messengerIcebreakerDialogResult instanceof MessengerIcebreakerDialogResult.OnSendIcebreaker) {
                    C5819a c5819a = aVar.f197575x;
                    ChannelContext context = (c5819a == null || (channel = c5819a.f197576a) == null) ? null : channel.getContext();
                    ChannelContext.Item item = context instanceof ChannelContext.Item ? (ChannelContext.Item) context : null;
                    if (item != null && (categoryId = item.getCategoryId()) != null) {
                        MessengerIcebreakerDialogResult.OnSendIcebreaker onSendIcebreaker = (MessengerIcebreakerDialogResult.OnSendIcebreaker) messengerIcebreakerDialogResult;
                        MessengerIcebreakerDialogDeeplink messengerIcebreakerDialogDeeplink = onSendIcebreaker.f197532b;
                        cVar = new D8.c(messengerIcebreakerDialogDeeplink.f197547b, categoryId, null, onSendIcebreaker.f197533c, onSendIcebreaker.f197536f, onSendIcebreaker.f197535e, null, messengerIcebreakerDialogDeeplink.f197549d);
                    }
                    MessengerIcebreakerDialogResult.OnSendIcebreaker onSendIcebreaker2 = (MessengerIcebreakerDialogResult.OnSendIcebreaker) messengerIcebreakerDialogResult;
                    aVar.m(onSendIcebreaker2.f197532b, onSendIcebreaker2.f197533c, onSendIcebreaker2.f197534d, cVar);
                } else if (messengerIcebreakerDialogResult instanceof MessengerIcebreakerDialogResult.OnCancel) {
                    aVar.j(MessengerIcebreakerDialogDeeplink.b.a.f197552b);
                } else if (messengerIcebreakerDialogResult instanceof MessengerIcebreakerDialogResult.OnPhoneClick) {
                    MessengerIcebreakerDialogDeeplink messengerIcebreakerDialogDeeplink2 = ((MessengerIcebreakerDialogResult.OnPhoneClick) messengerIcebreakerDialogResult).f197531b;
                    DeepLink deepLink = messengerIcebreakerDialogDeeplink2.f197551f;
                    boolean z12 = deepLink instanceof PhoneRequestLink;
                    PhoneRequestLink phoneRequestLink = z12 ? (PhoneRequestLink) deepLink : null;
                    if (phoneRequestLink == null || (str = phoneRequestLink.f92282c) == null) {
                        str = messengerIcebreakerDialogDeeplink2.f197548c;
                    }
                    PhoneRequestLink phoneRequestLink2 = z12 ? (PhoneRequestLink) deepLink : null;
                    aVar.l(phoneRequestLink2 != null ? phoneRequestLink2.f92284e : null, str);
                }
            }
            return G0.f406611a;
        }
    }

    @Inject
    public a(@Y61.k a.f fVar, @Y61.k a.d dVar, @Y61.k a.i iVar, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k InterfaceC47842z interfaceC47842z, @Y61.k A a12, @Y61.k F0 f02, @Y61.k InterfaceC35863o4 interfaceC35863o4, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k C25719a c25719a, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k com.avito.android.messenger_icebreakers_dialog.a aVar2, @Y61.k Context context, @Y61.k com.avito.android.messenger_icebreakers_dialog.features.a aVar3, @Y61.k InterfaceC35741a1 interfaceC35741a1, @Y61.k WL.a aVar4, @Y61.k R0 r02) {
        this.f197557f = fVar;
        this.f197558g = dVar;
        this.f197559h = iVar;
        this.f197560i = interfaceC28373a;
        this.f197561j = interfaceC47842z;
        this.f197562k = a12;
        this.f197563l = f02;
        this.f197564m = interfaceC35863o4;
        this.f197565n = interfaceC35745a5;
        this.f197566o = c25719a;
        this.f197567p = aVar;
        this.f197568q = aVar2;
        this.f197569r = context;
        this.f197570s = aVar3;
        this.f197571t = interfaceC35741a1;
        this.f197572u = aVar4;
        this.f197574w = U.a(r02.b());
    }

    public static final void k(a aVar, MessengerIcebreakerDialogDeeplink messengerIcebreakerDialogDeeplink, D8.c cVar) {
        if (cVar != null) {
            aVar.f197560i.c(cVar);
        } else {
            aVar.getClass();
        }
        a.i.C4057a.d(aVar.f197559h, com.avito.android.printable_text.b.c(R.string.messenger_icebreakers_success_toast, new Serializable[0]), null, Collections.singletonList(new c.a.C3719a(aVar.f197569r.getString(R.string.messenger_icebreakers_go_to_chat), true, null, new r(aVar, messengerIcebreakerDialogDeeplink), 4, null)), null, 5000, null, new C30597v(aVar, 3), null, 1498);
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        MessengerIcebreakerDialogDeeplink messengerIcebreakerDialogDeeplink = (MessengerIcebreakerDialogDeeplink) deepLink;
        com.avito.android.messenger_icebreakers_dialog.features.a aVar = this.f197570s;
        aVar.getClass();
        kotlin.reflect.n<Object> nVar = com.avito.android.messenger_icebreakers_dialog.features.a.f197659d[0];
        if (((Boolean) aVar.f197660b.a().invoke()).booleanValue()) {
            this.f197566o.b(messengerIcebreakerDialogDeeplink, this, null, new h(this, messengerIcebreakerDialogDeeplink));
        } else {
            this.f197560i.c(new y.a("messengerIcebreakersDialog.off", 0L, 2, null));
            i(MessengerIcebreakerDialogDeeplink.b.e.f197556b, this.f197567p, new CreateChannelLink(messengerIcebreakerDialogDeeplink.f197547b, null, messengerIcebreakerDialogDeeplink.f197548c, messengerIcebreakerDialogDeeplink.f197549d, false, false, messengerIcebreakerDialogDeeplink.f197550e, 50, null));
        }
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        C43175k.K(new C43197r1(new d(2, this, a.class, "handleResult", "handleResult(Lcom/avito/android/deeplink_handler/view/result/FragmentResult;)V", 4), kotlinx.coroutines.rx3.y.a(this.f197557f.l1(this.f395444b))), this.f197574w);
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f197573v.dispose();
        U.b(this.f197574w, null);
    }

    public final void l(Boolean bool, String str) {
        ChannelUser channelUser;
        Image image;
        Channel channel;
        ChannelInfo info;
        ru.avito.messenger.api.entity.Image avatar;
        Channel channel2;
        List<ChannelUser> users;
        Object next;
        Channel channel3;
        C5819a c5819a = this.f197575x;
        ru.avito.messenger.api.entity.context.ChannelContext context = (c5819a == null || (channel3 = c5819a.f197576a) == null) ? null : channel3.getContext();
        ChannelContext.Item item = context instanceof ChannelContext.Item ? (ChannelContext.Item) context : null;
        C5819a c5819a2 = this.f197575x;
        if (c5819a2 == null || (channel2 = c5819a2.f197576a) == null || (users = channel2.getUsers()) == null) {
            channelUser = null;
        } else {
            Iterator<T> it = users.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                String id2 = ((ChannelUser) next).getId();
                C5819a c5819a3 = this.f197575x;
                if (!L.f(id2, c5819a3 != null ? c5819a3.f197577b : null)) {
                    break;
                }
            }
            channelUser = (ChannelUser) next;
        }
        if (item == null || channelUser == null) {
            j(MessengerIcebreakerDialogDeeplink.b.a.f197552b);
            return;
        }
        C5819a c5819a4 = this.f197575x;
        if (c5819a4 == null || (channel = c5819a4.f197576a) == null || (info = channel.getInfo()) == null || (avatar = info.getAvatar()) == null) {
            image = null;
        } else {
            Map<String, Uri> variants = avatar.getVariants();
            LinkedHashMap linkedHashMap = new LinkedHashMap(P0.f(variants.size()));
            Iterator<T> it2 = variants.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                linkedHashMap.put(C35837l2.a((String) entry.getKey()), entry.getValue());
            }
            image = new Image(C35755b0.b(linkedHashMap));
        }
        String name = channelUser.getName();
        if (name == null) {
            name = "";
        }
        IacCallContext iacCallContext = new IacCallContext("icebreakers_screen", new IacPeerInfo(image, channelUser.getId(), name, "", C42784z0.f406748b), new IacItemInfo(item.getId(), null, item.getTitle(), item.getPrice(), item.getImage(), null, 32, null), null, null);
        T tS2 = this.f197572u.a(str, iacCallContext, null, bool, null).S();
        InterfaceC35745a5 interfaceC35745a5 = this.f197565n;
        this.f197573v.b(A1.e(tS2.z(interfaceC35745a5.a()).s(interfaceC35745a5.e()), new b(str, iacCallContext, bool), new c()));
    }

    public final void m(MessengerIcebreakerDialogDeeplink messengerIcebreakerDialogDeeplink, String str, String str2, D8.c cVar) {
        this.f197573v.b(A1.e(ru.avito.messenger.G0.a(this.f197563l).n(new k(this, str2, str, messengerIcebreakerDialogDeeplink)).s(this.f197565n.a()), new i(this, messengerIcebreakerDialogDeeplink, str, str2, cVar), new j(this, messengerIcebreakerDialogDeeplink, cVar)));
    }
}
