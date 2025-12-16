package com.avito.android.license.data;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: LicenseRepository.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.license.data.LicenseRepositoryImpl", f = "LicenseRepository.kt", i = {}, l = {48}, m = "getLicensesHtml", n = {}, s = {})
/* loaded from: classes14.dex */
final class c extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f181507q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ e f181508r;

    /* renamed from: s, reason: collision with root package name */
    public int f181509s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f181508r = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f181507q = obj;
        this.f181509s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f181508r.a(this);
    }
}
