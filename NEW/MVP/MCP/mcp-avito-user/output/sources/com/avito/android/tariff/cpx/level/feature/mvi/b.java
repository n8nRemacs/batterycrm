package com.avito.android.tariff.cpx.level.feature.mvi;

import EB0.a;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TariffCpxLevelFeatureActor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LEB0/a;", "action", "", "invoke", "(LEB0/a;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class b extends N implements Y41.l<EB0.a, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public static final b f296980l = new b();

    public b() {
        super(1);
    }

    @Override // Y41.l
    public final Boolean invoke(EB0.a aVar) {
        return Boolean.valueOf(aVar instanceof a.b);
    }
}
