package com.avito.android.travel_search.mvi;

import com.avito.android.R;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.search.Header;
import com.avito.android.remote.model.search.HeaderSubtitle;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import vF0.InterfaceC49207b;
import vF0.InterfaceC49208c;
import vF0.d;
import vF0.e;
import vF0.h;

/* compiled from: TravelSearchViewStateBuilder.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/travel_search/mvi/r;", "Lcom/avito/android/travel_search/mvi/q;", "<init>", "()V", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class r implements q {
    @Inject
    public r() {
    }

    @Override // com.avito.android.travel_search.mvi.q
    @Y61.k
    public final vF0.g a(@Y61.k vF0.g gVar) {
        vF0.h dVar;
        HeaderSubtitle subTitle;
        InterfaceC49208c c12755c;
        vF0.e c12757e;
        vF0.d dVar2 = gVar.f440615j;
        boolean z12 = dVar2 instanceof d.c;
        boolean z13 = gVar.f440613h;
        if (z12) {
            dVar = new h.c(z13);
        } else if (dVar2 instanceof d.C12756d) {
            String title = null;
            Header header = gVar.f440617l;
            String title2 = header != null ? header.getTitle() : null;
            if (header != null && (subTitle = header.getSubTitle()) != null) {
                title = subTitle.getTitle();
            }
            dVar = new h.d(title2, title);
        } else {
            if (!(dVar2 instanceof d.b)) {
                throw new NoWhenBranchMatchedException();
            }
            dVar = h.b.f440622b;
        }
        vF0.h hVar = dVar;
        InterfaceC49207b interfaceC49207b = gVar.f440611f;
        if (interfaceC49207b instanceof InterfaceC49207b.c) {
            c12755c = InterfaceC49208c.d.f440584b;
        } else if (interfaceC49207b instanceof InterfaceC49207b.d) {
            c12755c = gVar.f440610e ? new InterfaceC49208c.C12755c(R.drawable.placeholders_img_unknown_error, com.avito.android.printable_text.b.c(R.string.error_layout_unknown_error, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.error_layout_try_refresh_or_return_later, new Serializable[0])) : new InterfaceC49208c.b(gVar.f440609d);
        } else {
            if (!(interfaceC49207b instanceof InterfaceC49207b.C12754b)) {
                throw new NoWhenBranchMatchedException();
            }
            c12755c = ((InterfaceC49207b.C12754b) interfaceC49207b).f440574b instanceof ApiError.NetworkIOError ? new InterfaceC49208c.C12755c(R.drawable.placeholders_img_no_internet_error, com.avito.android.printable_text.b.c(R.string.error_layout_no_internet, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.error_layout_check_connection, new Serializable[0])) : new InterfaceC49208c.C12755c(R.drawable.placeholders_img_unknown_error, com.avito.android.printable_text.b.c(R.string.error_layout_unknown_error, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.error_layout_try_refresh_or_return_later, new Serializable[0]));
        }
        InterfaceC49208c interfaceC49208c = c12755c;
        if (z12) {
            c12757e = new e.C12757e(z13);
        } else if (dVar2 instanceof d.C12756d) {
            c12757e = gVar.f440614i.isEmpty() ? e.b.f440594b : e.d.f440596b;
        } else {
            if (!(dVar2 instanceof d.b)) {
                throw new NoWhenBranchMatchedException();
            }
            c12757e = e.c.f440595b;
        }
        return vF0.g.a(gVar, null, null, null, false, null, interfaceC49208c, null, null, c12757e, null, hVar, 1503);
    }
}
