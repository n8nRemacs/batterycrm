package com.avito.android.inline_filters.dialog.suggest_location;

import Y41.l;
import Y61.k;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC23040h0;
import com.avito.android.inline_filters.dialog.E;
import com.avito.android.remote.model.Location;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.util.architecture_components.D;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: SuggestLocationFilterView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/inline_filters/dialog/suggest_location/g;", "Lcom/avito/android/inline_filters/dialog/E;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g implements E {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final D<Location> f172281a;

    /* compiled from: SuggestLocationFilterView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC23040h0, kotlin.jvm.internal.D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l f172282b;

        public a(l lVar) {
            this.f172282b = lVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof InterfaceC23040h0) && (obj instanceof kotlin.jvm.internal.D)) {
                return L.f(this.f172282b, ((kotlin.jvm.internal.D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f172282b;
        }

        public final int hashCode() {
            return this.f172282b.hashCode();
        }

        @Override // androidx.view.InterfaceC23040h0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f172282b.invoke(obj);
        }
    }

    public g(@k Fragment fragment, @Y61.l Filter filter, int i12, @Y61.l SearchParams searchParams, boolean z12, @Y61.l Boolean bool) {
        this.f172281a = new D<>();
    }

    @Override // com.avito.android.inline_filters.dialog.E
    @Y61.l
    public final Parcelable getState() {
        return null;
    }

    public /* synthetic */ g(Fragment fragment, Filter filter, int i12, SearchParams searchParams, boolean z12, Boolean bool, int i13, C42822w c42822w) {
        this(fragment, filter, i12, searchParams, (i13 & 16) != 0 ? false : z12, (i13 & 32) != 0 ? null : bool);
    }
}
