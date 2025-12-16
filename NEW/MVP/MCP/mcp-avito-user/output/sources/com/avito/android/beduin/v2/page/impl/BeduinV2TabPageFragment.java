package com.avito.android.beduin.v2.page.impl;

import Ii.j;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.beduin.v2.page.BaseBeduinV2TabPageFragment;
import com.avito.android.di.C29972i;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinV2TabPageFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/v2/page/impl/BeduinV2TabPageFragment;", "Lcom/avito/android/beduin/v2/page/BaseBeduinV2TabPageFragment;", "<init>", "()V", "_design-modules_beduin-v2-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BeduinV2TabPageFragment extends BaseBeduinV2TabPageFragment {

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public D f104902t0;

    @Override // com.avito.android.beduin.v2.page.BaseBeduinV2TabPageFragment
    @Y61.k
    public final com.avito.android.beduin.v2.page.p D5() {
        D d12 = this.f104902t0;
        if (d12 != null) {
            return d12;
        }
        return null;
    }

    @Override // com.avito.android.beduin.v2.page.BaseBeduinV2TabPageFragment, com.avito.android.ui.fragments.TabBaseFragment, com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        ((j.b) C29972i.a(C29972i.b(this), j.b.class)).F8().create().a(this);
        super.onCreate(bundle);
    }
}
