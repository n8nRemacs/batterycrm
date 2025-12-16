package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import org.apache.http.HttpStatus;

/* loaded from: classes2.dex */
public final /* synthetic */ class p14 implements a8 {
    @Override // defpackage.a8
    public final void a(ytd ytdVar) {
        Intent intent = new Intent("android.intent.action.INSERT");
        intent.setType("vnd.android.cursor.dir/raw_contact");
        intent.putExtra("finishActivityOnSaveCompleted", true);
        try {
            Activity activityD = ytdVar.d();
            if (activityD == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            activityD.startActivityForResult(intent, HttpStatus.SC_PROCESSING);
        } catch (ActivityNotFoundException unused) {
            wqi.e("ContactsDeepLinkFactory", "createContact: failed, no activity found", null);
        }
    }
}
