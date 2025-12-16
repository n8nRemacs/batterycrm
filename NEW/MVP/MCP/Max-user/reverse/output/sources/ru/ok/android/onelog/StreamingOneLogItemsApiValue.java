package ru.ok.android.onelog;

import defpackage.gy7;
import defpackage.jt0;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import ru.ok.android.api.json.JsonSerializeException;
import ru.ok.android.api.json.JsonSyntaxException;

/* loaded from: classes2.dex */
class StreamingOneLogItemsApiValue extends jt0 {
    private final File file;

    public StreamingOneLogItemsApiValue(File file) {
        this.file = file;
    }

    @Override // defpackage.jt0
    public void write(gy7 gy7Var) throws JsonSerializeException, IOException {
        gy7Var.r();
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(this.file), StandardCharsets.UTF_8);
            try {
                gy7Var.G(inputStreamReader);
                inputStreamReader.close();
                gy7Var.q();
            } finally {
            }
        } catch (JsonSyntaxException e) {
            throw new JsonSerializeException(e);
        }
    }
}
