package com.avito.android.serp;

import androidx.compose.runtime.internal.P;
import com.airbnb.lottie.CallableC27295o;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.L0;
import com.avito.android.serp.adapter.T;
import com.avito.android.serp.adapter.V0;
import com.avito.android.serp.adapter.n1;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41982q1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import ur0.InterfaceC49104a;

/* compiled from: SerpItemProcessor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/j;", "Lcom/avito/android/serp/i;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final L0 f273951a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC49104a f273952b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final V0 f273953c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final T f273954d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final n1 f273955e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f273956f;

    public j(@Y61.k L0 l02, @Y61.k InterfaceC49104a interfaceC49104a, @Y61.k V0 v02, @Y61.k T t12, @Y61.k n1 n1Var, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f273951a = l02;
        this.f273952b = interfaceC49104a;
        this.f273953c = v02;
        this.f273954d = t12;
        this.f273955e = n1Var;
        this.f273956f = interfaceC35745a5;
    }

    @Override // com.avito.android.serp.i
    @Y61.k
    public final C41982q1 a(@Y61.k List list, int i12, @Y61.k SerpDisplayType serpDisplayType) {
        return z.W(new CallableC27295o(i12, this, 2, list, serpDisplayType)).x0(this.f273956f.c());
    }

    @Override // com.avito.android.serp.i
    @Y61.k
    public final List b(int i12, @Y61.k List list) {
        return this.f273953c.a(i12, this.f273952b.a(i12, list));
    }

    @Override // com.avito.android.serp.i
    @Y61.k
    public final List c(@Y61.k List list, @Y61.k SerpDisplayType serpDisplayType, @Y61.l String str, @Y61.l String str2, boolean z12, @Y61.k List list2) {
        ArrayList arrayListA = this.f273951a.a(list, serpDisplayType, str, str2, z12, list2);
        this.f273954d.b(arrayListA);
        this.f273955e.b(arrayListA);
        return arrayListA;
    }
}
