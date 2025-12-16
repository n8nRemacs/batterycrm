package com.avito.android.publish.scanner;

import android.content.Context;
import android.content.DialogInterface;
import com.avito.android.lib.design.modal.a;
import com.avito.android.printable_text.PrintableText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: RecognitionErrorDialog.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/design/modal/a$b;", "Landroid/content/DialogInterface;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/modal/a$b;Landroid/content/DialogInterface;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class c extends N implements Y41.p<a.b, DialogInterface, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f239149l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Context f239150m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ k f239151n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, Context context, k kVar) {
        super(2);
        this.f239149l = fVar;
        this.f239150m = context;
        this.f239151n = kVar;
    }

    @Override // Y41.p
    public final G0 invoke(a.b bVar, DialogInterface dialogInterface) {
        a.b bVar2 = bVar;
        DialogInterface dialogInterface2 = dialogInterface;
        f fVar = this.f239149l;
        PrintableText printableText = fVar.f239210a;
        Context context = this.f239150m;
        bVar2.setTitle(printableText.k0(context));
        PrintableText printableText2 = fVar.f239211b;
        bVar2.setSubtitle(printableText2 != null ? printableText2.k0(context) : null);
        bVar2.setButtonsOrientation(1);
        String strK0 = fVar.f239212c.k0(context);
        k kVar = this.f239151n;
        bVar2.L3(strK0, new a(dialogInterface2, kVar));
        bVar2.M3(fVar.f239213d.k0(context), new b(dialogInterface2, kVar));
        bVar2.setCancelable(false);
        return G0.f406611a;
    }
}
