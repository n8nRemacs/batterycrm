package ru.ok.android.externcalls.sdk.api.request;

import android.net.Uri;
import defpackage.br0;
import defpackage.gm;
import defpackage.gy7;
import defpackage.km;
import defpackage.nm;
import defpackage.nmf;
import defpackage.nua;
import defpackage.om;
import defpackage.ox7;
import defpackage.sl6;
import defpackage.tha;
import defpackage.tk4;
import defpackage.ul;
import defpackage.ul0;
import defpackage.wm;
import defpackage.xx7;
import defpackage.yl;
import kotlin.Metadata;
import org.apache.commons.logging.LogFactory;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;
import ru.ok.android.externcalls.sdk.stat.negotiation.NegotiationErrorStat;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0006"}, d2 = {"Lru/ok/android/externcalls/sdk/api/request/GetOkIdByExternalId;", "", "()V", "Companion", "Request", "Response", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class GetOkIdByExternalId {
    public static final String METHOD_NAME = "vchat.getOkIdByExternalId";

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \r2\u00020\u0001:\u0001\rB'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lru/ok/android/externcalls/sdk/api/request/GetOkIdByExternalId$Response;", "", "okId", "", SdkMetricStatEvent.NAME_KEY, "", NegotiationErrorStat.KEY_ERROR, "(JLjava/lang/String;Ljava/lang/String;)V", "getError", "()Ljava/lang/String;", "getName", "getOkId", "()J", "Companion", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Response {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final ox7 PARSER;
        private final String error;
        private final String name;
        private final long okId;

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ok/android/externcalls/sdk/api/request/GetOkIdByExternalId$Response$Companion;", "", "<init>", "()V", "Lxx7;", "reader", "Lru/ok/android/externcalls/sdk/api/request/GetOkIdByExternalId$Response;", "parse", "(Lxx7;)Lru/ok/android/externcalls/sdk/api/request/GetOkIdByExternalId$Response;", "Lox7;", "PARSER", "Lox7;", "getPARSER", "()Lox7;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(tk4 tk4Var) {
                this();
            }

            public final ox7 getPARSER() {
                return Response.PARSER;
            }

            public final Response parse(xx7 reader) {
                reader.p();
                long jT = 0;
                String strB = null;
                String strB2 = null;
                while (reader.hasNext()) {
                    String strName = reader.name();
                    int iHashCode = strName.hashCode();
                    if (iHashCode != 3373707) {
                        if (iHashCode != 96784904) {
                            if (iHashCode == 105793118 && strName.equals("ok_id")) {
                                jT = reader.t();
                            } else {
                                reader.v();
                            }
                        } else if (strName.equals(NegotiationErrorStat.KEY_ERROR)) {
                            strB2 = reader.B();
                        } else {
                            reader.v();
                        }
                    } else if (strName.equals(SdkMetricStatEvent.NAME_KEY)) {
                        strB = reader.B();
                    } else {
                        reader.v();
                    }
                }
                reader.n();
                return new Response(jT, strB, strB2);
            }

            private Companion() {
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            PARSER = new sl6(1, companion);
        }

        public Response() {
            this(0L, null, null, 7, null);
        }

        public final String getError() {
            return this.error;
        }

        public final String getName() {
            return this.name;
        }

        public final long getOkId() {
            return this.okId;
        }

        public Response(long j, String str, String str2) {
            this.okId = j;
            this.name = str;
            this.error = str2;
        }

        public /* synthetic */ Response(long j, String str, String str2, int i, tk4 tk4Var) {
            this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
        }
    }

    @Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\u0011\u0010\fJ\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u001b8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010#\u001a\n\u0012\u0006\b\u0001\u0012\u00020 0\u001f8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u001c\u0010%\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u001f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b$\u0010\"R\u0014\u0010)\u001a\u00020&8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00105\u001a\u0002028\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b3\u00104¨\u00066"}, d2 = {"Lru/ok/android/externcalls/sdk/api/request/GetOkIdByExternalId$Request;", "Lkm;", "Lnua;", "Lyl;", "Lru/ok/android/externcalls/sdk/api/request/GetOkIdByExternalId$Response;", "", "id", "", "isAnon", "<init>", "(Ljava/lang/String;Z)V", "canRepeat", "()Z", "shouldGzip", "shouldPost", "shouldReport", "willWriteParams", "willWriteSupplyParams", "Lgy7;", "writer", "Lqqg;", "writeParams", "(Lgy7;)V", "writeSupplyParams", "", "handleInterruptedIO", "()Ljava/lang/Object;", "Lul;", "getConfigExtractor", "()Lul;", "configExtractor", "Lox7;", "Lru/ok/android/api/core/ApiInvocationException;", "getFailParser", "()Lox7;", "failParser", "getOkParser", "okParser", "", "getPriority", "()I", LogFactory.PRIORITY_KEY, "Lnm;", "getScope", "()Lnm;", "scope", "Lom;", "getScopeAfter", "()Lom;", "scopeAfter", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "uri", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Request implements km, nua, yl {
        private final /* synthetic */ ul0 $$delegate_0;

        public Request(String str, boolean z) {
            Uri uriA = wm.a(GetOkIdByExternalId.METHOD_NAME);
            gm gmVar = new gm();
            gmVar.a(new nmf("externalId", str));
            gmVar.a(new br0("anonym", z));
            this.$$delegate_0 = new ul0(uriA, nm.c, gmVar, Response.INSTANCE.getPARSER());
        }

        public boolean canRepeat() {
            return this.$$delegate_0.c.b;
        }

        @Override // defpackage.yl
        public ul getConfigExtractor() {
            this.$$delegate_0.getClass();
            return ul.f;
        }

        @Override // defpackage.yl
        public ox7 getFailParser() {
            this.$$delegate_0.getClass();
            return tha.c;
        }

        @Override // defpackage.yl
        public ox7 getOkParser() {
            return this.$$delegate_0.d;
        }

        @Override // defpackage.hm
        public int getPriority() {
            this.$$delegate_0.getClass();
            return 16;
        }

        @Override // defpackage.hm
        public nm getScope() {
            return this.$$delegate_0.b;
        }

        @Override // defpackage.yl
        public om getScopeAfter() {
            this.$$delegate_0.getClass();
            return om.a;
        }

        @Override // defpackage.hm
        public Uri getUri() {
            return this.$$delegate_0.a;
        }

        @Override // defpackage.nua
        public Object handleInterruptedIO() {
            return new Response(0L, null, null, 7, null);
        }

        @Override // defpackage.hm
        public boolean shouldGzip() {
            this.$$delegate_0.getClass();
            return false;
        }

        @Override // defpackage.hm
        public boolean shouldPost() {
            return this.$$delegate_0.c.c;
        }

        public boolean shouldReport() {
            this.$$delegate_0.getClass();
            return true;
        }

        @Override // defpackage.hm
        public boolean willWriteParams() {
            return this.$$delegate_0.c.d;
        }

        @Override // defpackage.hm
        public boolean willWriteSupplyParams() {
            return this.$$delegate_0.c.e;
        }

        @Override // defpackage.hm
        public void writeParams(gy7 writer) {
            this.$$delegate_0.writeParams(writer);
        }

        @Override // defpackage.hm
        public void writeSupplyParams(gy7 writer) {
            this.$$delegate_0.writeSupplyParams(writer);
        }

        public /* synthetic */ Request(String str, boolean z, int i, tk4 tk4Var) {
            this(str, (i & 2) != 0 ? false : z);
        }
    }
}
