package com.avito.android.messenger.conversation.mvi.channel_feature.message_list;

import com.avito.android.C30277e1;
import com.avito.android.ab_tests.configs.MessengerEmptyBuyerChatKeyboardTestGroup;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.conversation.mvi.context.InterfaceC31987a;
import com.avito.android.messenger.conversation.mvi.file_download.InterfaceC32038b;
import com.avito.android.messenger.conversation.mvi.messages.InterfaceC32129a;
import com.avito.android.messenger.conversation.mvi.sync.Q0;
import com.avito.android.messenger.conversation.mvi.sync.W0;
import com.avito.android.messenger.di.InterfaceC32438g0;
import com.avito.android.messenger.di.InterfaceC32510w0;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: MessageListActorSubscriptions.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/channel_feature/message_list/G0;", "Lcom/avito/android/messenger/conversation/mvi/channel_feature/message_list/M;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class G0 implements M {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f189775a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f189776b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.conversation.mvi.a f189777c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final R0 f189778d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35741a1 f189779e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f189780f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Q0 f189781g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final W0 f189782h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.conversation.mvi.file_download.N f189783i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC31987a f189784j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.server_time.f f189785k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.conversation.mvi.video.h f189786l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final C30277e1 f189787m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC32129a> f189788n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32038b f189789o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.channels.mvi.sync.E0 f189790p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final WY.a f189791q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deep_linking.x f189792r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final u3.l<MessengerEmptyBuyerChatKeyboardTestGroup> f189793s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final String f189794t;

    @Inject
    public G0(@InterfaceC32438g0 @Y61.k String str, @Y61.l @InterfaceC32510w0 String str2, @Y61.k com.avito.android.messenger.conversation.mvi.a aVar, @Y61.k R0 r02, @Y61.k InterfaceC35741a1 interfaceC35741a1, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k Q0 q02, @Y61.k W0 w02, @Y61.k com.avito.android.messenger.conversation.mvi.file_download.N n12, @Y61.k InterfaceC31987a interfaceC31987a, @Y61.k com.avito.android.server_time.f fVar, @Y61.k com.avito.android.messenger.conversation.mvi.video.h hVar, @Y61.k C30277e1 c30277e1, @Y61.k h31.e<InterfaceC32129a> eVar, @Y61.k InterfaceC32038b interfaceC32038b, @Y61.k com.avito.android.messenger.channels.mvi.sync.E0 e02, @Y61.k WY.a aVar2, @Y61.k com.avito.android.deep_linking.x xVar, @Y61.k u3.l<MessengerEmptyBuyerChatKeyboardTestGroup> lVar) {
        this.f189775a = str;
        this.f189776b = str2;
        this.f189777c = aVar;
        this.f189778d = r02;
        this.f189779e = interfaceC35741a1;
        this.f189780f = interfaceC28373a;
        this.f189781g = q02;
        this.f189782h = w02;
        this.f189783i = n12;
        this.f189784j = interfaceC31987a;
        this.f189785k = fVar;
        this.f189786l = hVar;
        this.f189787m = c30277e1;
        this.f189788n = eVar;
        this.f189789o = interfaceC32038b;
        this.f189790p = e02;
        this.f189791q = aVar2;
        this.f189792r = xVar;
        this.f189793s = lVar;
        this.f189794t = "Mvi-Chat" + str.hashCode() + "_AS";
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0286  */
    @Override // com.avito.android.messenger.conversation.mvi.channel_feature.message_list.M
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlinx.coroutines.flow.InterfaceC43160i a(@Y61.k com.avito.android.arch.mvi.utils.o r22) {
        /*
            Method dump skipped, instructions count: 776
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.conversation.mvi.channel_feature.message_list.G0.a(com.avito.android.arch.mvi.utils.o):kotlinx.coroutines.flow.i");
    }

    public final C43152f0 b(InterfaceC43160i interfaceC43160i, String str) {
        return new C43152f0(interfaceC43160i, new N(this, str, null));
    }
}
