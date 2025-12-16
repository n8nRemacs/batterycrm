package com.avito.android.contact_access.contact_access_package.domain;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ContactAccessPackageInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.contact_access.contact_access_package.domain.ContactAccessPackageInteractorImpl", f = "ContactAccessPackageInteractor.kt", i = {}, l = {AvailableCode.ERROR_ON_ACTIVITY_RESULT}, m = "loadPackage", n = {}, s = {})
/* loaded from: classes12.dex */
final class b extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f125875q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c f125876r;

    /* renamed from: s, reason: collision with root package name */
    public int f125877s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f125876r = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f125875q = obj;
        this.f125877s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f125876r.a(this);
    }
}
