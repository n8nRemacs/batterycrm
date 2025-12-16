package com.avito.android.mortgage_invite.participant.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.mortgage_invite.client_search.model.MortgageClient;
import com.avito.android.mortgage_invite.client_search.model.MortgageClientField;
import com.avito.android.mortgage_invite.participant.domain.model.ParticipantFieldId;
import com.avito.android.mortgage_invite.participant.mvi.entity.ParticipantInternalAction;
import com.avito.android.printable_text.PrintableText;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import o20.C44572a;
import p20.C46879d;

/* compiled from: ParticipantReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage_invite/participant/mvi/r;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/mortgage_invite/participant/mvi/entity/ParticipantInternalAction;", "Lp20/d;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class r implements u<ParticipantInternalAction, C46879d> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage_invite.participant.mvi.builder.a f206244b;

    /* compiled from: ParticipantReducer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ParticipantFieldId.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ParticipantFieldId participantFieldId = ParticipantFieldId.f206099b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ParticipantFieldId participantFieldId2 = ParticipantFieldId.f206099b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ParticipantFieldId participantFieldId3 = ParticipantFieldId.f206099b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                ParticipantFieldId participantFieldId4 = ParticipantFieldId.f206099b;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                ParticipantFieldId participantFieldId5 = ParticipantFieldId.f206099b;
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                ParticipantFieldId participantFieldId6 = ParticipantFieldId.f206099b;
                iArr[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                ParticipantFieldId participantFieldId7 = ParticipantFieldId.f206099b;
                iArr[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    @Inject
    public r(@Y61.k com.avito.android.mortgage_invite.participant.mvi.builder.a aVar) {
        this.f206244b = aVar;
    }

    public static C44572a b(C44572a c44572a) {
        List<o20.d> list = c44572a.f419315b;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (o20.d dVarA : list) {
            switch (dVarA.f419328a.ordinal()) {
                case 0:
                    dVarA = o20.d.a(dVarA, true, "", null, false, 927);
                    break;
                case 1:
                    dVarA = o20.d.a(dVarA, false, "", null, false, 927);
                    break;
                case 2:
                    dVarA = o20.d.a(dVarA, false, "", null, false, 927);
                    break;
                case 3:
                    dVarA = o20.d.a(dVarA, false, "", null, false, 927);
                    break;
                case 4:
                    dVarA = o20.d.a(dVarA, false, "", null, false, 927);
                    break;
                case 5:
                    dVarA = o20.d.a(dVarA, false, "", null, false, 927);
                    break;
                case 6:
                    dVarA = o20.d.a(dVarA, false, "", null, false, 927);
                    break;
                case 7:
                    dVarA = o20.d.a(dVarA, false, "", null, false, 927);
                    break;
            }
            arrayList.add(dVarA);
        }
        return C44572a.a(c44572a, arrayList, 5);
    }

    public static C44572a c(C44572a c44572a, LinkedHashMap linkedHashMap) {
        List<o20.d> list = c44572a.f419315b;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (o20.d dVar : list) {
            arrayList.add(o20.d.a(dVar, false, null, (PrintableText) linkedHashMap.get(dVar.f419328a), false, 895));
        }
        return C44572a.a(c44572a, arrayList, 5);
    }

    public static C44572a d(C44572a c44572a, Map map) {
        List<o20.d> list = c44572a.f419315b;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (o20.d dVarA : list) {
            String str = (String) map.get(dVarA.f419328a);
            if (str != null) {
                dVarA = o20.d.a(dVarA, true, str, null, false, 31);
            }
            arrayList.add(dVarA);
        }
        return C44572a.a(c44572a, arrayList, 1);
    }

    @Override // com.avito.android.arch.mvi.u
    public final C46879d a(ParticipantInternalAction participantInternalAction, C46879d c46879d) {
        o20.c cVarA;
        o20.c cVarA2;
        o20.c cVarA3;
        C46879d c46879dA;
        Object next;
        Object next2;
        o20.c cVarA4;
        ParticipantInternalAction participantInternalAction2 = participantInternalAction;
        C46879d c46879d2 = c46879d;
        boolean z12 = participantInternalAction2 instanceof ParticipantInternalAction.AgentFieldUpdated;
        o20.c cVar = c46879d2.f428146b;
        C46879d c46879dA2 = null;
        if (z12) {
            ParticipantInternalAction.AgentFieldUpdated agentFieldUpdated = (ParticipantInternalAction.AgentFieldUpdated) participantInternalAction2;
            c46879dA2 = C46879d.a(c46879d2, cVar != null ? o20.c.a(cVar, false, null, d(cVar.f419326f, Collections.singletonMap(agentFieldUpdated.f206189b, agentFieldUpdated.f206190c)), 95) : null, null, false, null, 30);
        } else if (participantInternalAction2 instanceof ParticipantInternalAction.ClientFieldUpdated) {
            ParticipantInternalAction.ClientFieldUpdated clientFieldUpdated = (ParticipantInternalAction.ClientFieldUpdated) participantInternalAction2;
            if (cVar == null) {
                c46879dA2 = c46879d2;
            } else {
                String str = clientFieldUpdated.f206193c;
                MortgageClient mortgageClient = c46879d2.f428147c;
                C44572a c44572a = cVar.f419325e;
                c46879dA = (mortgageClient == null || str.length() != 0) ? C46879d.a(c46879d2, o20.c.a(cVar, false, d(c44572a, Collections.singletonMap(clientFieldUpdated.f206192b, str)), null, 111), null, false, null, 30) : C46879d.a(c46879d2, o20.c.a(cVar, false, b(c44572a), null, 111), null, false, null, 28);
                c46879dA2 = c46879dA;
            }
        } else if (participantInternalAction2 instanceof ParticipantInternalAction.SetAgentFieldEmptyByMasked) {
            ParticipantInternalAction.SetAgentFieldEmptyByMasked setAgentFieldEmptyByMasked = (ParticipantInternalAction.SetAgentFieldEmptyByMasked) participantInternalAction2;
            if (cVar != null) {
                C44572a c44572a2 = cVar.f419326f;
                List<o20.d> list = c44572a2.f419315b;
                ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
                for (o20.d dVarA : list) {
                    if ((dVarA.f419328a == setAgentFieldEmptyByMasked.f206207b ? dVarA : null) != null) {
                        dVarA = o20.d.a(dVarA, false, null, null, setAgentFieldEmptyByMasked.f206208c, 383);
                    }
                    arrayList.add(dVarA);
                }
                cVarA4 = o20.c.a(cVar, false, null, C44572a.a(c44572a2, arrayList, 5), 95);
            } else {
                cVarA4 = null;
            }
            c46879dA2 = C46879d.a(c46879d2, cVarA4, null, false, null, 30);
        } else if (participantInternalAction2 instanceof ParticipantInternalAction.ClientSelected) {
            MortgageClient mortgageClient2 = ((ParticipantInternalAction.ClientSelected) participantInternalAction2).f206194b;
            if (mortgageClient2 == null) {
                c46879dA = C46879d.a(c46879d2, cVar != null ? o20.c.a(cVar, false, b(cVar.f419325e), null, 111) : null, null, false, null, 28);
            } else {
                if (cVar != null) {
                    Q q12 = new Q(ParticipantFieldId.f206099b, mortgageClient2.f205395c.f205403e);
                    ParticipantFieldId participantFieldId = ParticipantFieldId.f206100c;
                    C44572a c44572a3 = cVar.f419325e;
                    Iterator<T> it = c44572a3.f419315b.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (((o20.d) next).f419328a == participantFieldId) {
                            break;
                        }
                    }
                    o20.d dVar = (o20.d) next;
                    MortgageClientField mortgageClientField = mortgageClient2.f205396d;
                    Q q13 = new Q(participantFieldId, (dVar == null || !dVar.f419336i) ? mortgageClientField.f205398b : mortgageClientField.f205399c);
                    ParticipantFieldId participantFieldId2 = ParticipantFieldId.f206101d;
                    Iterator<T> it2 = c44572a3.f419315b.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it2.next();
                        if (((o20.d) next2).f419328a == participantFieldId2) {
                            break;
                        }
                    }
                    o20.d dVar2 = (o20.d) next2;
                    MortgageClientField mortgageClientField2 = mortgageClient2.f205397e;
                    cVarA3 = o20.c.a(cVar, false, d(c44572a3, P0.g(q12, q13, new Q(participantFieldId2, (dVar2 == null || !dVar2.f419336i) ? mortgageClientField2.f205398b : mortgageClientField2.f205399c))), null, 111);
                } else {
                    cVarA3 = null;
                }
                c46879dA = C46879d.a(c46879d2, cVarA3, mortgageClient2, false, null, 28);
            }
            c46879dA2 = c46879dA;
        } else if (participantInternalAction2 instanceof ParticipantInternalAction.FormLoadingStarted) {
            c46879dA2 = C46879d.a(c46879d2, null, null, true, null, 22);
        } else if (participantInternalAction2 instanceof ParticipantInternalAction.FormLoadingFailed) {
            c46879dA2 = C46879d.a(c46879d2, null, null, false, null, 22);
        } else if (participantInternalAction2 instanceof ParticipantInternalAction.FormLoadingCompleted) {
            c46879dA2 = C46879d.a(c46879d2, ((ParticipantInternalAction.FormLoadingCompleted) participantInternalAction2).f206202b, null, false, null, 22);
        } else if (participantInternalAction2 instanceof ParticipantInternalAction.CreateNewClientClicked) {
            if (cVar != null) {
                C44572a c44572a4 = cVar.f419325e;
                List<o20.d> list2 = c44572a4.f419315b;
                ArrayList arrayList2 = new ArrayList(C42745f0.q(list2, 10));
                for (o20.d dVarA2 : list2) {
                    switch (dVarA2.f419328a.ordinal()) {
                        case 0:
                            dVarA2 = o20.d.a(dVarA2, false, "", null, false, 927);
                            break;
                        case 1:
                            dVarA2 = o20.d.a(dVarA2, false, "", null, false, 927);
                            break;
                        case 2:
                            dVarA2 = o20.d.a(dVarA2, false, "", null, false, 927);
                            break;
                        case 3:
                            dVarA2 = o20.d.a(dVarA2, true, "", null, false, 927);
                            break;
                        case 4:
                            dVarA2 = o20.d.a(dVarA2, true, "", null, false, 927);
                            break;
                        case 5:
                            dVarA2 = o20.d.a(dVarA2, true, "", null, false, 927);
                            break;
                        case 6:
                            dVarA2 = o20.d.a(dVarA2, true, "", null, false, 927);
                            break;
                        case 7:
                            dVarA2 = o20.d.a(dVarA2, true, "", null, false, 927);
                            break;
                    }
                    arrayList2.add(dVarA2);
                }
                cVarA2 = o20.c.a(cVar, false, C44572a.a(c44572a4, arrayList2, 5), null, 111);
            } else {
                cVarA2 = null;
            }
            c46879dA2 = C46879d.a(c46879d2, cVarA2, null, false, null, 28);
        } else if (participantInternalAction2 instanceof ParticipantInternalAction.UpdateValidationResult) {
            ParticipantInternalAction.UpdateValidationResult updateValidationResult = (ParticipantInternalAction.UpdateValidationResult) participantInternalAction2;
            if (cVar != null) {
                LinkedHashMap linkedHashMap = updateValidationResult.f206209b;
                cVarA = o20.c.a(cVar, false, c(cVar.f419325e, linkedHashMap), c(cVar.f419326f, linkedHashMap), 79);
            } else {
                cVarA = null;
            }
            c46879dA2 = C46879d.a(c46879d2, cVarA, null, false, null, 30);
        } else if (participantInternalAction2 instanceof ParticipantInternalAction.CreateApplicationLoadingStarted) {
            c46879dA2 = C46879d.a(c46879d2, cVar != null ? o20.c.a(cVar, true, null, null, 119) : null, null, false, null, 30);
        } else if (participantInternalAction2 instanceof ParticipantInternalAction.CreateApplicationLoadingFailed) {
            c46879dA2 = C46879d.a(c46879d2, cVar != null ? o20.c.a(cVar, false, null, null, 119) : null, null, false, null, 30);
        } else if (participantInternalAction2 instanceof ParticipantInternalAction.CreateApplicationLoadingCompleted) {
            c46879dA2 = C46879d.a(c46879d2, cVar != null ? o20.c.a(cVar, false, null, null, 119) : null, null, false, null, 30);
        }
        return c46879dA2 != null ? this.f206244b.a(c46879dA2) : c46879d2;
    }
}
