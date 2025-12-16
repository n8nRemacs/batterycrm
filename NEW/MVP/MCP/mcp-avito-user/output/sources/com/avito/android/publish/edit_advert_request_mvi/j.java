package com.avito.android.publish.edit_advert_request_mvi;

import com.adjust.sdk.Constants;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: EditRequestInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.publish.edit_advert_request_mvi.EditRequestInteractorImpl", f = "EditRequestInteractor.kt", i = {0, 0, 0, 0, 0, 3, 3}, l = {109, 114, 118, 122, 123}, m = "onItemEdited", n = {"this", "response", "itemId", "collector", Constants.DEEPLINK, "response", "collector"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1"})
/* loaded from: classes16.dex */
final class j extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Object f235585q;

    /* renamed from: r, reason: collision with root package name */
    public Object f235586r;

    /* renamed from: s, reason: collision with root package name */
    public String f235587s;

    /* renamed from: t, reason: collision with root package name */
    public InterfaceC43172j f235588t;

    /* renamed from: u, reason: collision with root package name */
    public DeepLink f235589u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f235590v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f235591w;

    /* renamed from: x, reason: collision with root package name */
    public int f235592x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(g gVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f235591w = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f235590v = obj;
        this.f235592x |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f235591w.a(null, null, null, this);
    }
}
