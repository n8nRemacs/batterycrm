package com.avito.android.suggest_locations;

import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.CaseText;
import com.avito.android.remote.model.SuggestLocation;
import com.avito.android.suggest_locations.W;
import com.avito.android.suggest_locations.adapter.SuggestLocationItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.AbstractC42738c;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import tF.e;

/* compiled from: SuggestLocationsItemConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/suggest_locations/w;", "Lcom/avito/android/suggest_locations/y;", "<init>", "()V", "_avito_suggest-locations_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.suggest_locations.w, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35157w implements InterfaceC35159y {
    @Inject
    public C35157w() {
    }

    public static ArrayList c(List list) {
        SuggestLocationItem.SuggestType suggestType;
        List<SuggestLocation> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (SuggestLocation suggestLocation : list2) {
            String id2 = suggestLocation.getId();
            if (id2 == null) {
                id2 = "";
            }
            String str = id2;
            CaseText names = suggestLocation.getNames();
            if (names == null) {
                names = new CaseText();
            }
            CaseText caseText = names;
            SuggestLocation.From from = suggestLocation.getFrom();
            SuggestLocationItem.Parent parent = null;
            SuggestLocationItem.From from2 = from != null ? new SuggestLocationItem.From(from.getInternalId(), from.getName(), from.getPath()) : null;
            SuggestLocation.Parent parent2 = suggestLocation.getParent();
            if (parent2 != null) {
                String id3 = parent2.getId();
                CaseText names2 = parent2.getNames();
                if (names2 == null) {
                    names2 = new CaseText();
                }
                parent = new SuggestLocationItem.Parent(id3, names2);
            }
            SuggestLocationItem.Parent parent3 = parent;
            String suggestType2 = suggestLocation.getSuggestType();
            Iterator it = ((AbstractC42738c) SuggestLocationItem.SuggestType.f292227f).iterator();
            while (true) {
                if (!it.hasNext()) {
                    suggestType = SuggestLocationItem.SuggestType.f292225d;
                    break;
                }
                SuggestLocationItem.SuggestType suggestType3 = (SuggestLocationItem.SuggestType) it.next();
                if (suggestType3.f292228b.equals(suggestType2)) {
                    suggestType = suggestType3;
                    break;
                }
            }
            arrayList.add(new SuggestLocationItem(str, caseText, from2, parent3, suggestType));
        }
        return arrayList;
    }

    @Override // com.avito.android.suggest_locations.InterfaceC35159y
    @Y61.k
    public final W a(@Y61.k String str, @Y61.l ArrayList arrayList) {
        if (arrayList != null) {
            return new W.c(c(arrayList), str);
        }
        return new W.a(new ApiError.UnknownError("converter stub", null, null, 6, null));
    }

    @Override // com.avito.android.suggest_locations.InterfaceC35159y
    @Y61.k
    public final W b(@Y61.k tF.e eVar, @Y61.k String str) {
        if (eVar instanceof e.c) {
            return new W.c(c(((e.c) eVar).a()), str);
        }
        if (eVar instanceof e.b) {
            return new W.b(new ApiError.NetworkIOError("converter stub"));
        }
        if (!(eVar instanceof e.a)) {
            throw new NoWhenBranchMatchedException();
        }
        return new W.a(new ApiError.UnknownError("converter stub", null, null, 6, null));
    }
}
