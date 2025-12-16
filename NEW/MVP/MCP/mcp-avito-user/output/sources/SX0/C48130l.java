package sX0;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.A;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.jsontype.o;
import com.fasterxml.jackson.databind.ser.std.L;
import java.sql.Blob;
import java.sql.SQLException;
import rX0.InterfaceC47610a;

/* compiled from: SqlBlobSerializer.java */
@InterfaceC47610a
/* renamed from: sX0.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C48130l extends L<Blob> {
    public C48130l() {
        super(Blob.class);
    }

    @Override // com.fasterxml.jackson.databind.l
    public final boolean d(A a12, Object obj) {
        return ((Blob) obj) == null;
    }

    @Override // com.fasterxml.jackson.databind.l
    public final void f(Object obj, JsonGenerator jsonGenerator, A a12) throws SQLException, JsonMappingException {
        try {
            jsonGenerator.u(a12.f341330b.f341506c.f341481i, ((Blob) obj).getBinaryStream(), -1);
        } catch (SQLException e12) {
            a12.getClass();
            throw new JsonMappingException(a12.y(), "Failed to access `java.sql.Blob` value to write as binary value", e12);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.L, com.fasterxml.jackson.databind.l
    public final void g(Object obj, JsonGenerator jsonGenerator, A a12, o oVar) throws SQLException, JsonMappingException {
        Blob blob = (Blob) obj;
        WritableTypeId writableTypeIdE = oVar.e(jsonGenerator, oVar.d(JsonToken.VALUE_EMBEDDED_OBJECT, blob));
        try {
            jsonGenerator.u(a12.f341330b.f341506c.f341481i, blob.getBinaryStream(), -1);
            oVar.f(jsonGenerator, writableTypeIdE);
        } catch (SQLException e12) {
            a12.getClass();
            throw new JsonMappingException(a12.y(), "Failed to access `java.sql.Blob` value to write as binary value", e12);
        }
    }
}
