package com.avito.android.credman;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CredmanSaver.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.credman.CredmanSaverImpl", f = "CredmanSaver.kt", i = {0}, l = {19}, m = "save", n = {"login"}, s = {"L$0"})
/* loaded from: classes12.dex */
final class p extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public String f129105q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f129106r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ q f129107s;

    /* renamed from: t, reason: collision with root package name */
    public int f129108t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f129107s = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f129106r = obj;
        this.f129108t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f129107s.a(null, null, this);
    }
}
