package com.avito.android.advert.deeplinks;

import com.avito.android.R;
import com.avito.android.printable_text.PrintableText;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AddItemToCartDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/printable_text/PrintableText;", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class f extends N implements Y41.l<Throwable, PrintableText> {

    /* renamed from: l, reason: collision with root package name */
    public static final f f69009l = new f();

    public f() {
        super(1);
    }

    @Override // Y41.l
    public final PrintableText invoke(Throwable th2) {
        return com.avito.android.printable_text.b.c(R.string.advert_details_safedeal_add_to_cart_failed_message, new Serializable[0]);
    }
}
