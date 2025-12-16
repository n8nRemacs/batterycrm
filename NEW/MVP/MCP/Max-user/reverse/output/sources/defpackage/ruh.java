package defpackage;

import android.webkit.WebChromeClient;

/* loaded from: classes2.dex */
public final class ruh implements avh {
    public final WebChromeClient.FileChooserParams a;

    public ruh(WebChromeClient.FileChooserParams fileChooserParams) {
        this.a = fileChooserParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ruh) && fni.a(this.a, ((ruh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ShowFileChooser(params=" + this.a + ")";
    }
}
