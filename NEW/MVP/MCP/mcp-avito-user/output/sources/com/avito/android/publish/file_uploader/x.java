package com.avito.android.publish.file_uploader;

import fe0.InterfaceC40409b;
import kotlin.Metadata;

/* compiled from: FileUploaderViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class x<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f235739b;

    public x(t tVar) {
        this.f235739b = tVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Throwable th2 = (Throwable) obj;
        if (th2 instanceof fe0.c) {
            fe0.c cVar = (fe0.c) th2;
            t.ke(this.f235739b, new InterfaceC40409b.c.a(cVar.f396005b, cVar.f396006c));
        }
    }
}
