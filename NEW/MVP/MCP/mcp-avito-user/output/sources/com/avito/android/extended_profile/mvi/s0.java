package com.avito.android.extended_profile.mvi;

import com.avito.android.extended_profile_widgets.adapter.ExtendedProfileWidgetItem;
import com.avito.android.extended_profile_widgets.adapter.tabs_with_widgets.WidgetTab;
import kotlin.Metadata;

/* compiled from: ExtendedProfileReducer.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/extended_profile_widgets/adapter/tabs_with_widgets/WidgetTab;", "it", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class s0 extends kotlin.jvm.internal.N implements Y41.l<WidgetTab, WidgetTab> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.N f150386l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s0(Y41.l<? super QH.a, ? extends ExtendedProfileWidgetItem> lVar) {
        super(1);
        this.f150386l = (kotlin.jvm.internal.N) lVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // Y41.l
    public final WidgetTab invoke(WidgetTab widgetTab) {
        WidgetTab widgetTab2 = widgetTab;
        return new WidgetTab(widgetTab2.f154939b, widgetTab2.f154940c, (ExtendedProfileWidgetItem) this.f150386l.invoke(widgetTab2.f154941d));
    }
}
