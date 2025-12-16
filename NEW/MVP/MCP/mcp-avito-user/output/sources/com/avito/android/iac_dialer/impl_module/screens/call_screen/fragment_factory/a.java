package com.avito.android.iac_dialer.impl_module.screens.call_screen.fragment_factory;

import Y61.k;
import Y61.l;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import androidx.core.os.C22777e;
import com.avito.android.iac_dialer.impl_module.screens.call_screen.IacCallScreenArgument;
import com.avito.android.iac_dialer.impl_module.screens.call_screen.IacCallScreenFragment;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Q;

/* compiled from: IacCallScreenFragmentFactoryImpl.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/screens/call_screen/fragment_factory/a;", "LOK/b;", "<init>", "()V", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes14.dex */
public final class a implements OK.b {
    @Inject
    public a() {
    }

    @Override // OK.b
    @l
    public final IacCallScreenFragment a(@k Parcelable parcelable) {
        if (!(parcelable instanceof IacCallScreenArgument)) {
            return null;
        }
        IacCallScreenFragment.f166225y0.getClass();
        IacCallScreenFragment iacCallScreenFragment = new IacCallScreenFragment();
        iacCallScreenFragment.setArguments(C22777e.b(new Q("iac_argument", (IacCallScreenArgument) parcelable)));
        return iacCallScreenFragment;
    }

    @Override // OK.b
    @k
    public final IacCallScreenFragment b() {
        IacCallScreenFragment.a aVar = IacCallScreenFragment.f166225y0;
        IacCallScreenArgument.EmptyArgument emptyArgument = IacCallScreenArgument.EmptyArgument.INSTANCE;
        aVar.getClass();
        IacCallScreenFragment iacCallScreenFragment = new IacCallScreenFragment();
        iacCallScreenFragment.setArguments(C22777e.b(new Q("iac_argument", emptyArgument)));
        return iacCallScreenFragment;
    }
}
