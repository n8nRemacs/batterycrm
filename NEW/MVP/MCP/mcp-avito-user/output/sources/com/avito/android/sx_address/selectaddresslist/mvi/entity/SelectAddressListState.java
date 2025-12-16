package com.avito.android.sx_address.selectaddresslist.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.sx_address.selectaddresslist.domain.SelectListScreenData;
import com.avito.android.sx_address.selectaddresslist.mvi.entity.SelectAddressListViewState;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SelectAddressListState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/sx_address/selectaddresslist/mvi/entity/SelectAddressListState;", "", "a", "LoadingType", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SelectAddressListState {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f294108d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final SelectAddressListState f294109e;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final SelectListScreenData f294110a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final LoadingType f294111b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final SelectAddressListViewState f294112c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SelectAddressListState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/selectaddresslist/mvi/entity/SelectAddressListState$LoadingType;", "", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LoadingType {

        /* renamed from: b, reason: collision with root package name */
        public static final LoadingType f294113b;

        /* renamed from: c, reason: collision with root package name */
        public static final LoadingType f294114c;

        /* renamed from: d, reason: collision with root package name */
        public static final LoadingType f294115d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ LoadingType[] f294116e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f294117f;

        static {
            LoadingType loadingType = new LoadingType("NONE", 0);
            f294113b = loadingType;
            LoadingType loadingType2 = new LoadingType("LOADING", 1);
            f294114c = loadingType2;
            LoadingType loadingType3 = new LoadingType("ERROR", 2);
            f294115d = loadingType3;
            LoadingType[] loadingTypeArr = {loadingType, loadingType2, loadingType3};
            f294116e = loadingTypeArr;
            f294117f = c.a(loadingTypeArr);
        }

        public LoadingType() {
            throw null;
        }

        public static LoadingType valueOf(String str) {
            return (LoadingType) Enum.valueOf(LoadingType.class, str);
        }

        public static LoadingType[] values() {
            return (LoadingType[]) f294116e.clone();
        }
    }

    /* compiled from: SelectAddressListState.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/sx_address/selectaddresslist/mvi/entity/SelectAddressListState$a;", "", "<init>", "()V", "Lcom/avito/android/sx_address/selectaddresslist/domain/SelectListScreenData;", "emptyData", "Lcom/avito/android/sx_address/selectaddresslist/domain/SelectListScreenData;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        SelectListScreenData selectListScreenData = new SelectListScreenData(C42784z0.f406748b, null, null, null, null, null, null, null, null, false, 512, null);
        f294109e = new SelectAddressListState(selectListScreenData, LoadingType.f294113b, new SelectAddressListViewState.Content(selectListScreenData));
    }

    public SelectAddressListState(@k SelectListScreenData selectListScreenData, @k LoadingType loadingType, @k SelectAddressListViewState selectAddressListViewState) {
        this.f294110a = selectListScreenData;
        this.f294111b = loadingType;
        this.f294112c = selectAddressListViewState;
    }

    public static SelectAddressListState a(SelectAddressListState selectAddressListState, SelectListScreenData selectListScreenData, LoadingType loadingType, SelectAddressListViewState selectAddressListViewState, int i12) {
        if ((i12 & 1) != 0) {
            selectListScreenData = selectAddressListState.f294110a;
        }
        if ((i12 & 2) != 0) {
            loadingType = selectAddressListState.f294111b;
        }
        if ((i12 & 4) != 0) {
            selectAddressListViewState = selectAddressListState.f294112c;
        }
        selectAddressListState.getClass();
        return new SelectAddressListState(selectListScreenData, loadingType, selectAddressListViewState);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectAddressListState)) {
            return false;
        }
        SelectAddressListState selectAddressListState = (SelectAddressListState) obj;
        return L.f(this.f294110a, selectAddressListState.f294110a) && this.f294111b == selectAddressListState.f294111b && L.f(this.f294112c, selectAddressListState.f294112c);
    }

    public final int hashCode() {
        return this.f294112c.hashCode() + ((this.f294111b.hashCode() + (this.f294110a.hashCode() * 31)) * 31);
    }

    @k
    public final String toString() {
        return "SelectAddressListState(data=" + this.f294110a + ", loadingType=" + this.f294111b + ", viewState=" + this.f294112c + ')';
    }
}
