package androidx.core.net;

import android.net.Uri;
import j.N;
import java.util.HashMap;
import java.util.Map;

/* compiled from: MailTo.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap<String, String> f44793a = new HashMap<>();

    @N
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("mailto:?");
        for (Map.Entry<String, String> entry : this.f44793a.entrySet()) {
            sb2.append(Uri.encode(entry.getKey()));
            sb2.append('=');
            sb2.append(Uri.encode(entry.getValue()));
            sb2.append('&');
        }
        return sb2.toString();
    }
}
