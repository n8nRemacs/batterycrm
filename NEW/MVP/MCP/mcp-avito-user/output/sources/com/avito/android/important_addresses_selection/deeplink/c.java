package com.avito.android.important_addresses_selection.deeplink;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ImportantAddressesSelectionDeeplinkHandler.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.important_addresses_selection.deeplink.ImportantAddressesSelectionDeeplinkHandler", f = "ImportantAddressesSelectionDeeplinkHandler.kt", i = {0, 0}, l = {84, 84}, m = "handleScreenOpening", n = {"this", "xGeoSession"}, s = {"L$0", "L$1"})
/* loaded from: classes14.dex */
final class c extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public f f169723q;

    /* renamed from: r, reason: collision with root package name */
    public String f169724r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f169725s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f f169726t;

    /* renamed from: u, reason: collision with root package name */
    public int f169727u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f169726t = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f169725s = obj;
        this.f169727u |= BeduinInputModel.MIN_TEXT_VERSION;
        return f.k(this.f169726t, null, this);
    }
}
