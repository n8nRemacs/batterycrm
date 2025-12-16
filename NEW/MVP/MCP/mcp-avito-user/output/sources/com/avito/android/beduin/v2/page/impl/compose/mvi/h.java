package com.avito.android.beduin.v2.page.impl.compose.mvi;

import Hi.b;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: BeduinV2PageComposeReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/beduin/v2/page/impl/compose/mvi/h;", "Lcom/avito/android/arch/mvi/u;", "LHi/b;", "LHi/d;", "<init>", "()V", "_design-modules_beduin-v2-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h implements u<Hi.b, Hi.d> {
    @Inject
    public h() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final Hi.d a(Hi.b bVar, Hi.d dVar) {
        Hi.b bVar2 = bVar;
        Hi.d dVar2 = dVar;
        boolean z12 = bVar2 instanceof b.c;
        List<Hi.e> list = dVar2.f7618a;
        if (z12) {
            return new Hi.d(C42745f0.i0(((b.c) bVar2).f7614a, list));
        }
        return bVar2.equals(b.a.f7612a) ? new Hi.d(C42745f0.x(list)) : dVar2;
    }
}
