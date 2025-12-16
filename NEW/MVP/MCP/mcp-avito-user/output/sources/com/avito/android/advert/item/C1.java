package com.avito.android.advert.item;

import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent;
import com.avito.beduin.v2.render.android_view.BeduinView;
import kotlin.Metadata;

/* compiled from: AdvertDetailsView.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final /* synthetic */ class C1 extends kotlin.jvm.internal.H implements Y41.l<Object, kotlin.G0> {
    @Override // Y41.l
    public final kotlin.G0 invoke(Object obj) {
        I1 i12 = (I1) this.receiver;
        i12.getClass();
        if (obj instanceof BeduinOneTimeEvent) {
            BeduinOneTimeEvent beduinOneTimeEvent = (BeduinOneTimeEvent) obj;
            if (beduinOneTimeEvent instanceof BeduinOneTimeEvent.ShowToastBar) {
                BeduinView beduinView = i12.f71648E0;
                if (beduinView != null) {
                    com.avito.android.lib.beduin_v2.ui_messages.b.f177570a.getClass();
                    com.avito.android.lib.beduin_v2.ui_messages.b.a(beduinView, (BeduinOneTimeEvent.ShowToastBar) obj);
                }
            } else if (!(beduinOneTimeEvent instanceof BeduinOneTimeEvent.b) && !(beduinOneTimeEvent instanceof BeduinOneTimeEvent.d)) {
                if (beduinOneTimeEvent instanceof BeduinOneTimeEvent.a) {
                    BeduinView beduinView2 = i12.f71648E0;
                    if (beduinView2 != null) {
                        beduinView2.c(((BeduinOneTimeEvent.a) obj).f176280a);
                    }
                } else {
                    boolean z12 = beduinOneTimeEvent instanceof BeduinOneTimeEvent.c;
                }
            }
        }
        return kotlin.G0.f406611a;
    }
}
