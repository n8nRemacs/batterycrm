package ru.ok.android.onelog;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import defpackage.bu7;
import defpackage.mri;
import defpackage.swd;
import java.io.IOException;
import ru.ok.android.commons.app.ApplicationProvider;

/* loaded from: classes2.dex */
public class UploadService extends swd {
    public static final String ACTION_UPLOAD = "ru.ok.android.onelog.action.UPLOAD";
    public static final String SCHEME = "one-log";

    private void onHandleUpload(String str) {
        try {
            OneLogImpl.upload(str);
        } catch (IOException unused) {
        }
    }

    public static void startUpload(String str) {
        Application application = ApplicationProvider.a;
        Application applicationA = mri.a();
        bu7.enqueueWork(applicationA, (Class<?>) UploadService.class, OneLogImpl.getInstance().getUploadJobId(), new Intent().setAction(ACTION_UPLOAD).setData(Uri.fromParts(SCHEME, str, null)).setClass(applicationA, UploadService.class));
    }

    @Override // defpackage.bu7
    public void onHandleWork(Intent intent) {
        String action;
        if (intent == null || (action = intent.getAction()) == null || !action.equals(ACTION_UPLOAD)) {
            return;
        }
        onHandleUpload(intent.getData().getSchemeSpecificPart());
    }
}
