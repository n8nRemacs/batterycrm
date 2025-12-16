package com.avito.android.rating.details.text_sheet.mvi;

import Eg0.b;
import Eg0.c;
import com.avito.android.arch.mvi.t;
import com.avito.android.deeplink_handler.handler.b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: TextSheetOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating/details/text_sheet/mvi/h;", "Lcom/avito/android/arch/mvi/t;", "LEg0/b;", "LEg0/c;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h implements t<Eg0.b, Eg0.c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f247571b;

    @Inject
    public h(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f247571b = aVar;
    }

    @Override // com.avito.android.arch.mvi.t
    public final Eg0.c b(Eg0.b bVar) {
        Eg0.b bVar2 = bVar;
        if (bVar2 instanceof b.h) {
            b.h hVar = (b.h) bVar2;
            return new c.d(hVar.f4148a, hVar.f4149b, hVar.f4150c);
        }
        if (bVar2.equals(b.f.f4146a)) {
            return c.C0245c.f4155a;
        }
        if (bVar2.equals(b.d.f4144a)) {
            return c.b.f4154a;
        }
        if (bVar2 instanceof b.C0244b) {
            b.a.a(this.f247571b, ((b.C0244b) bVar2).f4142a, null, null, 6);
        } else {
            if (bVar2 instanceof b.a) {
                return new c.a(((b.a) bVar2).f4141a);
            }
            if (!(bVar2 instanceof b.j ? true : bVar2 instanceof b.g ? true : bVar2.equals(b.c.f4143a) ? true : bVar2.equals(b.i.f4151a) ? true : bVar2.equals(b.e.f4145a))) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return null;
    }
}
