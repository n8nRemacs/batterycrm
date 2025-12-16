package com.vk.push.core.utils;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: DataStoreExtensions.kt */
@Metadata(k = 3, mv = {1, 7, 0}, xi = 48)
@DebugMetadata(c = "com.vk.push.core.utils.DataStoreExtensionsKt", f = "DataStoreExtensions.kt", i = {0}, l = {14}, m = "getValue", n = {"defaultSavedValue"}, s = {"L$0"})
/* loaded from: classes7.dex */
final class g<T> extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Integer f367173q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f367174r;

    /* renamed from: s, reason: collision with root package name */
    public int f367175s;

    public g() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f367174r = obj;
        this.f367175s |= BeduinInputModel.MIN_TEXT_VERSION;
        return j.b(null, null, null, this);
    }
}
