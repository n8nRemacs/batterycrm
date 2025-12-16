package com.huawei.hms.availableupdate;

import android.app.AlertDialog;
import android.content.DialogInterface;
import com.huawei.hms.utils.ResourceLoaderUtil;

/* compiled from: PromptDialogs.java */
/* loaded from: classes7.dex */
public abstract class e0 extends q {

    /* compiled from: PromptDialogs.java */
    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i12) {
            e0.this.d();
        }
    }

    public e0() {
    }

    @Override // com.huawei.hms.availableupdate.q
    public AlertDialog g() {
        AlertDialog.Builder builder = new AlertDialog.Builder(e(), f());
        builder.setMessage(h());
        builder.setPositiveButton(i(), new a());
        return builder.create();
    }

    public abstract int h();

    public int i() {
        return ResourceLoaderUtil.getStringId("hms_confirm");
    }
}
