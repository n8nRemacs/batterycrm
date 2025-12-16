package ru.mts.biometry.api.utils;

import Y61.k;
import java.io.File;
import kotlin.Metadata;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/* compiled from: ImageUtils.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"api_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class d {
    @k
    public static final MultipartBody.Part a(@k File file) {
        return MultipartBody.Part.INSTANCE.createFormData("files", file.getName(), RequestBody.INSTANCE.create(file, MediaType.INSTANCE.parse("image/jpeg")));
    }
}
