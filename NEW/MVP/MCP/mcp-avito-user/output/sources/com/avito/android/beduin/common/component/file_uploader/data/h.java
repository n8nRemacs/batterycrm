package com.avito.android.beduin.common.component.file_uploader.data;

import com.avito.android.beduin.common.component.file_uploader.x;
import com.avito.android.remote.model.file_uploader.FileDeleteResult;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: FileUploaderInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/file_uploader/FileDeleteResult;", "response", "Lcom/avito/android/beduin/common/component/file_uploader/x;", "apply", "(Lcom/avito/android/remote/model/file_uploader/FileDeleteResult;)Lcom/avito/android/beduin/common/component/file_uploader/x;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class h<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f101250b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f101251c;

    public h(String str, String str2) {
        this.f101250b = str;
        this.f101251c = str2;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        FileDeleteResult fileDeleteResult = (FileDeleteResult) obj;
        boolean z12 = fileDeleteResult instanceof FileDeleteResult.Success;
        String str = this.f101251c;
        String str2 = this.f101250b;
        if (z12) {
            return ((FileDeleteResult.Success) fileDeleteResult).isDeleted() ? new x.a.C3038a(str2) : new x.b(str2, str);
        }
        if (fileDeleteResult instanceof FileDeleteResult.Error) {
            return new x.b(str2, str);
        }
        throw new NoWhenBranchMatchedException();
    }
}
