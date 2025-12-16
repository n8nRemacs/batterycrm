package com.avito.android.beduin.common.component.file_uploader;

import com.avito.android.beduin.common.component.file_uploader.ApiConfiguration;
import com.avito.android.beduin.common.component.file_uploader.FileState;
import com.avito.android.beduin.common.component.file_uploader.file.FileItem;
import com.avito.android.beduin.common.component.file_uploader.n;
import com.avito.android.beduin.common.component.file_uploader.x;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.core.z;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: BeduinFileUploaderComponent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/file_uploader/file/FileItem;", "file", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/beduin/common/component/file_uploader/file/FileItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class d extends N implements Y41.l<FileItem, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f101234l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar) {
        super(1);
        this.f101234l = bVar;
    }

    @Override // Y41.l
    public final G0 invoke(FileItem fileItem) {
        Object next;
        FileItem fileItem2 = fileItem;
        b bVar = this.f101234l;
        String f103350r = bVar.f101229g.getF103350r();
        String f100853b = bVar.f101231i.getId();
        String f281526b = fileItem2.getF76517c();
        boolean zIsUploaded = fileItem2.isUploaded();
        n nVar = bVar.f101230h;
        nVar.getClass();
        n.a aVar = new n.a(f103350r, f100853b);
        BeduinFileUploaderModel beduinFileUploaderModelC = nVar.c(aVar);
        if (beduinFileUploaderModelC != null) {
            List<FileItem> files = beduinFileUploaderModelC.getFiles();
            FileState state = null;
            if (files != null) {
                Iterator<T> it = files.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (L.f(((FileItem) next).getF76517c(), f281526b)) {
                        break;
                    }
                }
                FileItem fileItem3 = (FileItem) next;
                if (fileItem3 != null) {
                    state = fileItem3.getState();
                }
            }
            if (!(state instanceof FileState.Deleting)) {
                if (zIsUploaded) {
                    BeduinFileUploaderModel beduinFileUploaderModelC2 = nVar.c(aVar);
                    if (beduinFileUploaderModelC2 != null) {
                        ApiConfiguration.Config remove = beduinFileUploaderModelC2.getApiConfiguration().getRemove();
                        String path = remove.getPath();
                        String errorMessage = remove.getErrorMessage();
                        ApiConfiguration.Config.INSTANCE.getClass();
                        ApiConfiguration.HttpMethod httpMethod = remove._method;
                        if (httpMethod == null) {
                            httpMethod = ApiConfiguration.HttpMethod.POST;
                        }
                        ApiConfiguration.HttpMethod httpMethod2 = httpMethod;
                        Map<String, String> params = remove.getParams();
                        if (params == null) {
                            params = P0.c();
                        }
                        z zVarQ = z.q(z.c0(new x.d.a(f281526b)), nVar.f101304c.a(path, httpMethod2, f281526b, params, errorMessage).F());
                        InterfaceC35745a5 interfaceC35745a5 = nVar.f101303b;
                        nVar.f101306e.b(zVarQ.x0(interfaceC35745a5.a()).j0(interfaceC35745a5.e()).v0(new o(nVar, aVar), new p(nVar, aVar, f281526b, errorMessage), io.reactivex.rxjava3.internal.functions.a.f401993c));
                    }
                } else {
                    nVar.b(aVar, f281526b);
                }
            }
        }
        return G0.f406611a;
    }
}
