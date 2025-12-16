package JZ;

import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.api.model.RemoteFile;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ProfileResult.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LJZ/h;", "", "Lcom/avito/android/mortgage/api/model/RemoteFile;", "file", "<init>", "(Lcom/avito/android/mortgage/api/model/RemoteFile;)V", "Lcom/avito/android/mortgage/api/model/RemoteFile;", "a", "()Lcom/avito/android/mortgage/api/model/RemoteFile;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class h {

    @com.google.gson.annotations.c("profile")
    @Y61.k
    private final RemoteFile file;

    public h(@Y61.k RemoteFile remoteFile) {
        this.file = remoteFile;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final RemoteFile getFile() {
        return this.file;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && L.f(this.file, ((h) obj).file);
    }

    public final int hashCode() {
        return this.file.hashCode();
    }

    @Y61.k
    public final String toString() {
        return "FileResult(file=" + this.file + ')';
    }
}
