package com.avito.android.verification.links.esia;

import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.verification.links.esia.m;
import kotlin.Metadata;

/* compiled from: VerificationEsiaLinkAsyncHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class e<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f324252b;

    public e(b bVar) {
        this.f324252b = bVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        b bVar = this.f324252b;
        PrintableText printableTextF = com.avito.android.printable_text.b.f(bVar.f324239l.getF323381a());
        f.c.f125255c.getClass();
        a.i.C4057a.d(bVar.f324238k, printableTextF, null, null, f.c.a.b(), 0, null, null, null, 2030);
        bVar.j(new m.a(((Throwable) obj).toString()));
    }
}
