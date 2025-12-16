package com.fasterxml.jackson.core;

/* loaded from: classes3.dex */
public class JsonProcessingException extends JacksonException {
    private static final long serialVersionUID = 123;

    /* renamed from: b, reason: collision with root package name */
    public e f341081b;

    public JsonProcessingException(String str, e eVar, Throwable th2) {
        super(str, th2);
        this.f341081b = eVar;
    }

    @Override // com.fasterxml.jackson.core.JacksonException
    public final e a() {
        return this.f341081b;
    }

    @Override // com.fasterxml.jackson.core.JacksonException
    public final String b() {
        return super.getMessage();
    }

    @Override // com.fasterxml.jackson.core.JacksonException
    public Object c() {
        return null;
    }

    public String d() {
        return null;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        if (message == null) {
            message = "N/A";
        }
        e eVar = this.f341081b;
        String strD = d();
        if (eVar == null && strD == null) {
            return message;
        }
        StringBuilder sbQ = androidx.compose.ui.graphics.colorspace.e.q(100, message);
        if (strD != null) {
            sbQ.append(strD);
        }
        if (eVar != null) {
            sbQ.append("\n at ");
            sbQ.append(eVar.toString());
        }
        return sbQ.toString();
    }

    @Override // java.lang.Throwable
    public String toString() {
        return getClass().getName() + ": " + getMessage();
    }
}
