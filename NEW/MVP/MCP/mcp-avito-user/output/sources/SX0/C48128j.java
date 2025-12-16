package sX0;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.A;
import com.fasterxml.jackson.databind.jsontype.o;
import com.fasterxml.jackson.databind.ser.std.L;
import java.nio.file.Path;

/* compiled from: NioPathSerializer.java */
/* renamed from: sX0.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C48128j extends L<Path> {
    private static final long serialVersionUID = 1;

    public C48128j() {
        super(Path.class);
    }

    @Override // com.fasterxml.jackson.databind.l
    public final void f(Object obj, JsonGenerator jsonGenerator, A a12) {
        jsonGenerator.i0(((Path) obj).toUri().toString());
    }

    @Override // com.fasterxml.jackson.databind.ser.std.L, com.fasterxml.jackson.databind.l
    public final void g(Object obj, JsonGenerator jsonGenerator, A a12, o oVar) {
        Path path = (Path) obj;
        WritableTypeId writableTypeIdD = oVar.d(JsonToken.VALUE_STRING, path);
        writableTypeIdD.f341265b = Path.class;
        WritableTypeId writableTypeIdE = oVar.e(jsonGenerator, writableTypeIdD);
        jsonGenerator.i0(path.toUri().toString());
        oVar.f(jsonGenerator, writableTypeIdE);
    }
}
