package com.avito.android.messenger;

import com.avito.android.persistence.messenger.InterfaceC33130w0;
import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.internal.operators.completable.C41815f;
import io.reactivex.rxjava3.internal.operators.completable.C41823n;
import java.util.ArrayList;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: DbPurger.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/m;", "Lcom/avito/android/messenger/l;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.m, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32529m implements InterfaceC32528l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32522f f196429a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33130w0 f196430b;

    @Inject
    public C32529m(@Y61.k InterfaceC32522f interfaceC32522f, @Y61.k InterfaceC33130w0 interfaceC33130w0) {
        this.f196429a = interfaceC32522f;
        this.f196430b = interfaceC33130w0;
    }

    @Override // com.avito.android.messenger.InterfaceC32528l
    @Y61.k
    public final AbstractC41768a a() {
        InterfaceC32522f interfaceC32522f = this.f196429a;
        Set<String> setA = interfaceC32522f.a();
        ArrayList arrayList = new ArrayList(C42745f0.q(setA, 10));
        for (String str : setA) {
            arrayList.add(this.f196430b.a(str).g(interfaceC32522f.d(str)).r());
        }
        return !arrayList.isEmpty() ? new C41815f(arrayList) : C41823n.f402260b;
    }
}
