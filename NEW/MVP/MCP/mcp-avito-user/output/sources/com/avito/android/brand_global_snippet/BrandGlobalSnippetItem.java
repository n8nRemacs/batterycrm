package com.avito.android.brand_global_snippet;

import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.android.serp.adapter.S;
import com.avito.android.serp.adapter.l1;
import com.avito.android.serp.adapter.m1;
import kotlin.Metadata;

/* compiled from: BrandGlobalSnippetItem.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/brand_global_snippet/BrandGlobalSnippetItem;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "Lcom/avito/android/serp/adapter/l1;", "Lcom/avito/android/serp/adapter/m1;", "Lcom/avito/android/serp/adapter/S;", "_avito_bx-content_snippet_brand-global-snippet_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface BrandGlobalSnippetItem extends PersistableSerpItem, l1, m1, S {

    /* compiled from: BrandGlobalSnippetItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @k
    BrandGlobalSnippetItemImpl V4();

    @k
    /* renamed from: Z3 */
    String getF107470f();

    @k
    /* renamed from: getImage */
    Image getF107474j();

    @k
    /* renamed from: getLocationName */
    String getF107468d();

    @k
    /* renamed from: getPrice */
    String getF107472h();

    @k
    /* renamed from: getTitle */
    String getF107471g();

    @k
    /* renamed from: y2 */
    DeepLink getF107473i();
}
