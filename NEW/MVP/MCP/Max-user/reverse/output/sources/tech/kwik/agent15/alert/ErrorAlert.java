package tech.kwik.agent15.alert;

import defpackage.ibg;
import tech.kwik.agent15.TlsProtocolException;

/* loaded from: classes.dex */
public abstract class ErrorAlert extends TlsProtocolException {
    public final ibg a;

    public ErrorAlert(String str, ibg ibgVar) {
        super(str);
        this.a = ibgVar;
    }
}
