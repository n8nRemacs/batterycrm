package com.avito.android.ai_assistant.screens.chat.mvi;

import Vb.j;
import androidx.compose.runtime.C22026a;
import com.avito.android.advert.item.blocks.items_factories.C28081y0;
import com.avito.android.ai_assistant.adapter.append.AppendState;
import com.avito.android.ai_assistant.model.AppendDirection;
import com.avito.android.ai_assistant.model.MessageActionType;
import com.avito.android.ai_assistant.model.MessageSendFrom;
import com.avito.android.ai_assistant.model.OkRespDataSuccessElementsItem;
import com.avito.android.ai_assistant.model.ReactionState;
import com.avito.android.ai_assistant.screens.chat.mvi.entity.AiAssistantInternalAction;
import com.avito.android.ai_assistant.screens.chat.mvi.entity.SendButtonMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: AiAssistantChatReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ai_assistant/screens/chat/mvi/H;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction;", "LVb/i;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class H implements com.avito.android.arch.mvi.u<AiAssistantInternalAction, Vb.i> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.ai_assistant.adapter.b f89200b;

    /* compiled from: AiAssistantChatReducer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f89201a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f89202b;

        static {
            int[] iArr = new int[AppendDirection.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AppendDirection appendDirection = AppendDirection.f89103b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f89201a = iArr;
            int[] iArr2 = new int[MessageSendFrom.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                MessageSendFrom messageSendFrom = MessageSendFrom.f89113b;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr3 = new int[MessageActionType.values().length];
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                MessageActionType messageActionType = MessageActionType.f89107b;
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                MessageActionType messageActionType2 = MessageActionType.f89107b;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                MessageActionType messageActionType3 = MessageActionType.f89107b;
                iArr3[3] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr4 = new int[AiAssistantInternalAction.UpdateChatHistory.AnswerLoading.values().length];
            try {
                iArr4[0] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                AiAssistantInternalAction.UpdateChatHistory.AnswerLoading answerLoading = AiAssistantInternalAction.UpdateChatHistory.AnswerLoading.f89248b;
                iArr4[1] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            f89202b = iArr4;
        }
    }

    @Inject
    public H(@Y61.k com.avito.android.ai_assistant.adapter.b bVar) {
        this.f89200b = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
    public static ArrayList c(List list, AppendState appendState) {
        com.avito.android.ai_assistant.adapter.append.b next;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = 0;
                break;
            }
            next = it.next();
            if (((com.avito.android.ai_assistant.adapter.a) next) instanceof com.avito.android.ai_assistant.adapter.append.b) {
                break;
            }
        }
        com.avito.android.ai_assistant.adapter.append.b bVar = next instanceof com.avito.android.ai_assistant.adapter.append.b ? next : null;
        if (bVar != null) {
            int iIndexOf = arrayList.indexOf(bVar);
            arrayList.remove(iIndexOf);
            arrayList.add(iIndexOf, new com.avito.android.ai_assistant.adapter.append.b(bVar.f88732b, appendState));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Object, java.util.List] */
    @Override // com.avito.android.arch.mvi.u
    public final Vb.i a(AiAssistantInternalAction aiAssistantInternalAction, Vb.i iVar) {
        ReactionState reactionState;
        int iNextIndex;
        Tb.d dVar;
        AiAssistantInternalAction aiAssistantInternalAction2 = aiAssistantInternalAction;
        Vb.i iVar2 = iVar;
        boolean z12 = aiAssistantInternalAction2 instanceof AiAssistantInternalAction.A;
        Vb.m mVar = iVar2.f17249b;
        if (z12) {
            return Vb.i.a(iVar2, Vb.m.a(iVar2.f17249b, null, ((AiAssistantInternalAction.A) aiAssistantInternalAction2).f89238a, mVar.f17269d == SendButtonMode.f89288c || ((AiAssistantInternalAction.A) aiAssistantInternalAction2).f89238a.length() > 0, false, null, null, 121), null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
        }
        if (aiAssistantInternalAction2 instanceof AiAssistantInternalAction.b) {
            SendButtonMode sendButtonMode = SendButtonMode.f89287b;
            String str = mVar.f17267b;
            boolean z13 = !(str == null || str.length() == 0);
            ArrayList arrayList = new ArrayList(mVar.f17272g);
            if (C42745f0.S(arrayList) instanceof com.avito.android.ai_assistant.adapter.answer_loading.b) {
                C22026a.e(1, arrayList);
            }
            return Vb.i.a(iVar2, Vb.m.a(mVar, null, null, z13, false, null, arrayList, 51), null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
        }
        if (aiAssistantInternalAction2 instanceof AiAssistantInternalAction.n) {
            return Vb.i.a(iVar2, Vb.m.a(mVar, j.c.f17258a, null, false, false, null, null, WebSocketProtocol.PAYLOAD_SHORT), null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
        }
        if (aiAssistantInternalAction2 instanceof AiAssistantInternalAction.k) {
            AiAssistantInternalAction.k kVar = (AiAssistantInternalAction.k) aiAssistantInternalAction2;
            return Vb.i.a(iVar2, null, kVar.f89265a, kVar.f89266b, null, null, null, 121);
        }
        boolean z14 = aiAssistantInternalAction2 instanceof AiAssistantInternalAction.j;
        Object obj = null;
        String str2 = null;
        Vb.k kVar2 = iVar2.f17253f;
        if (z14) {
            AiAssistantInternalAction.j jVar = (AiAssistantInternalAction.j) aiAssistantInternalAction2;
            return Vb.i.a(iVar2, Vb.m.a(iVar2.f17249b, new j.b(jVar.f89263a), null, false, false, null, null, WebSocketProtocol.PAYLOAD_SHORT), null, null, Vb.k.a(kVar2, jVar.f89264b, null, 2), null, null, 110);
        }
        boolean z15 = aiAssistantInternalAction2 instanceof AiAssistantInternalAction.UpdateChatHistory;
        List<Tb.e> list = iVar2.f17255h;
        if (z15) {
            AiAssistantInternalAction.UpdateChatHistory updateChatHistory = (AiAssistantInternalAction.UpdateChatHistory) aiAssistantInternalAction2;
            List listB = b(updateChatHistory.f89239a, new ArrayList(mVar.f17272g), updateChatHistory.f89241c, updateChatHistory.f89242d, updateChatHistory.f89245g, updateChatHistory.f89246h);
            Vb.j dVar2 = j.a.f17256a;
            if (!(mVar.f17266a instanceof j.a) && (dVar = updateChatHistory.f89240b) != null) {
                dVar2 = new j.d(dVar.f15738b.getImage(), dVar.f15739c, dVar.f15737a);
            }
            Vb.j jVar2 = dVar2;
            AppendDirection appendDirection = updateChatHistory.f89242d;
            Vb.m mVar2 = iVar2.f17249b;
            Vb.m mVarA = Vb.m.a(mVar2, jVar2, null, false, false, appendDirection == null ? updateChatHistory.f89244f : mVar2.f17271f, listB, 30);
            Vb.k kVarA = Vb.k.a(kVar2, null, updateChatHistory.f89243e ? null : kVar2.f17263b, 1);
            List<Tb.e> list2 = appendDirection == null ? updateChatHistory.f89247i : null;
            return Vb.i.a(iVar2, mVarA, null, null, kVarA, null, list2 == null ? list : list2, 46);
        }
        if (aiAssistantInternalAction2 instanceof AiAssistantInternalAction.e) {
            return Vb.i.a(iVar2, Vb.m.a(iVar2.f17249b, new j.b(((AiAssistantInternalAction.e) aiAssistantInternalAction2).f89257a), null, false, false, null, null, WebSocketProtocol.PAYLOAD_SHORT), null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
        }
        if (aiAssistantInternalAction2 instanceof AiAssistantInternalAction.r) {
            return Vb.i.a(iVar2, Vb.m.a(iVar2.f17249b, null, null, false, false, null, c(mVar.f17272g, AppendState.f88727b), 63), null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
        }
        if (aiAssistantInternalAction2 instanceof AiAssistantInternalAction.q) {
            int iOrdinal = ((AiAssistantInternalAction.q) aiAssistantInternalAction2).f89273a.ordinal();
            if (iOrdinal == 0) {
                return Vb.i.a(iVar2, Vb.m.a(iVar2.f17249b, null, null, false, false, null, c(mVar.f17272g, AppendState.f88728c), 63), null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
            }
            if (iOrdinal == 1) {
                return iVar2;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (aiAssistantInternalAction2 instanceof AiAssistantInternalAction.t) {
            ArrayList arrayList2 = new ArrayList(mVar.f17272g);
            ListIterator listIterator = arrayList2.listIterator(arrayList2.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    iNextIndex = -1;
                    break;
                }
                if (((com.avito.android.ai_assistant.adapter.a) listIterator.previous()) instanceof com.avito.android.ai_assistant.adapter.segment_buttons.a) {
                    iNextIndex = listIterator.nextIndex();
                    break;
                }
            }
            if (iNextIndex > -1) {
                arrayList2.remove(iNextIndex);
            }
            int iOrdinal2 = ((AiAssistantInternalAction.t) aiAssistantInternalAction2).f89279a.ordinal();
            if (iOrdinal2 != 0) {
                if (iOrdinal2 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                str2 = mVar.f17267b;
            }
            return Vb.i.a(iVar2, Vb.m.a(iVar2.f17249b, null, str2, false, false, null, C42745f0.M0(arrayList2), 61), null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
        }
        if (aiAssistantInternalAction2 instanceof AiAssistantInternalAction.s) {
            return Vb.i.a(iVar2, null, null, null, Vb.k.a(kVar2, null, ((AiAssistantInternalAction.s) aiAssistantInternalAction2).f89277b, 1), null, null, 111);
        }
        if (aiAssistantInternalAction2 instanceof AiAssistantInternalAction.i) {
            return Vb.i.a(iVar2, Vb.m.a(mVar, null, null, false, false, null, null, 111), null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
        }
        if (aiAssistantInternalAction2 instanceof AiAssistantInternalAction.l) {
            return Vb.i.a(iVar2, Vb.m.a(mVar, null, null, false, true, null, null, 111), null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
        }
        if (aiAssistantInternalAction2 instanceof AiAssistantInternalAction.z) {
            return Vb.i.a(iVar2, null, null, null, null, ((AiAssistantInternalAction.z) aiAssistantInternalAction2).f89286a.f17234a, null, 95);
        }
        if (!(aiAssistantInternalAction2 instanceof AiAssistantInternalAction.y)) {
            if (!(aiAssistantInternalAction2 instanceof AiAssistantInternalAction.m)) {
                if (!(aiAssistantInternalAction2 instanceof AiAssistantInternalAction.g)) {
                    return aiAssistantInternalAction2.equals(AiAssistantInternalAction.v.f89281a) ? Vb.i.a(iVar2, Vb.m.a(iVar2.f17249b, null, null, false, false, null, b(C42784z0.f406748b, new ArrayList(mVar.f17272g), true, AppendDirection.f89104c, AiAssistantInternalAction.UpdateChatHistory.AnswerLoading.f89248b, false), 63), null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT) : iVar2;
                }
                List<Tb.e> list3 = list;
                ArrayList arrayList3 = new ArrayList(C42745f0.q(list3, 10));
                Iterator<T> it = list3.iterator();
                while (it.hasNext()) {
                    arrayList3.add(new Tb.e(((Tb.e) it.next()).f15741a, true));
                }
                return Vb.i.a(iVar2, null, null, null, null, null, arrayList3, 63);
            }
            ArrayList arrayList4 = new ArrayList(mVar.f17272g);
            ArrayList arrayList5 = new ArrayList(C42745f0.q(arrayList4, 10));
            Iterator it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                com.avito.conveyor_item.a cVar = (com.avito.android.ai_assistant.adapter.a) it2.next();
                if (cVar instanceof com.avito.android.ai_assistant.adapter.simple_snippet.c) {
                    AiAssistantInternalAction.m mVar3 = (AiAssistantInternalAction.m) aiAssistantInternalAction2;
                    com.avito.android.ai_assistant.adapter.simple_snippet.c cVar2 = (com.avito.android.ai_assistant.adapter.simple_snippet.c) cVar;
                    if (mVar3.f89268a.contains(cVar2.f88888l)) {
                        cVar = new com.avito.android.ai_assistant.adapter.simple_snippet.c(cVar2.f88878b, cVar2.f88879c, cVar2.f88880d, cVar2.f88881e, cVar2.f88882f, cVar2.f88883g, cVar2.f88884h, cVar2.f88885i, mVar3.f89269b, cVar2.f88887k, cVar2.f88888l);
                    }
                }
                arrayList5.add(cVar);
            }
            return Vb.i.a(iVar2, Vb.m.a(iVar2.f17249b, null, null, false, false, null, arrayList5, 63), null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
        }
        ArrayList arrayList6 = new ArrayList(mVar.f17272g);
        ArrayList arrayList7 = new ArrayList();
        Iterator it3 = arrayList6.iterator();
        while (it3.hasNext()) {
            Object next = it3.next();
            if (next instanceof com.avito.android.ai_assistant.adapter.message_actions.a) {
                arrayList7.add(next);
            }
        }
        Iterator it4 = arrayList7.iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            Object next2 = it4.next();
            if (L.f(((com.avito.android.ai_assistant.adapter.message_actions.a) next2).f88813c, ((AiAssistantInternalAction.y) aiAssistantInternalAction2).f89284a)) {
                obj = next2;
                break;
            }
        }
        com.avito.android.ai_assistant.adapter.message_actions.a aVar = (com.avito.android.ai_assistant.adapter.message_actions.a) obj;
        if (aVar != null) {
            int iIndexOf = arrayList6.indexOf(aVar);
            int iOrdinal3 = ((AiAssistantInternalAction.y) aiAssistantInternalAction2).f89285b.ordinal();
            if (iOrdinal3 == 0) {
                reactionState = ReactionState.f89130c;
            } else if (iOrdinal3 == 1) {
                reactionState = ReactionState.f89129b;
            } else if (iOrdinal3 == 2) {
                reactionState = ReactionState.f89131d;
            } else {
                if (iOrdinal3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                reactionState = ReactionState.f89129b;
            }
            com.avito.android.ai_assistant.adapter.message_actions.a aVar2 = new com.avito.android.ai_assistant.adapter.message_actions.a(aVar.f88812b, aVar.f88813c, aVar.f88814d, reactionState);
            arrayList6.remove(iIndexOf);
            arrayList6.add(iIndexOf, aVar2);
        }
        return Vb.i.a(iVar2, Vb.m.a(iVar2.f17249b, null, null, false, false, null, C42745f0.M0(arrayList6), 63), null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
    }

    public final List b(List list, ArrayList arrayList, boolean z12, AppendDirection appendDirection, AiAssistantInternalAction.UpdateChatHistory.AnswerLoading answerLoading, boolean z13) {
        Object next;
        Object next2;
        ArrayList arrayList2 = new ArrayList();
        Object obj = null;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.addAll(this.f89200b.a((OkRespDataSuccessElementsItem) it.next()));
            }
            if (!z12 && appendDirection != AppendDirection.f89104c) {
                arrayList2.add(0, new com.avito.android.ai_assistant.adapter.append.b(null, null, 3, null));
            }
        }
        int i12 = appendDirection == null ? -1 : a.f89201a[appendDirection.ordinal()];
        if (i12 != -1) {
            if (i12 == 1) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                    if (((com.avito.android.ai_assistant.adapter.a) next2) instanceof com.avito.android.ai_assistant.adapter.append.b) {
                        break;
                    }
                }
                com.avito.android.ai_assistant.adapter.a aVar = (com.avito.android.ai_assistant.adapter.a) next2;
                if (aVar != null) {
                    arrayList.remove(aVar);
                }
                arrayList2 = C42745f0.h0(arrayList, arrayList2);
            } else {
                if (i12 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                arrayList2 = C42745f0.h0(arrayList2, arrayList);
            }
        }
        ArrayList arrayList3 = new ArrayList(arrayList2);
        Iterator it3 = arrayList3.iterator();
        while (true) {
            if (!it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
            if (L.f(((com.avito.android.ai_assistant.adapter.a) next).getF9890b(), "REPEAT_REQUEST_BUTTON")) {
                break;
            }
        }
        com.avito.android.ai_assistant.adapter.a aVar2 = (com.avito.android.ai_assistant.adapter.a) next;
        if (aVar2 != null) {
            arrayList3.remove(aVar2);
        }
        if (z13) {
            arrayList3.add(new com.avito.android.ai_assistant.adapter.repeat_button.b(null, 1, null));
        }
        int i13 = answerLoading != null ? a.f89202b[answerLoading.ordinal()] : -1;
        if (i13 == 1) {
            arrayList3.removeIf(new C28081y0(I.f89203l, 1));
            arrayList3.add(new com.avito.android.ai_assistant.adapter.answer_loading.b(null, 1, null));
        } else if (i13 == 2) {
            Iterator it4 = arrayList3.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                Object next3 = it4.next();
                if (((com.avito.android.ai_assistant.adapter.a) next3) instanceof com.avito.android.ai_assistant.adapter.answer_loading.b) {
                    obj = next3;
                    break;
                }
            }
            com.avito.android.ai_assistant.adapter.a aVar3 = (com.avito.android.ai_assistant.adapter.a) obj;
            if (aVar3 != null) {
                arrayList3.remove(aVar3);
            }
        }
        return C42745f0.M0(arrayList3);
    }
}
