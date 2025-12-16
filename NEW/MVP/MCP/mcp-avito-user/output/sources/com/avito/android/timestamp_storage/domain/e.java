package com.avito.android.timestamp_storage.domain;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.timestamp_storage.domain.d;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: TimestampStorage.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.timestamp_storage.domain.TimestampStorage$DefaultImpls", f = "TimestampStorage.kt", i = {}, l = {134}, m = "isExpired", n = {}, s = {})
/* loaded from: classes4.dex */
final class e extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f301488q;

    /* renamed from: r, reason: collision with root package name */
    public int f301489r;

    public e() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f301488q = obj;
        this.f301489r |= BeduinInputModel.MIN_TEXT_VERSION;
        return d.a.a(null, null, this);
    }
}
