package com.avito.android.beduin.common.component.file_uploader;

import com.avito.android.beduin.common.component.file_uploader.file.FileItem;
import com.avito.android.beduin_models.BeduinModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import oj.InterfaceC44784a;

/* compiled from: FileUploaderExtractionStrategy.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/file_uploader/v;", "Loj/a;", "Lcom/avito/android/beduin/common/component/file_uploader/BeduinFileUploaderModel;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class v implements InterfaceC44784a<BeduinFileUploaderModel> {
    @Inject
    public v() {
    }

    @Override // oj.InterfaceC44784a
    public final Map m(BeduinModel beduinModel) {
        BeduinFileUploaderModel beduinFileUploaderModel = (BeduinFileUploaderModel) beduinModel;
        String id2 = beduinFileUploaderModel.getId();
        List<FileItem> files = beduinFileUploaderModel.getFiles();
        if (files == null) {
            files = C42784z0.f406748b;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : files) {
            if (((FileItem) obj).isUploaded()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((FileItem) it.next()).getF86717b());
        }
        return Collections.singletonMap(id2, arrayList2);
    }
}
