package com.avito.android.publish.file_uploader;

import com.avito.android.remote.model.category_parameters.FileUploadValidationRule;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: FileValidator.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final class G extends N implements Y41.a<Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f235672l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ FileUploadValidationRule.FilesCountRule f235673m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(int i12, FileUploadValidationRule.FilesCountRule filesCountRule) {
        super(0);
        this.f235672l = i12;
        this.f235673m = filesCountRule;
    }

    @Override // Y41.a
    public final Boolean invoke() {
        return Boolean.valueOf(this.f235672l < this.f235673m.getValue());
    }
}
