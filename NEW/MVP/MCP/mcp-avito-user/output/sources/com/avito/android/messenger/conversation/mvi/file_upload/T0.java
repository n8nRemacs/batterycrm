package com.avito.android.messenger.conversation.mvi.file_upload;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import java.io.File;
import kotlin.Metadata;

/* compiled from: VideoUploadInteractor.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Larrow/core/Y0;", "Lcom/avito/android/messenger/conversation/mvi/file_attachment/m;", "optionalInfo", "Lcom/avito/android/messenger/conversation/mvi/file_upload/r0;", "apply", "(Larrow/core/Y0;)Lcom/avito/android/messenger/conversation/mvi/file_upload/r0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class T0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C32104x0 f191093b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ File f191094c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f191095d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f191096e;

    public T0(long j12, long j13, C32104x0 c32104x0, File file) {
        this.f191093b = c32104x0;
        this.f191094c = file;
        this.f191095d = j12;
        this.f191096e = j13;
    }

    @Override // l41.o
    public final Object apply(Object obj) throws SecurityException, IllegalArgumentException {
        String strF;
        com.avito.android.messenger.conversation.mvi.file_attachment.m mVar = (com.avito.android.messenger.conversation.mvi.file_attachment.m) arrow.core.Z0.a((arrow.core.Y0) obj, S0.f191092l);
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        C32104x0 c32104x0 = this.f191093b;
        Context context = c32104x0.f191329h;
        File file = this.f191094c;
        mediaMetadataRetriever.setDataSource(context, Uri.fromFile(file));
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
        String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
        String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(12);
        String strI = (strExtractMetadata == null || strExtractMetadata2 == null) ? null : androidx.compose.foundation.H.i('x', strExtractMetadata, strExtractMetadata2);
        com.avito.android.messenger.conversation.mvi.file_attachment.n nVar = c32104x0.f191323b;
        String strQ = strExtractMetadata3 != null ? nVar.q(strExtractMetadata3) : null;
        String str = mVar != null ? mVar.f190719a : null;
        if (strExtractMetadata3 == null) {
            strF = mVar != null ? mVar.f190720b : null;
            if (strF == null) {
                strF = nVar.f(file.getName(), null);
            }
        } else {
            strF = strExtractMetadata3;
        }
        return new C32092r0(file, str, strI, strF, strQ, this.f191095d, this.f191096e);
    }
}
