package com.avito.android.passport_lib;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: PassportProfilesUpdateRepository.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.passport_lib.PassportProfilesUpdateRepositoryImpl", f = "PassportProfilesUpdateRepository.kt", i = {0}, l = {19}, m = "profilesListUpdated", n = {"this"}, s = {"L$0"})
/* loaded from: classes15.dex */
final class i extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public j f213920q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f213921r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j f213922s;

    /* renamed from: t, reason: collision with root package name */
    public int f213923t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f213922s = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f213921r = obj;
        this.f213923t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f213922s.a(this);
    }
}
