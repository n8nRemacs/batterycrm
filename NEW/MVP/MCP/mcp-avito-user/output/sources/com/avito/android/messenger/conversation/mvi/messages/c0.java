package com.avito.android.messenger.conversation.mvi.messages;

import android.content.res.Resources;
import com.avito.android.C30277e1;
import com.avito.android.R;
import com.avito.android.ab_tests.configs.AssistantUxImprovementsBuyer2TestGroup;
import com.avito.android.ab_tests.configs.AssistantUxImprovementsBuyerTestGroup;
import com.avito.android.ab_tests.configs.AssistantUxImprovementsSellerTestGroup;
import com.avito.android.messenger.conversation.T1;
import com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.file_message.FileMessageData;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.ImageKt;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.remote.model.messenger.message.StatusCode;
import com.avito.android.util.B4;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MessageListItemConverter.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/c0;", "Lcom/avito/android/messenger/conversation/mvi/messages/b0;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c0 implements b0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final LY.b f192165a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final LY.d f192166b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final x0 f192167c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.conversation.mvi.messages.builders.g f192168d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.conversation.mvi.messages.builders.m f192169e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.conversation.mvi.messages.builders.i f192170f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.conversation.mvi.messages.builders.o f192171g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.conversation.mvi.messages.builders.q f192172h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.conversation.mvi.messages.builders.e f192173i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.conversation.mvi.messages.builders.a f192174j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.conversation.mvi.messages.builders.k f192175k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.conversation.mvi.messages.builders.c f192176l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final C30277e1 f192177m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final u3.g<AssistantUxImprovementsSellerTestGroup> f192178n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final u3.g<AssistantUxImprovementsBuyerTestGroup> f192179o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final u3.g<AssistantUxImprovementsBuyer2TestGroup> f192180p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final Image f192181q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final Image f192182r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final Image f192183s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final String f192184t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final String f192185u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final String f192186v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final String f192187w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final String f192188x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public final String f192189y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public final String f192190z;

    /* compiled from: MessageListItemConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f192191a;

        static {
            int[] iArr = new int[StatusCode.values().length];
            try {
                iArr[StatusCode.SENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StatusCode.SENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StatusCode.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StatusCode.READ.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f192191a = iArr;
        }
    }

    @Inject
    public c0(@Y61.k LY.b bVar, @Y61.k LY.d dVar, @Y61.k x0 x0Var, @Y61.k com.avito.android.messenger.conversation.mvi.messages.builders.g gVar, @Y61.k com.avito.android.messenger.conversation.mvi.messages.builders.m mVar, @Y61.k com.avito.android.messenger.conversation.mvi.messages.builders.i iVar, @Y61.k com.avito.android.messenger.conversation.mvi.messages.builders.o oVar, @Y61.k com.avito.android.messenger.conversation.mvi.messages.builders.q qVar, @Y61.k com.avito.android.messenger.conversation.mvi.messages.builders.e eVar, @Y61.k com.avito.android.messenger.conversation.mvi.messages.builders.a aVar, @Y61.k com.avito.android.messenger.conversation.mvi.messages.builders.k kVar, @Y61.k com.avito.android.messenger.conversation.mvi.messages.builders.c cVar, @Y61.k C30277e1 c30277e1, @Y61.k u3.g<AssistantUxImprovementsSellerTestGroup> gVar2, @Y61.k u3.g<AssistantUxImprovementsBuyerTestGroup> gVar3, @Y61.k u3.g<AssistantUxImprovementsBuyer2TestGroup> gVar4, @Y61.k Resources resources) {
        this.f192165a = bVar;
        this.f192166b = dVar;
        this.f192167c = x0Var;
        this.f192168d = gVar;
        this.f192169e = mVar;
        this.f192170f = iVar;
        this.f192171g = oVar;
        this.f192172h = qVar;
        this.f192173i = eVar;
        this.f192174j = aVar;
        this.f192175k = kVar;
        this.f192176l = cVar;
        this.f192177m = c30277e1;
        this.f192178n = gVar2;
        this.f192179o = gVar3;
        this.f192180p = gVar4;
        this.f192181q = ImageKt.toImage(B4.a(resources, R.drawable.ic_messenger_avito_avatar_28));
        this.f192182r = ImageKt.toImage(B4.a(resources, R.drawable.ic_messenger_assistant_avatar));
        this.f192183s = ImageKt.toImage(B4.a(resources, R.drawable.ic_messenger_chatbot_cat_avatar_28));
        this.f192184t = resources.getString(R.string.messenger_quote_msg_user_is_not_found);
        this.f192185u = resources.getString(R.string.messenger_from_avito_message_name);
        this.f192186v = resources.getString(R.string.messenger_smart_assistant_message_caption_name);
        this.f192187w = resources.getString(R.string.messenger_smart_assistant_message_caption_name2);
        this.f192188x = resources.getString(R.string.messenger_smart_assistant_message_quote_name);
        this.f192189y = resources.getString(R.string.messenger_smart_assistant_message_quote_name2);
        this.f192190z = resources.getString(R.string.messenger_smart_assistant_reply_message_caption_name);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x047f  */
    @Override // com.avito.android.messenger.conversation.mvi.messages.b0
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList a(@Y61.k java.util.List r40, @Y61.k java.util.List r41, int r42, @Y61.k MY.c r43) {
        /*
            Method dump skipped, instructions count: 1365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.conversation.mvi.messages.c0.a(java.util.List, java.util.List, int, MY.c):java.util.ArrayList");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01b9  */
    /* JADX WARN: Type inference failed for: r28v4, types: [java.util.ArrayList] */
    @Override // com.avito.android.messenger.conversation.mvi.messages.b0
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList b(@Y61.k java.util.List r65, @Y61.k java.lang.String r66, @Y61.k java.util.List r67, @Y61.k java.util.Map r68, @Y61.k MY.c r69) {
        /*
            Method dump skipped, instructions count: 1515
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.conversation.mvi.messages.c0.b(java.util.List, java.lang.String, java.util.List, java.util.Map, MY.c):java.util.ArrayList");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(com.avito.android.messenger.conversation.T1.d r7, com.avito.android.messenger.conversation.T1.d r8, MY.c r9) {
        /*
            r6 = this;
            com.avito.android.remote.model.messenger.message.LocalMessage r7 = r7.f189180o
            r0 = 1
            r1 = 0
            if (r8 == 0) goto L19
            com.avito.android.remote.model.messenger.message.LocalMessage r2 = r8.f189180o
            java.lang.String r2 = r2.getFromId()
            java.lang.String r3 = r7.getFromId()
            boolean r2 = kotlin.jvm.internal.L.f(r2, r3)
            if (r2 != 0) goto L17
            goto L19
        L17:
            r2 = r1
            goto L1a
        L19:
            r2 = r0
        L1a:
            boolean r3 = r6.e(r9)
            r4 = 0
            if (r3 == 0) goto L43
            boolean r3 = com.avito.android.messenger.conversation.mvi.messages.e0.c(r7)
            if (r8 == 0) goto L2a
            com.avito.android.remote.model.messenger.message.LocalMessage r5 = r8.f189180o
            goto L2b
        L2a:
            r5 = r4
        L2b:
            boolean r5 = com.avito.android.messenger.conversation.mvi.messages.e0.c(r5)
            if (r3 != r5) goto L41
            boolean r3 = com.avito.android.messenger.conversation.mvi.messages.e0.b(r7)
            if (r8 == 0) goto L3a
            com.avito.android.remote.model.messenger.message.LocalMessage r5 = r8.f189180o
            goto L3b
        L3a:
            r5 = r4
        L3b:
            boolean r5 = com.avito.android.messenger.conversation.mvi.messages.e0.b(r5)
            if (r3 == r5) goto L43
        L41:
            r3 = r0
            goto L44
        L43:
            r3 = r1
        L44:
            boolean r9 = r6.f(r9)
            if (r9 == 0) goto L5a
            boolean r7 = com.avito.android.messenger.conversation.mvi.messages.e0.b(r7)
            if (r8 == 0) goto L52
            com.avito.android.remote.model.messenger.message.LocalMessage r4 = r8.f189180o
        L52:
            boolean r8 = com.avito.android.messenger.conversation.mvi.messages.e0.b(r4)
            if (r7 == r8) goto L5a
            r7 = r0
            goto L5b
        L5a:
            r7 = r1
        L5b:
            if (r2 != 0) goto L63
            if (r3 != 0) goto L63
            if (r7 == 0) goto L62
            goto L63
        L62:
            r0 = r1
        L63:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.conversation.mvi.messages.c0.c(com.avito.android.messenger.conversation.T1$d, com.avito.android.messenger.conversation.T1$d, MY.c):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(com.avito.android.messenger.conversation.T1.d r7, com.avito.android.messenger.conversation.T1.d r8, MY.c r9) {
        /*
            r6 = this;
            com.avito.android.remote.model.messenger.message.LocalMessage r7 = r7.f189180o
            r0 = 1
            r1 = 0
            if (r8 == 0) goto L19
            java.lang.String r2 = r7.getFromId()
            com.avito.android.remote.model.messenger.message.LocalMessage r3 = r8.f189180o
            java.lang.String r3 = r3.getFromId()
            boolean r2 = kotlin.jvm.internal.L.f(r2, r3)
            if (r2 != 0) goto L17
            goto L19
        L17:
            r2 = r1
            goto L1a
        L19:
            r2 = r0
        L1a:
            boolean r3 = r6.e(r9)
            r4 = 0
            if (r3 == 0) goto L43
            boolean r3 = com.avito.android.messenger.conversation.mvi.messages.e0.c(r7)
            if (r8 == 0) goto L2a
            com.avito.android.remote.model.messenger.message.LocalMessage r5 = r8.f189180o
            goto L2b
        L2a:
            r5 = r4
        L2b:
            boolean r5 = com.avito.android.messenger.conversation.mvi.messages.e0.c(r5)
            if (r3 != r5) goto L41
            boolean r3 = com.avito.android.messenger.conversation.mvi.messages.e0.b(r7)
            if (r8 == 0) goto L3a
            com.avito.android.remote.model.messenger.message.LocalMessage r5 = r8.f189180o
            goto L3b
        L3a:
            r5 = r4
        L3b:
            boolean r5 = com.avito.android.messenger.conversation.mvi.messages.e0.b(r5)
            if (r3 == r5) goto L43
        L41:
            r3 = r0
            goto L44
        L43:
            r3 = r1
        L44:
            boolean r9 = r6.f(r9)
            if (r9 == 0) goto L5a
            boolean r7 = com.avito.android.messenger.conversation.mvi.messages.e0.b(r7)
            if (r8 == 0) goto L52
            com.avito.android.remote.model.messenger.message.LocalMessage r4 = r8.f189180o
        L52:
            boolean r8 = com.avito.android.messenger.conversation.mvi.messages.e0.b(r4)
            if (r7 == r8) goto L5a
            r7 = r0
            goto L5b
        L5a:
            r7 = r1
        L5b:
            if (r2 != 0) goto L63
            if (r3 != 0) goto L63
            if (r7 == 0) goto L62
            goto L63
        L62:
            r0 = r1
        L63:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.conversation.mvi.messages.c0.d(com.avito.android.messenger.conversation.T1$d, com.avito.android.messenger.conversation.T1$d, MY.c):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(MY.c r3) {
        /*
            r2 = this;
            boolean r0 = r3.f10720c
            if (r0 == 0) goto L14
            u3.g<com.avito.android.ab_tests.configs.AssistantUxImprovementsSellerTestGroup> r0 = r2.f192178n
            u3.m<T> r0 = r0.f439742a
            T r0 = r0.f439749b
            com.avito.android.ab_tests.configs.AssistantUxImprovementsSellerTestGroup r0 = (com.avito.android.ab_tests.configs.AssistantUxImprovementsSellerTestGroup) r0
            r0.getClass()
            com.avito.android.ab_tests.configs.AssistantUxImprovementsSellerTestGroup r1 = com.avito.android.ab_tests.configs.AssistantUxImprovementsSellerTestGroup.f67775d
            if (r0 != r1) goto L14
            goto L27
        L14:
            boolean r3 = r3.f10721d
            if (r3 == 0) goto L29
            u3.g<com.avito.android.ab_tests.configs.AssistantUxImprovementsBuyerTestGroup> r3 = r2.f192179o
            u3.m<T> r3 = r3.f439742a
            T r3 = r3.f439749b
            com.avito.android.ab_tests.configs.AssistantUxImprovementsBuyerTestGroup r3 = (com.avito.android.ab_tests.configs.AssistantUxImprovementsBuyerTestGroup) r3
            r3.getClass()
            com.avito.android.ab_tests.configs.AssistantUxImprovementsBuyerTestGroup r0 = com.avito.android.ab_tests.configs.AssistantUxImprovementsBuyerTestGroup.f67770e
            if (r3 != r0) goto L29
        L27:
            r3 = 1
            goto L2a
        L29:
            r3 = 0
        L2a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.conversation.mvi.messages.c0.e(MY.c):boolean");
    }

    public final boolean f(MY.c cVar) {
        if (cVar.f10721d) {
            AssistantUxImprovementsBuyer2TestGroup assistantUxImprovementsBuyer2TestGroup = this.f192180p.f439742a.f439749b;
            assistantUxImprovementsBuyer2TestGroup.getClass();
            if (assistantUxImprovementsBuyer2TestGroup == AssistantUxImprovementsBuyer2TestGroup.f67763d || assistantUxImprovementsBuyer2TestGroup == AssistantUxImprovementsBuyer2TestGroup.f67764e) {
                return true;
            }
        }
        return false;
    }

    public final T1.d g(T1.d dVar, LocalMessage localMessage, Integer num) {
        MessageBody body = localMessage.getBody();
        this.f192169e.getClass();
        List listA = com.avito.android.messenger.conversation.mvi.messages.builders.m.a(body);
        com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.image_message.i iVarA = this.f192168d.a(dVar, localMessage);
        com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.location_message.g gVarA = this.f192170f.a(dVar);
        this.f192171g.getClass();
        com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.video_message.n nVarA = com.avito.android.messenger.conversation.mvi.messages.builders.o.a(dVar);
        this.f192172h.getClass();
        com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.voice_message.m mVarA = com.avito.android.messenger.conversation.mvi.messages.builders.q.a(dVar);
        this.f192173i.getClass();
        FileMessageData fileMessageDataA = com.avito.android.messenger.conversation.mvi.messages.builders.e.a(dVar, num);
        com.avito.android.messenger.conversation.mvi.messages.builders.a aVar = this.f192174j;
        com.avito.android.messenger.conversation.mvi.messages.composables.messages.call_message.d dVarA = aVar.a(dVar);
        com.avito.android.messenger.conversation.mvi.messages.composables.messages.call_message.h hVarB = aVar.b(dVar);
        this.f192175k.getClass();
        com.avito.android.messenger.conversation.mvi.messages.composables.messages.quotes.c cVarA = com.avito.android.messenger.conversation.mvi.messages.builders.k.a(dVar);
        this.f192176l.getClass();
        return T1.d.a(dVar, null, null, false, null, null, null, null, listA, iVarA, gVarA, nVarA, mVarA, fileMessageDataA, dVarA, hVarB, cVarA, com.avito.android.messenger.conversation.mvi.messages.builders.c.a(dVar), 16777215, 4);
    }
}
