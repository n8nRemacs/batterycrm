package com.avito.android.publish.file_uploader;

import android.net.Uri;
import com.avito.android.remote.model.category_parameters.FileUploadApiConfig;
import com.avito.android.remote.model.category_parameters.FileUploadApiValue;
import com.avito.android.remote.model.category_parameters.FileUploaderParameter;
import com.avito.android.util.InterfaceC35745a5;
import fe0.C40408a;
import fe0.InterfaceC40409b;
import io.reactivex.rxjava3.core.AbstractC41768a;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import l41.InterfaceC43543a;

/* compiled from: FileUploaderViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/net/Uri;", "it", "Lkotlin/G0;", "accept", "(Landroid/net/Uri;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class y<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f235740b;

    public y(t tVar) {
        this.f235740b = tVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        final t tVar = this.f235740b;
        tVar.getClass();
        final l0.h hVar = new l0.h();
        AbstractC41768a abstractC41768aO = tVar.f235710L.a((Uri) obj).o(new w(hVar, tVar));
        InterfaceC35745a5 interfaceC35745a5 = tVar.f235712N;
        tVar.f235715Q.b(abstractC41768aO.x(interfaceC35745a5.a()).q(interfaceC35745a5.e()).v(new InterfaceC43543a() { // from class: com.avito.android.publish.file_uploader.s
            /* JADX WARN: Multi-variable type inference failed */
            @Override // l41.InterfaceC43543a
            public final void run() {
                FileUploaderParameter.Widget.Config config;
                FileUploadApiConfig api;
                C40408a c40408a = (C40408a) hVar.f406842b;
                if (c40408a != null) {
                    t tVar2 = tVar;
                    FileUploaderParameter.Widget widget = tVar2.ne().getWidget();
                    FileUploadApiValue upload = (widget == null || (config = widget.getConfig()) == null || (api = config.getApi()) == null) ? null : api.getUpload();
                    String path = upload != null ? upload.getPath() : null;
                    String defaultErrorMessage = upload != null ? upload.getDefaultErrorMessage() : null;
                    if (path == null || defaultErrorMessage == null) {
                        tVar2.qe(path == null ? "uploadPath" : "errorMessage");
                        return;
                    }
                    io.reactivex.rxjava3.core.z zVarQ = io.reactivex.rxjava3.core.z.q(io.reactivex.rxjava3.core.z.c0(new InterfaceC40409b.c.C11164b(c40408a)), tVar2.f235710L.b(c40408a, defaultErrorMessage, path));
                    InterfaceC35745a5 interfaceC35745a52 = tVar2.f235712N;
                    tVar2.f235715Q.b(zVarQ.x0(interfaceC35745a52.a()).j0(interfaceC35745a52.e()).v0(new z(tVar2), new A(tVar2, c40408a, defaultErrorMessage), io.reactivex.rxjava3.internal.functions.a.f401993c));
                }
            }
        }, new x(tVar)));
    }
}
