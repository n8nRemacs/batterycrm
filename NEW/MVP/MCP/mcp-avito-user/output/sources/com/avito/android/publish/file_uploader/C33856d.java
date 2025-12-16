package com.avito.android.publish.file_uploader;

import com.avito.android.remote.model.file_uploader.FileDeleteResult;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: FileUploaderInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/remote/model/file_uploader/FileDeleteResult;", "response", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.publish.file_uploader.d, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C33856d<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f235680b;

    public C33856d(String str) {
        this.f235680b = str;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        FileDeleteResult fileDeleteResult = (FileDeleteResult) obj;
        if (fileDeleteResult instanceof FileDeleteResult.Success) {
            return ((FileDeleteResult.Success) fileDeleteResult).isDeleted() ? fileDeleteResult : new FileDeleteResult.Error(this.f235680b);
        }
        if (fileDeleteResult instanceof FileDeleteResult.Error) {
            return fileDeleteResult;
        }
        throw new NoWhenBranchMatchedException();
    }
}
