package com.avito.android.publish.file_uploader;

import com.avito.android.remote.model.category_parameters.FileUploadValidationRule;
import com.avito.android.remote.model.category_parameters.FileUploaderParameter;
import fe0.C40408a;
import fe0.d;
import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.internal.operators.completable.C41823n;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.l0;

/* compiled from: FileUploaderViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lfe0/a;", "metaData", "Lio/reactivex/rxjava3/core/g;", "apply", "(Lfe0/a;)Lio/reactivex/rxjava3/core/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class w<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0.h<C40408a> f235737b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f235738c;

    public w(l0.h<C40408a> hVar, t tVar) {
        this.f235737b = hVar;
        this.f235738c = tVar;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [T, fe0.a] */
    @Override // l41.o
    public final Object apply(Object obj) {
        fe0.d dVarA;
        FileUploaderParameter.Widget.Config config;
        ?? r62 = (T) ((C40408a) obj);
        this.f235737b.f406842b = r62;
        t tVar = this.f235738c;
        FileUploaderParameter.Widget widget = tVar.ne().getWidget();
        List<FileUploadValidationRule> rules = (widget == null || (config = widget.getConfig()) == null) ? null : config.getRules();
        int i12 = tVar.f235716R;
        tVar.f235716R = i12 + 1;
        if (rules != null) {
            for (FileUploadValidationRule fileUploadValidationRule : rules) {
                if (fileUploadValidationRule instanceof FileUploadValidationRule.FileSizeRule) {
                    dVarA = H.a(fileUploadValidationRule, new E(r62, (FileUploadValidationRule.FileSizeRule) fileUploadValidationRule));
                } else if (fileUploadValidationRule instanceof FileUploadValidationRule.FileTypesRule) {
                    dVarA = H.a(fileUploadValidationRule, new F((FileUploadValidationRule.FileTypesRule) fileUploadValidationRule, r62));
                } else {
                    if (!(fileUploadValidationRule instanceof FileUploadValidationRule.FilesCountRule)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dVarA = H.a(fileUploadValidationRule, new G(i12, (FileUploadValidationRule.FilesCountRule) fileUploadValidationRule));
                }
                fe0.d.f396007a.getClass();
                if (dVarA instanceof d.b) {
                    break;
                }
            }
            dVarA = d.c.f396010b;
        } else {
            dVarA = d.c.f396010b;
        }
        if (dVarA instanceof d.b) {
            return AbstractC41768a.o(new fe0.c(r62, ((d.b) dVarA).f396009b));
        }
        if (L.f(dVarA, d.c.f396010b)) {
            return C41823n.f402260b;
        }
        throw new NoWhenBranchMatchedException();
    }
}
