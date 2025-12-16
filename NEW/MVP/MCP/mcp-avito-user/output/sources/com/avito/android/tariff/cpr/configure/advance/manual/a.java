package com.avito.android.tariff.cpr.configure.advance.manual;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CprConfigureAdvanceManualFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.tariff.cpr.configure.advance.manual.CprConfigureAdvanceManualFragment", f = "CprConfigureAdvanceManualFragment.kt", i = {0}, l = {214}, m = "handleEvent", n = {"this"}, s = {"L$0"})
/* loaded from: classes4.dex */
final class a extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public CprConfigureAdvanceManualFragment f295359q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f295360r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ CprConfigureAdvanceManualFragment f295361s;

    /* renamed from: t, reason: collision with root package name */
    public int f295362t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(CprConfigureAdvanceManualFragment cprConfigureAdvanceManualFragment, Continuation<? super a> continuation) {
        super(continuation);
        this.f295361s = cprConfigureAdvanceManualFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f295360r = obj;
        this.f295362t |= BeduinInputModel.MIN_TEXT_VERSION;
        return CprConfigureAdvanceManualFragment.f5(this.f295361s, null, this);
    }
}
