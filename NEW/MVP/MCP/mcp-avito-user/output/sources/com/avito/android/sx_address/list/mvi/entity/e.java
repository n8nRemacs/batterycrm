package com.avito.android.sx_address.list.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.sx_address.list.domain.ScreenData;
import com.avito.android.sx_address.list.mvi.entity.ListState;
import com.avito.android.sx_address.list.mvi.entity.ListViewState;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: SxAddressListViewStateBuilder.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/sx_address/list/mvi/entity/e;", "Lcom/avito/android/sx_address/list/mvi/entity/d;", "<init>", "()V", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e implements d {

    /* compiled from: SxAddressListViewStateBuilder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ListState.LoadingType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ListState.LoadingType loadingType = ListState.LoadingType.f293249b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ListState.LoadingType loadingType2 = ListState.LoadingType.f293249b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Inject
    public e() {
    }

    @Override // com.avito.android.sx_address.list.mvi.entity.d
    @k
    public final ListState a(@k ListState listState, @k ScreenData screenData) {
        return ListState.a(listState, new ListViewState.Content(screenData), null, null, null, 14);
    }

    @Override // com.avito.android.sx_address.list.mvi.entity.d
    @k
    public final ListState b(@k ListState listState, @l Throwable th2) {
        int iOrdinal = listState.f293246c.ordinal();
        if (iOrdinal == 0) {
            return ListState.a(listState, new ListViewState.Content(listState.f293247d), null, null, null, 14);
        }
        if (iOrdinal == 1) {
            return ListState.a(listState, ListViewState.Loading.f293256b, null, null, null, 14);
        }
        if (iOrdinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (th2 != null) {
            return ListState.a(listState, new ListViewState.Error(th2), null, null, null, 14);
        }
        throw new IllegalStateException();
    }
}
