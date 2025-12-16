package com.avito.android.profile.deep_linking;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CloseInternalBannerRotationDeepLinkHandler.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.profile.deep_linking.CloseInternalBannerRotationDeepLinkHandler", f = "CloseInternalBannerRotationDeepLinkHandler.kt", i = {0}, l = {20}, m = "doHandleSuspend", n = {"this"}, s = {"L$0"})
/* renamed from: com.avito.android.profile.deep_linking.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C33309a extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public C33310b f221890q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f221891r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C33310b f221892s;

    /* renamed from: t, reason: collision with root package name */
    public int f221893t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33309a(C33310b c33310b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f221892s = c33310b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f221891r = obj;
        this.f221893t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f221892s.o(null, this);
    }
}
