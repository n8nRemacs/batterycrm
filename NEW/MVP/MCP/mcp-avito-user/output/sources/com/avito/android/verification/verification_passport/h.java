package com.avito.android.verification.verification_passport;

import com.avito.android.util.V2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ru.cyberity.cbr.core.data.model.CBRException;

/* compiled from: VerificationPassportActivity.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRException;", "it", "Lkotlin/G0;", "invoke", "(Lru/cyberity/cbr/core/data/model/CBRException;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class h extends N implements Y41.l<CBRException, G0> {

    /* renamed from: l, reason: collision with root package name */
    public static final h f325707l = new h();

    public h() {
        super(1);
    }

    @Override // Y41.l
    public final G0 invoke(CBRException cBRException) {
        V2.f318762a.a("DEFAULT_TAG", "Cyberity SDK error", cBRException);
        return G0.f406611a;
    }
}
