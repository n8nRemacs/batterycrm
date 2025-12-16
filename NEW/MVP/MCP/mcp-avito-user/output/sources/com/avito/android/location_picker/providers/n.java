package com.avito.android.location_picker.providers;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AddressGeoCoder.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.location_picker.providers.AvitoAddressGeoCoder", f = "AddressGeoCoder.kt", i = {}, l = {87}, m = "getCoordsWithComponents", n = {}, s = {})
/* loaded from: classes14.dex */
final class n extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f182460q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ u f182461r;

    /* renamed from: s, reason: collision with root package name */
    public int f182462s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(u uVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f182461r = uVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f182460q = obj;
        this.f182462s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f182461r.c(null, this);
    }
}
