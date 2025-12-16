package com.yandex.metrica.impl.ob;

import com.yandex.metrica.DeferredDeeplinkListener;
import com.yandex.metrica.DeferredDeeplinkParametersListener;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.o0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39014o0 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f381202a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private DeferredDeeplinkListener f381203b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    private DeferredDeeplinkParametersListener f381204c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    private C38989n0 f381205d;

    /* renamed from: com.yandex.metrica.impl.ob.o0$a */
    public enum a {
        NOT_A_FIRST_LAUNCH,
        PARSE_ERROR,
        NO_REFERRER
    }

    public C39014o0(boolean z12) {
        this.f381202a = z12;
    }

    public void a(@j.P C38989n0 c38989n0) {
        this.f381205d = c38989n0;
        a();
    }

    private void a(@j.N a aVar) {
        DeferredDeeplinkListener.Error error;
        C38989n0 c38989n0 = this.f381205d;
        String str = c38989n0 == null ? null : c38989n0.f381140c;
        DeferredDeeplinkListener deferredDeeplinkListener = this.f381203b;
        if (deferredDeeplinkListener != null) {
            int iOrdinal = aVar.ordinal();
            if (iOrdinal == 0) {
                error = DeferredDeeplinkListener.Error.NOT_A_FIRST_LAUNCH;
            } else if (iOrdinal == 1) {
                error = DeferredDeeplinkListener.Error.PARSE_ERROR;
            } else if (iOrdinal != 2) {
                error = DeferredDeeplinkListener.Error.UNKNOWN;
            } else {
                error = DeferredDeeplinkListener.Error.NO_REFERRER;
            }
            deferredDeeplinkListener.onError(error, str == null ? "" : str);
            this.f381203b = null;
        }
        a(aVar, str);
    }

    public void a(@j.N DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        this.f381204c = deferredDeeplinkParametersListener;
        if (this.f381202a) {
            a(a.NOT_A_FIRST_LAUNCH);
        } else {
            a();
        }
    }

    public void a(@j.N DeferredDeeplinkListener deferredDeeplinkListener) {
        this.f381203b = deferredDeeplinkListener;
        if (this.f381202a) {
            a(a.NOT_A_FIRST_LAUNCH);
        } else {
            a();
        }
    }

    private void a() {
        C38989n0 c38989n0 = this.f381205d;
        if (c38989n0 != null) {
            String str = c38989n0.f381139b;
            if (str != null) {
                DeferredDeeplinkListener deferredDeeplinkListener = this.f381203b;
                if (deferredDeeplinkListener != null) {
                    deferredDeeplinkListener.onDeeplinkLoaded(str);
                    this.f381203b = null;
                }
                if (!A2.b(this.f381205d.f381138a)) {
                    Map<String, String> map = this.f381205d.f381138a;
                    DeferredDeeplinkParametersListener deferredDeeplinkParametersListener = this.f381204c;
                    if (deferredDeeplinkParametersListener != null) {
                        deferredDeeplinkParametersListener.onParametersLoaded(map);
                        this.f381204c = null;
                        return;
                    }
                    return;
                }
                a(a.PARSE_ERROR, this.f381205d.f381140c);
                return;
            }
            if (c38989n0.f381140c != null) {
                a(a.PARSE_ERROR);
            } else {
                a(a.NO_REFERRER);
            }
        }
    }

    private void a(@j.N a aVar, @j.P String str) {
        DeferredDeeplinkParametersListener.Error error;
        DeferredDeeplinkParametersListener deferredDeeplinkParametersListener = this.f381204c;
        if (deferredDeeplinkParametersListener != null) {
            int iOrdinal = aVar.ordinal();
            if (iOrdinal == 0) {
                error = DeferredDeeplinkParametersListener.Error.NOT_A_FIRST_LAUNCH;
            } else if (iOrdinal == 1) {
                error = DeferredDeeplinkParametersListener.Error.PARSE_ERROR;
            } else if (iOrdinal != 2) {
                error = DeferredDeeplinkParametersListener.Error.UNKNOWN;
            } else {
                error = DeferredDeeplinkParametersListener.Error.NO_REFERRER;
            }
            if (str == null) {
                str = "";
            }
            deferredDeeplinkParametersListener.onError(error, str);
            this.f381204c = null;
        }
    }
}
