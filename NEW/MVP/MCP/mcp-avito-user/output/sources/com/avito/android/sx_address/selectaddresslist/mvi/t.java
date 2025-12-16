package com.avito.android.sx_address.selectaddresslist.mvi;

import UA0.b;
import androidx.compose.runtime.internal.P;
import com.avito.android.sx_address.selectaddresslist.domain.AddressListViewItem;
import com.avito.android.sx_address.selectaddresslist.domain.SelectListScreenData;
import com.avito.android.sx_address.selectaddresslist.mvi.entity.SelectAddressListState;
import com.avito.android.sx_address.selectaddresslist.mvi.entity.SelectAddressListViewState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: SelectAddressListReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/sx_address/selectaddresslist/mvi/t;", "Lcom/avito/android/arch/mvi/u;", "LUA0/b;", "Lcom/avito/android/sx_address/selectaddresslist/mvi/entity/SelectAddressListState;", "<init>", "()V", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class t implements com.avito.android.arch.mvi.u<UA0.b, SelectAddressListState> {

    /* compiled from: SelectAddressListReducer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[SelectAddressListState.LoadingType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                SelectAddressListState.LoadingType loadingType = SelectAddressListState.LoadingType.f294113b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                SelectAddressListState.LoadingType loadingType2 = SelectAddressListState.LoadingType.f294113b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Inject
    public t() {
    }

    public static SelectAddressListState b(SelectAddressListState selectAddressListState) {
        int iOrdinal = selectAddressListState.f294111b.ordinal();
        if (iOrdinal == 0) {
            return SelectAddressListState.a(selectAddressListState, null, null, new SelectAddressListViewState.Content(selectAddressListState.f294110a), 3);
        }
        if (iOrdinal == 1) {
            return SelectAddressListState.a(selectAddressListState, null, null, SelectAddressListViewState.Loading.f294120b, 3);
        }
        if (iOrdinal == 2) {
            return SelectAddressListState.a(selectAddressListState, null, null, SelectAddressListViewState.Error.f294119b, 3);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.Object, java.util.List] */
    @Override // com.avito.android.arch.mvi.u
    public final SelectAddressListState a(UA0.b bVar, SelectAddressListState selectAddressListState) {
        Object next;
        UA0.b bVar2 = bVar;
        SelectAddressListState selectAddressListState2 = selectAddressListState;
        if (bVar2 instanceof b.e) {
            return b(SelectAddressListState.a(selectAddressListState2, ((b.e) bVar2).f16253a, null, null, 6));
        }
        if (bVar2 instanceof b.i) {
            return b(SelectAddressListState.a(selectAddressListState2, null, ((b.i) bVar2).f16257a ? SelectAddressListState.LoadingType.f294114c : SelectAddressListState.LoadingType.f294113b, null, 5));
        }
        if (!(bVar2 instanceof b.a)) {
            return bVar2 instanceof b.C1105b ? SelectAddressListState.a(selectAddressListState2, null, null, new SelectAddressListViewState.Content(SelectListScreenData.a(selectAddressListState2.f294110a, ((b.C1105b) bVar2).f16250a, null, false, 1022)), 3) : bVar2 instanceof b.h ? b(SelectAddressListState.a(selectAddressListState2, null, SelectAddressListState.LoadingType.f294115d, null, 5)) : selectAddressListState2;
        }
        SelectListScreenData selectListScreenData = selectAddressListState2.f294110a;
        Iterator<AddressListViewItem> it = selectListScreenData.f294076b.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            }
            if (it.next().getF287615b() == ((b.a) bVar2).f16249a.getF287615b()) {
                break;
            }
            i12++;
        }
        List<AddressListViewItem> list = selectListScreenData.f294076b;
        Iterator<AddressListViewItem> it2 = list.iterator();
        int i13 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i13 = -1;
                break;
            }
            String str = it2.next().f294064b;
            AddressListViewItem addressListViewItem = selectListScreenData.f294077c;
            if (L.f(str, addressListViewItem != null ? addressListViewItem.f294064b : null)) {
                break;
            }
            i13++;
        }
        ArrayList arrayList = new ArrayList(list);
        if (i13 != -1) {
            arrayList.set(i13, AddressListViewItem.a((AddressListViewItem) arrayList.get(i13), false, false, 223));
        }
        b.a aVar = (b.a) bVar2;
        arrayList.set(i12, aVar.f16249a);
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
            if (((AddressListViewItem) next).f294071i) {
                break;
            }
        }
        if (next != null) {
            Iterator it4 = arrayList.iterator();
            int i14 = 0;
            while (it4.hasNext()) {
                Object next2 = it4.next();
                int i15 = i14 + 1;
                if (i14 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                arrayList.set(i14, AddressListViewItem.a((AddressListViewItem) next2, false, false, 127));
                i14 = i15;
            }
        }
        return b(SelectAddressListState.a(selectAddressListState2, SelectListScreenData.a(selectAddressListState2.f294110a, arrayList, aVar.f16249a, false, 508), null, null, 6));
    }
}
