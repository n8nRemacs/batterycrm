package com.avito.android.publish.items.video_upload;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: VideoUploadItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class g extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f237298l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f fVar) {
        super(0);
        this.f237298l = fVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        com.jakewharton.rxrelay3.c<G0> cVar = this.f237298l.f237287p;
        G0 g02 = G0.f406611a;
        cVar.accept(g02);
        return g02;
    }
}
