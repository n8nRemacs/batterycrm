package com.avito.android.profile_settings_extended.phones;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ExtendedProfileSettingsPhonesRepository.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.profile_settings_extended.phones.ExtendedProfileSettingsPhonesRepositoryImpl", f = "ExtendedProfileSettingsPhonesRepository.kt", i = {}, l = {53}, m = "updatePhone", n = {}, s = {})
/* loaded from: classes16.dex */
final class f extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f230806q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f230807r;

    /* renamed from: s, reason: collision with root package name */
    public int f230808s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f230807r = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f230806q = obj;
        this.f230808s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f230807r.b(null, null, this);
    }
}
