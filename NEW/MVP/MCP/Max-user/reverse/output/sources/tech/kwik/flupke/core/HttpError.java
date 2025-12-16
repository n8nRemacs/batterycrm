package tech.kwik.flupke.core;

/* loaded from: classes3.dex */
public class HttpError extends Exception {
    public HttpError(String str, int i) {
        super(str + " (" + i + ")");
    }
}
