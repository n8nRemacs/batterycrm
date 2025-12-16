package com.avito.android.beduin.common.component.file_uploader.file;

import androidx.recyclerview.widget.C23424o;
import com.avito.android.beduin.common.component.file_uploader.FileState;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: FileItemDiffUtilCallback.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/file_uploader/file/b;", "Landroidx/recyclerview/widget/o$f;", "LTV0/a;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b extends C23424o.f<TV0.a> {
    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean a(TV0.a aVar, TV0.a aVar2) {
        return aVar.equals(aVar2);
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean b(TV0.a aVar, TV0.a aVar2) {
        TV0.a aVar3 = aVar;
        TV0.a aVar4 = aVar2;
        return aVar3.getF85686c() == aVar4.getF85686c() && aVar3.getClass().equals(aVar4.getClass());
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final Object c(TV0.a aVar, TV0.a aVar2) {
        TV0.a aVar3 = aVar;
        TV0.a aVar4 = aVar2;
        if (!(aVar3 instanceof FileItem) || !(aVar4 instanceof FileItem)) {
            return null;
        }
        FileItem fileItem = (FileItem) aVar4;
        String name = fileItem.getName();
        FileItem fileItem2 = (FileItem) aVar3;
        if (L.f(fileItem2.getName(), fileItem.getName())) {
            name = null;
        }
        Long lValueOf = Long.valueOf(fileItem.getSize());
        if (fileItem2.getSize() == fileItem.getSize()) {
            lValueOf = null;
        }
        FileState state = fileItem.getState();
        if (L.f(fileItem2.getState(), fileItem.getState())) {
            state = null;
        }
        c cVar = new c(name, lValueOf, state);
        if (name == null && lValueOf == null && state == null) {
            return null;
        }
        return cVar;
    }
}
