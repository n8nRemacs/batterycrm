package com.avito.android.profile.edit.avatar;

import java.io.File;
import kotlin.Metadata;
import l41.o;

/* compiled from: AvatarInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lokhttp3/MultipartBody$Part;", "it", "Ljava/io/File;", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final class e<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public static final e<T, R> f222059b = new e<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        return com.avito.http.b.a((File) obj, 3);
    }
}
