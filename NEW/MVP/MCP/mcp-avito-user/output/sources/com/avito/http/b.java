package com.avito.http;

import X41.i;
import Y61.k;
import java.io.File;
import kotlin.Metadata;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/* compiled from: Files.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"okhttp"}, k = 2, mv = {1, 9, 0}, xi = 48)
@i
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final MediaType f338477a = MediaType.INSTANCE.get("image/*");

    public static MultipartBody.Part a(File file, int i12) {
        return MultipartBody.Part.INSTANCE.createFormData((i12 & 1) != 0 ? "image" : "file", "image", RequestBody.INSTANCE.create(file, f338477a));
    }
}
