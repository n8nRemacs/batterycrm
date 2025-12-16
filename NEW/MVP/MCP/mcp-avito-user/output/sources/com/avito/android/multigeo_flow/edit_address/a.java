package com.avito.android.multigeo_flow.edit_address;

import Y61.k;
import android.content.Context;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.bottom_sheet.d;
import com.avito.android.lib.design.button.Button;
import com.avito.android.mortgage.root.list.items.legacy_status.i;
import com.avito.android.multigeo_flow.domain.AddressItem;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: JobMultiGeoEditAddressFragment.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/multigeo_flow/edit_address/a;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "_avito_multigeo-flow_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a extends d {

    /* renamed from: E, reason: collision with root package name */
    public static final /* synthetic */ int f206888E = 0;

    /* compiled from: JobMultiGeoEditAddressFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.multigeo_flow.edit_address.a$a, reason: collision with other inner class name */
    public static final class C6162a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final C6162a f206889l = new C6162a();

        public C6162a() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    public /* synthetic */ a(Context context, AddressItem addressItem, Y41.a aVar, Y41.a aVar2, Y41.a aVar3, int i12, C42822w c42822w) {
        this(context, addressItem, aVar, aVar2, (i12 & 16) != 0 ? C6162a.f206889l : aVar3);
    }

    public a(@k Context context, @k AddressItem addressItem, @k Y41.a<G0> aVar, @k Y41.a<G0> aVar2, @k Y41.a<G0> aVar3) {
        super(context, 0, 2, null);
        setContentView(R.layout.job_multigeo_edit_address_layout);
        d.M(this, null, false, true, 7);
        I5.a((TextView) findViewById(R.id.edit_address_title), addressItem.f206874b, false);
        ((Button) findViewById(R.id.delete_button)).setOnClickListener(new i(6, aVar2));
        ((Button) findViewById(R.id.edit_button)).setOnClickListener(new i(7, aVar));
        setOnDismissListener(new com.avito.android.advert_item_actions.view.d(3, aVar3));
    }
}
