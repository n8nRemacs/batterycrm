package com.avito.android.beduin.common.component.file_uploader.data;

import com.avito.android.error.z;
import com.avito.android.util.P2;
import io.reactivex.rxjava3.core.I;
import kotlin.Metadata;

/* compiled from: FileUploaderInteractor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "it", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/util/P2;", "Lcom/avito/android/remote/model/file_uploader/FileUploadResult;", "apply", "(Ljava/lang/Throwable;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class k<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final k<T, R> f101256b = new k<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        return I.q(new P2.a(z.n((Throwable) obj)));
    }
}
