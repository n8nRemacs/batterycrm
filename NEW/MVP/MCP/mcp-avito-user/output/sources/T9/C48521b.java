package t9;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.component.advert_contact_bar.ContactBar;
import com.avito.android.publish.start_publish.C;
import com.avito.android.remote.model.AdvertDiscounts;
import com.avito.android.remote.model.advert_details.ContactBarData;
import com.avito.android.util.N0;
import com.avito.konveyor.adapter.j;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import u9.C48865a;

/* compiled from: AdvertDiscountDetailsDialog.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lt9/b;", "Lt9/a;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: t9.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C48521b implements InterfaceC48520a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final j f439165a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC48523d f439166b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public com.avito.android.lib.design.bottom_sheet.d f439167c;

    @Inject
    public C48521b(@C48865a.InterfaceC12704a @k j jVar, @k InterfaceC48523d interfaceC48523d) {
        this.f439165a = jVar;
        this.f439166b = interfaceC48523d;
    }

    @Override // t9.InterfaceC48520a
    public final void a(@k AdvertDiscounts advertDiscounts, @k List<ContactBar.Button.Action> list, @l ContactBarData contactBarData, boolean z12) {
        this.f439166b.a(advertDiscounts, list, contactBarData, z12);
    }

    @Override // t9.InterfaceC48520a
    public final void b(@k Context context) {
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(context, 0, 2, null);
        dVar.D(R.layout.discount_details_bottom_sheet, true);
        dVar.setCancelable(true);
        dVar.setCanceledOnTouchOutside(true);
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, null, false, true, 7);
        com.avito.android.lib.design.bottom_sheet.d.I(dVar, true);
        View viewFindViewById = dVar.findViewById(R.id.close_button);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new S7.a(dVar, 25));
        }
        RecyclerView recyclerView = (RecyclerView) dVar.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.f439165a);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        dVar.setOnDismissListener(new C(recyclerView, 6));
        com.avito.android.lib.util.g.a(dVar);
        this.f439167c = dVar;
    }

    @Override // t9.InterfaceC48520a
    public final void dismiss() {
        N0.a(this.f439167c);
    }
}
