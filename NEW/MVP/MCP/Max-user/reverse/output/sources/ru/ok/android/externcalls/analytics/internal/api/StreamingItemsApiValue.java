package ru.ok.android.externcalls.analytics.internal.api;

import defpackage.gy7;
import defpackage.jt0;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipException;
import ru.ok.android.api.json.JsonSerializeException;
import ru.ok.android.api.json.JsonSyntaxException;

/* loaded from: classes2.dex */
public class StreamingItemsApiValue extends jt0 {
    private final File file;
    private final boolean isCompressed;

    public StreamingItemsApiValue(File file, boolean z) {
        this.file = file;
        this.isCompressed = z;
    }

    @Override // defpackage.jt0
    public void write(gy7 gy7Var) throws JsonSerializeException, IOException {
        gy7Var.r();
        try {
            InputStream fileInputStream = new FileInputStream(this.file);
            try {
                if (this.isCompressed) {
                    fileInputStream = new GZIPInputStream(fileInputStream, 4096);
                }
                try {
                    try {
                        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
                        try {
                            gy7Var.G(inputStreamReader);
                            inputStreamReader.close();
                            fileInputStream.close();
                        } catch (Throwable th) {
                            try {
                                inputStreamReader.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (JsonSyntaxException e) {
                        throw new JsonSerializeException(e);
                    }
                } catch (Throwable th3) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (ZipException e2) {
                throw new JsonSerializeException(e2);
            }
        } finally {
            gy7Var.q();
        }
    }
}
