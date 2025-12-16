package com.avito.android.publish.imv;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.publish.InterfaceC34155z;
import com.avito.android.remote.H0;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.category_parameters.CategoryParametersConverter;
import com.avito.android.util.rx3.g1;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.internal.operators.single.G;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import l41.o;
import yc.C50213a;

/* compiled from: ServicesInstantMarketValueInteractorImpl.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/imv/g;", "Lcom/avito/android/publish/imv/f;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final H0 f236068a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC34155z f236069b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final CategoryParametersConverter f236070c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final C50213a f236071d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.android.details.a f236072e;

    /* compiled from: ServicesInstantMarketValueInteractorImpl.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042&\u0010\u0003\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001 \u0002*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "", "kotlin.jvm.PlatformType", "params", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/category_parameters/slot/imv/InstantMarketValueResponse;", "apply", "(Ljava/util/Map;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T, R> implements o {
        public a() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            g gVar = g.this;
            return gVar.f236068a.T(gVar.f236070c.convertToFieldMap(gVar.f236069b.U()), (Map) obj, null, gVar.f236071d.b());
        }
    }

    /* compiled from: ServicesInstantMarketValueInteractorImpl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/category_parameters/slot/imv/InstantMarketValueResponse;", "result", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/publish/imv/a;", "apply", "(Lcom/avito/android/remote/model/TypedResult;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T, R> f236074b = new b<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return g1.b((TypedResult) obj).m(h.f236075b).j(i.f236076b).r();
        }
    }

    @Inject
    public g(@k H0 h02, @k InterfaceC34155z interfaceC34155z, @k CategoryParametersConverter categoryParametersConverter, @k C50213a c50213a, @k com.avito.android.details.a aVar) {
        this.f236068a = h02;
        this.f236069b = interfaceC34155z;
        this.f236070c = categoryParametersConverter;
        this.f236071d = c50213a;
        this.f236072e = aVar;
    }

    @Override // com.avito.android.publish.imv.f
    @k
    public final I<com.avito.android.publish.imv.a> a() {
        return new G(new VH0.c(this, 25)).n(new a()).n(b.f236074b);
    }
}
