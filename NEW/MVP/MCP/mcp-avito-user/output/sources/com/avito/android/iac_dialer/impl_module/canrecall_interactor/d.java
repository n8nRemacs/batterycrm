package com.avito.android.iac_dialer.impl_module.canrecall_interactor;

import XL.a;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.R0;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Z;
import kotlinx.coroutines.flow.f2;

/* compiled from: IacCanRecallInteractor.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/canrecall_interactor/d;", "Lcom/avito/android/iac_dialer/impl_module/canrecall_interactor/a;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes14.dex */
public final class d implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final XL.a f165933a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f165934b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final R0 f165935c;

    @Inject
    public d(@k XL.a aVar, @k InterfaceC35745a5 interfaceC35745a5, @k R0 r02) {
        this.f165933a = aVar;
        this.f165934b = interfaceC35745a5;
        this.f165935c = r02;
        f2.b(0, 4, null, 5);
        f2.b(0, 4, null, 5);
        new io.reactivex.rxjava3.disposables.c();
    }

    @Override // com.avito.android.iac_dialer.impl_module.canrecall_interactor.a
    @l
    public final Object a(@k String str, @k String str2, @k String str3) {
        try {
            int i12 = Z.f406624c;
            return a.C1329a.a(this.f165933a, str, str2, str3, null, 24).z(this.f165934b.a()).e();
        } catch (Throwable th2) {
            int i13 = Z.f406624c;
            return new Z.b(th2);
        }
    }
}
