package com.avito.android.login_suggests_impl.adapter.common_login;

import Y61.k;
import Y61.l;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.jakewharton.rxbinding4.view.C37722i;
import io.reactivex.rxjava3.core.z;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CommonLoginItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/login_suggests_impl/adapter/common_login/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/login_suggests_impl/adapter/common_login/f;", "_avito_login-suggests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @l
    public Y41.a<G0> f182872b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Button f182873c;

    public g(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.common_login_item_button);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button = (Button) viewFindViewById;
        this.f182873c = button;
        button.setText(R.string.common_login);
    }

    @Override // com.avito.android.login_suggests_impl.adapter.common_login.f
    @k
    public final z<G0> A() {
        return C37722i.a(this.f182873c);
    }

    @Override // com.avito.android.login_suggests_impl.adapter.common_login.f
    public final void d(@l Y41.a<G0> aVar) {
        this.f182872b = aVar;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Y41.a<G0> aVar = this.f182872b;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
