package com.avito.android.brandspace.interactor;

import Cq0.C13343b;
import Y61.k;
import Y61.l;
import com.avito.android.brandspace.di.j;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.single.C42007e;
import io.reactivex.rxjava3.internal.operators.single.W;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import nk.InterfaceC44436a;

/* compiled from: BrandspaceInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/brandspace/interactor/e;", "Lcom/avito/android/brandspace/interactor/d;", "_avito_brandspace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f107750a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f107751b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f107752c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC44436a> f107753d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f107754e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Set<String> f107755f;

    @Inject
    public e(@k @j String str, @com.avito.android.brandspace.di.k @k String str2, @com.avito.android.brandspace.di.l @l String str3, @k h31.e<InterfaceC44436a> eVar, @k InterfaceC35745a5 interfaceC35745a5, @k Set<String> set) {
        this.f107750a = str;
        this.f107751b = str2;
        this.f107752c = str3;
        this.f107753d = eVar;
        this.f107754e = interfaceC35745a5;
        this.f107755f = set;
    }

    @Override // com.avito.android.brandspace.interactor.d
    @k
    public final W a() {
        return new C42007e(new C13343b(this, 5)).z(this.f107754e.a());
    }
}
