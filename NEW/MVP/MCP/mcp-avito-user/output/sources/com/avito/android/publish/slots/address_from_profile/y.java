package com.avito.android.publish.slots.address_from_profile;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.publish.slots.address_from_profile.z;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SelectAddressInListSlotWrapper.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.publish.slots.address_from_profile.SelectAddressInListSlotWrapper$1$1", f = "SelectAddressInListSlotWrapper.kt", i = {0}, l = {75}, m = "emit", n = {"this"}, s = {"L$0"})
/* loaded from: classes16.dex */
final class y extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Object f242962q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f242963r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ z.a.C7283a<Object> f242964s;

    /* renamed from: t, reason: collision with root package name */
    public int f242965t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z.a.C7283a<Object> c7283a, Continuation<? super y> continuation) {
        super(continuation);
        this.f242964s = c7283a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f242963r = obj;
        this.f242965t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f242964s.a(this);
    }
}
