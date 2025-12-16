package com.avito.android.analytics.timer;

import com.avito.android.favorite_comparison.presentation.b;
import com.avito.android.util.rx3.C35907l;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class b implements l41.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f91108b;

    public /* synthetic */ b(int i12) {
        this.f91108b = i12;
    }

    @Override // l41.c
    public final Object apply(Object obj, Object obj2) {
        switch (this.f91108b) {
            case 0:
                e eVar = (e) obj2;
                return new Q(Integer.valueOf((int) (eVar.f91114a - ((f) obj).f91114a)), eVar.f91113b);
            case 1:
                com.avito.android.favorite_comparison.presentation.f fVar = (com.avito.android.favorite_comparison.presentation.f) obj;
                com.avito.android.favorite_comparison.presentation.b bVar = (com.avito.android.favorite_comparison.presentation.b) obj2;
                if (bVar instanceof b.a) {
                    return new com.avito.android.favorite_comparison.presentation.f(false, null, ((b.a) bVar).f155314a, null);
                }
                if (bVar instanceof b.d) {
                    return new com.avito.android.favorite_comparison.presentation.f(false, null, null, ((b.d) bVar).f155316a);
                }
                if (bVar instanceof b.c) {
                    return new com.avito.android.favorite_comparison.presentation.f(false, ((b.c) bVar).f155315a, null, null);
                }
                if (bVar instanceof b.e) {
                    return new com.avito.android.favorite_comparison.presentation.f(true, null, fVar.f155321c, null);
                }
                if (bVar instanceof b.C4552b) {
                    return fVar;
                }
                throw new NoWhenBranchMatchedException();
            case 2:
                return P0.h((Map) obj2, ((Map) obj).keySet());
            default:
                return new C35907l(((Long) obj2).longValue(), (Throwable) obj);
        }
    }
}
