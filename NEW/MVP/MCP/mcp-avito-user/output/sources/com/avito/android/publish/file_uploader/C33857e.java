package com.avito.android.publish.file_uploader;

import com.avito.android.remote.model.file_uploader.FileDeleteResult;
import fe0.InterfaceC40409b;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: FileUploaderInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/file_uploader/FileDeleteResult;", "result", "Lfe0/b;", "apply", "(Lcom/avito/android/remote/model/file_uploader/FileDeleteResult;)Lfe0/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.publish.file_uploader.e, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C33857e<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f235681b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f235682c;

    public C33857e(String str, String str2) {
        this.f235681b = str;
        this.f235682c = str2;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        FileDeleteResult fileDeleteResult = (FileDeleteResult) obj;
        boolean z12 = fileDeleteResult instanceof FileDeleteResult.Error;
        String str = this.f235681b;
        if (z12) {
            return new InterfaceC40409b.C11163b(str, this.f235682c);
        }
        if (fileDeleteResult instanceof FileDeleteResult.Success) {
            return new InterfaceC40409b.a(str);
        }
        throw new NoWhenBranchMatchedException();
    }
}
