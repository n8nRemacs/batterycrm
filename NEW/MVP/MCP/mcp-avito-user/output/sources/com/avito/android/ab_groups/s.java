package com.avito.android.ab_groups;

import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import q3.C47189a;

/* compiled from: AbExperimentsViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq3/i;", "response", "Lkotlin/G0;", "accept", "(Lq3/i;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class s<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f67690b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C47189a f67691c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q3.h f67692d;

    public s(q qVar, C47189a c47189a, q3.h hVar) {
        this.f67690b = qVar;
        this.f67691c = c47189a;
        this.f67692d = hVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        boolean ok2 = ((q3.i) obj).getOk();
        q qVar = this.f67690b;
        if (!ok2) {
            qVar.f67681O.postValue("Не удалось сменить группу АБ");
            return;
        }
        boolean zF2 = L.f(qVar.f67678L.getValue(), Boolean.TRUE);
        for (q3.h hVar : this.f67691c.a()) {
            if (L.f(hVar.getLabel(), this.f67692d.getLabel())) {
                if (zF2) {
                    hVar.d(true);
                } else {
                    hVar.e(true);
                }
            } else if (zF2) {
                hVar.d(false);
            } else {
                hVar.e(false);
            }
        }
    }
}
