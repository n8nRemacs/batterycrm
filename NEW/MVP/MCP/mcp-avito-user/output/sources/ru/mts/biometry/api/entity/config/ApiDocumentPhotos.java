package ru.mts.biometry.api.entity.config;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: ApiDocumentPhotos.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/mts/biometry/api/entity/config/ApiDocumentPhotos;", "", "", "hologramsCheck", "", "hologramsCheckPhotoCount", "<init>", "(ZI)V", "Z", "a", "()Z", "I", "b", "()I", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ApiDocumentPhotos {

    @c("hologramsCheck")
    private final boolean hologramsCheck;

    @c("hologramsCheckPhotoCount")
    private final int hologramsCheckPhotoCount;

    public ApiDocumentPhotos(boolean z12, int i12) {
        this.hologramsCheck = z12;
        this.hologramsCheckPhotoCount = i12;
    }

    /* renamed from: a, reason: from getter */
    public final boolean getHologramsCheck() {
        return this.hologramsCheck;
    }

    /* renamed from: b, reason: from getter */
    public final int getHologramsCheckPhotoCount() {
        return this.hologramsCheckPhotoCount;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiDocumentPhotos)) {
            return false;
        }
        ApiDocumentPhotos apiDocumentPhotos = (ApiDocumentPhotos) obj;
        return this.hologramsCheck == apiDocumentPhotos.hologramsCheck && this.hologramsCheckPhotoCount == apiDocumentPhotos.hologramsCheckPhotoCount;
    }

    public final int hashCode() {
        return Integer.hashCode(this.hologramsCheckPhotoCount) + (Boolean.hashCode(this.hologramsCheck) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ApiDocumentPhotos(hologramsCheck=");
        sb2.append(this.hologramsCheck);
        sb2.append(", hologramsCheckPhotoCount=");
        return r.t(sb2, this.hologramsCheckPhotoCount, ')');
    }
}
