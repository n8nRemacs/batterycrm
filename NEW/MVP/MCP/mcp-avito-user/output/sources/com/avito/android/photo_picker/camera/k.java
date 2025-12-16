package com.avito.android.photo_picker.camera;

import com.avito.android.photo_picker.InterfaceC33224a;
import kotlin.Metadata;

/* compiled from: CameraViewModel.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "photoByteArray", "Lio/reactivex/rxjava3/core/E;", "Landroid/net/Uri;", "apply", "([B)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class k<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f219012b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33224a f219013c;

    public k(i iVar, InterfaceC33224a interfaceC33224a) {
        this.f219012b = iVar;
        this.f219013c = interfaceC33224a;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        byte[] bArr = (byte[]) obj;
        i iVar = this.f219012b;
        return iVar.f218976P.a(bArr, iVar.le(), this.f219013c.c(iVar.f218973M.getRotation())).d0(new j(iVar, bArr));
    }
}
