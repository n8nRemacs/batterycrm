package com.avito.android.component.toast.util;

import Y61.k;
import Y61.l;
import com.avito.android.component.toast.f;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;

/* compiled from: CompositeToastBarPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/component/toast/util/c;", "", "_avito_ui-messages_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface c {

    /* compiled from: CompositeToastBarPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ void a(c cVar, PrintableText printableText, int i12, String str, Y41.a aVar, ToastBarPosition toastBarPosition, com.avito.android.component.toast.f fVar, int i13) {
            if ((i13 & 1) != 0) {
                printableText = com.avito.android.printable_text.b.a();
            }
            PrintableText printableText2 = printableText;
            if ((i13 & 2) != 0) {
                i12 = 0;
            }
            int i14 = i12;
            String str2 = (i13 & 4) != 0 ? null : str;
            Y41.a aVar2 = (i13 & 16) != 0 ? null : aVar;
            if ((i13 & 64) != 0) {
                toastBarPosition = ToastBarPosition.f181047e;
            }
            ToastBarPosition toastBarPosition2 = toastBarPosition;
            if ((i13 & 128) != 0) {
                fVar = f.a.f125253a;
            }
            cVar.a(printableText2, i14, str2, aVar2, toastBarPosition2, fVar);
        }
    }

    void a(@k PrintableText printableText, int i12, @l String str, @l Y41.a aVar, @k ToastBarPosition toastBarPosition, @k com.avito.android.component.toast.f fVar);

    void b(@k g gVar);

    void c(@k com.avito.android.subscriptions_settings.d dVar);

    void clear();

    void d(@k com.avito.android.subscriptions_settings.a aVar);
}
