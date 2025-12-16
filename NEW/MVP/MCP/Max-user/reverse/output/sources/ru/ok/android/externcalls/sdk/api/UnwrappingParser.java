package ru.ok.android.externcalls.sdk.api;

import defpackage.ho7;
import defpackage.ox7;
import defpackage.xx7;
import java.io.IOException;
import ru.ok.android.api.json.JsonParseException;

/* loaded from: classes2.dex */
public final class UnwrappingParser<T> implements ox7 {
    private final String fieldName;
    private final ox7 valueParser;

    public UnwrappingParser(String str, ox7 ox7Var) {
        this.fieldName = str;
        this.valueParser = ox7Var;
    }

    @Override // defpackage.ox7
    public T parse(xx7 xx7Var) throws JsonParseException, IOException {
        xx7Var.p();
        T t = null;
        while (xx7Var.hasNext()) {
            if (this.fieldName.equals(xx7Var.name())) {
                t = (T) this.valueParser.parse(xx7Var);
            }
        }
        xx7Var.n();
        if (t != null) {
            return t;
        }
        throw new JsonParseException(ho7.l(new StringBuilder("\""), this.fieldName, "\" not found"));
    }
}
