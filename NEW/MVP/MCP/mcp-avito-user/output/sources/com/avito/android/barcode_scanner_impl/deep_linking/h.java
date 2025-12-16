package com.avito.android.barcode_scanner_impl.deep_linking;

import Ku.AbstractC14350a;
import Ku.i;
import android.net.Uri;
import com.avito.android.barcode_scanner_public.BarcodeScannerLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.google.gson.Gson;
import kotlin.Metadata;

/* compiled from: BarcodeScannerLinkParser.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/barcode_scanner_impl/deep_linking/h;", "LKu/a;", "Lcom/avito/android/barcode_scanner_public/BarcodeScannerLink;", "<init>", "()V", "_avito_barcode-scanner_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h extends AbstractC14350a<BarcodeScannerLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) {
        return new BarcodeScannerLink(i.p(uri, "formId"), i.p(uri, "modelId"));
    }
}
