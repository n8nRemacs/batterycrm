package com.avito.android.notifications_settings.profile;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: NotificationsSettingsMessengerHelperImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.notifications_settings.profile.NotificationsSettingsMessengerHelperImpl", f = "NotificationsSettingsMessengerHelperImpl.kt", i = {0}, l = {36}, m = "getDisabledMessengerSectionTypes", n = {"types"}, s = {"L$0"})
/* loaded from: classes15.dex */
final class c extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f208015q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f208016r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f208017s;

    /* renamed from: t, reason: collision with root package name */
    public int f208018t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f208017s = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f208016r = obj;
        this.f208018t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f208017s.b(this);
    }
}
