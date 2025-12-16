package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.file_uploader.FileDeleteResult;
import com.avito.android.remote.model.file_uploader.FileUploadResult;
import com.avito.android.remote.parse.adapter.SealedClassDeserializer;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import q50.InterfaceC47203a;

/* compiled from: FileUploaderResultDeserializer.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito-discouraged_api-models_models"}, k = 2, mv = {1, 9, 0}, xi = 48)
@InterfaceC47203a
/* renamed from: com.avito.android.remote.parse.adapter.y, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C34381y {
    /* JADX WARN: Type inference failed for: r1v0, types: [T, com.avito.android.remote.model.file_uploader.FileDeleteResult$Error] */
    @Y61.k
    public static final SealedClassDeserializer a() {
        SealedClassDeserializer.f254229d.getClass();
        SealedClassDeserializer.a aVar = new SealedClassDeserializer.a();
        ?? error = new FileDeleteResult.Error(null, 1, null);
        if (aVar.f254235c != 0) {
            throw new IllegalStateException("Fallback is registered already!");
        }
        aVar.f254235c = error;
        aVar.a("internal-error");
        LinkedHashMap linkedHashMap = aVar.f254234b;
        n0 n0Var = m0.f406844a;
        linkedHashMap.put("internal-error", n0Var.b(FileDeleteResult.Error.class));
        aVar.a("bad-request");
        linkedHashMap.put("bad-request", n0Var.b(FileDeleteResult.Error.class));
        aVar.a("unauthorized");
        linkedHashMap.put("unauthorized", n0Var.b(FileDeleteResult.Error.class));
        aVar.a("forbidden");
        linkedHashMap.put("forbidden", n0Var.b(FileDeleteResult.Error.class));
        aVar.a("not-found");
        linkedHashMap.put("not-found", n0Var.b(FileDeleteResult.Error.class));
        aVar.a("success");
        linkedHashMap.put("success", n0Var.b(FileDeleteResult.Success.class));
        return aVar.b();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, com.avito.android.remote.model.file_uploader.FileUploadResult$Error] */
    @Y61.k
    public static final SealedClassDeserializer b() {
        SealedClassDeserializer.f254229d.getClass();
        SealedClassDeserializer.a aVar = new SealedClassDeserializer.a();
        ?? error = new FileUploadResult.Error(null, 1, null);
        if (aVar.f254235c != 0) {
            throw new IllegalStateException("Fallback is registered already!");
        }
        aVar.f254235c = error;
        aVar.a("internal-error");
        LinkedHashMap linkedHashMap = aVar.f254234b;
        n0 n0Var = m0.f406844a;
        linkedHashMap.put("internal-error", n0Var.b(FileUploadResult.Error.class));
        aVar.a("bad-request");
        linkedHashMap.put("bad-request", n0Var.b(FileUploadResult.Error.class));
        aVar.a("unauthorized");
        linkedHashMap.put("unauthorized", n0Var.b(FileUploadResult.Error.class));
        aVar.a("forbidden");
        linkedHashMap.put("forbidden", n0Var.b(FileUploadResult.Error.class));
        aVar.a("not-found");
        linkedHashMap.put("not-found", n0Var.b(FileUploadResult.Error.class));
        aVar.a("success");
        linkedHashMap.put("success", n0Var.b(FileUploadResult.Success.class));
        return aVar.b();
    }
}
