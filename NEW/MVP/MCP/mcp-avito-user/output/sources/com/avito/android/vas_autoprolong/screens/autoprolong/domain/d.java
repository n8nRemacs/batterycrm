package com.avito.android.vas_autoprolong.screens.autoprolong.domain;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SetVasAutoprolongUseCaseImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.vas_autoprolong.screens.autoprolong.domain.SetVasAutoprolongUseCaseImpl", f = "SetVasAutoprolongUseCaseImpl.kt", i = {}, l = {20}, m = "invoke", n = {}, s = {})
/* loaded from: classes5.dex */
final class d extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f319523q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ e f319524r;

    /* renamed from: s, reason: collision with root package name */
    public int f319525s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f319524r = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f319523q = obj;
        this.f319525s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f319524r.a(0L, null, false, 0L, 0L, 0L, this);
    }
}
