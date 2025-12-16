package com.avito.android.messenger.conversation.mvi.file_attachment;

import android.net.Uri;
import com.avito.android.remote.model.messenger.attach_menu.AttachMenuItem;
import io.reactivex.rxjava3.internal.operators.single.W;
import kotlin.Metadata;

/* compiled from: FileAttachmentInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_attachment/a;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface a {

    /* compiled from: FileAttachmentInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.file_attachment.a$a, reason: collision with other inner class name */
    public static final class C5643a {
    }

    @Y61.k
    String[] a(@Y61.k AttachMenuItem.File file);

    @Y61.k
    W b(@Y61.k Uri uri, boolean z12, long j12, long j13, @Y61.l String str);

    @Y61.k
    W c(@Y61.k Uri uri, long j12);
}
