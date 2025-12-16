package com.avito.android.sx_address.address_video_verification.domain;

import android.net.Uri;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SxAddressVideoVerificationInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.sx_address.address_video_verification.domain.SxAddressVideoVerificationInteractorImpl", f = "SxAddressVideoVerificationInteractor.kt", i = {0, 0, 0}, l = {76}, m = "uploadVideo", n = {"this", "videoUri", "videoMaxSizeMB"}, s = {"L$0", "L$1", "J$0"})
/* loaded from: classes4.dex */
final class h extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public e f292635q;

    /* renamed from: r, reason: collision with root package name */
    public Uri f292636r;

    /* renamed from: s, reason: collision with root package name */
    public long f292637s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f292638t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ e f292639u;

    /* renamed from: v, reason: collision with root package name */
    public int f292640v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f292639u = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f292638t = obj;
        this.f292640v |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f292639u.a(null, 0L, 0L, this);
    }
}
