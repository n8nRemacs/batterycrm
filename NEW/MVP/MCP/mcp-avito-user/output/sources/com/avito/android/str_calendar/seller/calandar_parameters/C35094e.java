package com.avito.android.str_calendar.seller.calandar_parameters;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: OnboardingDeterminer.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.str_calendar.seller.calandar_parameters.OnboardingDeterminer", f = "OnboardingDeterminer.kt", i = {0, 0, 0}, l = {18, 30, 35}, m = "isAllowedToRunOnboarding", n = {"this", "tooltipId", "item"}, s = {"L$0", "L$1", "L$2"})
/* renamed from: com.avito.android.str_calendar.seller.calandar_parameters.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C35094e extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public C35095f f287024q;

    /* renamed from: r, reason: collision with root package name */
    public String f287025r;

    /* renamed from: s, reason: collision with root package name */
    public com.avito.conveyor_item.a f287026s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f287027t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C35095f f287028u;

    /* renamed from: v, reason: collision with root package name */
    public int f287029v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35094e(C35095f c35095f, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f287028u = c35095f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f287027t = obj;
        this.f287029v |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f287028u.a(null, null, this);
    }
}
