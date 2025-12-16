package com.avito.android.messenger.conversation.mvi.file_upload;

import com.avito.android.persistence.messenger.Q1;
import com.avito.android.util.V2;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: MessengerVideoUploadCanceller.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.file_upload.h0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32073h0<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f191172b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f191173c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f191174d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Q1 f191175e;

    public C32073h0(MessengerUserHashInfo messengerUserHashInfo, String str, String str2, Q1 q12) {
        this.f191172b = messengerUserHashInfo;
        this.f191173c = str;
        this.f191174d = str2;
        this.f191175e = q12;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        V2.f318762a.a("MessengerVideoUploadCanceller", "cancelUpload() failed for " + com.avito.android.messenger.util.i.b(this.f191172b, new kotlin.Q[0]) + ", channelId=" + this.f191173c + ", localMessageId=" + this.f191174d + ", metaInfo=" + this.f191175e, (Throwable) obj);
    }
}
