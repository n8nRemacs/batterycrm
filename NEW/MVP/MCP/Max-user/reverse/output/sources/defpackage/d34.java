package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* loaded from: classes.dex */
public final class d34 implements c34, e34 {
    public Bundle X;
    public final /* synthetic */ int a = 0;
    public ClipData b;
    public int c;
    public int d;
    public Uri o;

    public /* synthetic */ d34() {
    }

    @Override // defpackage.e34
    public ClipData a() {
        return this.b;
    }

    @Override // defpackage.e34
    public Uri b() {
        return this.o;
    }

    @Override // defpackage.c34
    public f34 build() {
        return new f34(new d34(this));
    }

    @Override // defpackage.c34
    public void d(Uri uri) {
        this.o = uri;
    }

    @Override // defpackage.c34
    public void e(ClipData clipData) {
        this.b = clipData;
    }

    @Override // defpackage.e34
    public ContentInfo g() {
        return null;
    }

    @Override // defpackage.e34
    public Bundle getExtras() {
        return this.X;
    }

    @Override // defpackage.e34
    public int getFlags() {
        return this.d;
    }

    @Override // defpackage.e34
    public int h() {
        return this.c;
    }

    @Override // defpackage.c34
    public void setExtras(Bundle bundle) {
        this.X = bundle;
    }

    @Override // defpackage.c34
    public void setFlags(int i) {
        this.d = i;
    }

    public String toString() {
        String str;
        switch (this.a) {
            case 1:
                Uri uri = this.o;
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.b.getDescription());
                sb.append(", source=");
                int i = this.c;
                sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i2 = this.d;
                sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                return ho7.l(sb, this.X != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    public d34(d34 d34Var) {
        ClipData clipData = d34Var.b;
        clipData.getClass();
        this.b = clipData;
        int i = d34Var.c;
        z5j.c(i, "source", 0, 5);
        this.c = i;
        int i2 = d34Var.d;
        if ((i2 & 1) == i2) {
            this.d = i2;
            this.o = d34Var.o;
            this.X = d34Var.X;
        } else {
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        }
    }
}
