package com.avito.android.serp.adapter.vertical_main.avito_blog.blog_items_list;

import Y61.k;
import android.content.res.Resources;
import androidx.compose.runtime.internal.P;
import androidx.core.content.res.i;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.L0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AvitoBlogArticleWidthProvider.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/avito_blog/blog_items_list/g;", "", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final L0 f272618a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC28373a f272619b;

    /* renamed from: c, reason: collision with root package name */
    public final float f272620c;

    @Inject
    public g(@k L0 l02, @k InterfaceC28373a interfaceC28373a, @k Resources resources) {
        this.f272618a = l02;
        this.f272619b = interfaceC28373a;
        this.f272620c = i.b(resources, R.dimen.avito_blog_article_image_to_screen_width_ratio);
    }
}
