package com.avito.android.important_addresses_selection.data;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ImportantAddressesSelectionRepositoryImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.important_addresses_selection.data.ImportantAddressesSelectionRepositoryImpl", f = "ImportantAddressesSelectionRepositoryImpl.kt", i = {0, 0}, l = {19}, m = "getSelectionForm", n = {"this", "xGeoSession"}, s = {"L$0", "L$1"})
/* loaded from: classes14.dex */
final class f extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public h f169701q;

    /* renamed from: r, reason: collision with root package name */
    public String f169702r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f169703s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ h f169704t;

    /* renamed from: u, reason: collision with root package name */
    public int f169705u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f169704t = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f169703s = obj;
        this.f169705u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f169704t.b(null, this);
    }
}
