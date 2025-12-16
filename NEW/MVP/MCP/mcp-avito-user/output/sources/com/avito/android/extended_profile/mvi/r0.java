package com.avito.android.extended_profile.mvi;

import com.avito.android.extended_profile_widgets.adapter.tabs_with_widgets.WidgetTab;
import kotlin.Metadata;

/* compiled from: ExtendedProfileReducer.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/extended_profile_widgets/adapter/tabs_with_widgets/WidgetTab;", "invoke", "(Lcom/avito/android/extended_profile_widgets/adapter/tabs_with_widgets/WidgetTab;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class r0 extends kotlin.jvm.internal.N implements Y41.l<WidgetTab, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.N f150375l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public r0(Y41.l<? super QH.a, Boolean> lVar) {
        super(1);
        this.f150375l = (kotlin.jvm.internal.N) lVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // Y41.l
    public final Boolean invoke(WidgetTab widgetTab) {
        return (Boolean) this.f150375l.invoke(widgetTab.f154941d);
    }
}
