package com.avito.android.body_condition_sheet.mvi;

import Nj.b;
import Nj.d;
import com.avito.android.arch.mvi.u;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BodyConditionSheetReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/body_condition_sheet/mvi/o;", "Lcom/avito/android/arch/mvi/u;", "LNj/b;", "LNj/d;", "<init>", "()V", "_avito_body-condition-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class o implements u<Nj.b, Nj.d> {
    @Inject
    public o() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final Nj.d a(Nj.b bVar, Nj.d dVar) {
        Nj.b bVar2 = bVar;
        Nj.d dVar2 = dVar;
        if (!(bVar2 instanceof b.C0757b)) {
            return dVar2;
        }
        b.C0757b c0757b = (b.C0757b) bVar2;
        return new d.b(c0757b.f11720a, c0757b.f11721b);
    }
}
