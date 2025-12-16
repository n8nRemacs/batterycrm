package com.avito.android.advertising.loaders.buzzoola;

import androidx.compose.ui.platform.C22491k0;
import kotlin.Metadata;

/* compiled from: BuzzoolaExceptions.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advertising/loaders/buzzoola/BuzzoolaRawResponseNotFoundException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BuzzoolaRawResponseNotFoundException extends RuntimeException {
    public BuzzoolaRawResponseNotFoundException(@Y61.k String str) {
        super(C22491k0.a('\"', "Required fields is missed: \"", str));
    }
}
