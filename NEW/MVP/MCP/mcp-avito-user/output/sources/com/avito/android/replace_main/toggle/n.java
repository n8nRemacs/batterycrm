package com.avito.android.replace_main.toggle;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ReplaceMainToggleInteractorImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.replace_main.toggle.ReplaceMainToggleInteractorImpl", f = "ReplaceMainToggleInteractorImpl.kt", i = {0}, l = {AvailableCode.ERROR_NO_ACTIVITY}, m = "loadReplaceMainToggle", n = {"this"}, s = {"L$0"})
/* loaded from: classes12.dex */
final class n extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public p f254646q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f254647r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p f254648s;

    /* renamed from: t, reason: collision with root package name */
    public int f254649t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f254648s = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f254647r = obj;
        this.f254649t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f254648s.a(this);
    }
}
