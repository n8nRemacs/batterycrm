package com.avito.android.section.title;

import Y61.l;
import com.avito.android.serp.adapter.PersistableSerpItem;
import kotlin.Metadata;

/* compiled from: SectionTitleItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/section/title/SectionTitleItem;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface SectionTitleItem extends PersistableSerpItem {

    /* compiled from: SectionTitleItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @l
    String getSubtitle();

    @l
    String getTitle();
}
