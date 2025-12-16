package com.avito.android.comparison.domain;

import Y61.k;
import Y61.l;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.Y5;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import io.reactivex.rxjava3.internal.operators.observable.C41982q1;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ComparisonInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/comparison/domain/b;", "Lcom/avito/android/comparison/domain/a;", "a", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements com.avito.android.comparison.domain.a {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f123897c = 0;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.comparison.data.a f123898a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f123899b;

    /* compiled from: ComparisonInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/comparison/domain/b$a;", "", "<init>", "()V", "", "UNKNOWN_VALUE", "Ljava/lang/String;", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public b(@k com.avito.android.comparison.data.a aVar, @k InterfaceC35745a5 interfaceC35745a5) {
        this.f123898a = aVar;
        this.f123899b = interfaceC35745a5;
    }

    @Override // com.avito.android.comparison.domain.a
    @k
    public final C41982q1 a(@k String str, @k String str2, @l String str3) {
        return this.f123898a.a(str, str2, str3).x0(this.f123899b.a());
    }

    @Override // com.avito.android.comparison.domain.a
    @k
    public final B0 b(@k String str, @l String str2) {
        return Y5.a(this.f123898a.b(str, str2, false).x0(this.f123899b.a())).d0(new c(this));
    }

    @Override // com.avito.android.comparison.domain.a
    @k
    public final C41982q1 c(@k String str, @l String str2, boolean z12) {
        return this.f123898a.b(str, str2, z12).x0(this.f123899b.a());
    }
}
