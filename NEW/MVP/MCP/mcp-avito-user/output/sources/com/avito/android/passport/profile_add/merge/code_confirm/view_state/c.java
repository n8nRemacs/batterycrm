package com.avito.android.passport.profile_add.merge.code_confirm.view_state;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.passport.profile_add.merge.code_confirm.view_state.a;
import com.avito.android.passport.profile_add.merge.code_confirm.view_state.e;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CodeConfirmViewStateMapper.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/code_confirm/view_state/c;", "", "<init>", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c {
    @Inject
    public c() {
    }

    @k
    public static b a(@k c60.c cVar, @k b60.c cVar2) {
        boolean z12 = cVar.f57659d;
        boolean z13 = cVar2.f56917d;
        b bVar = new b(cVar2.f56915b, cVar2.f56916c, z13 ? e.c.f212820a : z12 ? e.b.f212819a : new e.a(cVar.f57662g), z12 ? a.c.f212811a : z13 ? a.b.f212810a : a.C6365a.f212809a);
        bVar.setPerfTrackerParams(cVar.f57663h > cVar2.f56918e ? cVar.getPerfTrackerParams() : cVar2.getPerfTrackerParams());
        return bVar;
    }
}
