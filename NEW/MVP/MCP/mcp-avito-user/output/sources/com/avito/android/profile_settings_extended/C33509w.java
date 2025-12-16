package com.avito.android.profile_settings_extended;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ExtendedProfileSettingsInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.profile_settings_extended.ExtendedProfileSettingsInteractorImpl", f = "ExtendedProfileSettingsInteractor.kt", i = {0}, l = {70}, m = "loadVerificationData", n = {"this"}, s = {"L$0"})
/* renamed from: com.avito.android.profile_settings_extended.w, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C33509w extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public C33508v f230834q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f230835r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C33508v f230836s;

    /* renamed from: t, reason: collision with root package name */
    public int f230837t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33509w(C33508v c33508v, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f230836s = c33508v;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f230835r = obj;
        this.f230837t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f230836s.a(this);
    }
}
