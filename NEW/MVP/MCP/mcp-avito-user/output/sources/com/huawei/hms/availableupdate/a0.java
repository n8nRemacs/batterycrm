package com.huawei.hms.availableupdate;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.ResourceLoaderUtil;
import java.text.NumberFormat;

/* compiled from: DownloadProgress.java */
/* loaded from: classes7.dex */
public class a0 extends q {

    /* renamed from: c, reason: collision with root package name */
    public ProgressBar f363334c;

    /* renamed from: d, reason: collision with root package name */
    public TextView f363335d;

    /* renamed from: e, reason: collision with root package name */
    public int f363336e = 0;

    /* renamed from: f, reason: collision with root package name */
    public DialogInterface.OnKeyListener f363337f = new b();

    /* compiled from: DownloadProgress.java */
    public static class b implements DialogInterface.OnKeyListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i12, KeyEvent keyEvent) {
            return i12 == 4 && keyEvent.getRepeatCount() == 0;
        }
    }

    public void a(int i12) {
        this.f363336e = i12;
    }

    public void b(int i12) {
        ProgressBar progressBar;
        Activity activityE = e();
        if (activityE == null || activityE.isFinishing()) {
            HMSLog.w("DownloadProgress", "In setDownloading, The activity is null or finishing.");
        } else {
            if (this.f363335d == null || (progressBar = this.f363334c) == null) {
                return;
            }
            progressBar.setProgress(i12);
            this.f363335d.setText(NumberFormat.getPercentInstance().format(i12 / 100.0f));
        }
    }

    @Override // com.huawei.hms.availableupdate.q
    public AlertDialog g() {
        AlertDialog.Builder builder = new AlertDialog.Builder(e(), f());
        View viewInflate = View.inflate(e(), ResourceLoaderUtil.getLayoutId("hms_download_progress"), null);
        builder.setView(viewInflate);
        builder.setCancelable(false);
        builder.setOnKeyListener(this.f363337f);
        View viewFindViewById = viewInflate.findViewById(ResourceLoaderUtil.getIdId("download_info_progress"));
        if (viewFindViewById instanceof ProgressBar) {
            this.f363334c = (ProgressBar) viewFindViewById;
        }
        View viewFindViewById2 = viewInflate.findViewById(ResourceLoaderUtil.getIdId("hms_progress_text"));
        if (viewFindViewById2 instanceof TextView) {
            this.f363335d = (TextView) viewFindViewById2;
        }
        b(this.f363336e);
        return builder.create();
    }
}
