package com.avito.android.location_picker.providers;

import com.avito.android.avito_map.AvitoMapBounds;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AddressGeoCoder.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.location_picker.providers.AvitoAddressGeoCoder", f = "AddressGeoCoder.kt", i = {0, 0, 0}, l = {177}, m = "getSuggestionsWithoutCoords", n = {"this", "searchQuery", "visibleRegion"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes14.dex */
final class s extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public u f182471q;

    /* renamed from: r, reason: collision with root package name */
    public String f182472r;

    /* renamed from: s, reason: collision with root package name */
    public AvitoMapBounds f182473s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f182474t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ u f182475u;

    /* renamed from: v, reason: collision with root package name */
    public int f182476v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(u uVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f182475u = uVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f182474t = obj;
        this.f182476v |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f182475u.g(null, null, this);
    }
}
