package defpackage;

/* loaded from: classes2.dex */
public enum y8h implements z8h {
    OUT_OF_MEMORY("out_of_memory"),
    CAMERA_PERMISSION("camera_permission"),
    MIC_PERMISSION("mic_permission"),
    CAMERA_NOT_FOUND("camera_not_found"),
    CAMERA_ERROR_ON_RECORD("camera_error_on_record"),
    UPLOAD_ERROR("upload_error");

    public final String a;

    y8h(String str) {
        this.a = str;
    }

    @Override // defpackage.z8h
    public final String getTitle() {
        return this.a;
    }
}
