package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.Collections;
import one.me.filedownloadwarning.FileDownloadWarningBottomSheet;

/* loaded from: classes2.dex */
public final class hw5 extends l3f {
    public static final hw5 b = new hw5();

    @Override // defpackage.l3f
    public final li4 c() {
        return new li4(new nq5(2), new nq5(3));
    }

    @Override // defpackage.l3f
    public final mi4 d(Bundle bundle) {
        final long jI = l8j.i("chat_id", bundle);
        final long jI2 = l8j.i("message_id", bundle);
        final String string = bundle.getString("attach_id");
        final long jI3 = l8j.i("file_id", bundle);
        final String strK = l8j.k("file_name", bundle);
        final long jI4 = l8j.i("file_size", bundle);
        Parcelable parcelable = bundle.getParcelable("file_url");
        if (parcelable == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        final Uri uri = (Uri) parcelable;
        return new mi4() { // from class: gw5
            @Override // defpackage.mi4
            public final Object a() {
                return new FileDownloadWarningBottomSheet(jI, jI2, string, jI3, strK, uri.toString(), jI4);
            }
        };
    }

    @Override // defpackage.l3f
    public final void e(k3f k3fVar) {
        ki4.b(k3fVar, ":dialogs/file-download-warning", new String[]{"chat_id", "message_id", "file_id", "file_name", "file_size"}, Collections.singleton("file_url"), 12);
    }
}
