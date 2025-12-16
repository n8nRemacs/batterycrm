package com.avito.android.messenger.conversation.mvi.file_upload;

import com.avito.android.util.V2;
import kotlin.Metadata;

/* compiled from: MessengerVoiceFileUploadCanceller.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isDeleted", "Lkotlin/G0;", "accept", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.file_upload.m0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32083m0<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f191194b;

    public C32083m0(String str) {
        this.f191194b = str;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        V2 v22 = V2.f318762a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(zBooleanValue ? "Successfully deleted" : "Failed to delete");
        sb2.append(" file ");
        sb2.append(this.f191194b);
        v22.c("MessengerVoiceFileUploadCanceller", sb2.toString(), null);
    }
}
