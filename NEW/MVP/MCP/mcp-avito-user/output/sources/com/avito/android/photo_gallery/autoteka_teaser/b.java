package com.avito.android.photo_gallery.autoteka_teaser;

import android.net.Uri;
import com.avito.android.autoteka.analytics.event.FromBlock;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;

/* compiled from: AutotekaTeaserView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery/autoteka_teaser/b;", "", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface b {

    /* compiled from: AutotekaTeaserView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void a();

    void b(@Y61.k Uri uri, @Y61.k FromBlock fromBlock, @Y61.k String str);

    void c();

    void d(@Y61.k FromBlock fromBlock);

    void e(@Y61.k DeepLink deepLink);

    void f(@Y61.k Uri uri, @Y61.k FromBlock fromBlock, @Y61.k String str);
}
