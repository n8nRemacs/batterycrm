package com.avito.android.autoteka.presentation.confirmEmail.mvi;

import Jf.b;
import Jf.c;
import com.avito.android.arch.mvi.t;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AutotekaConfirmEmailOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/autoteka/presentation/confirmEmail/mvi/i;", "Lcom/avito/android/arch/mvi/t;", "LJf/b;", "LJf/c;", "<init>", "()V", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class i implements t<Jf.b, Jf.c> {
    @Inject
    public i() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final Jf.c b(Jf.b bVar) {
        Jf.b bVar2 = bVar;
        if (bVar2 instanceof b.c) {
            return c.a.f9089a;
        }
        if (bVar2 instanceof b.f) {
            return new c.b(com.avito.android.autoteka.helpers.j.d(((b.f) bVar2).f9088a));
        }
        return null;
    }
}
