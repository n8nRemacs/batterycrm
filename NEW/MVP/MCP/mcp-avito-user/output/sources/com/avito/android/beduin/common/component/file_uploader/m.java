package com.avito.android.beduin.common.component.file_uploader;

import com.avito.android.beduin.common.component.file_uploader.file.FileItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BeduinFileUploaderView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/file_uploader/file/FileItem;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/beduin/common/component/file_uploader/file/FileItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class m extends N implements Y41.l<FileItem, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k f101301l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(k kVar) {
        super(1);
        this.f101301l = kVar;
    }

    @Override // Y41.l
    public final G0 invoke(FileItem fileItem) {
        FileItem fileItem2 = fileItem;
        Y41.l<? super FileItem, G0> lVar = this.f101301l.f101297f;
        if (lVar != null) {
            lVar.invoke(fileItem2);
        }
        return G0.f406611a;
    }
}
