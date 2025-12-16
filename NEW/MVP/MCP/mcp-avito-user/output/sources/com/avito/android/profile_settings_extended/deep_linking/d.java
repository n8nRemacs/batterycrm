package com.avito.android.profile_settings_extended.deep_linking;

import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ProfileDisableExtendedLinkAsyncHandler.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.profile_settings_extended.deep_linking.ProfileDisableExtendedLinkAsyncHandler", f = "ProfileDisableExtendedLinkAsyncHandler.kt", i = {0}, l = {83}, m = "disableExtendedProfile", n = {"this"}, s = {"L$0"})
/* loaded from: classes16.dex */
final class d extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public i f230055q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f230056r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i f230057s;

    /* renamed from: t, reason: collision with root package name */
    public int f230058t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(i iVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f230057s = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f230056r = obj;
        this.f230058t |= BeduinInputModel.MIN_TEXT_VERSION;
        return i.k(this.f230057s, this);
    }
}
