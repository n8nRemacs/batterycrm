package com.avito.android.publish.edit_advert_request_mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: EditRequestInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.publish.edit_advert_request_mvi.EditRequestInteractorImpl", f = "EditRequestInteractor.kt", i = {0, 0}, l = {172, 178}, m = "showPretendErrors", n = {"pretendErrors", "collector"}, s = {"L$0", "L$1"})
/* loaded from: classes16.dex */
final class k extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Map f235593q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC43172j f235594r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f235595s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ g f235596t;

    /* renamed from: u, reason: collision with root package name */
    public int f235597u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(g gVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f235596t = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f235595s = obj;
        this.f235597u |= BeduinInputModel.MIN_TEXT_VERSION;
        int i12 = g.f235565i;
        return this.f235596t.d(null, null, this);
    }
}
