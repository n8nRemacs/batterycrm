package com.avito.android.user_advert.advert.faq.data;

import com.avito.beduin.v2.engine.core.F;
import com.avito.beduin.v2.engine.field.entity.A;
import com.avito.beduin.v2.engine.field.entity.v;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertFaqSurveyTypeAdapter.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_advert/advert/faq/data/s;", "Lcom/avito/android/user_advert/advert/faq/data/r;", "<init>", "()V", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class s implements r {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final F.a f308913a = F.f336593b;

    @Inject
    public s() {
    }

    @Override // com.avito.android.user_advert.advert.faq.data.r
    @Y61.l
    public final Long a(@Y61.k com.avito.beduin.v2.engine.field.d dVar) {
        Object bVar;
        try {
            int i12 = Z.f406624c;
            v vVarE = e(dVar);
            bVar = vVarE != null ? Long.valueOf(vVarE.getF336840b()) : null;
        } catch (Throwable th2) {
            int i13 = Z.f406624c;
            bVar = new Z.b(th2);
        }
        return (Long) (bVar instanceof Z.b ? null : bVar);
    }

    @Override // com.avito.android.user_advert.advert.faq.data.r
    @Y61.l
    public final String b(@Y61.k com.avito.beduin.v2.engine.field.d dVar) {
        Object bVar;
        try {
            int i12 = Z.f406624c;
            v vVarE = e(dVar);
            bVar = vVarE != null ? vVarE.getF336843b() : null;
        } catch (Throwable th2) {
            int i13 = Z.f406624c;
            bVar = new Z.b(th2);
        }
        return (String) (bVar instanceof Z.b ? null : bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004e  */
    @Override // com.avito.android.user_advert.advert.faq.data.r
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable c(@Y61.k com.avito.beduin.v2.engine.field.d r5) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_advert.advert.faq.data.s.c(com.avito.beduin.v2.engine.field.d):java.io.Serializable");
    }

    @Override // com.avito.android.user_advert.advert.faq.data.r
    @Y61.l
    public final A d(@Y61.k com.avito.beduin.v2.engine.field.d dVar) {
        Object bVar;
        try {
            int i12 = Z.f406624c;
            bVar = dVar.a(this.f308913a);
        } catch (Throwable th2) {
            int i13 = Z.f406624c;
            bVar = new Z.b(th2);
        }
        if (bVar instanceof Z.b) {
            bVar = null;
        }
        return (A) bVar;
    }

    @Y61.l
    public final v e(@Y61.k com.avito.beduin.v2.engine.field.d dVar) {
        Object bVar;
        try {
            int i12 = Z.f406624c;
            bVar = dVar.q(this.f308913a);
        } catch (Throwable th2) {
            int i13 = Z.f406624c;
            bVar = new Z.b(th2);
        }
        if (bVar instanceof Z.b) {
            bVar = null;
        }
        return (v) bVar;
    }
}
