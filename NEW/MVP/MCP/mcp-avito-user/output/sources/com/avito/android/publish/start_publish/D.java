package com.avito.android.publish.start_publish;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.publish.start_publish.StartPublishSheet;
import com.avito.android.remote.model.publish.PublishInitialToast;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: StartPublishSheet.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class D extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ PublishInitialToast f245258l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ StartPublishSheet f245259m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(PublishInitialToast publishInitialToast, StartPublishSheet startPublishSheet) {
        super(0);
        this.f245258l = publishInitialToast;
        this.f245259m = startPublishSheet;
    }

    @Override // Y41.a
    public final G0 invoke() {
        DeepLink uri;
        StartPublishSheet.b bVar;
        List<PublishInitialToast.ClickstreamEvent> buttonEvents;
        PublishInitialToast publishInitialToast = this.f245258l;
        PublishInitialToast.Button button = publishInitialToast.getButton();
        StartPublishSheet startPublishSheet = this.f245259m;
        if (button != null && (buttonEvents = button.getButtonEvents()) != null) {
            Iterator<T> it = buttonEvents.iterator();
            while (it.hasNext()) {
                String eventId = ((PublishInitialToast.ClickstreamEvent) it.next()).getEventId();
                if (eventId != null) {
                    startPublishSheet.f245300F.z0(Integer.parseInt(eventId));
                }
            }
        }
        PublishInitialToast.Button button2 = publishInitialToast.getButton();
        if (button2 != null && (uri = button2.getUri()) != null && (bVar = startPublishSheet.f245307M) != null) {
            bVar.a(uri);
        }
        return G0.f406611a;
    }
}
