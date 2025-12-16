package com.avito.android.beduin.common.component.file_uploader;

import androidx.compose.runtime.C22026a;
import com.avito.android.beduin.common.component.file_uploader.FileState;
import com.avito.android.beduin.common.component.file_uploader.file.FileItem;
import com.avito.android.beduin.common.component.file_uploader.x;
import com.avito.android.beduin.common.form.transforms.ErrorMessageTransform;
import com.avito.android.beduin.common.form.transforms.FilesTransform;
import com.avito.android.beduin.common.form.transforms.ShowErrorMessageTransform;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.di.B;
import com.avito.android.util.InterfaceC35745a5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import ji.InterfaceC42385a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import lj.InterfaceC43779a;

/* compiled from: BeduinFileUploaderViewModel.kt */
@B
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/component/file_uploader/n;", "Lji/a;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class n implements InterfaceC42385a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.beduin.common.form.store.b f101302a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f101303b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.beduin.common.component.file_uploader.data.g f101304c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f101305d = new LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f101306e = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: BeduinFileUploaderViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/file_uploader/n$a;", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f101307a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f101308b;

        public a(@Y61.k String str, @Y61.k String str2) {
            this.f101307a = str;
            this.f101308b = str2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f101307a, aVar.f101307a) && L.f(this.f101308b, aVar.f101308b);
        }

        public final int hashCode() {
            return this.f101308b.hashCode() + (this.f101307a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ModelKey(formId=");
            sb2.append(this.f101307a);
            sb2.append(", modelId=");
            return C22026a.c(sb2, this.f101308b, ')');
        }
    }

    @Inject
    public n(@Y61.k com.avito.android.beduin.common.form.store.b bVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.beduin.common.component.file_uploader.data.g gVar) {
        this.f101302a = bVar;
        this.f101303b = interfaceC35745a5;
        this.f101304c = gVar;
    }

    public static final void a(n nVar, a aVar, x xVar) {
        nVar.getClass();
        boolean z12 = xVar instanceof x.c;
        String str = aVar.f101308b;
        String str2 = aVar.f101307a;
        com.avito.android.beduin.common.form.store.b bVar = nVar.f101302a;
        if (z12) {
            x.c cVar = (x.c) xVar;
            BeduinFileUploaderModel beduinFileUploaderModelC = nVar.c(aVar);
            if (beduinFileUploaderModelC == null) {
                return;
            }
            List<FileItem> files = beduinFileUploaderModelC.getFiles();
            if (files == null) {
                files = C42784z0.f406748b;
            }
            com.avito.android.beduin.common.component.file_uploader.validation.a aVar2 = cVar.f101358a;
            ArrayList arrayListI0 = C42745f0.i0(new FileItem(aVar2.f101333b, aVar2.f101335d, aVar2.f101334c, d(cVar), Boolean.FALSE), files);
            InterfaceC43779a interfaceC43779a = bVar.get(str2);
            if (interfaceC43779a != null) {
                com.avito.android.beduin_shared.model.utils.j.a(interfaceC43779a, str, new FilesTransform(arrayListI0), new ErrorMessageTransform(null), new ShowErrorMessageTransform(false));
                return;
            }
            return;
        }
        if (xVar instanceof x.d) {
            x.d dVar = (x.d) xVar;
            BeduinFileUploaderModel beduinFileUploaderModelC2 = nVar.c(aVar);
            if (beduinFileUploaderModelC2 == null) {
                return;
            }
            List<FileItem> files2 = beduinFileUploaderModelC2.getFiles();
            if (files2 == null) {
                files2 = C42784z0.f406748b;
            }
            List<FileItem> list = files2;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            for (FileItem fileItemCopy$default : list) {
                if (L.f(fileItemCopy$default.getF84934b(), dVar.f101362a)) {
                    fileItemCopy$default = FileItem.copy$default(fileItemCopy$default, null, null, 0L, d(dVar), null, 23, null);
                }
                arrayList.add(fileItemCopy$default);
            }
            InterfaceC43779a interfaceC43779a2 = bVar.get(str2);
            if (interfaceC43779a2 != null) {
                com.avito.android.beduin_shared.model.utils.j.a(interfaceC43779a2, str, new FilesTransform(arrayList), new ErrorMessageTransform(null), new ShowErrorMessageTransform(false));
                return;
            }
            return;
        }
        if (xVar instanceof x.a.b) {
            x.a.b bVar2 = (x.a.b) xVar;
            BeduinFileUploaderModel beduinFileUploaderModelC3 = nVar.c(aVar);
            if (beduinFileUploaderModelC3 == null) {
                return;
            }
            List<FileItem> files3 = beduinFileUploaderModelC3.getFiles();
            if (files3 == null) {
                files3 = C42784z0.f406748b;
            }
            List<FileItem> list2 = files3;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list2, 10));
            for (FileItem fileItemCopy$default2 : list2) {
                if (L.f(fileItemCopy$default2.getF84934b(), bVar2.f101352a)) {
                    fileItemCopy$default2 = FileItem.copy$default(fileItemCopy$default2, bVar2.f101355c.getId(), null, 0L, d(bVar2), Boolean.TRUE, 6, null);
                }
                arrayList2.add(fileItemCopy$default2);
            }
            InterfaceC43779a interfaceC43779a3 = bVar.get(str2);
            if (interfaceC43779a3 != null) {
                com.avito.android.beduin_shared.model.utils.j.a(interfaceC43779a3, str, new FilesTransform(arrayList2), new ErrorMessageTransform(null), new ShowErrorMessageTransform(false));
                return;
            }
            return;
        }
        if (xVar instanceof x.a.C3038a) {
            nVar.b(aVar, ((x.a.C3038a) xVar).f101352a);
            return;
        }
        if (xVar instanceof x.b) {
            x.b bVar3 = (x.b) xVar;
            BeduinFileUploaderModel beduinFileUploaderModelC4 = nVar.c(aVar);
            if (beduinFileUploaderModelC4 == null) {
                return;
            }
            List<FileItem> files4 = beduinFileUploaderModelC4.getFiles();
            if (files4 == null) {
                files4 = C42784z0.f406748b;
            }
            List<FileItem> list3 = files4;
            ArrayList arrayList3 = new ArrayList(C42745f0.q(list3, 10));
            for (FileItem fileItemCopy$default3 : list3) {
                if (L.f(fileItemCopy$default3.getF84934b(), bVar3.f101356a)) {
                    fileItemCopy$default3 = FileItem.copy$default(fileItemCopy$default3, bVar3.f101356a, null, 0L, d(bVar3), null, 22, null);
                }
                arrayList3.add(fileItemCopy$default3);
            }
            InterfaceC43779a interfaceC43779a4 = bVar.get(str2);
            if (interfaceC43779a4 != null) {
                com.avito.android.beduin_shared.model.utils.j.a(interfaceC43779a4, str, new FilesTransform(arrayList3), new ErrorMessageTransform(null), new ShowErrorMessageTransform(false));
            }
        }
    }

    public static FileState d(x xVar) {
        if (xVar instanceof x.c.a) {
            return new FileState.Error(((x.c.a) xVar).f101360c);
        }
        if (xVar instanceof x.c.b) {
            return new FileState.Loading(0.0f);
        }
        if (xVar instanceof x.d.b) {
            return new FileState.Loading(((x.d.b) xVar).f101365c);
        }
        if (xVar instanceof x.d.a) {
            return FileState.Deleting.f101208b;
        }
        if (xVar instanceof x.a.b) {
            return FileState.Idle.f101210b;
        }
        if (xVar instanceof x.a.C3038a) {
            return FileState.Idle.f101210b;
        }
        if (xVar instanceof x.b) {
            return new FileState.Error(((x.b) xVar).f101357b);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void b(a aVar, String str) {
        io.reactivex.rxjava3.disposables.d dVar = (io.reactivex.rxjava3.disposables.d) this.f101305d.remove(str);
        if (dVar != null) {
            dVar.dispose();
        }
        BeduinFileUploaderModel beduinFileUploaderModelC = c(aVar);
        if (beduinFileUploaderModelC == null) {
            return;
        }
        List<FileItem> files = beduinFileUploaderModelC.getFiles();
        if (files == null) {
            files = C42784z0.f406748b;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : files) {
            if (!L.f(((FileItem) obj).getF84934b(), str)) {
                arrayList.add(obj);
            }
        }
        InterfaceC43779a interfaceC43779a = this.f101302a.get(aVar.f101307a);
        if (interfaceC43779a != null) {
            com.avito.android.beduin_shared.model.utils.j.a(interfaceC43779a, aVar.f101308b, new FilesTransform(arrayList), new ErrorMessageTransform(null), new ShowErrorMessageTransform(false));
        }
    }

    public final BeduinFileUploaderModel c(a aVar) {
        InterfaceC43779a interfaceC43779a = this.f101302a.get(aVar.f101307a);
        BeduinModel beduinModelB = interfaceC43779a != null ? interfaceC43779a.b(aVar.f101308b) : null;
        if (beduinModelB instanceof BeduinFileUploaderModel) {
            return (BeduinFileUploaderModel) beduinModelB;
        }
        return null;
    }

    @Override // ji.InterfaceC42385a
    public final void onCleared() {
        Iterator it = this.f101305d.entrySet().iterator();
        while (it.hasNext()) {
            ((io.reactivex.rxjava3.disposables.d) ((Map.Entry) it.next()).getValue()).dispose();
        }
        this.f101306e.e();
    }
}
