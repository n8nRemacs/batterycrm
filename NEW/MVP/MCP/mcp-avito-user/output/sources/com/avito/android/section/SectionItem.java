package com.avito.android.section;

import com.avito.android.section.action.SectionActionItem;
import com.avito.android.section.title.SectionTitleItem;
import com.avito.android.serp.adapter.PersistableSpannedItem;
import java.util.List;
import kotlin.Metadata;

/* compiled from: SectionItem.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/section/SectionItem;", "Lcom/avito/android/section/title/SectionTitleItem;", "Lcom/avito/android/section/action/SectionActionItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface SectionItem extends SectionTitleItem, SectionActionItem {

    /* compiled from: SectionItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @Y61.l
    /* renamed from: getContext */
    String getF264685i();

    @Y61.k
    List<PersistableSpannedItem> getItems();
}
