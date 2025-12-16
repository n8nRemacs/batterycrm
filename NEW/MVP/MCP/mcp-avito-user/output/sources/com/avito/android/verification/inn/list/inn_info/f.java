package com.avito.android.verification.inn.list.inn_info;

import Y61.k;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.di.B;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import com.avito.android.vas_planning_checkout.item.checkout.i;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: InnInfoItemPresenter.kt */
@B
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/verification/inn/list/inn_info/f;", "LTV0/d;", "Lcom/avito/android/verification/inn/list/inn_info/h;", "Lcom/avito/android/verification/inn/list/inn_info/a;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class f implements TV0.d<h, a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final d f324026b;

    @Inject
    public f(@k d dVar) {
        this.f324026b = dVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        a aVar2 = (a) aVar;
        hVar.f324029b.setText(aVar2.f324015e);
        hVar.f324030c.setText(aVar2.f324016f);
        boolean z12 = aVar2.f324017g;
        ImageView imageView = hVar.f324031d;
        D6.G(imageView, z12);
        ((RecyclerView.n) hVar.itemView.getLayoutParams()).setMargins(0, y6.b(aVar2.f324018h), 0, y6.b(aVar2.f324019i));
        imageView.setOnClickListener(new i(9, new e(this, aVar2)));
    }
}
