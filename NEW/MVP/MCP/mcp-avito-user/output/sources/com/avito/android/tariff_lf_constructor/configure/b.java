package com.avito.android.tariff_lf_constructor.configure;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.A4;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import io.reactivex.rxjava3.core.z;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import l41.o;
import pD0.InterfaceC46937a;
import qD0.C47284b;

/* compiled from: ConstructorPackageUpdateRepository.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/b;", "Lcom/avito/android/tariff_lf_constructor/configure/a;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements com.avito.android.tariff_lf_constructor.configure.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC46937a f299333a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f299334b;

    /* compiled from: ConstructorPackageUpdateRepository.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "LqD0/b;", "it", "Lcom/avito/android/util/P2;", "apply", "(Lcom/avito/android/remote/model/TypedResult;)Lcom/avito/android/util/P2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T, R> f299335b = new a<>();

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
    public b(@k InterfaceC46937a interfaceC46937a, @k InterfaceC35745a5 interfaceC35745a5) {
        this.f299333a = interfaceC46937a;
        this.f299334b = interfaceC35745a5;
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.a
    @k
    public final z<P2<C47284b>> a(@k String str, @k String str2, @l Set<String> set, @l String str3, @l Set<String> set2, @l String str4) {
        A4.f318516a.getClass();
        return this.f299333a.h(str, str2, A4.g("locationIds", set), str3, A4.g("subcategoryIds", set2), str4).x0(this.f299334b.a()).d0(a.f299335b).r0(P2.c.f318721a);
    }
}
