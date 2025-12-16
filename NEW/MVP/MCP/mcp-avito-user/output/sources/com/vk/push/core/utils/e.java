package com.vk.push.core.utils;

import androidx.datastore.preferences.core.f;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: DataStoreExtensions.kt */
@Metadata(k = 3, mv = {1, 7, 0}, xi = 48)
@DebugMetadata(c = "com.vk.push.core.utils.DataStoreExtensionsKt", f = "DataStoreExtensions.kt", i = {0, 0, 0, 1}, l = {30, 35}, m = "compareAndSet", n = {"$this$compareAndSet", "key", "newValue", "isChanged"}, s = {"L$0", "L$1", "L$2", "I$0"})
/* loaded from: classes7.dex */
final class e<T> extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public androidx.datastore.core.h f367160q;

    /* renamed from: r, reason: collision with root package name */
    public f.a f367161r;

    /* renamed from: s, reason: collision with root package name */
    public Integer f367162s;

    /* renamed from: t, reason: collision with root package name */
    public int f367163t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f367164u;

    /* renamed from: v, reason: collision with root package name */
    public int f367165v;

    public e() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f367164u = obj;
        this.f367165v |= BeduinInputModel.MIN_TEXT_VERSION;
        return j.a(null, null, null, null, this);
    }
}
