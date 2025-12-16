package com.avito.android.beduin.common.component.file_uploader;

import android.content.res.Resources;
import com.avito.android.R;
import com.avito.android.beduin.common.component.file_uploader.ValidationRule;
import com.avito.android.beduin_models.BeduinModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import qj.InterfaceC47406a;

/* compiled from: BeduinFileUploaderPreparer.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/component/file_uploader/h;", "Lqj/a;", "Lcom/avito/android/beduin/common/component/file_uploader/BeduinFileUploaderModel;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h implements InterfaceC47406a<BeduinFileUploaderModel> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Resources f101289a;

    @Inject
    public h(@Y61.k Resources resources) {
        this.f101289a = resources;
    }

    @Override // qj.InterfaceC47406a
    public final BeduinModel a(BeduinModel beduinModel) {
        Object next;
        Object next2;
        BeduinFileUploaderModel beduinFileUploaderModel = (BeduinFileUploaderModel) beduinModel;
        List<ValidationRule> validationRules = beduinFileUploaderModel.getValidationRules();
        if (validationRules == null) {
            validationRules = C42784z0.f406748b;
        }
        ArrayList arrayList = new ArrayList(validationRules);
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next instanceof ValidationRule.UploadingFilesRule) {
                break;
            }
        }
        if (!(next instanceof ValidationRule.UploadingFilesRule)) {
            next = null;
        }
        ValidationRule.UploadingFilesRule uploadingFilesRule = (ValidationRule.UploadingFilesRule) next;
        Resources resources = this.f101289a;
        if (uploadingFilesRule == null) {
            arrayList.add(new ValidationRule.UploadingFilesRule(resources.getString(R.string.beduin_file_uploader_uploading_files_rule_message)));
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            if (next2 instanceof ValidationRule.DeletingFilesRule) {
                break;
            }
        }
        if (((ValidationRule.DeletingFilesRule) (next2 instanceof ValidationRule.DeletingFilesRule ? next2 : null)) == null) {
            arrayList.add(new ValidationRule.DeletingFilesRule(resources.getString(R.string.beduin_file_uploader_deleting_files_rule_message)));
        }
        return BeduinFileUploaderModel.copy$default(beduinFileUploaderModel, null, null, null, null, null, arrayList, null, null, null, 479, null);
    }
}
