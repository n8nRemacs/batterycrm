package com.avito.android.user_adverts_filters.main.mvi_delegate;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.facebook.imageutils.JfifUtil;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import lj.InterfaceC43779a;
import qJ0.InterfaceC47308d;

/* compiled from: FiltersDelegateActor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.user_adverts_filters.main.mvi_delegate.FiltersDelegateActor", f = "FiltersDelegateActor.kt", i = {0, 0, 0}, l = {207, JfifUtil.MARKER_RST0}, m = "backChange", n = {"this", "$this$backChange", "change"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes5.dex */
final class e extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public C35708a f316119q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC43779a f316120r;

    /* renamed from: s, reason: collision with root package name */
    public InterfaceC47308d.a.C12320a f316121s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f316122t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C35708a f316123u;

    /* renamed from: v, reason: collision with root package name */
    public int f316124v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(C35708a c35708a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f316123u = c35708a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f316122t = obj;
        this.f316124v |= BeduinInputModel.MIN_TEXT_VERSION;
        int i12 = C35708a.f316084i;
        return this.f316123u.g(null, null, this);
    }
}
