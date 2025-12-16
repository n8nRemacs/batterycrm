package com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.domain;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: UserAdvertsInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.domain.UserAdvertsInteractorImpl", f = "UserAdvertsInteractor.kt", i = {}, l = {AvailableCode.HMS_IS_SPOOF}, m = "shortcutsV4", n = {}, s = {})
/* loaded from: classes5.dex */
final class c extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f313860q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b f313861r;

    /* renamed from: s, reason: collision with root package name */
    public int f313862s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f313861r = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f313860q = obj;
        this.f313862s |= BeduinInputModel.MIN_TEXT_VERSION;
        return b.b(this.f313861r, this);
    }
}
