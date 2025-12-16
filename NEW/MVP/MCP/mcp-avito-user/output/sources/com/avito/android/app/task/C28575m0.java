package com.avito.android.app.task;

import com.avito.android.photo_cache.PhotoUpload;
import com.avito.android.remote.model.ErrorType;
import kotlin.Metadata;

/* compiled from: LocalMessageSender.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/photo_cache/PhotoUpload;", "test"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.app.task.m0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
final class C28575m0<T> implements l41.r {
    @Override // l41.r
    public final boolean test(Object obj) {
        PhotoUpload photoUpload = (PhotoUpload) obj;
        return (photoUpload.f216304f == null && (photoUpload.f216307i instanceof ErrorType.NoError)) ? false : true;
    }
}
