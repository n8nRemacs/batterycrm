package com.avito.android.user_adverts.root_screen.adverts_host.host_view;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: HostViewRenderer.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.host_view.UserAdvertsHostViewRenderer", f = "HostViewRenderer.kt", i = {}, l = {552}, m = "awaitCurrentItem", n = {}, s = {})
/* loaded from: classes5.dex */
final class l extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f313070q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ j f313071r;

    /* renamed from: s, reason: collision with root package name */
    public int f313072s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(j jVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f313071r = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f313070q = obj;
        this.f313072s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f313071r.c(null, 0, this);
    }
}
