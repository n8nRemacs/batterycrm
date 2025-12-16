package com.avito.android.publish;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.publish.analytics.C33536w;
import com.avito.android.remote.model.publish.PublishInitialToast;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: PublishActivity.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.publish.d0, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C33545d0 extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ PublishInitialToast f232486l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ PublishActivity f232487m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33545d0(PublishInitialToast publishInitialToast, PublishActivity publishActivity) {
        super(0);
        this.f232486l = publishInitialToast;
        this.f232487m = publishActivity;
    }

    @Override // Y41.a
    public final kotlin.G0 invoke() throws NumberFormatException {
        DeepLink uri;
        List<PublishInitialToast.ClickstreamEvent> buttonEvents;
        PublishInitialToast publishInitialToast = this.f232486l;
        PublishInitialToast.Button button = publishInitialToast.getButton();
        PublishActivity publishActivity = this.f232487m;
        if (button != null && (buttonEvents = button.getButtonEvents()) != null) {
            Iterator<T> it = buttonEvents.iterator();
            while (it.hasNext()) {
                String eventId = ((PublishInitialToast.ClickstreamEvent) it.next()).getEventId();
                if (eventId != null) {
                    int i12 = Integer.parseInt(eventId);
                    C33536w c33536w = publishActivity.f231981r;
                    if (c33536w == null) {
                        c33536w = null;
                    }
                    c33536w.z0(i12);
                }
            }
        }
        PublishInitialToast.Button button2 = publishInitialToast.getButton();
        if (button2 != null && (uri = button2.getUri()) != null) {
            publishActivity.a(uri);
        }
        return kotlin.G0.f406611a;
    }
}
