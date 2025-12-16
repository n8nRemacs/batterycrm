package Lt;

import Y61.l;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: V1JobCvImportFromFileUploadResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LLt/b;", "", "LLt/a;", "error", "", "fileUid", "<init>", "(LLt/a;Ljava/lang/String;)V", "LLt/a;", "a", "()LLt/a;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "_avito_job_cv-upload_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b {

    @c("error")
    @l
    private final C14437a error;

    @c("fileUid")
    @l
    private final String fileUid;

    public b(@l C14437a c14437a, @l String str) {
        this.error = c14437a;
        this.fileUid = str;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final C14437a getError() {
        return this.error;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getFileUid() {
        return this.fileUid;
    }
}
