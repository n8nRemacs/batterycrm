package com.bumptech.glide.disklrucache;

import androidx.compose.ui.graphics.colorspace.e;
import com.adjust.sdk.Constants;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* compiled from: Util.java */
/* loaded from: classes5.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f338739a = Charset.forName("US-ASCII");

    static {
        Charset.forName(Constants.ENCODING);
    }

    public static void a(File file) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            throw new IOException(e.j(file, "not a readable directory: "));
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                a(file2);
            }
            if (!file2.delete()) {
                throw new IOException(e.j(file2, "failed to delete file: "));
            }
        }
    }
}
