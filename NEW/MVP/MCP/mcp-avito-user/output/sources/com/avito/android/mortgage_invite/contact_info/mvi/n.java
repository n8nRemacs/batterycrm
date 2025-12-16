package com.avito.android.mortgage_invite.contact_info.mvi;

import a20.C19669a;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.mortgage_invite.client_search.model.MortgageClient;
import com.avito.android.mortgage_invite.common.domain.model.ContactInfoFieldId;
import com.avito.android.mortgage_invite.contact_info.mvi.entity.ApplicationContactInfoInternalAction;
import com.avito.android.printable_text.PrintableText;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: ApplicationContactInfoReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage_invite/contact_info/mvi/n;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/mortgage_invite/contact_info/mvi/entity/ApplicationContactInfoInternalAction;", "Lb20/d;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class n implements u<ApplicationContactInfoInternalAction, b20.d> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage_invite.contact_info.mvi.builder.a f205745b;

    /* compiled from: ApplicationContactInfoReducer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ContactInfoFieldId.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ContactInfoFieldId.a aVar = ContactInfoFieldId.f205524b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ContactInfoFieldId.a aVar2 = ContactInfoFieldId.f205524b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ContactInfoFieldId.a aVar3 = ContactInfoFieldId.f205524b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                ContactInfoFieldId.a aVar4 = ContactInfoFieldId.f205524b;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                ContactInfoFieldId.a aVar5 = ContactInfoFieldId.f205524b;
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    @Inject
    public n(@Y61.k com.avito.android.mortgage_invite.contact_info.mvi.builder.a aVar) {
        this.f205745b = aVar;
    }

    public static Y10.a b(Y10.a aVar, LinkedHashMap linkedHashMap) {
        List<Y10.b> list = aVar.f19259b;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (Y10.b bVar : list) {
            arrayList.add(Y10.b.a(bVar, false, null, (PrintableText) linkedHashMap.get(bVar.f19261a), false, 1535));
        }
        return Y10.a.a(aVar, arrayList, 5);
    }

    public static Y10.a c(Y10.a aVar, ContactInfoFieldId contactInfoFieldId, boolean z12) {
        List<Y10.b> list = aVar.f19259b;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (Y10.b bVarA : list) {
            if ((bVarA.f19261a == contactInfoFieldId ? bVarA : null) != null) {
                bVarA = Y10.b.a(bVarA, false, null, null, z12, 511);
            }
            arrayList.add(bVarA);
        }
        return Y10.a.a(aVar, arrayList, 5);
    }

    public static Y10.a d(Y10.a aVar, Map map) {
        List<Y10.b> list = aVar.f19259b;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (Y10.b bVarA : list) {
            String str = (String) map.get(bVarA.f19261a);
            if (str != null) {
                bVarA = Y10.b.a(bVarA, true, str, null, false, 187);
            }
            arrayList.add(bVarA);
        }
        return Y10.a.a(aVar, arrayList, 1);
    }

    @Override // com.avito.android.arch.mvi.u
    public final b20.d a(ApplicationContactInfoInternalAction applicationContactInfoInternalAction, b20.d dVar) {
        b20.d dVarA;
        C19669a c19669aA;
        C19669a c19669aA2;
        ApplicationContactInfoInternalAction applicationContactInfoInternalAction2 = applicationContactInfoInternalAction;
        b20.d dVar2 = dVar;
        if (applicationContactInfoInternalAction2 instanceof ApplicationContactInfoInternalAction.Init) {
            dVarA = b20.d.a(dVar2, null, null, ((ApplicationContactInfoInternalAction.Init) applicationContactInfoInternalAction2).f205713b.f205672b, false, null, 27);
        } else {
            boolean z12 = applicationContactInfoInternalAction2 instanceof ApplicationContactInfoInternalAction.AgentFieldUpdated;
            C19669a c19669a = dVar2.f56844b;
            if (z12) {
                ApplicationContactInfoInternalAction.AgentFieldUpdated agentFieldUpdated = (ApplicationContactInfoInternalAction.AgentFieldUpdated) applicationContactInfoInternalAction2;
                dVarA = b20.d.a(dVar2, c19669a != null ? C19669a.a(c19669a, false, null, d(c19669a.f20715g, Collections.singletonMap(agentFieldUpdated.f205697b, agentFieldUpdated.f205698c)), 63) : null, null, null, false, null, 30);
            } else if (applicationContactInfoInternalAction2 instanceof ApplicationContactInfoInternalAction.ClientFieldUpdated) {
                ApplicationContactInfoInternalAction.ClientFieldUpdated clientFieldUpdated = (ApplicationContactInfoInternalAction.ClientFieldUpdated) applicationContactInfoInternalAction2;
                if (c19669a == null) {
                    dVarA = dVar2;
                } else {
                    String str = clientFieldUpdated.f205701c;
                    MortgageClient mortgageClient = dVar2.f56845c;
                    Y10.a aVar = c19669a.f20714f;
                    if (mortgageClient == null || str.length() != 0) {
                        dVarA = b20.d.a(dVar2, C19669a.a(c19669a, false, d(aVar, Collections.singletonMap(clientFieldUpdated.f205700b, str)), null, 95), null, null, false, null, 30);
                    } else {
                        List<Y10.b> list = aVar.f19259b;
                        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
                        for (Y10.b bVarA : list) {
                            int iOrdinal = bVarA.f19261a.ordinal();
                            if (iOrdinal == 0) {
                                bVarA = Y10.b.a(bVarA, true, "", null, false, 1727);
                            } else if (iOrdinal == 1) {
                                bVarA = Y10.b.a(bVarA, false, "", null, false, 1727);
                            } else if (iOrdinal == 2) {
                                bVarA = Y10.b.a(bVarA, false, "", null, false, 1727);
                            } else if (iOrdinal == 3) {
                                bVarA = Y10.b.a(bVarA, false, "", null, false, 1727);
                            } else if (iOrdinal == 4) {
                                bVarA = Y10.b.a(bVarA, false, "", null, false, 1727);
                            } else if (iOrdinal == 5) {
                                bVarA = Y10.b.a(bVarA, false, "", null, false, 1727);
                            }
                            arrayList.add(bVarA);
                        }
                        dVarA = b20.d.a(dVar2, C19669a.a(c19669a, false, Y10.a.a(aVar, arrayList, 5), null, 95), null, null, false, null, 28);
                    }
                }
            } else if (applicationContactInfoInternalAction2 instanceof ApplicationContactInfoInternalAction.SetAgentFieldEmptyByMasked) {
                ApplicationContactInfoInternalAction.SetAgentFieldEmptyByMasked setAgentFieldEmptyByMasked = (ApplicationContactInfoInternalAction.SetAgentFieldEmptyByMasked) applicationContactInfoInternalAction2;
                dVarA = b20.d.a(dVar2, c19669a != null ? C19669a.a(c19669a, false, null, c(c19669a.f20715g, setAgentFieldEmptyByMasked.f205715b, setAgentFieldEmptyByMasked.f205716c), 63) : null, null, null, false, null, 30);
            } else if (applicationContactInfoInternalAction2 instanceof ApplicationContactInfoInternalAction.SetClientFieldEmptyByMasked) {
                ApplicationContactInfoInternalAction.SetClientFieldEmptyByMasked setClientFieldEmptyByMasked = (ApplicationContactInfoInternalAction.SetClientFieldEmptyByMasked) applicationContactInfoInternalAction2;
                dVarA = b20.d.a(dVar2, c19669a != null ? C19669a.a(c19669a, false, c(c19669a.f20714f, setClientFieldEmptyByMasked.f205717b, setClientFieldEmptyByMasked.f205718c), null, 95) : null, null, null, false, null, 30);
            } else if (applicationContactInfoInternalAction2 instanceof ApplicationContactInfoInternalAction.ClientSelected) {
                MortgageClient mortgageClient2 = ((ApplicationContactInfoInternalAction.ClientSelected) applicationContactInfoInternalAction2).f205702b;
                dVarA = b20.d.a(dVar2, c19669a != null ? C19669a.a(c19669a, false, d(c19669a.f20714f, P0.g(new Q(ContactInfoFieldId.f205525c, mortgageClient2.f205395c.f205403e), new Q(ContactInfoFieldId.f205526d, mortgageClient2.f205396d.f205399c))), null, 95) : null, mortgageClient2, null, false, null, 28);
            } else if (applicationContactInfoInternalAction2 instanceof ApplicationContactInfoInternalAction.FormLoadingStarted) {
                dVarA = b20.d.a(dVar2, null, null, null, true, null, 22);
            } else if (applicationContactInfoInternalAction2 instanceof ApplicationContactInfoInternalAction.FormLoadingFailed) {
                dVarA = b20.d.a(dVar2, null, null, null, false, null, 22);
            } else if (applicationContactInfoInternalAction2 instanceof ApplicationContactInfoInternalAction.FormLoadingCompleted) {
                dVarA = b20.d.a(dVar2, ((ApplicationContactInfoInternalAction.FormLoadingCompleted) applicationContactInfoInternalAction2).f205709b, null, null, false, null, 22);
            } else if (applicationContactInfoInternalAction2 instanceof ApplicationContactInfoInternalAction.CreateNewClientClicked) {
                if (c19669a != null) {
                    Y10.a aVar2 = c19669a.f20714f;
                    List<Y10.b> list2 = aVar2.f19259b;
                    ArrayList arrayList2 = new ArrayList(C42745f0.q(list2, 10));
                    for (Y10.b bVarA2 : list2) {
                        int iOrdinal2 = bVarA2.f19261a.ordinal();
                        if (iOrdinal2 == 0) {
                            bVarA2 = Y10.b.a(bVarA2, false, "", null, false, 1727);
                        } else if (iOrdinal2 == 1) {
                            bVarA2 = Y10.b.a(bVarA2, false, "", null, false, 1727);
                        } else if (iOrdinal2 == 2) {
                            bVarA2 = Y10.b.a(bVarA2, true, "", null, false, 1727);
                        } else if (iOrdinal2 == 3) {
                            bVarA2 = Y10.b.a(bVarA2, true, "", null, false, 1727);
                        } else if (iOrdinal2 == 4) {
                            bVarA2 = Y10.b.a(bVarA2, true, "", null, false, 1727);
                        } else if (iOrdinal2 == 5) {
                            bVarA2 = Y10.b.a(bVarA2, true, "", null, false, 1727);
                        }
                        arrayList2.add(bVarA2);
                    }
                    c19669aA2 = C19669a.a(c19669a, false, Y10.a.a(aVar2, arrayList2, 5), null, 95);
                } else {
                    c19669aA2 = null;
                }
                dVarA = b20.d.a(dVar2, c19669aA2, null, null, false, null, 28);
            } else if (applicationContactInfoInternalAction2 instanceof ApplicationContactInfoInternalAction.UpdateValidationResult) {
                ApplicationContactInfoInternalAction.UpdateValidationResult updateValidationResult = (ApplicationContactInfoInternalAction.UpdateValidationResult) applicationContactInfoInternalAction2;
                if (c19669a != null) {
                    LinkedHashMap linkedHashMap = updateValidationResult.f205719b;
                    c19669aA = C19669a.a(c19669a, false, b(c19669a.f20714f, linkedHashMap), b(c19669a.f20715g, linkedHashMap), 31);
                } else {
                    c19669aA = null;
                }
                dVarA = b20.d.a(dVar2, c19669aA, null, null, false, null, 30);
            } else if (applicationContactInfoInternalAction2 instanceof ApplicationContactInfoInternalAction.CreateApplicationLoadingStarted) {
                dVarA = b20.d.a(dVar2, c19669a != null ? C19669a.a(c19669a, true, null, null, 111) : null, null, null, false, null, 30);
            } else if (applicationContactInfoInternalAction2 instanceof ApplicationContactInfoInternalAction.CreateApplicationLoadingFailed) {
                dVarA = b20.d.a(dVar2, c19669a != null ? C19669a.a(c19669a, false, null, null, 111) : null, null, null, false, null, 30);
            } else if (applicationContactInfoInternalAction2 instanceof ApplicationContactInfoInternalAction.CreateApplicationLoadingCompleted) {
                dVarA = b20.d.a(dVar2, c19669a != null ? C19669a.a(c19669a, false, null, null, 111) : null, null, null, false, null, 30);
            } else {
                dVarA = null;
            }
        }
        return dVarA != null ? this.f205745b.a(dVarA) : dVar2;
    }
}
