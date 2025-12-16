package com.avito.android.shortcut_navigation_bar.adapter.tag;

import Y61.k;
import com.avito.android.shortcut_navigation_bar.C34999p;
import com.avito.android.shortcut_navigation_bar.adapter.SectionTagPayload;
import com.avito.android.shortcut_navigation_bar.adapter.TagShortcutItem;
import kotlin.Metadata;

/* compiled from: TagShortcutItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/shortcut_navigation_bar/adapter/tag/g;", "LTV0/d;", "Lcom/avito/android/shortcut_navigation_bar/adapter/tag/h;", "Lcom/avito/android/shortcut_navigation_bar/adapter/TagShortcutItem;", "_avito_shortcut-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g implements TV0.d<h, TagShortcutItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C34999p f283359b;

    public g(@k C34999p c34999p) {
        this.f283359b = c34999p;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        TagShortcutItem tagShortcutItem = (TagShortcutItem) aVar;
        hVar.setText(tagShortcutItem.f283256c);
        SectionTagPayload sectionTagPayload = tagShortcutItem.f283258e;
        hVar.setSelected(sectionTagPayload != null ? sectionTagPayload.f283242e : false);
        hVar.a(new f(tagShortcutItem, this, i12));
    }
}
