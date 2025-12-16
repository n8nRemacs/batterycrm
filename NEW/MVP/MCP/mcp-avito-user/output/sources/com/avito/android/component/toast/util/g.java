package com.avito.android.component.toast.util;

import Y61.k;
import Y61.l;
import com.avito.android.component.toast.f;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;

/* compiled from: ToastBarElementView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/component/toast/util/g;", "", "_avito_ui-messages_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface g {

    /* compiled from: ToastBarElementView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ void a(g gVar, PrintableText printableText, ToastBarPosition toastBarPosition, f.c cVar, int i12) {
            if ((i12 & 64) != 0) {
                toastBarPosition = ToastBarPosition.f181047e;
            }
            ToastBarPosition toastBarPosition2 = toastBarPosition;
            com.avito.android.component.toast.f fVar = cVar;
            if ((i12 & 128) != 0) {
                fVar = f.a.f125253a;
            }
            gVar.a(printableText, 0, null, null, toastBarPosition2, fVar);
        }
    }

    void a(@k PrintableText printableText, int i12, @l String str, @l Y41.a aVar, @k ToastBarPosition toastBarPosition, @k com.avito.android.component.toast.f fVar);
}
