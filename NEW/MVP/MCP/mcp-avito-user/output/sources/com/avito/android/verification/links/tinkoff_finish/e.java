package com.avito.android.verification.links.tinkoff_finish;

import androidx.camera.camera2.internal.G;
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.error.z;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.verification.links.tinkoff_finish.l;
import kotlin.Metadata;

/* compiled from: VerificationTinkoffFinishLinkAsyncHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class e<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f324573b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ VerificationTinkoffFinishLink f324574c;

    public e(b bVar, VerificationTinkoffFinishLink verificationTinkoffFinishLink) {
        this.f324573b = bVar;
        this.f324574c = verificationTinkoffFinishLink;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Throwable th2 = (Throwable) obj;
        b bVar = this.f324573b;
        PrintableText printableTextF = com.avito.android.printable_text.b.f(z.l(th2));
        f.c.f125255c.getClass();
        a.i.C4057a.d(bVar.f324563j, printableTextF, null, null, f.c.a.b(), 0, null, null, null, 2030);
        bVar.k(this.f324574c, G.i(th2, new StringBuilder("Сетевая ошибка ")));
        bVar.j(new l.a(th2.toString()));
    }
}
