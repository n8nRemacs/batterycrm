package com.avito.android.vacancy_call_action.deeplink;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: VacancyCallActionDeeplinkHandler.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.vacancy_call_action.deeplink.VacancyCallActionDeeplinkHandler", f = "VacancyCallActionDeeplinkHandler.kt", i = {0}, l = {AvailableCode.ERROR_ON_ACTIVITY_RESULT}, m = "doHandleSuspend", n = {"this"}, s = {"L$0"})
/* loaded from: classes5.dex */
final class a extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public b f319205q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f319206r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b f319207s;

    /* renamed from: t, reason: collision with root package name */
    public int f319208t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f319207s = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f319206r = obj;
        this.f319208t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f319207s.o(null, this);
    }
}
