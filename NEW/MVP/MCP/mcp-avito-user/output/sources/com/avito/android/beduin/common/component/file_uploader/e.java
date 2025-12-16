package com.avito.android.beduin.common.component.file_uploader;

import com.avito.android.beduin.common.component.file_uploader.b;
import com.avito.android.util.O2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BeduinFileUploaderComponent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/file_uploader/FileUploaderModelChanged;", "payload", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/beduin/common/component/file_uploader/FileUploaderModelChanged;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class e extends N implements Y41.l<FileUploaderModelChanged, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k f101266l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b f101267m;

    /* compiled from: BeduinFileUploaderComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[FileUploaderModelChanged.values().length];
            try {
                iArr[FileUploaderModelChanged.f101212c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FileUploaderModelChanged.f101213d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FileUploaderModelChanged.f101214e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FileUploaderModelChanged.f101215f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(k kVar, b bVar) {
        super(1);
        this.f101266l = kVar;
        this.f101267m = bVar;
    }

    @Override // Y41.l
    public final G0 invoke(FileUploaderModelChanged fileUploaderModelChanged) {
        int iOrdinal = fileUploaderModelChanged.ordinal();
        k kVar = this.f101266l;
        b bVar = this.f101267m;
        if (iOrdinal == 0) {
            kVar.setEnabled(bVar.f101227e.getButtonConfiguration().isEnabled());
        } else if (iOrdinal == 1) {
            kVar.setErrorMessage(bVar.f101227e.getErrorMessage());
        } else if (iOrdinal == 2) {
            b.a aVar = b.f101224k;
            bVar.getClass();
            kVar.setOnUploadClickListener(new c(bVar));
        } else if (iOrdinal == 3) {
            b.a aVar2 = b.f101224k;
            bVar.getClass();
            com.avito.konveyor.adapter.d listAdapter = kVar.getListAdapter();
            BeduinFileUploaderModel beduinFileUploaderModel = bVar.f101227e;
            listAdapter.l(beduinFileUploaderModel.getFiles(), null);
            kVar.setFilesVisibility(O2.a(beduinFileUploaderModel.getFiles()));
        }
        return G0.f406611a;
    }
}
