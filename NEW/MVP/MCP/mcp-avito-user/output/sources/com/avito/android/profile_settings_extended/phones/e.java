package com.avito.android.profile_settings_extended.phones;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ExtendedProfileSettingsPhonesRepository.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.profile_settings_extended.phones.ExtendedProfileSettingsPhonesRepositoryImpl", f = "ExtendedProfileSettingsPhonesRepository.kt", i = {}, l = {AvailableCode.USER_IGNORE_PREVIOUS_POPUP}, m = "attachPhone", n = {}, s = {})
/* loaded from: classes16.dex */
final class e extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f230803q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f230804r;

    /* renamed from: s, reason: collision with root package name */
    public int f230805s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f230804r = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f230803q = obj;
        this.f230805s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f230804r.a(null, this);
    }
}
