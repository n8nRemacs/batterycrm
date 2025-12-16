package com.avito.android.deep_linking;

import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.PublicDeeplink;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DeepLinkFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/x;", "", "_common_network-deeplinks_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface x {

    /* compiled from: DeepLinkFactory.kt */
    @s0
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @Y61.l
    PublicDeeplink a(@Y61.k Uri uri);

    @Y61.k
    DeepLink b(@Y61.k String str);

    @Y61.k
    Object c(@Y61.k String str);

    @Y61.l
    PublicDeeplink d(@Y61.k String str);

    @Y61.k
    DeepLink e(@Y61.k Uri uri);

    @Y61.k
    Object f(@Y61.k Uri uri);
}
