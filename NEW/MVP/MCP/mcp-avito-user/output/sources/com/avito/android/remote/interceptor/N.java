package com.avito.android.remote.interceptor;

import com.squareup.anvil.annotations.ContributesBinding;
import f90.InterfaceC40255d;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;

/* compiled from: FingerprintHeaderProviderImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/interceptor/N;", "Lcom/avito/android/remote/interceptor/M;", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public class N implements M {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f253497a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f253498b = true;

    /* compiled from: FingerprintHeaderProviderImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<String> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC40255d f253500m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC40255d interfaceC40255d) {
            super(0);
            this.f253500m = interfaceC40255d;
        }

        @Override // Y41.a
        public final String invoke() {
            N.this.getClass();
            String strA = this.f253500m.a();
            return (strA == null || strA.length() == 0) ? "empty" : strA.toString();
        }
    }

    @Inject
    public N(@Y61.k InterfaceC40255d interfaceC40255d) {
        this.f253497a = C42727D.c(new a(interfaceC40255d));
    }

    @Override // hd.InterfaceC40915a
    /* renamed from: b, reason: from getter */
    public final boolean getF253498b() {
        return this.f253498b;
    }

    @Override // hd.InterfaceC40915a
    @Y61.k
    public final String getKey() {
        return "f";
    }

    @Override // hd.InterfaceC40915a
    @Y61.l
    /* renamed from: getValue */
    public final String getF253512a() {
        return (String) this.f253497a.getValue();
    }
}
