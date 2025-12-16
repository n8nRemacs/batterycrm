package ru.ok.android.onelog;

import defpackage.gy7;
import defpackage.kkb;
import defpackage.o2c;
import java.io.IOException;
import java.io.OutputStream;
import java.io.StringWriter;
import java.io.Writer;

@Deprecated
/* loaded from: classes2.dex */
final class ItemDumper {

    @Deprecated
    public static final String COUNT = "count";

    @Deprecated
    public static final String CUSTOM = "custom";

    @Deprecated
    public static final String DATA = "data";

    @Deprecated
    public static final String GROUPS = "groups";

    @Deprecated
    public static final String NETWORK = "network";

    @Deprecated
    public static final String OPERATION = "operation";

    @Deprecated
    public static final String TIME = "time";

    @Deprecated
    public static final String TIMESTAMP = "timestamp";

    @Deprecated
    public static final String TYPE = "type";

    @Deprecated
    public static final String UID = "uid";

    private ItemDumper() {
    }

    @Deprecated
    public static String dump(OneLogItem oneLogItem) {
        try {
            StringWriter stringWriter = new StringWriter();
            dump(oneLogItem, stringWriter);
            return stringWriter.toString();
        } catch (IOException unused) {
            throw new AssertionError("WTF! StringWriter thrown IOException");
        }
    }

    @Deprecated
    public static void dump(OneLogItem oneLogItem, OutputStream outputStream) throws IOException {
        dump(oneLogItem, new kkb(outputStream));
    }

    @Deprecated
    public static void dump(OneLogItem oneLogItem, Writer writer) throws IOException {
        o2c o2cVar = new o2c(writer);
        dump(oneLogItem, o2cVar);
        o2cVar.flush();
    }

    @Deprecated
    public static void dump(OneLogItem oneLogItem, gy7 gy7Var) throws IOException {
        ItemSerializer.INSTANCE.serialize(gy7Var, oneLogItem);
    }
}
