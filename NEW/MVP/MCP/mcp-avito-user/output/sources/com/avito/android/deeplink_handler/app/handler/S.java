package com.avito.android.deeplink_handler.app.handler;

import android.os.Bundle;
import com.avito.android.component.toast.c;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.ToastMessageLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import ev.AbstractC40161a;
import java.util.Collections;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ToastLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deeplink_handler/app/handler/S;", "Lev/a;", "Lcom/avito/android/deep_linking/links/ToastMessageLink;", "_avito_deeplink-handler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class S extends AbstractC40161a<ToastMessageLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final a.i f134401f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f134402g;

    /* compiled from: ToastLinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ToastMessageLink.ToastBarPosition.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ToastMessageLink.ToastBarPosition toastBarPosition = ToastMessageLink.ToastBarPosition.f133725c;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[ToastMessageLink.ToastType.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ToastMessageLink.ToastType toastType = ToastMessageLink.ToastType.f133734c;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                ToastMessageLink.ToastType toastType2 = ToastMessageLink.ToastType.f133734c;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @Inject
    public S(@Y61.k a.i iVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f134401f = iVar;
        this.f134402g = aVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        ToastBarPosition toastBarPosition;
        ToastMessageLink toastMessageLink = (ToastMessageLink) deepLink;
        ToastMessageLink.ToastBarPosition toastBarPosition2 = toastMessageLink.f133720d;
        if (toastBarPosition2 != null) {
            int iOrdinal = toastBarPosition2.ordinal();
            if (iOrdinal == 0) {
                toastBarPosition = ToastBarPosition.f181046d;
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                toastBarPosition = ToastBarPosition.f181047e;
            }
        } else {
            toastBarPosition = null;
        }
        com.avito.android.component.toast.f fVar = bundle != null ? bundle.getBoolean("TOAST_BAR_TYPE_DEFAULT_IS_INVERTED") : false ? f.b.f125254a : f.a.f125253a;
        int iOrdinal2 = toastMessageLink.f133719c.ordinal();
        String str2 = toastMessageLink.f133718b;
        if (iOrdinal2 != 0) {
            ToastMessageLink.ToastTheme toastTheme = toastMessageLink.f133724h;
            String str3 = toastMessageLink.f133721e;
            if (iOrdinal2 == 1) {
                PrintableText printableTextF = com.avito.android.printable_text.b.f(str2);
                if (toastBarPosition == null) {
                    toastBarPosition = ToastBarPosition.f181047e;
                }
                a.i.C4057a.d(this.f134401f, printableTextF, null, str3 != null ? Collections.singletonList(new c.a.C3719a(str3, toastMessageLink.f133723g, null, new T(toastMessageLink, this), 4, null)) : null, fVar, 0, toastBarPosition, null, toastTheme != null ? toastTheme.f133733b : null, 938);
            } else if (iOrdinal2 == 2) {
                PrintableText printableTextF2 = com.avito.android.printable_text.b.f(str2);
                f.c.f125255c.getClass();
                f.c cVarB = f.c.a.b();
                if (toastBarPosition == null) {
                    toastBarPosition = ToastBarPosition.f181046d;
                }
                a.i.C4057a.d(this.f134401f, printableTextF2, null, str3 != null ? Collections.singletonList(new c.a.C3719a(str3, toastMessageLink.f133723g, null, new U(toastMessageLink, this), 4, null)) : null, cVarB, 0, toastBarPosition, null, toastTheme != null ? toastTheme.f133733b : null, 938);
            }
        } else {
            this.f134401f.z1(str2);
        }
        if (toastMessageLink.f133722f == null) {
            j(ToastMessageLink.c.b.f133741b);
        }
    }
}
