package com.avito.android.messenger.conversation.mvi.file_upload;

import com.avito.android.util.V2;
import kotlin.Metadata;

/* compiled from: FileUploadInitializer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isDeleted", "Lkotlin/G0;", "accept", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.file_upload.e, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32066e<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public static final C32066e<T> f191141b = new C32066e<>();

    @Override // l41.g
    public final void accept(Object obj) {
        V2.f318762a.c("FileUploadInitializerImpl", "Attachment cache is ".concat(((Boolean) obj).booleanValue() ? "successfully cleared" : "NOT cleared"), null);
    }
}
