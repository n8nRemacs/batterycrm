package com.avito.android.advert_core.safedeal.trust_factors;

import Y61.k;
import Y61.l;
import com.avito.android.component.advert_contact_bar.ContactBar;
import com.avito.android.di.B;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: SafeDealComponentsStorage.kt */
@B
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_core/safedeal/trust_factors/a;", "", "<init>", "()V", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public List<? extends TrustFactorsComponent> f84276a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public List<? extends TrustFactorsComponent> f84277b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public List<? extends ContactBar.InfoStickyBlock> f84278c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public ContactBar.Button.Target f84279d;

    @Inject
    public a() {
        C42784z0 c42784z0 = C42784z0.f406748b;
        this.f84276a = c42784z0;
        this.f84277b = c42784z0;
        this.f84278c = c42784z0;
    }
}
