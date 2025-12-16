package com.avito.android.photo_picker.legacy.service;

import com.avito.android.photo_cache.PhotoUpload;
import java.io.File;
import kotlin.Metadata;
import l41.o;

/* compiled from: ImageUploadServiceDelegate.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/io/File;", "file", "Lio/reactivex/rxjava3/core/E;", "", "apply", "(Ljava/io/File;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class e<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f219864b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PhotoUpload f219865c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f219866d;

    public e(PhotoUpload photoUpload, d dVar, String str) {
        this.f219864b = dVar;
        this.f219865c = photoUpload;
        this.f219866d = str;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        return this.f219864b.f219854b.a(this.f219865c.f216301c).a((File) obj, this.f219866d).F();
    }
}
