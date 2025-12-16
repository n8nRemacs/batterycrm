package com.avito.android.messenger.conversation.mvi.file_attachment;

import com.avito.android.messenger.conversation.mvi.file_attachment.FileAttachmentException;
import io.reactivex.rxjava3.core.I;
import kotlin.Metadata;

/* compiled from: FileAttachmentInteractor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "t", "Lio/reactivex/rxjava3/core/O;", "Larrow/core/Y0;", "Lcom/avito/android/messenger/conversation/mvi/file_attachment/m;", "apply", "(Ljava/lang/Throwable;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class i<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final i<T, R> f190714b = new i<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        return I.l(new FileAttachmentException.ReadFileInfoException((Throwable) obj, null));
    }
}
