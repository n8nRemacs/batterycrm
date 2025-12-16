package com.avito.android.publish.screen.step.params.domain;

import com.avito.android.publish.details.K1;
import com.avito.android.remote.model.category_parameters.PhotoParameter;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PublishDetailsInteractorAsync.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class K extends kotlin.jvm.internal.N implements Y41.l<Throwable, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C34076c f241143l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ PhotoParameter f241144m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.N f241145n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public K(C34076c c34076c, PhotoParameter photoParameter, Y41.l<? super K1.C33667a, G0> lVar) {
        super(1);
        this.f241143l = c34076c;
        this.f241144m = photoParameter;
        this.f241145n = (kotlin.jvm.internal.N) lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // Y41.l
    public final G0 invoke(Throwable th2) {
        PhotoParameter photoParameter = this.f241144m;
        this.f241143l.x(this.f241145n, photoParameter);
        return G0.f406611a;
    }
}
