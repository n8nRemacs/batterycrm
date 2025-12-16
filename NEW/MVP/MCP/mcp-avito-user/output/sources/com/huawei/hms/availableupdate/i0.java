package com.huawei.hms.availableupdate;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.ResourceLoaderUtil;
import com.yandex.div2.D8;

/* compiled from: ReconfirmInstallDialog.java */
/* loaded from: classes7.dex */
public class i0 {

    /* renamed from: a, reason: collision with root package name */
    public AlertDialog.Builder f363381a;

    /* renamed from: b, reason: collision with root package name */
    public Activity f363382b;

    /* renamed from: c, reason: collision with root package name */
    public q f363383c;

    /* compiled from: ReconfirmInstallDialog.java */
    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i12) {
            HMSLog.i("ReconfirmInstallDialog", "start fireDoWork...");
            i0.this.f363383c.d();
        }
    }

    /* compiled from: ReconfirmInstallDialog.java */
    public class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i12) {
            HMSLog.i("ReconfirmInstallDialog", "start cancel...");
            i0.this.f363383c.a();
        }
    }

    public i0(AlertDialog.Builder builder, Activity activity, q qVar) {
        this.f363381a = builder;
        this.f363382b = activity;
        this.f363383c = qVar;
    }

    public AlertDialog a() {
        Activity activity;
        try {
            int stringId = ResourceLoaderUtil.getStringId("hms_install_after_cancel");
            int stringId2 = ResourceLoaderUtil.getStringId("hms_cancel_after_cancel");
            int stringId3 = ResourceLoaderUtil.getStringId("hms_cancel_install_message");
            if (this.f363381a != null && (activity = this.f363382b) != null && this.f363383c != null) {
                if (activity.isFinishing()) {
                    HMSLog.e("ReconfirmInstallDialog", "this mActivity is finished.");
                    return null;
                }
                this.f363381a.setMessage(this.f363382b.getString(stringId3));
                this.f363381a.setPositiveButton(stringId, new a());
                this.f363381a.setNegativeButton(stringId2, new b());
                return this.f363381a.create();
            }
            HMSLog.e("ReconfirmInstallDialog", "error: mBuilder, mActivity or mDialog is null: " + this.f363381a + this.f363382b + this.f363383c);
            return null;
        } catch (Exception e12) {
            D8.q(e12, new StringBuilder("createNewDialog exception: "), "ReconfirmInstallDialog");
            return null;
        }
    }
}
