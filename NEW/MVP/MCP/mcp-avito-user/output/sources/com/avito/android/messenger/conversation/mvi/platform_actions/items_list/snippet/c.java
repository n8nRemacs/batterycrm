package com.avito.android.messenger.conversation.mvi.platform_actions.items_list.snippet;

import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.lib.design.docking_badge.DockingBadgeEdgeType;
import com.avito.android.lib.design.docking_badge.DockingBadgeItem;
import com.avito.android.lib.design.docking_badge.DockingBadgeSize;
import com.avito.android.lib.design.docking_badge.DockingBadgeType;
import com.avito.android.messenger.conversation.mvi.platform_actions.items_list.snippet.a;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ItemsListSnippetBlueprint.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/messenger/conversation/mvi/platform_actions/items_list/snippet/b;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/messenger/conversation/mvi/platform_actions/items_list/snippet/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class c extends N implements p<ViewGroup, View, b> {

    /* renamed from: l, reason: collision with root package name */
    public static final c f194011l = new c();

    public c() {
        super(2);
    }

    @Override // Y41.p
    public final b invoke(ViewGroup viewGroup, View view) {
        View view2 = view;
        return new b(view2, new a.C5742a(Collections.singletonList(new DockingBadgeItem(view2.getContext().getString(R.string.messenger_recommendations_responds_quickly_badge_text), DockingBadgeType.Predefined.Green, DockingBadgeEdgeType.Flag, DockingBadgeEdgeType.Pipka, null, 16, null)), DockingBadgeSize.SMALL));
    }
}
