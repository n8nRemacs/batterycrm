package com.avito.android.photo_picker.legacy;

import com.avito.android.component.toast.f;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PhotoPickerPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/printable_text/PrintableText;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/printable_text/PrintableText;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.photo_picker.legacy.u, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C33258u extends kotlin.jvm.internal.N implements Y41.l<PrintableText, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C33245g f219909l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33258u(C33245g c33245g) {
        super(1);
        this.f219909l = c33245g;
    }

    @Override // Y41.l
    public final G0 invoke(PrintableText printableText) {
        PrintableText printableText2 = printableText;
        E e12 = this.f219909l.f219808p;
        if (e12 != null) {
            com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
            f.c.f125255c.getClass();
            com.avito.android.component.toast.c.b(cVar, e12.f219583f, printableText2, null, null, null, f.c.a.b(), 1500, ToastBarPosition.f181046d, null, false, false, null, null, 3726);
        }
        return G0.f406611a;
    }
}
