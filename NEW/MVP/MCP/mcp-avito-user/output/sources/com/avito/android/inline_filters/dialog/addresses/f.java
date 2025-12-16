package com.avito.android.inline_filters.dialog.addresses;

import Y61.k;
import Y61.l;
import android.os.Parcelable;
import androidx.view.InterfaceC23040h0;
import com.avito.android.inline_filters.dialog.E;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SuggestAddress;
import com.avito.android.remote.model.search.Filter;
import java.util.List;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: SuggestAddressesFilterView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/inline_filters/dialog/addresses/f;", "Lcom/avito/android/inline_filters/dialog/E;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f implements E {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.suggest_addresses.b f171161a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public Y41.l<? super List<SuggestAddress>, G0> f171162b;

    /* compiled from: SuggestAddressesFilterView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC23040h0, D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.l f171163b;

        public a(Y41.l lVar) {
            this.f171163b = lVar;
        }

        public final boolean equals(@l Object obj) {
            if ((obj instanceof InterfaceC23040h0) && (obj instanceof D)) {
                return L.f(this.f171163b, ((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f171163b;
        }

        public final int hashCode() {
            return this.f171163b.hashCode();
        }

        @Override // androidx.view.InterfaceC23040h0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f171163b.invoke(obj);
        }
    }

    public f(@k SuggestAddressesDialogFragment suggestAddressesDialogFragment, @k com.avito.android.suggest_addresses.b bVar, @l Filter filter, @l SearchParams searchParams) {
        this.f171161a = bVar;
    }

    @Override // com.avito.android.inline_filters.dialog.E
    @l
    public final Parcelable getState() {
        return null;
    }
}
