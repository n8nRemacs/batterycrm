package com.avito.android.beduin.common.component.file_uploader.data;

import com.avito.android.beduin.common.component.file_uploader.x;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import zZ.InterfaceC50529c;

/* compiled from: FileUploaderInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LzZ/c;", "uploadState", "Lkotlin/G0;", "invoke", "(LzZ/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class i extends N implements Y41.l<InterfaceC50529c, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ io.reactivex.rxjava3.subjects.e<x> f101252l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f101253m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f101254n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(io.reactivex.rxjava3.subjects.e<x> eVar, String str, String str2) {
        super(1);
        this.f101252l = eVar;
        this.f101253m = str;
        this.f101254n = str2;
    }

    @Override // Y41.l
    public final G0 invoke(InterfaceC50529c interfaceC50529c) {
        InterfaceC50529c interfaceC50529c2 = interfaceC50529c;
        boolean z12 = interfaceC50529c2 instanceof InterfaceC50529c.C12957c;
        io.reactivex.rxjava3.subjects.e<x> eVar = this.f101252l;
        String str = this.f101253m;
        if (z12) {
            eVar.onNext(new x.d.b(str, ((InterfaceC50529c.C12957c) interfaceC50529c2).f444073a));
        } else if (interfaceC50529c2 instanceof InterfaceC50529c.a) {
            eVar.onNext(new x.b(str, this.f101254n));
        }
        return G0.f406611a;
    }
}
