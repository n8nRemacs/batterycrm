package com.avito.android.extended_profile.mvi;

import com.avito.android.extended_profile.mvi.entity.a;
import com.avito.android.extended_profile_widgets.adapter.ExtendedProfileWidgetItem;
import com.avito.android.extended_profile_widgets.adapter.header.HeaderItem;
import com.avito.android.remote.model.SubscribeInfo;
import kotlin.Metadata;

/* compiled from: ExtendedProfileReducer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQH/a;", "it", "Lcom/avito/android/extended_profile_widgets/adapter/ExtendedProfileWidgetItem;", "invoke", "(LQH/a;)Lcom/avito/android/extended_profile_widgets/adapter/ExtendedProfileWidgetItem;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class G extends kotlin.jvm.internal.N implements Y41.l<QH.a, ExtendedProfileWidgetItem> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.extended_profile.mvi.entity.a f150045l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(com.avito.android.extended_profile.mvi.entity.a aVar) {
        super(1);
        this.f150045l = aVar;
    }

    @Override // Y41.l
    public final ExtendedProfileWidgetItem invoke(QH.a aVar) {
        SubscribeInfo subscribeInfoCopy;
        HeaderItem headerItem = (HeaderItem) aVar;
        SubscribeInfo subscribeInfo = headerItem.f154425j;
        com.avito.android.extended_profile.mvi.entity.a aVar2 = this.f150045l;
        if (subscribeInfo != null) {
            Boolean boolValueOf = Boolean.valueOf(aVar2.f150249k.f150283b);
            a.e eVar = aVar2.f150249k;
            subscribeInfoCopy = subscribeInfo.copy(boolValueOf, eVar.f150284c, eVar.f150287f, eVar.f150288g);
        } else {
            subscribeInfoCopy = null;
        }
        SubscribeInfo subscribeInfo2 = subscribeInfoCopy;
        a.e eVar2 = aVar2.f150249k;
        return new HeaderItem(headerItem.f154417b, headerItem.f154418c, headerItem.f154419d, headerItem.f154420e, headerItem.f154421f, headerItem.f154422g, headerItem.f154423h, headerItem.f154424i, subscribeInfo2, eVar2.f150285d && !eVar2.f150289h, headerItem.f154427l, headerItem.f154428m, headerItem.f154429n);
    }
}
