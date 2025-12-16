package com.avito.android.important_addresses_selection.data;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ImportantAddressesSelectionRepositoryImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.important_addresses_selection.data.ImportantAddressesSelectionRepositoryImpl", f = "ImportantAddressesSelectionRepositoryImpl.kt", i = {}, l = {AvailableCode.APP_IS_BACKGROUND_OR_LOCKED}, m = "saveRealtyAddresses", n = {}, s = {})
/* loaded from: classes14.dex */
final class g extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f169706q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ h f169707r;

    /* renamed from: s, reason: collision with root package name */
    public int f169708s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f169707r = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f169706q = obj;
        this.f169708s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f169707r.a(null, null, this);
    }
}
