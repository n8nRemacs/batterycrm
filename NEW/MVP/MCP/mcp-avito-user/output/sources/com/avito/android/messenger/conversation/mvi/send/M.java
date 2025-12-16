package com.avito.android.messenger.conversation.mvi.send;

import android.net.Uri;
import com.avito.android.messenger.conversation.mvi.send.SendMessagePresenter;
import java.io.File;
import kotlin.Metadata;

/* compiled from: SendMessagePresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Larrow/core/Y0;", "Landroid/net/Uri;", "uriOption", "Lkotlin/G0;", "accept", "(Larrow/core/Y0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class M<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ D f194289b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ File f194290c;

    public M(D d12, File file) {
        this.f194289b = d12;
        this.f194290c = file;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Uri uri = (Uri) ((arrow.core.Y0) obj).c();
        if (uri != null) {
            this.f194289b.f194191I0.postValue(new SendMessagePresenter.RecordingVideoFileReference(uri, this.f194290c.getPath()));
        }
    }
}
