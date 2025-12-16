package com.avito.android.bundles.repository;

import Ck.InterfaceC13314a;
import Dk.h;
import Y61.k;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import io.reactivex.rxjava3.core.z;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import l41.o;

/* compiled from: VasBundlesRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bundles/repository/b;", "Lcom/avito/android/bundles/repository/a;", "_avito_vas-bundles_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements com.avito.android.bundles.repository.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC13314a f108330a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f108331b;

    /* compiled from: VasBundlesRepository.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "LDk/h;", "it", "Lcom/avito/android/util/P2;", "apply", "(Lcom/avito/android/remote/model/TypedResult;)Lcom/avito/android/util/P2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T, R> f108332b = new a<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            TypedResult typedResult = (TypedResult) obj;
            if (typedResult instanceof TypedResult.Success) {
                return new P2.b(((TypedResult.Success) typedResult).getResult());
            }
            if (typedResult instanceof TypedResult.Error) {
                return new P2.a(((TypedResult.Error) typedResult).getError());
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    @Inject
    public b(@k InterfaceC13314a interfaceC13314a, @k InterfaceC35745a5 interfaceC35745a5) {
        this.f108330a = interfaceC13314a;
        this.f108331b = interfaceC35745a5;
    }

    @Override // com.avito.android.bundles.repository.a
    @k
    public final z<P2<h>> a(@k String str) {
        return this.f108330a.a(str).x0(this.f108331b.a()).d0(a.f108332b).r0(P2.c.f318721a);
    }
}
