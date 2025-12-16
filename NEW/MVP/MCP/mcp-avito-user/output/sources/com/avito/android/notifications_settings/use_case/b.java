package com.avito.android.notifications_settings.use_case;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: EnableNotificationsPushSectionUseCaseImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.notifications_settings.use_case.EnableNotificationsPushSectionUseCaseImpl", f = "EnableNotificationsPushSectionUseCaseImpl.kt", i = {0}, l = {20}, m = "invoke", n = {"this"}, s = {"L$0"})
/* loaded from: classes15.dex */
final class b extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f208197q;

    /* renamed from: r, reason: collision with root package name */
    public int f208198r;

    public b() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f208197q = obj;
        this.f208198r |= BeduinInputModel.MIN_TEXT_VERSION;
        throw null;
    }
}
