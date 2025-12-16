package com.avito.android.blueprint.switcher;

import Hj.InterfaceC13997b;
import Y61.k;
import Y61.l;
import com.avito.android.lib.design.list_item.BaseListItem;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PublishSwitcherView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/blueprint/switcher/g;", "LHj/b;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface g extends InterfaceC13997b {

    /* compiled from: PublishSwitcherView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void Fj(@l AttributedText attributedText);

    void S1(@k Y41.l<? super Boolean, G0> lVar);

    void j9(@k BaseListItem.Alignment alignment);

    void setChecked(boolean z12);

    void setText(@k String str);
}
