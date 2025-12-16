package com.avito.android.verification.links.remove;

import Ju.AbstractC14250d;
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.error.z;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;

/* compiled from: VerificationRemoveLinkAsyncHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class d<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f324370b;

    public d(e eVar) {
        this.f324370b = eVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        e eVar = this.f324370b;
        PrintableText printableTextF = com.avito.android.printable_text.b.f(z.l((Throwable) obj));
        f.c.f125255c.getClass();
        a.i.C4057a.d(eVar.f324374i, printableTextF, null, null, f.c.a.b(), 0, null, null, null, 2030);
        eVar.j(AbstractC14250d.b.f9170c);
    }
}
