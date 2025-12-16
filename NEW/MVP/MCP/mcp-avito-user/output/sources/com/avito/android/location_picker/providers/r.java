package com.avito.android.location_picker.providers;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AddressGeoCoder.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.location_picker.providers.AvitoAddressGeoCoder", f = "AddressGeoCoder.kt", i = {}, l = {243}, m = "getSuggestionsFromApiV2", n = {}, s = {})
/* loaded from: classes14.dex */
final class r extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f182468q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ u f182469r;

    /* renamed from: s, reason: collision with root package name */
    public int f182470s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(u uVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f182469r = uVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f182468q = obj;
        this.f182470s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f182469r.h(null, null, this);
    }
}
