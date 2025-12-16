package com.avito.android.autoteka.data;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AutotekaRepository.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.autoteka.data.AutotekaRepository", f = "AutotekaRepository.kt", i = {}, l = {87}, m = "downloadManager", n = {}, s = {})
/* loaded from: classes11.dex */
final class e extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f96111q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ i f96112r;

    /* renamed from: s, reason: collision with root package name */
    public int f96113s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f96112r = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f96111q = obj;
        this.f96113s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f96112r.a(null, this);
    }
}
