package com.avito.android.publish.screen.step.params.domain;

import com.avito.android.publish.InterfaceC33878l;
import com.avito.android.publish.details.K1;
import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: PublishDetailsInteractorAsync.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/publish/l$a;", NotificationsSettings.Section.SECTION_PAID_SERVICES, "Lkotlin/G0;", "accept", "(Lcom/avito/android/publish/l$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.publish.screen.step.params.domain.h, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C34081h<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C34076c f241274b;

    public C34081h(C34076c c34076c) {
        this.f241274b = c34076c;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        InterfaceC33878l.a aVar = (InterfaceC33878l.a) obj;
        String str = aVar.f237373a;
        if (C43066x.K(str)) {
            return;
        }
        C34076c c34076c = this.f241274b;
        c34076c.f241194i.y(aVar.f237374b, aVar.f237375c);
        c34076c.f241182L.setValue(new K1.AbstractC33668b.j(str));
    }
}
