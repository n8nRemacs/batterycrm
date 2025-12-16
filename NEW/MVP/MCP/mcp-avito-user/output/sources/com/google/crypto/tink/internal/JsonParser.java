package com.google.crypto.tink.internal;

import I41.h;
import androidx.camera.camera2.internal.G;
import com.google.gson.TypeAdapter;
import com.google.gson.f;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.a;
import com.google.gson.stream.c;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.StringReader;
import java.math.BigDecimal;
import java.util.ArrayDeque;

/* loaded from: classes6.dex */
public final class JsonParser {
    private static final JsonElementTypeAdapter JSON_ELEMENT = new JsonElementTypeAdapter(null);

    /* renamed from: com.google.crypto.tink.internal.JsonParser$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$gson$stream$JsonToken;

        static {
            int[] iArr = new int[JsonToken.values().length];
            $SwitchMap$com$google$gson$stream$JsonToken = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[5] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[6] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[7] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[8] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static final class JsonElementTypeAdapter extends TypeAdapter<i> {
        private static final int RECURSION_LIMIT = 100;

        private JsonElementTypeAdapter() {
        }

        private i readTerminal(a aVar, JsonToken jsonToken) throws IOException {
            int iOrdinal = jsonToken.ordinal();
            if (iOrdinal == 5) {
                String strB = aVar.B();
                if (JsonParser.isValidString(strB)) {
                    return new m(strB);
                }
                throw new IOException("illegal characters in string");
            }
            if (iOrdinal == 6) {
                return new m(new LazilyParsedNumber(aVar.B()));
            }
            if (iOrdinal == 7) {
                return new m(Boolean.valueOf(aVar.o()));
            }
            if (iOrdinal == 8) {
                aVar.z();
                return j.f362193b;
            }
            throw new IllegalStateException("Unexpected token: " + jsonToken);
        }

        @h
        private i tryBeginNesting(a aVar, JsonToken jsonToken) {
            int iOrdinal = jsonToken.ordinal();
            if (iOrdinal == 0) {
                aVar.a();
                return new f();
            }
            if (iOrdinal != 2) {
                return null;
            }
            aVar.b();
            return new k();
        }

        public /* synthetic */ JsonElementTypeAdapter(AnonymousClass1 anonymousClass1) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        public i read(a aVar) throws IOException {
            String strX;
            JsonToken jsonTokenF = aVar.F();
            i iVarTryBeginNesting = tryBeginNesting(aVar, jsonTokenF);
            if (iVarTryBeginNesting == null) {
                return readTerminal(aVar, jsonTokenF);
            }
            ArrayDeque arrayDeque = new ArrayDeque();
            while (true) {
                if (aVar.k()) {
                    if (iVarTryBeginNesting instanceof k) {
                        strX = aVar.x();
                        if (!JsonParser.isValidString(strX)) {
                            throw new IOException("illegal characters in string");
                        }
                    } else {
                        strX = null;
                    }
                    JsonToken jsonTokenF2 = aVar.F();
                    i iVarTryBeginNesting2 = tryBeginNesting(aVar, jsonTokenF2);
                    boolean z12 = iVarTryBeginNesting2 != null;
                    if (iVarTryBeginNesting2 == null) {
                        iVarTryBeginNesting2 = readTerminal(aVar, jsonTokenF2);
                    }
                    if (iVarTryBeginNesting instanceof f) {
                        ((f) iVarTryBeginNesting).t(iVarTryBeginNesting2);
                    } else {
                        k kVar = (k) iVarTryBeginNesting;
                        if (kVar.f362194b.containsKey(strX)) {
                            throw new IOException(G.f("duplicate key: ", strX));
                        }
                        kVar.t(strX, iVarTryBeginNesting2);
                    }
                    if (z12) {
                        arrayDeque.addLast(iVarTryBeginNesting);
                        if (arrayDeque.size() > 100) {
                            throw new IOException("too many recursions");
                        }
                        iVarTryBeginNesting = iVarTryBeginNesting2;
                    } else {
                        continue;
                    }
                } else {
                    if (iVarTryBeginNesting instanceof f) {
                        aVar.f();
                    } else {
                        aVar.g();
                    }
                    if (arrayDeque.isEmpty()) {
                        return iVarTryBeginNesting;
                    }
                    iVarTryBeginNesting = (i) arrayDeque.removeLast();
                }
            }
        }

        @Override // com.google.gson.TypeAdapter
        public void write(c cVar, i iVar) {
            throw new UnsupportedOperationException("write is not supported");
        }
    }

    public static final class LazilyParsedNumber extends Number {
        private final String value;

        public LazilyParsedNumber(String str) {
            this.value = str;
        }

        private void readObject(ObjectInputStream objectInputStream) throws NotSerializableException {
            throw new NotSerializableException("serialization is not supported");
        }

        private Object writeReplace() throws NotSerializableException {
            throw new NotSerializableException("serialization is not supported");
        }

        @Override // java.lang.Number
        public double doubleValue() {
            return Double.parseDouble(this.value);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof LazilyParsedNumber) {
                return this.value.equals(((LazilyParsedNumber) obj).value);
            }
            return false;
        }

        @Override // java.lang.Number
        public float floatValue() {
            return Float.parseFloat(this.value);
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        @Override // java.lang.Number
        public int intValue() {
            try {
                try {
                    return Integer.parseInt(this.value);
                } catch (NumberFormatException unused) {
                    return (int) Long.parseLong(this.value);
                }
            } catch (NumberFormatException unused2) {
                return new BigDecimal(this.value).intValue();
            }
        }

        @Override // java.lang.Number
        public long longValue() {
            try {
                return Long.parseLong(this.value);
            } catch (NumberFormatException unused) {
                return new BigDecimal(this.value).longValue();
            }
        }

        public String toString() {
            return this.value;
        }
    }

    private JsonParser() {
    }

    public static long getParsedNumberAsLongOrThrow(i iVar) {
        if (iVar.r() instanceof LazilyParsedNumber) {
            return Long.parseLong(iVar.r().toString());
        }
        throw new IllegalArgumentException("does not contain a parsed number.");
    }

    public static boolean isValidString(String str) {
        int length = str.length();
        int i12 = 0;
        while (i12 != length) {
            char cCharAt = str.charAt(i12);
            int i13 = i12 + 1;
            if (!Character.isSurrogate(cCharAt)) {
                i12 = i13;
            } else {
                if (Character.isLowSurrogate(cCharAt) || i13 == length || !Character.isLowSurrogate(str.charAt(i13))) {
                    return false;
                }
                i12 += 2;
            }
        }
        return true;
    }

    public static i parse(String str) throws IOException {
        try {
            a aVar = new a(new StringReader(str));
            aVar.f362208c = false;
            return JSON_ELEMENT.read(aVar);
        } catch (NumberFormatException e12) {
            throw new IOException(e12);
        }
    }
}
