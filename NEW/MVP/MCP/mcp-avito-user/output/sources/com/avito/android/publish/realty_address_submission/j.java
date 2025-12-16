package com.avito.android.publish.realty_address_submission;

import androidx.compose.runtime.internal.P;
import androidx.view.AbstractC22993a;
import androidx.view.C23060r0;
import androidx.view.InterfaceC23487e;
import androidx.view.M0;
import com.avito.android.Q1;
import com.avito.android.publish.C0;
import com.avito.android.publish.details.C33771m1;
import com.avito.android.publish.details.S0;
import com.avito.android.remote.H0;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: RealtyAddressSubmissionViewModelFactory.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/realty_address_submission/j;", "Landroidx/lifecycle/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class j extends AbstractC22993a {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final H0 f239062d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C0 f239063e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final S0 f239064f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C33771m1 f239065g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Q1 f239066h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f239067i;

    @Inject
    public j(@Y61.k InterfaceC23487e interfaceC23487e, @Y61.k H0 h02, @Y61.k C0 c02, @Y61.k S0 s02, @Y61.k C33771m1 c33771m1, @Y61.k Q1 q12, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        super(interfaceC23487e, null);
        this.f239062d = h02;
        this.f239063e = c02;
        this.f239064f = s02;
        this.f239065g = c33771m1;
        this.f239066h = q12;
        this.f239067i = interfaceC35745a5;
    }

    @Override // androidx.view.AbstractC22993a
    @Y61.k
    public final <T extends M0> T create(@Y61.k String str, @Y61.k Class<T> cls, @Y61.k C23060r0 c23060r0) {
        if (!cls.isAssignableFrom(h.class)) {
            throw new IllegalArgumentException(cls.toString());
        }
        return new h(this.f239062d, this.f239063e, this.f239064f, this.f239065g, this.f239066h, this.f239067i);
    }
}
