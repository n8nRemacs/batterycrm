package uW0;

import android.util.Log;
import androidx.compose.ui.platform.C22491k0;
import com.facebook.infer.annotation.Nullsafe;
import java.io.PrintWriter;
import java.io.StringWriter;

/* compiled from: FLogDefaultLoggingDelegate.java */
@Nullsafe
/* renamed from: uW0.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C48987b implements InterfaceC48988c {

    /* renamed from: a, reason: collision with root package name */
    public static final C48987b f440080a = new C48987b();

    public final boolean a(int i12) {
        return 5 <= i12;
    }

    public final void b(int i12, String str, String str2) {
        Log.println(i12, "unknown:" + str, str2);
    }

    public final void c(int i12, String str, String str2, Throwable th2) {
        String string;
        String strConcat = "unknown:".concat(str);
        StringBuilder sbB = C22491k0.b(str2, '\n');
        if (th2 == null) {
            string = "";
        } else {
            StringWriter stringWriter = new StringWriter();
            th2.printStackTrace(new PrintWriter(stringWriter));
            string = stringWriter.toString();
        }
        sbB.append(string);
        Log.println(i12, strConcat, sbB.toString());
    }
}
