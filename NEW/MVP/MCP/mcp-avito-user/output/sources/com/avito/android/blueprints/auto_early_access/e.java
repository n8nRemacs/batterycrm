package com.avito.android.blueprints.auto_early_access;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.category_parameters.ParameterElement;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AutoEarlyAccessPresenter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/blueprints/auto_early_access/e;", "Lcom/avito/android/blueprints/auto_early_access/c;", "<init>", "()V", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<ParameterElement.C> f105821b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C41981q0 f105822c;

    @Inject
    public e() {
        com.jakewharton.rxrelay3.c<ParameterElement.C> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f105821b = cVar;
        this.f105822c = new C41981q0(cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002c  */
    @Override // TV0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O5(TV0.e r5, TV0.a r6, int r7) {
        /*
            r4 = this;
            com.avito.android.blueprints.auto_early_access.g r5 = (com.avito.android.blueprints.auto_early_access.g) r5
            com.avito.android.category_parameters.ParameterElement$C$b r6 = (com.avito.android.category_parameters.ParameterElement.C.b) r6
            JO.m r7 = r6.f117212h
            r0 = 0
            if (r7 == 0) goto Lc
            java.lang.String r7 = r7.f8961b
            goto Ld
        Lc:
            r7 = r0
        Ld:
            com.avito.android.remote.model.category_parameters.SelectParameter$Displaying r1 = r6.f117223s
            if (r1 == 0) goto L2c
            com.avito.android.remote.model.category_parameters.SelectParameter$EarlyAccess r2 = r1.getEarlyAccess()
            if (r2 == 0) goto L2c
            java.lang.String r3 = r2.getEnabledId()
            boolean r7 = kotlin.jvm.internal.L.f(r3, r7)
            if (r7 == 0) goto L22
            goto L23
        L22:
            r2 = r0
        L23:
            if (r2 == 0) goto L2c
            java.lang.String r7 = r2.getEnabledEarlyAccessText()
            if (r7 == 0) goto L2c
            goto L3a
        L2c:
            if (r1 == 0) goto L39
            com.avito.android.remote.model.category_parameters.SelectParameter$EarlyAccess r7 = r1.getEarlyAccess()
            if (r7 == 0) goto L39
            java.lang.String r7 = r7.getDisabledEarlyAccessText()
            goto L3a
        L39:
            r7 = r0
        L3a:
            if (r1 == 0) goto L40
            java.lang.String r0 = r1.getButtonLabel()
        L40:
            if (r0 == 0) goto L4d
            if (r7 != 0) goto L45
            goto L4d
        L45:
            com.avito.android.blueprints.auto_early_access.d r1 = new com.avito.android.blueprints.auto_early_access.d
            r1.<init>(r4, r6)
            r5.r00(r1, r7, r0)
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.blueprints.auto_early_access.e.O5(TV0.e, TV0.a, int):void");
    }

    @Override // com.avito.android.blueprints.auto_early_access.c
    @k
    public final z<ParameterElement.C> c() {
        return this.f105822c;
    }
}
