package com.avito.android.beduin.common.component.file_uploader;

import com.avito.android.beduin.common.component.file_uploader.ApiConfiguration;
import com.avito.android.beduin.common.component.file_uploader.n;
import com.avito.android.beduin.common.component.file_uploader.validation.c;
import com.avito.android.beduin.common.component.file_uploader.x;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.core.z;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;

/* compiled from: BeduinFileUploaderViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/file_uploader/validation/a;", "metaData", "Lkotlin/G0;", "accept", "(Lcom/avito/android/beduin/common/component/file_uploader/validation/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class q<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f101315b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n.a f101316c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f101317d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f101318e;

    public q(n nVar, n.a aVar, int i12, int i13) {
        this.f101315b = nVar;
        this.f101316c = aVar;
        this.f101317d = i12;
        this.f101318e = i13;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        BeduinFileUploaderModel beduinFileUploaderModelC;
        com.avito.android.beduin.common.component.file_uploader.validation.a aVar = (com.avito.android.beduin.common.component.file_uploader.validation.a) obj;
        n.a aVar2 = this.f101316c;
        n nVar = this.f101315b;
        BeduinFileUploaderModel beduinFileUploaderModelC2 = nVar.c(aVar2);
        List<ValidationRule> validationRules = beduinFileUploaderModelC2 != null ? beduinFileUploaderModelC2.getValidationRules() : null;
        if (validationRules == null) {
            validationRules = C42784z0.f406748b;
        }
        com.avito.android.beduin.common.component.file_uploader.validation.c cVarD = com.avito.android.beduin.common.component.file_uploader.validation.b.d(validationRules, aVar, this.f101317d + this.f101318e + 1);
        if (cVarD instanceof c.b) {
            n.a(nVar, aVar2, new x.c.a(aVar, ((c.b) cVarD).f101349b));
            return;
        }
        if (!L.f(cVarD, c.C3037c.f101350b) || (beduinFileUploaderModelC = nVar.c(aVar2)) == null) {
            return;
        }
        ApiConfiguration.Config upload = beduinFileUploaderModelC.getApiConfiguration().getUpload();
        String path = upload.getPath();
        String errorMessage = upload.getErrorMessage();
        ApiConfiguration.Config.INSTANCE.getClass();
        ApiConfiguration.HttpMethod httpMethod = upload._method;
        if (httpMethod == null) {
            httpMethod = ApiConfiguration.HttpMethod.POST;
        }
        Map<String, String> params = upload.getParams();
        if (params == null) {
            params = P0.c();
        }
        LinkedHashMap linkedHashMap = nVar.f101305d;
        z zVarQ = z.q(z.c0(new x.c.b(aVar)), nVar.f101304c.b(path, httpMethod, aVar, params, errorMessage));
        InterfaceC35745a5 interfaceC35745a5 = nVar.f101303b;
        linkedHashMap.put(aVar.f101333b, zVarQ.x0(interfaceC35745a5.a()).j0(interfaceC35745a5.e()).v0(new r(nVar, aVar2), new s(nVar, aVar2, aVar, errorMessage), io.reactivex.rxjava3.internal.functions.a.f401993c));
    }
}
