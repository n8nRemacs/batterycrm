package com.avito.android;

import android.content.Intent;
import com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory;
import kotlin.Metadata;

/* compiled from: CoreActivityIntentFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/L;", "", "_avito_intent-factories_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface L {

    /* compiled from: CoreActivityIntentFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ Intent a(L l12, String str, int i12) {
            if ((i12 & 1) != 0) {
                str = null;
            }
            return l12.a(str, null);
        }
    }

    @Y61.k
    Intent a(@Y61.l String str, @Y61.l String str2);

    @Y61.k
    Intent b();

    @Y61.k
    Intent c(int i12);

    @Y61.k
    Intent d(@Y61.k TabFragmentFactory.Data data);
}
