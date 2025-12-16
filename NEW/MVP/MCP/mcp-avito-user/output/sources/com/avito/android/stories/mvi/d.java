package com.avito.android.stories.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: StoriesActor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.stories.mvi.StoriesActor", f = "StoriesActor.kt", i = {0, 0}, l = {170, 177}, m = "sendAnalyticsAndClose", n = {"this", "$this$sendAnalyticsAndClose"}, s = {"L$0", "L$1"})
/* loaded from: classes3.dex */
final class d extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public a f285222q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC43172j f285223r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f285224s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a f285225t;

    /* renamed from: u, reason: collision with root package name */
    public int f285226u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f285225t = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f285224s = obj;
        this.f285226u |= BeduinInputModel.MIN_TEXT_VERSION;
        return a.d(this.f285225t, null, null, null, this);
    }
}
