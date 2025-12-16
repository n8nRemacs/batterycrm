package com.avito.android.publish.video_upload;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import zZ.InterfaceC50529c;

/* compiled from: VideoUploadInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LzZ/c;", "uploadState", "Lkotlin/G0;", "invoke", "(LzZ/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class h extends N implements Y41.l<InterfaceC50529c, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ io.reactivex.rxjava3.subjects.e<Ef0.b> f245551l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(io.reactivex.rxjava3.subjects.e<Ef0.b> eVar) {
        super(1);
        this.f245551l = eVar;
    }

    @Override // Y41.l
    public final G0 invoke(InterfaceC50529c interfaceC50529c) {
        InterfaceC50529c interfaceC50529c2 = interfaceC50529c;
        boolean z12 = interfaceC50529c2 instanceof InterfaceC50529c.C12957c;
        io.reactivex.rxjava3.subjects.e<Ef0.b> eVar = this.f245551l;
        if (z12) {
            InterfaceC50529c.C12957c c12957c = (InterfaceC50529c.C12957c) interfaceC50529c2;
            eVar.onNext(new Ef0.b(c12957c.f444074b, c12957c.f444075c));
        } else if (interfaceC50529c2 instanceof InterfaceC50529c.a) {
            eVar.onError(((InterfaceC50529c.a) interfaceC50529c2).f444071a);
        }
        return G0.f406611a;
    }
}
