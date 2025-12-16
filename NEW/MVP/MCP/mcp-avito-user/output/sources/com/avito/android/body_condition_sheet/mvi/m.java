package com.avito.android.body_condition_sheet.mvi;

import Nj.b;
import Nj.c;
import com.avito.android.arch.mvi.t;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: BodyConditionSheetOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/body_condition_sheet/mvi/m;", "Lcom/avito/android/arch/mvi/t;", "LNj/b;", "LNj/c;", "<init>", "()V", "_avito_body-condition-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class m implements t<Nj.b, Nj.c> {
    @Inject
    public m() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final Nj.c b(Nj.b bVar) {
        Nj.b bVar2 = bVar;
        if (bVar2 instanceof b.e) {
            return new c.C0758c(((b.e) bVar2).f11724a);
        }
        if (bVar2 instanceof b.f) {
            return new c.d(((b.f) bVar2).f11725a);
        }
        if (bVar2 instanceof b.C0757b) {
            return null;
        }
        if (bVar2.equals(b.d.f11723a)) {
            return c.a.f11726a;
        }
        if (bVar2.equals(b.c.f11722a)) {
            return c.b.f11727a;
        }
        if (bVar2.equals(b.a.f11719a)) {
            return c.a.f11726a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
