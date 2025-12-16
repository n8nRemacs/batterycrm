package com.huawei.hms.availableupdate;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import com.huawei.hms.utils.ResourceLoaderUtil;

/* compiled from: CheckProgress.java */
/* loaded from: classes7.dex */
public class s extends q {
    @Override // com.huawei.hms.availableupdate.q
    public AlertDialog g() {
        ProgressDialog progressDialog = new ProgressDialog(e(), f());
        progressDialog.setMessage(ResourceLoaderUtil.getString("hms_checking"));
        progressDialog.setCanceledOnTouchOutside(false);
        return progressDialog;
    }
}
