package com.google.gson;

import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

/* loaded from: classes6.dex */
public abstract class TypeAdapter<T> {
    public final T fromJson(Reader reader) {
        return read(new com.google.gson.stream.a(reader));
    }

    public final T fromJsonTree(i iVar) {
        try {
            return read(new com.google.gson.internal.bind.a(iVar));
        } catch (IOException e12) {
            throw new JsonIOException(e12);
        }
    }

    public final TypeAdapter<T> nullSafe() {
        return new TypeAdapter<T>() { // from class: com.google.gson.TypeAdapter.1
            @Override // com.google.gson.TypeAdapter
            public final T read(com.google.gson.stream.a aVar) {
                if (aVar.F() != JsonToken.f362204j) {
                    return (T) TypeAdapter.this.read(aVar);
                }
                aVar.z();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(com.google.gson.stream.c cVar, T t12) throws IOException {
                if (t12 == null) {
                    cVar.j();
                } else {
                    TypeAdapter.this.write(cVar, t12);
                }
            }
        };
    }

    public abstract T read(com.google.gson.stream.a aVar);

    public final void toJson(Writer writer, T t12) {
        write(new com.google.gson.stream.c(writer), t12);
    }

    public final i toJsonTree(T t12) {
        try {
            com.google.gson.internal.bind.b bVar = new com.google.gson.internal.bind.b();
            write(bVar, t12);
            return bVar.y();
        } catch (IOException e12) {
            throw new JsonIOException(e12);
        }
    }

    public abstract void write(com.google.gson.stream.c cVar, T t12);

    public final T fromJson(String str) {
        return fromJson(new StringReader(str));
    }

    public final String toJson(T t12) {
        StringWriter stringWriter = new StringWriter();
        try {
            toJson(stringWriter, t12);
            return stringWriter.toString();
        } catch (IOException e12) {
            throw new AssertionError(e12);
        }
    }
}
