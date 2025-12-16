package com.avito.android.iac_incoming_call_ability.impl_module.delete_device;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: DeleteDeviceInteractorImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.iac_incoming_call_ability.impl_module.delete_device.DeleteDeviceInteractorImpl", f = "DeleteDeviceInteractorImpl.kt", i = {}, l = {19}, m = "deleteDevice", n = {}, s = {})
/* loaded from: classes14.dex */
final class a extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f168288q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b f168289r;

    /* renamed from: s, reason: collision with root package name */
    public int f168290s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f168289r = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f168288q = obj;
        this.f168290s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f168289r.a(null, null, this);
    }
}
