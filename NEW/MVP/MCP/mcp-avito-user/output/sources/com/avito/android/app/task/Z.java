package com.avito.android.app.task;

import com.avito.android.photo_cache.PhotoUpload;
import com.avito.android.remote.model.ErrorType;
import java.util.concurrent.Callable;
import kotlin.Metadata;

/* compiled from: LocalMessageSender.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "call", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class Z<V> implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C28587q0 f91558b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PhotoUpload f91559c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f91560d;

    public Z(C28587q0 c28587q0, PhotoUpload photoUpload, String str) {
        this.f91558b = c28587q0;
        this.f91559c = photoUpload;
        this.f91560d = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        PhotoUpload photoUpload = this.f91559c;
        if (photoUpload.f216304f != null || !(photoUpload.f216307i instanceof ErrorType.NoError)) {
            this.f91558b.f91696f.h(this.f91560d, PhotoUpload.a(photoUpload, null, null, ErrorType.NoError.INSTANCE, null, null, null, 3951));
        }
        return kotlin.G0.f406611a;
    }
}
