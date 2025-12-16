package com.avito.android.suggest_addresses.mvi;

import com.avito.android.geo_common.model.AddressSuggestionV2;
import com.avito.android.remote.model.SuggestAddress;
import com.avito.android.suggest_addresses.mvi.entity.SuggestAddressesInternalAction;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import mA0.C43940a;
import oA0.C44612c;

/* compiled from: SuggestAddressesReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/suggest_addresses/mvi/t;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/suggest_addresses/mvi/entity/SuggestAddressesInternalAction;", "LoA0/c;", "<init>", "()V", "a", "_avito_suggest-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class t implements com.avito.android.arch.mvi.u<SuggestAddressesInternalAction, C44612c> {

    /* compiled from: SuggestAddressesReducer.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/suggest_addresses/mvi/t$a;", "", "<init>", "()V", "", "MAX_SELECTED_ITEMS", "I", "_avito_suggest-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public t() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.util.ArrayList] */
    @Override // com.avito.android.arch.mvi.u
    public final C44612c a(SuggestAddressesInternalAction suggestAddressesInternalAction, C44612c c44612c) {
        com.avito.android.suggest_addresses.domain.adapter.chips.c cVarA;
        ?? arrayList;
        SuggestAddressesInternalAction suggestAddressesInternalAction2 = suggestAddressesInternalAction;
        C44612c c44612c2 = c44612c;
        if (suggestAddressesInternalAction2.equals(SuggestAddressesInternalAction.LoadingStarted.f291920b)) {
            return C44612c.a(c44612c2, null, null, null, false, true, null, 47);
        }
        if (suggestAddressesInternalAction2.equals(SuggestAddressesInternalAction.LoadingStopped.f291921b)) {
            return C44612c.a(c44612c2, null, null, null, false, false, null, 47);
        }
        if (suggestAddressesInternalAction2.equals(SuggestAddressesInternalAction.NetworkError.f291922b)) {
            return C44612c.a(c44612c2, null, null, new com.avito.android.suggest_addresses.domain.adapter.error.c(true, null, 2, null), false, false, null, 59);
        }
        if (suggestAddressesInternalAction2.equals(SuggestAddressesInternalAction.NoSuggestsError.f291923b)) {
            return C44612c.a(c44612c2, null, null, new com.avito.android.suggest_addresses.domain.adapter.error.c(false, null, 2, null), false, false, null, 59);
        }
        if (suggestAddressesInternalAction2 instanceof SuggestAddressesInternalAction.SetQuery) {
            return C44612c.a(c44612c2, null, null, null, false, false, ((SuggestAddressesInternalAction.SetQuery) suggestAddressesInternalAction2).f291931b, 31);
        }
        boolean z12 = suggestAddressesInternalAction2 instanceof SuggestAddressesInternalAction.SetSuggestions;
        com.avito.android.suggest_addresses.domain.adapter.chips.c cVar = c44612c2.f419485b;
        if (z12) {
            List<C43940a> list = cVar.f291849b;
            HashSet hashSet = new HashSet();
            for (C43940a c43940a : list) {
                C42745f0.h(C42756l.B(new String[]{c43940a.f414357b, c43940a.f414358c}), hashSet);
            }
            List<AddressSuggestionV2> list2 = ((SuggestAddressesInternalAction.SetSuggestions) suggestAddressesInternalAction2).f291932b;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list2, 10));
            for (AddressSuggestionV2 addressSuggestionV2 : list2) {
                com.avito.android.suggest_addresses.domain.adapter.addresses.c cVar2 = new com.avito.android.suggest_addresses.domain.adapter.addresses.c(null, addressSuggestionV2.getJsonWebToken(), addressSuggestionV2.getTitle(), addressSuggestionV2.getSubtitle(), false, false, null, 112, null);
                if (hashSet.contains(cVar2.f291829c) || C42745f0.r(hashSet, cVar2.f291828b)) {
                    cVar2 = com.avito.android.suggest_addresses.domain.adapter.addresses.c.a(cVar2, null, true, 95);
                }
                arrayList2.add(cVar2);
            }
            return C44612c.a(c44612c2, null, arrayList2, null, false, false, null, 57);
        }
        if (suggestAddressesInternalAction2 instanceof SuggestAddressesInternalAction.AddChips) {
            List<SuggestAddress> list3 = ((SuggestAddressesInternalAction.AddChips) suggestAddressesInternalAction2).f291916b;
            ArrayList arrayList3 = new ArrayList(C42745f0.q(list3, 10));
            for (SuggestAddress suggestAddress : list3) {
                String id2 = suggestAddress.getId();
                String address = suggestAddress.getAddress();
                String str = address == null ? "" : address;
                String locality = suggestAddress.getLocality();
                String str2 = locality == null ? "" : locality;
                SuggestAddress.Kind kind = suggestAddress.getKind();
                if (kind == null) {
                    kind = SuggestAddress.Kind.STREET;
                }
                arrayList3.add(new C43940a(null, id2, str, str2, kind, suggestAddress.getParamId()));
            }
            com.avito.android.suggest_addresses.domain.adapter.chips.c cVarA2 = com.avito.android.suggest_addresses.domain.adapter.chips.c.a(cVar, arrayList3);
            return C44612c.a(c44612c2, cVarA2, null, null, cVarA2.f291849b.size() < 10, false, null, 54);
        }
        boolean z13 = suggestAddressesInternalAction2 instanceof SuggestAddressesInternalAction.SelectSuggestion;
        List<com.avito.android.suggest_addresses.domain.adapter.addresses.c> list4 = c44612c2.f419486c;
        if (!z13) {
            if (!(suggestAddressesInternalAction2 instanceof SuggestAddressesInternalAction.UnselectSuggestion)) {
                return c44612c2;
            }
            List<C43940a> list5 = cVar.f291849b;
            ArrayList arrayList4 = new ArrayList();
            for (Object obj : list5) {
                C43940a c43940a2 = (C43940a) obj;
                SuggestAddressesInternalAction.UnselectSuggestion unselectSuggestion = (SuggestAddressesInternalAction.UnselectSuggestion) suggestAddressesInternalAction2;
                if (L.f(c43940a2.f414357b, unselectSuggestion.f291933b)) {
                    String str3 = c43940a2.f414358c;
                    String str4 = unselectSuggestion.f291934c;
                    if (L.f(str3, str4) || str4 == null) {
                    }
                }
                arrayList4.add(obj);
            }
            com.avito.android.suggest_addresses.domain.adapter.chips.c cVarA3 = com.avito.android.suggest_addresses.domain.adapter.chips.c.a(cVar, arrayList4);
            List<com.avito.android.suggest_addresses.domain.adapter.addresses.c> list6 = list4;
            ArrayList arrayList5 = new ArrayList(C42745f0.q(list6, 10));
            for (com.avito.android.suggest_addresses.domain.adapter.addresses.c cVarA4 : list6) {
                if (L.f(cVarA4.f291829c, ((SuggestAddressesInternalAction.UnselectSuggestion) suggestAddressesInternalAction2).f291933b)) {
                    cVarA4 = com.avito.android.suggest_addresses.domain.adapter.addresses.c.a(cVarA4, null, false, 95);
                }
                arrayList5.add(cVarA4);
            }
            return C44612c.a(c44612c2, cVarA3, arrayList5, null, cVarA3.f291849b.size() < 10, false, null, 52);
        }
        SuggestAddressesInternalAction.SelectSuggestion selectSuggestion = (SuggestAddressesInternalAction.SelectSuggestion) suggestAddressesInternalAction2;
        String str5 = selectSuggestion.f291929f;
        String str6 = str5 == null ? "" : str5;
        String str7 = selectSuggestion.f291930g;
        String str8 = str7 == null ? "" : str7;
        SuggestAddress.Kind kind2 = selectSuggestion.f291927d;
        if (kind2 == null) {
            kind2 = SuggestAddress.Kind.STREET;
        }
        C43940a c43940a3 = new C43940a(selectSuggestion.f291925b, selectSuggestion.f291926c, str6, str8, kind2, selectSuggestion.f291928e);
        List<C43940a> list7 = cVar.f291849b;
        ArrayList arrayList6 = new ArrayList(C42745f0.q(list7, 10));
        boolean z14 = false;
        for (C43940a c43940a4 : list7) {
            if (L.f(c43940a4.f414357b, c43940a3.f414357b) || L.f(c43940a4.f414358c, c43940a3.f414358c)) {
                c43940a4 = new C43940a(selectSuggestion.f291925b, c43940a4.f414358c, c43940a4.f414359d, c43940a4.f414360e, c43940a4.f414361f, c43940a4.f414362g);
                z14 = true;
            }
            arrayList6.add(c43940a4);
        }
        boolean z15 = cVar.f291849b.size() + 1 <= 10;
        if (z15) {
            if (!z14) {
                arrayList6 = C42745f0.i0(c43940a3, arrayList6);
            }
            cVarA = com.avito.android.suggest_addresses.domain.adapter.chips.c.a(cVar, arrayList6);
        } else {
            cVarA = cVar;
        }
        if (z15) {
            List<com.avito.android.suggest_addresses.domain.adapter.addresses.c> list8 = list4;
            arrayList = new ArrayList(C42745f0.q(list8, 10));
            for (com.avito.android.suggest_addresses.domain.adapter.addresses.c cVarA5 : list8) {
                if (L.f(cVarA5.f291829c, selectSuggestion.f291925b)) {
                    cVarA5 = com.avito.android.suggest_addresses.domain.adapter.addresses.c.a(cVarA5, selectSuggestion.f291926c, true, 94);
                }
                arrayList.add(cVarA5);
            }
        } else {
            arrayList = list4;
        }
        return C44612c.a(c44612c2, cVarA, arrayList, null, cVarA.f291849b.size() < 10, false, null, 52);
    }
}
