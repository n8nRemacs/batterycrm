package com.avito.android.beduin.common;

import cj.InterfaceC27204b;
import com.avito.android.AbstractC35201t;
import com.avito.android.beduin.common.action.BeduinExecuteRequestAction;
import com.avito.android.beduin.common.actionhandler.C28770o0;
import com.avito.android.beduin_shared.model.form.ParamsSource;
import com.avito.android.di.B;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import gj.InterfaceC40691b;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import pj.InterfaceC47100c;

/* compiled from: BeduinExecuteRequestHandler.kt */
@B
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/a;", "Lio/reactivex/rxjava3/disposables/d;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements io.reactivex.rxjava3.disposables.d {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27204b f99952b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final lj.c f99953c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final g f99954d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.error.f f99955e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f99956f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final InterfaceC40691b f99957g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final AbstractC35201t f99958h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f99959i = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f99960j = new LinkedHashMap();

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<Ui.f> f99961k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f99962l;

    /* compiled from: BeduinExecuteRequestHandler.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/a$a;", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.a$a, reason: collision with other inner class name */
    public interface InterfaceC3010a {
    }

    @Inject
    public a(@Y61.k InterfaceC27204b interfaceC27204b, @Y61.k lj.c cVar, @Y61.k g gVar, @Y61.k com.avito.android.remote.error.f fVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.l InterfaceC40691b interfaceC40691b, @Y61.k AbstractC35201t abstractC35201t) {
        this.f99952b = interfaceC27204b;
        this.f99953c = cVar;
        this.f99954d = gVar;
        this.f99955e = fVar;
        this.f99956f = interfaceC35745a5;
        this.f99957g = interfaceC40691b;
        this.f99958h = abstractC35201t;
        com.jakewharton.rxrelay3.c<Ui.f> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f99961k = cVar2;
        this.f99962l = new C41981q0(cVar2);
    }

    public final void a(@Y61.k BeduinExecuteRequestAction beduinExecuteRequestAction, @Y61.k C28770o0 c28770o0) {
        Map<String, Map<String, String>> formParamsMap = beduinExecuteRequestAction.getFormParamsMap();
        lj.c cVar = this.f99953c;
        LinkedHashMap linkedHashMapA = cVar.a(formParamsMap);
        List<ParamsSource> paramsSources = beduinExecuteRequestAction.getParamsSources();
        if (paramsSources == null) {
            paramsSources = C42784z0.f406748b;
        }
        Iterator<T> it = paramsSources.iterator();
        while (it.hasNext()) {
            linkedHashMapA = P0.k(linkedHashMapA, ((ParamsSource) it.next()).extractParams(cVar));
        }
        Map<String, Object> parameters = beduinExecuteRequestAction.getParameters();
        if (parameters == null) {
            parameters = P0.c();
        }
        LinkedHashMap linkedHashMapK = P0.k(parameters, linkedHashMapA);
        InterfaceC40691b interfaceC40691b = this.f99957g;
        com.avito.android.beduin.common.analytics.f fVar = interfaceC40691b instanceof com.avito.android.beduin.common.analytics.f ? (com.avito.android.beduin.common.analytics.f) interfaceC40691b : null;
        InterfaceC47100c interfaceC47100cL = fVar != null ? fVar.l() : null;
        if (interfaceC47100cL != null) {
            interfaceC47100cL.h(beduinExecuteRequestAction.getContentTypeOrDefault());
        }
        io.reactivex.rxjava3.disposables.d dVarV0 = this.f99954d.a(beduinExecuteRequestAction.getPath(), beduinExecuteRequestAction.getMethod(), linkedHashMapK).r(b.f100603b).F().r0(P2.c.f318721a).d0(new c(this)).j0(this.f99956f.e()).v0(new d(this, beduinExecuteRequestAction, c28770o0, interfaceC47100cL), new e(this, beduinExecuteRequestAction, c28770o0, interfaceC47100cL), io.reactivex.rxjava3.internal.functions.a.f401993c);
        io.reactivex.rxjava3.disposables.c cVar2 = this.f99959i;
        cVar2.b(dVarV0);
        String deduplicateRequestId = beduinExecuteRequestAction.getDeduplicateRequestId();
        if (deduplicateRequestId != null) {
            LinkedHashMap linkedHashMap = this.f99960j;
            io.reactivex.rxjava3.disposables.d dVar = (io.reactivex.rxjava3.disposables.d) linkedHashMap.remove(deduplicateRequestId);
            if (dVar != null) {
                cVar2.a(dVar);
            }
            linkedHashMap.put(deduplicateRequestId, dVarV0);
        }
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final void dispose() {
        this.f99960j.clear();
        this.f99959i.e();
    }

    @Override // io.reactivex.rxjava3.disposables.d
    /* renamed from: i */
    public final boolean getF318621e() {
        return this.f99959i.f401978c;
    }
}
