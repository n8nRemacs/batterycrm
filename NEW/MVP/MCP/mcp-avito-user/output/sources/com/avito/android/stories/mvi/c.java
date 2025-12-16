package com.avito.android.stories.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.stories.mvi.entity.StoriesState;
import com.facebook.imageutils.JfifUtil;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: StoriesActor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.stories.mvi.StoriesActor", f = "StoriesActor.kt", i = {0, 0, 0, 1, 1, 1}, l = {214, JfifUtil.MARKER_RST7, JfifUtil.MARKER_SOI}, m = "reload", n = {"this", "$this$reload", "previousState", "this", "$this$reload", "previousState"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
/* loaded from: classes3.dex */
final class c extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public a f285216q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC43172j f285217r;

    /* renamed from: s, reason: collision with root package name */
    public StoriesState f285218s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f285219t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ a f285220u;

    /* renamed from: v, reason: collision with root package name */
    public int f285221v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f285220u = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f285219t = obj;
        this.f285221v |= BeduinInputModel.MIN_TEXT_VERSION;
        return a.c(this.f285220u, null, null, this);
    }
}
