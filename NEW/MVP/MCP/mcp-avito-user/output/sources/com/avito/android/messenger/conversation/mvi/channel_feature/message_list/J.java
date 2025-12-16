package com.avito.android.messenger.conversation.mvi.channel_feature.message_list;

import MY.d;
import MY.k;
import MY.l;
import NY.f;
import Oq.InterfaceC14725a;
import com.avito.android.C30277e1;
import com.avito.android.ab_tests.configs.AssistantUxImprovementsBuyerTestGroup;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.conversation.T1;
import com.avito.android.messenger.conversation.mvi.channel_feature.message_list.C31958c;
import com.avito.android.messenger.conversation.mvi.context.InterfaceC31987a;
import com.avito.android.messenger.conversation.mvi.in_app_calls.ChannelIacInteractor;
import com.avito.android.messenger.conversation.mvi.messages.InterfaceC32129a;
import com.avito.android.messenger.conversation.mvi.sync.InterfaceC32291u0;
import com.avito.android.messenger.di.InterfaceC32438g0;
import com.avito.android.messenger.di.InterfaceC32510w0;
import com.avito.android.messenger.di.q2;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.ImageKt;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.util.C35809h6;
import com.avito.android.util.R0;
import com.avito.android.util.X2;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.text.C43066x;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: MessageListActorDelegate.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/channel_feature/message_list/J;", "Lcom/avito/android/messenger/conversation/mvi/channel_feature/message_list/a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class J implements InterfaceC31954a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f189818a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f189819b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f189820c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final R0 f189821d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC32129a> f189822e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deep_linking.x f189823f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C30277e1 f189824g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final ChannelIacInteractor f189825h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final DY.a f189826i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f189827j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32291u0 f189828k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.conversation.mvi.file_download.N f189829l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.conversation.mvi.voice.A f189830m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.conversation.mvi.video.h f189831n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.conversation.mvi.messages.b0 f189832o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f189833p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.server_time.f f189834q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final CY.k f189835r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final InterfaceC31987a f189836s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.conversation.mvi.a f189837t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.conversation.analytics.b f189838u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14725a f189839v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final u3.g<AssistantUxImprovementsBuyerTestGroup> f189840w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final String f189841x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public final AtomicBoolean f189842y = new AtomicBoolean(false);

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public final AtomicBoolean f189843z = new AtomicBoolean(false);

    @Inject
    public J(@InterfaceC32438g0 @Y61.k String str, @Y61.l @InterfaceC32510w0 String str2, @Y61.l @q2 String str3, @Y61.k R0 r02, @Y61.k h31.e<InterfaceC32129a> eVar, @Y61.k com.avito.android.deep_linking.x xVar, @Y61.k C30277e1 c30277e1, @Y61.k ChannelIacInteractor channelIacInteractor, @Y61.k DY.a aVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2, @Y61.k InterfaceC32291u0 interfaceC32291u0, @Y61.k com.avito.android.messenger.conversation.mvi.file_download.N n12, @Y61.k com.avito.android.messenger.conversation.mvi.voice.A a12, @Y61.k com.avito.android.messenger.conversation.mvi.video.h hVar, @Y61.k com.avito.android.messenger.conversation.mvi.messages.b0 b0Var, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.server_time.f fVar, @Y61.k CY.k kVar, @Y61.k InterfaceC31987a interfaceC31987a, @Y61.k com.avito.android.messenger.conversation.mvi.a aVar3, @Y61.k com.avito.android.messenger.conversation.analytics.b bVar, @Y61.k InterfaceC14725a interfaceC14725a, @Y61.k u3.g<AssistantUxImprovementsBuyerTestGroup> gVar) {
        this.f189818a = str;
        this.f189819b = str2;
        this.f189820c = str3;
        this.f189821d = r02;
        this.f189822e = eVar;
        this.f189823f = xVar;
        this.f189824g = c30277e1;
        this.f189825h = channelIacInteractor;
        this.f189826i = aVar;
        this.f189827j = aVar2;
        this.f189828k = interfaceC32291u0;
        this.f189829l = n12;
        this.f189830m = a12;
        this.f189831n = hVar;
        this.f189832o = b0Var;
        this.f189833p = interfaceC28373a;
        this.f189834q = fVar;
        this.f189835r = kVar;
        this.f189836s = interfaceC31987a;
        this.f189837t = aVar3;
        this.f189838u = bVar;
        this.f189839v = interfaceC14725a;
        this.f189840w = gVar;
        this.f189841x = "Mvi-Chat" + str.hashCode() + "_AD";
    }

    public static final Object c(J j12, com.avito.android.arch.mvi.utils.x xVar, LocalMessage localMessage, String str, C31958c.a aVar, C31958c c31958c) {
        int size;
        Image image;
        Image image2;
        j12.getClass();
        f.b.AbstractC0740b abstractC0740b = ((NY.h) xVar.getValue()).f11579d;
        f.b.AbstractC0740b.d dVar = abstractC0740b instanceof f.b.AbstractC0740b.d ? (f.b.AbstractC0740b.d) abstractC0740b : null;
        if (dVar == null) {
            X2.f318778a.j(j12.f189841x, "Image message click ignored: Action.ImageMessageClicked arrived when first page wasn't loaded: \n\t listMiddleState = " + ((NY.h) xVar.getValue()).f11579d, null);
            return kotlin.G0.f406611a;
        }
        ArrayList arrayList = new ArrayList();
        List<T1> list = dVar.f11560a;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof T1.d) {
                arrayList2.add(obj);
            }
        }
        int i12 = 0;
        for (T1.d dVar2 : C42745f0.k(arrayList2)) {
            boolean zF2 = kotlin.jvm.internal.L.f(dVar2.f189180o.getLocalId(), localMessage.getLocalId());
            T1.d.b bVar = dVar2.f189168c;
            if (bVar instanceof T1.d.b.a) {
                MessageBody messageBody = ((T1.d.b.a) bVar).f189194a;
                if (messageBody instanceof MessageBody.ImageBody) {
                    arrayList.add(((MessageBody.ImageBody) messageBody).getImage());
                    if (zF2) {
                        size = arrayList.size();
                        i12 = size - 1;
                    }
                } else if (messageBody instanceof MessageBody.LocalImage) {
                    arrayList.add(ImageKt.toImage(((MessageBody.LocalImage) messageBody).getSource()));
                    if (zF2) {
                        size = arrayList.size();
                        i12 = size - 1;
                    }
                } else if (messageBody instanceof MessageBody.Link) {
                    MessageBody.Link.Preview preview = ((MessageBody.Link) messageBody).getPreview();
                    MessageBody.Link.Preview.Image image3 = preview instanceof MessageBody.Link.Preview.Image ? (MessageBody.Link.Preview.Image) preview : null;
                    if (image3 != null && (image = image3.getImage()) != null) {
                        arrayList.add(image);
                        if (zF2) {
                            size = arrayList.size();
                            i12 = size - 1;
                        }
                    }
                }
            } else if (bVar instanceof T1.d.b.C5574b) {
                MessageBody.SystemMessageBody.Platform.Bubble bubble = ((T1.d.b.C5574b) bVar).f189195a;
                MessageBody.SystemMessageBody.Platform.Bubble.Image image4 = bubble instanceof MessageBody.SystemMessageBody.Platform.Bubble.Image ? (MessageBody.SystemMessageBody.Platform.Bubble.Image) bubble : null;
                if (image4 != null && (image2 = image4.getImage()) != null) {
                    arrayList.add(image2);
                    if (zF2 && kotlin.jvm.internal.L.f(image4.getImageId(), str)) {
                        size = arrayList.size();
                        i12 = size - 1;
                    }
                }
            }
        }
        Object objInvoke = aVar.invoke(new d.b(new MY.m(i12, localMessage.getChannelId(), arrayList)), c31958c);
        return objInvoke == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvoke : kotlin.G0.f406611a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(J j12, com.avito.android.arch.mvi.utils.l lVar, boolean z12) {
        j12.getClass();
        f.a aVar = ((NY.h) lVar.getValue()).f11577b;
        f.a.b bVar = aVar instanceof f.a.b ? (f.a.b) aVar : null;
        f.b.AbstractC0740b abstractC0740b = ((NY.h) lVar.getValue()).f11579d;
        f.b.AbstractC0740b.d dVar = abstractC0740b instanceof f.b.AbstractC0740b.d ? (f.b.AbstractC0740b.d) abstractC0740b : null;
        AtomicBoolean atomicBoolean = j12.f189843z;
        AtomicBoolean atomicBoolean2 = j12.f189842y;
        if (bVar == null || dVar == null) {
            X2.f318778a.c(j12.f189841x, "Pagination is ignored: Event.PaginationStart arrived when context or first page weren't loaded \n\t ctxState = " + ((NY.h) lVar.getValue()).f11577b + ", \n\t listMiddleState = " + ((NY.h) lVar.getValue()).f11579d, null);
            if (atomicBoolean2.compareAndSet(false, true)) {
                atomicBoolean.set(true);
                return;
            }
            return;
        }
        if (((NY.h) lVar.getValue()).f11578c instanceof f.b.d.c) {
            return;
        }
        String str = j12.f189819b;
        Integer numValueOf = str != null ? Integer.valueOf(com.avito.android.messenger.conversation.mvi.messages.e0.d(str)) : null;
        int size = dVar.f11560a.size();
        com.avito.android.messenger.conversation.analytics.b bVar2 = j12.f189838u;
        bVar2.f(size);
        bVar2.j();
        if (z12) {
            j12.f189822e.get().L4(bVar.f11548a, numValueOf);
        }
        if (atomicBoolean2.compareAndSet(false, true)) {
            atomicBoolean.set(false);
        }
        lVar.setValue(NY.h.a((NY.h) lVar.getValue(), null, null, f.b.d.c.f11568a, null, null, null, 59));
    }

    @Override // com.avito.android.messenger.conversation.mvi.channel_feature.message_list.InterfaceC31954a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k MY.k kVar, @Y61.k com.avito.android.arch.mvi.utils.o oVar) {
        C43210w c43210w;
        if (kVar instanceof k.b) {
            k.b bVar = (k.b) kVar;
            if (bVar instanceof k.b.d) {
                return C43175k.G(new C31983w(oVar, bVar, null, this));
            }
            if (bVar instanceof k.b.g) {
                return C43175k.G(new C31962e(oVar, bVar, null));
            }
            if (bVar instanceof k.b.e) {
                return C43175k.G(new C31964f(oVar, bVar, null));
            }
            if (bVar instanceof k.b.C0685b) {
                return C43175k.G(new G(this, bVar, null));
            }
            if (bVar instanceof k.b.a) {
                return C43175k.G(new C31985y(oVar, bVar, null, bVar, this));
            }
            if (bVar instanceof k.b.c) {
                return C43175k.G(new C31966g(oVar, bVar, null, this));
            }
            if (bVar instanceof k.b.f) {
                return C43175k.G(new C31968h(oVar, bVar, null, bVar, this));
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!(kVar instanceof k.a)) {
            throw new NoWhenBranchMatchedException();
        }
        k.a aVar = (k.a) kVar;
        if (aVar instanceof k.a.d) {
            return C43175k.h(new C31956b(oVar, aVar, null, aVar, this));
        }
        if (aVar instanceof k.a.g) {
            k.a.g gVar = (k.a.g) aVar;
            return C43175k.h(new C31958c(oVar, gVar, null, this, gVar));
        }
        if (aVar instanceof k.a.e) {
            k.a.e eVar = (k.a.e) aVar;
            c43210w = new C43210w(e(eVar.f10770a, eVar.f10771b));
        } else {
            if (!(aVar instanceof k.a.f)) {
                if (aVar instanceof k.a.C0684a) {
                    return C43175k.G(new A(aVar, this, null));
                }
                if (aVar instanceof k.a.c) {
                    return C43175k.G(new B(aVar, this, null));
                }
                if (aVar instanceof k.a.h) {
                    return C43175k.G(new C(aVar, this, null));
                }
                if (aVar instanceof k.a.i) {
                    return C43175k.G(new D(aVar, this, null));
                }
                if (aVar instanceof k.a.b) {
                    return C43175k.G(new E(aVar, this, null));
                }
                if (aVar instanceof k.a.j) {
                    return C43175k.G(new F(aVar, this, null));
                }
                throw new NoWhenBranchMatchedException();
            }
            k.a.f fVar = (k.a.f) aVar;
            c43210w = new C43210w(new d.j(new MY.j(fVar.f10772a, fVar.f10773b, fVar.f10774c)));
        }
        return c43210w;
    }

    @Override // com.avito.android.messenger.conversation.mvi.channel_feature.message_list.InterfaceC31954a
    @Y61.k
    public final InterfaceC43160i b(@Y61.k MY.l lVar, @Y61.k com.avito.android.arch.mvi.utils.o oVar) {
        if (lVar instanceof l.e) {
            l.e eVar = (l.e) lVar;
            return C43175k.G(new C31972k(oVar, eVar, null, eVar, this));
        }
        if (lVar instanceof l.i) {
            l.i iVar = (l.i) lVar;
            return C43175k.G(new C31973l(oVar, iVar, null, this, iVar));
        }
        if (lVar instanceof l.o) {
            return C43175k.G(new C31960d(oVar, lVar, null));
        }
        if (lVar instanceof l.p) {
            l.p pVar = (l.p) lVar;
            return C43175k.G(new C31974m(oVar, pVar, null, pVar, this));
        }
        if (lVar instanceof l.j) {
            return C43175k.G(new C31977p(oVar, (l.j) lVar, null, this));
        }
        if (lVar instanceof l.C0686l) {
            l.C0686l c0686l = (l.C0686l) lVar;
            return C43175k.G(new C31975n(oVar, c0686l, null, this, c0686l));
        }
        if (lVar instanceof l.k) {
            return C43175k.G(new C31976o(oVar, lVar, null, this, lVar));
        }
        if (lVar.equals(l.b.f10794a)) {
            return C43175k.G(new C31978q(oVar, lVar, null, this));
        }
        if (lVar instanceof l.d) {
            return C43175k.G(new r(oVar, lVar, null, lVar));
        }
        if (lVar instanceof l.c) {
            l.c cVar = (l.c) lVar;
            return C43175k.G(new C31971j(oVar, cVar, null, this, cVar));
        }
        if (lVar instanceof l.a) {
            return C43175k.G(new C31979s(oVar, lVar, null, lVar));
        }
        if (lVar instanceof l.n) {
            return C43175k.G(new C31984x(oVar, lVar, null, this, lVar));
        }
        if (lVar.equals(l.f.f10802a)) {
            return C43175k.G(new C31980t(oVar, lVar, null, this));
        }
        if (lVar.equals(l.h.f10805a)) {
            return C43175k.G(new C31981u(oVar, lVar, null, this));
        }
        if (lVar instanceof l.g) {
            l.g gVar = (l.g) lVar;
            return C43175k.G(new C31970i(oVar, gVar, null, gVar, this));
        }
        if (lVar.equals(l.m.f10810a)) {
            return C43175k.G(new C31982v(oVar, lVar, null, this));
        }
        throw new NoWhenBranchMatchedException();
    }

    public final d.C0682d e(LocalMessage localMessage, String str) {
        this.f189833p.c(new com.avito.android.messenger.analytics.F(localMessage.getChannelId(), str, localMessage.getRemoteId(), null, null, 24, null));
        String[] strArr = C35809h6.f318898a;
        int i12 = 0;
        while (true) {
            if (i12 >= 3) {
                str = AK.c.s(new StringBuilder(), strArr[0], str);
                break;
            }
            String str2 = strArr[i12];
            if (!C43066x.h0(str, str2, true)) {
                i12++;
            } else if (!str.startsWith(str2)) {
                StringBuilder sbR = androidx.compose.foundation.H.r(str2);
                sbR.append(str.substring(str2.length()));
                str = sbR.toString();
            }
        }
        return new d.C0682d(str);
    }
}
