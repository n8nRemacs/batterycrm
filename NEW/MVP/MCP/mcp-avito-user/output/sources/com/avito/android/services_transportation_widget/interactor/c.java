package com.avito.android.services_transportation_widget.interactor;

import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.services_transportation_widget.item.ServiceTransportationWidgetItem;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ServiceTransportationWidgetInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.services_transportation_widget.interactor.ServiceTransportationWidgetInteractorImpl", f = "ServiceTransportationWidgetInteractor.kt", i = {0, 0}, l = {65, 71}, m = "updatedSelectedValue", n = {"this", VoiceInfo.STATE}, s = {"L$0", "L$1"})
/* loaded from: classes3.dex */
final class c extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Object f280521q;

    /* renamed from: r, reason: collision with root package name */
    public ServiceTransportationWidgetItem f280522r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f280523s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f280524t;

    /* renamed from: u, reason: collision with root package name */
    public int f280525u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f280524t = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f280523s = obj;
        this.f280525u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f280524t.a(null, null, null, null, this);
    }
}
