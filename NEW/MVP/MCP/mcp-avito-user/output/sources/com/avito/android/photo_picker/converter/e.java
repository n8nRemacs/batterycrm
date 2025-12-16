package com.avito.android.photo_picker.converter;

import Ag.CallableC13028a;
import Y61.k;
import android.content.ContentResolver;
import android.net.Uri;
import com.avito.android.photo_storage.i;
import io.reactivex.rxjava3.core.z;
import java.io.File;
import kotlin.Metadata;

/* compiled from: SimpleUploadConverter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/converter/e;", "Lcom/avito/android/photo_picker/converter/f;", "_avito_photo-conversion_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e implements f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ContentResolver f219322a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final i f219323b;

    public e(@k ContentResolver contentResolver, @k i iVar) {
        this.f219322a = contentResolver;
        this.f219323b = iVar;
    }

    @Override // com.avito.android.photo_picker.converter.f
    @k
    public final z<File> a(@k Uri uri) {
        return z.W(new CallableC13028a(25, uri, this));
    }
}
