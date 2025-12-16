package com.avito.android.verification.links.tinkoff_finish_web;

import androidx.camera.camera2.internal.G;
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.error.z;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.verification.links.tinkoff_finish_web.j;
import kotlin.Metadata;

/* compiled from: VerificationTinkoffFinishWebLinkAsyncHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class c<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f324604b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ VerificationTinkoffFinishWebLink f324605c;

    public c(d dVar, VerificationTinkoffFinishWebLink verificationTinkoffFinishWebLink) {
        this.f324604b = dVar;
        this.f324605c = verificationTinkoffFinishWebLink;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Throwable th2 = (Throwable) obj;
        d dVar = this.f324604b;
        PrintableText printableTextF = com.avito.android.printable_text.b.f(z.l(th2));
        f.c.f125255c.getClass();
        a.i.C4057a.d(dVar.f324610j, printableTextF, null, null, f.c.a.b(), 0, null, null, null, 2030);
        dVar.k(this.f324605c, G.i(th2, new StringBuilder("Сетевая ошибка ")));
        dVar.j(new j.a(th2.toString()));
    }
}
