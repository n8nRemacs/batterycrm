package com.avito.android.publish.file_uploader;

import com.avito.android.remote.model.category_parameters.FileUploadValidationRule;
import fe0.C40408a;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: FileValidator.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final class E extends N implements Y41.a<Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C40408a f235668l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ FileUploadValidationRule.FileSizeRule f235669m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(C40408a c40408a, FileUploadValidationRule.FileSizeRule fileSizeRule) {
        super(0);
        this.f235668l = c40408a;
        this.f235669m = fileSizeRule;
    }

    @Override // Y41.a
    public final Boolean invoke() {
        return Boolean.valueOf(this.f235668l.f395991c < ((long) this.f235669m.getValue()));
    }
}
