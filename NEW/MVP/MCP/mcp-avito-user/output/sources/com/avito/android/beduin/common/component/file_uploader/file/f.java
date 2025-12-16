package com.avito.android.beduin.common.component.file_uploader.file;

import Y41.l;
import Y61.k;
import com.avito.android.R;
import com.avito.android.beduin.common.component.BeduinComponentTheme;
import com.avito.android.beduin.common.component.file_uploader.FileState;
import com.avito.android.beduin.common.component.file_uploader.u;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: FileItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/file_uploader/file/f;", "LTV0/f;", "Lcom/avito/android/beduin/common/component/file_uploader/file/g;", "Lcom/avito/android/beduin/common/component/file_uploader/file/FileItem;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f implements TV0.f<g, FileItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Y41.a<u> f101279b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final l<FileItem, G0> f101280c;

    /* JADX WARN: Multi-variable type inference failed */
    public f(@k Y41.a<u> aVar, @k l<? super FileItem, G0> lVar) {
        this.f101279b = aVar;
        this.f101280c = lVar;
    }

    public static void O(g gVar, FileState fileState, boolean z12, u uVar) {
        boolean zF2 = L.f(fileState, FileState.Idle.f101210b);
        int i12 = R.attr.black;
        if (zF2) {
            gVar.Mj(R.attr.black);
            gVar.J3(false);
            gVar.dA(false);
            return;
        }
        if (fileState instanceof FileState.Error) {
            if (!z12) {
                i12 = R.attr.gray54;
            }
            gVar.Mj(i12);
            gVar.hR(((FileState.Error) fileState).f101209b, uVar.f101331d, uVar.f101328a);
            gVar.J3(false);
            gVar.dA(true);
            return;
        }
        if (fileState instanceof FileState.Loading) {
            gVar.Mj(R.attr.gray54);
            gVar.n5(((FileState.Loading) fileState).f101211b);
            gVar.J3(true);
            gVar.dA(false);
            return;
        }
        if (!(fileState instanceof FileState.Deleting)) {
            throw new NoWhenBranchMatchedException();
        }
        gVar.Mj(R.attr.gray54);
        gVar.J3(false);
        gVar.dA(false);
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((g) eVar, (FileItem) aVar);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        g gVar = (g) eVar;
        FileItem fileItem = (FileItem) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof c) {
                obj = obj2;
            }
        }
        c cVar = (c) (obj instanceof c ? obj : null);
        u uVarInvoke = this.f101279b.invoke();
        if (uVarInvoke == null) {
            return;
        }
        if (cVar == null) {
            k(gVar, fileItem);
            return;
        }
        gVar.L5(new e(this, fileItem));
        BeduinComponentTheme beduinComponentTheme = uVarInvoke.f101328a;
        String str = cVar.f101272a;
        if (str != null) {
            gVar.A30(str, uVarInvoke.f101329b, beduinComponentTheme);
        }
        Long l12 = cVar.f101273b;
        if (l12 != null) {
            gVar.JK(l12.longValue(), uVarInvoke.f101330c, beduinComponentTheme);
        }
        FileState fileState = cVar.f101274c;
        if (fileState != null) {
            O(gVar, fileState, fileItem.isUploaded(), uVarInvoke);
        }
    }

    public final void k(@k g gVar, @k FileItem fileItem) {
        u uVarInvoke = this.f101279b.invoke();
        if (uVarInvoke == null) {
            return;
        }
        gVar.L5(new d(this, fileItem));
        String name = fileItem.getName();
        String str = uVarInvoke.f101329b;
        BeduinComponentTheme beduinComponentTheme = uVarInvoke.f101328a;
        gVar.A30(name, str, beduinComponentTheme);
        gVar.JK(fileItem.getSize(), uVarInvoke.f101330c, beduinComponentTheme);
        O(gVar, fileItem.getState(), fileItem.isUploaded(), uVarInvoke);
    }
}
