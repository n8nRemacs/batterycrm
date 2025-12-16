package com.avito.android.user_address.map.domain;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.facebook.imageutils.JfifUtil;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: UserAddressMapInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.user_address.map.domain.UserAddressAddNewAddressInteractorImpl", f = "UserAddressMapInteractor.kt", i = {0}, l = {JfifUtil.MARKER_APP1}, m = "multiGeoUpdateAddress", n = {"this"}, s = {"L$0"})
/* loaded from: classes4.dex */
final class l extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public e f307608q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f307609r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f307610s;

    /* renamed from: t, reason: collision with root package name */
    public int f307611t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f307610s = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f307609r = obj;
        this.f307611t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f307610s.b(null, null, 0, 0.0d, 0.0d, this);
    }
}
