package com.avito.android.iac_api_utils.util_module;

import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: IacApiTracker.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.iac_api_utils.util_module.IacApiTrackerImpl", f = "IacApiTracker.kt", i = {0, 0}, l = {92}, m = "trackSuspend", n = {"this", "analyticsEventName"}, s = {"L$0", "L$1"})
/* loaded from: classes13.dex */
final class h<T> extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public b f164316q;

    /* renamed from: r, reason: collision with root package name */
    public String f164317r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f164318s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f164319t;

    /* renamed from: u, reason: collision with root package name */
    public int f164320u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f164319t = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f164318s = obj;
        this.f164320u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f164319t.c(null, null, null, this);
    }
}
