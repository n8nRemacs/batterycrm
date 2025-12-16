package com.avito.android.remote.interceptor;

import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: InfomodelBranchHeaderProvider.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/interceptor/n0;", "Lcom/avito/android/remote/interceptor/m0;", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.remote.interceptor.n0, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public class C34297n0 implements InterfaceC34295m0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final String f253534a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f253535b;

    @Inject
    public C34297n0(@Y61.k com.avito.android.P p12, @Y61.k com.avito.android.util.C c12) {
        kotlin.reflect.n<Object> nVar = com.avito.android.P.f67370w0[10];
        if (!C43066x.K((String) p12.f67412i.a().getValue())) {
            c12.getF125491k().getClass();
        }
        this.f253534a = null;
        this.f253535b = true;
    }

    @Override // hd.InterfaceC40915a
    /* renamed from: b, reason: from getter */
    public final boolean getF253535b() {
        return this.f253535b;
    }

    @Override // hd.InterfaceC40915a
    @Y61.k
    public final String getKey() {
        return "X-Infm-Version";
    }

    @Override // hd.InterfaceC40915a
    @Y61.l
    /* renamed from: getValue, reason: from getter */
    public final String getF253534a() {
        return this.f253534a;
    }
}
