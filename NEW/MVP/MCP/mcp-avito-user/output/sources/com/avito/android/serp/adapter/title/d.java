package com.avito.android.serp.adapter.title;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.SerpAdvertGroupTitle;
import kotlin.Metadata;

/* compiled from: GroupTitleItemConverter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/title/d;", "Lcom/avito/android/serp/adapter/title/c;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements c {
    @Override // com.avito.android.serp.adapter.title.c
    @k
    public final GroupTitleItem a(@k SerpAdvertGroupTitle serpAdvertGroupTitle) {
        String text = serpAdvertGroupTitle.getText();
        String str = text == null ? "" : text;
        Boolean skipStubImage = serpAdvertGroupTitle.getSkipStubImage();
        boolean zBooleanValue = skipStubImage != null ? skipStubImage.booleanValue() : false;
        String text2 = serpAdvertGroupTitle.getText();
        long jHashCode = text2 != null ? text2.hashCode() : 0;
        String text3 = serpAdvertGroupTitle.getText();
        return new GroupTitleItem(6, jHashCode, text3 == null ? "" : text3, str, zBooleanValue);
    }
}
