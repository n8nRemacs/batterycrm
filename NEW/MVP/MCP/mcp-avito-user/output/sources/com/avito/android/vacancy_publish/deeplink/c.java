package com.avito.android.vacancy_publish.deeplink;

import Ju.AbstractC14250d;
import android.os.Bundle;
import androidx.core.os.C22777e;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.N;

/* compiled from: VacancyPublishDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class c extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f319234l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f319235m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, String str) {
        super(0);
        this.f319234l = bVar;
        this.f319235m = str;
    }

    @Override // Y41.a
    public final G0 invoke() {
        Bundle bundleB = C22777e.b(new Q("with_up_intent", Boolean.FALSE));
        b bVar = this.f319234l;
        String str = this.f319235m;
        bVar.f319231f.r6(bundleB, bVar.f319233h, str);
        bVar.j(AbstractC14250d.c.f9171c);
        return G0.f406611a;
    }
}
