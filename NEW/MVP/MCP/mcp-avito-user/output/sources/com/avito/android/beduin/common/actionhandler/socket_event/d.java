package com.avito.android.beduin.common.actionhandler.socket_event;

import com.avito.android.beduin.common.action.BeduinSocketEventAction;
import kotlin.Metadata;
import lj.InterfaceC43779a;
import mx0.InterfaceC44149a;
import vj.C49337a;

/* compiled from: BeduinSocketEventsHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmx0/a;", "event", "Lkotlin/G0;", "accept", "(Lmx0/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class d<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BeduinSocketEventAction.Subscribe f100395b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f100396c;

    public d(BeduinSocketEventAction.Subscribe subscribe, a aVar) {
        this.f100395b = subscribe;
        this.f100396c = aVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        String formId;
        InterfaceC43779a interfaceC43779a;
        InterfaceC44149a interfaceC44149a = (InterfaceC44149a) obj;
        boolean z12 = interfaceC44149a instanceof C49337a;
        a aVar = this.f100396c;
        BeduinSocketEventAction.Subscribe subscribe = this.f100395b;
        if (z12 && (formId = subscribe.getFormId()) != null && formId.length() != 0 && (interfaceC43779a = aVar.f100387c.get(subscribe.getFormId())) != null) {
            interfaceC43779a.j(((C49337a) interfaceC44149a).f440940a);
        }
        com.avito.android.beduin_shared.model.utils.a.a(aVar.f100386b.get(), subscribe.getOnEventActions());
    }
}
